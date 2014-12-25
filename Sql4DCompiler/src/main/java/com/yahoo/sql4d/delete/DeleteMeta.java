/**
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License. See accompanying
 * LICENSE file.
 */
package com.yahoo.sql4d.delete;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.yahoo.sql4d.CrudStatementMeta;
import com.yahoo.sql4d.query.nodes.Interval;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.json.JSONObject;

/**
 * Delete statement's meta data.
 *
 * @author srikalyan
 */
public class DeleteMeta extends CrudStatementMeta {

    public String id;// UUid
    public Interval interval = null;
    public List<Interval> segmentsToDelete = null;// This will be determined at runtime.
    public List<String> dimensions = new ArrayList<>();// This will be determined at runtime.
    public List<String> metrics = new ArrayList<>();// This will be determined at runtime.

    public DeleteMeta() {
    }

    public DeleteMeta(String dataSource, Interval interval) {
        super(dataSource);
        this.interval = interval;
    }

    @Override
    public String toString() {
        return getJson().toString(2);
    }

    @Override
    public JSONObject getJson() {
        return new JSONObject(getDataMap());
    }
    /**
     * Retain segments only overlapping with the range.
     * @param allSegments 
     */
    public void filterSegments(List<Interval> allSegments) {
        segmentsToDelete = Lists.newArrayList(Iterables.filter(allSegments, new Predicate<Interval>() {
            @Override
            public boolean apply(Interval i) {
                return i.fallsIn(interval);
            }
        }));
    }

    @Override
    public Map<String, Object> getDataMap() {
        // For each instance of data generation generate a new id.
        id = String.format("kill_%s_%s_%s_%s", dataSource, interval.getStartTime(), interval.getEndTime(), new DateTime().toString());
        Map<String, Object> map = super.getDataMap();
        map.put("type", "kill");
        map.put("dataSource", dataSource);
        map.put("interval", interval.toString());
        map.put("id", id);
        return map;
    }


    public <T> void postProcess(T anyContext) {

    }
}
