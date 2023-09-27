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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 企业基础信息核验
 */
public class CheckCompanyInfoResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 认证结果true 成功, false 失败
     */
    private Boolean success;

    /**
     * 是否有异常 true 有异常, false 无异常
     */
    private Boolean hasException;

    /**
     * 认证结果状态码
     * Required:true
     */
    @Required
    private String code;

    /**
     * 1. 认证结果信息
2. 查询结果信息
3. 状态码信息

     * Required:true
     */
    @Required
    private String message;

    /**
     * 1. 认证结果信息
2. 查询结果信息

     * Required:true
     */
    @Required
    private String detail;



    /**
     * get 认证结果true 成功, false 失败
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set 认证结果true 成功, false 失败
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }


    /**
     * get 是否有异常 true 有异常, false 无异常
     *
     * @return
     */
    public Boolean getHasException() {
        return hasException;
    }

    /**
     * set 是否有异常 true 有异常, false 无异常
     *
     * @param hasException
     */
    public void setHasException(Boolean hasException) {
        this.hasException = hasException;
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
     * get 1. 认证结果信息
2. 查询结果信息
3. 状态码信息

     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 1. 认证结果信息
2. 查询结果信息
3. 状态码信息

     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * get 1. 认证结果信息
2. 查询结果信息

     *
     * @return
     */
    public String getDetail() {
        return detail;
    }

    /**
     * set 1. 认证结果信息
2. 查询结果信息

     *
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }



    /**
     * set 认证结果true 成功, false 失败
     *
     * @param success
     */
    public CheckCompanyInfoResult success(Boolean success) {
        this.success = success;
        return this;
    }


    /**
     * set 是否有异常 true 有异常, false 无异常
     *
     * @param hasException
     */
    public CheckCompanyInfoResult hasException(Boolean hasException) {
        this.hasException = hasException;
        return this;
    }


    /**
     * set 认证结果状态码
     *
     * @param code
     */
    public CheckCompanyInfoResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 1. 认证结果信息
2. 查询结果信息
3. 状态码信息

     *
     * @param message
     */
    public CheckCompanyInfoResult message(String message) {
        this.message = message;
        return this;
    }


    /**
     * set 1. 认证结果信息
2. 查询结果信息

     *
     * @param detail
     */
    public CheckCompanyInfoResult detail(String detail) {
        this.detail = detail;
        return this;
    }


}