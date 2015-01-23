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

import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.pool.PoolStats;
import org.apache.http.util.EntityUtils;

/**
 * Base class for all druid types. 
 * TODO: Make the configuration malleable for pool.
 * @author srikalyan
 */
public class DruidNodeAccessor {
    private static String PROXY_HOST;
    private static int PROXY_PORT;
    private static final PoolingHttpClientConnectionManager pool = new PoolingHttpClientConnectionManager();
    private static DefaultProxyRoutePlanner customRouterPlanner = null;
    
    public static Map<String, Integer> getConnectionPoolStats() {
        Map<String, Integer> stats = new HashMap<>();
        PoolStats poolStats = pool.getTotalStats();
        stats.put("availableConnections", poolStats.getAvailable());
        stats.put("maxConnections", poolStats.getMax());
        stats.put("leasedConnections", poolStats.getLeased());
        stats.put("pendingConnections", poolStats.getPending());
        stats.put("defaultMaxPerRoute", pool.getDefaultMaxPerRoute());
        return stats;
    }
    
    /**
     * For each route we explicitly set max Connections.
     * @param host
     * @param port
     * @param maxConnsPerRout 
     */
    public DruidNodeAccessor(String host, int port, int maxConnsPerRout) {
        proxyInit();
        HttpHost targetHost = new HttpHost(host, port);
        pool.setMaxPerRoute(new HttpRoute(targetHost), maxConnsPerRout);
    }

    public static void setProxy(String h, int p) {
        PROXY_HOST = h;
        PROXY_PORT = p;
        proxyInit();
    }
    
    public static void setMaxConnections(int max) {
        pool.setMaxTotal(max);
    }

    /**
     * To ensure customRouterPlanner is initialized only once.
     */
    private static synchronized void proxyInit() {
        if (PROXY_HOST != null && customRouterPlanner == null) {
            HttpHost proxy = new HttpHost(PROXY_HOST, PROXY_PORT);
            customRouterPlanner = new DefaultProxyRoutePlanner(proxy);
        }
    }
    
    public CloseableHttpClient getClient() {
        HttpClientBuilder builder = HttpClients.custom().setConnectionManager(pool);
        return (customRouterPlanner != null)?builder.setRoutePlanner(customRouterPlanner).build():builder.build();
    }
    
    /**
     * This ensures the response body is completely consumed and hence the HttpClient 
     * object will be return back to the pool successfully.
     * @param resp 
     */
    public void returnClient(CloseableHttpResponse resp) {
        try { 
            if (resp != null) {
                EntityUtils.consume(resp.getEntity());
            }
        } catch (IOException ex) {
            //TODO: Could not consume response completely. This is serious because the client will not be returned back to pool.
            Logger.getLogger(DruidNodeAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void shutdown() {
        try {
            pool.close();
        } catch (Exception ex) {
            Logger.getLogger(DruidNodeAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Convenient method for POSTing json strings. It is the responsibility of the 
     * caller to call returnClient() to ensure clean state of the pool.
     * @param url
     * @param json
     * @param reqHeaders
     * @return
     * @throws IOException 
     */
    public CloseableHttpResponse postJson(String url, String json, Map<String, String> reqHeaders) throws IOException {
        CloseableHttpClient req = getClient();
        CloseableHttpResponse resp = null;
        HttpPost post = new HttpPost(url);
        addHeaders(post, reqHeaders);
        post.setHeader(json, url);
        StringEntity input = new StringEntity(json, ContentType.APPLICATION_JSON);
        post.setEntity(input);
        resp = req.execute(post);
        return resp;
    }

    /**
     * Convenient method for GETing. It is the responsibility of the 
     * caller to call returnClient() to ensure clean state of the pool.
     * @param url
     * @param reqHeaders
     * @return
     * @throws IOException 
     */
    public CloseableHttpResponse get(String url, Map<String, String> reqHeaders) throws IOException {
        CloseableHttpClient req = getClient();
        CloseableHttpResponse resp = null;
        HttpGet get = new HttpGet(url);
        addHeaders(get, reqHeaders);
        resp = req.execute(get);
        return resp;
    }
    
    private void addHeaders(HttpRequestBase req, Map<String, String> reqHeaders) {
        if (reqHeaders == null)
            return;
        for (String key:reqHeaders.keySet()) {
            req.setHeader(key, reqHeaders.get(key));
        }
    }
}
