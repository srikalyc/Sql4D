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
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author srikalyan
 */
public class TestKryoDruidBaseBean {
    @Test
    public void testKryoSerDe() {
        String expected = "{timestamp=null, b=yoyoy, a=1, c=5.0}";
        byte[] bytes = new byte[32];
        Kryo kryo = new Kryo();
        kryo.register(A.class);
        Output output = new Output(bytes);
        kryo.writeObject(output, new A());
        Assert.assertEquals(kryo.readObject(new Input(bytes), A.class).toString(), expected);
    }
}
class A extends DruidBaseBean<A> {
    private String b = "yoyoy";
    private int a = 1;
    private double c = 5L;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}

