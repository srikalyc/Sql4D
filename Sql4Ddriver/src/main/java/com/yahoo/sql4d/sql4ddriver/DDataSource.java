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
import com.yahoo.sql4d.CrudProgram;
import com.yahoo.sql4d.CrudStatementMeta;
import com.yahoo.sql4d.query.RequestType;
import static com.yahoo.sql4d.sql4ddriver.Util.*;

import com.yahoo.sql4d.DCompiler;
import com.yahoo.sql4d.DeleteProgram;
import com.yahoo.sql4d.DropProgram;
import com.yahoo.sql4d.InsertProgram;
import com.yahoo.sql4d.Program;
import com.yahoo.sql4d.QueryProgram;
import com.yahoo.sql4d.delete.DeleteMeta;
import com.yahoo.sql4d.drop.DropMeta;
import com.yahoo.sql4d.insert.InsertMeta;
import com.yahoo.sql4d.query.QueryMeta;
import com.yahoo.sql4d.query.nodes.Interval;
import com.yahoo.sql4d.query.select.SelectQueryMeta;
import com.yahoo.sql4d.sql4ddriver.rowmapper.DruidBaseBean;
import com.yahoo.sql4d.sql4ddriver.sql.MysqlAccessor;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.json.JSONArray;
import scala.util.Either;
import scala.util.Left;
import scala.util.Right;
import scala.Tuple2;

/**
 * TODO: Use logger. Database driver for druid. Does not conform
 * to javax.sql.DataSource. 
 * 
 * Possible druid responses :
 *
 * For groupBy the response is as follows. [ { "version" : "v1", "timestamp" :
 * "2013-07-12T04:00:00.000Z", "event" : { ... } }, { "version" : "v1",
 * "timestamp" : "2013-07-12T04:00:00.000Z", "event" : { ... } },... ] 
 * 
 * For timeseries the response is as follows [ { "timestamp":
 * "2012-01-01T00:00:00.000Z", "result": { "sample_name1": <some_value>,
 * "sample_name2": <some_value>, "sample_divide": <some_value> } }, {
 * "timestamp": "2012-01-02T00:00:00.000Z", "result": { "sample_name1":
 * <some_value>, "sample_name2": <some_value>, "sample_divide": <some_value> } }
 * ]
 * 
 * For TopN query the response is as follows [ { "timestamp":
 * "2013-08-31T00:00:00.000Z", "result": [ { "dim1": "dim1_val", "count": 111,
 * "some_metrics": 10669, "average": 96.11711711711712 }, {.... } ] } ]
 *
 * @author srikalyan
 */
public class DDataSource {

    private BrokerAccessor broker; 
    private CoordinatorAccessor coordinator; 
    private OverlordAccessor overlord; 
    
    private MysqlAccessor dbAccessor;
    
    private static int MAX_CONNS_IN_POOL = 150;
    private static int MAX_BROKER_CONNS = 100;
    private static int MAX_COORD_CONNS = 50;
    private static int MAX_OVERLORD_CONNS = 50;

    public DDataSource(String bHost, int bPort) {
        this(bHost, bPort, null, 0);
    }

    public DDataSource(String bHost, int bPort, String cHost, int cPort) {
        this(bHost, bPort, cHost, cPort, null, 0);
    }

    public DDataSource(String bHost, int bPort, String cHost, int cPort, String oHost, int oPort) {
        this(bHost, bPort, cHost, cPort, oHost, oPort, "localhost", 3306, "druid", "diurd", "druid");
    }

    public DDataSource(String bHost, int bPort, String cHost, int cPort, String oHost, int oPort, String sqlHost, int sqlPort, String sqlId, String sqlPasswd, String dbName) {
        broker = new BrokerAccessor(bHost, bPort, MAX_BROKER_CONNS);
        coordinator = new CoordinatorAccessor(cHost, cPort, MAX_COORD_CONNS);
        overlord = new OverlordAccessor(oHost, oPort, MAX_OVERLORD_CONNS);
        dbAccessor = new MysqlAccessor(sqlHost, sqlPort, sqlId, sqlPasswd, dbName);
    }

    /**
     * Call if a custom pool size, and fine grained control on connections per route.
     * NOTE: This must be called prior to instantiating DDataSource for the settings
     * to be effective.
     * @param maxConnsInPool
     * @param maxBrokerConns
     * @param maxCoordConns
     * @param maxOverlordConns 
     */
    public static void adjustPoolSettings(int maxConnsInPool, int maxBrokerConns, int maxCoordConns, int maxOverlordConns) {
        MAX_CONNS_IN_POOL = maxConnsInPool;
        MAX_BROKER_CONNS = maxBrokerConns;
        MAX_COORD_CONNS = maxCoordConns;
        MAX_OVERLORD_CONNS = maxOverlordConns;
        DruidNodeAccessor.setMaxConnections(MAX_CONNS_IN_POOL);
    }
    
    /**
     * NOTE: This must be called prior to instantiating DDataSource for the settings
     * to be effective.
     * @param pHost
     * @param pPort 
     */
    public static void setProxy(String pHost, int pPort) {
        DruidNodeAccessor.setProxy(pHost, pPort);
    }
    
    private String preprocessSqlQuery(String sqlQuery, NamedParameters namedParams) {
        if (namedParams != null) {
            return namedParams.deParameterize(sqlQuery);
        }
        return sqlQuery;
    }

    /**
     * Get an in memory representation of broken SQL query. This may require 
     * contacting druid for resolving dimensions Vs metrics for SELECT queries
     * hence it also optionally accepts HTTP request headers to be sent out.
     *
     * @param sqlQuery
     * @param namedParams
     * @param reqHeaders
     * @return
     * @throws java.lang.Exception
     */
    public Program<BaseStatementMeta> getCompiledAST(String sqlQuery, NamedParameters namedParams, Map<String, String> reqHeaders) throws Exception {
        Program<BaseStatementMeta> pgm = DCompiler.compileSql(preprocessSqlQuery(sqlQuery, namedParams));
        for (BaseStatementMeta stmnt : pgm.getAllStmnts()) {
            if (stmnt instanceof QueryMeta) {
                QueryMeta query = (QueryMeta) stmnt;
                if (query.queryType == RequestType.SELECT) {//classifyColumnsToDimAndMetrics
                    Either<String, Tuple2<List<String>, List<String>>> dataSourceDescRes = coordinator.aboutDataSource(stmnt.dataSource, reqHeaders);
                    if (dataSourceDescRes.isLeft()) {
                        throw new Exception("Datasource info either not available (or)could not be loaded ." + dataSourceDescRes.left().get());
                    } else {
                        ((SelectQueryMeta) query).postProcess(dataSourceDescRes.right().get());
                    }
                }
            } else if (stmnt instanceof InsertMeta) {//TODO: Handle this.

            } else if (stmnt instanceof DeleteMeta) {//TODO: Handle this.

            } else if (stmnt instanceof DropMeta) {//TODO: Handle this.

            }
        }
        //TODO: Do something if pgm is invalid !!!
        pgm.isValid();
        return pgm;
    }

    /**
     * If either is left then we have list of values of type T. If either is
     * right then we have Map<key, value of type T>. The latter is a result if
     * join while the former is a result of simple query.
     *
     * @param <T>
     * @param sqlQuery
     * @param namedParams
     * @param rowMapper
     * @param reqHeaders
     * @param printToConsole
     * @return
     */
    public <T extends DruidBaseBean> Either<String, Either<List<T>, Map<Object, T>>> query(String sqlQuery, NamedParameters namedParams, Class<T> rowMapper, Map<String, String> reqHeaders, boolean printToConsole) {
        Program pgm;
        try {
            pgm = getCompiledAST(sqlQuery, namedParams, reqHeaders);
        } catch (Exception ex) {
            return new Left<>(ex.getMessage());
        }
        if (!(pgm instanceof QueryProgram)) {// Reason is that only select queries results in a data response.
            throw new IllegalAccessError("Only SELECT queries can be sent out as query!!");
        }
        QueryProgram qPgm = (QueryProgram) pgm;
        if (qPgm.numStmnts() > 2) {
            println("Currently join for more than 2 Sqls not supported....");
            return null;
        }
        if (printToConsole) {
            println(qPgm.toString());
        }
        if (qPgm.numStmnts() == 1) {
            QueryMeta query = qPgm.nthStmnt(0);
            Either<String, Either<Mapper4All, JSONArray>> result = broker.fireQuery(query.toString(), reqHeaders, false);
            if (result.isLeft()) {
                return new Left<>(result.left().get());
            }
            Either<Mapper4All, JSONArray> goodResult = result.right().get();
            return new Right<String, Either<List<T>, Map<Object, T>>>(new Left<List<T>, Map<Object, T>>(new Mapper4Bean<>(goodResult.right().get(), rowMapper).baseAllRows));
        }
        Joiner4Bean<T> joiner = null;
        int i = 0;// Index for join hooks.
        for (QueryMeta query : qPgm.getAllStmnts()) {// List of queries = 2 
            Either<String, Either<Mapper4All, JSONArray>> result = broker.fireQuery(query.toString(), reqHeaders, false);
            if (result.isLeft()) {
                return new Left<>(result.left().get());
            }
            Either<Mapper4All, JSONArray> goodResult = result.right().get();
            if (joiner == null) {
                joiner = new Joiner4Bean(goodResult.right().get(), qPgm.primaryJoinableHooks, rowMapper);
            } else {
                joiner.join(goodResult.right().get(), qPgm.primaryJoinableHooks, Joiner4All.ActionType.valueOf(((QueryProgram) pgm).joinTypes.get(i++)));
            }
        }
        return new Right<String, Either<List<T>, Map<Object, T>>>(new Right<List<T>, Map<Object, T>>(joiner.baseAllRows));
    }

    /**
     * Query and return the Json response.
     *
     * @param sqlQuery
     * @param reqHeaders
     * @return
     */
    public Either<String, Either<Joiner4All, Mapper4All>> query(String sqlQuery, Map<String, String> reqHeaders) {
        return query(sqlQuery, null, reqHeaders, false, "sql");
    }

    /**
     * TODO: This method is still buggy and not fully implemented.
     * Common interface to Insert , Delete, Drop(but not coordinator commands).
     * @param sqlOrJsonQuery
     * @param namedParams
     * @param reqHeaders
     * @param printToConsole
     * @param queryMode
     * @param forceAsync
     * @return 
     */
    public String crud(String sqlOrJsonQuery, NamedParameters namedParams, Map<String, String> reqHeaders, boolean printToConsole, String queryMode, boolean forceAsync) {
        if ("json".equals(queryMode)) {//TODO : #19
        }
        Program pgm;
        try {
            pgm = getCompiledAST(sqlOrJsonQuery, namedParams, reqHeaders);
        } catch (Exception ex) {
            return ex.getMessage();
        }
        if (printToConsole) {
            println(pgm.toString());
        }
        if (pgm instanceof CrudProgram) {
            CrudProgram cPgm = (CrudProgram) pgm;
            return overlord.fireTask((CrudStatementMeta)cPgm.nthStmnt(0), reqHeaders, cPgm.waitForCompletion && !forceAsync);
        }
        return "Could not execute the program " + pgm;
    }
    /**
     * Common interface to Query, Insert , Delete, Drop(but not coordinator commands).
     * @param sqlOrJsonQuery
     * @param namedParams
     * @param reqHeaders
     * @param printToConsole
     * @param queryMode
     * @return 
     */
    public Either<String, Either<Joiner4All, Mapper4All>> query(String sqlOrJsonQuery, NamedParameters namedParams, Map<String, String> reqHeaders, boolean printToConsole, String queryMode) {
        return query(sqlOrJsonQuery, namedParams, reqHeaders, printToConsole, queryMode, false);
    }
    
    /**
     * Use this to force asynchronous mode(indexer tasks). You can then call
     * {@link DDataSource#pollIndexerTaskStatus(java.lang.String) } to poll and find
     * status. Hard limit on any task is 2 hours. See {@link OverlordAccessor} for more.
     * @param sqlOrJsonQuery
     * @param namedParams
     * @param reqHeaders
     * @param printToConsole
     * @param queryMode
     * @param forceAsync
     * @return 
     */
    public Either<String, Either<Joiner4All, Mapper4All>> query(String sqlOrJsonQuery, NamedParameters namedParams, Map<String, String> reqHeaders, boolean printToConsole, String queryMode, boolean forceAsync) {
        if ("json".equals(queryMode)) {//TODO : #19
            Either<String, Either<Mapper4All, JSONArray>> result = broker.fireQuery(sqlOrJsonQuery, reqHeaders, true);
            if (result.isLeft()) return new Left<>(result.left().get());
            if (printToConsole) {
                println(result.right().get().left().get().toString());
            }
            return new Right<String, Either<Joiner4All, Mapper4All>>(new Right<Joiner4All, Mapper4All>(result.right().get().left().get()));
        }
        Program pgm;
        try {
            pgm = getCompiledAST(sqlOrJsonQuery, namedParams, reqHeaders);
        } catch (Exception ex) {
            return new Left<>(ex.getMessage());
        }
        if (pgm instanceof DeleteProgram) {
            return new Left<>(deleteRows((DeleteProgram) pgm, reqHeaders, printToConsole));
        } else if (pgm instanceof DropProgram) {
            return new Left<>(dropTable((DropProgram) pgm, reqHeaders, printToConsole));
        } else if (pgm instanceof InsertProgram) {
            InsertProgram iPgm = (InsertProgram) pgm;
            iPgm.print(printToConsole);
            return new Left<>(overlord.fireTask(iPgm.nthStmnt(0), reqHeaders, !forceAsync && iPgm.waitForCompletion));
        } else {
            return selectRows((QueryProgram) pgm, reqHeaders, printToConsole);
        }
    }
    
    public TaskStatus pollIndexerTaskStatus(String taskId) {
        return overlord.pollTaskStatus(taskId, null);
    }
    
    private String deleteRows(DeleteProgram dPgm, Map<String, String> reqHeaders, boolean printToConsole) {
        DeleteMeta dMeta = (DeleteMeta)dPgm.nthStmnt(0);
        dbAccessor.disableSegmentsInRange(dMeta.dataSource, dMeta.interval);
        //TODO: Optimize the following 2 makes 1 call each to coordinator(replace with aboutDataSource single call)
        dMeta.dimensions = coordinator.getDimensions(dMeta.dataSource, reqHeaders);
        dMeta.metrics = coordinator.getMetrics(dMeta.dataSource, reqHeaders);
        dPgm.print(printToConsole);
        return overlord.fireTask((CrudStatementMeta)dMeta, reqHeaders, dPgm.waitForCompletion);
    }
    
    private String dropTable(DropProgram dPgm, Map<String, String> reqHeaders, boolean printToConsole) {
        DropMeta dMeta = (DropMeta)dPgm.nthStmnt(0);
        try {
            dMeta.interval = broker.getTimeBoundary(dMeta.dataSource, reqHeaders);// Set the boundary to max possible for the table.
        } catch (IllegalAccessException ex) {
            return ex.toString();
        }
        //TODO: Time boundary returns start Time of 1st segment and start time of last segment which means 
        // getting rid just that interval is insufficient, so increase the end time
        // by 62 days this will ensure we delete the table if the max segment granularity
        // is 2 months. For bigger segments drop will not work properly.
        Interval expandedInterval = dMeta.interval.expandEndTimeByDay(62);
        dMeta.interval = expandedInterval;
        dbAccessor.disableAllSegments(dMeta.dataSource);

        //TODO: Optimize the following 2 makes 1 call each to coordinator(replace with aboutDataSource single call)
        dMeta.dimensions = coordinator.getDimensions(dMeta.dataSource, reqHeaders);
        dMeta.metrics = coordinator.getMetrics(dMeta.dataSource, reqHeaders);
        dPgm.print(printToConsole);
        return overlord.fireTask((CrudStatementMeta)dMeta, reqHeaders, dPgm.waitForCompletion);
    }

    private Either<String, Either<Joiner4All, Mapper4All>> selectRows(QueryProgram qPgm, Map<String, String> reqHeaders, boolean printToConsole) {
        if (qPgm.numStmnts() > 2) return new Left<>("Currently join for more than 2 Sqls not supported....");
        qPgm.print(printToConsole);
        Joiner4All joiner = null;
        if (qPgm.numStmnts() == 1) {
            QueryMeta query = qPgm.nthStmnt(0);
            Either<String, Either<Mapper4All, JSONArray>> result = broker.fireQuery(query.toString(), reqHeaders, true);
            if (result.isLeft()) return new Left<>(result.left().get());
            if (printToConsole) {
                println(result.right().get().left().get().toString());
            }
            return new Right<String, Either<Joiner4All, Mapper4All>>(new Right<Joiner4All, Mapper4All>(result.right().get().left().get()));
        }
        int i = 0;// Index for join hooks.
        for (QueryMeta query : qPgm.getAllStmnts()) {// List of queries = 2 
            Either<String, Either<Mapper4All, JSONArray>> resp = broker.fireQuery(query.toString(), reqHeaders, false);
            if (resp.isLeft()) return new Left<>(resp.left().get());// Not expected
            
            JSONArray result = resp.right().get().right().get();
            if (joiner == null) {
                joiner = new Joiner4All(result, qPgm.primaryJoinableHooks);
            } else {
                joiner.join(result, qPgm.primaryJoinableHooks, Joiner4All.ActionType.valueOf(qPgm.joinTypes.get(i++)));
            }
        }
        return new Right<String, Either<Joiner4All, Mapper4All>>(new Left<Joiner4All, Mapper4All>(joiner));
    }
    
    public Either<String,List<String>> dataSources(Map<String, String> reqHeaders) {
        return coordinator.dataSources(reqHeaders);
    }
    
    public Either<String, Tuple2<List<String>, List<String>>> aboutDataSource(String dataSrc, Map<String, String> reqHeaders) {
        return coordinator.aboutDataSource(dataSrc, reqHeaders);
    }
    
    public Either<String, List<Interval>> segments(String dataSource, Map<String, String> reqHeaders) {
        return coordinator.segments(dataSource, reqHeaders);
    }
    
    /**
     * TODO: Add more statistics than just connection pool details as <k,v> pairs.
     * @return 
     */
    public Map<String,Integer> getNetworkStatistics() {
        return DruidNodeAccessor.getConnectionPoolStats();
    }
    public static void main(String[] args) {
        String q = "SELECT timestamp, LONG_SUM(count) AS edit_count, DOUBLE_SUM(added) AS chars_added FROM wikipedia WHERE interval BETWEEN 2010-01-01T00:00:00.000Z AND 2020-01-01T00:00:00.000Z BREAK BY 'minute' HINT('timeseries');";
        String q1 = "SELECT timestamp, page, LONG_SUM(count) AS edit_count FROM wikipedia WHERE interval BETWEEN 2010-01-01 AND 2020-01-01 AND country='United States' BREAK BY 'all' GROUP BY page  ORDER BY edit_count DESC LIMIT 10;";
        String q2 = "SELECT page, LONG_SUM(count) AS edit_count FROM wikipedia WHERE interval BETWEEN 2010-01-01T00:00:00.000Z AND 2020-01-01T00:00:00.000Z AND country='United States' BREAK BY 'minute' GROUP BY page  LIMIT 10;";
        DDataSource driver = new DDataSource("localhost", 4080, "localhost", 8082, null, 3128);
        Either<String, Either<Joiner4All, Mapper4All>> result = driver.query(q, null, null, true, "sql");
        System.out.println(result.right().get().right().get());
    }
}
