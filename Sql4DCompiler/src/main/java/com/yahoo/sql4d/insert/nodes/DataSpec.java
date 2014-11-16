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

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/**
 * Ex: Used in data ingestion.
 *"dataSpec" : {
      "format" : "json",// Can also be csv, tsv etc .
      "dimensions" : ["dim1","dim2","dim3"],
      "columns" : ["dim1","dim2","dim3"],
      "delimiter": "\u0001",// The delimiter and list delimiter may be needed when format is tsv
      "listDelimiter": "\u0002",
    },
 * 
 * @author srikalyan
 */
public class DataSpec {

    public String format = "csv";//
    public String delimiter = null;
    public String listDelimiter = null;
    public List<String> dimensions = new ArrayList<>();
    public List<String> columns = new ArrayList<>();
    
    public void inferFormat(String fileExtension) {
        if (fileExtension.endsWith("csv")) {
            format = "csv";
        } else if (fileExtension.endsWith("json")) {
            format = "json";
        } else {
            format = "tsv";
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
        map.put("format", format);
        map.put("dimensions", dimensions);
        map.put("columns", columns);
        if (delimiter != null) {
            map.put("delimiter", delimiter);
        }
        if (listDelimiter != null) {
            map.put("listDelimiter", listDelimiter);
        }
        return map;
    }
}
