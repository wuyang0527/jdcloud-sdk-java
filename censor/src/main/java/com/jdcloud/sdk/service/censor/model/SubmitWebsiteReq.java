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

package com.jdcloud.sdk.service.censor.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * submitWebsiteReq
 */
public class SubmitWebsiteReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例名称
     * Required:true
     */
    @Required
    private String nickName;

    /**
     * 单位时间,&quot;MONTH&quot;/&quot;YEAR&quot;
     * Required:true
     */
    @Required
    private String chargeUnit;

    /**
     * 时长，1-6
     * Required:true
     */
    @Required
    private Integer chargeDuration;

    /**
     * 购买返回页面
     */
    private String returnUrl;


    /**
     * get 实例名称
     *
     * @return
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * set 实例名称
     *
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * get 单位时间,&quot;MONTH&quot;/&quot;YEAR&quot;
     *
     * @return
     */
    public String getChargeUnit() {
        return chargeUnit;
    }

    /**
     * set 单位时间,&quot;MONTH&quot;/&quot;YEAR&quot;
     *
     * @param chargeUnit
     */
    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    /**
     * get 时长，1-6
     *
     * @return
     */
    public Integer getChargeDuration() {
        return chargeDuration;
    }

    /**
     * set 时长，1-6
     *
     * @param chargeDuration
     */
    public void setChargeDuration(Integer chargeDuration) {
        this.chargeDuration = chargeDuration;
    }

    /**
     * get 购买返回页面
     *
     * @return
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * set 购买返回页面
     *
     * @param returnUrl
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }


    /**
     * set 实例名称
     *
     * @param nickName
     */
    public SubmitWebsiteReq nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * set 单位时间,&quot;MONTH&quot;/&quot;YEAR&quot;
     *
     * @param chargeUnit
     */
    public SubmitWebsiteReq chargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
        return this;
    }

    /**
     * set 时长，1-6
     *
     * @param chargeDuration
     */
    public SubmitWebsiteReq chargeDuration(Integer chargeDuration) {
        this.chargeDuration = chargeDuration;
        return this;
    }

    /**
     * set 购买返回页面
     *
     * @param returnUrl
     */
    public SubmitWebsiteReq returnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }


}