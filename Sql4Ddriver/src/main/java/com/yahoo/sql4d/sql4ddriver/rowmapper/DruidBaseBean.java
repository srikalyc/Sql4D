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
package com.yahoo.sql4d.sql4ddriver.rowmapper;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yahoo.sql4d.sql4ddriver.Util;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Has timestamp which is always available in druid response. All the subclasses 
 * must ensure they provide getter and setter for every instance variable. Do not
 * use Boxed types like Integer,  Long etc. Must define a constructor without 
 * arguments in case you define one with arguments. Any bean of this type is Kryo
 * serializable.
 * @author srikalyan
 * @param <T>
 */
public class DruidBaseBean<T extends DruidBaseBean> extends Serializer<T> {
    private static final DateTimeFormatter dateOnlyFormat = DateTimeFormat.forPattern("yyyy-MM-dd");
    private static final DateTimeFormatter dateTimeFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss");
    private static final DateTimeFormatter dateTimeWithSubSecFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
    private static final DateTimeFormatter dateTimeAndTZFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZZ");
    private static final DateTimeFormatter dateTimeWithSubSecAndTZFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");

    public static void main(String[] args) {
        System.out.println(dateTimeFormat.parseDateTime("2014-05-25T16:45:49"));
        System.out.println(dateTimeAndTZFormat.parseDateTime("2014-05-25T16:45:49+00:00"));
        System.out.println(dateTimeAndTZFormat.parseDateTime("2014-05-25T16:45:49Z"));
        System.out.println(dateTimeWithSubSecFormat.parseDateTime("2014-05-25T16:45:49.100"));
        System.out.println(dateTimeWithSubSecAndTZFormat.parseDateTime("2014-05-25T16:45:49.000Z"));
    }

    public String timestamp;// TODO: Crazy,though getDeclaredMethods can be used to access private fields, it is not possible on subclasses.

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTimestamp() {
        return timestamp;
    }
    
    public Map<String, Object> toMap() {
        Map<String, Object> map = new ObjectMapper().convertValue(this, Map.class);
        // The following 2 comes from Serializer.
        map.remove("acceptsNull");
        map.remove("immutable");
        return map;        
    }

    @Override
    public String toString() {
        return toMap().toString();
    }

    @Override
    public void write(Kryo kryo, Output output, T t) {
        Map<String, Object> map = toMap();
        for (String key:map.keySet()) {
            Object value = map.get(key);
            kryo.writeClass(output, value.getClass());
            kryo.writeObjectOrNull(output, key, String.class);
            kryo.writeObjectOrNull(output, value, value.getClass());
        }
    }

    @Override
    public T read(Kryo kryo, Input input, Class<T> type) {
        T retValue = null;
        try {
            retValue = type.newInstance();
            Registration reg = kryo.readClass(input);
            String key = kryo.readObjectOrNull(input, String.class);
            Object value = kryo.readObjectOrNull(input, reg.getType());
            Util.applyKVToBean(retValue, key, value);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(DruidBaseBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retValue;
    }
    
}
