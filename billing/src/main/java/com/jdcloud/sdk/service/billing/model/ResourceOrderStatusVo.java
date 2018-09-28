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

import com.jdcloud.sdk.annotation.Required;

/**
 * resourceOrderStatusVo
 */
public class ResourceOrderStatusVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源id
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * 用户pin
     * Required:true
     */
    @Required
    private String pin;

    /**
     * 资源状态 1:正常 2:停服 3:删除
     */
    private Integer status;

    /**
     * 计费状态 0:停止计费 1:计费中
     */
    private Integer billingStatus;

    /**
     * 计费类型 1:按配置 2:按用量 3:包年包月
     */
    private Integer billingType;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * billingType兼容交易系统字段
     */
    private Integer chargeMode;

    /**
     * timeSpan兼容交易系统字段
     */
    private Integer chargeDuration;

    /**
     * timeUnit兼容交易系统字段
     */
    private Integer chargeUnit;

    /**
     * 站点信息 0:中国 1:国际  10:专有云
     */
    private Integer site;

    /**
     * 操作时间
     */
    private String operateTime;


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
     * get 资源状态 1:正常 2:停服 3:删除
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 资源状态 1:正常 2:停服 3:删除
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 计费状态 0:停止计费 1:计费中
     *
     * @return
     */
    public Integer getBillingStatus() {
        return billingStatus;
    }

    /**
     * set 计费状态 0:停止计费 1:计费中
     *
     * @param billingStatus
     */
    public void setBillingStatus(Integer billingStatus) {
        this.billingStatus = billingStatus;
    }

    /**
     * get 计费类型 1:按配置 2:按用量 3:包年包月
     *
     * @return
     */
    public Integer getBillingType() {
        return billingType;
    }

    /**
     * set 计费类型 1:按配置 2:按用量 3:包年包月
     *
     * @param billingType
     */
    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }

    /**
     * get 结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get billingType兼容交易系统字段
     *
     * @return
     */
    public Integer getChargeMode() {
        return chargeMode;
    }

    /**
     * set billingType兼容交易系统字段
     *
     * @param chargeMode
     */
    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    /**
     * get timeSpan兼容交易系统字段
     *
     * @return
     */
    public Integer getChargeDuration() {
        return chargeDuration;
    }

    /**
     * set timeSpan兼容交易系统字段
     *
     * @param chargeDuration
     */
    public void setChargeDuration(Integer chargeDuration) {
        this.chargeDuration = chargeDuration;
    }

    /**
     * get timeUnit兼容交易系统字段
     *
     * @return
     */
    public Integer getChargeUnit() {
        return chargeUnit;
    }

    /**
     * set timeUnit兼容交易系统字段
     *
     * @param chargeUnit
     */
    public void setChargeUnit(Integer chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    /**
     * get 站点信息 0:中国 1:国际  10:专有云
     *
     * @return
     */
    public Integer getSite() {
        return site;
    }

    /**
     * set 站点信息 0:中国 1:国际  10:专有云
     *
     * @param site
     */
    public void setSite(Integer site) {
        this.site = site;
    }

    /**
     * get 操作时间
     *
     * @return
     */
    public String getOperateTime() {
        return operateTime;
    }

    /**
     * set 操作时间
     *
     * @param operateTime
     */
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }


    /**
     * set 资源id
     *
     * @param resourceId
     */
    public ResourceOrderStatusVo resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public ResourceOrderStatusVo pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 资源状态 1:正常 2:停服 3:删除
     *
     * @param status
     */
    public ResourceOrderStatusVo status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 计费状态 0:停止计费 1:计费中
     *
     * @param billingStatus
     */
    public ResourceOrderStatusVo billingStatus(Integer billingStatus) {
        this.billingStatus = billingStatus;
        return this;
    }

    /**
     * set 计费类型 1:按配置 2:按用量 3:包年包月
     *
     * @param billingType
     */
    public ResourceOrderStatusVo billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public ResourceOrderStatusVo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set billingType兼容交易系统字段
     *
     * @param chargeMode
     */
    public ResourceOrderStatusVo chargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * set timeSpan兼容交易系统字段
     *
     * @param chargeDuration
     */
    public ResourceOrderStatusVo chargeDuration(Integer chargeDuration) {
        this.chargeDuration = chargeDuration;
        return this;
    }

    /**
     * set timeUnit兼容交易系统字段
     *
     * @param chargeUnit
     */
    public ResourceOrderStatusVo chargeUnit(Integer chargeUnit) {
        this.chargeUnit = chargeUnit;
        return this;
    }

    /**
     * set 站点信息 0:中国 1:国际  10:专有云
     *
     * @param site
     */
    public ResourceOrderStatusVo site(Integer site) {
        this.site = site;
        return this;
    }

    /**
     * set 操作时间
     *
     * @param operateTime
     */
    public ResourceOrderStatusVo operateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }


}