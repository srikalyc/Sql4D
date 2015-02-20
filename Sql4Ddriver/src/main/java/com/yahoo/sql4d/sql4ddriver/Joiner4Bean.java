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
import com.yahoo.sql4d.sql4ddriver.rowmapper.DruidBaseBean;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import scala.Tuple2;

/**
 * Provides facilities to do chain of joins .
 * @author srikalyan
 * @param <T>
 */
public class Joiner4Bean<T extends DruidBaseBean> extends BaseJoiner {

    public Map<Object, T> baseAllRows = new LinkedHashMap<>();// Each entry = <key value, list of all values>
    private Class<T> rowMapper;
    
    public Joiner4Bean(JSONArray jsonAllRows, List<String> joinFields, Class<T> rowMapper) {
        this.rowMapper = rowMapper;
        join(jsonAllRows, joinFields, ActionType.FIRST_CUT);
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
        Map<Object, T> newBaseAllRows = new LinkedHashMap<>();
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
            Tuple2<Object, T> row = mapPkToRow(actualTimestamp, eachRow, joinFields);
            Object pk = row._1();// Primary key.
            T rowVal = row._2();
            if (action == ActionType.FIRST_CUT) {
                baseAllRows.put(pk, rowVal);
            } else {
                if (baseAllRows.containsKey(pk)) {// Merge with existing row.
                    for (Object jsonKey:eachRow.keySet()) {
                        if (baseFieldNames.contains(jsonKey.toString())) {
                            try {
                                Method setterMethod = rowVal.getClass().getMethod(Util.setterMethodName(jsonKey.toString()), rowVal.getClass().getDeclaredField(jsonKey.toString()).getType());
                                setterMethod.invoke(baseAllRows.get(pk), eachRow.get(jsonKey.toString()));
                            } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchFieldException ex) {
                                Logger.getLogger(Joiner4Bean.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    if (action == ActionType.JOIN || action == ActionType.RIGHT_JOIN) {
                        newBaseAllRows.put(pk, baseAllRows.remove(pk));// Remove from existing map and add to new map.
                    }
                } else {
                    if (action == ActionType.RIGHT_JOIN) {// Right join
                        newBaseAllRows.put(pk, rowVal);
                    }
                }
            }
            if (i == 0) {// Fill headers (only once)
                fillHeaders(eachRow, joinFields, action);
            }
        }
        if (!newBaseAllRows.isEmpty()) {
            baseAllRows = newBaseAllRows;
        }

    }
    /**
     * Extract fields(k,v) from json 
     * k = primary field(s), i.e could be composite key as well.
     * v = all fields . The first field is always timestamp.
     * @param timestamp
     * @param jsonRow
     * @param joinFields
     * @return 
     */
    private Tuple2<Object, T> mapPkToRow(String timestamp, JSONObject jsonRow, List<String> joinFields) {
        Object joinValue = null;
        T rowValues = null;
        try {
            rowValues = rowMapper.newInstance();
            rowValues.getClass().getMethod("setTimestamp", String.class).invoke(rowValues, timestamp);
            for (Object key : jsonRow.keySet()) {
                String colValue = key.toString();
                Util.applyKVToBean(rowValues, colValue, jsonRow.get(colValue));
                if (joinFields.contains(colValue)) {
                    joinValue = (joinValue == null)?jsonRow.get(colValue):(joinValue + "\u0001" + jsonRow.get(colValue));
                }
            }
            if (joinFields.contains("timestamp")) {// Join field could contain timestamp(timestamp can be out of the actual data JSON, so we try this way)
                joinValue = (joinValue == null)?timestamp:(joinValue + "\u0001" + timestamp);
            }
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Joiner4Bean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Tuple2<>(joinValue, rowValues);
    }

}
