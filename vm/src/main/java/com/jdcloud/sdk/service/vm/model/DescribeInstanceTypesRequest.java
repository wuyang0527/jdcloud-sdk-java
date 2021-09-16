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
 * 实例规格
 * 与实例规格操作相关的接口
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
查询实例规格列表。

详细操作说明请参考帮助文档：[实例规格类型](https://docs.jdcloud.com/cn/virtual-machines/instance-type-family)

## 接口说明
- 调用该接口可查询全量实例规格信息。
- 可查询实例规格的CPU、内存大小、可绑定的弹性网卡数量、可挂载的云硬盘数量，是否售卖等信息。
- GPU 或 本地存储型的规格可查询 GPU型号、GPU卡数量、本地盘数量。
- 尽量使用过滤器查询关心的实例规格，并适当缓存这些信息。否则全量查询可能响应较慢。

 */
public class DescribeInstanceTypesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品线类型，默认为 &#x60;vm&#x60;。支持范围：&#x60;vm&#x60; 云主机，&#x60;nc&#x60; 原生容器。
     */
    private String serviceName;

    /**
     * &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceTypes&#x60;: 实例规格，精确匹配，支持多个
&#x60;az&#x60;: 可用区，精确匹配，支持多个

     */
    private List<Filter> filters;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 产品线类型，默认为 &#x60;vm&#x60;。支持范围：&#x60;vm&#x60; 云主机，&#x60;nc&#x60; 原生容器。
     *
     * @return
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * set 产品线类型，默认为 &#x60;vm&#x60;。支持范围：&#x60;vm&#x60; 云主机，&#x60;nc&#x60; 原生容器。
     *
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * get &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceTypes&#x60;: 实例规格，精确匹配，支持多个
&#x60;az&#x60;: 可用区，精确匹配，支持多个

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceTypes&#x60;: 实例规格，精确匹配，支持多个
&#x60;az&#x60;: 可用区，精确匹配，支持多个

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
     * set 产品线类型，默认为 &#x60;vm&#x60;。支持范围：&#x60;vm&#x60; 云主机，&#x60;nc&#x60; 原生容器。
     *
     * @param serviceName
     */
    public DescribeInstanceTypesRequest serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * set &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceTypes&#x60;: 实例规格，精确匹配，支持多个
&#x60;az&#x60;: 可用区，精确匹配，支持多个

     *
     * @param filters
     */
    public DescribeInstanceTypesRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public DescribeInstanceTypesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceTypes&#x60;: 实例规格，精确匹配，支持多个
&#x60;az&#x60;: 可用区，精确匹配，支持多个

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