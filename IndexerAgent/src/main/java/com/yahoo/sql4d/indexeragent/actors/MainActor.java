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
import akka.actor.UntypedActor;
import akka.routing.RoundRobinPool;
import com.yahoo.sql4d.indexeragent.work.Work;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scala.concurrent.duration.Duration;

/**
 * Upon receiving "startSignal" the MainActor actor starts a scheduler and schedules
 tasks(if any) to Workers by sending Work messages.
 * @author srikalyan
 */
public class MainActor extends UntypedActor {

    private static final Logger log = LoggerFactory.getLogger(MainActor.class);
    private static final int INITIAL_DELAY = 1;// In secs
    private static final int CRON_INTERVAL = 10;// In secs
    private static final int MAX_CONCURRENCY = 10;// # of workers.

    private static ActorRef workerRouter;
    
    private Cancellable tick;

    public MainActor() {
        workerRouter = getContext().actorOf(Props.create(WorkerActor.class).
                withRouter(new RoundRobinPool(MAX_CONCURRENCY)),"workerRouter");    
    }
    

    @Override
    public void postStop() {
    }

    @Override
    public void onReceive(Object message) throws Exception {
        if (message.equals("startTicking")) {
            log.info("Started ticking ...");
            tick = getContext().system().scheduler().schedule(
                        Duration.create(INITIAL_DELAY, TimeUnit.SECONDS),
                        Duration.create(CRON_INTERVAL, TimeUnit.SECONDS),
                        getSelf(), "tick", getContext().dispatcher(), null);
        } else if (message.equals("tick")) {
            workerRouter.tell(new Work(), getSelf());
        } else if (message.equals("stop")) {
            log.info("Stopped ticking ...");
            tick.cancel();
        } else {
            unhandled(message);
        }
    }

}
