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
package com.yahoo.sql4d.sql4ddriver.sql;

/**
 *
 * @author srikalyan
 */
public interface DAODictionary {
    public static final String SEGMENTS_IN_RANGE = "SELECT * FROM druid_segments WHERE dataSource = :dataSource AND ((start >= :iStart && start < :iEnd) || (end > :iStart && end <= :iEnd))";
    public static final String USED_SEGMENTS_IN_RANGE = SEGMENTS_IN_RANGE + " AND used = :used";
    public static final String DISABLE_SEGMENTS_IN_RANGE = "UPDATE druid_segments SET used = 0 WHERE dataSource = :dataSource AND ((start >= :iStart && start < :iEnd) || (end > :iStart && end <= :iEnd))";
    public static final String DISABLE_ALL_SEGMENTS = "UPDATE druid_segments SET used = 0 WHERE dataSource = :dataSource";
}
