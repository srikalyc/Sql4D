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

import com.google.common.base.Preconditions;
import com.yahoo.sql4d.utils.TimeUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * Interval (start,end) times as text. Can construct new intervals out of existing.
 * Supports parsing time text in most of ISO formats.
 * @author srikalyan
 */
public class Interval {
    public String startTime;
    public String endTime;
    public int days;// Includes partial days as well.
    
    public Interval(String startTime, String endTime) {
        this.startTime = startTime.replaceAll("'", "");
        this.endTime = endTime.replaceAll("'", "");
        days = Days.daysBetween(getStartTime().withTimeAtStartOfDay() , getEndTime().withTimeAtStartOfDay() ).getDays() + 1;
    }

    /**
     * Interval should be of form 2014-10-31T00:00:00.000-07:00/2014-11-01T00:00:00.000-07:00
     * @param interval 
     */
    public Interval(String interval) {
        String[] dates = interval.split("/");
        Preconditions.checkArgument(dates.length == 2);
        this.startTime = dates[0].replaceAll("'", "");
        this.endTime = dates[1].replaceAll("'", "");
        days = Days.daysBetween(getStartTime().withTimeAtStartOfDay() , getEndTime().withTimeAtStartOfDay() ).getDays() + 1;
    }

    public DateTime getStartTime() {
        return TimeUtils.getDateTime(startTime);
    }

    public DateTime getEndTime() {
        return TimeUtils.getDateTime(endTime);
    }

    public int getDays() {
        return days;
    }
    
    public Interval getInterval(int daysOffset, int startHourOffset, int endHourOffset) {
        DateTime baseDateTime = getStartTime().withTime(0, 0, 0, 0).plusDays(daysOffset);
        return new Interval(baseDateTime.plusHours(startHourOffset).toString(), 
                baseDateTime.plusHours(endHourOffset).minusSeconds(1).toString());
    }

    public Interval expandIntervalByDay(int days) {
        return new Interval(getStartTime().minusDays(days).toString(), 
                getEndTime().plusDays(days).toString());
    }

    public Interval expandEndTimeByDay(int days) {
        return new Interval(getStartTime().toString(), 
                getEndTime().plusDays(days).toString());
    }

    public Interval expandIntervalBySec(int secs) {
        return new Interval(getStartTime().minusSeconds(secs).toString(), 
                getEndTime().plusSeconds(secs).toString());
    }

    @Override
    public String toString() {
        return String.format("%s/%s", startTime, endTime);
    }
    
    public boolean fallsIn(Interval range) {
        return range.getStartTime().isBefore(getStartTime()) && range.getEndTime().isAfter(getEndTime());
    }

}
