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
 * MFA Management
 * MFA Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 绑定虚拟MFA设备
 */
public class BindMFADeviceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 被绑定的账号（目前支持：默认不填的情况表示给自己绑定，填写子用户名表示主账号给子用户绑定)
     */
    private String boundAccount;

    /**
     * 第一组动态密码（连续的两组）
     * Required:true
     */
    @Required
    private String authenticationCode1;

    /**
     * 第二组动态密码（连续的两组）
     * Required:true
     */
    @Required
    private String authenticationCode2;



    /**
     * get 被绑定的账号（目前支持：默认不填的情况表示给自己绑定，填写子用户名表示主账号给子用户绑定)
     *
     * @return
     */
    public String getBoundAccount() {
        return boundAccount;
    }

    /**
     * set 被绑定的账号（目前支持：默认不填的情况表示给自己绑定，填写子用户名表示主账号给子用户绑定)
     *
     * @param boundAccount
     */
    public void setBoundAccount(String boundAccount) {
        this.boundAccount = boundAccount;
    }


    /**
     * get 第一组动态密码（连续的两组）
     *
     * @return
     */
    public String getAuthenticationCode1() {
        return authenticationCode1;
    }

    /**
     * set 第一组动态密码（连续的两组）
     *
     * @param authenticationCode1
     */
    public void setAuthenticationCode1(String authenticationCode1) {
        this.authenticationCode1 = authenticationCode1;
    }


    /**
     * get 第二组动态密码（连续的两组）
     *
     * @return
     */
    public String getAuthenticationCode2() {
        return authenticationCode2;
    }

    /**
     * set 第二组动态密码（连续的两组）
     *
     * @param authenticationCode2
     */
    public void setAuthenticationCode2(String authenticationCode2) {
        this.authenticationCode2 = authenticationCode2;
    }



    /**
     * set 被绑定的账号（目前支持：默认不填的情况表示给自己绑定，填写子用户名表示主账号给子用户绑定)
     *
     * @param boundAccount
     */
    public BindMFADeviceRequest boundAccount(String boundAccount) {
        this.boundAccount = boundAccount;
        return this;
    }


    /**
     * set 第一组动态密码（连续的两组）
     *
     * @param authenticationCode1
     */
    public BindMFADeviceRequest authenticationCode1(String authenticationCode1) {
        this.authenticationCode1 = authenticationCode1;
        return this;
    }


    /**
     * set 第二组动态密码（连续的两组）
     *
     * @param authenticationCode2
     */
    public BindMFADeviceRequest authenticationCode2(String authenticationCode2) {
        this.authenticationCode2 = authenticationCode2;
        return this;
    }


}