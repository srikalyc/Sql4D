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
package com.yahoo.sql4d.indexeragent.util;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardWatchEventKinds.*;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A generic file change observer. Looks at the file extension first and then the event.
 * @author srikalyan
 */
public abstract class FileSniffer {
    private static final Logger log = LoggerFactory.getLogger(FileSniffer.class);
    private final Path sniffPath;
    private final String fileExtension;
    private WatchService watcher;
    private final AtomicBoolean stopSniff = new AtomicBoolean(false);
    private Thread snifferThread;
    
    public FileSniffer(String pathToSniff, String fileExtension) {
        sniffPath = Paths.get(pathToSniff);
        this.fileExtension = fileExtension;
        try {
           watcher = sniffPath.getFileSystem().newWatchService();
           sniffPath.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
        } catch (IOException e) {
            log.error("Error: {}", e);
        }
    }
    
    public void startSniffing() {
        snifferThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!stopSniff.get()) {            
                    try {
                        WatchKey watckKey = watcher.take();// Blocks here                
                        for (WatchEvent<?> event : watckKey.pollEvents()) {
                            log.info("Event Kind : {}", event.kind());
                            if (event.kind() == OVERFLOW) {// If event is lost/discarded.
                                continue;
                            }
                            log.info("Event: {}", event.context().toString());
                            if (event.context().toString().endsWith(fileExtension) && (event.context() instanceof Path)) {
                                Path fullPath = Paths.get(sniffPath.toString(), ((Path)event.context()).getFileName().toString());
                                if (event.kind() == ENTRY_CREATE) {
                                    log.info("New file found: {}", event.context().toString());
                                    onCreate(fullPath);
                                }
                                if (event.kind() == ENTRY_DELETE) {
                                    log.info("File {} deleted.", event.context().toString());
                                    onDelete(fullPath);
                                }
                                if (event.kind() == ENTRY_MODIFY) {
                                    log.info("File {} modified.", event.context().toString());
                                    onModify(fullPath);
                                }
                            }
                        }
                        if (!watckKey.reset()) {
                            log.error("Watch key has become invalid !!");
                            stopSniff.set(true);
                        }
                    } catch (InterruptedException ex) {
                        log.error("Exception while sniffing {}", ex);
                        stopSniff.set(true);
                    }
                }     
            }
        });
        snifferThread.start();
    }
    
    public void stopSniffing() {
        stopSniff.set(true);
    }
    
    public abstract void onCreate(Path path);
    public abstract void onDelete(Path path);
    public abstract void onModify(Path path);
}
