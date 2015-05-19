-- Start the Derby network server 
--  cd $DERBY_HOME/lib/; java -jar derbyrun.jar server start
-- Start the Derby client
-- ij 
-- connect 'jdbc:derby://localhost:1527/indexerDB;create=true'
-- Then run the following create statements.

CREATE TABLE DataSource (
    id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    name VARCHAR(64) NOT NULL,
    startTime BIGINT,
    spinFromTime BIGINT,
    endTime BIGINT,
    frequency VARCHAR(64) NOT NULL,
    status VARCHAR(64) NOT NULL,
    templatePath VARCHAR(256) NOT NULL,
    delimiter VARCHAR(4) NOT NULL,
    listDelimiter VARCHAR(4) NOT NULL,
    templateSql VARCHAR(2000) NOT NULL,
    CONSTRAINT dataSource_pk PRIMARY KEY (id)
) ;

CREATE TABLE StatusTrail (
    id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    dataSourceId INTEGER CONSTRAINT dataSource_fk  REFERENCES DataSource (id) ON DELETE CASCADE ON UPDATE RESTRICT,
    nominalTime BIGINT,
    status VARCHAR(64) NOT NULL,
    givenUp INTEGER DEFAULT 0, -- non-zero value means we have 'givenUp'
    attemptsDone INTEGER DEFAULT 0, -- 'givenUp' is set to non-zero when attemptDone reaches max configured.
    taskId VARCHAR(128),
    CONSTRAINT statusTrail_pk PRIMARY KEY (id)
) ;
