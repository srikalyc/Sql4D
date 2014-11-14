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

import com.yahoo.sql4d.query.nodes.Interval;
import java.io.IOException;
import static java.lang.String.format;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.entity.ContentType;
import org.json.JSONArray;
import org.json.JSONException;
import scala.Either;
import scala.Left;
import scala.Right;

/**
 *
 * @author srikalyan
 */
public class BrokerAccessor extends DruidNodeAccessor {
    private final String brokerHost;
    private int brokerPort = 4080;
    private final String brokerUrl = "http://%s:%d/druid/v2/?pretty";
    public BrokerAccessor(String host, int port) {
        this.brokerHost = host;
        this.brokerPort = port;
    }
    
    /**
     * For firing simple queries(i.e non join queries).
     *
     * @param jsonQuery
     * @param requiresMapping
     * @return
     */
    public Either<String, Either<Mapper4All, JSONArray>> fireQuery(String jsonQuery, boolean requiresMapping) {
        Response resp = null;
        String respStr;
        String url = format(brokerUrl, brokerHost, brokerPort);
        try {
            Request req = Request.Post(url).bodyString(jsonQuery, ContentType.APPLICATION_JSON).connectTimeout(1000).socketTimeout(1000);
            if (PROXY_HOST != null) {
                req = req.viaProxy(new HttpHost(PROXY_HOST, PROXY_PORT));          
            }
            resp = req.execute();
            respStr = resp.returnContent().asString();
        } catch (IOException ex) {
            return new Left<>(format("Http %s \n", resp));        
        }
        JSONArray possibleResArray = null;
        try {
            possibleResArray = new JSONArray(respStr);
        } catch (JSONException je) {
            return new Left<>(format("Recieved data %s not in json format. \n", respStr));
        }
        if (requiresMapping) {
            return new Right<String, Either<Mapper4All, JSONArray>>(new Left<Mapper4All, JSONArray>(new Mapper4All(possibleResArray)));
        }
        return new Right<String, Either<Mapper4All, JSONArray>>(new Right<Mapper4All, JSONArray>(possibleResArray));
    }

    /**
     * Get timeboundary.
     *
     * @param dataSource 
     * @return
     * @throws java.lang.Exception
     */
    public Interval getTimeBoundary(String dataSource) throws Exception {
        Either<String,Either<Mapper4All,JSONArray>> res = fireQuery("SELECT FROM " + dataSource, true);
        if (res.isLeft()) {
            throw new IllegalArgumentException(format("DataSource %s does not exist(or) check if druid is accessible", dataSource));
        }
        Mapper4All finalRes = res.right().get().left().get();// Thats because we know Time boundary cannot be a Join result!!
        int min = finalRes.baseFieldNames.indexOf("minTime");
        int max = finalRes.baseFieldNames.indexOf("maxTime");
        List<Object> row = finalRes.baseAllRows.get(0);// Only 1 element is returned in Timeboundary.
        return new Interval(row.get(min).toString(), row.get(max).toString());
    }
    
}
