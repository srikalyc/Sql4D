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
import static java.lang.String.format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.entity.ContentType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import scala.Either;
import scala.Left;
import scala.Right;
import scala.Tuple2;

/**
 * Coordinator commands.
 * @author srikalyan
 */
public class CoordinatorAccessor extends DruidNodeAccessor {
    private final String coordinatorUrl = "http://%s:%d/";
    private final String coordinatorHost;
    private int coordinatorPort = 8082;
    public CoordinatorAccessor(String host, int port) {
        this.coordinatorHost = host;
        this.coordinatorPort = port;
    }
    
    /**
     * All commands.
     * If data is null then GET else POST.
     * @return
     */
    private Either<String, Either<JSONArray, JSONObject>> fireCommand(String endPoint, String optData) {
        Response resp = null;
        String respStr;
        String url = format(coordinatorUrl + endPoint, coordinatorHost, coordinatorPort);
        try {
            Request req = (optData != null)?Request.Post(url).bodyString(optData, ContentType.APPLICATION_JSON):Request.Get(url);
                    req = req.connectTimeout(1000).socketTimeout(1000);
            if (PROXY_HOST != null) {
                req = req.viaProxy(new HttpHost(PROXY_HOST, PROXY_PORT));          
            }
            resp = req.execute();
            respStr = resp.returnContent().asString();
        } catch (IOException ex) {
            return new Left<>(format("Http %s \n", resp));        
        }
        try {
            return new Right<>(asJsonType(respStr));
        } catch (JSONException je) {
            return new Left<>(format("Recieved data %s not in json format. \n",respStr));
        }
    }

    public Either<String, List<String>> dataSources() {
        Either<String, Either<JSONArray, JSONObject>> resp = fireCommand("info/datasources", null);
        if (resp.isLeft()) {
            return new Left<>(resp.left().get());
        }
        Either<JSONArray, JSONObject> goodResp = resp.right().get();
        if (goodResp.isLeft()) {
            JSONArray dataSources = goodResp.left().get();
            List<String> dataSourceList = new ArrayList<>();
            for (int i = 0; i < dataSources.length(); i++) {
                dataSourceList.add(dataSources.getString(i));
            }
            return new Right<>(dataSourceList);
        }
        return new Left<>(resp.left().get());
    }

    /**
     * Left is error Right is Tuple <dimensions, metrics>
     *
     * @param name
     * @return
     */
    public Either<String, Tuple2<List<String>, List<String>>> aboutDataSource(String name) {
        Either<String, Either<JSONArray, JSONObject>> resp = fireCommand("info/datasources/" + name, null);
        if (resp.isLeft()) {
            return new Left<>(resp.left().get());
        }
        Either<JSONArray, JSONObject> goodResp = resp.right().get();
        if (goodResp.isRight()) {
            JSONObject data = goodResp.right().get();
            if (data.has("segments")) {
                JSONArray segmentsArray = data.getJSONArray("segments");
                if (segmentsArray.length() == 0) {
                    return new Left<>("No segments received..");
                }
                JSONObject firstItem = segmentsArray.getJSONObject(0);
                String dims = firstItem.getString("dimensions");
                String metrics = firstItem.getString("metrics");
                return new Right<>(new Tuple2<>(Arrays.asList(dims.split(",")), Arrays.asList(metrics.split(","))));
            } else {
                return new Left<>("No segments key in the response..");
            }
        }
        return new Left<>("Unexpected response " + goodResp.left().get().toString());
    }

    private Either<JSONArray, JSONObject> asJsonType(String str) throws JSONException {
        JSONArray possibleResArray = null;
        try {
            possibleResArray = new JSONArray(str);
            return new Left<>(possibleResArray);
        } catch (JSONException je) {
            JSONObject possibleResObj = new JSONObject(str);
            return new Right<>(possibleResObj);
        }
    }

}
