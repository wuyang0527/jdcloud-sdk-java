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
 * Dedicated-Host
 * 关于专有宿主机操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dh.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询专有宿主机机型。

 */
public class DescribeDedicatedHostTypeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dedicatedHostType - 专有宿主机机型，精确匹配，支持多个
az - 可用区，精确匹配，支持多个

     */
    private List<Filter> filters;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get dedicatedHostType - 专有宿主机机型，精确匹配，支持多个
az - 可用区，精确匹配，支持多个

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set dedicatedHostType - 专有宿主机机型，精确匹配，支持多个
az - 可用区，精确匹配，支持多个

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set dedicatedHostType - 专有宿主机机型，精确匹配，支持多个
az - 可用区，精确匹配，支持多个

     *
     * @param filters
     */
    public DescribeDedicatedHostTypeRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescribeDedicatedHostTypeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to dedicatedHostType - 专有宿主机机型，精确匹配，支持多个
az - 可用区，精确匹配，支持多个

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