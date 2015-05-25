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

import akka.actor.ActorRef;
import akka.actor.Cancellable;
import akka.actor.Props;
import akka.actor.Scheduler;
import akka.actor.UntypedActor;
import akka.routing.RoundRobinPool;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scala.concurrent.duration.Duration;
import static com.yahoo.sql4d.indexeragent.Agent.*;
import java.io.File;
import java.io.FilenameFilter;
import static com.yahoo.sql4d.indexeragent.actors.MessageTypes.*;
import com.yahoo.sql4d.indexeragent.sql.SqlFileSniffer;
import com.yahoo.sql4d.indexeragent.util.FileSniffer;
import java.nio.file.Paths;
import scala.concurrent.duration.FiniteDuration;

/**
 * Upon receiving "startSignal" the MainActor actor starts a scheduler and schedules
 tasks(if any) to Workers by sending Work messages.
 * @author srikalyan
 */
public class MainActor extends UntypedActor {
    
    private static final Logger log = LoggerFactory.getLogger(MainActor.class);
    private static final int INITIAL_WORK_GENERATE_DELAY = 1;// In secs
    private static final int INITIAL_WORK_ASSIGNER_DELAY = 2;// In secs
    private static final int INITIAL_WORK_TRACKER_DELAY = 3;// In secs
    private static final int WORK_GENERATE_INTERVAL = 15;// In secs
    private static final int WORK_ASSIGN_INTERVAL = 15;// In secs
    private static final int WORK_TRACKER_INTERVAL = 15;// In secs
    private final int MAX_CONCURRENCY;// # of workers.

    private static ActorRef workerRouter;
    
    private final Scheduler scheduler;
    // The following 3 are crons.
    private Cancellable workInstanceGenerator;
    private Cancellable workAssigner;
    private Cancellable workProgressTracker;
    
    // The following is an observer(observes changes to druid sql files)
    private FileSniffer sqlSniffer;//Allows to dynamically add/remove/modify more tables by adding sql files without bringing down Agent.

    public MainActor() {
        MAX_CONCURRENCY = getMaxParallelTasks();
        workerRouter = getContext().actorOf(Props.create(WorkerActor.class).
                withRouter(new RoundRobinPool(MAX_CONCURRENCY)), "workerRouter");    
        scheduler = getContext().system().scheduler();
    }
    

    @Override
    public void postStop() {
    }

    @Override
    public void onReceive(Object message) throws Exception {
        if (!(message instanceof MessageTypes)) {
            unhandled(message);
            return;
        }
        switch((MessageTypes)message) {
            case BOOT_FROM_SQLS:
                log.info("Booting off template sqls from {}", getDsqlsPath());
                sqlSniffer = new SqlFileSniffer(getDsqlsPath());
                sqlSniffer.startSniffing();
                bootFromDsqls(getDsqlsPath());
                getSelf().tell(START_TICKING, getSelf());
                break;
            case START_TICKING:
                log.info("Started ticking ...");
                workInstanceGenerator = schedule(INITIAL_WORK_GENERATE_DELAY, WORK_GENERATE_INTERVAL, GENERATE_WORK);
                workAssigner = schedule(INITIAL_WORK_ASSIGNER_DELAY, WORK_ASSIGN_INTERVAL, EXECUTE_WORK);
                workProgressTracker = schedule(INITIAL_WORK_ASSIGNER_DELAY, WORK_TRACKER_INTERVAL, TRACK_WORK);
                break;
            case GENERATE_WORK:
                workerRouter.tell(GENERATE_WORK, getSelf());
                break;
            case EXECUTE_WORK:
                workerRouter.tell(EXECUTE_WORK, getSelf());
                break;
            case TRACK_WORK:
                workerRouter.tell(TRACK_WORK, getSelf());
                break;
            case STOP_TICKING:
                log.info("Stopped ticking ...");
                workInstanceGenerator.cancel();
                workAssigner.cancel();
                workProgressTracker.cancel();
                sqlSniffer.stopSniffing();
                break;  
            default:
                unhandled(message);
        }
    }
    /**
     * Schedules messages ever interval seconds.
     * @param initialDelay
     * @param interval
     * @param message
     * @return 
     */
    private Cancellable schedule(int initialDelay, int interval, MessageTypes message) {
        return scheduler.schedule(secs(initialDelay), secs(interval),
                            getSelf(), message, getContext().dispatcher(), null);
    }
    /**
     * Read off a bunch of sql files expecting insert statements within them.
     */
    private void bootFromDsqls(String path) {
        File[] files = new File(path).listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".sql");
            }
        });
        
        for (File file:files) {//In this context only add/update is cared for.
            sqlSniffer.onCreate(Paths.get(file.toURI()));
        }        
    }
    
    private FiniteDuration secs(int sec) {
        return Duration.create(sec, TimeUnit.SECONDS);        
    }
}
