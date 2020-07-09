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

package com.jdcloud.sdk.service.asset.model;


/**
 * voucher
 */
public class Voucher  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * cashingFee
     */
    private Double cashingFee;

    /**
     * createTime
     */
    private String createTime;

    /**
     * endTime
     */
    private String endTime;

    /**
     * erpOrderId
     */
    private String erpOrderId;

    /**
     * fee
     */
    private Double fee;

    /**
     * id
     */
    private Integer id;

    /**
     * paymentChannel
     */
    private Integer paymentChannel;

    /**
     * paymentNumber
     */
    private String paymentNumber;

    /**
     * pin
     */
    private String pin;

    /**
     * rechargeType
     */
    private Integer rechargeType;

    /**
     * status
     */
    private Integer status;

    /**
     * updateTime
     */
    private String updateTime;

    /**
     * usableFee
     */
    private Double usableFee;

    /**
     * userAllFee
     */
    private Double userAllFee;


    /**
     * get cashingFee
     *
     * @return
     */
    public Double getCashingFee() {
        return cashingFee;
    }

    /**
     * set cashingFee
     *
     * @param cashingFee
     */
    public void setCashingFee(Double cashingFee) {
        this.cashingFee = cashingFee;
    }

    /**
     * get createTime
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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
     * get erpOrderId
     *
     * @return
     */
    public String getErpOrderId() {
        return erpOrderId;
    }

    /**
     * set erpOrderId
     *
     * @param erpOrderId
     */
    public void setErpOrderId(String erpOrderId) {
        this.erpOrderId = erpOrderId;
    }

    /**
     * get fee
     *
     * @return
     */
    public Double getFee() {
        return fee;
    }

    /**
     * set fee
     *
     * @param fee
     */
    public void setFee(Double fee) {
        this.fee = fee;
    }

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
     * get paymentChannel
     *
     * @return
     */
    public Integer getPaymentChannel() {
        return paymentChannel;
    }

    /**
     * set paymentChannel
     *
     * @param paymentChannel
     */
    public void setPaymentChannel(Integer paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    /**
     * get paymentNumber
     *
     * @return
     */
    public String getPaymentNumber() {
        return paymentNumber;
    }

    /**
     * set paymentNumber
     *
     * @param paymentNumber
     */
    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

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
     * get rechargeType
     *
     * @return
     */
    public Integer getRechargeType() {
        return rechargeType;
    }

    /**
     * set rechargeType
     *
     * @param rechargeType
     */
    public void setRechargeType(Integer rechargeType) {
        this.rechargeType = rechargeType;
    }

    /**
     * get status
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set status
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get usableFee
     *
     * @return
     */
    public Double getUsableFee() {
        return usableFee;
    }

    /**
     * set usableFee
     *
     * @param usableFee
     */
    public void setUsableFee(Double usableFee) {
        this.usableFee = usableFee;
    }

    /**
     * get userAllFee
     *
     * @return
     */
    public Double getUserAllFee() {
        return userAllFee;
    }

    /**
     * set userAllFee
     *
     * @param userAllFee
     */
    public void setUserAllFee(Double userAllFee) {
        this.userAllFee = userAllFee;
    }


    /**
     * set cashingFee
     *
     * @param cashingFee
     */
    public Voucher cashingFee(Double cashingFee) {
        this.cashingFee = cashingFee;
        return this;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public Voucher createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set endTime
     *
     * @param endTime
     */
    public Voucher endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set erpOrderId
     *
     * @param erpOrderId
     */
    public Voucher erpOrderId(String erpOrderId) {
        this.erpOrderId = erpOrderId;
        return this;
    }

    /**
     * set fee
     *
     * @param fee
     */
    public Voucher fee(Double fee) {
        this.fee = fee;
        return this;
    }

    /**
     * set id
     *
     * @param id
     */
    public Voucher id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set paymentChannel
     *
     * @param paymentChannel
     */
    public Voucher paymentChannel(Integer paymentChannel) {
        this.paymentChannel = paymentChannel;
        return this;
    }

    /**
     * set paymentNumber
     *
     * @param paymentNumber
     */
    public Voucher paymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
        return this;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public Voucher pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set rechargeType
     *
     * @param rechargeType
     */
    public Voucher rechargeType(Integer rechargeType) {
        this.rechargeType = rechargeType;
        return this;
    }

    /**
     * set status
     *
     * @param status
     */
    public Voucher status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public Voucher updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set usableFee
     *
     * @param usableFee
     */
    public Voucher usableFee(Double usableFee) {
        this.usableFee = usableFee;
        return this;
    }

    /**
     * set userAllFee
     *
     * @param userAllFee
     */
    public Voucher userAllFee(Double userAllFee) {
        this.userAllFee = userAllFee;
        return this;
    }


}