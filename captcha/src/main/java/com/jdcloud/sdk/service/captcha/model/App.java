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

package com.jdcloud.sdk.service.captcha.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * app
 */
public class App  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用id
     */
    private Long appId;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;

    /**
     * 应用类型，可选值 app, pc, wxapp, m
     * Required:true
     */
    @Required
    private String appType;

    /**
     * 应用系统，支持多选多选以逗号分隔, 选择appType是app时可选android,ios 其余为空
     * Required:true
     */
    @Required
    private String appOs;

    /**
     * android应用的package name（应用是android的时候androidPkgName必须）
     */
    private String androidPkgName;

    /**
     * ios应用的bundle id（应用是ios的时候iosBundleId必须）
     */
    private String iosBundleId;

    /**
     * 应用描述
     */
    private String description;

    /**
     * app下关联场景数
     */
    private Integer sceneCount;

    /**
     * 应用创建时间
     */
    private String createTime;

    /**
     * 应用更新时间
     */
    private String updateTime;


    /**
     * get 应用id
     *
     * @return
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * set 应用id
     *
     * @param appId
     */
    public void setAppId(Long appId) {
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
     * get 应用类型，可选值 app, pc, wxapp, m
     *
     * @return
     */
    public String getAppType() {
        return appType;
    }

    /**
     * set 应用类型，可选值 app, pc, wxapp, m
     *
     * @param appType
     */
    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * get 应用系统，支持多选多选以逗号分隔, 选择appType是app时可选android,ios 其余为空
     *
     * @return
     */
    public String getAppOs() {
        return appOs;
    }

    /**
     * set 应用系统，支持多选多选以逗号分隔, 选择appType是app时可选android,ios 其余为空
     *
     * @param appOs
     */
    public void setAppOs(String appOs) {
        this.appOs = appOs;
    }

    /**
     * get android应用的package name（应用是android的时候androidPkgName必须）
     *
     * @return
     */
    public String getAndroidPkgName() {
        return androidPkgName;
    }

    /**
     * set android应用的package name（应用是android的时候androidPkgName必须）
     *
     * @param androidPkgName
     */
    public void setAndroidPkgName(String androidPkgName) {
        this.androidPkgName = androidPkgName;
    }

    /**
     * get ios应用的bundle id（应用是ios的时候iosBundleId必须）
     *
     * @return
     */
    public String getIosBundleId() {
        return iosBundleId;
    }

    /**
     * set ios应用的bundle id（应用是ios的时候iosBundleId必须）
     *
     * @param iosBundleId
     */
    public void setIosBundleId(String iosBundleId) {
        this.iosBundleId = iosBundleId;
    }

    /**
     * get 应用描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 应用描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get app下关联场景数
     *
     * @return
     */
    public Integer getSceneCount() {
        return sceneCount;
    }

    /**
     * set app下关联场景数
     *
     * @param sceneCount
     */
    public void setSceneCount(Integer sceneCount) {
        this.sceneCount = sceneCount;
    }

    /**
     * get 应用创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 应用创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 应用更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 应用更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 应用id
     *
     * @param appId
     */
    public App appId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public App appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 应用类型，可选值 app, pc, wxapp, m
     *
     * @param appType
     */
    public App appType(String appType) {
        this.appType = appType;
        return this;
    }

    /**
     * set 应用系统，支持多选多选以逗号分隔, 选择appType是app时可选android,ios 其余为空
     *
     * @param appOs
     */
    public App appOs(String appOs) {
        this.appOs = appOs;
        return this;
    }

    /**
     * set android应用的package name（应用是android的时候androidPkgName必须）
     *
     * @param androidPkgName
     */
    public App androidPkgName(String androidPkgName) {
        this.androidPkgName = androidPkgName;
        return this;
    }

    /**
     * set ios应用的bundle id（应用是ios的时候iosBundleId必须）
     *
     * @param iosBundleId
     */
    public App iosBundleId(String iosBundleId) {
        this.iosBundleId = iosBundleId;
        return this;
    }

    /**
     * set 应用描述
     *
     * @param description
     */
    public App description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set app下关联场景数
     *
     * @param sceneCount
     */
    public App sceneCount(Integer sceneCount) {
        this.sceneCount = sceneCount;
        return this;
    }

    /**
     * set 应用创建时间
     *
     * @param createTime
     */
    public App createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 应用更新时间
     *
     * @param updateTime
     */
    public App updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}