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
 * resourceBo
 */
public class ResourceBo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * 应用码code
     */
    private String appCode;

    /**
     * 应用码名称
     */
    private String appCodeName;

    /**
     * 服务码code
     */
    private String serviceCode;

    /**
     * 服务码名称
     */
    private String serviceCodeName;

    /**
     * 资源所属地域
     */
    private String region;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 资源配置
     */
    private String formula;

    /**
     * 计费类型 1、按配置，2、按用量，3、包年包月，4、按次
     */
    private Integer billingType;

    /**
     * 资源状态：1、正常，2、停服
     */
    private Integer status;

    /**
     * 计费开始时间
     */
    private String startTime;

    /**
     * 计费结束时间
     */
    private String endTime;


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
     * get 应用码code
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 应用码code
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get 应用码名称
     *
     * @return
     */
    public String getAppCodeName() {
        return appCodeName;
    }

    /**
     * set 应用码名称
     *
     * @param appCodeName
     */
    public void setAppCodeName(String appCodeName) {
        this.appCodeName = appCodeName;
    }

    /**
     * get 服务码code
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 服务码code
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 服务码名称
     *
     * @return
     */
    public String getServiceCodeName() {
        return serviceCodeName;
    }

    /**
     * set 服务码名称
     *
     * @param serviceCodeName
     */
    public void setServiceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
    }

    /**
     * get 资源所属地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 资源所属地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

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
     * get 资源配置
     *
     * @return
     */
    public String getFormula() {
        return formula;
    }

    /**
     * set 资源配置
     *
     * @param formula
     */
    public void setFormula(String formula) {
        this.formula = formula;
    }

    /**
     * get 计费类型 1、按配置，2、按用量，3、包年包月，4、按次
     *
     * @return
     */
    public Integer getBillingType() {
        return billingType;
    }

    /**
     * set 计费类型 1、按配置，2、按用量，3、包年包月，4、按次
     *
     * @param billingType
     */
    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }

    /**
     * get 资源状态：1、正常，2、停服
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 资源状态：1、正常，2、停服
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 计费开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 计费开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 计费结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 计费结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public ResourceBo pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 应用码code
     *
     * @param appCode
     */
    public ResourceBo appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set 应用码名称
     *
     * @param appCodeName
     */
    public ResourceBo appCodeName(String appCodeName) {
        this.appCodeName = appCodeName;
        return this;
    }

    /**
     * set 服务码code
     *
     * @param serviceCode
     */
    public ResourceBo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 服务码名称
     *
     * @param serviceCodeName
     */
    public ResourceBo serviceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
        return this;
    }

    /**
     * set 资源所属地域
     *
     * @param region
     */
    public ResourceBo region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public ResourceBo resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 资源配置
     *
     * @param formula
     */
    public ResourceBo formula(String formula) {
        this.formula = formula;
        return this;
    }

    /**
     * set 计费类型 1、按配置，2、按用量，3、包年包月，4、按次
     *
     * @param billingType
     */
    public ResourceBo billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }

    /**
     * set 资源状态：1、正常，2、停服
     *
     * @param status
     */
    public ResourceBo status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 计费开始时间
     *
     * @param startTime
     */
    public ResourceBo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 计费结束时间
     *
     * @param endTime
     */
    public ResourceBo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


}