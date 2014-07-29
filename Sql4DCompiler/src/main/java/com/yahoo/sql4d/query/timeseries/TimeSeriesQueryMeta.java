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
package com.yahoo.sql4d.query.timeseries;

import com.yahoo.sql4d.query.QueryMeta;
import com.yahoo.sql4d.query.RequestType;
import com.yahoo.sql4d.query.groupby.GroupByQueryMeta;
import java.util.Map;
import org.json.JSONObject;

/**
 * {
  "queryType": "timeseries",
  "dataSource": "sample_datasource",
  "granularity": "day",
  "filter": {
    "type": "and",
    "fields": [
      { "type": "selector", "dimension": "sample_dimension1", "value": "sample_value1" },
      { "type": "or",
        "fields": [
          { "type": "selector", "dimension": "sample_dimension2", "value": "sample_value2" },
          { "type": "selector", "dimension": "sample_dimension3", "value": "sample_value3" }
        ]
      }
    ]
  },
  "aggregations": [
    { "type": "longSum", "name": "sample_name1", "fieldName": "sample_fieldName1" },
    { "type": "doubleSum", "name": "sample_name2", "fieldName": "sample_fieldName2" }
  ],
  "postAggregations": [
    { "type": "arithmetic",
      "name": "sample_divide",
      "fn": "/",
      "fields": [
        { "type": "fieldAccess", "name": "sample_name1", "fieldName": "sample_fieldName1" },
        { "type": "fieldAccess", "name": "sample_name2", "fieldName": "sample_fieldName2" }
      ]
    }
  ],
  "intervals": [ "2012-01-01T00:00:00.000/2012-01-03T00:00:00.000" ]
}

 The fundamental difference between Group by and Timeseries is the fetchDimensions is 
 mandatory in former and not in latter.
 * @author srikalyan
 */
public class TimeSeriesQueryMeta  extends GroupByQueryMeta {

    public String context;// TODO: Address this later. Right now we just fill null in query.
    public TimeSeriesQueryMeta() {
        queryType = RequestType.TIMESERIES;
    }

    
    public TimeSeriesQueryMeta(QueryMeta q) {
        super(q);
        if (q instanceof GroupByQueryMeta) {
            fetchDimensions = ((GroupByQueryMeta)q).fetchDimensions;
            having = ((GroupByQueryMeta)q).having;
        }
        queryType = RequestType.TIMESERIES;
    }
    
    @Override
    public String toString() {
        return getJson().toString(2);
    }
    
    @Override
    public JSONObject getJson() {
        JSONObject json = new JSONObject(getJsonMap());
        json.put("context", JSONObject.NULL);
        return json;
    }
    
    @Override
    public Map<String, Object> getJsonMap() {
        Map<String, Object> map = super.getJsonMap();
        map.put("queryType", "timeseries");
        map.remove("dimensions");
        return map;
    }
    
    public static TimeSeriesQueryMeta promote(QueryMeta qMeta) {
        return new TimeSeriesQueryMeta(qMeta);
    }
}
