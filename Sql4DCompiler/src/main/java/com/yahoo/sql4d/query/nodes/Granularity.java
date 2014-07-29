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

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/**
 * Ex:
 * "granularity": "all" (OR) "none" (OR) "minute" (OR) "fifteen_minute" (OR) 
 *              "thirty_minute" (OR) "hour" (OR) "day"
 * "granularity": {"type": "duration", "duration": "7200000"}
 * "granularity": {"type": "duration", "duration": "3600000", "origin": "2012-01-01T00:30:00Z"}
 * "granularity": {"type": "period", "period": "P2D", "timeZone": "America/Los_Angeles"}
 * "granularity": {"type": "period", "period": "P3M", "timeZone": "America/Los_Angeles", "origin": "2012-02-01T00:00:00-08:00"}
 * @author srikalyan
 */
public class Granularity {
    private static final List<String> validGStrings = Arrays.asList("all", "none", "minute", "fifteen_minute", "thirty_minute", "hour" , "day");
    public String gString = "all";
    
    public String type;
    public String duration;
    public String origin;

    public String period;
    public String timeZone;

    public Granularity() {
        gString = null;// Because this constructor is intented to be used for typed granularity(duration/period)
    }

    
    public Granularity(String gString) {
        this.gString = gString.replace("'", "");
    }

    public void setDuration(String duration) {
        this.duration = duration.replace("'", "");
    }

    public void setOrigin(String origin) {
        this.origin = origin.replace("'", "");
    }

    public void setPeriod(String period) {
        this.period = period.replace("'", "");
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone.replace("'", "");
    }

    
    @Override
    public String toString() {
        return String.format(getJson().toString(2));
    }
    
    public JSONObject getJson() {
        return new JSONObject(getJsonMap());
    }

    public void setgString(String gString) {
        if (!validGStrings.contains(gString)) {
            System.err.println("Ivalid granularity " + gString);
        }
        this.gString = gString;
    }
    
    
    /**
     * Basic type when granularity is just string is taken care in QueryMeta class.
     * For duration and period types we get Json from here.
     * @return 
     */
    public Map<String, Object> getJsonMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        
        map.put("type", type);
        if (type.equals("duration") || type.equals("period")) {
            if (duration != null) {
                map.put("duration", duration);
            }
            if (origin != null) {
                map.put("origin", origin);
            }
            if (period != null) {
                map.put("period", period);
            }
            if (timeZone != null) {
                map.put("timeZone", timeZone);
            }
        }
        return map;
    }
}
