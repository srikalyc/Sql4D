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
package com.yahoo.sql4d.sql4ddriver.rowmapper;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Has timestamp which is always available in druid response.
 * @author srikalyan
 */
public class DruidBaseBean {
    private static DateTimeFormatter dateOnlyFormat = DateTimeFormat.forPattern("yyyy-MM-dd");
    private static DateTimeFormatter dateTimeFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss");
    private static DateTimeFormatter dateTimeWithSubSecFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
    private static DateTimeFormatter dateTimeAndTZFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZZ");
    private static DateTimeFormatter dateTimeWithSubSecAndTZFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");

    public static void main(String[] args) {
        System.out.println(dateTimeFormat.parseDateTime("2014-05-25T16:45:49"));
        System.out.println(dateTimeAndTZFormat.parseDateTime("2014-05-25T16:45:49+00:00"));
        System.out.println(dateTimeAndTZFormat.parseDateTime("2014-05-25T16:45:49Z"));
        System.out.println(dateTimeWithSubSecFormat.parseDateTime("2014-05-25T16:45:49.100"));
        System.out.println(dateTimeWithSubSecAndTZFormat.parseDateTime("2014-05-25T16:45:49.000Z"));
    }

    public String timestamp;// TODO: Crazy,though getDeclaredMethods can be used to access private fields, it is not possible on subclasses.

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTimestamp() {
        return timestamp;
    }

}
