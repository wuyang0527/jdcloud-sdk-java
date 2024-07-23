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
 * Price APIs
 * 价格计算API接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.billing.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.billing.model.OrderPriceDetail;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询计费价格信息
 */
public class CalculateTotalPriceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 原价（6位）
     */
    private Double totalPrice;

    /**
     * 原价(6位，兼容之前4位保留字段)
     */
    private Double totalPriceScale4;

    /**
     * 应付金额（2位）
     */
    private Double discountedTotalPrice;

    /**
     * 折扣金额（6位）
     */
    private Double totalDiscount;

    /**
     * 折扣后金额(6位)
     */
    private Double afterFavorableTotalPrice;

    /**
     * 抹零金额（6位）
     */
    private Double eraseTotalPrice;

    /**
     * list
     */
    
    private List<OrderPriceDetail> list;
    /**
     * 订单原价 包年时 一年原价为12个月价格，totalPrice为10个月价格（6位）
     */
    private Double totalOriginalPrice;

    /**
     * 参与优惠的明细
     */
    private String favorableInfos;

    /**
     * 备注
     */
    private String remark;

    /**
     * 各订单单价总和（6位）
     */
    private Double totalUnitPrice;

    /**
     * 退款总金额
     */
    private Double refundTotalPrice;

    /**
     * 现金退款总金额
     */
    private Double cashRefundTotalPrice;

    /**
     * 余额退款总金额
     */
    private Double balanceRefundTotalPrice;

    /**
     * 代金券退款总金额
     */
    private Double couponRefundTotalPrice;



    /**
     * get 原价（6位）
     *
     * @return
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * set 原价（6位）
     *
     * @param totalPrice
     */
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * get 原价(6位，兼容之前4位保留字段)
     *
     * @return
     */
    public Double getTotalPriceScale4() {
        return totalPriceScale4;
    }

    /**
     * set 原价(6位，兼容之前4位保留字段)
     *
     * @param totalPriceScale4
     */
    public void setTotalPriceScale4(Double totalPriceScale4) {
        this.totalPriceScale4 = totalPriceScale4;
    }


    /**
     * get 应付金额（2位）
     *
     * @return
     */
    public Double getDiscountedTotalPrice() {
        return discountedTotalPrice;
    }

    /**
     * set 应付金额（2位）
     *
     * @param discountedTotalPrice
     */
    public void setDiscountedTotalPrice(Double discountedTotalPrice) {
        this.discountedTotalPrice = discountedTotalPrice;
    }


    /**
     * get 折扣金额（6位）
     *
     * @return
     */
    public Double getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * set 折扣金额（6位）
     *
     * @param totalDiscount
     */
    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }


    /**
     * get 折扣后金额(6位)
     *
     * @return
     */
    public Double getAfterFavorableTotalPrice() {
        return afterFavorableTotalPrice;
    }

    /**
     * set 折扣后金额(6位)
     *
     * @param afterFavorableTotalPrice
     */
    public void setAfterFavorableTotalPrice(Double afterFavorableTotalPrice) {
        this.afterFavorableTotalPrice = afterFavorableTotalPrice;
    }


    /**
     * get 抹零金额（6位）
     *
     * @return
     */
    public Double getEraseTotalPrice() {
        return eraseTotalPrice;
    }

    /**
     * set 抹零金额（6位）
     *
     * @param eraseTotalPrice
     */
    public void setEraseTotalPrice(Double eraseTotalPrice) {
        this.eraseTotalPrice = eraseTotalPrice;
    }


    /**
    * get list
    *
    * @return
    */
    public List<OrderPriceDetail> getList() {
        return list;
    }

    /**
    * set list
    *
    * @param list
    */
    public void setList(List<OrderPriceDetail> list) {
        this.list = list;
    }


    /**
     * get 订单原价 包年时 一年原价为12个月价格，totalPrice为10个月价格（6位）
     *
     * @return
     */
    public Double getTotalOriginalPrice() {
        return totalOriginalPrice;
    }

    /**
     * set 订单原价 包年时 一年原价为12个月价格，totalPrice为10个月价格（6位）
     *
     * @param totalOriginalPrice
     */
    public void setTotalOriginalPrice(Double totalOriginalPrice) {
        this.totalOriginalPrice = totalOriginalPrice;
    }


    /**
     * get 参与优惠的明细
     *
     * @return
     */
    public String getFavorableInfos() {
        return favorableInfos;
    }

    /**
     * set 参与优惠的明细
     *
     * @param favorableInfos
     */
    public void setFavorableInfos(String favorableInfos) {
        this.favorableInfos = favorableInfos;
    }


    /**
     * get 备注
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 备注
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
     * get 各订单单价总和（6位）
     *
     * @return
     */
    public Double getTotalUnitPrice() {
        return totalUnitPrice;
    }

    /**
     * set 各订单单价总和（6位）
     *
     * @param totalUnitPrice
     */
    public void setTotalUnitPrice(Double totalUnitPrice) {
        this.totalUnitPrice = totalUnitPrice;
    }


    /**
     * get 退款总金额
     *
     * @return
     */
    public Double getRefundTotalPrice() {
        return refundTotalPrice;
    }

    /**
     * set 退款总金额
     *
     * @param refundTotalPrice
     */
    public void setRefundTotalPrice(Double refundTotalPrice) {
        this.refundTotalPrice = refundTotalPrice;
    }


    /**
     * get 现金退款总金额
     *
     * @return
     */
    public Double getCashRefundTotalPrice() {
        return cashRefundTotalPrice;
    }

    /**
     * set 现金退款总金额
     *
     * @param cashRefundTotalPrice
     */
    public void setCashRefundTotalPrice(Double cashRefundTotalPrice) {
        this.cashRefundTotalPrice = cashRefundTotalPrice;
    }


    /**
     * get 余额退款总金额
     *
     * @return
     */
    public Double getBalanceRefundTotalPrice() {
        return balanceRefundTotalPrice;
    }

    /**
     * set 余额退款总金额
     *
     * @param balanceRefundTotalPrice
     */
    public void setBalanceRefundTotalPrice(Double balanceRefundTotalPrice) {
        this.balanceRefundTotalPrice = balanceRefundTotalPrice;
    }


    /**
     * get 代金券退款总金额
     *
     * @return
     */
    public Double getCouponRefundTotalPrice() {
        return couponRefundTotalPrice;
    }

    /**
     * set 代金券退款总金额
     *
     * @param couponRefundTotalPrice
     */
    public void setCouponRefundTotalPrice(Double couponRefundTotalPrice) {
        this.couponRefundTotalPrice = couponRefundTotalPrice;
    }



    /**
     * set 原价（6位）
     *
     * @param totalPrice
     */
    public CalculateTotalPriceResult totalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }


    /**
     * set 原价(6位，兼容之前4位保留字段)
     *
     * @param totalPriceScale4
     */
    public CalculateTotalPriceResult totalPriceScale4(Double totalPriceScale4) {
        this.totalPriceScale4 = totalPriceScale4;
        return this;
    }


    /**
     * set 应付金额（2位）
     *
     * @param discountedTotalPrice
     */
    public CalculateTotalPriceResult discountedTotalPrice(Double discountedTotalPrice) {
        this.discountedTotalPrice = discountedTotalPrice;
        return this;
    }


    /**
     * set 折扣金额（6位）
     *
     * @param totalDiscount
     */
    public CalculateTotalPriceResult totalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
        return this;
    }


    /**
     * set 折扣后金额(6位)
     *
     * @param afterFavorableTotalPrice
     */
    public CalculateTotalPriceResult afterFavorableTotalPrice(Double afterFavorableTotalPrice) {
        this.afterFavorableTotalPrice = afterFavorableTotalPrice;
        return this;
    }


    /**
     * set 抹零金额（6位）
     *
     * @param eraseTotalPrice
     */
    public CalculateTotalPriceResult eraseTotalPrice(Double eraseTotalPrice) {
        this.eraseTotalPrice = eraseTotalPrice;
        return this;
    }


    /**
    * set list
    *
    * @param list
    */
    public CalculateTotalPriceResult list(List<OrderPriceDetail> list) {
        this.list = list;
        return this;
    }


    /**
     * set 订单原价 包年时 一年原价为12个月价格，totalPrice为10个月价格（6位）
     *
     * @param totalOriginalPrice
     */
    public CalculateTotalPriceResult totalOriginalPrice(Double totalOriginalPrice) {
        this.totalOriginalPrice = totalOriginalPrice;
        return this;
    }


    /**
     * set 参与优惠的明细
     *
     * @param favorableInfos
     */
    public CalculateTotalPriceResult favorableInfos(String favorableInfos) {
        this.favorableInfos = favorableInfos;
        return this;
    }


    /**
     * set 备注
     *
     * @param remark
     */
    public CalculateTotalPriceResult remark(String remark) {
        this.remark = remark;
        return this;
    }


    /**
     * set 各订单单价总和（6位）
     *
     * @param totalUnitPrice
     */
    public CalculateTotalPriceResult totalUnitPrice(Double totalUnitPrice) {
        this.totalUnitPrice = totalUnitPrice;
        return this;
    }


    /**
     * set 退款总金额
     *
     * @param refundTotalPrice
     */
    public CalculateTotalPriceResult refundTotalPrice(Double refundTotalPrice) {
        this.refundTotalPrice = refundTotalPrice;
        return this;
    }


    /**
     * set 现金退款总金额
     *
     * @param cashRefundTotalPrice
     */
    public CalculateTotalPriceResult cashRefundTotalPrice(Double cashRefundTotalPrice) {
        this.cashRefundTotalPrice = cashRefundTotalPrice;
        return this;
    }


    /**
     * set 余额退款总金额
     *
     * @param balanceRefundTotalPrice
     */
    public CalculateTotalPriceResult balanceRefundTotalPrice(Double balanceRefundTotalPrice) {
        this.balanceRefundTotalPrice = balanceRefundTotalPrice;
        return this;
    }


    /**
     * set 代金券退款总金额
     *
     * @param couponRefundTotalPrice
     */
    public CalculateTotalPriceResult couponRefundTotalPrice(Double couponRefundTotalPrice) {
        this.couponRefundTotalPrice = couponRefundTotalPrice;
        return this;
    }



    /**
     * add item to list
     *
     * @param list
     */
    public void addList(OrderPriceDetail list) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(list);
    }
}