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

import java.util.List;
import java.util.ArrayList;

/**
 * accountingBillDTO
 */
public class AccountingBillDTO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品类型
     */
    private Integer source;

    /**
     * 记录ID
     */
    private Integer recordId;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 业务线
     */
    private String appCode;

    /**
     * 产品线
     */
    private String serviceCode;

    /**
     * 产品ID
     */
    private String productId;

    /**
     * 站点  0:主站  其他:专有云
     */
    private Integer site;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 区域
     */
    private String region;

    /**
     * 计费类型
     */
    private Integer billingType;

    /**
     * 配置列表
     */
    
    private List<FormulaDTO> formulaList;
    /**
     * 费用
     */
    private Number billFee2;

    /**
     * 折扣金额
     */
    private Number discountFee;

    /**
     * 优惠后金额
     */
    private Number actualFee;

    /**
     * 代金券唯一标识
     */
    private String cashCouponId;

    /**
     * 代金券金额
     */
    private Number cashCouponFee;

    /**
     * 付费代金券金额
     */
    private Number payCouponFee;

    /**
     * 免费代金券金额
     */
    private Number freeCouponFee;

    /**
     * 余额支付金额
     */
    private Number balancePayFee;

    /**
     * 在线支付金额
     */
    private Number cashPayFee;

    /**
     * 业绩金额
     */
    private Number performanceFee;

    /**
     * 账单时间
     */
    private String billTime;

    /**
     * 账单支付时间
     */
    private String billPayTime;

    /**
     * 账单开始时间
     */
    private String billBeginTime;

    /**
     * 账单结束时间
     */
    private String billEndTime;

    /**
     * 服务商pin
     */
    private String distributorPin;

    /**
     * 服务商类型
     */
    private Integer distributorType;

    /**
     * 子订单号
     */
    private String transactionNo;

    /**
     * 订单号
     */
    private String mainTransactionNo;

    /**
     * 退款单号
     */
    private String refundNo;

    /**
     * 操作类型
     */
    private Integer opType;

    /**
     * 返回编码0成功-1失败
     */
    private Integer code;

    /**
     * 返回消息
     */
    private String message;



    /**
     * get 产品类型
     *
     * @return
     */
    public Integer getSource() {
        return source;
    }

    /**
     * set 产品类型
     *
     * @param source
     */
    public void setSource(Integer source) {
        this.source = source;
    }


    /**
     * get 记录ID
     *
     * @return
     */
    public Integer getRecordId() {
        return recordId;
    }

    /**
     * set 记录ID
     *
     * @param recordId
     */
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }


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
     * get 产品ID
     *
     * @return
     */
    public String getProductId() {
        return productId;
    }

    /**
     * set 产品ID
     *
     * @param productId
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }


    /**
     * get 站点  0:主站  其他:专有云
     *
     * @return
     */
    public Integer getSite() {
        return site;
    }

    /**
     * set 站点  0:主站  其他:专有云
     *
     * @param site
     */
    public void setSite(Integer site) {
        this.site = site;
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
     * get 区域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 区域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
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
    * get 配置列表
    *
    * @return
    */
    public List<FormulaDTO> getFormulaList() {
        return formulaList;
    }

    /**
    * set 配置列表
    *
    * @param formulaList
    */
    public void setFormulaList(List<FormulaDTO> formulaList) {
        this.formulaList = formulaList;
    }


    /**
     * get 费用
     *
     * @return
     */
    public Number getBillFee2() {
        return billFee2;
    }

    /**
     * set 费用
     *
     * @param billFee2
     */
    public void setBillFee2(Number billFee2) {
        this.billFee2 = billFee2;
    }


    /**
     * get 折扣金额
     *
     * @return
     */
    public Number getDiscountFee() {
        return discountFee;
    }

    /**
     * set 折扣金额
     *
     * @param discountFee
     */
    public void setDiscountFee(Number discountFee) {
        this.discountFee = discountFee;
    }


    /**
     * get 优惠后金额
     *
     * @return
     */
    public Number getActualFee() {
        return actualFee;
    }

    /**
     * set 优惠后金额
     *
     * @param actualFee
     */
    public void setActualFee(Number actualFee) {
        this.actualFee = actualFee;
    }


    /**
     * get 代金券唯一标识
     *
     * @return
     */
    public String getCashCouponId() {
        return cashCouponId;
    }

    /**
     * set 代金券唯一标识
     *
     * @param cashCouponId
     */
    public void setCashCouponId(String cashCouponId) {
        this.cashCouponId = cashCouponId;
    }


    /**
     * get 代金券金额
     *
     * @return
     */
    public Number getCashCouponFee() {
        return cashCouponFee;
    }

    /**
     * set 代金券金额
     *
     * @param cashCouponFee
     */
    public void setCashCouponFee(Number cashCouponFee) {
        this.cashCouponFee = cashCouponFee;
    }


    /**
     * get 付费代金券金额
     *
     * @return
     */
    public Number getPayCouponFee() {
        return payCouponFee;
    }

    /**
     * set 付费代金券金额
     *
     * @param payCouponFee
     */
    public void setPayCouponFee(Number payCouponFee) {
        this.payCouponFee = payCouponFee;
    }


    /**
     * get 免费代金券金额
     *
     * @return
     */
    public Number getFreeCouponFee() {
        return freeCouponFee;
    }

    /**
     * set 免费代金券金额
     *
     * @param freeCouponFee
     */
    public void setFreeCouponFee(Number freeCouponFee) {
        this.freeCouponFee = freeCouponFee;
    }


    /**
     * get 余额支付金额
     *
     * @return
     */
    public Number getBalancePayFee() {
        return balancePayFee;
    }

    /**
     * set 余额支付金额
     *
     * @param balancePayFee
     */
    public void setBalancePayFee(Number balancePayFee) {
        this.balancePayFee = balancePayFee;
    }


    /**
     * get 在线支付金额
     *
     * @return
     */
    public Number getCashPayFee() {
        return cashPayFee;
    }

    /**
     * set 在线支付金额
     *
     * @param cashPayFee
     */
    public void setCashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
    }


    /**
     * get 业绩金额
     *
     * @return
     */
    public Number getPerformanceFee() {
        return performanceFee;
    }

    /**
     * set 业绩金额
     *
     * @param performanceFee
     */
    public void setPerformanceFee(Number performanceFee) {
        this.performanceFee = performanceFee;
    }


    /**
     * get 账单时间
     *
     * @return
     */
    public String getBillTime() {
        return billTime;
    }

    /**
     * set 账单时间
     *
     * @param billTime
     */
    public void setBillTime(String billTime) {
        this.billTime = billTime;
    }


    /**
     * get 账单支付时间
     *
     * @return
     */
    public String getBillPayTime() {
        return billPayTime;
    }

    /**
     * set 账单支付时间
     *
     * @param billPayTime
     */
    public void setBillPayTime(String billPayTime) {
        this.billPayTime = billPayTime;
    }


    /**
     * get 账单开始时间
     *
     * @return
     */
    public String getBillBeginTime() {
        return billBeginTime;
    }

    /**
     * set 账单开始时间
     *
     * @param billBeginTime
     */
    public void setBillBeginTime(String billBeginTime) {
        this.billBeginTime = billBeginTime;
    }


    /**
     * get 账单结束时间
     *
     * @return
     */
    public String getBillEndTime() {
        return billEndTime;
    }

    /**
     * set 账单结束时间
     *
     * @param billEndTime
     */
    public void setBillEndTime(String billEndTime) {
        this.billEndTime = billEndTime;
    }


    /**
     * get 服务商pin
     *
     * @return
     */
    public String getDistributorPin() {
        return distributorPin;
    }

    /**
     * set 服务商pin
     *
     * @param distributorPin
     */
    public void setDistributorPin(String distributorPin) {
        this.distributorPin = distributorPin;
    }


    /**
     * get 服务商类型
     *
     * @return
     */
    public Integer getDistributorType() {
        return distributorType;
    }

    /**
     * set 服务商类型
     *
     * @param distributorType
     */
    public void setDistributorType(Integer distributorType) {
        this.distributorType = distributorType;
    }


    /**
     * get 子订单号
     *
     * @return
     */
    public String getTransactionNo() {
        return transactionNo;
    }

    /**
     * set 子订单号
     *
     * @param transactionNo
     */
    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }


    /**
     * get 订单号
     *
     * @return
     */
    public String getMainTransactionNo() {
        return mainTransactionNo;
    }

    /**
     * set 订单号
     *
     * @param mainTransactionNo
     */
    public void setMainTransactionNo(String mainTransactionNo) {
        this.mainTransactionNo = mainTransactionNo;
    }


    /**
     * get 退款单号
     *
     * @return
     */
    public String getRefundNo() {
        return refundNo;
    }

    /**
     * set 退款单号
     *
     * @param refundNo
     */
    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }


    /**
     * get 操作类型
     *
     * @return
     */
    public Integer getOpType() {
        return opType;
    }

    /**
     * set 操作类型
     *
     * @param opType
     */
    public void setOpType(Integer opType) {
        this.opType = opType;
    }


    /**
     * get 返回编码0成功-1失败
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set 返回编码0成功-1失败
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
     * set 产品类型
     *
     * @param source
     */
    public AccountingBillDTO source(Integer source) {
        this.source = source;
        return this;
    }


    /**
     * set 记录ID
     *
     * @param recordId
     */
    public AccountingBillDTO recordId(Integer recordId) {
        this.recordId = recordId;
        return this;
    }


    /**
     * set 用户pin
     *
     * @param pin
     */
    public AccountingBillDTO pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 业务线
     *
     * @param appCode
     */
    public AccountingBillDTO appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }


    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public AccountingBillDTO serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 产品ID
     *
     * @param productId
     */
    public AccountingBillDTO productId(String productId) {
        this.productId = productId;
        return this;
    }


    /**
     * set 站点  0:主站  其他:专有云
     *
     * @param site
     */
    public AccountingBillDTO site(Integer site) {
        this.site = site;
        return this;
    }


    /**
     * set 资源id
     *
     * @param resourceId
     */
    public AccountingBillDTO resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 区域
     *
     * @param region
     */
    public AccountingBillDTO region(String region) {
        this.region = region;
        return this;
    }


    /**
     * set 计费类型
     *
     * @param billingType
     */
    public AccountingBillDTO billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }


    /**
    * set 配置列表
    *
    * @param formulaList
    */
    public AccountingBillDTO formulaList(List<FormulaDTO> formulaList) {
        this.formulaList = formulaList;
        return this;
    }


    /**
     * set 费用
     *
     * @param billFee2
     */
    public AccountingBillDTO billFee2(Number billFee2) {
        this.billFee2 = billFee2;
        return this;
    }


    /**
     * set 折扣金额
     *
     * @param discountFee
     */
    public AccountingBillDTO discountFee(Number discountFee) {
        this.discountFee = discountFee;
        return this;
    }


    /**
     * set 优惠后金额
     *
     * @param actualFee
     */
    public AccountingBillDTO actualFee(Number actualFee) {
        this.actualFee = actualFee;
        return this;
    }


    /**
     * set 代金券唯一标识
     *
     * @param cashCouponId
     */
    public AccountingBillDTO cashCouponId(String cashCouponId) {
        this.cashCouponId = cashCouponId;
        return this;
    }


    /**
     * set 代金券金额
     *
     * @param cashCouponFee
     */
    public AccountingBillDTO cashCouponFee(Number cashCouponFee) {
        this.cashCouponFee = cashCouponFee;
        return this;
    }


    /**
     * set 付费代金券金额
     *
     * @param payCouponFee
     */
    public AccountingBillDTO payCouponFee(Number payCouponFee) {
        this.payCouponFee = payCouponFee;
        return this;
    }


    /**
     * set 免费代金券金额
     *
     * @param freeCouponFee
     */
    public AccountingBillDTO freeCouponFee(Number freeCouponFee) {
        this.freeCouponFee = freeCouponFee;
        return this;
    }


    /**
     * set 余额支付金额
     *
     * @param balancePayFee
     */
    public AccountingBillDTO balancePayFee(Number balancePayFee) {
        this.balancePayFee = balancePayFee;
        return this;
    }


    /**
     * set 在线支付金额
     *
     * @param cashPayFee
     */
    public AccountingBillDTO cashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
        return this;
    }


    /**
     * set 业绩金额
     *
     * @param performanceFee
     */
    public AccountingBillDTO performanceFee(Number performanceFee) {
        this.performanceFee = performanceFee;
        return this;
    }


    /**
     * set 账单时间
     *
     * @param billTime
     */
    public AccountingBillDTO billTime(String billTime) {
        this.billTime = billTime;
        return this;
    }


    /**
     * set 账单支付时间
     *
     * @param billPayTime
     */
    public AccountingBillDTO billPayTime(String billPayTime) {
        this.billPayTime = billPayTime;
        return this;
    }


    /**
     * set 账单开始时间
     *
     * @param billBeginTime
     */
    public AccountingBillDTO billBeginTime(String billBeginTime) {
        this.billBeginTime = billBeginTime;
        return this;
    }


    /**
     * set 账单结束时间
     *
     * @param billEndTime
     */
    public AccountingBillDTO billEndTime(String billEndTime) {
        this.billEndTime = billEndTime;
        return this;
    }


    /**
     * set 服务商pin
     *
     * @param distributorPin
     */
    public AccountingBillDTO distributorPin(String distributorPin) {
        this.distributorPin = distributorPin;
        return this;
    }


    /**
     * set 服务商类型
     *
     * @param distributorType
     */
    public AccountingBillDTO distributorType(Integer distributorType) {
        this.distributorType = distributorType;
        return this;
    }


    /**
     * set 子订单号
     *
     * @param transactionNo
     */
    public AccountingBillDTO transactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }


    /**
     * set 订单号
     *
     * @param mainTransactionNo
     */
    public AccountingBillDTO mainTransactionNo(String mainTransactionNo) {
        this.mainTransactionNo = mainTransactionNo;
        return this;
    }


    /**
     * set 退款单号
     *
     * @param refundNo
     */
    public AccountingBillDTO refundNo(String refundNo) {
        this.refundNo = refundNo;
        return this;
    }


    /**
     * set 操作类型
     *
     * @param opType
     */
    public AccountingBillDTO opType(Integer opType) {
        this.opType = opType;
        return this;
    }


    /**
     * set 返回编码0成功-1失败
     *
     * @param code
     */
    public AccountingBillDTO code(Integer code) {
        this.code = code;
        return this;
    }


    /**
     * set 返回消息
     *
     * @param message
     */
    public AccountingBillDTO message(String message) {
        this.message = message;
        return this;
    }



    /**
     * add item to 配置列表
     *
     * @param formulaList
     */
    public void addFormulaList(FormulaDTO formulaList) {
        if (this.formulaList == null) {
            this.formulaList = new ArrayList<>();
        }
        this.formulaList.add(formulaList);
    }
}