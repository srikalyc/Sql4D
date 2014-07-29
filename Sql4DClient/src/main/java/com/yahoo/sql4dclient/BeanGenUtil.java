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

import com.yahoo.sql4d.sql4ddriver.Util;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;

/**
 * To auto generate Bean java class for a SQL.
 * @author srikalyan
 */
public class BeanGenUtil {
    //TODO: Extend the following to address join sqls as well.
    private static final Pattern joinSqlPattern = Pattern.compile("(?i)select (.*) from (.*) (join|right_join|left_join) \\((.*)\\) on \\((.*)\\)(;)?");
    private static final Pattern sqlPattern = Pattern.compile("(?i)select (.*) from (.*)(;)?");
    private static final Pattern fieldPattern = Pattern.compile("(.*) (AS|as) (.*)");
    
    //TODO: Extend to generate package structure as well.
    public static void generateBean(String cmd, String beanClassName) {
        Matcher joinSqlMatcher = joinSqlPattern.matcher(cmd);
        if (joinSqlMatcher.matches()) {
             Map<String,String> firstSet = getFields(joinSqlMatcher.group(1));
             Map<String,String> secondSet = null;
             Matcher sqlMatcher = sqlPattern.matcher(joinSqlMatcher.group(4));
             if (sqlMatcher.matches()) {
                secondSet = getFields(sqlMatcher.group(1));
                String joinField = joinSqlMatcher.group(5);
                secondSet.remove(joinField);
                firstSet.putAll(secondSet);
             }
             generate(firstSet, beanClassName);
        } else {
            Matcher sqlMatcher = sqlPattern.matcher(cmd);
            if (sqlMatcher.matches()) {
                generate(getFields(sqlMatcher.group(1)), beanClassName);
            }
        }
    }
    
    private static Map<String, String> getFields(String rawFields) {
        Map<String, String> fields = new HashMap<>();
        String []args = rawFields.split(",");
        for (String arg:args) {
            Matcher fMatcher = fieldPattern.matcher(arg);
            if (fMatcher.matches()) {
                String actual = fMatcher.group(1).trim();
                String alias = fMatcher.group(3).trim();
                if (actual.matches("(COUNT|count)\\(\\*\\)(.*)")) {
                    fields.put(alias, "long");
                } else if (actual.matches("(LONG_SUM|long_sum)\\((.*)\\)(.*)")) {
                    fields.put(alias, "long");
                } else if (actual.matches("(DOUBLE_SUM|double_sum)\\((.*)\\)(.*)")) {
                    fields.put(alias, "double");
                } else {
                    fields.put(alias, "String");
                }
            } else {// Type cannot be inferred.
                fields.put(arg.trim(), "String");
            }
        }
        return fields;
    }
    
    private static void generate(Map<String, String> fields, String beanClassName) {
        fields.remove("timestamp");// Timestamp is derived from DruidBaseBean so do not create one for it.
        StringBuilder javaClass = new StringBuilder("/** AUTO-GENERATED **/ \n");
        javaClass.append("import com.yahoo.sql4d.sql4ddriver.rowmapper.DruidBaseBean;\n\n");
        javaClass.append(String.format("public class %s extends DruidBaseBean { \n", beanClassName));
        for (String field: fields.keySet()) {
            javaClass.append(String.format("    private %s %s ;\n", fields.get(field), field));
        }
        for (String field: fields.keySet()) {
            genGetter(field, fields.get(field), javaClass);
            genSetter(field, fields.get(field), javaClass);
        }
        javaClass.append("} \n");
        javaClass.append("/** AUTO-GENERATED **/ \n");
        try {
            FileUtils.write(new File(System.getenv("HOME") + File.separator + beanClassName + ".java"), javaClass);
        } catch (IOException ex) {
            Logger.getLogger(BeanGenUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(javaClass.toString());
    }
    
    private static void genGetter(String name, String type, StringBuilder buff) {
        buff.append(String.format("    public %s get%s() { \n", type, Util.capitalize(name)));
        buff.append(String.format("         return this.%s; \n", name));
        buff.append("    } \n");
    }

    private static void genSetter(String name, String type, StringBuilder buff) {
        buff.append(String.format("    public void set%s(%s %s) { \n", Util.capitalize(name), type, name));
        buff.append(String.format("         this.%s = %s; \n", name, name));
        buff.append("    } \n");
    }
}
