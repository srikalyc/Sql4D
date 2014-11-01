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

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Ex:
 * "aggregations": [
    { "type": "longSum", "name": "sample_name1", "fieldName": "sample_fieldName1" },
    { "type": "doubleSum", "name": "sample_name2", "fieldName": "sample_fieldName2" },
    {"type" : "count", "name" : "rows"},
    {"type" : "hyperUnique", "name" : "unique_users", "fieldName" : "uniques"}
    { "type" : "min", "name" : "minValue", "fieldName" : "minV"}
    { "type" : "max", "name" : "maxValue", "fieldName" : "maxV"}
    { "type": "javascript",  "name": "sum(log(x)/y) + 10",
        "fieldNames": ["x", "y"],
        "fnAggregate" : "function(current, a, b)      { return current + (Math.log(a) * b); }",
        "fnCombine"   : "function(partialA, partialB) { return partialA + partialB; }",
        "fnReset"     : "function()                   { return 10; }"
    }


    ....
    ...
  ]
 * @author srikalyan
 */
public class AggItem  {
    public String type;// longSum, doubleSum, hyperUnique(use cardinality instead), min, max, javascript
    public String fieldName;
    public String asName;

    public List<String> fieldNames;
    public String fnAggregate;
    public String fnCombine;
    public String fnReset;
    
    public AggItem() {
    }

    
    public AggItem(String aggType, String fieldName, String asName) {
        this.type = aggType;
        this.fieldName = fieldName;
        this.asName = asName;
    }

    public void setAggType(String aggType) {
        this.type = aggType;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setAsName(String asName) {
        this.asName = asName;
    }

    @Override
    public String toString() {
        return String.format(getJson().toString(2));
    }
    
    public JSONObject getJson() {
        return new JSONObject(getJsonMap());
    }
    
    public Map<String, Object> getJsonMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        //TODO: hack right now. Make all the future unique requests into cardinality instead of hyperUnique(in the compiler grammar itself). See here for difference https://groups.google.com/forum/#!topic/druid-development/so-GCEne7Jk
        if ("hyperUnique".equals(type)) {
            type = "cardinality";// Cardinality requires fieldNames instead of fieldName
            if (fieldName != null) {
                fieldNames = new ArrayList<>();
                fieldNames.add(fieldName);
                fieldName = null;
            }
            
        }
        map.put("type", type);
        map.put("name", asName);
        if (fieldName != null) {
            map.put("fieldName", fieldName);
        }
        
        if (fieldNames != null) {
            JSONArray fieldNamesArray = new JSONArray();
            for (String item:fieldNames) {
                fieldNamesArray.put(item);
            }
            map.put("fieldNames", fieldNamesArray);
        }
        if (fnAggregate != null) {
            map.put("fnAggregate", fnAggregate);
        }
        if (fnCombine != null) {
            map.put("fnCombine", fnCombine);
        }
        if (fnReset != null) {
            map.put("fnReset", fnReset);
        }
        return map;
    }
    
}
