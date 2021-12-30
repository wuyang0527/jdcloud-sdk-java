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
 * 快照策略相关接口
 * 云硬盘相关接口，快照策略的创建，更新，删除，查询，绑定/解绑磁盘等接口。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.disk.model.FilterGroups;
import com.jdcloud.sdk.service.disk.model.OrderItem;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * -   查询您已经创建的快照策略。
-   filters多个过滤条件之间是逻辑与(AND)，每个条件内部的多个取值是逻辑或(OR)

 */
public class DescribeSnapPolicesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 过滤条件
     */
    private List<FilterGroups> filterGroups;

    /**
     * 排序字段，只支持create_time和update_time字段
     */
    private OrderItem order;

    /**
     * 页码, 默认为1, 取值范围：[1,∞)
     */
    private Integer pageNumber;

    /**
     * 分页大小，默认为20，取值范围：[10,100]
     */
    private Integer pageSize;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 过滤条件
     *
     * @return
     */
    public List<FilterGroups> getFilterGroups() {
        return filterGroups;
    }

    /**
     * set 过滤条件
     *
     * @param filterGroups
     */
    public void setFilterGroups(List<FilterGroups> filterGroups) {
        this.filterGroups = filterGroups;
    }

    /**
     * get 排序字段，只支持create_time和update_time字段
     *
     * @return
     */
    public OrderItem getOrder() {
        return order;
    }

    /**
     * set 排序字段，只支持create_time和update_time字段
     *
     * @param order
     */
    public void setOrder(OrderItem order) {
        this.order = order;
    }

    /**
     * get 页码, 默认为1, 取值范围：[1,∞)
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码, 默认为1, 取值范围：[1,∞)
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小，默认为20，取值范围：[10,100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
     * set 过滤条件
     *
     * @param filterGroups
     */
    public DescribeSnapPolicesRequest filterGroups(List<FilterGroups> filterGroups) {
        this.filterGroups = filterGroups;
        return this;
    }

    /**
     * set 排序字段，只支持create_time和update_time字段
     *
     * @param order
     */
    public DescribeSnapPolicesRequest order(OrderItem order) {
        this.order = order;
        return this;
    }

    /**
     * set 页码, 默认为1, 取值范围：[1,∞)
     *
     * @param pageNumber
     */
    public DescribeSnapPolicesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public DescribeSnapPolicesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescribeSnapPolicesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 过滤条件
     *
     * @param filterGroup
     */
    public void addFilterGroup(FilterGroups filterGroup) {
        if (this.filterGroups == null) {
            this.filterGroups = new ArrayList<>();
        }
        this.filterGroups.add(filterGroup);
    }

}