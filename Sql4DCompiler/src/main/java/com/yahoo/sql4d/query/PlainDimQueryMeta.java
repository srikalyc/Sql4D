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
package com.yahoo.sql4d.query;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * GroupBy, TimeSeries, Search, Select etc come under this category.
 * @author srikalyan
 */
public class PlainDimQueryMeta  extends QueryMeta {
    public Map<String, String> fetchDimensions = new LinkedHashMap<>();// Normal alias go into this (aggregation based alias go into AggItem)

    public PlainDimQueryMeta() {
    }

    
    public PlainDimQueryMeta(QueryMeta q) {
        super(q.dataSource, q.granularity, q.filter, q.intervals, q.microIntervals);
        if (q instanceof PlainDimQueryMeta) {
            fetchDimensions = ((PlainDimQueryMeta)q).fetchDimensions;
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
        if (fetchDimensions != null) {
            JSONArray dimensionsArray = new JSONArray();
            for (String dim:fetchDimensions.keySet()) {
                String dimaAlias = fetchDimensions.get(dim);
                if (dimaAlias == null) {
                    dimensionsArray.put(dim);
                } else {
                    JSONObject json = new JSONObject();
                    json.put("type", "default");
                    json.put("dimension", dim);
                    json.put("outputName", dimaAlias);
                    dimensionsArray.put(json);
                }
            }
            map.put("dimensions", dimensionsArray);
        }
        return map;
    }
    
    public static PlainDimQueryMeta promote(QueryMeta qMeta) {
        return new PlainDimQueryMeta(qMeta);
    }
}
