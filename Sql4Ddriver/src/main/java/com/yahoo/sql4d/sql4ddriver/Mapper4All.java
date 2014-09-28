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
package com.yahoo.sql4d.sql4ddriver;

import com.yahoo.sql4d.query.RequestType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Simply maps JSON to bean .
 *
 * @author srikalyan
 */
public class Mapper4All extends BaseMapper {

    public List<List<Object>> baseAllRows = new ArrayList<>();

    public Mapper4All() {
    }

    public Mapper4All(JSONArray jsonAllRows) {
        map(jsonAllRows);
    }

    /**
     * @param timestamp
     * @param jsonAllRows
     * @param requestType 
     */
    @Override
    protected void extractAndMap(String timestamp, JSONArray jsonAllRows, RequestType requestType) {
        JSONObject eachRow = null;
        for (int i = 0; i < jsonAllRows.length(); i++) {
            JSONObject jsonItem = jsonAllRows.getJSONObject(i);
            eachRow = dataItemAt(jsonItem, requestType);
            String actualTimestamp = timestamp;
            if (timestamp == null) {
                if (requestType == RequestType.SELECT) {
                    actualTimestamp = eachRow.optString("timestamp");
                    // Because the timestamp is within each row remove them once you extract it.
                    eachRow.remove("timestamp");
                } else {
                    actualTimestamp = jsonItem.optString("timestamp");
                }
            }
            // Try refill headers for every row simply because we may not have result for that field in the response(which may skip that field) worst
            // case is some may have and some rows may not have values for that field.
            tryRefillHeaders(eachRow);
            List<Object> row = extractKeyAndRow(actualTimestamp, eachRow);
            baseAllRows.add(row);
        }
    }
    
    /**
     * Extract v = all fields from json. The first field is always timestamp and 
     * is passed to the method not extracted.
     * @param timestamp
     * @param jsonRow
     * @return 
     */
    private List<Object> extractKeyAndRow(String timestamp, JSONObject jsonRow) {
        List<Object> rowValues = new ArrayList<>();
        rowValues.add(timestamp);
        for (Object key : jsonRow.keySet()) {
            rowValues.add(jsonRow.get(key.toString()));
        }
        return rowValues;
    }

    @Override
    public String toString() {
        return baseFieldNames.toString() + "\n" + baseAllRows.toString();
    }
    
    
}
