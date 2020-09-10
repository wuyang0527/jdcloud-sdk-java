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
 * 云鼎短信服务-应用相关接口
 * 云鼎短信服务-应用相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ydsms.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 编辑短信应用
 */
public class ModifySmsAppUsingPOSTRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用描述
     */
    private String appDesc;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * appId
     * Required:true
     */
    @Required
    private String appId;


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
     * get appId
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set appId
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }


    /**
     * set 应用描述
     *
     * @param appDesc
     */
    public ModifySmsAppUsingPOSTRequest appDesc(String appDesc) {
        this.appDesc = appDesc;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public ModifySmsAppUsingPOSTRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set appId
     *
     * @param appId
     */
    public ModifySmsAppUsingPOSTRequest appId(String appId) {
        this.appId = appId;
        return this;
    }


}