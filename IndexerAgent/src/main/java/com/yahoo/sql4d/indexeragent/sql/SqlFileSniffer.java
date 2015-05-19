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

import com.yahoo.sql4d.DCompiler;
import com.yahoo.sql4d.InsertProgram;
import com.yahoo.sql4d.Program;
import static com.yahoo.sql4d.indexeragent.Agent.db;
import com.yahoo.sql4d.indexeragent.meta.JobFreq;
import com.yahoo.sql4d.indexeragent.meta.JobStatus;
import com.yahoo.sql4d.indexeragent.meta.beans.DataSource;
import com.yahoo.sql4d.indexeragent.util.*;
import com.yahoo.sql4d.insert.BasicInsertMeta;
import com.yahoo.sql4d.insert.BatchInsertMeta;
import com.yahoo.sql4d.query.nodes.Interval;
import static com.yahoo.sql4d.utils.TimeUtils.getDateTime;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Observes change to sql files and calls the corresponding event handlers. The 
 * callbacks can also be called directly in business logic as it is stateless and thread safe.
 * @author srikalyan
 */
public class SqlFileSniffer extends FileSniffer {
    private static final Logger log = LoggerFactory.getLogger(SqlFileSniffer.class);
    
    public SqlFileSniffer(String pathToSniff) {
        super(pathToSniff, ".sql");
    }
    
    @Override
    public void onCreate(Path path) {
        addOrUpdateTable(path.toFile());
    }
    
    @Override
    public void onDelete(Path path) {
        String fileNameOnly = path.getFileName().toString().replaceAll(".sql", "");
        DataSource existingDs = db().getDataSource(fileNameOnly);
        if (existingDs != null) {
            db().removeDataSource(existingDs);
        }
    }
    
    @Override
    public void onModify(Path path) {
        addOrUpdateTable(path.toFile());
    }
    
    /**
     * If a sql file is added/updated this can be called.
     * @param file 
     */
    private void addOrUpdateTable(File file) {
        try {
            String insertStmnt = FileUtils.readFileToString(file);
            DataSource ds = processSql(insertStmnt);
            DataSource existingDs = db().getDataSource(ds.getName());
            if (existingDs == null) {//We never saw this table before.
                db().addOrUpdateDataSource(ds);
                return;
            }
            // If startTime/endTime/templatePath changed then we should update the table.
            if (existingDs.getStartTime() != ds.getStartTime() || 
                    existingDs.getEndTime() != ds.getEndTime() ||
                    !existingDs.getTemplatePath().equals(ds.getTemplatePath())) {
                // We have to reuse the existing entity bean(else update will fail).
                existingDs.updateFrom(ds);
                db().addOrUpdateDataSource(existingDs);
            }                 
        } catch (IOException ex) {
            log.error("Exception while loading druid sql file {} : {}", file, ex);
        }
    }
    
    /**
     * Creates DataSource for the given Sql insert statement.
     * @param insertStmntStr
     * @return 
     */
    private DataSource processSql(String insertStmntStr) {
        Program pgm = DCompiler.compileSql(insertStmntStr);
        if (!(pgm instanceof InsertProgram)) {
            log.error("Ignoring program {} . Only inserts are supported", insertStmntStr);
            return null;
        }
        InsertProgram insertPgm = (InsertProgram)pgm;
        DataSource ds = new DataSource();
        switch(insertPgm.getStmntType()) {
            case INSERT:
                BasicInsertMeta stmt = (BasicInsertMeta)insertPgm.nthStmnt(0);                
                Interval interval = stmt.granularitySpec.interval;
                // Round to nearest hour(zero out the mins, secs and millis)
                long startTime = getDateTime(interval.startTime).withMinuteOfHour(0).withSecondOfMinute(0).withMillisOfSecond(0).getMillis();
                ds.setName(stmt.dataSource).
                        setDelimiter(stmt.delimiter).
                        setListDelimiter(stmt.listDelimiter).
                        setTemplatePath(stmt.dataPath).
                        setStartTime(startTime).
                        setSpinFromTime(startTime).
                        setFrequency(JobFreq.valueOf(stmt.granularitySpec.gran)).
                        setEndTime(getDateTime(interval.endTime).getMillis()).
                        setStatus(JobStatus.not_done).
                        setTemplateSql(templatizeSql(insertStmntStr, interval));
                break;
            case INSERT_HADOOP:
                BatchInsertMeta bStmt = (BatchInsertMeta)insertPgm.nthStmnt(0);
                Interval bInterval = bStmt.granularitySpec.interval;
                // Round to nearest hour(zero out the mins, secs and millis)
                long startBTime = getDateTime(bInterval.startTime).withMinuteOfHour(0).withSecondOfMinute(0).withMillisOfSecond(0).getMillis();
                ds.setName(bStmt.dataSource).
                        setDelimiter(bStmt.delimiter).
                        setListDelimiter(bStmt.listDelimiter).
                        setTemplatePath(bStmt.inputSpec.getRawPath()).
                        setStartTime(startBTime).
                        setSpinFromTime(startBTime).
                        setFrequency(JobFreq.valueOf(bStmt.granularitySpec.gran)).
                        setEndTime(getDateTime(bInterval.endTime).getMillis()).
                        setStatus(JobStatus.not_done).
                        setTemplateSql(templatizeSql(insertStmntStr, bInterval));
                break;
            case INSERT_REALTIME:
                log.error("Realtime insert currently unsupported {}", pgm);
                return null;
        }
        return ds;
    }
    
    private String templatizeSql(String payload, Interval interval) {
        return payload.replaceAll(interval.startTime, ":startTime").
                replaceAll(interval.endTime, ":endTime");
    }
}
