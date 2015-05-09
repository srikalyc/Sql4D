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
import com.yahoo.sql4d.indexeragent.meta.JobStatus;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author srikalyan
 */
@Entity
@Table(name = "DataSource")
public class DataSource {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private long startTime;
    private long spinFromTime;
    private long endTime;
    private String frequency;
    private String status;
    
    public DataSource setId(int id) {
        this.id = id;
        return this;
    }

    public DataSource setDataSource(String dataSource) {
        this.name = dataSource;
        return this;
    }

    public DataSource setStartTime(long startTime) {
        this.startTime = startTime;
        return this;
    }

    public DataSource setSpinFromTime(long spinFromTime) {
        this.spinFromTime = spinFromTime;
        return this;
    }

    public DataSource setEndTime(long endTime) {
        this.endTime = endTime;
        return this;
    }
    
    public DataSource setFrequency(JobFreq frequency) {
        this.frequency = frequency.name();
        return this;
    }
    
    public DataSource setStatus(JobStatus status) {
        this.status = status.name();
        return this;
    }

    public int getId() {
        return id;
    }

    public String getDataSource() {
        return name;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getSpinFromTime() {
        return spinFromTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format("%d %s %d %d %d %s %s", id, name, startTime, spinFromTime, endTime, frequency, status);
    }
        
}
