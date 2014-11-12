/**
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License. 
 * See accompanying LICENSE file.
 */
package com.yahoo.sql4d.sql4ddriver;

import com.yahoo.sql4d.BaseStatementMeta;
import com.yahoo.sql4d.query.RequestType;
import static com.yahoo.sql4d.sql4ddriver.Util.*;

import com.yahoo.sql4d.DCompiler;
import com.yahoo.sql4d.Program;
import com.yahoo.sql4d.QueryProgram;
import com.yahoo.sql4d.insert.InsertMeta;
import com.yahoo.sql4d.query.QueryMeta;
import com.yahoo.sql4d.query.select.SelectQueryMeta;
import com.yahoo.sql4d.sql4ddriver.rowmapper.DruidBaseBean;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import scala.Either;
import scala.Left;
import scala.Right;
import scala.Tuple2;

/**
 * TODO: Use logger. Database driver interface for druid SQL. Does not conform
 * to DataSource. Druid response can be like
 *
 * For groupBy the response is as follows. [ { "version" : "v1", "timestamp" :
 * "2013-07-12T04:00:00.000Z", "event" : { ... } }, { "version" : "v1",
 * "timestamp" : "2013-07-12T04:00:00.000Z", "event" : { ... } },... ] For
 * timeseries the response is as follows [ { "timestamp":
 * "2012-01-01T00:00:00.000Z", "result": { "sample_name1": <some_value>,
 * "sample_name2": <some_value>, "sample_divide": <some_value> } }, {
 * "timestamp": "2012-01-02T00:00:00.000Z", "result": { "sample_name1":
 * <some_value>, "sample_name2": <some_value>, "sample_divide": <some_value> } }
 ] For TopN query the response is as follows [ { "timestamp":
 "2013-08-31T00:00:00.000Z", "result": [ { "dim1": "dim1_val", "count": 111,
 "some_metrics": 10669, "average": 96.11711711711712 }, {.... } ] } ]
 *
 * @author srikalyan
 */
public class DDataSource {

    private String brokerHost;
    private int brokerPort = 4080;
    private String coordinatorHost;
    private int coordinatorPort = 8082;
    private String proxyHost;
    private int proxyPort = 3128;

    private final String brokerUrl = "http://%s:%d/druid/v2/?pretty";
    private final String coordinatorUrl = "http://%s:%d/";

    private NamedParameters namedParams;

    public DDataSource(String bHost, int bPort) {
        this.brokerHost = bHost;
        this.brokerPort = bPort;
    }

    public DDataSource(String bHost, int bPort, String cHost, int cPort) {
        this(bHost, bPort);
        this.coordinatorHost = cHost;
        this.coordinatorPort = cPort;
    }

    public DDataSource(String bHost, int bPort, String cHost, int cPort, String pHost, int pPort) {
        this(bHost, bPort, cHost, cPort);
        this.proxyHost = pHost;
        this.proxyPort = pPort;
    }
    
    public void setNamedParams(NamedParameters namedParams) {
        this.namedParams = namedParams;
    }

    private String preprocessSqlQuery(String sqlQuery) {
        if (namedParams != null) {
            return namedParams.deParameterize(sqlQuery);
        }
        return sqlQuery;
    }
    
    /**
     * If either is left then we have list of values of type T.
     * If either is right then we have Map<key, value of type T>.
     * The latter is a result if join while the former is a result of simple query.
     * @param <T>
     * @param sqlQuery
     * @param rowMapper
     * @param printToConsole
     * @return
     */
    public <T extends DruidBaseBean> Either<String,Either<List<T>, Map<Object, T>>> query(String sqlQuery, Class<T> rowMapper, boolean printToConsole) {
        Program pgm = getCompiledAST(sqlQuery);
        if (!(pgm instanceof QueryProgram)) {
            throw new IllegalAccessError("Only SELECT queries can be sent out as query!!");
        }
        QueryProgram qPgm = (QueryProgram)pgm;
        if (qPgm.numStmnts() > 2) {
            println("Currently join for more than 2 Sqls not supported....");
            return null;
        }
        if (printToConsole) {
            println(qPgm.toString());
        }
        if (qPgm.numStmnts() == 1) {
            QueryMeta query = qPgm.nthStmnt(0);
            Either<String, Either<Mapper4All, JSONArray>> result = fireQuery(query.toString(), false);
            if (result.isLeft()) {
                return new Left<>(result.left().get());
            }
            Either<Mapper4All, JSONArray> goodResult = result.right().get();
            return new Right<String,Either<List<T>, Map<Object, T>>>(new Left<List<T>, Map<Object, T>>(new Mapper4Bean<>(goodResult.right().get(), rowMapper).baseAllRows));
        }
        Joiner4Bean<T> joiner = null;
        int i = 0;// Index for join hooks.
        for (QueryMeta query : qPgm.getAllStmnts()) {// List of queries = 2 
            Either<String, Either<Mapper4All, JSONArray>> result = fireQuery(query.toString(), false);
            if (result.isLeft()) {
                return new Left<>(result.left().get());
            }
            Either<Mapper4All, JSONArray> goodResult = result.right().get();
            if (joiner == null) {
                joiner = new Joiner4Bean(goodResult.right().get(), qPgm.primaryJoinableHooks, rowMapper);
            } else {
                joiner.join(goodResult.right().get(), qPgm.primaryJoinableHooks, Joiner4All.ActionType.valueOf(((QueryProgram)pgm).joinTypes.get(i++)));
            }
        }
        return new Right<String,Either<List<T>, Map<Object, T>>>(new Right<List<T>, Map<Object, T>>(joiner.baseAllRows));
    }

    /**
     * Get an in memory representation of broken SQL query.
     * @param sqlQuery
     * @return 
     */
    public Program<BaseStatementMeta> getCompiledAST(String sqlQuery) {
        Program<BaseStatementMeta> pgm = DCompiler.compileSql(preprocessSqlQuery(sqlQuery));
        for (BaseStatementMeta stmnt:pgm.getAllStmnts()) {
            if (stmnt instanceof QueryMeta) {
                QueryMeta query = (QueryMeta)stmnt;
                if (query.queryType == RequestType.SELECT) {//classifyColumnsToDimAndMetrics
                    Either<String, Tuple2<List<String>, List<String>>> dataSourceDescRes = aboutDataSource(stmnt.dataSource);
                    if (dataSourceDescRes.isLeft()) {
                        println(dataSourceDescRes.left().get());
                    }
                    ((SelectQueryMeta)query).postProcess(dataSourceDescRes.right().get());
                }
            } else if (stmnt instanceof InsertMeta) {//TODO: Handle this.
                
            }
        }
        try {
            pgm.isValid();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return pgm;
    }
    /**
     * Query and return the Json response.
     *
     * @param sqlQuery
     * @return
     */
    public Either<String, Either<Joiner4All, Mapper4All>> query(String sqlQuery) {
        return DDataSource.this.query(sqlQuery, false, "sql");
    }

    public Either<String, Either<Joiner4All, Mapper4All>> query(String sqlOrJsonQuery, boolean printToConsole, String queryMode) {
        if ("json".equals(queryMode)) {
            Either<String, Either<Mapper4All,JSONArray>> result = fireQuery(sqlOrJsonQuery, true);
            if (result.isLeft()) {
                return new Left<>(result.left().get());
            }
            if (printToConsole) {
                println(result.right().get().left().get().toString());
            }
            return new Right<String, Either<Joiner4All, Mapper4All>>(new Right<Joiner4All, Mapper4All>(result.right().get().left().get()));
        }        
        Program pgm = getCompiledAST(sqlOrJsonQuery);
        if (!(pgm instanceof QueryProgram)) {
            throw new IllegalAccessError("Only SELECT queries can be sent out as query!!");
        }
        QueryProgram qPgm = (QueryProgram)pgm;
        if (qPgm.numStmnts() > 2) {
            return new Left<>("Currently join for more than 2 Sqls not supported....");
        }
        if (printToConsole) {
            println(pgm.toString());
        }
        Joiner4All joiner = null;
        if (qPgm.numStmnts() == 1) {
            QueryMeta query = qPgm.nthStmnt(0);
            Either<String, Either<Mapper4All,JSONArray>> result = fireQuery(query.toString(), true);
            if (result.isLeft()) {
                return new Left<>(result.left().get());
            }
            if (printToConsole) {
                println(result.right().get().left().get().toString());
            }
            return new Right<String, Either<Joiner4All, Mapper4All>>(new Right<Joiner4All, Mapper4All>(result.right().get().left().get()));
        }
        int i = 0;// Index for join hooks.
        for (QueryMeta query : qPgm.getAllStmnts()) {// List of queries = 2 
            Either<String, Either<Mapper4All,JSONArray>> resp = fireQuery(query.toString(), false);
            if (resp.isLeft()) {// Not expected
                return new Left<>(resp.left().get());
            } 
            JSONArray result = resp.right().get().right().get();
            if (joiner == null) {
                joiner = new Joiner4All(result, qPgm.primaryJoinableHooks);
            } else {
                joiner.join(result, qPgm.primaryJoinableHooks, Joiner4All.ActionType.valueOf(qPgm.joinTypes.get(i++)));
            }
        }
        return new Right<String, Either<Joiner4All, Mapper4All>>(new Left<Joiner4All, Mapper4All>(joiner));
    }

    /**
     * For firing simple queries(i.e non join queries).
     * @param jsonQuery
     * @param print
     * @return 
     */
    private Either<String, Either<Mapper4All, JSONArray>> fireQuery(String jsonQuery, boolean requiresMapping) {
        StringBuilder buff = new StringBuilder();
        try {
            URL url = null;
            try {
                url = new URL(String.format(brokerUrl, brokerHost, brokerPort));
            } catch (MalformedURLException ex) {
                Logger.getLogger(DDataSource.class.getName()).log(Level.SEVERE, null, ex);
                return new Left<>("Bad Url : " + ex);
            }
            Proxy proxy = Proxy.NO_PROXY;
            if (proxyHost != null) {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
            }
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection(proxy);
            httpConnection.setRequestMethod("POST");
            httpConnection.addRequestProperty("content-type", "application/json");
            httpConnection.setDoOutput(true);
            httpConnection.getOutputStream().write(jsonQuery.getBytes());
            if (httpConnection.getResponseCode() == 500 || httpConnection.getResponseCode() == 404) {
                return new Left<>(String.format("Http %d : %s \n", httpConnection.getResponseCode(), httpConnection.getResponseMessage()));
            }
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
            String line = null;
            while ((line = stdInput.readLine()) != null) {
                buff.append(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(DDataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
        JSONArray possibleResArray = null;
        try {
            possibleResArray = new JSONArray(buff.toString());
        } catch(JSONException je) {
            return new Left<>(String.format("Recieved data %s not in json format. \n", buff.toString()));
        }
        if (requiresMapping) {
            return new Right<String, Either<Mapper4All, JSONArray>>(new Left<Mapper4All, JSONArray>(new Mapper4All(possibleResArray)));
        }
        return new Right<String, Either<Mapper4All, JSONArray>>(new Right<Mapper4All, JSONArray>(possibleResArray));
    }

    /**
     * All commands.
     * @return 
     */
    private Either<String, Either<JSONArray,JSONObject>> fireCommand(String endPoint, String optData, String httpType) {
        StringBuilder buff = new StringBuilder();
        try {
            URL url = null;
            try {
                url = new URL(String.format(coordinatorUrl + endPoint, coordinatorHost, coordinatorPort));
            } catch (MalformedURLException ex) {
                Logger.getLogger(DDataSource.class.getName()).log(Level.SEVERE, null, ex);
                return new Left<>("Bad Url : " + ex);
            }
            Proxy proxy = Proxy.NO_PROXY;
            if (proxyHost != null) {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
            }
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection(proxy);
            httpConnection.setRequestMethod(httpType);
            httpConnection.addRequestProperty("content-type", "application/json");
            httpConnection.setDoOutput(true);
            if ("POST".equals(httpType) && optData != null) {
                httpConnection.getOutputStream().write(optData.getBytes());
            }
            
            if (httpConnection.getResponseCode() == 500 || httpConnection.getResponseCode() == 404) {
                return new Left<>(String.format("Http %d : %s \n", httpConnection.getResponseCode(), httpConnection.getResponseMessage()));
            }

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
            String line = null;
            while ((line = stdInput.readLine()) != null) {
                buff.append(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(DDataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
        JSONArray possibleResArray = null;
        try {
            possibleResArray = new JSONArray(buff.toString());
            return new Right<String,Either<JSONArray,JSONObject>>(new Left<JSONArray,JSONObject>(possibleResArray));
        } catch(JSONException je) {
            try {
                JSONObject possibleResObj = new JSONObject(buff.toString());
                return new Right<String, Either<JSONArray, JSONObject>>(new Right<JSONArray, JSONObject>(possibleResObj));
            } catch(JSONException je2) {
                return new Left<>(String.format("Recieved data %s not in json format. \n", buff.toString()));
            }
        }
    }
    
    public Either<String, List<String>> dataSources() {
         Either<String, Either<JSONArray,JSONObject>> resp = fireCommand("info/datasources", null, "GET");
         if (resp.isLeft()) {
             return new Left<>(resp.left().get());
         }
         Either<JSONArray,JSONObject> goodResp = resp.right().get();
         if (goodResp.isLeft()) {
             JSONArray dataSources = goodResp.left().get();
             List<String> dataSourceList = new ArrayList<>();
             for (int i = 0;i < dataSources.length();i++) {
                 dataSourceList.add(dataSources.getString(i));
             }
             return new Right<>(dataSourceList);
         }
         return new Left<>(resp.left().get());
    }
    
    /**
     * Left is error
     * Right is Tuple <dimensions, metrics>
     * @param name
     * @return 
     */
    public Either<String, Tuple2<List<String>, List<String>>> aboutDataSource(String name) {
         Either<String, Either<JSONArray,JSONObject>> resp = fireCommand("info/datasources/" + name, null, "GET");
         if (resp.isLeft()) {
             return new Left<>(resp.left().get());
         }
         Either<JSONArray,JSONObject> goodResp = resp.right().get();
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

    public static void main(String[] args) {
        String q = "SELECT timestamp, LONG_SUM(count) AS edit_count, DOUBLE_SUM(added) AS chars_added FROM wikipedia WHERE interval BETWEEN 2010-01-01T00:00:00.000Z AND 2020-01-01T00:00:00.000Z BREAK BY 'minute' HINT('timeseries');";
        String q1 = "SELECT timestamp, page, LONG_SUM(count) AS edit_count FROM wikipedia WHERE interval BETWEEN 2010-01-01 AND 2020-01-01 AND country='United States' BREAK BY 'all' GROUP BY page  ORDER BY edit_count DESC LIMIT 10;";
        String q2 = "SELECT page, LONG_SUM(count) AS edit_count FROM wikipedia WHERE interval BETWEEN 2010-01-01T00:00:00.000Z AND 2020-01-01T00:00:00.000Z AND country='United States' BREAK BY 'minute' GROUP BY page  LIMIT 10;";
        DDataSource driver = new DDataSource("localhost", 4080, "localhost", 8082, null, 3128);
         Either<String,Either<Joiner4All,Mapper4All>> result = driver.query(q, true, "sql");
         System.out.println(result.right().get().right().get());
//        Either<String,Either<List<TimeSeriesBean>,Map<Object,TimeSeriesBean>>> result2 = driver.query(join, TimeSeriesBean.class, true);
//        if (result2.isRight()) {
//            Either<List<TimeSeriesBean>,Map<Object,TimeSeriesBean>> grandRes =  result2.right().get();
//             if (grandRes.isLeft()) {
//                 List<TimeSeriesBean> joiner4All = grandRes.left().get();
//                 PrettyPrint.print(joiner4All);
//             } else {
//                 Map<Object,TimeSeriesBean> mapper4All = grandRes.right().get();
//                 println(mapper4All.toString());
//             }
//        }

    }
}
