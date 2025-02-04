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
 * refundOrderFee
 */
public class RefundOrderFee  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */
    private String orderNumber;

    /**
     * 订单退款金额
     */
    private Double fee;

    /**
     * 现金退款金额
     */
    private Double cashFee;

    /**
     * 余额退款金额
     */
    private Double balanceFee;

    /**
     * 代金券退款金额
     */
    private Double couponFee;


    /**
     * get 订单编号
     *
     * @return
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * set 订单编号
     *
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * get 订单退款金额
     *
     * @return
     */
    public Double getFee() {
        return fee;
    }

    /**
     * set 订单退款金额
     *
     * @param fee
     */
    public void setFee(Double fee) {
        this.fee = fee;
    }

    /**
     * get 现金退款金额
     *
     * @return
     */
    public Double getCashFee() {
        return cashFee;
    }

    /**
     * set 现金退款金额
     *
     * @param cashFee
     */
    public void setCashFee(Double cashFee) {
        this.cashFee = cashFee;
    }

    /**
     * get 余额退款金额
     *
     * @return
     */
    public Double getBalanceFee() {
        return balanceFee;
    }

    /**
     * set 余额退款金额
     *
     * @param balanceFee
     */
    public void setBalanceFee(Double balanceFee) {
        this.balanceFee = balanceFee;
    }

    /**
     * get 代金券退款金额
     *
     * @return
     */
    public Double getCouponFee() {
        return couponFee;
    }

    /**
     * set 代金券退款金额
     *
     * @param couponFee
     */
    public void setCouponFee(Double couponFee) {
        this.couponFee = couponFee;
    }


    /**
     * set 订单编号
     *
     * @param orderNumber
     */
    public RefundOrderFee orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * set 订单退款金额
     *
     * @param fee
     */
    public RefundOrderFee fee(Double fee) {
        this.fee = fee;
        return this;
    }

    /**
     * set 现金退款金额
     *
     * @param cashFee
     */
    public RefundOrderFee cashFee(Double cashFee) {
        this.cashFee = cashFee;
        return this;
    }

    /**
     * set 余额退款金额
     *
     * @param balanceFee
     */
    public RefundOrderFee balanceFee(Double balanceFee) {
        this.balanceFee = balanceFee;
        return this;
    }

    /**
     * set 代金券退款金额
     *
     * @param couponFee
     */
    public RefundOrderFee couponFee(Double couponFee) {
        this.couponFee = couponFee;
        return this;
    }


}