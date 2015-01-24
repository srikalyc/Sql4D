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
package com.yahoo.sql4d.sql4ddriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import scala.util.Either;

/**
 * TestBase for druid based API.
 * @author srikalyan
 */
public abstract class AnalyticsDruidTestBase {

    DDataSource source = null;

    public void testPositive(String query) throws Exception {
        Either<String, Either<Joiner4All, Mapper4All>> result = source.query(query, null);
        if (result.isLeft()) {
            throw new Exception(result.left().get());
        }
        Either<Joiner4All, Mapper4All> goodResult = result.right().get();
        if (goodResult.isLeft()) {
            PrettyPrint.print(goodResult.left().get());
        } else {
            PrettyPrint.print(goodResult.right().get());
        }
    }

    @BeforeClass
    public void setUpClass() throws Exception {
        source = new DDataSource("yourbroker.com", 4080, "yourcoordinator.com", 8082, "proxyIfAny", 3128);
    }

    @AfterClass
    public void tearDownClass() throws Exception {
    }

}
