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
package com.yahoo.sql4d.query.select;

import com.yahoo.sql4d.query.PlainDimQueryMeta;
import com.yahoo.sql4d.query.QueryMeta;
import com.yahoo.sql4d.query.RequestType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import scala.Tuple2;

/**
 * {
    "queryType": "select",
    "dataSource": {
      "type": "table",
      "name": "SomeTable"
    },
    "dimensions": [],
    "metrics": [],
    "granularity": "all",
    "intervals": [
      "2014-07-01/2014-07-02"
    ],
    "pagingSpec": {
      "pagingIdentifiers": {},
      "threshold": 5
    }
  }

 * @author srikalyan
 */
public class SelectQueryMeta  extends PlainDimQueryMeta {

    public final PagingSpec pagingSpec = new PagingSpec(null, 5);
    public List<String> fetchMetrics = new ArrayList<>();
    
    
    private static final JSONObject EMPTY_JSON = new JSONObject();
    
    public SelectQueryMeta() {
        queryType = RequestType.SELECT;
    }

    public SelectQueryMeta(QueryMeta q) {
        super(q);
        queryType = RequestType.SELECT;
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
        Map<String, Object> pagingSpecMap = new LinkedHashMap<>();
        if (pagingSpec != null) {
            if (pagingSpec.pagingIdentifiers == null) {
                pagingSpecMap.put("pagingIdentifiers", EMPTY_JSON);
            } else {
                pagingSpecMap.put("pagingIdentifiers", pagingSpec.pagingIdentifiers);
            }
            pagingSpecMap.put("threshold", pagingSpec.threshold);
        }
        map.put("pagingSpec", pagingSpecMap);
        if (fetchMetrics != null) {
            map.put("metrics", new JSONArray(fetchMetrics));
        }
        return map;
    }
    
    /**
     * This method must be called prior to calling {@link SelectQueryMeta#getDataMap() }.
     * Essentially splits columns into Dimensions and Metrics.
     * @param <T>
     * @param anyContext
     */
    @Override
    public <T> void postProcess(T anyContext) {
        Tuple2<List<String>, List<String>> dimsAndMetrics = (Tuple2<List<String>, List<String>>)anyContext;
        List<String> dims = dimsAndMetrics._1();
        List<String> metrics = dimsAndMetrics._2();
        Iterator<Map.Entry<String, String>> colIter = fetchDimensions.entrySet().iterator();
        while (colIter.hasNext()) {
            Map.Entry<String, String> entry = colIter.next();
            if (dims.contains(entry.getKey())) {
                //No action.
            } else if (metrics.contains(entry.getKey())) {
                fetchMetrics.add(entry.getKey());
                colIter.remove();
            } else {//TODO: Handle error
                
            }
        }
    }
    
    public static SelectQueryMeta promote(QueryMeta qMeta) {
        return new SelectQueryMeta(qMeta);
    }
    
}
