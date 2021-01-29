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
 * JDCLOUD quota API
 * API JDCLOUD quota API
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.quota.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 校验配额
 */
public class VerifyUserQuotaRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 站点类型
     */
    private Integer siteType;

    /**
     * 业务线
     */
    private String appCode;

    /**
     * 资源产品线
     */
    private String serviceCode;

    /**
     * 地域
     */
    private String region;

    /**
     * 父层资源id（针对有两层结构的服务）
     */
    private String parentResourceId;

    /**
     * 业务唯一键
     */
    private String uid;

    /**
     * 配额数量
     */
    private Integer quotaAmount;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


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
     * get 站点类型
     *
     * @return
     */
    public Integer getSiteType() {
        return siteType;
    }

    /**
     * set 站点类型
     *
     * @param siteType
     */
    public void setSiteType(Integer siteType) {
        this.siteType = siteType;
    }

    /**
     * get 业务线
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 业务线
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get 资源产品线
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 资源产品线
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 父层资源id（针对有两层结构的服务）
     *
     * @return
     */
    public String getParentResourceId() {
        return parentResourceId;
    }

    /**
     * set 父层资源id（针对有两层结构的服务）
     *
     * @param parentResourceId
     */
    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    /**
     * get 业务唯一键
     *
     * @return
     */
    public String getUid() {
        return uid;
    }

    /**
     * set 业务唯一键
     *
     * @param uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * get 配额数量
     *
     * @return
     */
    public Integer getQuotaAmount() {
        return quotaAmount;
    }

    /**
     * set 配额数量
     *
     * @param quotaAmount
     */
    public void setQuotaAmount(Integer quotaAmount) {
        this.quotaAmount = quotaAmount;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 用户pin
     *
     * @param pin
     */
    public VerifyUserQuotaRequest pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 站点类型
     *
     * @param siteType
     */
    public VerifyUserQuotaRequest siteType(Integer siteType) {
        this.siteType = siteType;
        return this;
    }

    /**
     * set 业务线
     *
     * @param appCode
     */
    public VerifyUserQuotaRequest appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set 资源产品线
     *
     * @param serviceCode
     */
    public VerifyUserQuotaRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public VerifyUserQuotaRequest region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 父层资源id（针对有两层结构的服务）
     *
     * @param parentResourceId
     */
    public VerifyUserQuotaRequest parentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
        return this;
    }

    /**
     * set 业务唯一键
     *
     * @param uid
     */
    public VerifyUserQuotaRequest uid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * set 配额数量
     *
     * @param quotaAmount
     */
    public VerifyUserQuotaRequest quotaAmount(Integer quotaAmount) {
        this.quotaAmount = quotaAmount;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public VerifyUserQuotaRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}