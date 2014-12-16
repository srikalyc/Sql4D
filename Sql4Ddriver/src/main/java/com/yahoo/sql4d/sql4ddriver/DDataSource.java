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
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
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
 * ] For TopN query the response is as follows [ { "timestamp":
 * "2013-08-31T00:00:00.000Z", "result": [ { "dim1": "dim1_val", "count": 111,
 * "some_metrics": 10669, "average": 96.11711711711712 }, {.... } ] } ]
 *
 * @author srikalyan
 */
public class DDataSource {

    private BrokerAccessor broker; 
    private CoordinatorAccessor coordinator; 
    private OverlordAccessor overlord; 
    
    private NamedParameters namedParams;
    private MysqlAccessor dbAccessor;
    
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
        broker = new BrokerAccessor(bHost, bPort);
        coordinator = new CoordinatorAccessor(cHost, cPort);
        overlord = new OverlordAccessor(oHost, oPort);
        dbAccessor = new MysqlAccessor(sqlHost, sqlPort, sqlId, sqlPasswd, dbName);
    }

    public void setProxy(String pHost, int pPort) {
        DruidNodeAccessor.PROXY_HOST = pHost;
        DruidNodeAccessor.PROXY_PORT = pPort;
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
     * Get an in memory representation of broken SQL query.
     *
     * @param sqlQuery
     * @return
     * @throws java.lang.Exception
     */
    public Program<BaseStatementMeta> getCompiledAST(String sqlQuery) throws Exception {
        Program<BaseStatementMeta> pgm = DCompiler.compileSql(preprocessSqlQuery(sqlQuery));
        for (BaseStatementMeta stmnt : pgm.getAllStmnts()) {
            if (stmnt instanceof QueryMeta) {
                QueryMeta query = (QueryMeta) stmnt;
                if (query.queryType == RequestType.SELECT) {//classifyColumnsToDimAndMetrics
                    Either<String, Tuple2<List<String>, List<String>>> dataSourceDescRes = coordinator.aboutDataSource(stmnt.dataSource);
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
     * @param rowMapper
     * @param printToConsole
     * @return
     */
    public <T extends DruidBaseBean> Either<String, Either<List<T>, Map<Object, T>>> query(String sqlQuery, Class<T> rowMapper, boolean printToConsole) {
        Program pgm;
        try {
            pgm = getCompiledAST(sqlQuery);
        } catch (Exception ex) {
            return new Left<>(ex.getMessage());
        }
        if (!(pgm instanceof QueryProgram)) {
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
            Either<String, Either<Mapper4All, JSONArray>> result = broker.fireQuery(query.toString(), false);
            if (result.isLeft()) {
                return new Left<>(result.left().get());
            }
            Either<Mapper4All, JSONArray> goodResult = result.right().get();
            return new Right<String, Either<List<T>, Map<Object, T>>>(new Left<List<T>, Map<Object, T>>(new Mapper4Bean<>(goodResult.right().get(), rowMapper).baseAllRows));
        }
        Joiner4Bean<T> joiner = null;
        int i = 0;// Index for join hooks.
        for (QueryMeta query : qPgm.getAllStmnts()) {// List of queries = 2 
            Either<String, Either<Mapper4All, JSONArray>> result = broker.fireQuery(query.toString(), false);
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
     * @return
     */
    public Either<String, Either<Joiner4All, Mapper4All>> query(String sqlQuery) {
        return query(sqlQuery, false, "sql");
    }

    /**
     * TODO: This method is still buggy and fully implemented.
     * Common interface to Insert , Delete, Drop(but not coordinator commands).
     * @param sqlOrJsonQuery
     * @param printToConsole
     * @param queryMode
     * @param forceAsync
     * @return 
     */
    public String crud(String sqlOrJsonQuery, boolean printToConsole, String queryMode, boolean forceAsync) {
        if ("json".equals(queryMode)) {//TODO : #19
        }
        Program pgm;
        try {
            pgm = getCompiledAST(sqlOrJsonQuery);
        } catch (Exception ex) {
            return ex.getMessage();
        }
        if (printToConsole) {
            println(pgm.toString());
        }
        if (pgm instanceof CrudProgram) {
            CrudProgram cPgm = (CrudProgram) pgm;
            return overlord.fireTask((CrudStatementMeta)cPgm.nthStmnt(0), cPgm.waitForCompletion && !forceAsync);
        }
        return "Could not execute the program " + pgm;
    }
    /**
     * Common interface to Query, Insert , Delete, Drop(but not coordinator commands).
     * @param sqlOrJsonQuery
     * @param printToConsole
     * @param queryMode
     * @return 
     */
    public Either<String, Either<Joiner4All, Mapper4All>> query(String sqlOrJsonQuery, boolean printToConsole, String queryMode) {
        if ("json".equals(queryMode)) {//TODO : #19
            Either<String, Either<Mapper4All, JSONArray>> result = broker.fireQuery(sqlOrJsonQuery, true);
            if (result.isLeft()) return new Left<>(result.left().get());
            if (printToConsole) {
                println(result.right().get().left().get().toString());
            }
            return new Right<String, Either<Joiner4All, Mapper4All>>(new Right<Joiner4All, Mapper4All>(result.right().get().left().get()));
        }
        Program pgm;
        try {
            pgm = getCompiledAST(sqlOrJsonQuery);
        } catch (Exception ex) {
            return new Left<>(ex.getMessage());
        }
        if (pgm instanceof DeleteProgram) {
            DeleteProgram dPgm = (DeleteProgram) pgm;
            DeleteMeta dMeta = (DeleteMeta)dPgm.nthStmnt(0);
//            Either<String, List<Interval>> allSegments = segments(dMeta.dataSource);
//            if (allSegments.isLeft()) {
//                return new Left<>(allSegments.left().get());
//            }
//            dMeta.filterSegments(allSegments.right().get());
            
            dbAccessor.disableSegmentsInRange(dMeta.dataSource, dMeta.interval);

            //TODO: Optimize the following 2 makes 1 call each to coordinator(replace with aboutDataSource single call)
            dMeta.dimensions = coordinator.getDimensions(dMeta.dataSource);
            dMeta.metrics = coordinator.getMetrics(dMeta.dataSource);
            pgm.print(printToConsole);
            return new Left<>(overlord.fireTask((CrudStatementMeta)dMeta, dPgm.waitForCompletion));
        } else if (pgm instanceof DeleteProgram) {
            DeleteProgram dPgm = (DeleteProgram) pgm;
            DeleteMeta dMeta = (DeleteMeta)dPgm.nthStmnt(0);
//            Either<String, List<Interval>> allSegments = segments(dMeta.dataSource);
//            if (allSegments.isLeft()) {
//                return new Left<>(allSegments.left().get());
//            }
//            dMeta.filterSegments(allSegments.right().get());
            
            dbAccessor.disableSegmentsInRange(dMeta.dataSource, dMeta.interval);

            //TODO: Optimize the following 2 makes 1 call each to coordinator(replace with aboutDataSource single call)
            dMeta.dimensions = coordinator.getDimensions(dMeta.dataSource);
            dMeta.metrics = coordinator.getMetrics(dMeta.dataSource);
            pgm.print(printToConsole);
            return new Left<>(overlord.fireTask((CrudStatementMeta)dMeta, dPgm.waitForCompletion));
        }

        pgm.print(printToConsole);
        if (pgm instanceof InsertProgram) {
            InsertProgram iPgm = (InsertProgram) pgm;
            return new Left<>(overlord.fireTask(iPgm.nthStmnt(0), iPgm.waitForCompletion));
            //throw new IllegalAccessError("Only SELECT queries can be sent out as query!!");
        }
        QueryProgram qPgm = (QueryProgram) pgm;
        if (qPgm.numStmnts() > 2) return new Left<>("Currently join for more than 2 Sqls not supported....");
        
        Joiner4All joiner = null;
        if (qPgm.numStmnts() == 1) {
            QueryMeta query = qPgm.nthStmnt(0);
            Either<String, Either<Mapper4All, JSONArray>> result = broker.fireQuery(query.toString(), true);
            if (result.isLeft()) return new Left<>(result.left().get());
            
            if (printToConsole) {
                println(result.right().get().left().get().toString());
            }
            return new Right<String, Either<Joiner4All, Mapper4All>>(new Right<Joiner4All, Mapper4All>(result.right().get().left().get()));
        }
        int i = 0;// Index for join hooks.
        for (QueryMeta query : qPgm.getAllStmnts()) {// List of queries = 2 
            Either<String, Either<Mapper4All, JSONArray>> resp = broker.fireQuery(query.toString(), false);
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
    
    public Either<String,List<String>> dataSources() {
        return coordinator.dataSources();
    }
    
    public Either<String, Tuple2<List<String>, List<String>>> aboutDataSource(String dataSrc) {
        return coordinator.aboutDataSource(dataSrc);
    }
    
    public Either<String, List<Interval>> segments(String dataSource) {
        return coordinator.segments(dataSource);
    }
    
    public static void main(String[] args) {
        String q = "SELECT timestamp, LONG_SUM(count) AS edit_count, DOUBLE_SUM(added) AS chars_added FROM wikipedia WHERE interval BETWEEN 2010-01-01T00:00:00.000Z AND 2020-01-01T00:00:00.000Z BREAK BY 'minute' HINT('timeseries');";
        String q1 = "SELECT timestamp, page, LONG_SUM(count) AS edit_count FROM wikipedia WHERE interval BETWEEN 2010-01-01 AND 2020-01-01 AND country='United States' BREAK BY 'all' GROUP BY page  ORDER BY edit_count DESC LIMIT 10;";
        String q2 = "SELECT page, LONG_SUM(count) AS edit_count FROM wikipedia WHERE interval BETWEEN 2010-01-01T00:00:00.000Z AND 2020-01-01T00:00:00.000Z AND country='United States' BREAK BY 'minute' GROUP BY page  LIMIT 10;";
        DDataSource driver = new DDataSource("localhost", 4080, "localhost", 8082, null, 3128);
        Either<String, Either<Joiner4All, Mapper4All>> result = driver.query(q, true, "sql");
        System.out.println(result.right().get().right().get());
    }
}
