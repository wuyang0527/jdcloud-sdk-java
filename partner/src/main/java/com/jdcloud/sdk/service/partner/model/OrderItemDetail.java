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
 * orderItemDetail
 */
public class OrderItemDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 价格快照Json
     */
    private String priceSnapshot;

    /**
     * 变更前资源配置
     */
    
    private List<ExtraInfo> extraInfoBefore;
    /**
     * 变更后资源配置
     */
    
    private List<ExtraInfo> extraInfoAfter;
    /**
     * 商品规格参数
     */
    
    private List<ExtraInfo> extraInfo;
    /**
     * 应付金额（元）
     */
    private Number actualFee;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 续费前资源到期时间
     */
    private String expireDateBefore;

    /**
     * 续费后资源到期时间
     */
    private String expireDateAfter;

    /**
     * 计费时长单位
     */
    private String unit;

    /**
     * 计费时长（购买时长）
     */
    private Integer chargeDuration;

    /**
     * 计费类型
     */
    private String chargeMode;

    /**
     * 订单总额（元）
     */
    private Number totalFee;

    /**
     * 资源类型
     */
    private String serviceName;

    /**
     * 站点类型 0：主站,1：国际站,2：云市场
     */
    private String siteType;

    /**
     * 下单时间
     */
    private String createTime;

    /**
     * 订单商品状态：创建中、成功、失败
     */
    private Integer status;

    /**
     * 资源id
     */
    private String itemId;

    /**
     * 资源名称
     */
    private String itemName;

    /**
     * 计算公式（配置细项）
     */
    private String formula;

    /**
     * 订单编号
     */
    private String orderNumber;

    /**
     * 实际支付总金额
     */
    private Number allActualFee;

    /**
     * 备注
     */
    private String remark;

    /**
     * 现金支付
     */
    private Number moneyPay;

    /**
     * 余额支付
     */
    private Number balancePay;

    /**
     * 已退款金额
     */
    private Number refundFee;

    /**
     * 订单计费类型：按配置、包年包月、按用量actualFee
     */
    private Integer chargeModeInfo;

    /**
     * 退款状态 RefundStatusEnum 0,申请退款 1,退款审核中 2,已退款 3,已取消 4,退款失败 5,财务审批驳回 6,财务审批通过
     */
    private Integer deleteStatus;

    /**
     * 代金券金额
     */
    private Number favorableFee;

    /**
     * 变配明细
     */
    private Integer resizeFormulaType;



    /**
     * get 价格快照Json
     *
     * @return
     */
    public String getPriceSnapshot() {
        return priceSnapshot;
    }

    /**
     * set 价格快照Json
     *
     * @param priceSnapshot
     */
    public void setPriceSnapshot(String priceSnapshot) {
        this.priceSnapshot = priceSnapshot;
    }


    /**
    * get 变更前资源配置
    *
    * @return
    */
    public List<ExtraInfo> getExtraInfoBefore() {
        return extraInfoBefore;
    }

    /**
    * set 变更前资源配置
    *
    * @param extraInfoBefore
    */
    public void setExtraInfoBefore(List<ExtraInfo> extraInfoBefore) {
        this.extraInfoBefore = extraInfoBefore;
    }


    /**
    * get 变更后资源配置
    *
    * @return
    */
    public List<ExtraInfo> getExtraInfoAfter() {
        return extraInfoAfter;
    }

    /**
    * set 变更后资源配置
    *
    * @param extraInfoAfter
    */
    public void setExtraInfoAfter(List<ExtraInfo> extraInfoAfter) {
        this.extraInfoAfter = extraInfoAfter;
    }


    /**
    * get 商品规格参数
    *
    * @return
    */
    public List<ExtraInfo> getExtraInfo() {
        return extraInfo;
    }

    /**
    * set 商品规格参数
    *
    * @param extraInfo
    */
    public void setExtraInfo(List<ExtraInfo> extraInfo) {
        this.extraInfo = extraInfo;
    }


    /**
     * get 应付金额（元）
     *
     * @return
     */
    public Number getActualFee() {
        return actualFee;
    }

    /**
     * set 应付金额（元）
     *
     * @param actualFee
     */
    public void setActualFee(Number actualFee) {
        this.actualFee = actualFee;
    }


    /**
     * get 数量
     *
     * @return
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * set 数量
     *
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    /**
     * get 续费前资源到期时间
     *
     * @return
     */
    public String getExpireDateBefore() {
        return expireDateBefore;
    }

    /**
     * set 续费前资源到期时间
     *
     * @param expireDateBefore
     */
    public void setExpireDateBefore(String expireDateBefore) {
        this.expireDateBefore = expireDateBefore;
    }


    /**
     * get 续费后资源到期时间
     *
     * @return
     */
    public String getExpireDateAfter() {
        return expireDateAfter;
    }

    /**
     * set 续费后资源到期时间
     *
     * @param expireDateAfter
     */
    public void setExpireDateAfter(String expireDateAfter) {
        this.expireDateAfter = expireDateAfter;
    }


    /**
     * get 计费时长单位
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 计费时长单位
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }


    /**
     * get 计费时长（购买时长）
     *
     * @return
     */
    public Integer getChargeDuration() {
        return chargeDuration;
    }

    /**
     * set 计费时长（购买时长）
     *
     * @param chargeDuration
     */
    public void setChargeDuration(Integer chargeDuration) {
        this.chargeDuration = chargeDuration;
    }


    /**
     * get 计费类型
     *
     * @return
     */
    public String getChargeMode() {
        return chargeMode;
    }

    /**
     * set 计费类型
     *
     * @param chargeMode
     */
    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }


    /**
     * get 订单总额（元）
     *
     * @return
     */
    public Number getTotalFee() {
        return totalFee;
    }

    /**
     * set 订单总额（元）
     *
     * @param totalFee
     */
    public void setTotalFee(Number totalFee) {
        this.totalFee = totalFee;
    }


    /**
     * get 资源类型
     *
     * @return
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * set 资源类型
     *
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * get 站点类型 0：主站,1：国际站,2：云市场
     *
     * @return
     */
    public String getSiteType() {
        return siteType;
    }

    /**
     * set 站点类型 0：主站,1：国际站,2：云市场
     *
     * @param siteType
     */
    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }


    /**
     * get 下单时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 下单时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 订单商品状态：创建中、成功、失败
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 订单商品状态：创建中、成功、失败
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * get 资源id
     *
     * @return
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * set 资源id
     *
     * @param itemId
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }


    /**
     * get 资源名称
     *
     * @return
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * set 资源名称
     *
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    /**
     * get 计算公式（配置细项）
     *
     * @return
     */
    public String getFormula() {
        return formula;
    }

    /**
     * set 计算公式（配置细项）
     *
     * @param formula
     */
    public void setFormula(String formula) {
        this.formula = formula;
    }


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
     * get 实际支付总金额
     *
     * @return
     */
    public Number getAllActualFee() {
        return allActualFee;
    }

    /**
     * set 实际支付总金额
     *
     * @param allActualFee
     */
    public void setAllActualFee(Number allActualFee) {
        this.allActualFee = allActualFee;
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
     * get 现金支付
     *
     * @return
     */
    public Number getMoneyPay() {
        return moneyPay;
    }

    /**
     * set 现金支付
     *
     * @param moneyPay
     */
    public void setMoneyPay(Number moneyPay) {
        this.moneyPay = moneyPay;
    }


    /**
     * get 余额支付
     *
     * @return
     */
    public Number getBalancePay() {
        return balancePay;
    }

    /**
     * set 余额支付
     *
     * @param balancePay
     */
    public void setBalancePay(Number balancePay) {
        this.balancePay = balancePay;
    }


    /**
     * get 已退款金额
     *
     * @return
     */
    public Number getRefundFee() {
        return refundFee;
    }

    /**
     * set 已退款金额
     *
     * @param refundFee
     */
    public void setRefundFee(Number refundFee) {
        this.refundFee = refundFee;
    }


    /**
     * get 订单计费类型：按配置、包年包月、按用量actualFee
     *
     * @return
     */
    public Integer getChargeModeInfo() {
        return chargeModeInfo;
    }

    /**
     * set 订单计费类型：按配置、包年包月、按用量actualFee
     *
     * @param chargeModeInfo
     */
    public void setChargeModeInfo(Integer chargeModeInfo) {
        this.chargeModeInfo = chargeModeInfo;
    }


    /**
     * get 退款状态 RefundStatusEnum 0,申请退款 1,退款审核中 2,已退款 3,已取消 4,退款失败 5,财务审批驳回 6,财务审批通过
     *
     * @return
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * set 退款状态 RefundStatusEnum 0,申请退款 1,退款审核中 2,已退款 3,已取消 4,退款失败 5,财务审批驳回 6,财务审批通过
     *
     * @param deleteStatus
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }


    /**
     * get 代金券金额
     *
     * @return
     */
    public Number getFavorableFee() {
        return favorableFee;
    }

    /**
     * set 代金券金额
     *
     * @param favorableFee
     */
    public void setFavorableFee(Number favorableFee) {
        this.favorableFee = favorableFee;
    }


    /**
     * get 变配明细
     *
     * @return
     */
    public Integer getResizeFormulaType() {
        return resizeFormulaType;
    }

    /**
     * set 变配明细
     *
     * @param resizeFormulaType
     */
    public void setResizeFormulaType(Integer resizeFormulaType) {
        this.resizeFormulaType = resizeFormulaType;
    }



    /**
     * set 价格快照Json
     *
     * @param priceSnapshot
     */
    public OrderItemDetail priceSnapshot(String priceSnapshot) {
        this.priceSnapshot = priceSnapshot;
        return this;
    }


    /**
    * set 变更前资源配置
    *
    * @param extraInfoBefore
    */
    public OrderItemDetail extraInfoBefore(List<ExtraInfo> extraInfoBefore) {
        this.extraInfoBefore = extraInfoBefore;
        return this;
    }


    /**
    * set 变更后资源配置
    *
    * @param extraInfoAfter
    */
    public OrderItemDetail extraInfoAfter(List<ExtraInfo> extraInfoAfter) {
        this.extraInfoAfter = extraInfoAfter;
        return this;
    }


    /**
    * set 商品规格参数
    *
    * @param extraInfo
    */
    public OrderItemDetail extraInfo(List<ExtraInfo> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }


    /**
     * set 应付金额（元）
     *
     * @param actualFee
     */
    public OrderItemDetail actualFee(Number actualFee) {
        this.actualFee = actualFee;
        return this;
    }


    /**
     * set 数量
     *
     * @param quantity
     */
    public OrderItemDetail quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }


    /**
     * set 续费前资源到期时间
     *
     * @param expireDateBefore
     */
    public OrderItemDetail expireDateBefore(String expireDateBefore) {
        this.expireDateBefore = expireDateBefore;
        return this;
    }


    /**
     * set 续费后资源到期时间
     *
     * @param expireDateAfter
     */
    public OrderItemDetail expireDateAfter(String expireDateAfter) {
        this.expireDateAfter = expireDateAfter;
        return this;
    }


    /**
     * set 计费时长单位
     *
     * @param unit
     */
    public OrderItemDetail unit(String unit) {
        this.unit = unit;
        return this;
    }


    /**
     * set 计费时长（购买时长）
     *
     * @param chargeDuration
     */
    public OrderItemDetail chargeDuration(Integer chargeDuration) {
        this.chargeDuration = chargeDuration;
        return this;
    }


    /**
     * set 计费类型
     *
     * @param chargeMode
     */
    public OrderItemDetail chargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }


    /**
     * set 订单总额（元）
     *
     * @param totalFee
     */
    public OrderItemDetail totalFee(Number totalFee) {
        this.totalFee = totalFee;
        return this;
    }


    /**
     * set 资源类型
     *
     * @param serviceName
     */
    public OrderItemDetail serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }


    /**
     * set 站点类型 0：主站,1：国际站,2：云市场
     *
     * @param siteType
     */
    public OrderItemDetail siteType(String siteType) {
        this.siteType = siteType;
        return this;
    }


    /**
     * set 下单时间
     *
     * @param createTime
     */
    public OrderItemDetail createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 订单商品状态：创建中、成功、失败
     *
     * @param status
     */
    public OrderItemDetail status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 资源id
     *
     * @param itemId
     */
    public OrderItemDetail itemId(String itemId) {
        this.itemId = itemId;
        return this;
    }


    /**
     * set 资源名称
     *
     * @param itemName
     */
    public OrderItemDetail itemName(String itemName) {
        this.itemName = itemName;
        return this;
    }


    /**
     * set 计算公式（配置细项）
     *
     * @param formula
     */
    public OrderItemDetail formula(String formula) {
        this.formula = formula;
        return this;
    }


    /**
     * set 订单编号
     *
     * @param orderNumber
     */
    public OrderItemDetail orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }


    /**
     * set 实际支付总金额
     *
     * @param allActualFee
     */
    public OrderItemDetail allActualFee(Number allActualFee) {
        this.allActualFee = allActualFee;
        return this;
    }


    /**
     * set 备注
     *
     * @param remark
     */
    public OrderItemDetail remark(String remark) {
        this.remark = remark;
        return this;
    }


    /**
     * set 现金支付
     *
     * @param moneyPay
     */
    public OrderItemDetail moneyPay(Number moneyPay) {
        this.moneyPay = moneyPay;
        return this;
    }


    /**
     * set 余额支付
     *
     * @param balancePay
     */
    public OrderItemDetail balancePay(Number balancePay) {
        this.balancePay = balancePay;
        return this;
    }


    /**
     * set 已退款金额
     *
     * @param refundFee
     */
    public OrderItemDetail refundFee(Number refundFee) {
        this.refundFee = refundFee;
        return this;
    }


    /**
     * set 订单计费类型：按配置、包年包月、按用量actualFee
     *
     * @param chargeModeInfo
     */
    public OrderItemDetail chargeModeInfo(Integer chargeModeInfo) {
        this.chargeModeInfo = chargeModeInfo;
        return this;
    }


    /**
     * set 退款状态 RefundStatusEnum 0,申请退款 1,退款审核中 2,已退款 3,已取消 4,退款失败 5,财务审批驳回 6,财务审批通过
     *
     * @param deleteStatus
     */
    public OrderItemDetail deleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }


    /**
     * set 代金券金额
     *
     * @param favorableFee
     */
    public OrderItemDetail favorableFee(Number favorableFee) {
        this.favorableFee = favorableFee;
        return this;
    }


    /**
     * set 变配明细
     *
     * @param resizeFormulaType
     */
    public OrderItemDetail resizeFormulaType(Integer resizeFormulaType) {
        this.resizeFormulaType = resizeFormulaType;
        return this;
    }



    /**
     * add item to 变更前资源配置
     *
     * @param extraInfoBefore
     */
    public void addExtraInfoBefore(ExtraInfo extraInfoBefore) {
        if (this.extraInfoBefore == null) {
            this.extraInfoBefore = new ArrayList<>();
        }
        this.extraInfoBefore.add(extraInfoBefore);
    }

    /**
     * add item to 变更后资源配置
     *
     * @param extraInfoAfter
     */
    public void addExtraInfoAfter(ExtraInfo extraInfoAfter) {
        if (this.extraInfoAfter == null) {
            this.extraInfoAfter = new ArrayList<>();
        }
        this.extraInfoAfter.add(extraInfoAfter);
    }

    /**
     * add item to 商品规格参数
     *
     * @param extraInfo
     */
    public void addExtraInfo(ExtraInfo extraInfo) {
        if (this.extraInfo == null) {
            this.extraInfo = new ArrayList<>();
        }
        this.extraInfo.add(extraInfo);
    }
}