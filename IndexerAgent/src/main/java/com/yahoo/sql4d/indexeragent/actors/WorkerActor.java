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

/**
 *
 * @author srikalyan
 */
public class WorkerActor extends UntypedActor {
    private static final Logger log = LoggerFactory.getLogger(WorkerActor.class);
    public WorkerActor() {
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
                log.info("{} need to generate some work {}",hashCode(), message);
                break;
            case EXECUTE_WORK:
                executeWork();
                log.debug("{} need to execute some work {}",hashCode(), message);
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
        for (DataSource ds:tables) {
            if (JobStatus.valueOf(ds.getStatus()) == JobStatus.done) {                
                continue;
            }
            long currentSpinOffTime = ds.getSpinFromTime();            
            //If startTime = spinOffTime = 00 hr. If now - getTaskAttemptDelay() = 03 hr, and job is hourly job then
            // The following will materialize 00, 01, 02 , 03 adds them to StatusTrail, updates the spinnOff Time to 03.
            // NOTE: All the above times should be within endTime.
            while (now - getTaskAttemptDelay() > currentSpinOffTime && currentSpinOffTime <= ds.getEndTime()) {                                
                StatusTrail st = new StatusTrail().setNominalTime(currentSpinOffTime).
                        setAttemptsDone(0).
                        setDataSourceId(ds.getId()).
                        setGivenUp(0).
                        setStatus(JobStatus.not_done).
                        setFullPath(materializeTemplate(ds.getTemplatePath(), currentSpinOffTime));
                db().addOrUpdateStatusTrail(st);
                currentSpinOffTime += JobFreq.valueOf(ds.getFrequency()).inMillis();
                log.info("Generated work : {}", st);
            }
            if (currentSpinOffTime > ds.getEndTime()) {
                ds.setStatus(JobStatus.done);
            }
            //Update the spinOff Time to point to time from which next set of materialization will happen.
            db().addOrUpdateDataSource(ds.setSpinFromTime(currentSpinOffTime));
        }
    }

    /**
     * Run the jobs which are eligible to run.
     */
    private void executeWork() {
        
    }
    
    public String materializeTemplate(String template, long timestamp) {
        DateTime dt = new DateTime(timestamp);
        return template.replaceAll("\\{YEAR\\}", year(dt)).
                replaceAll("\\{YEAR\\}", year(dt)).
                replaceAll("\\{MONTH\\}", month(dt)).
                replaceAll("\\{DAY\\}", day(dt)).
                replaceAll("\\{HOUR\\}", hour(dt)).
                replaceAll("\\{MIN\\}", mins(dt));
    }    
}
