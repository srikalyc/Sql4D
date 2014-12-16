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
package com.yahoo.sql4d.utils;

/**
 * TODO: Improve the implementation.
 * @author srikalyan
 */
public class Utils {
    public static String unquote(String ipStr) {
        if (ipStr == null) return ipStr;
        if (ipStr.startsWith("'") && ipStr.endsWith("'")) {
           ipStr = ipStr.substring(1, ipStr.length() - 1);
        }
        return ipStr;
    }
    public static String unescape(String ipStr) {
        if (ipStr == null) return ipStr;
        return ipStr.replace("\\\\", "\\");
    }

    //TODO:  Handles only the most popular cases now.
    public static String unicode(String ipStr) {
        if (ipStr == null) return ipStr;
        switch(ipStr) {
            case "\\u0001":
                return "\u0001";
            case "\\u0002":
                return "\u0002";
            case "\\u0003":
                return "\u0003";
            case "\\u0004":
                return "\u0004";
            case "\\u0005":
                return "\u0005";
            case "\\u0006":
                return "\u0006";
            case "\\n"://TODO: This is not a unicode , find a proper home for this.
                return "\n";
        }
        return ipStr;
    }
}
