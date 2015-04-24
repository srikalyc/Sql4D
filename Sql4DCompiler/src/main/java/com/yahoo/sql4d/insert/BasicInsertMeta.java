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

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.yahoo.sql4d.utils.TimeUtils;
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
import org.json.JSONObject;

/**
 * Insert Meta for simple insertions(non batch and non realtime)
 *
 * @author srikalyan
 */
public class BasicInsertMeta extends InsertMeta {

    public String dataPath = null;// Either dataPath is not null(or)values has some data.
    public List<Object> values = new ArrayList<>();
    private final String tmpFolder = System.getProperty("java.io.tmpdir");
    String timestampFormat = null;

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
        return ImmutableMap.<String, Object>of(
                "type", "index",
                "spec", getSpec());
    }
        
    @Override
    public Map<String, Object> getTimestampSpec() {
        return ImmutableMap.<String, Object>of(
                "column", "timestamp",
                "format", (timestampFormat != null) ? timestampFormat : "iso");//TODO: Check if auto works instead of iso as default.
    }

    @Override
    public Map<String, Object> getIoConfig() {
        return ImmutableMap.<String, Object>of(
                "type", "index",
                "firehose", getFirehose());
    }
    
    public Map<String, Object> getFirehose() {
        Map<String, Object> finalMap = new LinkedHashMap<>();        
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
        return finalMap;
    }
    
    /**
     * Optional
     * @return 
     */
    @Override
    public Map<String, Object> getTuningConfig() {
        return ImmutableMap.<String, Object>of(
                "type", "index",
                "targetPartitionSize", -1,
                "rowFlushBoundary", 0,
                "numShards", 1);
    }
    public <T> void postProcess(T anyContext) {

    }
}
