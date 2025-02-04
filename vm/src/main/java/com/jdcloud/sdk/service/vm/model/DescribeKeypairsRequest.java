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
 * SSH密钥对
 * 关于SSH密钥对的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
批量查询密钥对。

详细操作说明请参考帮助文档：[密钥概述](https://docs.jdcloud.com/cn/virtual-machines/keypair-overview)

## 接口说明
- 使用 &#x60;filters&#x60; 过滤器进行条件筛选，每个 &#x60;filter&#x60; 之间的关系为逻辑与（AND）的关系。
- 单次查询最大可查询100条密钥数据。

 */
public class DescribeKeypairsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认为1。
     */
    private Integer pageNumber;

    /**
     * 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     */
    private Integer pageSize;

    /**
     * &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;keyNames&#x60;: 密钥对名称，精确匹配，支持多个

     */
    private List<Filter> filters;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码；默认为1。
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1。
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;keyNames&#x60;: 密钥对名称，精确匹配，支持多个

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;keyNames&#x60;: 密钥对名称，精确匹配，支持多个

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域ID。
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 页码；默认为1。
     *
     * @param pageNumber
     */
    public DescribeKeypairsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     *
     * @param pageSize
     */
    public DescribeKeypairsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;keyNames&#x60;: 密钥对名称，精确匹配，支持多个

     *
     * @param filters
     */
    public DescribeKeypairsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public DescribeKeypairsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;keyNames&#x60;: 密钥对名称，精确匹配，支持多个

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