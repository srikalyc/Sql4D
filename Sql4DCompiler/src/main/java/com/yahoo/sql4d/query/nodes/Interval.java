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
package com.yahoo.sql4d.query.nodes;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Interval (start,end) times as text. Can construct new intervals out of existing.
 * Supports parsing time text in most of ISO formats.
 * @author srikalyan
 */
public class Interval {
    private static final DateTimeFormatter dateOnlyFormat = DateTimeFormat.forPattern("yyyy-MM-dd").withOffsetParsed();
    private static final DateTimeFormatter dateHourOnlyFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH").withOffsetParsed();
    private static final DateTimeFormatter dateHourMinOnlyFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm").withOffsetParsed();
    private static final DateTimeFormatter dateTimeFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss").withOffsetParsed();
    private static final DateTimeFormatter dateTimeWithSubSecFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").withOffsetParsed();
    private static final DateTimeFormatter dateTimeAndTZFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZZ").withOffsetParsed();
    private static final DateTimeFormatter dateTimeWithSubSecAndTZFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZ").withOffsetParsed();

    public String startTime;
    public String endTime;
    public int days;// Includes partial days as well.
    
    public Interval(String startTime, String endTime) {
        this.startTime = startTime.replaceAll("'", "");
        this.endTime = endTime.replaceAll("'", "");
        days = Days.daysBetween(getStartTime().withTimeAtStartOfDay() , getEndTime().withTimeAtStartOfDay() ).getDays() + 1;
    }

    public DateTime getStartTime() {
        return getDateTime(startTime);
    }

    public DateTime getEndTime() {
        return getDateTime(endTime);
    }

    public int getDays() {
        return days;
    }
    
    public Interval getInterval(int daysOffset, int startHourOffset, int endHourOffset) {
        DateTime baseDateTime = getStartTime().withTime(0, 0, 0, 0).plusDays(daysOffset);
        return new Interval(baseDateTime.plusHours(startHourOffset).toString(), 
                baseDateTime.plusHours(endHourOffset).minusSeconds(1).toString());
    }
            
    private DateTime getDateTime(String strTime) {
        DateTime dateTime = null;
        if ((dateTime = tryFormat(strTime, dateTimeWithSubSecAndTZFormat)) == null) {
            if ((dateTime = tryFormat(strTime, dateTimeAndTZFormat)) == null) {
                if ((dateTime = tryFormat(strTime, dateTimeWithSubSecFormat)) == null) {
                    if ((dateTime = tryFormat(strTime, dateTimeFormat)) == null) {
                        if ((dateTime = tryFormat(strTime, dateHourMinOnlyFormat)) == null) {
                            if ((dateTime = tryFormat(strTime, dateHourOnlyFormat)) == null) {
                                if ((dateTime = tryFormat(strTime, dateOnlyFormat)) == null) {
                                    return dateTime;
                                }
                            }
                        }
                    }
                }
            }
        }
        return dateTime;
    }
    
    private DateTime tryFormat(String timeStr, DateTimeFormatter formatter) {
        DateTime result = null;
        try {
            result = formatter.parseDateTime(timeStr);
        } catch (UnsupportedOperationException | IllegalArgumentException e) {
            //TODO: Log this instead of dumping to console.
            //System.err.println("Date Format error " + e);
        }
        return result;
    }
}
