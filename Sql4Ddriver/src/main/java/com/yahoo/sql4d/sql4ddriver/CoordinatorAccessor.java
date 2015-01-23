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

import com.google.common.collect.Lists;
import com.yahoo.sql4d.query.nodes.Interval;
import java.io.IOException;
import static java.lang.String.format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import scala.Either;
import scala.Left;
import scala.Right;
import scala.Tuple2;

/**
 * Coordinator commands.
 *
 * @author srikalyan
 */
public class CoordinatorAccessor extends DruidNodeAccessor {

    private final String coordinatorUrl = "http://%s:%d/";
    private final String coordinatorHost;
    private int coordinatorPort = 8082;

    public CoordinatorAccessor(String host, int port, int maxConns) {
        super(host, port, maxConns);
        this.coordinatorHost = host;
        this.coordinatorPort = port;
    }

    /**
     * All commands. If data is null then GET else POST.
     *
     * @return
     */
    private Either<String, Either<JSONArray, JSONObject>> fireCommand(String endPoint, String optData) {
        CloseableHttpResponse resp = null;
        String respStr;
        String url = format(coordinatorUrl + endPoint, coordinatorHost, coordinatorPort);
        try {
            if (optData != null) {// POST
                resp = postJson(url, optData);
            } else {// GET
                resp = get(url);
            }
            respStr = IOUtils.toString(resp.getEntity().getContent());
        } catch (IOException ex) {
            return new Left<>(format("Http %s, faced exception %s\n", resp, ex));
        } finally {
            returnClient(resp);
        }
        try {
            return new Right<>(Util.asJsonType(respStr));
        } catch (JSONException je) {
            return new Left<>(format("Recieved data %s not in json format, faced exception %s\n", respStr, je));
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

    public List<String> getDimensions(String name) {
        Either<String,Tuple2<List<String>,List<String>>> aboutDataSource = aboutDataSource(name);
        if (aboutDataSource.isLeft()) {
            return Lists.newArrayList();
        } 
        return aboutDataSource.right().get()._1();
    }

    public List<String> getMetrics(String name) {
        Either<String,Tuple2<List<String>,List<String>>> aboutDataSource = aboutDataSource(name);
        if (aboutDataSource.isLeft()) {
            return Lists.newArrayList();
        } 
        return aboutDataSource.right().get()._2();
    }
    /**
     * Ex:response looks something like this.
     * [{"dataSource":"abf2","interval":"2014-10-31T00:00:00.000-07:00/2014-11-01T00:00:00.000-07:00","version":"2014-11-13T21:53:23.982-08:00","loadSpec":{..},..},
     * {"dataSource":"abf2","interval":"2014-11-01T00:00:00.000-07:00/2014-11-02T00:00:00.000-07:00","version":"2014-11-13T22:01:23.554-08:00","loadSpec":{..},..}
     * .... ]
     *
     * @param dataSource
     * @return List[intervals] Ex:
     * ["2014-10-31T00:00:00.000-07:00/2014-11-01T00:00:00.000-07:00",
     * "2014-11-01T00:00:00.000-07:00/2014-11-02T00:00:00.000-07:00" .. ]
     */
    public Either<String, List<Interval>> segments(String dataSource) {
        Either<String, Either<JSONArray, JSONObject>> resp = fireCommand("info/datasources/" + dataSource + "/segments?full", null);
        if (resp.isLeft()) {
            return new Left<>(resp.left().get());
        }
        Either<JSONArray, JSONObject> mayBgoodResp = resp.right().get();
        if (mayBgoodResp.isLeft()) {
            JSONArray segments = mayBgoodResp.left().get();
            List<Interval> segmentsList = new ArrayList<>();
            for (int i = 0; i < segments.length(); i++) {
                JSONObject segment = segments.getJSONObject(i);
                segmentsList.add(new Interval(segment.getString("interval")));
            }
            return new Right<>(segmentsList);
        }
        return new Left<>(mayBgoodResp.right().get().toString());
    }
}
