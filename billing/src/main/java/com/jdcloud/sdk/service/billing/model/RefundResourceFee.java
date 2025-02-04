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
 * refundResourceFee
 */
public class RefundResourceFee  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 资源退款金额
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
     * 退款订单列表
     */
    private List<RefundOrderFee> orderFees;


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
     * get 资源退款金额
     *
     * @return
     */
    public Double getFee() {
        return fee;
    }

    /**
     * set 资源退款金额
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
     * get 退款订单列表
     *
     * @return
     */
    public List<RefundOrderFee> getOrderFees() {
        return orderFees;
    }

    /**
     * set 退款订单列表
     *
     * @param orderFees
     */
    public void setOrderFees(List<RefundOrderFee> orderFees) {
        this.orderFees = orderFees;
    }


    /**
     * set 资源id
     *
     * @param resourceId
     */
    public RefundResourceFee resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 资源退款金额
     *
     * @param fee
     */
    public RefundResourceFee fee(Double fee) {
        this.fee = fee;
        return this;
    }

    /**
     * set 现金退款金额
     *
     * @param cashFee
     */
    public RefundResourceFee cashFee(Double cashFee) {
        this.cashFee = cashFee;
        return this;
    }

    /**
     * set 余额退款金额
     *
     * @param balanceFee
     */
    public RefundResourceFee balanceFee(Double balanceFee) {
        this.balanceFee = balanceFee;
        return this;
    }

    /**
     * set 代金券退款金额
     *
     * @param couponFee
     */
    public RefundResourceFee couponFee(Double couponFee) {
        this.couponFee = couponFee;
        return this;
    }

    /**
     * set 退款订单列表
     *
     * @param orderFees
     */
    public RefundResourceFee orderFees(List<RefundOrderFee> orderFees) {
        this.orderFees = orderFees;
        return this;
    }


    /**
     * add item to 退款订单列表
     *
     * @param orderFee
     */
    public void addOrderFee(RefundOrderFee orderFee) {
        if (this.orderFees == null) {
            this.orderFees = new ArrayList<>();
        }
        this.orderFees.add(orderFee);
    }

}