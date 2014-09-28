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
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Base Joiner with basic join functionality. The actual join functionality goes into
 * {@link  #extractAndTakeAction(java.lang.String, org.json.JSONArray, java.lang.String, com.yahoo.sql4d.sql4ddriver.BaseMapper.RequestType, com.yahoo.sql4d.sql4ddriver.BaseJoiner.ActionType) }
 *
 * @author srikalyan
 */
public abstract class BaseJoiner extends BaseMapper {

    public static enum ActionType {
        FIRST_CUT, JOIN, LEFT_JOIN, RIGHT_JOIN
    }
    
    /**
     * If action if FIRST_CUT then the values are added directly to the result else
     * rows will be filtered on key.
     * @param jsonAllRows
     * @param joinFields
     * @param action 
     */
    public void join(JSONArray jsonAllRows, List<String> joinFields, ActionType action) {
        if (jsonAllRows.length() == 0) {
            return;
        }
        JSONObject sample = jsonAllRows.getJSONObject(0);
        if (sample.has("event")) {// GroupBy
            extractAndTakeAction(null, jsonAllRows, joinFields, RequestType.GROUPBY, action);
        } else if (sample.has("result")) {// Could be timeseries/topN
            if (sample.optJSONObject("result") != null) {// Timeseries
                extractAndTakeAction(null, jsonAllRows, joinFields, RequestType.TIMESERIES, action);
            } else if (sample.optJSONArray("result") != null) {// TopN
                // There should be only 1 item in here.
                JSONObject jsonItem = jsonAllRows.getJSONObject(0);
                JSONArray result = jsonItem.getJSONArray("result");
                extractAndTakeAction(jsonItem.optString("timestamp"), result, joinFields, RequestType.TOPN, action);
            }
        }
    }

    public static boolean isJoinType(ActionType action) {
        return action == ActionType.JOIN || action == ActionType.LEFT_JOIN ||action == ActionType.RIGHT_JOIN;
    }

    /**
     * Extract the data item from json(based on the request type) and also fill in the
     * headers as a side affect.
     * @param jsonItem
     * @param requestType
     * @param action
     * @return 
     */
    protected JSONObject dataItemAt(JSONObject jsonItem,  RequestType requestType, ActionType action) {
        JSONObject eachRow = null;    
        if (requestType == RequestType.GROUPBY) {
            eachRow = jsonItem.getJSONObject("event");
        } else if (requestType == RequestType.TIMESERIES) {
            eachRow = jsonItem.getJSONObject("result");
        } else if (requestType == RequestType.TOPN) {
            eachRow = jsonItem;
        } 
        return eachRow;
    }
    //TODO: Make this like tryRefillHeaders() method in BaseMapper because some items in the json resultset may not have all the fields.
    protected void fillHeaders(JSONObject eachRow, List<String> joinFields, ActionType action) {
        if (action == ActionType.FIRST_CUT) {
            baseFieldNames.add("timestamp");
        } 
        if (eachRow != null) {
            if (isJoinType(action)) {
                Set<String> keysCopy = new LinkedHashSet<>(eachRow.keySet());
                keysCopy.removeAll(joinFields);
                baseFieldNames.addAll(keysCopy);
            } else {
                baseFieldNames.addAll(eachRow.keySet());
            }
        }
    }
    protected List<String> splitCompositeKeys(String keys) {
        String keysArr[] = keys.split("\u0001");
        if (keysArr != null && keysArr.length > 0)
            return Arrays.asList(keysArr);
        return Arrays.asList(keys);
    }
    
    protected abstract void extractAndTakeAction(String timestamp, JSONArray jsonAllRows, List<String> joinFields, RequestType requestType, ActionType action);
}
