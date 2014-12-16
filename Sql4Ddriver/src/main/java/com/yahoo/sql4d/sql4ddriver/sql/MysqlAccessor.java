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
package com.yahoo.sql4d.sql4ddriver.sql;

import com.google.common.collect.ImmutableMap;
import com.yahoo.sql4d.query.nodes.Interval;
import java.sql.Connection;
import org.apache.commons.pool.BasePoolableObjectFactory;
import static java.lang.String.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.apache.commons.pool.impl.GenericObjectPoolFactory;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import scala.Tuple2;
/**
 * Mysql Actions. Right now handle druid specific queries, split this into generic
 * mysql accessor and druid specific changes when this grows in size.
 *
 * @author srikalyan
 */
public class MysqlAccessor extends BasePoolableObjectFactory<Tuple2<DataSource, Connection>>{

    private final String connectorUrl = "jdbc:mysql://%s:%d/%s?autoReconnectForPools=true";
    private String host = "localhost";
    private int port = 3306;
    private String id = "druid";//druid by default.
    private String password = "diurd";//diurd by default.
    private String db = "druid";//druid by default
    private ObjectPool<Connection> pool = null ;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(MysqlAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public MysqlAccessor() {
        this("localhost", 3306, "druid", "diurd", "druid");
    }

    public MysqlAccessor(String host, int port) {
        this(host, port, "druid", "diurd", "druid");
    }

    public MysqlAccessor(String host, int port, String id, String passwd) {
        this(host, port, id, passwd, "druid");
    }

    public MysqlAccessor(String host, int port, String id, String passwd, String db) {
        this.host = host;
        this.port = port;
        this.id = id;
        this.password = passwd;
        this.db = db;
        init();
    }
    
    private void init() {
        GenericObjectPool.Config config = new GenericObjectPool.Config();
        config.maxActive = 2;//TODO: Make this configurable.
        config.testOnBorrow = true;
        config.testWhileIdle = true;
        config.timeBetweenEvictionRunsMillis = 10000;
        config.minEvictableIdleTimeMillis = 60000;
        GenericObjectPoolFactory genericObjectPoolFactory = new GenericObjectPoolFactory(this, config);
        pool = genericObjectPoolFactory.createPool();
    }
    
    @Override
    public Tuple2<DataSource, Connection> makeObject() throws Exception {
        DataSource ds = new DriverManagerDataSource(format(connectorUrl, host, port, db), id, password);
        return new Tuple2<>(ds, ds.getConnection());
    }

    public Connection getConnection() {
        try {
            return pool.borrowObject();
        } catch (Exception ex) {
            Logger.getLogger(MysqlAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void shutdown() {
        try {
            pool.close();
        } catch (Exception ex) {
            Logger.getLogger(MysqlAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Map<String, Object>> query(Map<String, String> params, String query) {
        List<Map<String, Object>> result = null;
        try {
            Tuple2<DataSource, Connection> conn = makeObject();
            NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(conn._1());
            result = jdbcTemplate.queryForList(query, params);
        } catch (Exception ex) {
            Logger.getLogger(MysqlAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    /**
     * Suitable for CRUD operations where no result set is expected.
     * @param params
     * @param query 
     * @return  
     */
    public boolean execute(Map<String, String> params, String query) {
        final AtomicBoolean result = new AtomicBoolean(false);
        try {
            Tuple2<DataSource, Connection> conn = makeObject();
            NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(conn._1());
            jdbcTemplate.execute(query, params, new PreparedStatementCallback<Void>() {
                @Override
                public Void doInPreparedStatement(PreparedStatement ps) {
                    try {
                        result.set(ps.execute());
                    } catch(SQLException e) {
                        result.set(false);
                    }
                    return null;
                }
            });
        } catch (Exception ex) {
            Logger.getLogger(MysqlAccessor.class.getName()).log(Level.SEVERE, null, ex);
            result.set(false);
        }
        return result.get();
    }
    
    public List<Map<String, Object>> segmentsInRange(String table, Interval interval) {
        return query(ImmutableMap.of("dataSource", table,
                "iStart", interval.startTime,
                "iEnd", interval.endTime), DAODictionary.SEGMENTS_IN_RANGE);
    }

    public List<Map<String, Object>> usedSegmentsInRange(String table, Interval interval) {
        return query(ImmutableMap.of("dataSource", table,
                "iStart", interval.startTime,
                "iEnd", interval.endTime,
                "used", "1"), DAODictionary.USED_SEGMENTS_IN_RANGE);
    }

    public boolean disableSegmentsInRange(String table, Interval interval) {
        return execute(ImmutableMap.of("dataSource", table,
                "iStart", interval.startTime,
                "iEnd", interval.endTime), DAODictionary.DISABLE_SEGMENTS_IN_RANGE);
    }

    public boolean disableAllSegments(String table) {
        return execute(ImmutableMap.of("dataSource", table), DAODictionary.DISABLE_ALL_SEGMENTS);
    }

    public static void main(String[] args) {
        MysqlAccessor accessor = new MysqlAccessor();
        System.out.println(accessor.usedSegmentsInRange("abf2", new Interval("2014-10-31/2014-11-01")));
        accessor.shutdown();
    }
}
