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

import akka.actor.Cancellable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author srikalyan
 */
public abstract class Throttler implements Cancellable, Runnable {

    private static final Logger log = LoggerFactory.getLogger(Throttler.class);
    private final int initialDelay;
    private final int msgsPerSecond;
    private final int maxMessagesAnyTime;

    private final AtomicBoolean cancel = new AtomicBoolean(false);
    private final Thread selfThread;

    public Throttler(int initialDelay, int msgsPerSecond, int maxMessagesAnyTime) {
        this.initialDelay = initialDelay;
        this.msgsPerSecond = msgsPerSecond;
        this.maxMessagesAnyTime = maxMessagesAnyTime;
        this.selfThread = new Thread(this);
    }

    public Cancellable startThrottling() {
        selfThread.start();
        return this;
    }

    @Override
    public boolean cancel() {
        cancel.set(true);
        return cancel.get();
    }

    @Override
    public boolean isCancelled() {
        return cancel.get();
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(initialDelay);
        } catch (InterruptedException ex) {
            log.warn("Throttler bootstrap interrupted ! {}", ex);
        }
        while (!isCancelled()) {
            try {
                int inProgressCount = getInProgressActionCount();
                log.info("Current in progress {}, msgsPerSecond {}, maxMessagesAnyTime {}, ", inProgressCount, msgsPerSecond, maxMessagesAnyTime);
                if (inProgressCount >= maxMessagesAnyTime) {
                    TimeUnit.SECONDS.sleep(1);
                } else {
                    int p = (maxMessagesAnyTime - inProgressCount);
                    if (p <= msgsPerSecond) {
                        log.debug("Running action p={} times", p);
                        runActionXTimes(p);
                    } else {
                        int q = p; // Lets say p = 11 and msgsPerSecond = 10
                        while (q > 0) { // q = 11
                            if (q > msgsPerSecond) { // All but last condition succeeds here.
                                log.debug("Running action msgsPerSecond={} times", msgsPerSecond);
                                runActionXTimes(msgsPerSecond);
                            } else { // This occurs the last time i.e when q=1
                                log.debug("Running action q={} times", q);
                                runActionXTimes(q);//hit overlord q times                                
                            }
                            TimeUnit.SECONDS.sleep(1);
                            q = q - msgsPerSecond;
                        }
                    }
                }
            } catch (InterruptedException ex) {
                log.warn("Throttler interrupted ! {}", ex);
            }
        }
    }

    private void runActionXTimes(int n) {
        for (int i = 0;i < n;i++) {
            runAction();
        }
    }
    
    public abstract int getInProgressActionCount();
    public abstract void runAction();
    
}
