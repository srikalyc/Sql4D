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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private void generateWork() {
//         List<DataSource> tables = db().getAllDataSources();
//         for (DataSource ds:tables) {
//             
//         }
    }

    private void executeWork() {
        
    }
}
