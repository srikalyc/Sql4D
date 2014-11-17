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
package com.yahoo.sql4d;

import com.google.common.base.Function;
import static com.google.common.collect.Iterables.concat;
import com.google.common.collect.Lists;
import com.yahoo.sql4d.query.nodes.AggItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author srikalyan
 */
public class DruidUtils {
    // This method actually returns everything(including timestamp which is first field.
    public static List<String> getDimensions(Map<String, String> fetchDimensions) {
        return new ArrayList<>(fetchDimensions.keySet());
    }
    public static List<String> getMetrics(List<AggItem> aggItems) {
        return Lists.transform(aggItems, new Function<AggItem, String>() {
            @Override
            public String apply(AggItem f) {
                return f.fieldName;
            }
        });
    }
    public static List<String> getColumns(Map<String, String> fetchDimensions, List<AggItem> aggItems) {
        return Lists.newArrayList(concat(getDimensions(fetchDimensions), getMetrics(aggItems)));
    }
}
