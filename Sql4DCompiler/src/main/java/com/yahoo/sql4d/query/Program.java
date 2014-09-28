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
package com.yahoo.sql4d.query;

import com.yahoo.sql4d.query.nodes.AggItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * One or more query meta which are joinable on primary key.
 * @author srikalyan
 */
public class Program {
    public List<QueryMeta> listOfQueries = new ArrayList<>();// Has 'N' items.
    public List<String> primaryJoinableHooks = new ArrayList<>();// Has 'N-1' items
    public List<String> joinTypes = new ArrayList<>();// Has 'N-1' items

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        int i = 0;
        for (QueryMeta qMeta: listOfQueries) {
            buffer.append(qMeta.toString());
            buffer.append("\n");
            if (i == listOfQueries.size() - 1) {
                break;
            }
            if (listOfQueries.size() > 1) {
                buffer.append(" joined with ");
                buffer.append(primaryJoinableHooks.get(i++));
                buffer.append("\n");
            }
            
        }
        return buffer.toString();
    }
    
    /**
     * TODO: This method should be a full blown functional but right now address 
     * only partial semantics.
     * Do all semantic checks here.
     * @throws java.lang.Exception
     */
    public void isValid() throws Exception {
        if (listOfQueries.size() >= 2) {
            if (primaryJoinableHooks.size() > 0) {
                for (String joinField:primaryJoinableHooks) {
                    if (joinField.equals("timestamp")) {// timestamp is implicitly present in the result.
                        continue;
                    }
                    for (QueryMeta query: listOfQueries) {
                        boolean isPresent = false;
                        if (query instanceof BaseAggQueryMeta) {// Since BaseAggQueryMeta is also a PlainDimQueryMeta we go with former first.
                            for (AggItem item:((BaseAggQueryMeta)query).aggregations) {
                                if (joinField.equals(item.fieldName) || (item.asName != null && joinField.equals(item.asName))) {
                                    isPresent = true;
                                }
                            }
                        }
                        if (query instanceof PlainDimQueryMeta) {
                            Map<String, String> dims = ((PlainDimQueryMeta)query).fetchDimensions;
                            for (Map.Entry<String, String> entry :dims.entrySet()) {
                                if (joinField.equals(entry.getKey()) || (entry.getValue() != null && joinField.equals(entry.getValue()))) {
                                    isPresent = true;
                                }
                            }
                        }
                        if (!isPresent) {
                            String error = joinField + " mentioned in the composite key should appear in all the data sources being queried and joined.";
                            throw new Exception(error);
                        }
                    }
                }
            } else {
                String error = "Need atleast one field to join on";
                throw new Exception(error);
            }
        }
    }
}
