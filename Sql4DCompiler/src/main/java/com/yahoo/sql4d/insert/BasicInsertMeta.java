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
import static com.yahoo.sql4d.utils.DruidUtils.*;
import com.yahoo.sql4d.utils.TimeUtils;
import com.yahoo.sql4d.query.nodes.AggItem;
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
 * Insert Meta for simple insertions(non batch and non realtime)
 *
 * @author srikalyan
 */
public class BasicInsertMeta extends InsertMeta {

    public GranularitySpec granularitySpec = new GranularitySpec("day");
    
    public String delimiter = null;
    public String listDelimiter = null;
    public String dataPath = null;// Either dataPath is not null(or)values has some data.
    public List<Object> values = new ArrayList<>();
    private final String tmpFolder = System.getProperty("java.io.tmpdir");

    public BasicInsertMeta() {
    }

    @Override
    public String toString() {
        return getJson().toString(2);
    }

    @Override
    public JSONObject getJson() {
        return new JSONObject(getDataMap());
    }

    @Override
    public Map<String, Object> getDataMap() {
        Map<String, Object> map = super.getDataMap();
        map.put("type", "index");
        if (granularitySpec != null) {
            map.put("granularitySpec", granularitySpec.getJson());
        }
        JSONArray aggregationsArray = new JSONArray();
        for (AggItem item : aggregations) {
            aggregationsArray.put(item.getJson());
        }
        map.put("aggregators", aggregationsArray);
        map.put("firehose", getFireHose());
        return map;
    }

    private JSONObject getFireHose() {
        Map<String, Object> finalMap = new LinkedHashMap<>();
        Map<String, Object> parserMap = new LinkedHashMap<>();
        String timestampFormat = null;
        String dataFormat = "tsv";
        
        finalMap.put("type", "local");
        if (dataPath != null) {
            int folderEndIndex = dataPath.lastIndexOf("/");
            finalMap.put("baseDir", dataPath.substring(0, folderEndIndex + 1));
            finalMap.put("filter", (folderEndIndex == dataPath.length() - 1)?"*":dataPath.substring(folderEndIndex + 1));
            if (dataPath.endsWith("json")) {
                dataFormat = "json";
            } else if (dataPath.endsWith("csv")) {
                dataFormat = "csv";
            } 
        } else {
            finalMap.put("baseDir", tmpFolder);
            String fileName = UUID.randomUUID().toString() + ".csv";
            finalMap.put("filter", fileName);
            dataFormat = "csv";
            if (values.isEmpty()) {
                throw new IllegalStateException("No values to insert !!");
            }
            try {
                File file = new File(tmpFolder + File.separator + fileName);
                FileUtils.write(file, Joiner.on(",").join(values));
                System.out.println("Written to " + file);
                Object timestamp = values.get(0);
                timestampFormat = TimeUtils.detectFormat(timestamp.toString());
            } catch (IOException ex) {
                Logger.getLogger(BasicInsertMeta.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        Map<String, String> tsSpec = ImmutableMap.<String, String>builder().
            put("column", "timestamp").
            put("format", (timestampFormat != null) ? timestampFormat : "auto").build();
        parserMap.put("timestampSpec", tsSpec);
        List<String> dims = getDimensions(fetchDimensions);
        List<String> metrics = getMetrics(aggregations);

        Map<String, Object> data = new LinkedHashMap<>();
        data.put("format", dataFormat);
        data.put("dimensions", dims.subList(1, dims.size()));
        if (delimiter != null) {
            data.put("delimiter", delimiter);
        }
        if (listDelimiter != null) {
            data.put("listDelimiter", listDelimiter);
        }
        data.put("columns", getColumns(fetchDimensions, aggregations));
        parserMap.put("data", data);
        finalMap.put("parser", parserMap);
        return new JSONObject(finalMap);
    }

    public <T> void postProcess(T anyContext) {

    }
}
