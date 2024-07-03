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
 * Partner Summary APIs
 * 计费费用/账单汇总相关服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.partner.model;


/**
 * billSummaryCondition
 */
public class BillSummaryCondition  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询时间类型，按月：month，按天：day
     */
    private String queryTimeType;

    /**
     * 渠道账户传pin
     */
    private String pin;

    /**
     * 账期，按月 yyyy-MM
     */
    private String billDate;

    /**
     * 开始查询账期，按天：yyyy-MM-dd
     */
    private String billStartDate;

    /**
     * 结束查询账期，按天：yyyy-MM-dd
     */
    private String billEndDate;

    /**
     * 产品线
     */
    private String appCode;

    /**
     * 产品
     */
    private String serviceCode;

    /**
     * 计费类型，1:按配置 2:按用量 3:包年包月 4:按次
     */
    private Integer billingType;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 地域
     */
    private String region;

    /**
     * 二级渠道商PIN
     */
    private String distributorPin;

    /**
     * 一级渠道商PIN
     */
    private String oneLevelDistributorPin;

    /**
     * 账号名
     */
    private String loginName;

    /**
     * 当前页序号
     */
    private Integer pageIndex;

    /**
     * 每页结果数量
     */
    private Integer pageSize;



    /**
     * get 查询时间类型，按月：month，按天：day
     *
     * @return
     */
    public String getQueryTimeType() {
        return queryTimeType;
    }

    /**
     * set 查询时间类型，按月：month，按天：day
     *
     * @param queryTimeType
     */
    public void setQueryTimeType(String queryTimeType) {
        this.queryTimeType = queryTimeType;
    }


    /**
     * get 渠道账户传pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 渠道账户传pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 账期，按月 yyyy-MM
     *
     * @return
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     * set 账期，按月 yyyy-MM
     *
     * @param billDate
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }


    /**
     * get 开始查询账期，按天：yyyy-MM-dd
     *
     * @return
     */
    public String getBillStartDate() {
        return billStartDate;
    }

    /**
     * set 开始查询账期，按天：yyyy-MM-dd
     *
     * @param billStartDate
     */
    public void setBillStartDate(String billStartDate) {
        this.billStartDate = billStartDate;
    }


    /**
     * get 结束查询账期，按天：yyyy-MM-dd
     *
     * @return
     */
    public String getBillEndDate() {
        return billEndDate;
    }

    /**
     * set 结束查询账期，按天：yyyy-MM-dd
     *
     * @param billEndDate
     */
    public void setBillEndDate(String billEndDate) {
        this.billEndDate = billEndDate;
    }


    /**
     * get 产品线
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 产品线
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }


    /**
     * get 产品
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 计费类型，1:按配置 2:按用量 3:包年包月 4:按次
     *
     * @return
     */
    public Integer getBillingType() {
        return billingType;
    }

    /**
     * set 计费类型，1:按配置 2:按用量 3:包年包月 4:按次
     *
     * @param billingType
     */
    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }


    /**
     * get 资源id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * get 地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * get 二级渠道商PIN
     *
     * @return
     */
    public String getDistributorPin() {
        return distributorPin;
    }

    /**
     * set 二级渠道商PIN
     *
     * @param distributorPin
     */
    public void setDistributorPin(String distributorPin) {
        this.distributorPin = distributorPin;
    }


    /**
     * get 一级渠道商PIN
     *
     * @return
     */
    public String getOneLevelDistributorPin() {
        return oneLevelDistributorPin;
    }

    /**
     * set 一级渠道商PIN
     *
     * @param oneLevelDistributorPin
     */
    public void setOneLevelDistributorPin(String oneLevelDistributorPin) {
        this.oneLevelDistributorPin = oneLevelDistributorPin;
    }


    /**
     * get 账号名
     *
     * @return
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * set 账号名
     *
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    /**
     * get 当前页序号
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 当前页序号
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }


    /**
     * get 每页结果数量
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页结果数量
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }



    /**
     * set 查询时间类型，按月：month，按天：day
     *
     * @param queryTimeType
     */
    public BillSummaryCondition queryTimeType(String queryTimeType) {
        this.queryTimeType = queryTimeType;
        return this;
    }


    /**
     * set 渠道账户传pin
     *
     * @param pin
     */
    public BillSummaryCondition pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 账期，按月 yyyy-MM
     *
     * @param billDate
     */
    public BillSummaryCondition billDate(String billDate) {
        this.billDate = billDate;
        return this;
    }


    /**
     * set 开始查询账期，按天：yyyy-MM-dd
     *
     * @param billStartDate
     */
    public BillSummaryCondition billStartDate(String billStartDate) {
        this.billStartDate = billStartDate;
        return this;
    }


    /**
     * set 结束查询账期，按天：yyyy-MM-dd
     *
     * @param billEndDate
     */
    public BillSummaryCondition billEndDate(String billEndDate) {
        this.billEndDate = billEndDate;
        return this;
    }


    /**
     * set 产品线
     *
     * @param appCode
     */
    public BillSummaryCondition appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }


    /**
     * set 产品
     *
     * @param serviceCode
     */
    public BillSummaryCondition serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 计费类型，1:按配置 2:按用量 3:包年包月 4:按次
     *
     * @param billingType
     */
    public BillSummaryCondition billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }


    /**
     * set 资源id
     *
     * @param resourceId
     */
    public BillSummaryCondition resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 地域
     *
     * @param region
     */
    public BillSummaryCondition region(String region) {
        this.region = region;
        return this;
    }


    /**
     * set 二级渠道商PIN
     *
     * @param distributorPin
     */
    public BillSummaryCondition distributorPin(String distributorPin) {
        this.distributorPin = distributorPin;
        return this;
    }


    /**
     * set 一级渠道商PIN
     *
     * @param oneLevelDistributorPin
     */
    public BillSummaryCondition oneLevelDistributorPin(String oneLevelDistributorPin) {
        this.oneLevelDistributorPin = oneLevelDistributorPin;
        return this;
    }


    /**
     * set 账号名
     *
     * @param loginName
     */
    public BillSummaryCondition loginName(String loginName) {
        this.loginName = loginName;
        return this;
    }


    /**
     * set 当前页序号
     *
     * @param pageIndex
     */
    public BillSummaryCondition pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }


    /**
     * set 每页结果数量
     *
     * @param pageSize
     */
    public BillSummaryCondition pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


}