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
package com.yahoo.sql4d.query.groupby;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Row limit spec.
 *
 * @author srikalyan
 */
public class LimitSpec {

    public String type = "default";//TODO: add support for more types(if there are any later)
    public long limit;
    public Map<String, Direction> columns = new HashMap<>();

    enum Direction {

        ASCENDING,
        DESCENDING
    }

    public LimitSpec() {
    }

    public LimitSpec(String type, long limit) {
        this.type = type;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return String.format(getJson().toString(2));
    }

    public void addColumn(String col, String asc) {
        if (asc.equalsIgnoreCase("DESC")) {
            columns.put(col, Direction.DESCENDING);
        } else {
            columns.put(col, Direction.ASCENDING);
        }
    }

    public JSONObject getJson() {
        return new JSONObject(getJsonMap());
    }

    public Map<String, Object> getJsonMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("type", type);
        map.put("limit", limit);
        if (columns != null) {
            JSONArray columnsArray = new JSONArray();
            for (Map.Entry<String, Direction> item : columns.entrySet()) {
                JSONObject itemJson = new JSONObject();
                itemJson.put("dimension", item.getKey());
                itemJson.put("direction", item.getValue().name());
                columnsArray.put(itemJson);
            }
            map.put("columns", columnsArray);
        }
        return map;
    }

}
