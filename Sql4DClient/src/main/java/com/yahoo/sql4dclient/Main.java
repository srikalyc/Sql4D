/**
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License. 
 * See accompanying LICENSE file.
 */
package com.yahoo.sql4dclient;

import com.yahoo.sql4d.sql4ddriver.DDataSource;
import com.yahoo.sql4d.sql4ddriver.Joiner4All;
import com.yahoo.sql4d.sql4ddriver.Mapper4All;
import com.yahoo.sql4d.sql4ddriver.PrettyPrint;
import static com.yahoo.sql4d.sql4ddriver.Util.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import scala.Either;
import scala.Tuple2;

/**
 * A simple client for firing SQL queries and commands on Druid cluster.
 *
 * @author srikalyan
 */
public class Main {

    private static String ttyConfig;

    private static CommandLineParser parser = null;
    private static final Options options = new Options();
    private static final HelpFormatter formatter = new HelpFormatter();
    private static final String PROMPT = ">";
    private static DDataSource dDriver;
    private static String previousCommand = null;
    private static StringBuilder cmdBuffer = new StringBuilder();

    private static String brokerHost = "";
    private static int brokerPort = 4080;
    private static String coordinatorHost = "";
    private static int coordinatorPort = 8082;
    private static String overlordHost = "";
    private static int overlordPort = 8087;
    private static String mysqlHost = "";
    private static int mysqlPort = 3306;
    private static String mysqlId = "";
    private static String mysqlPasswd = "";
    private static String mysqlDbName = "";
    private static String proxyHost = null;
    private static int proxyPort = 3128;
    
    private static CircularBuffer<String> history;
    
    private static boolean trace = false;
    private static String queryMode = "sql";
    
    private static final String quitRegex = "quit\\s*;";
    private static final String genBeanRegex = "(?i)generateBean\\s*=\\s*(.{1,})\\s*;";
    private static final String traceRegex = "(?i)trace\\s*=\\s*(true|false)\\s*;";
    private static final String queryModeRegex = "(?i)queryMode\\s*=\\s*(sql|json)\\s*;";
    private static final String allTablesRegex = "(?i)show\\s+tables\\s*;";
    private static final String descTableRegex = "(?i)describe\\s+(.{1,})\\s*;";
    private static final String helpRegex = "(?i)help\\s*;";

    private static final Pattern genBeanPattern = Pattern.compile(genBeanRegex);
    private static final Pattern tracePattern = Pattern.compile(traceRegex);
    private static final Pattern queryModePattern = Pattern.compile(queryModeRegex);
    private static final Pattern allTablesPattern = Pattern.compile(allTablesRegex);
    private static final Pattern descTablePattern = Pattern.compile(descTableRegex);
    private static final Pattern helpPattern = Pattern.compile(helpRegex);
    
    private static final InputStream sysIn = System.in;
    
    private static void defineOptions() {
        options.addOption("bh", "broker_host", true, "Druid broker node hostname/Ip");
        options.addOption("bp", "broker_port", true, "Druid broker node port");
        options.addOption("ch", "coordinator_host", true, "Druid coordinator node hostname/Ip");
        options.addOption("cp", "coordinator_port", true, "Druid coordinator node port");
        options.addOption("oh", "overlord_host", true, "Druid overlord node hostname/Ip");
        options.addOption("op", "overlord_port", true, "Druid overlord node port");
        options.addOption("mh", "mysql_host", true, "Druid MySql hostname/Ip");
        options.addOption("mp", "mysql_port", true, "Druid MySql node port");
        options.addOption("mid", "mysql_id", true, "Druid MySql user Id");
        options.addOption("mpw", "mysql_passwd", true, "Druid MySql password");
        options.addOption("mdb", "mysql_dbname", true, "Druid MySql db name");
        options.addOption("pp", "proxy_port", true, "Druid proxy node port");
        options.addOption("i", "history", true, "Number of commands in history");
        parser = new BasicParser();
    }

    private static void printUsage() {
        formatter.printHelp("dsql ", options);
        println("(OR)");
        formatter.printHelp("java -jar Sql4DClient-1.0.0.jar", options);
        System.exit(1);
    }
    
    private static void printHelp() {
        println(" 1. select/crud statements   (GroupBy, TimeSeries, TopN, Select, Search, Insert). See wiki for examples: https://github.com/srikalyc/Sql4D/wiki/Sql4DCompiler");
        println(" 2. generatebean=BeanName (This command must be preceding a SQL, it generates a java source file BeanName.java which extends DruidBaseBean.");
        println(" 3. trace=[true|false]    (When enabled prints out compiled JSON query)");
        println(" 4. querymode=[sql|json]  (Default is sql, when mode is json it is fired directly)");
        println(" 5. show tables           (Displays all the datasources)");
        println(" 6. describe TableName    (Displays the given datasource's schema)");
        println(" 7. quit                  (Exits client)");
        println("    All commands are terminated by ;");
        println("");
    }

    private static void init(String[] args) {
        defineOptions();
        try {
            CommandLine cmd = parser.parse(options, args);
            if (!cmd.hasOption("bh") || !cmd.hasOption("bp")
                    || !cmd.hasOption("ch") || !cmd.hasOption("cp")
                    || !cmd.hasOption("oh") || !cmd.hasOption("op")
                     || !cmd.hasOption("i")) {
                printUsage();
            }
            brokerHost = getOptionValue(cmd, "bh", "broker_host");
            brokerPort = Integer.parseInt(getOptionValue(cmd, "bp", "broker_port"));
            coordinatorHost = getOptionValue(cmd, "ch", "coordinator_host");
            coordinatorPort = Integer.parseInt(getOptionValue(cmd, "cp", "coordinator_port"));
            overlordHost = getOptionValue(cmd, "oh", "overlord_host");
            overlordPort = Integer.parseInt(getOptionValue(cmd, "op", "overlord_port"));
            mysqlHost = getOptionValue(cmd, "mh", "mysql_host");
            mysqlPort = Integer.parseInt(getOptionValue(cmd, "mp", "mysql_port"));
            mysqlId = getOptionValue(cmd, "mid", "mysql_id");
            mysqlPasswd = getOptionValue(cmd, "mpw", "mysql_passwd");
            mysqlDbName = getOptionValue(cmd, "mdb", "mysql_dbname");
            
            dDriver = new DDataSource(brokerHost, brokerPort, coordinatorHost, coordinatorPort, overlordHost, 
                    overlordPort, mysqlHost, mysqlPort, mysqlId, mysqlPasswd, mysqlDbName);
            proxyHost = getOptionValue(cmd, "ph", "proxy_host");
            if (proxyHost != null) {
                proxyPort = Integer.parseInt(getOptionValue(cmd, "pp", "proxy_port"));
                dDriver.setProxy(proxyHost, proxyPort);
            }
            
            history = new CircularBuffer<>(Integer.parseInt(getOptionValue(cmd, "i", "history")));
            
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    private static String getOptionValue(CommandLine cmd, String opt1, String opt2) {
        if (opt1 != null && cmd.hasOption(opt1)) {
            return cmd.getOptionValue(opt1);
        } else if (opt2 != null && cmd.hasOption(opt2)) {
            return cmd.getOptionValue(opt2);
        }
        return null;
    }
        
    private static void readCommands() {
        try {
            int ip = -1;
            char ipChar = ' ';
            boolean readyCommand = false;
            String frozenCommand = "";
            
            setNonCanonicalTTY();
            print(PROMPT);
            while ((ip = sysIn.read()) != -1) {
                if (ip == 127) {// Simulate backspace
                    if (cmdBuffer.length() > 0) {
                        backSpace(1);
                        cmdBuffer.deleteCharAt(cmdBuffer.length() - 1);
                    }
                    continue;
                }
                ipChar = (char)ip;
                if (ip == 21 || ip == 4) {
                    if (history.isEmpty()) {
                        continue;
                    }
                    backSpace(cmdBuffer.length());
                    if (ip == 21) {// Cntrl-Up
                        cmdBuffer = new StringBuilder(history.getUp());
                    } else {// Cntrl-Down
                        cmdBuffer = new StringBuilder(history.getDown());
                    }
                    print(cmdBuffer.toString());
                    readyCommand = true;
                    continue;
                }
                
                if (ipChar == ';') {// Make the command ready.
                    readyCommand = true;
                    cmdBuffer.append(ipChar);
                } else if (ipChar == '\n') {
                    frozenCommand = cmdBuffer.toString();
                    if (readyCommand) {
                        readyCommand = false;
                        runCommand(frozenCommand);// Execute command.
                    }
                    print(PROMPT);
                } else {
                    cmdBuffer.append(ipChar);
                }
            }

        } catch (IOException ioe) {
            println("Exception while reading input " + ioe);
        } finally {
            try {
                stty(ttyConfig.trim());
            } catch (IOException | InterruptedException e) {
                println("Exception restoring tty config");
            }
        }
    }
    
    private static void backSpace(int times) {
        repeatStrToConsole("\b \b", times);
    }
    
    private static boolean runCommand(String frozenCommand) {
        if (frozenCommand.matches(quitRegex)) {
            println("Good Bye !!");
            System.exit(0);
        } else if (frozenCommand.matches(helpRegex)) {
            Matcher matcher = helpPattern.matcher(frozenCommand);
            if (matcher.matches()) {// Help command.
                printHelp();
            }                         
        } else if (frozenCommand.matches(genBeanRegex)) {
            Matcher matcher = genBeanPattern.matcher(frozenCommand);
            if (matcher.matches()) {// Generate bean command.
                BeanGenUtil.generateBean(previousCommand, matcher.group(1));
            }                         
        } else if (frozenCommand.matches(traceRegex)) {
            Matcher matcher = tracePattern.matcher(frozenCommand);
            if (matcher.matches()) {// Trace command.
                trace = Boolean.valueOf(matcher.group(1));
            }                      
        } else if (frozenCommand.matches(queryModeRegex)) {
            Matcher matcher = queryModePattern.matcher(frozenCommand);
            if (matcher.matches()) {// QueryMode command.
                queryMode = matcher.group(1);
            }                      
        } else if (frozenCommand.matches(allTablesRegex)) {
            Matcher matcher = allTablesPattern.matcher(frozenCommand);
            if (matcher.matches()) {// Show tables command.
                Either<String,List<String>> dataSourcesRes = dDriver.dataSources();
                if (dataSourcesRes.isLeft()) {
                    println(dataSourcesRes.left().get());
                }
                List<String> dataSources = dataSourcesRes.right().get();
                Collections.sort(dataSources);
                String [][] dataSourcesTable = new String[dataSources.size() + 1][];
                dataSourcesTable[0] = new String[] {"Tables"};
                for (int i = 0;i < dataSources.size();i++) {
                    dataSourcesTable[i + 1] = new String[] {dataSources.get(i)};
                }
                PrettyPrint.print(dataSourcesTable);
            }                      
        } else if (frozenCommand.matches(descTableRegex)) {
            Matcher matcher = descTablePattern.matcher(frozenCommand);
            if (matcher.matches()) {// Show tables command.
                String tableName = matcher.group(1);
                Either<String, Tuple2<List<String>, List<String>>> dataSourceDescRes = dDriver.aboutDataSource(tableName);
                if (dataSourceDescRes.isLeft()) {
                    println(dataSourceDescRes.left().get());
                }
                List<String> dims = dataSourceDescRes.right().get()._1();
                Collections.sort(dims);
                List<String> metrics = dataSourceDescRes.right().get()._2();
                Collections.sort(metrics);
                String [][] table = new String[dims.size() + metrics.size() + 2][];// 1 for header + 1 for timestamp
                table[0] = new String[] {"Field", "Type"};
                table[1] = new String[] {"timestamp", "Implicit_Dimension"};
                int i = 2;
                for (;i < dims.size() + 2;i++) {
                    table[i] = new String[] {dims.get(i - 2), "Dimension"};
                }
                for (;i < dims.size() + metrics.size() + 2;i++) {
                    table[i] = new String[] {metrics.get(i - dims.size() - 2), "Metric"};
                }
                PrettyPrint.print(table);
            }                      
        } else {// Sql/json command.
            long start = System.currentTimeMillis();
            Either<String, Either<Joiner4All, Mapper4All>> result = dDriver.query(frozenCommand, trace, queryMode);
            long queryTime = System.currentTimeMillis() - start;
            if (result.isLeft()) {
                println(result.left().get());
                printf("(%f sec)\n", queryTime/1000.0);
            } else {
                Either<Joiner4All, Mapper4All> goodResult = result.right().get();
                if (goodResult.isLeft()) {
                    PrettyPrint.print(goodResult.left().get());
                    printf("%d rows in set (%f sec)\n",goodResult.left().get().baseAllRows.size(), queryTime/1000.0);
                } else {
                    PrettyPrint.print(goodResult.right().get());
                    printf("%d rows in set (%f sec)\n",goodResult.right().get().baseAllRows.size(), queryTime/1000.0);
                }
            }
        }
        history.add(frozenCommand);
        previousCommand = frozenCommand;
        cmdBuffer = new StringBuilder();
        return true;
    } 
    
    private static void repeatCharToConsole(char c, int numTimes) {
        for (int i = 0;i < numTimes;i++) {
            print(c);
        }
    }

    private static void repeatStrToConsole(String s, int numTimes) {
        for (int i = 0;i < numTimes;i++) {
            print(s);
        }
    }
    private static void setNonCanonicalTTY() {
        try {
            ttyConfig = stty("-g");
            stty("-icanon min 1");
            stty("-echoe");
            stty("-echoctl");
            stty("-echoprt");
            
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Run the stty command with arguments in the active terminal.
     */
    private static String stty(final String args) throws IOException, InterruptedException {
        return runCommand(new String[]{
            "sh", "-c", String.format("stty %s  < /dev/tty", args)
        });
    }

    /**
     * Run the command synchronously and return clubbed standard error and 
     * output stream's data.
     */
    private static String runCommand(final String[] cmd)
            throws IOException, InterruptedException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Process process = Runtime.getRuntime().exec(cmd);
        int c;
        InputStream in = process.getInputStream();
        while ((c = in.read()) != -1) {
            baos.write(c);
        }
        in = process.getErrorStream();
        while ((c = in.read()) != -1) {
            baos.write(c);
        }
        process.waitFor();
        return new String(baos.toByteArray());
    }
    
    public static void main(String[] args) {
        init(args);
        readCommands();
    }
}
