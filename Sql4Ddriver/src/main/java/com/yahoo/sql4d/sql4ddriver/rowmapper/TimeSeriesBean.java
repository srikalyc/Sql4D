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

/** AUTO-GENERATED **/ 
import com.yahoo.sql4d.sql4ddriver.rowmapper.DruidBaseBean;

public class TimeSeriesBean extends DruidBaseBean { 
    private long shares ;
    private long content_seen ;
    private long content_views ;
    public long getShares() { 
         return this.shares; 
    } 
    public void setShares(long shares) { 
         this.shares = shares; 
    } 
    public long getContentSeen() { 
         return this.content_seen; 
    } 
    public void setContentSeen(long content_seen) { 
         this.content_seen = content_seen; 
    } 
    public long getContentViews() { 
         return this.content_views; 
    } 
    public void setContentViews(long content_views) { 
         this.content_views = content_views; 
    } 

    @Override
    public String toString() {
        return shares + "," + content_views + "," + content_seen;
    }
    
} 
/** AUTO-GENERATED **/ 
