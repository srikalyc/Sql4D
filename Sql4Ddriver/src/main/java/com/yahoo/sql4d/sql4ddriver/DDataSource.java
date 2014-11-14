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
import com.yahoo.sql4d.query.RequestType;
import static com.yahoo.sql4d.sql4ddriver.Util.*;

import com.yahoo.sql4d.DCompiler;
import com.yahoo.sql4d.InsertProgram;
import com.yahoo.sql4d.Program;
import com.yahoo.sql4d.QueryProgram;
import com.yahoo.sql4d.delete.DeleteMeta;
import com.yahoo.sql4d.drop.DropMeta;
import com.yahoo.sql4d.insert.InsertMeta;
import com.yahoo.sql4d.query.QueryMeta;
import com.yahoo.sql4d.query.select.SelectQueryMeta;
import com.yahoo.sql4d.sql4ddriver.rowmapper.DruidBaseBean;
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

    public DDataSource(String bHost, int bPort) {
        broker = new BrokerAccessor(bHost, bPort);
    }

    public DDataSource(String bHost, int bPort, String cHost, int cPort) {
        this(bHost, bPort);
        coordinator = new CoordinatorAccessor(cHost, cPort);
    }

    public DDataSource(String bHost, int bPort, String cHost, int cPort, String oHost, int oPort) {
        this(bHost, bPort, cHost, cPort);
        overlord = new OverlordAccessor(oHost, oPort);
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
     */
    public Program<BaseStatementMeta> getCompiledAST(String sqlQuery) {
        Program<BaseStatementMeta> pgm = DCompiler.compileSql(preprocessSqlQuery(sqlQuery));
        for (BaseStatementMeta stmnt : pgm.getAllStmnts()) {
            if (stmnt instanceof QueryMeta) {
                QueryMeta query = (QueryMeta) stmnt;
                if (query.queryType == RequestType.SELECT) {//classifyColumnsToDimAndMetrics
                    Either<String, Tuple2<List<String>, List<String>>> dataSourceDescRes = coordinator.aboutDataSource(stmnt.dataSource);
                    if (dataSourceDescRes.isLeft()) {
                        println(dataSourceDescRes.left().get());
                    }
                    ((SelectQueryMeta) query).postProcess(dataSourceDescRes.right().get());
                }
            } else if (stmnt instanceof InsertMeta) {//TODO: Handle this.

            } else if (stmnt instanceof DeleteMeta) {//TODO: Handle this.

            } else if (stmnt instanceof DropMeta) {//TODO: Handle this.

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
        Program pgm = getCompiledAST(sqlQuery);
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
     * Common interface to Query, Insert , Delete, Drop(but not coordinator commands).
     * @param sqlOrJsonQuery
     * @param printToConsole
     * @param queryMode
     * @return 
     */
    public Either<String, Either<Joiner4All, Mapper4All>> query(String sqlOrJsonQuery, boolean printToConsole, String queryMode) {
        if ("json".equals(queryMode)) {
            Either<String, Either<Mapper4All, JSONArray>> result = broker.fireQuery(sqlOrJsonQuery, true);
            if (result.isLeft()) return new Left<>(result.left().get());
            
            if (printToConsole) {
                println(result.right().get().left().get().toString());
            }
            return new Right<String, Either<Joiner4All, Mapper4All>>(new Right<Joiner4All, Mapper4All>(result.right().get().left().get()));
        }
        Program pgm = getCompiledAST(sqlOrJsonQuery);
        if (printToConsole) {
            println(pgm.toString());
        }
        if (pgm instanceof InsertProgram) {
            InsertProgram iPgm = (InsertProgram) pgm;
            return new Left<>(overlord.fireTask(iPgm.nthStmnt(0)));
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
    
    public static void main(String[] args) {
        String q = "SELECT timestamp, LONG_SUM(count) AS edit_count, DOUBLE_SUM(added) AS chars_added FROM wikipedia WHERE interval BETWEEN 2010-01-01T00:00:00.000Z AND 2020-01-01T00:00:00.000Z BREAK BY 'minute' HINT('timeseries');";
        String q1 = "SELECT timestamp, page, LONG_SUM(count) AS edit_count FROM wikipedia WHERE interval BETWEEN 2010-01-01 AND 2020-01-01 AND country='United States' BREAK BY 'all' GROUP BY page  ORDER BY edit_count DESC LIMIT 10;";
        String q2 = "SELECT page, LONG_SUM(count) AS edit_count FROM wikipedia WHERE interval BETWEEN 2010-01-01T00:00:00.000Z AND 2020-01-01T00:00:00.000Z AND country='United States' BREAK BY 'minute' GROUP BY page  LIMIT 10;";
        DDataSource driver = new DDataSource("localhost", 4080, "localhost", 8082, null, 3128);
        Either<String, Either<Joiner4All, Mapper4All>> result = driver.query(q, true, "sql");
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
