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

import com.yahoo.sql4d.query.groupby.GroupByQueryMeta;
import com.yahoo.sql4d.query.nodes.PostAggItem;
import com.yahoo.sql4d.query.timeseries.TimeSeriesQueryMeta;

/**
 *
 * @author srikalyan
 */
public class QueryUtils {
    public static void setPostAggregation(QueryMeta qMeta, PostAggItem pItem) {
        if (qMeta instanceof BaseAggQueryMeta) {
            ((BaseAggQueryMeta)qMeta).postAggregations = pItem;
        }
    }
    /**
     * Every query starts with GroupBy. Call this method after GROUP BY clause.
     * @param qMeta
     * @return 
     */
    public static QueryMeta checkAndPromoteToTimeSeries(QueryMeta qMeta) {
        if (qMeta instanceof GroupByQueryMeta) {
             if (((GroupByQueryMeta)qMeta).fetchDimensions == null) {
                return TimeSeriesQueryMeta.promote(qMeta);
             }
        }
        return qMeta;
    }
}
