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

import com.yahoo.sql4d.query.nodes.*;
import static com.yahoo.sql4d.utils.Utils.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Ex: Used in data ingestion.
 *"granularitySpec" : {
    "type" : "uniform",
    "gran" : "DAY",
    "interval" : [ "2010/2020" ]
  }
 * 
 * @author srikalyan
 */
public class GranularitySpec {
    private static final List<String> validGSimpleStrings = Arrays.asList("none", "minute", "fifteen_minute", "thirty_minute", "hour" , "day");
    public String gran = "day";
    public String type = "uniform";//TODO: Check out what are other types.
    public Interval interval = new Interval("2000-01-01", "2050-12-31");
    
    public GranularitySpec(String gString) {
        this.gran = unquote(gString);
        isValid(this.gran);
    }

    @Override
    public String toString() {
        return String.format(getJson().toString(2));
    }
    
    public JSONObject getJson() {
        return new JSONObject(getDataMap());
    }

    private void isValid(String gString) {
        if (!validGSimpleStrings.contains(gString)) {
            throw new IllegalArgumentException("Ivalid granularity " + gString);
        }
        this.gran = gString;
    }
    
    
    public Map<String, Object> getDataMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        JSONArray intervalArr = new JSONArray();
        intervalArr.put(interval.toString());
        map.put("gran", gran);
        map.put("type", type);
        map.put("intervals", intervalArr);
        return map;
    }
}
