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
package com.yahoo.sql4d.utils;

import com.google.common.collect.ImmutableMap;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Utils to auto detect time format, auto resolve string time to Joda DateTime etc.
 * @author srikalyan
 */
public class TimeUtils {

    private static final DateTimeFormatter yearOnlyFormat = DateTimeFormat.forPattern("yyyy").withOffsetParsed();
    private static final DateTimeFormatter yearMonthOnlyFormat = DateTimeFormat.forPattern("yyyy-MM").withOffsetParsed();
    private static final DateTimeFormatter dateOnlyFormat = DateTimeFormat.forPattern("yyyy-MM-dd").withOffsetParsed();

    private static final DateTimeFormatter dateHourWithSpaceOnlyFormat = DateTimeFormat.forPattern("yyyy-MM-dd HH").withOffsetParsed();
    private static final DateTimeFormatter dateHourMinWithSpaceOnlyFormat = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm").withOffsetParsed();
    private static final DateTimeFormatter dateTimeWithSpaceFormat = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withOffsetParsed();
    private static final DateTimeFormatter dateTimeWithSubSecWithSpaceFormat = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS").withOffsetParsed();
    private static final DateTimeFormatter dateTimeAndTZWithSpaceFormat = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ssZZ").withOffsetParsed();
    private static final DateTimeFormatter dateTimeWithSubSecAndTZWithSpaceFormat = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSSZZ").withOffsetParsed();

    private static final DateTimeFormatter dateHourOnlyFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH").withOffsetParsed();
    private static final DateTimeFormatter dateHourMinOnlyFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm").withOffsetParsed();
    private static final DateTimeFormatter dateTimeFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss").withOffsetParsed();
    private static final DateTimeFormatter dateTimeWithSubSecFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").withOffsetParsed();
    private static final DateTimeFormatter dateTimeAndTZFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZZ").withOffsetParsed();
    private static final DateTimeFormatter dateTimeWithSubSecAndTZFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZ").withOffsetParsed();
    
    private static final ImmutableMap<DateTimeFormatter, String> formatterMap = ImmutableMap.<DateTimeFormatter, String>builder().put(
            yearOnlyFormat, "yyyy").put(
            yearMonthOnlyFormat, "yyyy-MM").put(
            dateOnlyFormat, "yyyy-MM-dd").put(
            dateHourWithSpaceOnlyFormat,"yyyy-MM-dd HH").put(
            dateHourMinWithSpaceOnlyFormat, "yyyy-MM-dd HH:mm").put(
            dateTimeWithSpaceFormat,"yyyy-MM-dd HH:mm:ss").put(
            dateTimeWithSubSecWithSpaceFormat,"yyyy-MM-dd HH:mm:ss.SSS").put(
            dateTimeAndTZWithSpaceFormat,"yyyy-MM-dd HH:mm:ssZZ").put(
            dateTimeWithSubSecAndTZWithSpaceFormat,"yyyy-MM-dd HH:mm:ss.SSSZZ").put(
            dateHourOnlyFormat,"yyyy-MM-dd'T'HH:mm").put(
            dateHourMinOnlyFormat,"yyyy-MM-dd'T'HH:mm").put(
            dateTimeFormat,"yyyy-MM-dd'T'HH:mm:ss").put(
            dateTimeWithSubSecFormat,"yyyy-MM-dd'T'HH:mm:ss.SSS").put(
            dateTimeAndTZFormat,"yyyy-MM-dd'T'HH:mm:ssZZ").put(
            dateTimeWithSubSecAndTZFormat,"yyyy-MM-dd'T'HH:mm:ss.SSSZZ").build();
    
    

    //TODO: Horrific levels of nesting, do something about this.
    public static String detectFormat(String strTime) {
        String format = null;
        if ((format = tryAndGetFormat(strTime, dateTimeWithSubSecAndTZFormat)) == null) {
            if ((format = tryAndGetFormat(strTime, dateTimeAndTZFormat)) == null) {
                if ((format = tryAndGetFormat(strTime, dateTimeWithSubSecFormat)) == null) {
                    if ((format = tryAndGetFormat(strTime, dateTimeFormat)) == null) {
                        if ((format = tryAndGetFormat(strTime, dateHourMinOnlyFormat)) == null) {
                            if ((format = tryAndGetFormat(strTime, dateHourOnlyFormat)) == null) {
                                if ((format = tryAndGetFormat(strTime, dateTimeWithSubSecAndTZWithSpaceFormat)) == null) {
                                    if ((format = tryAndGetFormat(strTime, dateTimeAndTZWithSpaceFormat)) == null) {
                                        if ((format = tryAndGetFormat(strTime, dateTimeWithSubSecWithSpaceFormat)) == null) {
                                            if ((format = tryAndGetFormat(strTime, dateTimeWithSpaceFormat)) == null) {
                                                if ((format = tryAndGetFormat(strTime, dateHourMinWithSpaceOnlyFormat)) == null) {
                                                    if ((format = tryAndGetFormat(strTime, dateHourWithSpaceOnlyFormat)) == null) {
                                                        if ((format = tryAndGetFormat(strTime, dateOnlyFormat)) == null) {
                                                            if ((format = tryAndGetFormat(strTime, yearMonthOnlyFormat)) == null) {
                                                                if ((format = tryAndGetFormat(strTime, yearOnlyFormat)) == null) {
                                                                    return format;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return format;
    }

    //TODO: Horrific levels of nesting, do something about this.
    public static DateTime getDateTime(String strTime) {
        DateTime dateTime = null;
        if ((dateTime = tryFormat(strTime, dateTimeWithSubSecAndTZFormat)) == null) {
            if ((dateTime = tryFormat(strTime, dateTimeAndTZFormat)) == null) {
                if ((dateTime = tryFormat(strTime, dateTimeWithSubSecFormat)) == null) {
                    if ((dateTime = tryFormat(strTime, dateTimeFormat)) == null) {
                        if ((dateTime = tryFormat(strTime, dateHourMinOnlyFormat)) == null) {
                            if ((dateTime = tryFormat(strTime, dateHourOnlyFormat)) == null) {
                                if ((dateTime = tryFormat(strTime, dateTimeWithSubSecAndTZWithSpaceFormat)) == null) {
                                    if ((dateTime = tryFormat(strTime, dateTimeAndTZWithSpaceFormat)) == null) {
                                        if ((dateTime = tryFormat(strTime, dateTimeWithSubSecWithSpaceFormat)) == null) {
                                            if ((dateTime = tryFormat(strTime, dateTimeWithSpaceFormat)) == null) {
                                                if ((dateTime = tryFormat(strTime, dateHourMinWithSpaceOnlyFormat)) == null) {
                                                    if ((dateTime = tryFormat(strTime, dateHourWithSpaceOnlyFormat)) == null) {
                                                        if ((dateTime = tryFormat(strTime, dateOnlyFormat)) == null) {
                                                            if ((dateTime = tryFormat(strTime, yearMonthOnlyFormat)) == null) {
                                                                if ((dateTime = tryFormat(strTime, yearOnlyFormat)) == null) {
                                                                    return dateTime;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return dateTime;
    }

    public static DateTime tryFormat(String timeStr, DateTimeFormatter formatter) {
        DateTime result = null;
        try {
            result = formatter.parseDateTime(timeStr);
        } catch (UnsupportedOperationException | IllegalArgumentException e) {
            //TODO: Log this instead of dumping to console.
            //System.err.println("Date Format error " + e);
        }
        return result;
    }

    public static String tryAndGetFormat(String timeStr, DateTimeFormatter formatter) {
        String result = null;
        try {
            formatter.parseDateTime(timeStr);
            result = formatterMap.get(formatter);
        } catch (UnsupportedOperationException | IllegalArgumentException e) {
            //TODO: Log this instead of dumping to console.
            //System.err.println("Date Format error " + e);
        }
        return result;
    }
}
