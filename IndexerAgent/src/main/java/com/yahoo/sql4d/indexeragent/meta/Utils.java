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
package com.yahoo.sql4d.indexeragent.meta;

import java.text.DecimalFormat;
import java.text.ParseException;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 *
 * @author srikalyan
 */
public class Utils {

    private static final DecimalFormat twoFormat = new DecimalFormat("00");
    private static final DecimalFormat fourFormat = new DecimalFormat("0000");

    /**
     * I/p          ->       O/p
     * 2015         ->       2015-01-01T00:00:00.000Z
     * 201504       ->       2015-04-01T00:00:00.000Z
     * 20150403     ->       2015-04-03T00:00:00.000Z
     * 201504030102 ->       2015-04-03T01:02:00.000Z
     * @param dateStr
     * @return 
     */
    public static DateTime dateOf(String dateStr) {
        return nthDateOf(dateStr, 0, 0);
    }

    public static String year(DateTime dt) {
        return fourFormat.format(dt.getYear());
    }

    public static String month(DateTime dt) {
        return twoFormat.format(dt.getMonthOfYear());
    }
    
    public static String day(DateTime dt) {
        return twoFormat.format(dt.getDayOfMonth());
    }

    public static String hour(DateTime dt) {
        return twoFormat.format(dt.getHourOfDay());
    }

    public static String mins(DateTime dt) {
        return twoFormat.format(dt.getMinuteOfHour());
    }
    
    
    /**
     * 
     * @param dateStr
     * @param n
     * @param freqInMinutes
     * @return 
     */
    public static DateTime nthDateOf(String dateStr, int n, int freqInMinutes) {
        if (StringUtils.isBlank(dateStr)) {
            throw new IllegalArgumentException("Invalid dateStr " + dateStr);
        }
        int year = 0;
        int month = 1;
        int day = 1;
        int hour = 0;
        int min = 0;

        try {
            if (dateStr.length() >= 4) {
                year = fourFormat.parse(dateStr.substring(0, 4)).intValue();
                if (dateStr.length() >= 6) {
                    month = twoFormat.parse(dateStr.substring(4, 6)).intValue();
                    if (dateStr.length() >= 8) {
                        day = twoFormat.parse(dateStr.substring(6, 8)).intValue();
                        if (dateStr.length() >= 10) {
                            hour = twoFormat.parse(dateStr.substring(8, 10)).intValue();
                            if (dateStr.length() >= 12) {
                                min = twoFormat.parse(dateStr.substring(10, 12)).intValue();
                            }
                        }
                    }
                }
            }
        } catch (ParseException ex) {
            throw new IllegalArgumentException("Invalid dateStr " + dateStr + " " + ex);
        }
        return new DateTime(DateTimeZone.UTC).withYear(year).withMonthOfYear(month).withDayOfMonth(day).withHourOfDay(hour).withMinuteOfHour(min).withSecondOfMinute(0).withMillisOfSecond(0).plusMinutes(n * freqInMinutes);
    }

    public static void main(String[] args) {
        System.out.println(nthDateOf("201504030102", 5, 1440));
    }
}
