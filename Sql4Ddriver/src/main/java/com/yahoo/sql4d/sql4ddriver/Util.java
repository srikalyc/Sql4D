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

import com.yahoo.sql4d.sql4ddriver.rowmapper.DruidBaseBean;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import scala.util.Either;
import scala.util.Left;
import scala.util.Right;

/**
 * Simple utils.
 * @author srikalyan
 */
public class Util {
    public static final void newLine() {
        System.out.println();
    }
    
    public static final void print(char c) {
        System.out.print(c);
        System.out.flush();
    }

    public static final void print(String message) {
        System.out.print(message);
        System.out.flush();
    }

    public static final void println(String message) {
        System.out.println(message);
        System.out.flush();
    }

    public static final void printf(String format, Object ...args) {
        System.out.printf(format, args);
        System.out.flush();
    }

    public static final String repeat(String item, int n) {
        StringBuilder buff = new StringBuilder();
        for (int i = 0;i < n;i++) {
            buff.append(item);
        }
        return buff.toString();
    }

    public static void printTable(JSONArray jsonArray) {
        if (jsonArray.length() == 0) {
            return;
        }
        JSONObject sample = jsonArray.getJSONObject(0);
        if (sample.has("event")) {// GroupBy
            for (int i = 0;i < jsonArray.length();i++) {
                JSONObject jsonItem = jsonArray.getJSONObject(i);
                JSONObject event = jsonItem.getJSONObject("event");
                
                // Print headers.
                if (i == 0) {
                    printf("%-10s  |", "timestamp");
                    for (Object key: event.keySet()) {
                        printf("%-10s  |", key);
                    }
                    newLine();
                }
                println(repeat("-", (event.keySet().size() + 1) * 10));
                // Print data.
                printf("%-10s  |", jsonItem.getString("timestamp"));
                for (Object key: event.keySet()) {
                    printf("%-10s  |", event.get(key.toString()));
                }
                newLine();
            }
        } else if (sample.has("result")) {// Could be timeseries/topN
            if (sample.optJSONObject("result") != null) {// Timeseries
                JSONObject sampleResult = sample.optJSONObject("result");
                // Print headers.
                printf("%-10s  |", "timestamp");
                for (Object key: sampleResult.keySet()) {
                    printf("%-10s  |", key);
                }
                newLine();
                println(repeat("-", (sampleResult.keySet().size() + 1) * 10));
                // Print data.
                for (int i = 0;i < jsonArray.length();i++) {
                    JSONObject jsonItem = jsonArray.getJSONObject(i);
                    printf("%-10s  |", jsonItem.getString("timestamp"));
                    JSONObject result = jsonItem.getJSONObject("result");
                    for (Object key: result.keySet()) {
                        printf("%-10s  |", result.get(key.toString()));
                    }
                    newLine();
                }
            } else if (sample.optJSONArray("result") != null) {// TopN
                // There should be only 1 item in here.
                JSONObject jsonItem = jsonArray.getJSONObject(0);
                
                JSONArray result = jsonItem.getJSONArray("result");
                // Print headers.
                printf("%-10s  |", "timestamp");
                if (result.length() == 0) {// Nothing to be printed
                    return;
                }
                for (Object key: result.getJSONObject(0).keySet()) {
                    printf("%-10s  |", key);
                }
                newLine();
                println(repeat("-", (result.getJSONObject(0).keySet().size() + 1) * 10));
                for (int j = 0;j < result.length();j++) {
                    printf("%-10s  |", jsonItem.getString("timestamp"));
                    JSONObject deepItem = result.getJSONObject(j);
                    for (Object key: deepItem.keySet()) {
                        printf("%-10s  |", deepItem.get(key.toString()));
                    }
                    newLine();
                }
                newLine();
            }
        } 
    }
    
    public static void printTable(List<String> baseFieldNames, Map<Object, List<Object>> baseAllRows) {
        for(String header:baseFieldNames) {
            printf("%-10s  |", header);
        }
        newLine();
        for(List<Object> row:baseAllRows.values()) {
            for (Object rowColValue:row) {
                printf("%-10s  |", rowColValue);
            }
            newLine();
        }
    }

    public static void printTable(List<String> baseFieldNames, List<List<Object>> baseAllRows) {
        for(String header:baseFieldNames) {
            printf("%-10s  |", header);
        }
        newLine();
        for(List<Object> row:baseAllRows) {
            for (Object rowColValue:row) {
                printf("%-10s  |", rowColValue);
            }
            newLine();
        }
    }

    public static <T extends DruidBaseBean> void printTable(List<T> baseAllRows) {
        if (baseAllRows == null || baseAllRows.isEmpty()) {
            return;
        }
        List<Method> setters = getAllSetters(baseAllRows.get(0).getClass());
        for(Method setter:setters) {
            printf("%-10s  |", setter.getName().substring(3));
        }
        newLine();
        List<Method> getters = getAllGetters(baseAllRows.get(0).getClass());
        for(T row:baseAllRows) {
            for(Method getter:getters) {
                try {
                    printf("%-10s  |", getter.invoke(row));
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            newLine();
        }
    }
    
    public static List<Method> getAllSetters(Class<?> clazz) {
        Method[] allMethods = clazz.getMethods();
        List<Method> setters = new ArrayList<>();
        for(Method method : allMethods) {
            if(method.getName().startsWith("set")) {
                setters.add(method);
            }
        }    
        return setters;
    }

    public static List<Method> getAllGetters(Class<?> clazz) {
        Method[] allMethods = clazz.getMethods();
        List<Method> getters = new ArrayList<>();
        for(Method method : allMethods) {
            if(method.getName().startsWith("get") && !method.getName().equals("getClass")) {
                getters.add(method);
            }
        }    
        return getters;
    }
    
    public static String getterMethodName(String key) {
        return "get" + capitalize(key);
    }

    public static String setterMethodName(String key) {
        return "set" + capitalize(key);
    }

    public static String capitalize(String word) {
        StringBuilder buff = new StringBuilder(word);
        if (word.charAt(0) != '_') {
            buff.setCharAt(0, Character.toUpperCase(word.charAt(0)));
        }
        for (int i = 1; i < buff.length(); i++) {
            if (buff.charAt(i - 1) == '_') {
                buff.setCharAt(i, Character.toUpperCase(word.charAt(i)));
            }
        }
        return buff.toString().replace("_", "");
    }

    public static Either<JSONArray, JSONObject> asJsonType(String str) throws JSONException {
        JSONArray possibleResArray = null;
        try {
            possibleResArray = new JSONArray(str);
            return new Left<>(possibleResArray);
        } catch (JSONException je) {
            JSONObject possibleResObj = new JSONObject(str);
            return new Right<>(possibleResObj);
        }
    }    
    
    /**
     * More granular(sets the property of a bean based on a key value).
     *
     * @param bean
     * @param key
     * @param value
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     */
    public static void applyKVToBean(Object bean, String key, Object value) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method getterMethod = bean.getClass().getMethod(Util.getterMethodName(key));
        Method setterMethod = bean.getClass().getMethod(Util.setterMethodName(key), getterMethod.getReturnType());
        setterMethod.invoke(bean, value);
    }
    
}
