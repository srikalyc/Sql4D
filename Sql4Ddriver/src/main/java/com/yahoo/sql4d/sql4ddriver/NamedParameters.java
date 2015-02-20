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

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Simple named parameters.
 * @author srikalyan
 */
public class NamedParameters {
    
    private final Map<String, Object> namedParams = new HashMap<>();
    private static final TimeZone utcTz = TimeZone.getTimeZone("UTC");
    private static final TimeZone estTz = TimeZone.getTimeZone("EST");
    private static final TimeZone est5edtTz = TimeZone.getTimeZone("EST5EDT");
    private static final DateFormat javaDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
    
    private static final DateTimeZone jodaUtcTz = DateTimeZone.forTimeZone(utcTz);
    private static final DateTimeZone jodaEstTz = DateTimeZone.forTimeZone(estTz);
    private static final DateTimeZone jodaEst5edtTz = DateTimeZone.forTimeZone(est5edtTz);
    private static final DateTimeFormatter jodaDateFormat = ISODateTimeFormat.dateTime().withZone(jodaUtcTz);
    private static final DateTimeFormatter jodaEstDateFormat = ISODateTimeFormat.dateTime().withZone(jodaEstTz);
    private static final DateTimeFormatter jodaEst5EDTDateFormat = ISODateTimeFormat.dateTime().withZone(jodaEst5edtTz);
    
    private final DateFormat currentJavaDateFormat;
    private final DateTimeFormatter currentJodaDateFormat;
    
    
    public NamedParameters() {
        javaDateFormat.setTimeZone(utcTz);
        currentJavaDateFormat = javaDateFormat;
        currentJodaDateFormat = jodaDateFormat;
    }
    //TODO: Must be able to handle all timezones types.
    public NamedParameters(String timeZone) {
        if (timeZone.equalsIgnoreCase("est")) {
            javaDateFormat.setTimeZone(estTz);
            currentJodaDateFormat = jodaEstDateFormat;
        } else if (timeZone.equalsIgnoreCase("est5edt")) {
            javaDateFormat.setTimeZone(est5edtTz);
            currentJodaDateFormat = jodaEst5EDTDateFormat;
        } else {
            currentJodaDateFormat = jodaDateFormat;
        } 
        currentJavaDateFormat = javaDateFormat;
    }
    
    public void add(String key, Object value) {
        namedParams.put(key, value);
    }
    
    /**
     * TODO: Make it more efficient.
     * @param sqlQuery
     * @return 
     */
    public String deParameterize(String sqlQuery) {
        String result = sqlQuery;
        for (String key:namedParams.keySet()) {
            Object value = namedParams.get(key);
            if (value instanceof String) {// This could be combined with last else(but mostly we encounter String)
                result = result.replaceAll(String.format(":%s", key), String.format("%s", value));
            } else if (value instanceof BigDecimal)  {
                result = result.replaceAll(String.format(":%s", key), String.format("%f", ((BigDecimal)value).doubleValue()));
            } else if (value instanceof Date)  {
                result = result.replaceAll(String.format(":%s", key), currentJavaDateFormat.format(value)).replace("Z", "");
            } else if (value instanceof DateTime)  {
                result = result.replaceAll(String.format(":%s", key), currentJodaDateFormat.print(((DateTime)value).getMillis())).replace("Z", "");
            } else {
                result = result.replaceAll(String.format(":%s", key), value.toString());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
        
    }
    
}
