/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;

/**
 * filterGroups
 */
public class FilterGroups  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * policyId - 策略Id,精确匹配，支持多个
status - 策略状态，精确匹配，支持多个
name - 策略名称，模糊匹配，支持单个

     */
    
    private List<Filter> filters;


    /**
    * get policyId - 策略Id,精确匹配，支持多个
status - 策略状态，精确匹配，支持多个
name - 策略名称，模糊匹配，支持单个

    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set policyId - 策略Id,精确匹配，支持多个
status - 策略状态，精确匹配，支持多个
name - 策略名称，模糊匹配，支持单个

    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }



    /**
    * set policyId - 策略Id,精确匹配，支持多个
status - 策略状态，精确匹配，支持多个
name - 策略名称，模糊匹配，支持单个

    *
    * @param filters
    */
    public FilterGroups filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }



    /**
     * add item to policyId - 策略Id,精确匹配，支持多个
status - 策略状态，精确匹配，支持多个
name - 策略名称，模糊匹配，支持单个

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }
}