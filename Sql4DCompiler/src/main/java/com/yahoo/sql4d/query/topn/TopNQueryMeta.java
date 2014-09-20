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
package com.yahoo.sql4d.query.topn;

import com.yahoo.sql4d.query.BaseAggQueryMeta;
import com.yahoo.sql4d.query.PlainDimQueryMeta;
import com.yahoo.sql4d.query.QueryMeta;
import com.yahoo.sql4d.query.RequestType;
import java.util.Map;
import org.json.JSONObject;

/**
 * {
  "queryType": "topN",
  "dataSource": "sample_data",
  "dimension": "sample_dim",
  "threshold": 5,
  "metric": "count",
  "granularity": "all",
  "filter": {
    "type": "and",
    "fields": [
      {
        "type": "selector",
        "dimension": "dim1",
        "value": "some_value"
      },
      {
        "type": "selector",
        "dimension": "dim2",
        "value": "some_other_val"
      }
    ]
  },
  "aggregations": [
    {
      "type": "longSum",
      "name": "count",
      "fieldName": "count"
    },
    {
      "type": "doubleSum",
      "name": "some_metric",
      "fieldName": "some_metric"
    }
  ],
  "postAggregations": [
    {
      "type": "arithmetic",
      "name": "sample_divide",
      "fn": "/",
      "fields": [
        {
          "type": "fieldAccess",
          "name": "some_metric",
          "fieldName": "some_metric"
        },
        {
          "type": "fieldAccess",
          "name": "count",
          "fieldName": "count"
        }
      ]
    }
  ],
  "intervals": [
    "2013-08-31T00:00:00.000/2013-09-03T00:00:00.000"
  ]
}


 * @author srikalyan
 */
public class TopNQueryMeta  extends BaseAggQueryMeta {
    public String dimension;// group by
    public int threshold = 10;// limit
    public String metric;// order by

    public TopNQueryMeta() {
        queryType = RequestType.TOPN;
    }

    public TopNQueryMeta(QueryMeta q) {
        super(q);
        queryType = RequestType.TOPN;
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
        map.put("queryType", "topN");
        map.remove("dimensions");// During promotion from GroupBy dimensions may have sneaked in so remove it.
        if (dimension != null) {
            map.put("dimension", dimension);
        }
        map.put("threshold", threshold);
        if (metric != null) {
            map.put("metric", metric);
        }
        return map;
    }

    public static TopNQueryMeta promote(QueryMeta qMeta) {
        TopNQueryMeta topN = new TopNQueryMeta(qMeta);
        if (qMeta instanceof PlainDimQueryMeta) {
            PlainDimQueryMeta gBQMeta = ((PlainDimQueryMeta)qMeta);
            if (gBQMeta.fetchDimensions != null && gBQMeta.fetchDimensions.size() == 1) {
                for (String dim:gBQMeta.fetchDimensions.keySet()) {// We care only about 1st dimension
                    String dimaAlias = gBQMeta.fetchDimensions.get(dim);
                    if (dimaAlias == null) {//Directly use the dim
                        topN.dimension = dim;
                    } else {
                        topN.dimension = dimaAlias;
                    }
                    
                    break;// Break after the first dimension.
                }
            } else {
                System.out.println("Wrong(OR) no dimensions specified in GROUP BY(Need 1 dimension)");
            }
        }
        return topN;
    }

}
