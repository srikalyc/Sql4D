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
package com.yahoo.sql4d.query.nodes;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Ex:
 * "filter": { "type": "selector", "dimension": <dimension_string>, "value": <dimension_value_string> }
   "filter": { "type": "regex", "dimension": <dimension_string>, "pattern": <pattern_string> }
   "filter": { "type": "and", "fields": [<filter>, <filter>, ...] }
   "filter": { "type": "or", "fields": [<filter>, <filter>, ...] }
   "filter": { "type": "not", "field": <filter> }
   "filter": { "type" : "javascript", "dimension" : "name",
        "function" : "function(x) { return(x >= 'bar' && x <= 'foo') }"
             }

 * @author srikalyan
 */
public class Filter  {
    public String type;
    public String dimension;
    public String value;
    public String pattern;

    public List<Filter> fields;
    public String function;

    public Filter(String type) {
        this.type = type;
    }
    
    
    @Override
    public String toString() {
        return getJson().toString(2);
    }
    
    public JSONObject getJson() {
        return new JSONObject(getJsonMap());
    }
    
    public Map<String, Object> getJsonMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("type", type);
        if (dimension != null) {
            map.put("dimension", dimension);
        }
        if (value != null) {
            map.put("value", value);
        }
        if (pattern != null) {
            map.put("pattern", pattern);
        }
        if (fields != null) {
            if (type.equals("not")) {// For not we call it field (not fields because we have only one filter)
                map.put("field", fields.get(0).getJson());
            } else {
                JSONArray fieldArray = new JSONArray();
                for (Filter item:fields) {
                    fieldArray.put(item.getJson());
                }
                map.put("fields", fieldArray);
            }
        }
        if (function != null) {
            map.put("fnAggregate", function);
        }
        return map;
    }
    
}
