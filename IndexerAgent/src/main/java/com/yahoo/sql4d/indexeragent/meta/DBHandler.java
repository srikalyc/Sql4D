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
package com.yahoo.sql4d.indexeragent.meta;

import com.google.common.collect.ImmutableMap;
import static com.yahoo.sql4d.indexeragent.Agent.*;
import static com.yahoo.sql4d.indexeragent.sql.SqlMeta.*;
import com.yahoo.sql4d.indexeragent.meta.beans.DataSource;
import com.yahoo.sql4d.indexeragent.meta.beans.StatusTrail;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author srikalyan
 */
public class DBHandler {
    private static final Logger log = LoggerFactory.getLogger(DBHandler.class);
    private final EntityManagerFactory emFactory;
    private final EntityManager em;
    
    public DBHandler() {
        String host = getHost();
        int port = getPort();
        String id = getId();
        String password = getPassword();
        String dbName = getDbName();
        String dbType = getDbType();
        
        String connectUrl, dialect, driver;
        
        switch(dbType) {
            case "mysql":
                connectUrl = String.format("jdbc:mysql://%s:%d/%s?autoReconnectForPools=true", host, port, dbName);
                driver = "com.mysql.jdbc.Driver";
                dialect = "org.hibernate.dialect.MySQLDialect";
                break;
            case "derby" :
            default:
                connectUrl = String.format("jdbc:derby://%s:%d/%s;create=true", host, port, dbName);
                driver = "org.apache.derby.jdbc.ClientDriver";
                dialect = "org.hibernate.dialect.DerbyDialect";
        }
        
        Map<String, String> configOverride = ImmutableMap.of(
                "javax.persistence.jdbc.url", connectUrl,
                "javax.persistence.jdbc.user", id,
                "javax.persistence.jdbc.password", password,
                "hibernate.dialect", dialect,
                "javax.persistence.jdbc.driver", driver);
        log.info("Overriding database configuration : {}", configOverride);
        emFactory = Persistence.createEntityManagerFactory("indexerAgent", configOverride);
        em = emFactory.createEntityManager();
    }
    
    public void addOrUpdateDataSource(DataSource ds) {
        em.getTransaction().begin();
        em.persist(ds);
        em.getTransaction().commit();
    }
    
    public void removeDataSource(DataSource ds) {
        em.getTransaction().begin();
        em.remove(ds);
        em.getTransaction().commit();
    }

    public void addOrUpdateStatusTrail(StatusTrail st) {
        em.getTransaction().begin();
        em.persist(st);
        em.getTransaction().commit();
    }

    public List<DataSource> getAllDataSources() {
        return em.createQuery("SELECT ds FROM DataSource ds", DataSource.class).getResultList();        
    }

    public DataSource getDataSource(String tableName) {
        List<DataSource> resultList = em.createQuery("SELECT ds FROM DataSource ds WHERE ds.name = :name", DataSource.class).setParameter("name", tableName).getResultList();        
        return resultList.isEmpty()?null:resultList.get(0);
    }
    
    /**
     * Tasks whose status:not_done and givenUp:zero
     * @param tableName
     * @param maxNominalTime
     * @return 
     */
    public List<StatusTrail> getIncompleteTasks(String tableName, long maxNominalTime) {
        DataSource ds = getDataSource(tableName);
        return em.createQuery("SELECT st FROM StatusTrail st WHERE st.dataSourceId = :dataSourceId "
                + "AND st.status == 'not_done' AND st.givenUp == 0 AND st.nominalTime <= :nominalTime", 
                StatusTrail.class).
                setParameter("dataSourceId", ds.getId()).
                setParameter("nominalTime", maxNominalTime).getResultList();        
    }

    /**
     * Change the status of a task.
     * @param st
     * @param success 
     */
    public void markTask(StatusTrail st, boolean success) {        
        st.setStatus(success ? JobStatus.done : JobStatus.not_done);
        st.setAttemptsDone(st.getAttemptsDone() + 1);
        st.setGivenUp(st.getAttemptsDone() >= getMaxTaskAttempts() ? 1 : 0);
        addOrUpdateStatusTrail(st);
    }

}