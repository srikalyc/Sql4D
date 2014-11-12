/**
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License. See accompanying
 * LICENSE file.
 */
package com.yahoo.sql4d.insert;

import com.yahoo.sql4d.insert.nodes.GranularitySpec;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import static com.google.common.collect.Iterables.*;
import com.yahoo.sql4d.BaseStatementMeta;
import static com.yahoo.sql4d.DruidUtils.*;
import com.yahoo.sql4d.TimeUtils;
import com.yahoo.sql4d.query.nodes.AggItem;
import com.yahoo.sql4d.query.nodes.Interval;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Base class for all insert types.
 *
 * @author srikalyan
 */
public class InsertMeta extends BaseStatementMeta {

    public GranularitySpec granularitySpec = new GranularitySpec("all");
    public List<AggItem> aggregations = new ArrayList<>();
    public List<Object> values = new ArrayList<>();
    public Map<String, String> fetchDimensions = new LinkedHashMap<>();
    private final String tmpFolder = System.getProperty("java.io.tmpdir");

    public InsertMeta() {
    }

    public InsertMeta(String dataSource, GranularitySpec granularity, Interval interval) {
        super(dataSource);
        this.granularitySpec = granularity;
    }

    @Override
    public String toString() {
        return getJson().toString(2);
    }

    @Override
    public JSONObject getJson() {
        return new JSONObject(getJsonMap());
    }

    @Override
    public Map<String, Object> getJsonMap() {
        Map<String, Object> map = super.getJsonMap();
        map.put("type", "index");
        map.put("dataSource", dataSource);
        if (granularitySpec != null) {
            map.put("granularitySpec", granularitySpec.getJson());
        }
        JSONArray aggregationsArray = new JSONArray();
        for (AggItem item : aggregations) {
            aggregationsArray.put(item.getJson());
        }
        map.put("aggregations", aggregationsArray);
        map.put("firehose", getFireHose());
        return map;
    }

    private JSONObject getFireHose() {
        Map<String, Object> finalMap = new LinkedHashMap<>();
        finalMap.put("type", "local");
        finalMap.put("baseDir", tmpFolder);
        String fileName = UUID.randomUUID().toString() + ".csv";
        finalMap.put("filter", fileName);
        if (values.isEmpty()) {
            throw new IllegalStateException("No values to insert !!");
        }
        Map<String, Object> parserMap = new LinkedHashMap<>();
        try {
            File file = new File(tmpFolder + File.separator + fileName);
            FileUtils.write(file, Joiner.on(",").join(values));
            System.out.println("Written to " + file);
            Object timestamp = values.get(0);
            String timestampFormat = TimeUtils.detectFormat(timestamp.toString());
            Map<String, String> tsSpec = ImmutableMap.<String, String>builder().
                    put("column", "timestamp").
                    put("format", (timestampFormat != null) ? timestampFormat : "auto").build();
            parserMap.put("timestampSpec", tsSpec);

            List<String> dims = new ArrayList<>(fetchDimensions.keySet());
            List<String> metrics = getMetrics(aggregations);
            
            Map<String, Object> data = ImmutableMap.<String, Object>builder().
                    put("format", "csv").
                    put("dimensions", dims.subList(1, dims.size())).
                    put("columns", concat(dims, metrics)).build();
            parserMap.put("data", data);
        } catch (IOException ex) {
            Logger.getLogger(InsertMeta.class.getName()).log(Level.SEVERE, null, ex);
        }
        finalMap.put("parser", parserMap);
        return new JSONObject(finalMap);
    }

    public <T> void postProcess(T anyContext) {

    }
}
