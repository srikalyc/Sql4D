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
import org.apache.http.HttpHost;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base class for all druid types. 
 * TODO: Make the configuration malleable for pool.
 * @author srikalyan
 */
public class DruidNodeAccessor {
    private static final Logger logger = LoggerFactory.getLogger(DruidNodeAccessor.class);

    public static String PROXY_HOST;
    public static int PROXY_PORT;
    private PoolingHttpClientConnectionManager pool = null;
    private DefaultProxyRoutePlanner customRouterPlanner = null;
    
    public DruidNodeAccessor(String host, int port) {
        init();
        HttpHost targetHost = new HttpHost(host, port);
        pool.setMaxPerRoute(new HttpRoute(targetHost), 50);
    }
    
    private void init() {
        pool = new PoolingHttpClientConnectionManager();
        pool.setMaxTotal(50);
        pool.setDefaultMaxPerRoute(50);
        if (PROXY_HOST != null) {
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
            EntityUtils.consume(resp.getEntity());
        } catch (IOException ex) {
            //TODO: Could not consume response completely. This is serious because the client will not be returned back to pool.
            logger.error("cannot return client", ex);
        }
    }
    public void shutdown() {
        try {
            pool.close();
        } catch (Exception ex) {
            logger.error("connot shutdown client", ex);
        }
    }
    
    /**
     * Convenient method for POSTing json strings. It is the responsibility of the 
     * caller to call returnClient() to ensure clean state of the pool.
     * @param url
     * @param json
     * @return
     * @throws IOException 
     */
    public CloseableHttpResponse postJson(String url, String json) throws IOException {
        CloseableHttpClient req = getClient();
        CloseableHttpResponse resp = null;
        HttpPost post = new HttpPost(url);
        StringEntity input = new StringEntity(json, ContentType.APPLICATION_JSON);
        post.setEntity(input);
        resp = req.execute(post);
        return resp;
    }
    
    /**
     * Convenient method for GETing. It is the responsibility of the 
     * caller to call returnClient() to ensure clean state of the pool.
     * @param url
     * @return
     * @throws IOException 
     */
    public CloseableHttpResponse get(String url) throws IOException {
        CloseableHttpClient req = getClient();
        CloseableHttpResponse resp = null;
        HttpGet get = new HttpGet(url);
        resp = req.execute(get);
        return resp;
    }
}
