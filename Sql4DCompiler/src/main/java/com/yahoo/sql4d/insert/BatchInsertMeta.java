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

import com.google.common.collect.ImmutableMap;
import com.yahoo.sql4d.insert.nodes.PartitionsSpec;
import com.yahoo.sql4d.insert.nodes.InputSpec;
import com.yahoo.sql4d.insert.nodes.RollupSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/**
 * Insert Meta for batch ingestions.
 *
 * @author srikalyan
 */
public class BatchInsertMeta extends InsertMeta {

    public InputSpec inputSpec = new InputSpec();
    public PartitionsSpec partitionsSpec = new PartitionsSpec();
    public RollupSpec rollupSpec = new RollupSpec();//TODO: Figure out its validity and where to put this ?
    public List<String> dimensions = new ArrayList<>();
    public List<String> columns = new ArrayList<>();
    
    public BatchInsertMeta() {
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
        return ImmutableMap.<String, Object>of(
                "type", "index_hadoop",
                "spec", getSpec());
    }

    public void inferFormat(String fileExtension) {
        if (fileExtension.endsWith("csv")) {
            dataFormat = "csv";
        } else if (fileExtension.endsWith("json")) {
            dataFormat = "json";
        } else {
            dataFormat = "tsv";
        }
    }
    
    @Override
    public Map<String, Object> getTimestampSpec() {
        return ImmutableMap.<String, Object>of(
                "column", "timestamp",
                "format", "auto");
    }

    @Override
    public Map<String, Object> getIoConfig() {
        return ImmutableMap.<String, Object>of(
                "type", "hadoop",
                "inputSpec", inputSpec.getDataMap());
    }
   
    /**
     * Optional
     * @return 
     */
    @Override
    public Map<String, Object> getTuningConfig() {
        return ImmutableMap.<String, Object>of(
                "type", "hadoop",
                "partitionsSpec", partitionsSpec.getDataMap());
    }
    

    public <T> void postProcess(T anyContext) {

    }
}
