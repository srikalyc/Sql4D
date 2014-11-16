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

import com.yahoo.sql4d.Pair;
import com.yahoo.sql4d.BaseStatementMeta;
import com.yahoo.sql4d.query.nodes.Interval;
import com.yahoo.sql4d.query.nodes.Filter;
import com.yahoo.sql4d.query.nodes.Granularity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Base class for all query types.
 * @author srikalyan
 */
public class QueryMeta extends BaseStatementMeta {
    public Granularity granularity = new Granularity("all");
    public Filter filter;
    public List<Interval> intervals = new ArrayList<>(); 
    public List<Pair<Integer, Integer>> microIntervals = new ArrayList<>(); // If empty or if intervals list size > 1 then this is not used.
    public RequestType queryType;
    
    public QueryMeta() {
    }

    
    public QueryMeta(String dataSource, Granularity granularity, Filter filter, List<Interval> intervals, List<Pair<Integer, Integer>> microIntervals) {
        super(dataSource);
        this.granularity = granularity;
        this.filter = filter;
        this.intervals = intervals;
        this.microIntervals = microIntervals;
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
        map.put("queryType", queryType.getName());
        if (queryType == RequestType.TIMEBOUNDARY) {
            return map;
        }
        if (granularity != null) {
            if (granularity.gSimple != null) {
                map.put("granularity", granularity.gSimple);
            } else {
                map.put("granularity", granularity.getJson());
            }
        }
        if (filter != null) {
            map.put("filter", filter.getJson());
        }

        JSONArray intervalsArray = new JSONArray();
        if (!intervals.isEmpty()) {
            if (intervals.size() == 1 && !microIntervals.isEmpty()) {
                Interval grandInterval = intervals.get(0);
                // Break the single interval into micro intervals.
                for (int i = 0; i < grandInterval.getDays();i++) {
                    for (Pair<Integer, Integer> pair:microIntervals) {
                        Interval microInterval = grandInterval.getInterval(i, pair.a, pair.a + pair.b);// a = start hour of day, b = number of hours from there of.
                        intervalsArray.put(microInterval.toString());
                    }
                }
            } else {
                for (Interval interval:intervals) {
                    intervalsArray.put(interval.toString());
                }
            }
            JSONObject finalIntervalJson = new JSONObject();
            finalIntervalJson.put("type", "intervals");
            finalIntervalJson.put("intervals", intervalsArray);
            map.put("intervals", finalIntervalJson);
        }
        return map;
    }
    
}
