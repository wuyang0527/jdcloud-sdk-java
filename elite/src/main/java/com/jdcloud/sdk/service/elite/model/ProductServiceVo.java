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

package com.jdcloud.sdk.service.elite.model;

import java.util.List;
import java.util.ArrayList;

/**
 * productServiceVo
 */
public class ProductServiceVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 交付单号
     */
    private String deliverNumber;

    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * 续费订单所关联的新购订单号，该字段只针对续费单有效，新购单该字段为null
     */
    private String refOrderNumber;

    /**
     * 订单类型
     */
    private Integer orderType;

    /**
     * 订单类型名称
     */
    private String orderTypeName;

    /**
     * 购买人
     */
    private String buyerPin;

    /**
     * 映射编号
     */
    private String mappingCode;

    /**
     * 是否支持自动交付：0表示不支持，1表示支持
     */
    private Integer supportAutoDeliver;

    /**
     * 产品ID
     */
    private Integer productId;

    /**
     * sku ID
     */
    private Integer skuId;

    /**
     * sku名称
     */
    private String skuName;

    /**
     * 服务code
     */
    private String serviceCode;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 周期
     */
    private Integer period;

    /**
     * 周期类型
     */
    private Integer periodType;

    /**
     * 周期类型名称
     */
    private String periodTypeName;

    /**
     * 账号数量
     */
    private Integer accountNum;

    /**
     * 交付状态
     */
    private Integer deliverStatus;

    /**
     * 交付状态名称
     */
    private String deliverStatusName;

    /**
     * 服务生效时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String effectiveDt;

    /**
     * 服务过期时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String failureDt;

    /**
     * 商品属性
     */
    private String extraInfo;

    /**
     * 交付单备注
     */
    private String remark;

    /**
     * 订单金额
     */
    private String orderTotalFee;

    /**
     * 订单实付金额
     */
    private String orderActualFee;

    /**
     * 订单支付时间
     */
    private String paymentDt;

    /**
     * 额外计费项信息
     */
    private String extraChargeInfo;

    /**
     * 额外计费详情信息
     */
    private List<OrderItemExtraChargeInfo> orderItemExtraChargeInfos;


    /**
     * get 交付单号
     *
     * @return
     */
    public String getDeliverNumber() {
        return deliverNumber;
    }

    /**
     * set 交付单号
     *
     * @param deliverNumber
     */
    public void setDeliverNumber(String deliverNumber) {
        this.deliverNumber = deliverNumber;
    }

    /**
     * get 订单号
     *
     * @return
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * set 订单号
     *
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * get 续费订单所关联的新购订单号，该字段只针对续费单有效，新购单该字段为null
     *
     * @return
     */
    public String getRefOrderNumber() {
        return refOrderNumber;
    }

    /**
     * set 续费订单所关联的新购订单号，该字段只针对续费单有效，新购单该字段为null
     *
     * @param refOrderNumber
     */
    public void setRefOrderNumber(String refOrderNumber) {
        this.refOrderNumber = refOrderNumber;
    }

    /**
     * get 订单类型
     *
     * @return
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * set 订单类型
     *
     * @param orderType
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * get 订单类型名称
     *
     * @return
     */
    public String getOrderTypeName() {
        return orderTypeName;
    }

    /**
     * set 订单类型名称
     *
     * @param orderTypeName
     */
    public void setOrderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName;
    }

    /**
     * get 购买人
     *
     * @return
     */
    public String getBuyerPin() {
        return buyerPin;
    }

    /**
     * set 购买人
     *
     * @param buyerPin
     */
    public void setBuyerPin(String buyerPin) {
        this.buyerPin = buyerPin;
    }

    /**
     * get 映射编号
     *
     * @return
     */
    public String getMappingCode() {
        return mappingCode;
    }

    /**
     * set 映射编号
     *
     * @param mappingCode
     */
    public void setMappingCode(String mappingCode) {
        this.mappingCode = mappingCode;
    }

    /**
     * get 是否支持自动交付：0表示不支持，1表示支持
     *
     * @return
     */
    public Integer getSupportAutoDeliver() {
        return supportAutoDeliver;
    }

    /**
     * set 是否支持自动交付：0表示不支持，1表示支持
     *
     * @param supportAutoDeliver
     */
    public void setSupportAutoDeliver(Integer supportAutoDeliver) {
        this.supportAutoDeliver = supportAutoDeliver;
    }

    /**
     * get 产品ID
     *
     * @return
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * set 产品ID
     *
     * @param productId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * get sku ID
     *
     * @return
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * set sku ID
     *
     * @param skuId
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * get sku名称
     *
     * @return
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * set sku名称
     *
     * @param skuName
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    /**
     * get 服务code
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 服务code
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 数量
     *
     * @return
     */
    public Integer getNum() {
        return num;
    }

    /**
     * set 数量
     *
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * get 周期
     *
     * @return
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * set 周期
     *
     * @param period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * get 周期类型
     *
     * @return
     */
    public Integer getPeriodType() {
        return periodType;
    }

    /**
     * set 周期类型
     *
     * @param periodType
     */
    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    /**
     * get 周期类型名称
     *
     * @return
     */
    public String getPeriodTypeName() {
        return periodTypeName;
    }

    /**
     * set 周期类型名称
     *
     * @param periodTypeName
     */
    public void setPeriodTypeName(String periodTypeName) {
        this.periodTypeName = periodTypeName;
    }

    /**
     * get 账号数量
     *
     * @return
     */
    public Integer getAccountNum() {
        return accountNum;
    }

    /**
     * set 账号数量
     *
     * @param accountNum
     */
    public void setAccountNum(Integer accountNum) {
        this.accountNum = accountNum;
    }

    /**
     * get 交付状态
     *
     * @return
     */
    public Integer getDeliverStatus() {
        return deliverStatus;
    }

    /**
     * set 交付状态
     *
     * @param deliverStatus
     */
    public void setDeliverStatus(Integer deliverStatus) {
        this.deliverStatus = deliverStatus;
    }

    /**
     * get 交付状态名称
     *
     * @return
     */
    public String getDeliverStatusName() {
        return deliverStatusName;
    }

    /**
     * set 交付状态名称
     *
     * @param deliverStatusName
     */
    public void setDeliverStatusName(String deliverStatusName) {
        this.deliverStatusName = deliverStatusName;
    }

    /**
     * get 服务生效时间，格式：yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public String getEffectiveDt() {
        return effectiveDt;
    }

    /**
     * set 服务生效时间，格式：yyyy-MM-dd HH:mm:ss
     *
     * @param effectiveDt
     */
    public void setEffectiveDt(String effectiveDt) {
        this.effectiveDt = effectiveDt;
    }

    /**
     * get 服务过期时间，格式：yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public String getFailureDt() {
        return failureDt;
    }

    /**
     * set 服务过期时间，格式：yyyy-MM-dd HH:mm:ss
     *
     * @param failureDt
     */
    public void setFailureDt(String failureDt) {
        this.failureDt = failureDt;
    }

    /**
     * get 商品属性
     *
     * @return
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * set 商品属性
     *
     * @param extraInfo
     */
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    /**
     * get 交付单备注
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 交付单备注
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * get 订单金额
     *
     * @return
     */
    public String getOrderTotalFee() {
        return orderTotalFee;
    }

    /**
     * set 订单金额
     *
     * @param orderTotalFee
     */
    public void setOrderTotalFee(String orderTotalFee) {
        this.orderTotalFee = orderTotalFee;
    }

    /**
     * get 订单实付金额
     *
     * @return
     */
    public String getOrderActualFee() {
        return orderActualFee;
    }

    /**
     * set 订单实付金额
     *
     * @param orderActualFee
     */
    public void setOrderActualFee(String orderActualFee) {
        this.orderActualFee = orderActualFee;
    }

    /**
     * get 订单支付时间
     *
     * @return
     */
    public String getPaymentDt() {
        return paymentDt;
    }

    /**
     * set 订单支付时间
     *
     * @param paymentDt
     */
    public void setPaymentDt(String paymentDt) {
        this.paymentDt = paymentDt;
    }

    /**
     * get 额外计费项信息
     *
     * @return
     */
    public String getExtraChargeInfo() {
        return extraChargeInfo;
    }

    /**
     * set 额外计费项信息
     *
     * @param extraChargeInfo
     */
    public void setExtraChargeInfo(String extraChargeInfo) {
        this.extraChargeInfo = extraChargeInfo;
    }

    /**
     * get 额外计费详情信息
     *
     * @return
     */
    public List<OrderItemExtraChargeInfo> getOrderItemExtraChargeInfos() {
        return orderItemExtraChargeInfos;
    }

    /**
     * set 额外计费详情信息
     *
     * @param orderItemExtraChargeInfos
     */
    public void setOrderItemExtraChargeInfos(List<OrderItemExtraChargeInfo> orderItemExtraChargeInfos) {
        this.orderItemExtraChargeInfos = orderItemExtraChargeInfos;
    }


    /**
     * set 交付单号
     *
     * @param deliverNumber
     */
    public ProductServiceVo deliverNumber(String deliverNumber) {
        this.deliverNumber = deliverNumber;
        return this;
    }

    /**
     * set 订单号
     *
     * @param orderNumber
     */
    public ProductServiceVo orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * set 续费订单所关联的新购订单号，该字段只针对续费单有效，新购单该字段为null
     *
     * @param refOrderNumber
     */
    public ProductServiceVo refOrderNumber(String refOrderNumber) {
        this.refOrderNumber = refOrderNumber;
        return this;
    }

    /**
     * set 订单类型
     *
     * @param orderType
     */
    public ProductServiceVo orderType(Integer orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * set 订单类型名称
     *
     * @param orderTypeName
     */
    public ProductServiceVo orderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName;
        return this;
    }

    /**
     * set 购买人
     *
     * @param buyerPin
     */
    public ProductServiceVo buyerPin(String buyerPin) {
        this.buyerPin = buyerPin;
        return this;
    }

    /**
     * set 映射编号
     *
     * @param mappingCode
     */
    public ProductServiceVo mappingCode(String mappingCode) {
        this.mappingCode = mappingCode;
        return this;
    }

    /**
     * set 是否支持自动交付：0表示不支持，1表示支持
     *
     * @param supportAutoDeliver
     */
    public ProductServiceVo supportAutoDeliver(Integer supportAutoDeliver) {
        this.supportAutoDeliver = supportAutoDeliver;
        return this;
    }

    /**
     * set 产品ID
     *
     * @param productId
     */
    public ProductServiceVo productId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /**
     * set sku ID
     *
     * @param skuId
     */
    public ProductServiceVo skuId(Integer skuId) {
        this.skuId = skuId;
        return this;
    }

    /**
     * set sku名称
     *
     * @param skuName
     */
    public ProductServiceVo skuName(String skuName) {
        this.skuName = skuName;
        return this;
    }

    /**
     * set 服务code
     *
     * @param serviceCode
     */
    public ProductServiceVo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 数量
     *
     * @param num
     */
    public ProductServiceVo num(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * set 周期
     *
     * @param period
     */
    public ProductServiceVo period(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * set 周期类型
     *
     * @param periodType
     */
    public ProductServiceVo periodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * set 周期类型名称
     *
     * @param periodTypeName
     */
    public ProductServiceVo periodTypeName(String periodTypeName) {
        this.periodTypeName = periodTypeName;
        return this;
    }

    /**
     * set 账号数量
     *
     * @param accountNum
     */
    public ProductServiceVo accountNum(Integer accountNum) {
        this.accountNum = accountNum;
        return this;
    }

    /**
     * set 交付状态
     *
     * @param deliverStatus
     */
    public ProductServiceVo deliverStatus(Integer deliverStatus) {
        this.deliverStatus = deliverStatus;
        return this;
    }

    /**
     * set 交付状态名称
     *
     * @param deliverStatusName
     */
    public ProductServiceVo deliverStatusName(String deliverStatusName) {
        this.deliverStatusName = deliverStatusName;
        return this;
    }

    /**
     * set 服务生效时间，格式：yyyy-MM-dd HH:mm:ss
     *
     * @param effectiveDt
     */
    public ProductServiceVo effectiveDt(String effectiveDt) {
        this.effectiveDt = effectiveDt;
        return this;
    }

    /**
     * set 服务过期时间，格式：yyyy-MM-dd HH:mm:ss
     *
     * @param failureDt
     */
    public ProductServiceVo failureDt(String failureDt) {
        this.failureDt = failureDt;
        return this;
    }

    /**
     * set 商品属性
     *
     * @param extraInfo
     */
    public ProductServiceVo extraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    /**
     * set 交付单备注
     *
     * @param remark
     */
    public ProductServiceVo remark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * set 订单金额
     *
     * @param orderTotalFee
     */
    public ProductServiceVo orderTotalFee(String orderTotalFee) {
        this.orderTotalFee = orderTotalFee;
        return this;
    }

    /**
     * set 订单实付金额
     *
     * @param orderActualFee
     */
    public ProductServiceVo orderActualFee(String orderActualFee) {
        this.orderActualFee = orderActualFee;
        return this;
    }

    /**
     * set 订单支付时间
     *
     * @param paymentDt
     */
    public ProductServiceVo paymentDt(String paymentDt) {
        this.paymentDt = paymentDt;
        return this;
    }

    /**
     * set 额外计费项信息
     *
     * @param extraChargeInfo
     */
    public ProductServiceVo extraChargeInfo(String extraChargeInfo) {
        this.extraChargeInfo = extraChargeInfo;
        return this;
    }

    /**
     * set 额外计费详情信息
     *
     * @param orderItemExtraChargeInfos
     */
    public ProductServiceVo orderItemExtraChargeInfos(List<OrderItemExtraChargeInfo> orderItemExtraChargeInfos) {
        this.orderItemExtraChargeInfos = orderItemExtraChargeInfos;
        return this;
    }


    /**
     * add item to 额外计费详情信息
     *
     * @param orderItemExtraChargeInfo
     */
    public void addOrderItemExtraChargeInfo(OrderItemExtraChargeInfo orderItemExtraChargeInfo) {
        if (this.orderItemExtraChargeInfos == null) {
            this.orderItemExtraChargeInfos = new ArrayList<>();
        }
        this.orderItemExtraChargeInfos.add(orderItemExtraChargeInfo);
    }

}