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

import com.yahoo.sql4d.query.nodes.AggItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Ex: Used in data ingestion.
 *"rollupSpec" : {
      "aggs": [{
          "type" : "count",
          "name" : "count"
        }, {
          "type" : "doubleSum",
          "name" : "added",
          "fieldName" : "added"
        }],
      "rowFlushBoundary": 100000,// THIS IS OPTIONAL
      "rollupGranularity" : "none"// can also be hour etc. NOTE this is different from segment granularity.
    }
 * 
 * @author srikalyan
 */
public class RollupSpec {
    public String rollupGranularity = "none";//TODO: Can be hour etc. Validate for other types.
    public long rowFlushBoundary = 100000;//TODO: 
    public List<AggItem> aggs = new ArrayList<>();
    
    @Override
    public String toString() {
        return String.format(getJson().toString(2));
    }
    
    public JSONObject getJson() {
        return new JSONObject(getDataMap());
    }

    public Map<String, Object> getDataMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("rowFlushBoundary", rowFlushBoundary);
        map.put("rollupGranularity", rollupGranularity);
        JSONArray aggsArray = new JSONArray();
        for (AggItem aggItem:aggs) {
            aggsArray.put(aggItem.getJson());
        }
        map.put("aggs", aggsArray);
        return map;
    }
}
