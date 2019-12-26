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
 * summaryBill
 */
public class SummaryBill  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 余额支付金额
     */
    private Number balancePayFee;

    /**
     * 优惠金额
     */
    private Number discountFee;

    /**
     * 优惠后金额
     */
    private Number realTotalFee;

    /**
     * 欠费金额
     */
    private Number arrearFee;

    /**
     * 优惠前金额
     */
    private Number totalFee;

    /**
     * 现金支付金额
     */
    private Number cashPayFee;

    /**
     * 代金券支付金额
     */
    private Number cashCouponFee;

    /**
     * pin
     */
    private String pin;


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
     * get 优惠金额
     *
     * @return
     */
    public Number getDiscountFee() {
        return discountFee;
    }

    /**
     * set 优惠金额
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
    public Number getRealTotalFee() {
        return realTotalFee;
    }

    /**
     * set 优惠后金额
     *
     * @param realTotalFee
     */
    public void setRealTotalFee(Number realTotalFee) {
        this.realTotalFee = realTotalFee;
    }

    /**
     * get 欠费金额
     *
     * @return
     */
    public Number getArrearFee() {
        return arrearFee;
    }

    /**
     * set 欠费金额
     *
     * @param arrearFee
     */
    public void setArrearFee(Number arrearFee) {
        this.arrearFee = arrearFee;
    }

    /**
     * get 优惠前金额
     *
     * @return
     */
    public Number getTotalFee() {
        return totalFee;
    }

    /**
     * set 优惠前金额
     *
     * @param totalFee
     */
    public void setTotalFee(Number totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * get 现金支付金额
     *
     * @return
     */
    public Number getCashPayFee() {
        return cashPayFee;
    }

    /**
     * set 现金支付金额
     *
     * @param cashPayFee
     */
    public void setCashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
    }

    /**
     * get 代金券支付金额
     *
     * @return
     */
    public Number getCashCouponFee() {
        return cashCouponFee;
    }

    /**
     * set 代金券支付金额
     *
     * @param cashCouponFee
     */
    public void setCashCouponFee(Number cashCouponFee) {
        this.cashCouponFee = cashCouponFee;
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
     * set 余额支付金额
     *
     * @param balancePayFee
     */
    public SummaryBill balancePayFee(Number balancePayFee) {
        this.balancePayFee = balancePayFee;
        return this;
    }

    /**
     * set 优惠金额
     *
     * @param discountFee
     */
    public SummaryBill discountFee(Number discountFee) {
        this.discountFee = discountFee;
        return this;
    }

    /**
     * set 优惠后金额
     *
     * @param realTotalFee
     */
    public SummaryBill realTotalFee(Number realTotalFee) {
        this.realTotalFee = realTotalFee;
        return this;
    }

    /**
     * set 欠费金额
     *
     * @param arrearFee
     */
    public SummaryBill arrearFee(Number arrearFee) {
        this.arrearFee = arrearFee;
        return this;
    }

    /**
     * set 优惠前金额
     *
     * @param totalFee
     */
    public SummaryBill totalFee(Number totalFee) {
        this.totalFee = totalFee;
        return this;
    }

    /**
     * set 现金支付金额
     *
     * @param cashPayFee
     */
    public SummaryBill cashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
        return this;
    }

    /**
     * set 代金券支付金额
     *
     * @param cashCouponFee
     */
    public SummaryBill cashCouponFee(Number cashCouponFee) {
        this.cashCouponFee = cashCouponFee;
        return this;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public SummaryBill pin(String pin) {
        this.pin = pin;
        return this;
    }


}