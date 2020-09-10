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

package com.jdcloud.sdk.service.ydsms.model;


/**
 * smsAppVO
 */
public class SmsAppVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * accessKeyId
     */
    private String accessKeyId;

    /**
     * 应用描述
     */
    private String appDesc;

    /**
     * 应用id
     */
    private String appId;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 应用状态，0 停用 1 启用
     */
    private Integer status;

    /**
     * updateTime
     */
    private String updateTime;


    /**
     * get accessKeyId
     *
     * @return
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * set accessKeyId
     *
     * @param accessKeyId
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * get 应用描述
     *
     * @return
     */
    public String getAppDesc() {
        return appDesc;
    }

    /**
     * set 应用描述
     *
     * @param appDesc
     */
    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
    }

    /**
     * get 应用id
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set 应用id
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 应用状态，0 停用 1 启用
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 应用状态，0 停用 1 启用
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set accessKeyId
     *
     * @param accessKeyId
     */
    public SmsAppVO accessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * set 应用描述
     *
     * @param appDesc
     */
    public SmsAppVO appDesc(String appDesc) {
        this.appDesc = appDesc;
        return this;
    }

    /**
     * set 应用id
     *
     * @param appId
     */
    public SmsAppVO appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public SmsAppVO appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public SmsAppVO createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 应用状态，0 停用 1 启用
     *
     * @param status
     */
    public SmsAppVO status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public SmsAppVO updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}