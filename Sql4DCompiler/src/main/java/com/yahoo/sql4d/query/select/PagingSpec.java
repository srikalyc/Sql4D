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
package com.yahoo.sql4d.query.select;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * pagingIdentifiers is empty for first  request. From the response we extract 
 * pagingIdentifiers and use that in the subsequent request.
 * @author srikalyan
 */
public class PagingSpec {
  public Map<String, Integer> pagingIdentifiers = new LinkedHashMap<>();// Right now we use only 1st set of values for subsequent requests in pagination.
  public int threshold;// Number of rows expected in the response.

  public PagingSpec(Map<String, Integer> pagingIdentifiers, int threshold) {
    this.pagingIdentifiers = pagingIdentifiers;
    this.threshold = threshold;
  }

}
