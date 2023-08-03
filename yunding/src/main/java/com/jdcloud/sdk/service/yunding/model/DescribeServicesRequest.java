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
 * yunding-monitor
 * 云鼎-云监控相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yunding.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.Filter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询监控图可用的产品线列表
 */
public class DescribeServicesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务码列表
filter name 为serviceCodes表示查询多个产品线的规则
     */
    
    private List<Filter> filters;
    /**
     * 要查询的产品线类型   0：all    1：资源监控   2：其它   默认：1。若指定了查询的serviceCode，则忽略该参数
     */
    private Long productType;



    /**
    * get 服务码列表
filter name 为serviceCodes表示查询多个产品线的规则
    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set 服务码列表
filter name 为serviceCodes表示查询多个产品线的规则
    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * get 要查询的产品线类型   0：all    1：资源监控   2：其它   默认：1。若指定了查询的serviceCode，则忽略该参数
     *
     * @return
     */
    public Long getProductType() {
        return productType;
    }

    /**
     * set 要查询的产品线类型   0：all    1：资源监控   2：其它   默认：1。若指定了查询的serviceCode，则忽略该参数
     *
     * @param productType
     */
    public void setProductType(Long productType) {
        this.productType = productType;
    }



    /**
    * set 服务码列表
filter name 为serviceCodes表示查询多个产品线的规则
    *
    * @param filters
    */
    public DescribeServicesRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * set 要查询的产品线类型   0：all    1：资源监控   2：其它   默认：1。若指定了查询的serviceCode，则忽略该参数
     *
     * @param productType
     */
    public DescribeServicesRequest productType(Long productType) {
        this.productType = productType;
        return this;
    }



    /**
     * add item to 服务码列表
filter name 为serviceCodes表示查询多个产品线的规则
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