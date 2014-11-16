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
package com.yahoo.sql4d.query.timeboundary;

import com.yahoo.sql4d.query.QueryMeta;
import com.yahoo.sql4d.query.RequestType;
import java.util.Map;
import org.json.JSONObject;

/**
 * {
    "queryType": "timeBoundary",
    "dataSource": "SomeTable"
    }
  }
[ {
  "timestamp" : "2013-09-04T21:44:00.000Z",
  "result" : {
    "minTime" : "2013-09-04T21:44:00.000Z",
    "maxTime" : "2013-09-04T21:47:00.000Z"
  }
} ]

 * @author srikalyan
 */
public class TimeBoundaryQueryMeta  extends QueryMeta {

    public TimeBoundaryQueryMeta() {
        queryType = RequestType.TIMEBOUNDARY;
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
        Map<String, Object> map = super.getDataMap();
        return map;
    }
    
    
    public static TimeBoundaryQueryMeta promote(QueryMeta qMeta) {
        TimeBoundaryQueryMeta newQueryMeta = new TimeBoundaryQueryMeta();
        newQueryMeta.dataSource = qMeta.dataSource;
        return newQueryMeta;
    }
    
}
