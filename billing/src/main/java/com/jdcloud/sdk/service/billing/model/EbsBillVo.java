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

package com.jdcloud.sdk.service.billing.model;


/**
 * ebsBillVo
 */
public class EbsBillVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 数据源ID
     */
    private String dataSourceId;

    /**
     * 业务线
     */
    private String appCode;

    /**
     * 产品线
     */
    private String serviceCode;

    /**
     * 费用时间
     */
    private String chargeTime;

    /**
     * 支付金额
     */
    private Number payFee;

    /**
     * 计费类型
     */
    private Integer billingType;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 采购价格
     */
    private Number purchasePrice;

    /**
     * 供应商
     */
    private String supplier;

    /**
     * 核算组织
     */
    private String org;

    /**
     * 用费分组
     */
    private Integer userGroup;

    /**
     * 域名订单ID
     */
    private String domainOrderId;

    /**
     * 交易方名称
     */
    private String traderName;

    /**
     * 订单类型
     */
    private String orderType;

    /**
     * 税率
     */
    private Number taxRate;

    /**
     * 部门
     */
    private String deptNo;

    /**
     * 返回编码0成功
     */
    private Integer code;

    /**
     * 返回消息
     */
    private String message;



    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 数据源ID
     *
     * @return
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * set 数据源ID
     *
     * @param dataSourceId
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }


    /**
     * get 业务线
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 业务线
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }


    /**
     * get 产品线
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 费用时间
     *
     * @return
     */
    public String getChargeTime() {
        return chargeTime;
    }

    /**
     * set 费用时间
     *
     * @param chargeTime
     */
    public void setChargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
    }


    /**
     * get 支付金额
     *
     * @return
     */
    public Number getPayFee() {
        return payFee;
    }

    /**
     * set 支付金额
     *
     * @param payFee
     */
    public void setPayFee(Number payFee) {
        this.payFee = payFee;
    }


    /**
     * get 计费类型
     *
     * @return
     */
    public Integer getBillingType() {
        return billingType;
    }

    /**
     * set 计费类型
     *
     * @param billingType
     */
    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }


    /**
     * get 开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get 采购价格
     *
     * @return
     */
    public Number getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * set 采购价格
     *
     * @param purchasePrice
     */
    public void setPurchasePrice(Number purchasePrice) {
        this.purchasePrice = purchasePrice;
    }


    /**
     * get 供应商
     *
     * @return
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * set 供应商
     *
     * @param supplier
     */
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }


    /**
     * get 核算组织
     *
     * @return
     */
    public String getOrg() {
        return org;
    }

    /**
     * set 核算组织
     *
     * @param org
     */
    public void setOrg(String org) {
        this.org = org;
    }


    /**
     * get 用费分组
     *
     * @return
     */
    public Integer getUserGroup() {
        return userGroup;
    }

    /**
     * set 用费分组
     *
     * @param userGroup
     */
    public void setUserGroup(Integer userGroup) {
        this.userGroup = userGroup;
    }


    /**
     * get 域名订单ID
     *
     * @return
     */
    public String getDomainOrderId() {
        return domainOrderId;
    }

    /**
     * set 域名订单ID
     *
     * @param domainOrderId
     */
    public void setDomainOrderId(String domainOrderId) {
        this.domainOrderId = domainOrderId;
    }


    /**
     * get 交易方名称
     *
     * @return
     */
    public String getTraderName() {
        return traderName;
    }

    /**
     * set 交易方名称
     *
     * @param traderName
     */
    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }


    /**
     * get 订单类型
     *
     * @return
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * set 订单类型
     *
     * @param orderType
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }


    /**
     * get 税率
     *
     * @return
     */
    public Number getTaxRate() {
        return taxRate;
    }

    /**
     * set 税率
     *
     * @param taxRate
     */
    public void setTaxRate(Number taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * get 部门
     *
     * @return
     */
    public String getDeptNo() {
        return deptNo;
    }

    /**
     * set 部门
     *
     * @param deptNo
     */
    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }


    /**
     * get 返回编码0成功
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set 返回编码0成功
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }


    /**
     * get 返回消息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 返回消息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }



    /**
     * set 用户pin
     *
     * @param pin
     */
    public EbsBillVo pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 数据源ID
     *
     * @param dataSourceId
     */
    public EbsBillVo dataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }


    /**
     * set 业务线
     *
     * @param appCode
     */
    public EbsBillVo appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }


    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public EbsBillVo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 费用时间
     *
     * @param chargeTime
     */
    public EbsBillVo chargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
        return this;
    }


    /**
     * set 支付金额
     *
     * @param payFee
     */
    public EbsBillVo payFee(Number payFee) {
        this.payFee = payFee;
        return this;
    }


    /**
     * set 计费类型
     *
     * @param billingType
     */
    public EbsBillVo billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }


    /**
     * set 开始时间
     *
     * @param startTime
     */
    public EbsBillVo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 结束时间
     *
     * @param endTime
     */
    public EbsBillVo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 采购价格
     *
     * @param purchasePrice
     */
    public EbsBillVo purchasePrice(Number purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }


    /**
     * set 供应商
     *
     * @param supplier
     */
    public EbsBillVo supplier(String supplier) {
        this.supplier = supplier;
        return this;
    }


    /**
     * set 核算组织
     *
     * @param org
     */
    public EbsBillVo org(String org) {
        this.org = org;
        return this;
    }


    /**
     * set 用费分组
     *
     * @param userGroup
     */
    public EbsBillVo userGroup(Integer userGroup) {
        this.userGroup = userGroup;
        return this;
    }


    /**
     * set 域名订单ID
     *
     * @param domainOrderId
     */
    public EbsBillVo domainOrderId(String domainOrderId) {
        this.domainOrderId = domainOrderId;
        return this;
    }


    /**
     * set 交易方名称
     *
     * @param traderName
     */
    public EbsBillVo traderName(String traderName) {
        this.traderName = traderName;
        return this;
    }


    /**
     * set 订单类型
     *
     * @param orderType
     */
    public EbsBillVo orderType(String orderType) {
        this.orderType = orderType;
        return this;
    }


    /**
     * set 税率
     *
     * @param taxRate
     */
    public EbsBillVo taxRate(Number taxRate) {
        this.taxRate = taxRate;
        return this;
    }


    /**
     * set 部门
     *
     * @param deptNo
     */
    public EbsBillVo deptNo(String deptNo) {
        this.deptNo = deptNo;
        return this;
    }


    /**
     * set 返回编码0成功
     *
     * @param code
     */
    public EbsBillVo code(Integer code) {
        this.code = code;
        return this;
    }


    /**
     * set 返回消息
     *
     * @param message
     */
    public EbsBillVo message(String message) {
        this.message = message;
        return this;
    }


}