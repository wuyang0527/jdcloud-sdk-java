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

package com.jdcloud.sdk.service.partner.model;


/**
 * operatorPrePayAchievement
 */
public class OperatorPrePayAchievement  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * 名称
     */
    private String name;

    /**
     * 真实名称
     */
    private String realName;

    /**
     * 部门
     */
    private Integer dept;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 服务商类型
     */
    private String distributorType;

    /**
     * 服务商类型名称
     */
    private String distributorTypeName;

    /**
     * 一级服务商名称
     */
    private String oneLevelDistributorName;

    /**
     * 二级服务商名称
     */
    private String secondLevelDistributorName;

    /**
     * 上级服务商名称
     */
    private String superDistributorName;

    /**
     * 上级服务商pin
     */
    private String superDistributorPin;

    /**
     * serviceCode
     */
    private String serviceCode;

    /**
     * serviceCodeName
     */
    private String serviceCodeName;

    /**
     * opType
     */
    private Integer opType;

    /**
     * opTypeName
     */
    private String opTypeName;

    /**
     * 帐户名
     */
    private String loginName;

    /**
     * 开始时间
     */
    private String billTime;

    /**
     * 完成时间
     */
    private String consumeDate;

    /**
     * 交易单号
     */
    private String transactionNo;

    /**
     * 优惠前金额
     */
    private Number consumeCount;

    /**
     * 现金支付
     */
    private Number cashPayFeeCount;

    /**
     * 业绩金额
     */
    private Number achievmentCount;

    /**
     * 付费代金卷金额
     */
    private Number payCouponFeeCount;

    /**
     * 免费代金卷金额
     */
    private Number freeCouponFeeCount;


    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 真实名称
     *
     * @return
     */
    public String getRealName() {
        return realName;
    }

    /**
     * set 真实名称
     *
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * get 部门
     *
     * @return
     */
    public Integer getDept() {
        return dept;
    }

    /**
     * set 部门
     *
     * @param dept
     */
    public void setDept(Integer dept) {
        this.dept = dept;
    }

    /**
     * get 部门名称
     *
     * @return
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * set 部门名称
     *
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * get 服务商类型
     *
     * @return
     */
    public String getDistributorType() {
        return distributorType;
    }

    /**
     * set 服务商类型
     *
     * @param distributorType
     */
    public void setDistributorType(String distributorType) {
        this.distributorType = distributorType;
    }

    /**
     * get 服务商类型名称
     *
     * @return
     */
    public String getDistributorTypeName() {
        return distributorTypeName;
    }

    /**
     * set 服务商类型名称
     *
     * @param distributorTypeName
     */
    public void setDistributorTypeName(String distributorTypeName) {
        this.distributorTypeName = distributorTypeName;
    }

    /**
     * get 一级服务商名称
     *
     * @return
     */
    public String getOneLevelDistributorName() {
        return oneLevelDistributorName;
    }

    /**
     * set 一级服务商名称
     *
     * @param oneLevelDistributorName
     */
    public void setOneLevelDistributorName(String oneLevelDistributorName) {
        this.oneLevelDistributorName = oneLevelDistributorName;
    }

    /**
     * get 二级服务商名称
     *
     * @return
     */
    public String getSecondLevelDistributorName() {
        return secondLevelDistributorName;
    }

    /**
     * set 二级服务商名称
     *
     * @param secondLevelDistributorName
     */
    public void setSecondLevelDistributorName(String secondLevelDistributorName) {
        this.secondLevelDistributorName = secondLevelDistributorName;
    }

    /**
     * get 上级服务商名称
     *
     * @return
     */
    public String getSuperDistributorName() {
        return superDistributorName;
    }

    /**
     * set 上级服务商名称
     *
     * @param superDistributorName
     */
    public void setSuperDistributorName(String superDistributorName) {
        this.superDistributorName = superDistributorName;
    }

    /**
     * get 上级服务商pin
     *
     * @return
     */
    public String getSuperDistributorPin() {
        return superDistributorPin;
    }

    /**
     * set 上级服务商pin
     *
     * @param superDistributorPin
     */
    public void setSuperDistributorPin(String superDistributorPin) {
        this.superDistributorPin = superDistributorPin;
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
     * get serviceCodeName
     *
     * @return
     */
    public String getServiceCodeName() {
        return serviceCodeName;
    }

    /**
     * set serviceCodeName
     *
     * @param serviceCodeName
     */
    public void setServiceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
    }

    /**
     * get opType
     *
     * @return
     */
    public Integer getOpType() {
        return opType;
    }

    /**
     * set opType
     *
     * @param opType
     */
    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    /**
     * get opTypeName
     *
     * @return
     */
    public String getOpTypeName() {
        return opTypeName;
    }

    /**
     * set opTypeName
     *
     * @param opTypeName
     */
    public void setOpTypeName(String opTypeName) {
        this.opTypeName = opTypeName;
    }

    /**
     * get 帐户名
     *
     * @return
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * set 帐户名
     *
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * get 开始时间
     *
     * @return
     */
    public String getBillTime() {
        return billTime;
    }

    /**
     * set 开始时间
     *
     * @param billTime
     */
    public void setBillTime(String billTime) {
        this.billTime = billTime;
    }

    /**
     * get 完成时间
     *
     * @return
     */
    public String getConsumeDate() {
        return consumeDate;
    }

    /**
     * set 完成时间
     *
     * @param consumeDate
     */
    public void setConsumeDate(String consumeDate) {
        this.consumeDate = consumeDate;
    }

    /**
     * get 交易单号
     *
     * @return
     */
    public String getTransactionNo() {
        return transactionNo;
    }

    /**
     * set 交易单号
     *
     * @param transactionNo
     */
    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    /**
     * get 优惠前金额
     *
     * @return
     */
    public Number getConsumeCount() {
        return consumeCount;
    }

    /**
     * set 优惠前金额
     *
     * @param consumeCount
     */
    public void setConsumeCount(Number consumeCount) {
        this.consumeCount = consumeCount;
    }

    /**
     * get 现金支付
     *
     * @return
     */
    public Number getCashPayFeeCount() {
        return cashPayFeeCount;
    }

    /**
     * set 现金支付
     *
     * @param cashPayFeeCount
     */
    public void setCashPayFeeCount(Number cashPayFeeCount) {
        this.cashPayFeeCount = cashPayFeeCount;
    }

    /**
     * get 业绩金额
     *
     * @return
     */
    public Number getAchievmentCount() {
        return achievmentCount;
    }

    /**
     * set 业绩金额
     *
     * @param achievmentCount
     */
    public void setAchievmentCount(Number achievmentCount) {
        this.achievmentCount = achievmentCount;
    }

    /**
     * get 付费代金卷金额
     *
     * @return
     */
    public Number getPayCouponFeeCount() {
        return payCouponFeeCount;
    }

    /**
     * set 付费代金卷金额
     *
     * @param payCouponFeeCount
     */
    public void setPayCouponFeeCount(Number payCouponFeeCount) {
        this.payCouponFeeCount = payCouponFeeCount;
    }

    /**
     * get 免费代金卷金额
     *
     * @return
     */
    public Number getFreeCouponFeeCount() {
        return freeCouponFeeCount;
    }

    /**
     * set 免费代金卷金额
     *
     * @param freeCouponFeeCount
     */
    public void setFreeCouponFeeCount(Number freeCouponFeeCount) {
        this.freeCouponFeeCount = freeCouponFeeCount;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public OperatorPrePayAchievement pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public OperatorPrePayAchievement name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 真实名称
     *
     * @param realName
     */
    public OperatorPrePayAchievement realName(String realName) {
        this.realName = realName;
        return this;
    }

    /**
     * set 部门
     *
     * @param dept
     */
    public OperatorPrePayAchievement dept(Integer dept) {
        this.dept = dept;
        return this;
    }

    /**
     * set 部门名称
     *
     * @param deptName
     */
    public OperatorPrePayAchievement deptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * set 服务商类型
     *
     * @param distributorType
     */
    public OperatorPrePayAchievement distributorType(String distributorType) {
        this.distributorType = distributorType;
        return this;
    }

    /**
     * set 服务商类型名称
     *
     * @param distributorTypeName
     */
    public OperatorPrePayAchievement distributorTypeName(String distributorTypeName) {
        this.distributorTypeName = distributorTypeName;
        return this;
    }

    /**
     * set 一级服务商名称
     *
     * @param oneLevelDistributorName
     */
    public OperatorPrePayAchievement oneLevelDistributorName(String oneLevelDistributorName) {
        this.oneLevelDistributorName = oneLevelDistributorName;
        return this;
    }

    /**
     * set 二级服务商名称
     *
     * @param secondLevelDistributorName
     */
    public OperatorPrePayAchievement secondLevelDistributorName(String secondLevelDistributorName) {
        this.secondLevelDistributorName = secondLevelDistributorName;
        return this;
    }

    /**
     * set 上级服务商名称
     *
     * @param superDistributorName
     */
    public OperatorPrePayAchievement superDistributorName(String superDistributorName) {
        this.superDistributorName = superDistributorName;
        return this;
    }

    /**
     * set 上级服务商pin
     *
     * @param superDistributorPin
     */
    public OperatorPrePayAchievement superDistributorPin(String superDistributorPin) {
        this.superDistributorPin = superDistributorPin;
        return this;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public OperatorPrePayAchievement serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set serviceCodeName
     *
     * @param serviceCodeName
     */
    public OperatorPrePayAchievement serviceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
        return this;
    }

    /**
     * set opType
     *
     * @param opType
     */
    public OperatorPrePayAchievement opType(Integer opType) {
        this.opType = opType;
        return this;
    }

    /**
     * set opTypeName
     *
     * @param opTypeName
     */
    public OperatorPrePayAchievement opTypeName(String opTypeName) {
        this.opTypeName = opTypeName;
        return this;
    }

    /**
     * set 帐户名
     *
     * @param loginName
     */
    public OperatorPrePayAchievement loginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    /**
     * set 开始时间
     *
     * @param billTime
     */
    public OperatorPrePayAchievement billTime(String billTime) {
        this.billTime = billTime;
        return this;
    }

    /**
     * set 完成时间
     *
     * @param consumeDate
     */
    public OperatorPrePayAchievement consumeDate(String consumeDate) {
        this.consumeDate = consumeDate;
        return this;
    }

    /**
     * set 交易单号
     *
     * @param transactionNo
     */
    public OperatorPrePayAchievement transactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }

    /**
     * set 优惠前金额
     *
     * @param consumeCount
     */
    public OperatorPrePayAchievement consumeCount(Number consumeCount) {
        this.consumeCount = consumeCount;
        return this;
    }

    /**
     * set 现金支付
     *
     * @param cashPayFeeCount
     */
    public OperatorPrePayAchievement cashPayFeeCount(Number cashPayFeeCount) {
        this.cashPayFeeCount = cashPayFeeCount;
        return this;
    }

    /**
     * set 业绩金额
     *
     * @param achievmentCount
     */
    public OperatorPrePayAchievement achievmentCount(Number achievmentCount) {
        this.achievmentCount = achievmentCount;
        return this;
    }

    /**
     * set 付费代金卷金额
     *
     * @param payCouponFeeCount
     */
    public OperatorPrePayAchievement payCouponFeeCount(Number payCouponFeeCount) {
        this.payCouponFeeCount = payCouponFeeCount;
        return this;
    }

    /**
     * set 免费代金卷金额
     *
     * @param freeCouponFeeCount
     */
    public OperatorPrePayAchievement freeCouponFeeCount(Number freeCouponFeeCount) {
        this.freeCouponFeeCount = freeCouponFeeCount;
        return this;
    }


}