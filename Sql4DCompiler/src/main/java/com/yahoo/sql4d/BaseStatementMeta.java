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
package com.yahoo.sql4d;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/**
 * Base class for all sql statement types.
 * @author srikalyan
 */
public abstract class BaseStatementMeta {
    public String dataSource;
    
    public BaseStatementMeta() {
    }

    
    public BaseStatementMeta(String dataSource) {
        this.dataSource = dataSource;
    }

    
    @Override
    public String toString() {
        return getJson().toString(2);
    }
    
    public JSONObject getJson() {
        return new JSONObject(getDataMap());
    }
    public Map<String, Object> getDataMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        JSONObject dataSourceJson = new JSONObject();
        dataSourceJson.put("type", "table");
        dataSourceJson.put("name", dataSource);
        map.put("dataSource", dataSourceJson);
        return map;
    }
    
    public <T> void postProcess(T anyContext) {
        
    }
}
