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
    public OverlordAccessor(String host, int port) {
        this.overlordHost = host;
        this.overlordPort = port;
    }
    
    /**
     * Task means an indexer task(goes straight to overlord).
     * @param meta 
     * @return  
     */
    public String fireTask(InsertMeta meta) {
        Response resp = null;
        String url = format(overlordUrl, overlordHost, overlordPort);
        try {
            Request req = Request.Post(url).bodyString(meta.toString(), ContentType.APPLICATION_JSON).connectTimeout(1000).socketTimeout(1000);
            if (PROXY_HOST != null) {
                req = req.viaProxy(new HttpHost(PROXY_HOST, PROXY_PORT));          
            }
            resp = req.execute();
            JSONObject respJson = new JSONObject(resp.returnContent().asString());
            return "Data inserted successfully , task Id " + respJson;
        } catch (IOException ex) {
            return format("Http %s \n", ex);
        }
    }

    public String waitForTask(String taskId) {
        Response resp = null;        
        String url = format("%s/%s/status", format(overlordUrl, overlordHost, overlordPort), taskId);
        try {
            Request req = Request.Get(url).connectTimeout(1000).socketTimeout(1000);
            if (PROXY_HOST != null) {
                req = req.viaProxy(new HttpHost(PROXY_HOST, PROXY_PORT));          
            }
            resp = req.execute();
            JSONObject respJson = new JSONObject(resp.returnContent().asString());
            return "Data inserted successfully , task Id " + respJson;
        } catch (IOException ex) {
            return format("Http %s \n", ex);
        }
    }

}
