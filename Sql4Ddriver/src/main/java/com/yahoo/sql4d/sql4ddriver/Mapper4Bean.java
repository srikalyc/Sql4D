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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Simply maps JSON to bean .
 *
 * @author srikalyan
 * @param <T>
 */
public class Mapper4Bean<T extends DruidBaseBean> extends BaseMapper {

    public List<T> baseAllRows = new ArrayList<>();// Each entry = Bean of type T
    private Class<T> rowMapper;

    public Mapper4Bean(JSONArray jsonAllRows, Class<T> rowMapper) {
        this.rowMapper = rowMapper;
        map(jsonAllRows);
    }


    /**
     * Generate a Tuple <A, B>
     * A = list of field names B = map of <joinFeild, rowList> from jsonArray.
     *
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
            if (i == 0) {// Fill headers (only once)
                tryRefillHeaders(eachRow);
            }
            T row = extractKeyAndRow(actualTimestamp, eachRow);
            baseAllRows.add(row);
        }
    }

    /**
     * Extract v = all fields from json. The first field is always timestamp and
     * is not extracted here.
     *
     * @param timestamp
     * @param jsonRow
     * @return
     */
    private T extractKeyAndRow(String timestamp, JSONObject jsonRow) {
        T rowValues = null;
        try {
            rowValues = rowMapper.newInstance();
            rowValues.getClass().getMethod("setTimestamp", String.class).invoke(rowValues, timestamp);
            for (Object key : jsonRow.keySet()) {
                applyKVToBean(rowValues, key.toString(), jsonRow.get(key.toString()));
            }

        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Mapper4Bean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowValues;
    }

}
