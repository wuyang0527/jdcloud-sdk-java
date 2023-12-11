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

package com.jdcloud.sdk.service.iam.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * sendBatchMsg
 */
public class SendBatchMsg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模版code
     * Required:true
     */
    @Required
    private Integer templateId;

    /**
     * 模版参数
     * Required:true
     */
    @Required
    
    private List<String> templateParam;
    /**
     * 业务编码(和产品申请)
     * Required:true
     */
    @Required
    private String smsMessageSource;

    /**
     * 用户pin
     * Required:true
     */
    @Required
    private String pin;

    /**
     * 手机号
     * Required:true
     */
    @Required
    
    private List<String> mobileNumSet;


    /**
     * get 模版code
     *
     * @return
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * set 模版code
     *
     * @param templateId
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }


    /**
    * get 模版参数
    *
    * @return
    */
    public List<String> getTemplateParam() {
        return templateParam;
    }

    /**
    * set 模版参数
    *
    * @param templateParam
    */
    public void setTemplateParam(List<String> templateParam) {
        this.templateParam = templateParam;
    }


    /**
     * get 业务编码(和产品申请)
     *
     * @return
     */
    public String getSmsMessageSource() {
        return smsMessageSource;
    }

    /**
     * set 业务编码(和产品申请)
     *
     * @param smsMessageSource
     */
    public void setSmsMessageSource(String smsMessageSource) {
        this.smsMessageSource = smsMessageSource;
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
    * get 手机号
    *
    * @return
    */
    public List<String> getMobileNumSet() {
        return mobileNumSet;
    }

    /**
    * set 手机号
    *
    * @param mobileNumSet
    */
    public void setMobileNumSet(List<String> mobileNumSet) {
        this.mobileNumSet = mobileNumSet;
    }



    /**
     * set 模版code
     *
     * @param templateId
     */
    public SendBatchMsg templateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }


    /**
    * set 模版参数
    *
    * @param templateParam
    */
    public SendBatchMsg templateParam(List<String> templateParam) {
        this.templateParam = templateParam;
        return this;
    }


    /**
     * set 业务编码(和产品申请)
     *
     * @param smsMessageSource
     */
    public SendBatchMsg smsMessageSource(String smsMessageSource) {
        this.smsMessageSource = smsMessageSource;
        return this;
    }


    /**
     * set 用户pin
     *
     * @param pin
     */
    public SendBatchMsg pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
    * set 手机号
    *
    * @param mobileNumSet
    */
    public SendBatchMsg mobileNumSet(List<String> mobileNumSet) {
        this.mobileNumSet = mobileNumSet;
        return this;
    }



    /**
     * add item to 模版参数
     *
     * @param templateParam
     */
    public void addTemplateParam(String templateParam) {
        if (this.templateParam == null) {
            this.templateParam = new ArrayList<>();
        }
        this.templateParam.add(templateParam);
    }

    /**
     * add item to 手机号
     *
     * @param mobileNumSet
     */
    public void addMobileNumSet(String mobileNumSet) {
        if (this.mobileNumSet == null) {
            this.mobileNumSet = new ArrayList<>();
        }
        this.mobileNumSet.add(mobileNumSet);
    }
}