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

package com.jdcloud.sdk.service.invoice.model;


/**
 * 发票关联订单
 */
public class InvoiceOrder  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 单据编号
     */
    private String orderId;

    /**
     * 单据类型[订单-1,账单-2]
     */
    private Integer receiptType;

    /**
     * 单据类型[订单-order,账单-bill]
     */
    private String typeDesc;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 实付金额
     */
    private Number amount;

    /**
     * invoicedAmount
     */
    private Number invoicedAmount;

    /**
     * 可开票金额
     */
    private Number enableAmount;

    /**
     * 已开票金额
     */
    private Number useAmount;

    /**
     * 退款金额
     */
    private Number refundAmount;

    /**
     * 申请状态
     */
    private Integer status;

    /**
     * 成单日期
     */
    private String finishTime;

    /**
     * 创建日期
     */
    private String createTime;

    /**
     * 更新日期
     */
    private String updateTime;

    /**
     * chargeSubject
     */
    private String chargeSubject;

    /**
     * batch
     */
    private String batch;

    /**
     * 查询 开始日期
     */
    private String searchStartTime;

    /**
     * 查询 结束日期
     */
    private String searchEndTime;

    /**
     * 使用人
     */
    private String owner;

    /**
     * 交易(支付)类型 1-代付 2-自付
     */
    private Integer payType;

    /**
     * payType描述 1-代付 2-自付
     */
    private String payTypeDesc;

    /**
     * 如果是月结订单，返回具体月份 例202301
     */
    private String monthGroup;



    /**
     * get id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * get 单据编号
     *
     * @return
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * set 单据编号
     *
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * get 单据类型[订单-1,账单-2]
     *
     * @return
     */
    public Integer getReceiptType() {
        return receiptType;
    }

    /**
     * set 单据类型[订单-1,账单-2]
     *
     * @param receiptType
     */
    public void setReceiptType(Integer receiptType) {
        this.receiptType = receiptType;
    }


    /**
     * get 单据类型[订单-order,账单-bill]
     *
     * @return
     */
    public String getTypeDesc() {
        return typeDesc;
    }

    /**
     * set 单据类型[订单-order,账单-bill]
     *
     * @param typeDesc
     */
    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }


    /**
     * get 产品名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 产品名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 实付金额
     *
     * @return
     */
    public Number getAmount() {
        return amount;
    }

    /**
     * set 实付金额
     *
     * @param amount
     */
    public void setAmount(Number amount) {
        this.amount = amount;
    }


    /**
     * get invoicedAmount
     *
     * @return
     */
    public Number getInvoicedAmount() {
        return invoicedAmount;
    }

    /**
     * set invoicedAmount
     *
     * @param invoicedAmount
     */
    public void setInvoicedAmount(Number invoicedAmount) {
        this.invoicedAmount = invoicedAmount;
    }


    /**
     * get 可开票金额
     *
     * @return
     */
    public Number getEnableAmount() {
        return enableAmount;
    }

    /**
     * set 可开票金额
     *
     * @param enableAmount
     */
    public void setEnableAmount(Number enableAmount) {
        this.enableAmount = enableAmount;
    }


    /**
     * get 已开票金额
     *
     * @return
     */
    public Number getUseAmount() {
        return useAmount;
    }

    /**
     * set 已开票金额
     *
     * @param useAmount
     */
    public void setUseAmount(Number useAmount) {
        this.useAmount = useAmount;
    }


    /**
     * get 退款金额
     *
     * @return
     */
    public Number getRefundAmount() {
        return refundAmount;
    }

    /**
     * set 退款金额
     *
     * @param refundAmount
     */
    public void setRefundAmount(Number refundAmount) {
        this.refundAmount = refundAmount;
    }


    /**
     * get 申请状态
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 申请状态
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * get 成单日期
     *
     * @return
     */
    public String getFinishTime() {
        return finishTime;
    }

    /**
     * set 成单日期
     *
     * @param finishTime
     */
    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }


    /**
     * get 创建日期
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建日期
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 更新日期
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新日期
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get chargeSubject
     *
     * @return
     */
    public String getChargeSubject() {
        return chargeSubject;
    }

    /**
     * set chargeSubject
     *
     * @param chargeSubject
     */
    public void setChargeSubject(String chargeSubject) {
        this.chargeSubject = chargeSubject;
    }


    /**
     * get batch
     *
     * @return
     */
    public String getBatch() {
        return batch;
    }

    /**
     * set batch
     *
     * @param batch
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }


    /**
     * get 查询 开始日期
     *
     * @return
     */
    public String getSearchStartTime() {
        return searchStartTime;
    }

    /**
     * set 查询 开始日期
     *
     * @param searchStartTime
     */
    public void setSearchStartTime(String searchStartTime) {
        this.searchStartTime = searchStartTime;
    }


    /**
     * get 查询 结束日期
     *
     * @return
     */
    public String getSearchEndTime() {
        return searchEndTime;
    }

    /**
     * set 查询 结束日期
     *
     * @param searchEndTime
     */
    public void setSearchEndTime(String searchEndTime) {
        this.searchEndTime = searchEndTime;
    }


    /**
     * get 使用人
     *
     * @return
     */
    public String getOwner() {
        return owner;
    }

    /**
     * set 使用人
     *
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }


    /**
     * get 交易(支付)类型 1-代付 2-自付
     *
     * @return
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * set 交易(支付)类型 1-代付 2-自付
     *
     * @param payType
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }


    /**
     * get payType描述 1-代付 2-自付
     *
     * @return
     */
    public String getPayTypeDesc() {
        return payTypeDesc;
    }

    /**
     * set payType描述 1-代付 2-自付
     *
     * @param payTypeDesc
     */
    public void setPayTypeDesc(String payTypeDesc) {
        this.payTypeDesc = payTypeDesc;
    }


    /**
     * get 如果是月结订单，返回具体月份 例202301
     *
     * @return
     */
    public String getMonthGroup() {
        return monthGroup;
    }

    /**
     * set 如果是月结订单，返回具体月份 例202301
     *
     * @param monthGroup
     */
    public void setMonthGroup(String monthGroup) {
        this.monthGroup = monthGroup;
    }



    /**
     * set id
     *
     * @param id
     */
    public InvoiceOrder id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set 用户pin
     *
     * @param pin
     */
    public InvoiceOrder pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 单据编号
     *
     * @param orderId
     */
    public InvoiceOrder orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }


    /**
     * set 单据类型[订单-1,账单-2]
     *
     * @param receiptType
     */
    public InvoiceOrder receiptType(Integer receiptType) {
        this.receiptType = receiptType;
        return this;
    }


    /**
     * set 单据类型[订单-order,账单-bill]
     *
     * @param typeDesc
     */
    public InvoiceOrder typeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
        return this;
    }


    /**
     * set 产品名称
     *
     * @param name
     */
    public InvoiceOrder name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 实付金额
     *
     * @param amount
     */
    public InvoiceOrder amount(Number amount) {
        this.amount = amount;
        return this;
    }


    /**
     * set invoicedAmount
     *
     * @param invoicedAmount
     */
    public InvoiceOrder invoicedAmount(Number invoicedAmount) {
        this.invoicedAmount = invoicedAmount;
        return this;
    }


    /**
     * set 可开票金额
     *
     * @param enableAmount
     */
    public InvoiceOrder enableAmount(Number enableAmount) {
        this.enableAmount = enableAmount;
        return this;
    }


    /**
     * set 已开票金额
     *
     * @param useAmount
     */
    public InvoiceOrder useAmount(Number useAmount) {
        this.useAmount = useAmount;
        return this;
    }


    /**
     * set 退款金额
     *
     * @param refundAmount
     */
    public InvoiceOrder refundAmount(Number refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }


    /**
     * set 申请状态
     *
     * @param status
     */
    public InvoiceOrder status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 成单日期
     *
     * @param finishTime
     */
    public InvoiceOrder finishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }


    /**
     * set 创建日期
     *
     * @param createTime
     */
    public InvoiceOrder createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 更新日期
     *
     * @param updateTime
     */
    public InvoiceOrder updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set chargeSubject
     *
     * @param chargeSubject
     */
    public InvoiceOrder chargeSubject(String chargeSubject) {
        this.chargeSubject = chargeSubject;
        return this;
    }


    /**
     * set batch
     *
     * @param batch
     */
    public InvoiceOrder batch(String batch) {
        this.batch = batch;
        return this;
    }


    /**
     * set 查询 开始日期
     *
     * @param searchStartTime
     */
    public InvoiceOrder searchStartTime(String searchStartTime) {
        this.searchStartTime = searchStartTime;
        return this;
    }


    /**
     * set 查询 结束日期
     *
     * @param searchEndTime
     */
    public InvoiceOrder searchEndTime(String searchEndTime) {
        this.searchEndTime = searchEndTime;
        return this;
    }


    /**
     * set 使用人
     *
     * @param owner
     */
    public InvoiceOrder owner(String owner) {
        this.owner = owner;
        return this;
    }


    /**
     * set 交易(支付)类型 1-代付 2-自付
     *
     * @param payType
     */
    public InvoiceOrder payType(Integer payType) {
        this.payType = payType;
        return this;
    }


    /**
     * set payType描述 1-代付 2-自付
     *
     * @param payTypeDesc
     */
    public InvoiceOrder payTypeDesc(String payTypeDesc) {
        this.payTypeDesc = payTypeDesc;
        return this;
    }


    /**
     * set 如果是月结订单，返回具体月份 例202301
     *
     * @param monthGroup
     */
    public InvoiceOrder monthGroup(String monthGroup) {
        this.monthGroup = monthGroup;
        return this;
    }


}