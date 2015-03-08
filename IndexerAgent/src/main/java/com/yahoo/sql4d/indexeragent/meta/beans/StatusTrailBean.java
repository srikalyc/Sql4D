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
package com.yahoo.sql4d.indexeragent.meta.beans;

/**
 *
 * @author srikalyan
 */
public class StatusTrailBean {
    private int id;
    private int data_source_id;
    private String task_nominal_time;
    private String status;
    private int current_attempt_count;
    private String task_id;

    private StatusTrailBean() {
    }

    public StatusTrailBean create() {
        return new StatusTrailBean();
    }

    public StatusTrailBean withId(int id) {
        this.id = id;
        return this;
    }

    public StatusTrailBean withData_source_id(int data_source_id) {
        this.data_source_id = data_source_id;
        return this;
    }

    public StatusTrailBean withFeed_type(String feed_type) {
        this.task_nominal_time = feed_type;
        return this;
    }
    
    public StatusTrailBean withBegin_time(String begin_time) {
        this.status = begin_time;
        return this;
    }

    public StatusTrailBean withCurrent_run_time(int current_attempt_count) {
        this.current_attempt_count = current_attempt_count;
        return this;
    }

    public StatusTrailBean withEnd_time(String end_time) {
        this.task_id = end_time;
        return this;
    }
    
    public int getId() {
        return id;
    }

    public int getData_source() {
        return data_source_id;
    }

    public String getTask_nominal_time() {
        return task_nominal_time;
    }

    public String getStatus() {
        return status;
    }

    public int getCurrent_attempt_count() {
        return current_attempt_count;
    }

    public String getTask_id() {
        return task_id;
    }

}
