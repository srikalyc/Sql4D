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

import com.yahoo.sql4d.query.nodes.AggItem;
import com.yahoo.sql4d.query.nodes.PostAggItem;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * GroupBy, TimeSeries etc come under this category.
 * @author srikalyan
 */
public class BaseAggQueryMeta  extends PlainDimQueryMeta {
    public List<AggItem> aggregations; 
    public PostAggItem postAggregations;
    
    public BaseAggQueryMeta() {
    }

    
    public BaseAggQueryMeta(QueryMeta q) {
        super(q);
        if (q instanceof BaseAggQueryMeta) {
            aggregations = ((BaseAggQueryMeta)q).aggregations;
            postAggregations = ((BaseAggQueryMeta)q).postAggregations;
        }
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

        JSONArray aggregationsArray = new JSONArray();
        for (AggItem item:aggregations) {
            aggregationsArray.put(item.getJson());
        }
        map.put("aggregations", aggregationsArray);
        
        if (postAggregations != null) {
            JSONArray jsonArr = new JSONArray();
            jsonArr.put(postAggregations.getJson());
            map.put("postAggregations", jsonArr);
        } else {
            map.put("postAggregations", new JSONArray());
        }
        return map;
    }
    
    public static BaseAggQueryMeta promote(QueryMeta qMeta) {
        return new BaseAggQueryMeta(qMeta);
    }
}
