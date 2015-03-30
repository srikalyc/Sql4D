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

import com.yahoo.sql4d.insert.nodes.GranularitySpec;
import com.yahoo.sql4d.query.nodes.AggItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Insert Meta for realtime ingestions.
 * TODO: Complete this implementation.
 * @author srikalyan
 */
public class RTInsertMeta extends InsertMeta {

    public List<Object> values = new ArrayList<>();

    public RTInsertMeta() {
    }

    public RTInsertMeta(String dataSource, GranularitySpec granularity) {
        super(dataSource);
        this.granularitySpec = granularity;
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
        map.put("type", "index_hadoop");
        if (granularitySpec != null) {
            map.put("granularitySpec", granularitySpec.getJson());
        }
        JSONArray aggregationsArray = new JSONArray();
        for (AggItem item : aggregations) {
            aggregationsArray.put(item.getJson());
        }
        map.put("aggregators", aggregationsArray);
        map.put("firehose", getFireHose());
        return map;
    }

    private JSONObject getFireHose() {
        return new JSONObject(new HashMap());
    }

    public <T> void postProcess(T anyContext) {

    }

    @Override
    public Map<String, Object> getTimestampSpec() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Map<String, Object> getIoConfig() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Map<String, Object> getTuningConfig() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
