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
package com.yahoo.sql4d.sql4ddriver;

import com.yahoo.sql4d.insert.InsertMeta;
import java.io.IOException;
import static java.lang.String.format;
import org.apache.http.HttpHost;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.entity.ContentType;
import org.json.JSONObject;

/**
 *
 * @author srikalyan
 */
public class OverlordAccessor extends DruidNodeAccessor {
    private final String overlordUrl = "http://%s:%d/druid/indexer/v1/task";
    private final String overlordHost;
    private int overlordPort = 8087;
    private static final int MAX_WAIT_TIME = 10000;// 10 secs
    
    public OverlordAccessor(String host, int port) {
        this.overlordHost = host;
        this.overlordPort = port;
    }
    
    /**
     * Task means an indexer task(goes straight to overlord).
     * @param meta 
     * @param wait 
     * @return  
     */
    public String fireTask(InsertMeta meta, boolean wait) {
        Response resp = null;
        String url = format(overlordUrl, overlordHost, overlordPort);
        try {
            Request req = Request.Post(url).bodyString(meta.toString(), ContentType.APPLICATION_JSON).connectTimeout(1000).socketTimeout(1000);
            if (PROXY_HOST != null) {
                req = req.viaProxy(new HttpHost(PROXY_HOST, PROXY_PORT));          
            }
            resp = req.execute();
            JSONObject respJson = new JSONObject(resp.returnContent().asString());
            if (wait) {
                if (waitForTask(respJson.getString("task"))) {
                    return "Task completed successfully , task Id " + respJson;
                }
                return "Task failed/still running, task Id " + respJson;
            } else {
                return "Task submitted , task Id " + respJson;
            }
        } catch (IOException ex) {
            return format("Http %s \n", ex);
        }
    }

    public boolean waitForTask(String taskId) {
        long startT = System.currentTimeMillis();
        long endT = System.currentTimeMillis();
        boolean finalStatus = false;
        String statusStr = "Task failed ..";
        OUTER:
        while (endT - startT < MAX_WAIT_TIME) {
            Response resp = null;        
            String url = format("%s/%s/status", format(overlordUrl, overlordHost, overlordPort), taskId);
            try {
                Request req = Request.Get(url).connectTimeout(1000).socketTimeout(1000);
                if (PROXY_HOST != null) {
                    req = req.viaProxy(new HttpHost(PROXY_HOST, PROXY_PORT));          
                }
                resp = req.execute();
                JSONObject respJson = new JSONObject(resp.returnContent().asString());
                JSONObject status = respJson.getJSONObject("status");
                endT = System.currentTimeMillis();
                if (null != status.getString("status")) {
                    switch (status.getString("status")) {
                        case "SUCCESS":
                            statusStr = "Task succeeded ..";
                            finalStatus = true;
                            break OUTER;
                        case "RUNNING":
                            continue;
                        default:
                            break OUTER;
                    }
                }
            }catch (IOException ex) {
                System.err.println(format("Http %s \n", ex));
            }
        }
        System.err.println(statusStr);
        return finalStatus;
    }

}
