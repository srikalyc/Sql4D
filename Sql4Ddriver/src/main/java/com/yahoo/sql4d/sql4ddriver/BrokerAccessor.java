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

import com.yahoo.sql4d.BaseStatementMeta;
import com.yahoo.sql4d.DCompiler;
import com.yahoo.sql4d.Program;
import com.yahoo.sql4d.query.nodes.Interval;
import java.io.IOException;
import static java.lang.String.format;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.json.JSONArray;
import org.json.JSONException;
import scala.Either;
import scala.Left;
import scala.Right;

/**
 * Query interface to druid broker.
 * @author srikalyan
 */
public class BrokerAccessor extends DruidNodeAccessor {
    private final String brokerHost;
    private int brokerPort = 4080;
    private final String brokerUrl = "http://%s:%d/druid/v2/?pretty";
    public BrokerAccessor(String host, int port, int maxConns) {
        super(host, port, maxConns);
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
        CloseableHttpResponse resp = null;
        String respStr;
        String url = format(brokerUrl, brokerHost, brokerPort);
        try {
            resp = postJson(url, jsonQuery);
            respStr = IOUtils.toString(resp.getEntity().getContent());
        } catch (IOException ex) {
            return new Left<>(format("Http %s, faced exception %s\n", resp, ex));        
        } finally {
            returnClient(resp);
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
     * @throws java.lang.IllegalAccessException
     */
    public Interval getTimeBoundary(String dataSource) throws IllegalAccessException {
        Program<BaseStatementMeta> pgm = DCompiler.compileSql(format("SELECT FROM %s", dataSource));
        Either<String,Either<Mapper4All,JSONArray>> res = fireQuery(pgm.nthStmnt(0).toString(), true);
        if (res.isLeft()) {
            throw new IllegalAccessException(format("DataSource %s does not exist(or) check if druid is accessible, faced exception %s", dataSource, res.left().get()));
        }
        Mapper4All finalRes = res.right().get().left().get();// Thats because we know Time boundary cannot be a Join result!!
        int min = finalRes.baseFieldNames.indexOf("minTime");
        int max = finalRes.baseFieldNames.indexOf("maxTime");
        if (finalRes.baseAllRows.isEmpty()) {// Possible when table does not exist.
            throw new IllegalAccessException("Either table does not exist(or) druid is not accessible");
        }
        List<Object> row = finalRes.baseAllRows.get(0);// Only 1 element is returned in Timeboundary.
        return new Interval(row.get(min).toString(), row.get(max).toString());
    }
    
}
