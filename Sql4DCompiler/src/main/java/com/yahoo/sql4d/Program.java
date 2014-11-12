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

import java.util.ArrayList;
import java.util.List;

/**
 * @author srikalyan
 * @param <T>
 */
public abstract class Program<T extends BaseStatementMeta> {
    private final List<T> stmnts = new ArrayList<>();
    
    public enum Type {
        QUERY, INSERT, INSERT_HADOOP, INSERT_REALTIME, DROP, DELETE
    }
    
    protected Type type;
    
    public Type getStmntType() {
        return type;
    }
    
    public void addStmnt(T stmnt) {
        stmnts.add(stmnt);
    }

    public T nthStmnt(int i) {
        return stmnts.get(i);
    }
    
    public List<T> getAllStmnts() {
        return stmnts;
    }
    
    public int numStmnts() {
        return stmnts.size();
    }
    /**
     * Do all semantic checks here.
     * @throws java.lang.Exception
     */
    public abstract void isValid() throws Exception;
}
