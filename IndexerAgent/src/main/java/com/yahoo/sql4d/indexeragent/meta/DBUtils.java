/**
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License. See accompanying
 * LICENSE file.
 */
package com.yahoo.sql4d.indexeragent.meta;

import com.yahoo.sql4d.indexeragent.meta.beans.DataSourceBean;
import com.yahoo.sql4d.indexeragent.meta.beans.StatusTrailBean;

/**
 * @author srikalyan
 */
public class DBUtils {

    public DBUtils() {
    }
    
    public void addNewDataSource(DataSourceBean ds) {
        // Add to DataSource with start_time = current_run_time 
    }
    
    public void removeDataSource(DataSourceBean ds) {
        // Remove entries from DataSource and entries from StatusTrail will be auto deleted(due to Cascade setup)
    }

    public void markStatus(StatusTrailBean st) {
        //If success then increment current_run_time in DataSource and mark it 
        // Else do not touch DataSource, mark it in StatusTrail.
    }
}