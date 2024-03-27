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
 * 实名认证-服务管理接口
 * 实名认证-服务管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudauth.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 一键登录
 */
public class OneClickResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 1收费，0不收费
     */
    private String chargeFlag;

    /**
     * 手机号（AES加密，用对应appkey解密）
     */
    private String msisdn;

    /**
     * 认证结果状态码
     */
    private String code;

    /**
     * 认证结果
     */
    private String message;



    /**
     * get 1收费，0不收费
     *
     * @return
     */
    public String getChargeFlag() {
        return chargeFlag;
    }

    /**
     * set 1收费，0不收费
     *
     * @param chargeFlag
     */
    public void setChargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag;
    }


    /**
     * get 手机号（AES加密，用对应appkey解密）
     *
     * @return
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * set 手机号（AES加密，用对应appkey解密）
     *
     * @param msisdn
     */
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * get 认证结果状态码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 认证结果状态码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * get 认证结果
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 认证结果
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }



    /**
     * set 1收费，0不收费
     *
     * @param chargeFlag
     */
    public OneClickResult chargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag;
        return this;
    }


    /**
     * set 手机号（AES加密，用对应appkey解密）
     *
     * @param msisdn
     */
    public OneClickResult msisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }


    /**
     * set 认证结果状态码
     *
     * @param code
     */
    public OneClickResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 认证结果
     *
     * @param message
     */
    public OneClickResult message(String message) {
        this.message = message;
        return this;
    }


}