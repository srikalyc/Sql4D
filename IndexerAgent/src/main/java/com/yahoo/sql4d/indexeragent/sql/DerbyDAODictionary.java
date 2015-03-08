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
package com.yahoo.sql4d.indexeragent.sql;

/**
 *
 * @author srikalyan
 */
public interface DerbyDAODictionary {
    public static final String CREATE_DATASOURCE = "CREATE TABLE DataSource (" +
        "    id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
        "    data_source VARCHAR(64) NOT NULL," +
        "    feed_type INTEGER," +
        "    begin_time VARCHAR(10)," +
        "    current_run_time VARCHAR(10)," +
        "    end_time VARCHAR(10)," +
        "    CONSTRAINT dataSource_pk PRIMARY KEY (id)" +
        ")" ;
    public static final String CREATE_STATUS_TRAIL = "CREATE TABLE StatusTrail (\n" +
        "    id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
        "    data_source_id INTEGER CONSTRAINT dataSource_fk  REFERENCES DataSource (id)," +
        "    task_nominal_time VARCHAR(10)," +
        "    status INTEGER, " +
        "    current_attempt_count INTEGER DEFAULT 0, " +
        "    task_id VARCHAR(32), " +
        "    CONSTRAINT status_trail_pk PRIMARY KEY (id)" +
        ")"  ;

    public static final String DATASOURCE_SAMPLE_INSERT = "INSERT INTO "
            + "DATASOURCE(data_source, feed_type, begin_time, end_time) "
            + "VALUES ('mint' , 'hourly' , '123456789', '123456789', '123456789')";

    public static final String STATUSTRAIL_SAMPLE_INSERT = "INSERT INTO "
            + "STATUSTRAIL(data_source_id, task_nominal_time, current_attempt_count,"
            + " status) VALUES (1 , '123456789', 1, 'IN_PROGRESS')";
}
