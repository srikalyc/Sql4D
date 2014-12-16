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
package com.yahoo.sql4d.insert;

import com.yahoo.sql4d.BaseStatementMeta;
import com.yahoo.sql4d.CrudStatementMeta;
import com.yahoo.sql4d.query.nodes.AggItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/**
 * Base class for all insert types.
 *
 * @author srikalyan
 */
public class InsertMeta extends CrudStatementMeta {

    public List<AggItem> aggregations = new ArrayList<>();
    public Map<String, String> fetchDimensions = new LinkedHashMap<>();

    public InsertMeta() {
    }

    public InsertMeta(String dataSource) {
        super(dataSource);
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
        map.put("dataSource", dataSource);
        return map;
    }

    public <T> void postProcess(T anyContext) {

    }
}
