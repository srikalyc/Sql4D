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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Date formatting utilities.
 * @author srikalyan
 */
public class DateFormatUtils {
    private static final String DATE_HOUR = "yyyy-MM-dd'T'HH";
    private static final String DATE_HOUR_MIN = "yyyy-MM-dd'T'HH:mm";
    private static final String DATE_HOUR_MIN_SEC = "yyyy-MM-dd'T'HH:mm:ss";
    private static final String DATE_TIME_ZONE = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    
    public static final DateFormat dateHourFormat = new SimpleDateFormat(DATE_HOUR);
    public static final DateFormat dateHourMinFormat = new SimpleDateFormat(DATE_HOUR_MIN);
    public static final DateFormat dateHourMinSecFormat = new SimpleDateFormat(DATE_HOUR_MIN_SEC);
    public static final DateFormat dateHourTimeZoneFormat = new SimpleDateFormat(DATE_TIME_ZONE);
    
    public static Date dateHour(String date) {
        return getDate(dateHourFormat, date);
    }

    public static Date dateHourMin(String date) {
        return getDate(dateHourMinFormat, date);
    }

    public static Date dateHourMinSec(String date) {
        return getDate(dateHourMinSecFormat, date);
    }

    public static Date dateHourTimeZone(String date) {
        return getDate(dateHourTimeZoneFormat, date);
    }

    private static Date getDate(DateFormat formatter, String date) {
        try {
            return formatter.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(DateFormatUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
