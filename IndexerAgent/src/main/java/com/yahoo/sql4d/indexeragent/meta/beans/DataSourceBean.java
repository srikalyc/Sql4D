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

import com.yahoo.sql4d.indexeragent.meta.JobFreq;

/**
 *
 * @author srikalyan
 */
public class DataSourceBean {
    private int id;
    private String data_source;
    private JobFreq feed_type;
    private String begin_time;
    private String current_run_time;
    private String end_time;

    private DataSourceBean() {
    }

    public DataSourceBean create() {
        return new DataSourceBean();
    }

    public DataSourceBean withId(int id) {
        this.id = id;
        return this;
    }

    public DataSourceBean withData_source(String data_source) {
        this.data_source = data_source;
        return this;
    }

    public DataSourceBean withFeed_type(JobFreq feed_type) {
        this.feed_type = feed_type;
        return this;
    }
    
    public DataSourceBean withBegin_time(String begin_time) {
        this.begin_time = begin_time;
        return this;
    }

    public DataSourceBean withCurrent_run_time(String current_run_time) {
        this.current_run_time = current_run_time;
        return this;
    }

    public DataSourceBean withEnd_time(String end_time) {
        this.end_time = end_time;
        return this;
    }
    
    public int getId() {
        return id;
    }

    public String getData_source() {
        return data_source;
    }

    public JobFreq getFeed_type() {
        return feed_type;
    }

    public String getBegin_time() {
        return begin_time;
    }

    public String getCurrent_run_time() {
        return current_run_time;
    }

    public String getEnd_time() {
        return end_time;
    }

}
