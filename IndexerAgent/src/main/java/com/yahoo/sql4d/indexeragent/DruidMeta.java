/**
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License. See accompanying
 * LICENSE file.
 */
package com.yahoo.sql4d.indexeragent;
import static com.yahoo.sql4d.indexeragent.Agent.*;

/**
 * Assumes Agent is already initialized.
 * @author srikalyan
 */
public final class DruidMeta {
    private static final String LOCALHOST = "127.0.0.1";
    private static final String COLON = ":";
    
    private static String[] getBroker() {
        return getConfigAsStr("druid.broker", "127.0.0.1:8082").split(COLON);
    }    
    private static String[] getCoordinator() {
        return getConfigAsStr("druid.coordinator", "127.0.0.1:8081").split(COLON);
    }    
    private static String[] getOverlord() {
        return getConfigAsStr("druid.broker", "127.0.0.1:8090").split(COLON);
    }    
    
    public static String getBrokerHost() {
        String []sp = getBroker();
        return (sp != null && sp.length > 0) ? sp[0] : LOCALHOST;
    }    
    public static String getCoordinatorHost() {
        String []sp = getCoordinator();
        return (sp != null && sp.length > 0) ? sp[0] : LOCALHOST;
    }    
    public static String getOverlordHost() {
        String []sp = getOverlord();
        return (sp != null && sp.length > 0) ? sp[0] : LOCALHOST;
    }    
    
    public static int getBrokerPort() {
        String []sp = getBroker();
        return (sp != null && sp.length > 1) ? Integer.valueOf(sp[1]) : 8082;
    }    
    
    public static int getCoordinatorPort() {
        String []sp = getCoordinator();
        return (sp != null && sp.length > 1) ? Integer.valueOf(sp[1]) : 8081;
    }    

    public static int getOverlordPort() {
        String []sp = getOverlord();
        return (sp != null && sp.length > 1) ? Integer.valueOf(sp[1]) : 8090;
    }    
}
