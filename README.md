Sql4D -> SQL interface to druid(see http://druid.io/ ), has 3 sub components

1) SQL -> Json compiler,
2) Terminal based SQL client interface,
3) Java JDBC like driver for druid.

Tutors
===========
| Description             | Where to get from      | 
| --------------------------------- |:-------------| 
| Getting started guide         | https://github.com/srikalyc/Sql4D/wiki         |
| A first look at druid with Sql         | http://druidwithsql.tumblr.com/post/98578718282/a-first-look-at-druid-with-sql  |
| Insert and deleting data in druid with Sql         | http://druidwithsql.tumblr.com/post/108054375927/simple-insert-deleting-data-drop-table-in-druid |
| Java JDBC access to druid         | http://druidwithsql.tumblr.com/post/111014674922/accessing-druid-through-java-driver-interface |
| Indexer Agent to ingest periodic data sets        | https://github.com/srikalyc/Sql4D/wiki/Using-Indexer-Agent-for-batch-ingestion |


Compatibiltiy with druid
=========================
| Druid Version        | SQL4D Version(Maven Central)      | Comments      |
| ------------- |:-------------:| :-------------:| 
| 0.6.X         | 3.X.X         | You could also instead clone the Sql4D, and build against the tag v3.5.6 |
| 0.7.X         | 4.X.X         | You could also instead clone the Sql4D, and build against the master |

  

NOTE: Sql4D/sql4ddriver/.../PrettyPrint.java contains a code snippet modified from a publication here: http://stackoverflow.com/questions/11383070/pretty-print-2d-array-in-java . The
 text/code is licensed under Creative Commons-BY-SA 3.0.

