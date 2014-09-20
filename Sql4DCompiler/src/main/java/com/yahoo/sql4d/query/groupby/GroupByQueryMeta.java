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

import com.yahoo.sql4d.query.BaseAggQueryMeta;
import com.yahoo.sql4d.query.QueryMeta;
import com.yahoo.sql4d.query.RequestType;
import java.util.Map;
import org.json.JSONObject;

/**
 * {
  "queryType": "groupBy",
  "dataSource": "sample_datasource",
  "granularity": "day",
  "dimensions": ["dim1", "dim2", {"queryType":"default","dimension":"_content_thumbnail_url","outputName":"thumb"}],
  "limitSpec": { "queryType": "default", "limit": 5000, "columns": ["dim1", "metric1"] },
  "filter": {
    "queryType": "and",
    "fields": [
      { "queryType": "selector", "dimension": "sample_dimension1", "value": "sample_value1" },
      { "queryType": "or", 
        "fields": [
          { "queryType": "selector", "dimension": "sample_dimension2", "value": "sample_value2" },
          { "queryType": "selector", "dimension": "sample_dimension3", "value": "sample_value3" }
        ]
      }
    ]
  },
  "aggregations": [
    { "queryType": "longSum", "name": "sample_name1", "fieldName": "sample_fieldName1" },
    { "queryType": "doubleSum", "name": "sample_name2", "fieldName": "sample_fieldName2" }
  ],
  "postAggregations": [
    { "queryType": "arithmetic",
      "name": "sample_divide",
      "fn": "/",
      "fields": [
        { "queryType": "fieldAccess", "name": "sample_name1", "fieldName": "sample_fieldName1" },
        { "queryType": "fieldAccess", "name": "sample_name2", "fieldName": "sample_fieldName2" }
      ]
    }
  ],
  "intervals": [ "2012-01-01T00:00:00.000/2012-01-03T00:00:00.000" ],
  "having": { "queryType": "greaterThan", "aggregation": "sample_name1", "value": 0 }
}

 * @author srikalyan
 */
public class GroupByQueryMeta  extends BaseAggQueryMeta {
    public Having having;
    public LimitSpec limitSpec;
    
    public GroupByQueryMeta() {
    }

    public GroupByQueryMeta(QueryMeta q) {
        super(q);
        queryType = RequestType.GROUPBY;
    }

    @Override
    public String toString() {
        return getJson().toString(2);
    }
    
    @Override
    public JSONObject getJson() {
        return new JSONObject(getJsonMap());
    }
    
    @Override
    public Map<String, Object> getJsonMap() {
        Map<String, Object> map = super.getJsonMap();

        map.put("queryType", "groupBy");
        if (having != null) {
            map.put("having", having.getJson());
        }
        if (limitSpec != null) {
            map.put("limitSpec", limitSpec.getJson());
        }
        return map;
    }

    public boolean checkDimOrAlias(String dimOrAlias) {
//TODO: Not sure if the alias for metric aggregate operations can be considered a dimension or not. Revisit later.
//        // First check if the dim(or) alias is in Aggregations .
//        for (AggItem item:aggregations) {
//            if (dimOrAlias.equals(item.fieldName) || dimOrAlias.equals(item.asName)) {
//                return true;
//            }
//        }
        // If not then check the fetchDimension which are just accessors(no Agg function)
        return fetchDimensions.containsKey(dimOrAlias) || fetchDimensions.containsValue(dimOrAlias);
    }

    public static GroupByQueryMeta promote(QueryMeta qMeta) {
        return new GroupByQueryMeta(qMeta);
    }
    
}
