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

import com.yahoo.sql4d.indexeragent.meta.JobStatus;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import static com.yahoo.sql4d.indexeragent.Agent.*;
/**
 *
 * @author srikalyan
 */
@Entity
@Table(name = "StatusTrail")
public class StatusTrail implements Comparable<StatusTrail> {
    @Id
    @GeneratedValue
    private int id;
    private int dataSourceId;
    private long nominalTime;
    private String status;
    private int givenUp;
    private int attemptsDone;
    private String taskId;// This is the druid indexer taskId.
    
    public StatusTrail setId(int id) {
        this.id = id;
        return this;
    }

    public StatusTrail setDataSourceId(int dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    public StatusTrail setNominalTime(long nominalTime) {
        this.nominalTime = nominalTime;
        return this;
    }

    public StatusTrail setStatus(JobStatus status) {
        this.status = status.name();
        return this;
    }

    public StatusTrail setGivenUp(int givenUp) {
        this.givenUp = givenUp;
        return this;
    }
    
    public StatusTrail setAttemptsDone(int attemptsDone) {
        this.attemptsDone = attemptsDone;
        if (attemptsDone >= getMaxTaskAttempts()) {
            setGivenUp(1);
        }
        return this;
    }

    public StatusTrail setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    
    public int getId() {
        return id;
    }

    public int getDataSourceId() {
        return dataSourceId;
    }

    public long getNominalTime() {
        return nominalTime;
    }

    public String getStatus() {
        return status;
    }

    public int getGivenUp() {
        return givenUp;
    }

    public int getAttemptsDone() {
        return attemptsDone;
    }

    public String getTaskId() {
        return taskId;
    }
    
    public void updateFrom(StatusTrail st) {
        setDataSourceId(st.getDataSourceId());        
        setNominalTime(st.getNominalTime());        
        setStatus(JobStatus.valueOf(st.getStatus()));
        setGivenUp(st.getGivenUp());
        setAttemptsDone(st.getAttemptsDone());
        setTaskId(st.getTaskId());
    }
    
    @Override
    public String toString() {
        return String.format("%d %d %d %s %d %d %s", id, dataSourceId, nominalTime, status, givenUp, attemptsDone, taskId);
    }

    @Override
    public int compareTo(StatusTrail other) {
        if (getId() == other.getId()) {
            return 0;// We assume if id's are same then their nominal times are as well.
        }// This way if a table was being ingested into for a long time and a new table gets added
        // for with a requirement for historical data ingestion then it is given its fair share.
        return -((int)(getNominalTime() - other.getNominalTime()) + getId() - other.getId());
    }
}
