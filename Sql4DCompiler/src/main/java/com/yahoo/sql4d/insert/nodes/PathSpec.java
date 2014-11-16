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
package com.yahoo.sql4d.insert.nodes;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/**
 * Ex: Used in data ingestion.
 *"pathSpec" : {
      "type" : "static",
      "paths" : "data.json",// This can be just a folder(comma separated list of paths)
      "filePattern": "*.gz"// This is optional if the paths has full path of file
    },
 * 
 * @author srikalyan
 */
public class PathSpec {
    private String path = null;//TODO: This should be a list(right now we support only one path)
    public String type = "static";//TODO: Check out what are other types.
    private String filePattern = null;
    
    public void setPath(String p) {
        path = p;
        int starIndex = p.indexOf("*");
        if (starIndex >= 0) {
            filePattern = p.substring(starIndex);
            path = p.substring(0, starIndex);
        }
    }
    
    @Override
    public String toString() {
        return String.format(getJson().toString(2));
    }
    
    public JSONObject getJson() {
        return new JSONObject(getDataMap());
    }

    public Map<String, Object> getDataMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("paths", path);
        map.put("type", type);
        if (filePattern != null) {
            map.put("filePattern", filePattern);
        }
        return map;
    }
}
