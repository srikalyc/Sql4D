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
package com.yahoo.sql4d.query;

import com.yahoo.sql4d.query.timeseries.TimeSeriesQueryMeta;

/**
 * Group by and timeseries are same(when grouping by timestamp we can hint as hint('timeseries')
 * so that the query is interpreted as timeseries by the compiler as well as druid
 * however technically this is not needed as druid still returns data considering
 * the query as groupby which may be inefficient.
 * @author srikalyan
 */
public class HintProcessor {

    private static final String TS = "timeseries";

    public static QueryMeta process(QueryMeta qMeta, String hint) {
        hint = hint.replaceAll("'", "");
        switch (hint.toLowerCase()) {
            case TS:
                return TimeSeriesQueryMeta.promote(qMeta);
            default:
                break;

        }
        return qMeta;
    }
}
