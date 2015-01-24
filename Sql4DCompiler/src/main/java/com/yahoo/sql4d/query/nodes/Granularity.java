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

import static com.yahoo.sql4d.utils.Utils.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import scala.util.Either;
import scala.util.Left;
import scala.util.Right;

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
    private static final List<String> validGSimpleStrings = Arrays.asList("all", "none", "minute", "fifteen_minute", "thirty_minute", "hour" , "day");
    public String gSimple = "all";
    
    public Either<String, String> gComplex;// Duration/Period types.

    public String origin;
    public String timeZone;

    public Granularity() {
        gSimple = null;// Because this constructor is intented to be used for typed granularity(duration/period)
    }

    
    public Granularity(String gString) {
        this.gSimple = unquote(gString);
    }

    public void setDuration(String duration) {
        this.gComplex = new Left<>(unquote(duration));
    }

    public void setOrigin(String origin) {
        this.origin = unquote(origin);
    }

    public void setPeriod(String period) {
        this.gComplex = new Right<>(unquote(period));
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = unquote(timeZone);
    }

    
    @Override
    public String toString() {
        return String.format(getJson().toString(2));
    }
    
    public JSONObject getJson() {
        return new JSONObject(getJsonMap());
    }

    public void setgString(String gString) {
        if (!validGSimpleStrings.contains(gString)) {
            System.err.println("Ivalid granularity " + gString);
        }
        this.gSimple = gString;
    }
    
    
    /**
     * Basic type when granularity is just string is taken care in QueryMeta class.
     * For duration and period types we get Json from here.
     * @return 
     */
    public Map<String, Object> getJsonMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        
        map.put("type", gComplex!=null && gComplex.isLeft()? "duration":"period");
        if (gComplex != null) {
            if (gComplex.isLeft()) {
                map.put("duration", gComplex.left().get());
            } else {
                map.put("period", gComplex.right().get());
            }
            if (origin != null) {
                map.put("origin", origin);
            }
            if (timeZone != null) {
                map.put("timeZone", timeZone);
            }
        }
        return map;
    }
}
