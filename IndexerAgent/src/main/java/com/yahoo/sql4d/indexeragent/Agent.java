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
package com.yahoo.sql4d.indexeragent;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.yahoo.sql4d.indexeragent.actors.MainActor;
import com.yahoo.sql4d.indexeragent.meta.DBHandler;
import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static com.yahoo.sql4d.indexeragent.actors.MessageTypes.*;

/**
 * Agent starts a MainActor actor which orchestrates indexing tasks. Sends a "startTicking"
 message to MainActor actor as a signal to begin.
 * @author srikalyan
 */
public class Agent {
    private static final Logger log = LoggerFactory.getLogger(Agent.class);

    private final ActorSystem system;
    private final ActorRef master;
    public static Config config;
    private static DBHandler dbHandler;
    
    public Agent() {
        system = ActorSystem.create("IndexerAgentSystem");
        master = system.actorOf(Props.create(MainActor.class), "master");
    }
    
    public static void main(String[] args) {
        if (args.length != 1) {
            log.error("Need path to properties file to boot...");
            System.exit(1);
        }
        config = ConfigFactory.parseFile(new File(args[0])).resolve();
        dbHandler = new DBHandler();
        log.info("Indexer Agent configuration {}", config);
        final Agent agent = new Agent();
        agent.master.tell(BOOT_FROM_SQLS, null);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                try {
                    agent.master.tell(STOP_TICKING, null);
                    Thread.currentThread().join();
                } catch (InterruptedException ex) {
                    log.error("Exception while waiting for system shutdown {}", ex);
                }
            }
        });
    }
    
    public static DBHandler db() {
        return dbHandler;
    }
    
    public static int getConfigAsInt(String key, int defaultVal) {
        try {
            return config.getInt(key);
        } catch(Exception e) {
            return defaultVal;
        }
    }

    public static String getConfigAsStr(String key, String defaultVal) {
        try {
            return config.getString(key);
        } catch(Exception e) {
            return defaultVal;
        }
    }

    public static int getMaxTaskAttempts() {
        return getConfigAsInt("maxRetries", 3);
    }    
    public static int getMaxParallelTasks() {
        return getConfigAsInt("maxParallelTasks", 30);
    }
    public static int getSlaTime() {
        return getConfigAsInt("slaTime", 300);
    }
    public static int getTaskAttemptDelay() {
        return getConfigAsInt("taskAttemptDelay", 90);
    }
    public static int getRetryDelay() {
        return getConfigAsInt("retryDelay", 60);
    }
    public static String getDsqlsPath() {
        return getConfigAsStr("sqlsPath", System.getenv("user.home") + File.separator + "dsqls");
    }        
    
}
