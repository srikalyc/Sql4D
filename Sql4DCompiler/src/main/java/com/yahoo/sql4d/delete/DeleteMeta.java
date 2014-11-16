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

import com.yahoo.sql4d.BaseStatementMeta;
import com.yahoo.sql4d.query.nodes.Interval;
import java.util.Map;
import org.joda.time.DateTime;
import org.json.JSONObject;

/**
 * Base class for all delete types.
 *
 * @author srikalyan
 */
public class DeleteMeta extends BaseStatementMeta {

    public String id;// UUid
    public Interval interval = null;

    public DeleteMeta() {
    }

    public DeleteMeta(String dataSource, Interval interval) {
        super(dataSource);
        this.interval = interval;
        id = String.format("delete_%s_%s_%s_%s", dataSource, interval.getStartTime(), interval.getEndTime(), new DateTime().toString());
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
        map.put("type", "delete");
        map.put("dataSource", dataSource);
        map.put("interval", interval.toString());
        map.put("id", id);
        return map;
    }


    public <T> void postProcess(T anyContext) {

    }
}
