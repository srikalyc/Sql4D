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
package com.yahoo.sql4d.query.groupby;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * HAVING clause for groupBy queries.
 * @author srikalyan
 */
public class Having {
    public String type;
    public String aggregation;
    public String value;
    public List<Having> havingSpecs;
    
    
    public Having() {
    }
    
    public Having(String type) {
        this.type = type;
    }

    public Having(String type, String aggregation, String value) {
        this.type = type;
        this.aggregation = aggregation;
        this.value = value;
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
        map.put("type", getTypeForSymbol(type));
        map.put("aggregation", aggregation);
        map.put("value", value);
        if (havingSpecs != null) {
            if (type.equals("not")) {
                map.put("havingSpecs", havingSpecs.get(0).getJson());
            } else {
                JSONArray havingSpecsArray = new JSONArray();
                for (Having item:havingSpecs) {
                    havingSpecsArray.put(item.getJson());
                }
                map.put("havingSpecs", havingSpecsArray);
            }
        }
        return map;
    }
    
    public static String getTypeForSymbol(String sym) {
        switch(sym) {
            case "=":
                return "equalTo";
            case "<":
                return "lessThan";
            case ">":
                return "greaterThan";
            case "and":
                return "and";
            case "or":
                return "or";
            case "not":
                return "not";
        }
        return null;
    }
    
}
