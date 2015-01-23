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

import com.yahoo.sql4d.sql4ddriver.rowmapper.TimeSeriesBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import scala.Either;

/**
 * Timeseries test.
 * @author srikalyan
 */
public class TimeSeriesTest extends AnalyticsDruidTestBase {

    String timeseriesContentAggHourly = "SELECT timestamp , LONG_SUM(content_views) AS content_views, LONG_SUM(shares) AS shares FROM AggTable WHERE interval BETWEEN  2014-05-20T00:00:00.000-04:00 AND 2014-05-31T23:00:00.000-04:00 AND provider_id='superprovider' AND content_type='cavideo' BREAK BY PERIOD('P1D', 'EST5EDT')  GROUP BY timestamp, content_views, shares HINT('timeseries')";
    String timeseriesUniqCount = "SELECT timestamp , LONG_SUM(all_content_seen) AS content_seen FROM UniqueCountTable WHERE interval BETWEEN  2014-05-20T00:00:00.000-04:00 AND 2014-05-31T23:00:00.000-04:00 AND provider_id='superprovider' AND content_type='cavideo' BREAK BY PERIOD('P1D', 'EST5EDT') GROUP BY timestamp,content_seen HINT('timeseries')";
    String tsJoin = String.format("%s JOIN (%s) ON (timestamp)", timeseriesContentAggHourly, timeseriesUniqCount);

    @Test
    public void testTimeSeriesBean() throws Exception {
        Either<String, Either<List<TimeSeriesBean>, Map<Object, TimeSeriesBean>>> mapperRes = source.query(tsJoin, null, TimeSeriesBean.class, false);
        if (mapperRes.isLeft()) {
            throw new Exception(mapperRes.left().get());
        }
        Either<List<TimeSeriesBean>, Map<Object, TimeSeriesBean>> goodResult = mapperRes.right().get();
        if (goodResult.isLeft()) {
            PrettyPrint.print(goodResult.left().get());
        } else {
            PrettyPrint.print(new ArrayList<>(goodResult.right().get().values()));
        }
    }

    @Test
    public void testTimeSeries() throws Exception {
        testPositive(tsJoin);
    }

}
