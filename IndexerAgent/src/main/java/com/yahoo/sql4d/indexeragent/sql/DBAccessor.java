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
package com.yahoo.sql4d.indexeragent.sql;

import java.io.PrintWriter;
import java.sql.Connection;
import org.apache.commons.pool.BasePoolableObjectFactory;
import static java.lang.String.*;
import static org.apache.commons.lang.SystemUtils.*;
import static com.yahoo.sql4d.indexeragent.sql.DerbyDAODictionary.*;
import java.net.InetAddress;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import org.apache.derby.drda.NetworkServerControl;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import scala.Tuple2;
/**
 *
 * @author srikalyan
 */
public class DBAccessor extends BasePoolableObjectFactory<Tuple2<DataSource, Connection>> {
    
    protected String connectorUrl = "jdbc:mysql://%s:%d/%s?autoReconnectForPools=true";
    private String host = "localhost";
    private int port = 3306;
    private String id = "druid";//druid by default.
    private String password = "diurd";//diurd by default.
    private String db = "druid";//druid by default
    private ObjectPool<Tuple2<DataSource, Connection>> pool = null ;
    private int MAX_RETRY = 10;
    
    private enum DBType {
        MYSQL,
        DERBY_NT
    }
    private NetworkServerControl derbyServer;// We start only if derby DB is used.
    
    private DBType type = DBType.DERBY_NT;
    
    public static DBAccessor forMysql(String host, int port, String id, String passwd, String db) {
        return new DBAccessor(host, port, id, passwd, db, DBType.MYSQL);
    }
    
    // For derby we do not use id/password so null them.
    public static DBAccessor forDerby() {
        return new DBAccessor("localhost", 1527, null, null, "druid", DBType.DERBY_NT);
    }

    private DBAccessor() {
        this("localhost", 3306, "druid", "diurd", "druid", DBType.MYSQL);
    }

    private DBAccessor(String host, int port) {
        this(host, port, "druid", "diurd", "druid", DBType.MYSQL);
    }

    private DBAccessor(String host, int port, String id, String passwd) {
        this(host, port, id, passwd, "druid", DBType.MYSQL);
    }

    private DBAccessor(String host, int port, String id, String passwd, String db, DBType type) {
        this.host = host;
        this.port = port;
        this.id = id;
        this.password = passwd;
        this.db = db;
        init();
    }
    
    private void init() {
        initPool();
        if (type == DBType.DERBY_NT) {/// Start the Derby network server(not embedded one).            
            initDerby();
        } else if (type == DBType.MYSQL) {
            initMysql();
        }
    }
    
    private void initPool() {
        GenericObjectPool.Config config = new GenericObjectPool.Config();
        config.maxActive = 2;//TODO: Make this configurable.
        config.testOnBorrow = true;
        config.testWhileIdle = true;
        config.timeBetweenEvictionRunsMillis = 10000;
        config.minEvictableIdleTimeMillis = 60000;
        GenericObjectPoolFactory genericObjectPoolFactory = new GenericObjectPoolFactory(this, config);
        pool = genericObjectPoolFactory.createPool();
    }
    
    private void initDerby() {
        connectorUrl = format("jdbc:derby://%s:%d/%s/%s;create=true", host, port, (IS_OS_WINDOWS)?"c:\\temp\\IA":"/tmp/IA", db);
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(DBAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.setProperty("derby.drda.startNetworkServer", "true");
        try {
            derbyServer = new NetworkServerControl(InetAddress.getByName(host), port, id, password);
            shutdownDB();
            startDerbyAndWait();
            createTable(CREATE_DATASOURCE);
            createTable(CREATE_STATUS_TRAIL);
            execute(null, DATASOURCE_SAMPLE_INSERT);
            execute(null, STATUSTRAIL_SAMPLE_INSERT);
        } catch (Exception ex) {
            Logger.getLogger(DBAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void initMysql() {
        connectorUrl = format("jdbc:mysql://%s:%d/%s?autoReconnectForPools=true", host, port, db);
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(DBAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Derby startup takes some time.
     * @throws Exception 
     */
    private void startDerbyAndWait() throws Exception {
        derbyServer.start(new PrintWriter(System.out));
        for (int i = 0; i < MAX_RETRY; ++i) {
            try {
                System.out.println("Attempting to reach derby...");
                derbyServer.ping();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Thread.sleep(10);
        }
    }
    
    @Override
    public Tuple2<DataSource, Connection> makeObject() throws Exception {
        DataSource ds = new DriverManagerDataSource(format(connectorUrl, host, port, db), id, password);
        return new Tuple2<>(ds, ds.getConnection());
    }

    @Override
    public void destroyObject(Tuple2<DataSource, Connection> connTuple) throws Exception {
        connTuple._2().close();
    }

    @Override
    public boolean validateObject(Tuple2<DataSource, Connection> conn) {
        try {
            return conn._2().isValid(0);
        } catch (SQLException ex) {
            Logger.getLogger(DBAccessor.class.getName()).log(Level.SEVERE, null, ex);
            try {//Could be due to stale connection. Invalidate the object.
                pool.invalidateObject(conn);
            } catch (Exception ex1) {//TODO: Something serious with DB.
                Logger.getLogger(DBAccessor.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        return false;
    }
    
    public Tuple2<DataSource, Connection> getConnection() {
        try {
            return pool.borrowObject();
        } catch (Exception ex) {
            Logger.getLogger(DBAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void returnConnection(Tuple2<DataSource, Connection> con) {
        try {
            if (con != null) {
                pool.returnObject(con);
            }
        } catch (Exception ex) {
            Logger.getLogger(DBAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void shutdownPool() {
        try {
            pool.clear();
            pool.close();
        } catch (Exception ex) {
            Logger.getLogger(DBAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void shutdownDB() {
        try {
            if (type == DBType.DERBY_NT) {
                derbyServer.shutdown();
            }
        } catch (Exception ex) {
            Logger.getLogger(DBAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * A sql statement(select) from which result set is expected.
     * @param params
     * @param query
     * @return 
     */
    public List<Map<String, Object>> query(Map<String, String> params, String query) {
        List<Map<String, Object>> result = null;
        Tuple2<DataSource, Connection> conn = null;
        try {
            conn = getConnection();
            NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(conn._1());
            result = jdbcTemplate.queryForList(query, params);
        } catch (Exception ex) {
            Logger.getLogger(DBAccessor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            returnConnection(conn);
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
        Tuple2<DataSource, Connection> conn = null;
        try {
            conn = getConnection();
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
            Logger.getLogger(DBAccessor.class.getName()).log(Level.SEVERE, null, ex);
            result.set(false);
        } finally {
            returnConnection(conn);
        }
        return result.get();
    }
    
    /**
     * Check the metadata to see if table already exists, else create one.
     * @param tableName 
     */
    private void createTable(String tableName) {
        Tuple2<DataSource, Connection> conn = null;
        try {
            conn = getConnection();
            DatabaseMetaData meta = conn._2().getMetaData();
            ResultSet rs = meta.getTables(null, null, null, new String[]{"TABLE"});            
            boolean tableExists = false;
            while (rs.next()) {
                if (rs.getString("TABLE_NAME").equalsIgnoreCase(tableName)) {
                    tableExists = true;
                    break;
                }
            }
            if (!tableExists) {
                execute(null, tableName);
            }
        } catch (Exception ex) {
            Logger.getLogger(DBAccessor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            returnConnection(conn);
        }
    }
    
    public static void main(String[] args) {
        DBAccessor accessor = DBAccessor.forDerby();
        System.out.println(accessor.query(null, "SELECT * FROM DataSource"));
        System.out.println(accessor.query(null, "SELECT * FROM StatusTrail"));
        accessor.shutdownPool();
        accessor.shutdownDB();
    }
}
