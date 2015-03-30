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
import java.io.File;
import java.util.Properties;

/**
 * Agent starts a MainActor actor which orchestrates indexing tasks. Sends a "startTicking"
 message to MainActor actor as a signal to begin.
 * @author srikalyan
 */
public class Agent {
    private static final String propsFileLocation = System.getProperty("user.home") + File.separator + ".dindexer";
    private static final Properties globalProperties = new Properties();//TODO: Load from $HOME/.dindexer
    private static final String SQLS_FOLDER_BASE = "sqlsFolderBase";

    private final ActorSystem system;
    private final ActorRef master;
    private static final Config config;
    
    static {
        //TODO: Properties loaded from .dindexer overrides the below.
        config = ConfigFactory.parseFile(new File(propsFileLocation)).resolve();
        System.out.println(config.getString("my.organization.project.name"));
        System.out.println(config.getString("my.organization.project.description"));
        globalProperties.setProperty(SQLS_FOLDER_BASE, System.getProperty("user.home") + File.separator + "dsqls");
    }

    public Agent() {
        system = ActorSystem.create("IndexerAgentSystem");
        master = system.actorOf(Props.create(MainActor.class), "master");
    }
    
    public static void main(String[] args) {
         Agent agent = new Agent();
         agent.master.tell("startTicking", null);
    }

}
