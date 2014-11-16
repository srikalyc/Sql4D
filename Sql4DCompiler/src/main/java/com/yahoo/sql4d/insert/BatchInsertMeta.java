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

import com.google.common.collect.ImmutableMap;
import com.yahoo.sql4d.insert.nodes.GranularitySpec;
import com.yahoo.sql4d.insert.nodes.DataSpec;
import com.yahoo.sql4d.insert.nodes.PartitionsSpec;
import com.yahoo.sql4d.insert.nodes.PathSpec;
import com.yahoo.sql4d.insert.nodes.RollupSpec;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/**
 * Insert Meta for batch ingestions.
 *
 * @author srikalyan
 */
public class BatchInsertMeta extends InsertMeta {

    public GranularitySpec granularitySpec = new GranularitySpec("day");
    public DataSpec dataSpec = new DataSpec();
    public PathSpec pathSpec = new PathSpec();
    public PartitionsSpec partitionsSpec = new PartitionsSpec();
    public RollupSpec rollupSpec = new RollupSpec();

    public BatchInsertMeta() {
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
        Map<String, Object> config = new LinkedHashMap<>();
        if (granularitySpec != null) {
            config.put("granularitySpec", granularitySpec.getJson());
        }
        Map<String, String> tsSpec = ImmutableMap.<String, String>builder().
            put("column", "timestamp").
            put("format", "auto").build();
        config.put("timestampSpec", tsSpec);
        config.put("dataSpec", dataSpec.getDataMap());
        config.put("pathSpec", pathSpec.getDataMap());
        config.put("partitionsSpec", partitionsSpec.getDataMap());
        config.put("rollupSpec", rollupSpec.getDataMap());
        config.put("dataSource", map.remove("dataSource"));// dataSource by default will appear at top level, move it inside "config" json element.
        map.put("config", config);
        return map;
    }


    public <T> void postProcess(T anyContext) {

    }
}
