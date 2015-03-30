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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.yahoo.sql4d.CrudStatementMeta;
import com.yahoo.sql4d.insert.nodes.GranularitySpec;
import com.yahoo.sql4d.query.nodes.AggItem;
import static com.yahoo.sql4d.utils.DruidUtils.getColumns;
import static com.yahoo.sql4d.utils.DruidUtils.getDimensions;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/**
 * Base class for all insert types.
 *
 * @author srikalyan
 */
public abstract class InsertMeta extends CrudStatementMeta {

    public String dataFormat = "tsv";//
    public String delimiter = null;
    public String listDelimiter = null;
    public List<AggItem> aggregations = new ArrayList<>();
    public Map<String, String> fetchDimensions = new LinkedHashMap<>();

    public GranularitySpec granularitySpec = new GranularitySpec("day");

    public InsertMeta() {
    }

    public InsertMeta(String dataSource) {
        super(dataSource);
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
        map.put("dataSource", dataSource);
        return map;
    }

    //TODO: IOConfig should be called before dataSchema to ensure proper format values etc are filled in.
    // See getFirehose() method to see what dependencies are being filled in. This dependency should 
    // be removed in future.
    public Map<String, Object> getSpec() {
        return ImmutableMap.<String, Object>of(
                "ioConfig", getIoConfig(),
                "dataSchema", getDataSchema(),
                "tuningConfig", getTuningConfig());
    }

    public Map<String, Object> getDimensionSpec() {
        List<String> dims = getDimensions(fetchDimensions);
        return ImmutableMap.<String, Object>of(
                "dimensions", dims.subList(1, dims.size()),
                "dimensionExclusions", ImmutableList.<String>of(),
                "spatialDimensions", ImmutableList.<String>of());
    }
    
    public List<JSONObject> getMetricsSpec() {
        ImmutableList.Builder<JSONObject> builder = ImmutableList.<JSONObject>builder();
        for (AggItem item : aggregations) {
            builder.add(item.getJson());
        }
        return builder.build();
    }

    public Map<String, Object> getParser() {
        return ImmutableMap.<String, Object>of(
                "type", "string",
                "parseSpec", getParseSpec());
    }

    public Map<String, Object> getParseSpec() {
        ImmutableMap.Builder builder = ImmutableMap.<String, Object>builder();
        builder.put("format", dataFormat).
                put("timestampSpec", getTimestampSpec()).
                put("dimensionsSpec", getDimensionSpec());
        if (delimiter != null) {
            builder.put("delimiter", delimiter);
        }
        if (listDelimiter != null) {
            builder.put("listDelimiter", listDelimiter);
        }
        builder.put("columns", getColumns(fetchDimensions, aggregations));
        return builder.build();
    }
    
    public Map<String, Object> getDataSchema() {
        return ImmutableMap.<String, Object>of(
                "dataSource", dataSource,
                "parser", getParser(),
                "metricsSpec", getMetricsSpec(),
                "granularitySpec", granularitySpec.getJson()
                );
    }
    
    public abstract Map<String, Object> getTimestampSpec();
    public abstract Map<String, Object> getIoConfig();
    public abstract Map<String, Object> getTuningConfig();

    public <T> void postProcess(T anyContext) {

    }
}
