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

import java.util.List;
import java.util.ArrayList;

/**
 * consumptionProduct
 */
public class ConsumptionProduct  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appCode
     */
    private String appCode;

    /**
     * appCodeName
     */
    private String appCodeName;

    /**
     * serviceCode
     */
    private String serviceCode;

    /**
     * serviceCodeName
     */
    private String serviceCodeName;

    /**
     * 优惠后金额
     */
    private Number actualFee;

    /**
     * 现金支付
     */
    private Number cashPayFee;

    /**
     * 余额支付
     */
    private Number balancePayFee;

    /**
     * 代金券支付金额
     */
    private Number cashCouponPayFee;

    /**
     * 欠费金额
     */
    private Number arrearFee;

    /**
     * productDetails
     */
    private List<Consumption> productDetails;

    /**
     * productDetailList
     */
    private Object productDetailList;


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
     * get appCodeName
     *
     * @return
     */
    public String getAppCodeName() {
        return appCodeName;
    }

    /**
     * set appCodeName
     *
     * @param appCodeName
     */
    public void setAppCodeName(String appCodeName) {
        this.appCodeName = appCodeName;
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
     * get 现金支付
     *
     * @return
     */
    public Number getCashPayFee() {
        return cashPayFee;
    }

    /**
     * set 现金支付
     *
     * @param cashPayFee
     */
    public void setCashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
    }

    /**
     * get 余额支付
     *
     * @return
     */
    public Number getBalancePayFee() {
        return balancePayFee;
    }

    /**
     * set 余额支付
     *
     * @param balancePayFee
     */
    public void setBalancePayFee(Number balancePayFee) {
        this.balancePayFee = balancePayFee;
    }

    /**
     * get 代金券支付金额
     *
     * @return
     */
    public Number getCashCouponPayFee() {
        return cashCouponPayFee;
    }

    /**
     * set 代金券支付金额
     *
     * @param cashCouponPayFee
     */
    public void setCashCouponPayFee(Number cashCouponPayFee) {
        this.cashCouponPayFee = cashCouponPayFee;
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
     * get productDetails
     *
     * @return
     */
    public List<Consumption> getProductDetails() {
        return productDetails;
    }

    /**
     * set productDetails
     *
     * @param productDetails
     */
    public void setProductDetails(List<Consumption> productDetails) {
        this.productDetails = productDetails;
    }

    /**
     * get productDetailList
     *
     * @return
     */
    public Object getProductDetailList() {
        return productDetailList;
    }

    /**
     * set productDetailList
     *
     * @param productDetailList
     */
    public void setProductDetailList(Object productDetailList) {
        this.productDetailList = productDetailList;
    }


    /**
     * set appCode
     *
     * @param appCode
     */
    public ConsumptionProduct appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set appCodeName
     *
     * @param appCodeName
     */
    public ConsumptionProduct appCodeName(String appCodeName) {
        this.appCodeName = appCodeName;
        return this;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public ConsumptionProduct serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set serviceCodeName
     *
     * @param serviceCodeName
     */
    public ConsumptionProduct serviceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
        return this;
    }

    /**
     * set 优惠后金额
     *
     * @param actualFee
     */
    public ConsumptionProduct actualFee(Number actualFee) {
        this.actualFee = actualFee;
        return this;
    }

    /**
     * set 现金支付
     *
     * @param cashPayFee
     */
    public ConsumptionProduct cashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
        return this;
    }

    /**
     * set 余额支付
     *
     * @param balancePayFee
     */
    public ConsumptionProduct balancePayFee(Number balancePayFee) {
        this.balancePayFee = balancePayFee;
        return this;
    }

    /**
     * set 代金券支付金额
     *
     * @param cashCouponPayFee
     */
    public ConsumptionProduct cashCouponPayFee(Number cashCouponPayFee) {
        this.cashCouponPayFee = cashCouponPayFee;
        return this;
    }

    /**
     * set 欠费金额
     *
     * @param arrearFee
     */
    public ConsumptionProduct arrearFee(Number arrearFee) {
        this.arrearFee = arrearFee;
        return this;
    }

    /**
     * set productDetails
     *
     * @param productDetails
     */
    public ConsumptionProduct productDetails(List<Consumption> productDetails) {
        this.productDetails = productDetails;
        return this;
    }

    /**
     * set productDetailList
     *
     * @param productDetailList
     */
    public ConsumptionProduct productDetailList(Object productDetailList) {
        this.productDetailList = productDetailList;
        return this;
    }


    /**
     * add item to productDetails
     *
     * @param productDetail
     */
    public void addProductDetail(Consumption productDetail) {
        if (this.productDetails == null) {
            this.productDetails = new ArrayList<>();
        }
        this.productDetails.add(productDetail);
    }

}