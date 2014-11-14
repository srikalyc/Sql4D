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

import com.yahoo.sql4d.drop.DropMeta;

/**
 * One Drop Meta.
 * @author srikalyan
 */
public class DropProgram extends Program<DropMeta>{
        
    private DropProgram() {
        this.type = Type.DROP;
    }
    
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (DropMeta dMeta: getAllStmnts()) {
            System.out.println(dMeta.toString());
        }
        return buffer.toString();
    }
    
    /**
     * TODO: Do all semantic checks here. 1st field should be timestamp.
     * @throws java.lang.Exception
     */
    @Override
    public void isValid() throws Exception {
    }

}
