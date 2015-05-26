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
package com.yahoo.sql4d.indexeragent.actors;

import akka.actor.UntypedActor;
import static com.yahoo.sql4d.indexeragent.Agent.*;
import com.yahoo.sql4d.indexeragent.meta.JobFreq;
import com.yahoo.sql4d.indexeragent.meta.JobStatus;
import com.yahoo.sql4d.indexeragent.meta.beans.DataSource;
import com.yahoo.sql4d.indexeragent.meta.beans.StatusTrail;
import java.util.List;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static com.yahoo.sql4d.indexeragent.meta.Utils.*;
import static com.yahoo.sql4d.indexeragent.DruidMeta.*;
import com.yahoo.sql4d.indexeragent.util.UniqueOnlyQueue;
import com.yahoo.sql4d.sql4ddriver.DDataSource;
import com.yahoo.sql4d.sql4ddriver.Joiner4All;
import com.yahoo.sql4d.sql4ddriver.Mapper4All;
import java.util.ArrayList;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import scala.util.Either;

/**
 * Generates work, executes and tracks them upon receiving appropriate instructions from master.
 * @author srikalyan
 */
public class WorkerActor extends UntypedActor {
    private static final Logger log = LoggerFactory.getLogger(WorkerActor.class);
    private static final DateTimeFormatter isoFormat = ISODateTimeFormat.dateTime().withZoneUTC();
    private static final UniqueOnlyQueue<StatusTrail> newWorkQueue = new UniqueOnlyQueue<>();
    private static final UniqueOnlyQueue<StatusTrail> inProgressWorkQueue = new UniqueOnlyQueue<>();
    private final DDataSource druidDriver;
    
    public WorkerActor() {
        druidDriver = new DDataSource(getBrokerHost(), getBrokerPort(), 
                getCoordinatorHost(), getCoordinatorPort(), 
                getOverlordHost(), getOverlordPort());
    }

    @Override
    public void onReceive(Object message) throws Exception {        
        if (!(message instanceof MessageTypes)) {
            unhandled(message);
            return;
        }
        switch((MessageTypes)message) {
            case GENERATE_WORK:
                generateWork();
                break;
            case EXECUTE_WORK:
                executeWork();
                break;
            case TRACK_WORK:
                checkInProgressWork();
                break;
            default:
                throw new UnsupportedOperationException("Worker received unknown message ." + message);                    
        }
    }

    /**
     * Generate a bunch of jobs(StatusTrail ready to be run in near future).
     */
    private void generateWork() {
        List<DataSource> tables = db().getAllDataSources();
        long now = System.currentTimeMillis();
        List<List<StatusTrail>> stPerDataSource = new ArrayList<>();
        for (DataSource ds:tables) {
            if (ds.getStatus() == null) {
                log.error("DataSource {}'s status is null", ds);
                continue;
            }
            if (JobStatus.valueOf(ds.getStatus()) == JobStatus.done) {                
                continue;
            }
            long currentSpinOffTime = ds.getSpinFromTime();            
            //If startTime = spinOffTime = 00 hr. If now = getTaskAttemptDelay() + 03 hr, and job is hourly job then
            // The following will materialize 00, 01, 02 , 03 adds them to StatusTrail, updates the spinnOff Time to 03.
            // NOTE: All the above times should be within endTime.
            while (now > (currentSpinOffTime + getTaskAttemptDelayInMillis()) && currentSpinOffTime < ds.getEndTime()) {                                
                StatusTrail st = new StatusTrail().setNominalTime(currentSpinOffTime).
                        setAttemptsDone(0).
                        setDataSourceId(ds.getId()).
                        setGivenUp(0).
                        setStatus(JobStatus.not_done);
                db().addStatusTrail(st);
                currentSpinOffTime += JobFreq.valueOf(ds.getFrequency()).inMillis();
                log.info("Generated work : {}", st);
            }
            if (currentSpinOffTime > ds.getEndTime()) {
                ds.setStatus(JobStatus.done);
            }
            stPerDataSource.add(db().getIncompleteTasks(ds));
            //Update the spinOff Time to point to time from which next set of materialization will happen.
            db().updateDataSource(ds.setSpinFromTime(currentSpinOffTime));
        }
        newWorkQueue.mergeKLists(stPerDataSource);
    }

    /**
     * Run the jobs which are eligible to run.
     */
    private void executeWork() {
        StatusTrail st = null;        
        if ((st = newWorkQueue.removeFirst()) != null) {
            log.info("New task {}", st);
            DataSource ds = db().getDataSource(st.getDataSourceId());//TODO: Cache the DataSource table.
            String frozenSql = materializeTemplate(ds.getTemplateSql(), st.getNominalTime(), st.getNominalTime(), st.getNominalTime() + JobFreq.valueOf(ds.getFrequency()).inMillis());
            log.info("Sql is {}", frozenSql);
            Either<String, Either<Joiner4All, Mapper4All>> result = druidDriver.query(frozenSql, null, null, false, "sql", true);
            if (result.isLeft()) {
                String taskId = result.left().get();// Because we forced async mode we will get back taskId.
                log.info("Submitted task {} to overlord ", taskId);
                st.setTaskId(taskId);
                st.setStatus(JobStatus.in_progress);
                db().updateStatusTrail(st);
                // Quite possible st may exist in Q- when an item is removed and executed
                // during which time if work generator generates the same st and 
                // updates Q because it still found the ST as not_done.
                if (newWorkQueue.contains(st)) {
                    newWorkQueue.remove(st);
                    log.warn("newWorkQueue had one more entry for st {} which was just set to in_progress", st);
                }                
            } else {// Something wrong. Insert always returns left.
                log.error("Got weird result (expected to run insert) {}", result.right().get());
            }
        }
    }
    
    /**
     * Run the jobs which are eligible to run.
     */
    private void checkInProgressWork() {
        inProgressWorkQueue.addAll(db().getAllInprogressTasks());
        StatusTrail st = null;        
        while ((st = inProgressWorkQueue.removeFirst()) != null) {
            if (st.getTaskId() == null) {
                 log.info("Found task with null taskId {}.", st);
                 st.setStatus(JobStatus.not_done).setAttemptsDone(0).setGivenUp(0);
                 db().updateStatusTrail(st);
                 log.info("Marked the status as not done to ensure it is resubmitted {}", st);
                 continue;
            }
            switch(druidDriver.pollIndexerTaskStatus(st.getTaskId())) {
                case SUCCESS:
                    newWorkQueue.remove(st);// Make sure.
                    st.setStatus(JobStatus.done);
                    st.setAttemptsDone(st.getAttemptsDone() + 1);// This will also set givenUp.
                    db().updateStatusTrail(st);
                    log.info("Task {} succeeded.", st);                    
                    break;
                case FAILED:
                    newWorkQueue.remove(st);// Make sure.
                    st.setStatus(JobStatus.not_done);
                    st.setAttemptsDone(st.getAttemptsDone() + 1);// This will also set givenUp.
                    db().updateStatusTrail(st);
                    log.info("Task {} failed.", st);
                    break;
                case RUNNING:
                    log.info("Task {} in progress.", st);
                    break;
                case UNKNOWN:
                    log.info("Task {} status unknown.", st);
                    break;
            }            
        }
    }

    
    private String materializeTemplate(String template, long timestamp, long start, long end) {
        DateTime dt = new DateTime(timestamp, DateTimeZone.UTC);
        return template.replaceAll("\\{YEAR\\}", year(dt)).
                replaceAll("\\{YEAR\\}", year(dt)).
                replaceAll("\\{MONTH\\}", month(dt)).
                replaceAll("\\{DAY\\}", day(dt)).
                replaceAll("\\{HOUR\\}", hour(dt)).
                replaceAll("\\{MIN\\}", mins(dt)).
                replaceAll(":startTime", isoFormat.print(start)).
                replaceAll(":endTime", isoFormat.print(end));
    }    
}
