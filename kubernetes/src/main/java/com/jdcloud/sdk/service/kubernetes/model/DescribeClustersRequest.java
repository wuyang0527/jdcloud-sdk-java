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
 * Cluster
 * 集群相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kubernetes.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询集群列表
 */
public class DescribeClustersRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为20；取值范围[10, 100]
     */
    private Integer pageSize;

    /**
     * name - 集群名称，模糊匹配，仅支持单个   
id - id，支持多个   

     */
    
    private List<Filter> filters;
    /**
     * 地域 ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 页码；默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 分页大小；默认为20；取值范围[10, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为20；取值范围[10, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
    * get name - 集群名称，模糊匹配，仅支持单个   
id - id，支持多个   

    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set name - 集群名称，模糊匹配，仅支持单个   
id - id，支持多个   

    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * get 地域 ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public DescribeClustersRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小；默认为20；取值范围[10, 100]
     *
     * @param pageSize
     */
    public DescribeClustersRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
    * set name - 集群名称，模糊匹配，仅支持单个   
id - id，支持多个   

    *
    * @param filters
    */
    public DescribeClustersRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public DescribeClustersRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to name - 集群名称，模糊匹配，仅支持单个   
id - id，支持多个   

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