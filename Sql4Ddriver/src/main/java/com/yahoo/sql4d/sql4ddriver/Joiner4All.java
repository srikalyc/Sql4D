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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import scala.Tuple2;

/**
 * Provides facilities to do chain of joins.
 *
 * @author srikalyan
 */
public class Joiner4All extends BaseJoiner {

    public Map<Object, List<Object>> baseAllRows = new LinkedHashMap<>();// Each entry = <key value, list of all values>

    public Joiner4All() {
    }

    public Joiner4All(JSONArray jsonAllRows, List<String> joinField) {
        join(jsonAllRows, joinField, ActionType.FIRST_CUT);
    }

    /**
     * Generate a Tuple <A, B>
     * A = list of field names
     * B = map of <joinFeild, rowList> from jsonArray.
     * @param timestamp
     * @param jsonAllRows
     * @param joinFields 
     * @param requestType 
     * @param action 
     */
    @Override
    protected void extractAndTakeAction(String timestamp, JSONArray jsonAllRows, List<String> joinFields, RequestType requestType, ActionType action) {
        Map<Object,List<Object>> newBaseAllRows = new LinkedHashMap<>();
        JSONObject eachRow = null;
        for (int i = 0; i < jsonAllRows.length(); i++) {
            JSONObject jsonItem = jsonAllRows.getJSONObject(i);
            eachRow = dataItemAt(jsonItem, requestType, action);
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
            Tuple2<Object, List<Object>> row = mapPkToRow(actualTimestamp, eachRow, joinFields);
            Object pk = row._1();// Primary key.
            List<Object> rowVal = row._2();
            if (action == ActionType.FIRST_CUT) {// First cut (no join).
                if (pk != null) {//TODO: Only non-nulls will go through. Address this later.
                    baseAllRows.put(pk, rowVal);
                }
            } else {// Some Join action.
                if (pk != null) {//TODO: Only non-nulls will go through. Address this later.
                    if (baseAllRows.containsKey(pk)) {// If any item in set B exist in set A.
                        rowVal.removeAll(splitCompositeKeys(pk.toString()));// Remove key(which is already available in baseAllRows)
                        if (!joinFields.contains("timestamp")) {// If join field is not "timestamp" then remove timestamp data value from to be joined set.
                            rowVal.remove(0);// Because the 1st field is always timestamp.(See extractKeyAndRow() method)
                        }
                        if (action == ActionType.JOIN || action == ActionType.RIGHT_JOIN) {
                            newBaseAllRows.put(pk, baseAllRows.remove(pk));// Remove from existing map and add to new map.
                            newBaseAllRows.get(pk).addAll(rowVal);// Update the new map with partial to be joined data.
                        } else if (action == ActionType.LEFT_JOIN) {// Left join
                            baseAllRows.get(pk).addAll(rowVal);
                        }
                    } else {// For right join we still need to continue with each row in set B.
                        if (action == ActionType.RIGHT_JOIN) {// Right join
                            newBaseAllRows.put(pk, rowVal);
                        }
                    }
                }
            }
            if (i == 0) {// Fill headers (only once)
                fillHeaders(eachRow, joinFields, action);
            }
        }
        if (!newBaseAllRows.isEmpty()) {// For join and right join.
            baseAllRows = newBaseAllRows;
        }
    }
    
    /**
     * Extract fields(k,v) from json 
     * k = primary field(s) could be a composite key.
     * v = all fields . The first field is always timestamp.
     * Presumption is jsonRow object passed to this method should not have timestamp field.
     * @param timestamp
     * @param jsonRow (This is a jsonObject without timestamp(even for select query response though timestamp is present it is stripped off before passing it to this method)
     * @param joinFields
     * @return 
     */
    private static Tuple2<Object, List<Object>> mapPkToRow(String timestamp, JSONObject jsonRow, List<String> joinFields) {
        Object joinValue = null;
        List<Object> rowValues = new ArrayList<>();
        rowValues.add(timestamp);
        for (Object key : jsonRow.keySet()) {
            String colName = key.toString();
            rowValues.add(jsonRow.get(colName));
            if (joinFields.contains(colName)) {
                joinValue = (joinValue == null)?jsonRow.get(colName):(joinValue + "\u0001" + jsonRow.get(colName));
            } 
        }
        if (joinFields.contains("timestamp")) {// Join field could contain timestamp(timestamp can be out of the actual data JSON, so we try this way)
            joinValue = (joinValue == null)?timestamp:(joinValue + "\u0001" + timestamp);
        }
        //Though join field could be specified like (a,timestamp,b) the value of the join,
        //field will be (a.value^Ab.value^Atimestamp.value) if b appears after a in the json 
        //object. And timestamp value is always appended to last.
        return new Tuple2<>(joinValue, rowValues);
    }
    @Override
    public String toString() {
        return baseFieldNames.toString() + "\n" + baseAllRows.toString();
    }

}
