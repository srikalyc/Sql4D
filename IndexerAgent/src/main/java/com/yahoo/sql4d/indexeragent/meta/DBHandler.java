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
import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author srikalyan
 */
public class DBHandler {
    private static final Logger log = LoggerFactory.getLogger(DBHandler.class);
    private final EntityManagerFactory emFactory;
    
    enum Action { ADD, UPDATE, DELETE }
    
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
    }
    
    private EntityManager getEntityManager() {
        return emFactory.createEntityManager();
    }
    
    private void addUpdateDeleteEntity(Object entity, Action action) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            switch (action) {
                case ADD:
                    em.persist(entity);
                    break;
                case UPDATE:
                    em.merge(entity);
                    break;
                case DELETE:
                    em.remove(entity);
                    break;
            }
        } catch(RuntimeException e) {            
            log.error("Something wrong persisting/merging/removing entity {}, so rolling back . Exception is {}", entity, ExceptionUtils.getStackTrace(e));
            em.getTransaction().rollback();
        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().commit();
            }  
            em.close();
        }
    }

    public void addDataSource(DataSource ds) {
        addUpdateDeleteEntity(ds, Action.ADD);
    }
    
    public void updateDataSource(DataSource ds) {
        addUpdateDeleteEntity(ds, Action.UPDATE);
    }
    
    public void removeDataSource(DataSource ds) {
        addUpdateDeleteEntity(ds, Action.DELETE);
    }

    public void addStatusTrail(StatusTrail st) {
        addUpdateDeleteEntity(st, Action.ADD);
    }

    public void updateStatusTrail(StatusTrail st) {
        addUpdateDeleteEntity(st, Action.UPDATE);
    }
    
    public void removeStatusTrail(StatusTrail st) {
        addUpdateDeleteEntity(st, Action.DELETE);
    }

    public List<DataSource> getAllDataSources() {
        EntityManager em = getEntityManager();
        try {        
            return em.createQuery("SELECT ds FROM DataSource ds", DataSource.class).getResultList();        
        } finally {
            em.close();
        }
    }

    public DataSource getDataSource(String tableName) {
        EntityManager em = getEntityManager();
        try {        
            List<DataSource> resultList = em.createQuery("SELECT ds FROM DataSource ds WHERE ds.name = :name", DataSource.class).setParameter("name", tableName).getResultList();        
            return resultList.isEmpty()?null:resultList.get(0);
        } finally {
            em.close();
        }
    }
    
    public DataSource getDataSource(int id) {
        EntityManager em = getEntityManager();
        try {        
            return em.find(DataSource.class, id);
        } finally {
            em.close();
        }
    }
    /**
     * Tasks whose status:not_done and givenUp:zero
     * @param ds
     * @return 
     */
    public List<StatusTrail> getIncompleteTasks(DataSource ds) {
        EntityManager em = getEntityManager();
        try {        
            return em.createQuery("SELECT st FROM StatusTrail st WHERE st.dataSourceId = :dataSourceId "
                    + "AND st.status = 'not_done' AND st.givenUp = 0 ORDER BY st.id DESC", 
                    StatusTrail.class).
                    setParameter("dataSourceId", ds.getId()).getResultList();        
        } finally {
            em.close();
        }
    }

    /**
     * 
     * @return 
     */
    public List<StatusTrail> getAllIncompleteTasks() {
        EntityManager em = getEntityManager();
        try {        
            return em.createQuery("SELECT st FROM StatusTrail st WHERE  "
                    + " st.status = 'not_done' AND st.givenUp = 0 ORDER BY st.id DESC", 
                    StatusTrail.class).getResultList();        
        } finally {
            em.close();
        }
    }

    /**
     * 
     * @return 
     */
    public List<StatusTrail> getAllInprogressTasks() {
        EntityManager em = getEntityManager();
        try {        
            return em.createQuery("SELECT st FROM StatusTrail st WHERE  "
                    + " st.status = 'in_progress' AND st.givenUp = 0", 
                    StatusTrail.class).getResultList();        
        } finally {
            em.close();
        }
    }

    /**
     * 
     * @return 
     */
    public long getInprogressTasksCount() {
        EntityManager em = getEntityManager();
        try {        
            return (long)em.createQuery("SELECT COUNT(st.id) FROM StatusTrail st WHERE  "
                    + " st.status = 'in_progress' AND st.givenUp = 0").getSingleResult();        
        } finally {
            em.close();
        }
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
        updateStatusTrail(st);
    }

    public void shutdown() {
        log.info("Shutting down and cleaning up database connections..");
        emFactory.close();
    }
}