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
 * JDCLOUD BILLING Services API
 * 用户中心消费管理查询API接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.billing.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询消费记录列表
 */
public class QueryConsumeBillsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * queryType
     */
    private Integer queryType;

    /**
     * appCode
     */
    private String appCode;

    /**
     * serviceCode
     */
    private String serviceCode;

    /**
     * billingType
     */
    private Integer billingType;

    /**
     * payType
     */
    private Integer payType;

    /**
     * payState
     */
    private Integer payState;

    /**
     * timeType
     */
    private Integer timeType;

    /**
     * startTime
     */
    private String startTime;

    /**
     * endTime
     */
    private String endTime;

    /**
     * ignoreZero
     */
    private Integer ignoreZero;

    /**
     * resourceId
     */
    private String resourceId;

    /**
     * site
     */
    private Integer site;

    /**
     * role
     */
    private Integer role;

    /**
     * region
     */
    private String region;

    /**
     * pageIndex
     */
    private Integer pageIndex;

    /**
     * pageSize
     */
    private Integer pageSize;

    /**
     * regionId
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get queryType
     *
     * @return
     */
    public Integer getQueryType() {
        return queryType;
    }

    /**
     * set queryType
     *
     * @param queryType
     */
    public void setQueryType(Integer queryType) {
        this.queryType = queryType;
    }

    /**
     * get appCode
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set appCode
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get billingType
     *
     * @return
     */
    public Integer getBillingType() {
        return billingType;
    }

    /**
     * set billingType
     *
     * @param billingType
     */
    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }

    /**
     * get payType
     *
     * @return
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * set payType
     *
     * @param payType
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * get payState
     *
     * @return
     */
    public Integer getPayState() {
        return payState;
    }

    /**
     * set payState
     *
     * @param payState
     */
    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    /**
     * get timeType
     *
     * @return
     */
    public Integer getTimeType() {
        return timeType;
    }

    /**
     * set timeType
     *
     * @param timeType
     */
    public void setTimeType(Integer timeType) {
        this.timeType = timeType;
    }

    /**
     * get startTime
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set startTime
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get endTime
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set endTime
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get ignoreZero
     *
     * @return
     */
    public Integer getIgnoreZero() {
        return ignoreZero;
    }

    /**
     * set ignoreZero
     *
     * @param ignoreZero
     */
    public void setIgnoreZero(Integer ignoreZero) {
        this.ignoreZero = ignoreZero;
    }

    /**
     * get resourceId
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set resourceId
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get site
     *
     * @return
     */
    public Integer getSite() {
        return site;
    }

    /**
     * set site
     *
     * @param site
     */
    public void setSite(Integer site) {
        this.site = site;
    }

    /**
     * get role
     *
     * @return
     */
    public Integer getRole() {
        return role;
    }

    /**
     * set role
     *
     * @param role
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * get region
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set region
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get pageIndex
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set pageIndex
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * get pageSize
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set pageSize
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get regionId
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set queryType
     *
     * @param queryType
     */
    public QueryConsumeBillsRequest queryType(Integer queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * set appCode
     *
     * @param appCode
     */
    public QueryConsumeBillsRequest appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public QueryConsumeBillsRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set billingType
     *
     * @param billingType
     */
    public QueryConsumeBillsRequest billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }

    /**
     * set payType
     *
     * @param payType
     */
    public QueryConsumeBillsRequest payType(Integer payType) {
        this.payType = payType;
        return this;
    }

    /**
     * set payState
     *
     * @param payState
     */
    public QueryConsumeBillsRequest payState(Integer payState) {
        this.payState = payState;
        return this;
    }

    /**
     * set timeType
     *
     * @param timeType
     */
    public QueryConsumeBillsRequest timeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }

    /**
     * set startTime
     *
     * @param startTime
     */
    public QueryConsumeBillsRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set endTime
     *
     * @param endTime
     */
    public QueryConsumeBillsRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set ignoreZero
     *
     * @param ignoreZero
     */
    public QueryConsumeBillsRequest ignoreZero(Integer ignoreZero) {
        this.ignoreZero = ignoreZero;
        return this;
    }

    /**
     * set resourceId
     *
     * @param resourceId
     */
    public QueryConsumeBillsRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set site
     *
     * @param site
     */
    public QueryConsumeBillsRequest site(Integer site) {
        this.site = site;
        return this;
    }

    /**
     * set role
     *
     * @param role
     */
    public QueryConsumeBillsRequest role(Integer role) {
        this.role = role;
        return this;
    }

    /**
     * set region
     *
     * @param region
     */
    public QueryConsumeBillsRequest region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set pageIndex
     *
     * @param pageIndex
     */
    public QueryConsumeBillsRequest pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set pageSize
     *
     * @param pageSize
     */
    public QueryConsumeBillsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public QueryConsumeBillsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}