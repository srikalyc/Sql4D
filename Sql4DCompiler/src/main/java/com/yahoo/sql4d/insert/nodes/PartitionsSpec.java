/**
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License. 
 * See accompanying LICENSE file.
 */
package com.yahoo.sql4d.insert.nodes;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/**
 * Ex: Used in data ingestion.
 *"partitionsSpec": {
    "type": "hashed"
    "targetPartitionSize": 5000000
  },
 * 
 * @author srikalyan
 */
public class PartitionsSpec {
    public long targetPartitionSize = 5000000;
    public String type = "hashed";//TODO: Check out what are other types.
    
    @Override
    public String toString() {
        return String.format(getJson().toString(2));
    }
    
    public JSONObject getJson() {
        return new JSONObject(getDataMap());
    }

    public Map<String, Object> getDataMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("type", type);
        map.put("targetPartitionSize", targetPartitionSize);
        return map;
    }
}
