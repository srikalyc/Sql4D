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

import com.yahoo.sql4d.CrudStatementMeta;
import java.io.IOException;
import static java.lang.String.format;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Submit tasks to druid. Both Synchronous(with timeout) and asynchronous are supported.
 * @author srikalyan
 */
public class OverlordAccessor extends DruidNodeAccessor {
    private final String overlordUrl = "http://%s:%d/druid/indexer/v1/task";
    private final String overlordHost;
    private int overlordPort = 8087;
    private static final int TWO_HOURS_IN_MILLIS = 7200000;// 7200 secs
    
    public OverlordAccessor(String host, int port, int maxConns) {
        super(host, port, maxConns);
        this.overlordHost = host;
        this.overlordPort = port;
    }
    
    /**
     * Task means an indexer task(goes straight to overlord).
     * @param meta 
     * @param reqHeaders 
     * @param wait 
     * @return  
     */
    public String fireTask(CrudStatementMeta meta, Map<String, String> reqHeaders, boolean wait) {
        CloseableHttpResponse resp = null;
        String url = format(overlordUrl, overlordHost, overlordPort);
        try {
            resp = postJson(url, meta.toString(), reqHeaders);
            if (resp.getStatusLine().getStatusCode() == 500) {
                return "Task failed with server error, " + IOUtils.toString(resp.getEntity().getContent());
            }
            //TODO: Check for nulls in the following.
            String strResp = IOUtils.toString(resp.getEntity().getContent());
            JSONObject respJson = new JSONObject(strResp);
            if (wait) {
                if (waitForTask(respJson.getString("task"), reqHeaders, TWO_HOURS_IN_MILLIS)) {
                    return "Task completed successfully , task Id " + respJson;
                }
                return "Task failed/still running, task Id " + respJson;
            } else {
                return respJson.getString("task");
            }
        } catch (IOException | IllegalStateException | JSONException ex) {
            ex.printStackTrace();
            return format("Http %s \n", ex);
        } finally {
            returnClient(resp);
        }
    }

    /**
     * 
     * @param taskId
     * @param reqHeaders
     * @param maxWaitTime
     * @return
     */
    public boolean waitForTask(String taskId, Map<String, String> reqHeaders, int maxWaitTime) {
        long startT = System.currentTimeMillis();
        long endT = System.currentTimeMillis();
        boolean finalStatus = false;
        String statusStr = "Task failed ..";
        OUTER:
        while (endT - startT < maxWaitTime) {
            CloseableHttpResponse resp = null;
            String url = format("%s/%s/status", format(overlordUrl, overlordHost, overlordPort), taskId);
            try {
                resp = get(url, reqHeaders);
                //TODO: Check for nulls in the following.
                JSONObject respJson = new JSONObject(IOUtils.toString(resp.getEntity().getContent()));
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
            } catch (IOException ex) {
                System.err.println(format("Http %s \n", ex));
            } finally {
                returnClient(resp);
            }
        }
        System.err.println(statusStr);
        return finalStatus;
    }

    /**
     * Poll for task's status for tasks fired with 0 wait time.
     * @param taskId
     * @param reqHeaders
     * @return 
     */
    public TaskStatus pollTaskStatus(String taskId, Map<String, String> reqHeaders) {
        CloseableHttpResponse resp = null;
        String url = format("%s/%s/status", format(overlordUrl, overlordHost, overlordPort), taskId);
        try {
            resp = get(url, reqHeaders);
            //TODO: Check for nulls in the following.
            JSONObject respJson = new JSONObject(IOUtils.toString(resp.getEntity().getContent()));
            JSONObject status = respJson.optJSONObject("status");
            if (status != null && null != status.getString("status")) {
                switch (status.getString("status")) {
                    case "SUCCESS":
                        return TaskStatus.SUCCESS;
                    case "RUNNING":
                        return TaskStatus.RUNNING;
                    default:
                        return TaskStatus.FAILED;
                }
            }
        } catch (IOException ex) {
            System.err.println(format("Http %s \n", ex));
        } finally {
            returnClient(resp);
        }// Happens when result looks like {"task":"null"} which has no status(because such a task itself does not exist)
        return TaskStatus.UNKNOWN;
    }
    
}
