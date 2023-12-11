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
 * emailSmsInfo
 */
public class EmailSmsInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin
     * Required:true
     */
    @Required
    private String createPin;

    /**
     * 邮件标题，短信不填
     */
    private String title;

    /**
     * 发送类型 1 发邮件 2 发短信
     * Required:true
     */
    @Required
    private Integer sendType;

    /**
     * 邮件内容，短信不填
     */
    private String content;

    /**
     * 接收人
     * Required:true
     */
    @Required
    
    private List<String> receives;
    /**
     * 模版code，短信必填，邮件不填
     * Required:true
     */
    @Required
    private Integer templateId;

    /**
     * 模版参数，短信必填，邮件不填
     * Required:true
     */
    @Required
    
    private List<String> templateParam;
    /**
     * 业务编码(和产品申请),短信必填，邮件不填
     * Required:true
     */
    @Required
    private String smsMessageSource;



    /**
     * get 用户pin
     *
     * @return
     */
    public String getCreatePin() {
        return createPin;
    }

    /**
     * set 用户pin
     *
     * @param createPin
     */
    public void setCreatePin(String createPin) {
        this.createPin = createPin;
    }


    /**
     * get 邮件标题，短信不填
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set 邮件标题，短信不填
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * get 发送类型 1 发邮件 2 发短信
     *
     * @return
     */
    public Integer getSendType() {
        return sendType;
    }

    /**
     * set 发送类型 1 发邮件 2 发短信
     *
     * @param sendType
     */
    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }


    /**
     * get 邮件内容，短信不填
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set 邮件内容，短信不填
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
    * get 接收人
    *
    * @return
    */
    public List<String> getReceives() {
        return receives;
    }

    /**
    * set 接收人
    *
    * @param receives
    */
    public void setReceives(List<String> receives) {
        this.receives = receives;
    }


    /**
     * get 模版code，短信必填，邮件不填
     *
     * @return
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * set 模版code，短信必填，邮件不填
     *
     * @param templateId
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }


    /**
    * get 模版参数，短信必填，邮件不填
    *
    * @return
    */
    public List<String> getTemplateParam() {
        return templateParam;
    }

    /**
    * set 模版参数，短信必填，邮件不填
    *
    * @param templateParam
    */
    public void setTemplateParam(List<String> templateParam) {
        this.templateParam = templateParam;
    }


    /**
     * get 业务编码(和产品申请),短信必填，邮件不填
     *
     * @return
     */
    public String getSmsMessageSource() {
        return smsMessageSource;
    }

    /**
     * set 业务编码(和产品申请),短信必填，邮件不填
     *
     * @param smsMessageSource
     */
    public void setSmsMessageSource(String smsMessageSource) {
        this.smsMessageSource = smsMessageSource;
    }



    /**
     * set 用户pin
     *
     * @param createPin
     */
    public EmailSmsInfo createPin(String createPin) {
        this.createPin = createPin;
        return this;
    }


    /**
     * set 邮件标题，短信不填
     *
     * @param title
     */
    public EmailSmsInfo title(String title) {
        this.title = title;
        return this;
    }


    /**
     * set 发送类型 1 发邮件 2 发短信
     *
     * @param sendType
     */
    public EmailSmsInfo sendType(Integer sendType) {
        this.sendType = sendType;
        return this;
    }


    /**
     * set 邮件内容，短信不填
     *
     * @param content
     */
    public EmailSmsInfo content(String content) {
        this.content = content;
        return this;
    }


    /**
    * set 接收人
    *
    * @param receives
    */
    public EmailSmsInfo receives(List<String> receives) {
        this.receives = receives;
        return this;
    }


    /**
     * set 模版code，短信必填，邮件不填
     *
     * @param templateId
     */
    public EmailSmsInfo templateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }


    /**
    * set 模版参数，短信必填，邮件不填
    *
    * @param templateParam
    */
    public EmailSmsInfo templateParam(List<String> templateParam) {
        this.templateParam = templateParam;
        return this;
    }


    /**
     * set 业务编码(和产品申请),短信必填，邮件不填
     *
     * @param smsMessageSource
     */
    public EmailSmsInfo smsMessageSource(String smsMessageSource) {
        this.smsMessageSource = smsMessageSource;
        return this;
    }



    /**
     * add item to 接收人
     *
     * @param receive
     */
    public void addReceive(String receive) {
        if (this.receives == null) {
            this.receives = new ArrayList<>();
        }
        this.receives.add(receive);
    }

    /**
     * add item to 模版参数，短信必填，邮件不填
     *
     * @param templateParam
     */
    public void addTemplateParam(String templateParam) {
        if (this.templateParam == null) {
            this.templateParam = new ArrayList<>();
        }
        this.templateParam.add(templateParam);
    }
}