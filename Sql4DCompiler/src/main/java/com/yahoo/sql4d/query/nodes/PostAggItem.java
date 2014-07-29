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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Ex: 
 * "postAggregations": [
    { "type"   : "arithmetic", 
      "name"   : "div",  
      "fn"     : "/",
      "fields" : [
          { "type" : "fieldAccess", "name" : "tot", "fieldName" : "tot" },
          { "type" : "fieldAccess", "name" : "rows", "fieldName" : "rows" }
      ]
    },
    { "type"  : "hyperUniqueCardinality", "fieldName"  : "the name field value of the hyperUnique aggregator"
    },
    { "type": "arithmetic", 
      "name": "sample_divide",
      "fn": "/",
      "fields": [
        { "type": "fieldAccess", "name": "sample_name1", "fieldName": "nameFromAggregator_1" }, 
        { "type": "fieldAccess", "name": "sample_name2", "fieldName": "nameFromAggregator_2" }, 
      ]
    },
    { "type": "javascript", "name": "absPercent",
       "fieldNames": ["delta", "total"],
       "function": "function(delta, total) { return 100 * Math.abs(delta) / total; }"
    },
    { "type"  : "constant", "name"  : "output_name", "value" : "numerical_value" }
    ......
     ,
     
  ]
  * 
 * @author srikalyan
 */
public class PostAggItem {
    public String type;// arithmetic, hyperUniqueCardinality, javascript, constant.
    public String name;
    public String fn;// +, -, *, /
    public String fieldName;
    public List<String> fieldNames;// Used when function is used.
    public String function;// Javascript function.
    public List<PostAggItem>  fields;
    public double constantValue;

    public PostAggItem() {
    }
    
    
    public PostAggItem(String type) {
        this.type =type;
    }

    public PostAggItem(String type, String name, String fn) {
        this.type = type;
        this.name = name;
        this.fn = fn;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }
    
    private String getCommaSeparatedFieldNames() {
        StringBuilder buf = new StringBuilder();
        for (String item:fieldNames) {
            buf.append(item);
            buf.append(",");
        }
        return buf.substring(0, buf.length() - 1);
    }
    
    public String generateJS(String body) {
        return String.format("function(%s) { %s }", getCommaSeparatedFieldNames(), body);
    }

    public void parseToJs(String jsFunction) {
        jsFunction = jsFunction.replace("'", "");
        Pattern jsPatten = Pattern.compile("(.*)[(](.*)[)](.*)[{](.*)[}](.*)");
        Matcher matcher = jsPatten.matcher(jsFunction);
        if (matcher.matches()) {
            name = matcher.group(1).trim();
            String []fieldItems = matcher.group(2).trim().split(",");
            fieldNames = new ArrayList<>();
            for (String fieldItem:fieldItems) {
                fieldNames.add(fieldItem.trim());
            }
            function = generateJS(matcher.group(4));
        }
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
        map.put("type", type);
        if (type.equals("constant")) {
            map.put("value", constantValue);
        } else if (type.equals("fieldAccess") || type.equals("hyperUniqueCardinality")) {
            map.put("fieldName", fieldName);
        }
        map.put("name", name);
        if (fn != null) {
            map.put("fn", fn);
        }
        if (fieldNames != null) {
            JSONArray fieldNamesArray = new JSONArray();
            for (String item:fieldNames) {
                fieldNamesArray.put(item);
            }
            map.put("fieldNames", fieldNamesArray);
        }
        if (function != null) {
            map.put("function", function);
        }
        
        if (fields != null) {
            JSONArray postAggregationsArray = new JSONArray();
            for (PostAggItem item:fields) {
                postAggregationsArray.put(item.getJson());
            }
            map.put("fields", postAggregationsArray);
        }
        return map;
    }
}
