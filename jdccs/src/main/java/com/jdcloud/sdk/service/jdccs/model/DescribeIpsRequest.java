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
 * Resource API
 * 云托管服务的资源API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdccs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询公网IP列表
 */
public class DescribeIpsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码, 默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小，默认为20
     */
    private Integer pageSize;

    /**
     * ipId - 公网IP实例ID，精确匹配，支持多个

     */
    private List<Filter> filters;

    /**
     * 状态 normal:正常 abnormal:异常
     */
    private String status;

    /**
     * IDC机房ID
     * Required:true
     */
    @Required
    private String idc;


    /**
     * get 页码, 默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码, 默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小，默认为20
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小，默认为20
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get ipId - 公网IP实例ID，精确匹配，支持多个

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set ipId - 公网IP实例ID，精确匹配，支持多个

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 状态 normal:正常 abnormal:异常
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态 normal:正常 abnormal:异常
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get IDC机房ID
     *
     * @return
     */
    public String getIdc() {
        return idc;
    }

    /**
     * set IDC机房ID
     *
     * @param idc
     */
    public void setIdc(String idc) {
        this.idc = idc;
    }


    /**
     * set 页码, 默认为1
     *
     * @param pageNumber
     */
    public DescribeIpsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小，默认为20
     *
     * @param pageSize
     */
    public DescribeIpsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set ipId - 公网IP实例ID，精确匹配，支持多个

     *
     * @param filters
     */
    public DescribeIpsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 状态 normal:正常 abnormal:异常
     *
     * @param status
     */
    public DescribeIpsRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set IDC机房ID
     *
     * @param idc
     */
    public DescribeIpsRequest idc(String idc) {
        this.idc = idc;
        return this;
    }


    /**
     * add item to ipId - 公网IP实例ID，精确匹配，支持多个

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