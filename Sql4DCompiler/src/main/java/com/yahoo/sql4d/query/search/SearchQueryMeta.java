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
package com.yahoo.sql4d.query.search;

import com.yahoo.sql4d.query.PlainDimQueryMeta;
import com.yahoo.sql4d.query.QueryMeta;
import com.yahoo.sql4d.query.RequestType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * { "queryType": "search", "dataSource": "sample_datasource",
     "granularity": "day",
  "searchDimensions": [
    "dim1",
    "dim2"
  ],
  "query": {
    "type": "insensitive_contains",
    "value": "Ke"
  },
  "sort" : {
    "type": "lexicographic"
  },
  "intervals": [
    "2013-01-01T00:00:00.000/2013-01-03T00:00:00.000"
  ]
}

 * @author srikalyan
 */
public class SearchQueryMeta  extends PlainDimQueryMeta {

    public String type;// insensitive_contains, fragment
    public List<String> values;
    
    public String sort;// lexicographic, strlen
    
    public SearchQueryMeta() {
        queryType = RequestType.SEARCH;
    }

    public void addValue(String v) {
        if (values != null) {
            values.add(v.replace("'", ""));
        }
    }

    public void setSort(String sort) {
        sort = sort.replace("'", "");
        if (sort.equals("lexicographic") || sort.equals("strlen")) {
            this.sort = sort;
        } else {
            System.out.println("Invalid sort type for the search query.");
        }
    }
    
    
    
    public SearchQueryMeta(QueryMeta q) {
        super(q);
        if (q instanceof SearchQueryMeta) {
            fetchDimensions = ((SearchQueryMeta)q).fetchDimensions;
            values = ((SearchQueryMeta)q).values;
        } else {
            fetchDimensions = new HashMap<>();
            values = new ArrayList<>();
        }
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
        map.put("queryType", "search");
        map.remove("dimensions");// Because it is called searchDimensions here.
        if (fetchDimensions != null) {
            JSONArray dimensionsArray = new JSONArray();
            for (String dim:fetchDimensions.keySet()) {
                dimensionsArray.put(dim);
            }
            map.put("searchDimensions", dimensionsArray);
        }
        JSONObject queryJson = new JSONObject();
        queryJson.put("type", type);
        // TODO: more validation needed here.
        if (type.equals("insensitive_contains")) {
            queryJson.put("value", values.get(0));
        } else if (type != null && type.equals("fragment")) {
            JSONArray valuesArray = new JSONArray();
            for (String val:values) {
                valuesArray.put(val);
            }
            queryJson.put("values", valuesArray);
        }
        map.put("query", queryJson);
        if (sort != null) {
            JSONObject sortJson = new JSONObject();
            sortJson.put("type", sort);
            map.put("sort", sortJson);
        }
        return map;
    }
    
    public static SearchQueryMeta promote(QueryMeta qMeta) {
        return new SearchQueryMeta(qMeta);
    }
    
}
