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

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * applyTemplateSpec
 */
public class ApplyTemplateSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 幂等性校验参数,最长36位
     * Required:true
     */
    @Required
    private String clientToken;

    /**
     * 联系人列表
     */
    private List<BaseContact> contacts;

    /**
     * dataCenters，该资源所处地域，与resourceIds一一对应
     * Required:true
     */
    @Required
    private List<String> dataCenters;

    /**
     * 资源ID列表，resourceIds数量为1--40，每一项不能为空或包含*
     * Required:true
     */
    @Required
    private List<String> resourceIds;

    /**
     * 资源类型
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 标签组，模板下面规则对应的tags，与resourceIds一一对应
     */
    private List<Object> tagsArray;

    /**
     * 模板类型，1表示默认模板，2表示用户自定义模板
     * Required:true
     */
    @Required
    private Long templateType;

    /**
     * 回调content 注:仅webHookUrl和webHookContent均不为空时,才会创建webHook
     */
    private String webHookContent;

    /**
     * webHook协议,https或http 注:此处需和webHookUrl相匹配
     */
    private String webHookProtocol;

    /**
     * 回调secret,用户请求签名,防伪造
     */
    private String webHookSecret;

    /**
     * 回调url
     */
    private String webHookUrl;


    /**
     * get 幂等性校验参数,最长36位
     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 幂等性校验参数,最长36位
     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * get 联系人列表
     *
     * @return
     */
    public List<BaseContact> getContacts() {
        return contacts;
    }

    /**
     * set 联系人列表
     *
     * @param contacts
     */
    public void setContacts(List<BaseContact> contacts) {
        this.contacts = contacts;
    }

    /**
     * get dataCenters，该资源所处地域，与resourceIds一一对应
     *
     * @return
     */
    public List<String> getDataCenters() {
        return dataCenters;
    }

    /**
     * set dataCenters，该资源所处地域，与resourceIds一一对应
     *
     * @param dataCenters
     */
    public void setDataCenters(List<String> dataCenters) {
        this.dataCenters = dataCenters;
    }

    /**
     * get 资源ID列表，resourceIds数量为1--40，每一项不能为空或包含*
     *
     * @return
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * set 资源ID列表，resourceIds数量为1--40，每一项不能为空或包含*
     *
     * @param resourceIds
     */
    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    /**
     * get 资源类型
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 资源类型
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 标签组，模板下面规则对应的tags，与resourceIds一一对应
     *
     * @return
     */
    public List<Object> getTagsArray() {
        return tagsArray;
    }

    /**
     * set 标签组，模板下面规则对应的tags，与resourceIds一一对应
     *
     * @param tagsArray
     */
    public void setTagsArray(List<Object> tagsArray) {
        this.tagsArray = tagsArray;
    }

    /**
     * get 模板类型，1表示默认模板，2表示用户自定义模板
     *
     * @return
     */
    public Long getTemplateType() {
        return templateType;
    }

    /**
     * set 模板类型，1表示默认模板，2表示用户自定义模板
     *
     * @param templateType
     */
    public void setTemplateType(Long templateType) {
        this.templateType = templateType;
    }

    /**
     * get 回调content 注:仅webHookUrl和webHookContent均不为空时,才会创建webHook
     *
     * @return
     */
    public String getWebHookContent() {
        return webHookContent;
    }

    /**
     * set 回调content 注:仅webHookUrl和webHookContent均不为空时,才会创建webHook
     *
     * @param webHookContent
     */
    public void setWebHookContent(String webHookContent) {
        this.webHookContent = webHookContent;
    }

    /**
     * get webHook协议,https或http 注:此处需和webHookUrl相匹配
     *
     * @return
     */
    public String getWebHookProtocol() {
        return webHookProtocol;
    }

    /**
     * set webHook协议,https或http 注:此处需和webHookUrl相匹配
     *
     * @param webHookProtocol
     */
    public void setWebHookProtocol(String webHookProtocol) {
        this.webHookProtocol = webHookProtocol;
    }

    /**
     * get 回调secret,用户请求签名,防伪造
     *
     * @return
     */
    public String getWebHookSecret() {
        return webHookSecret;
    }

    /**
     * set 回调secret,用户请求签名,防伪造
     *
     * @param webHookSecret
     */
    public void setWebHookSecret(String webHookSecret) {
        this.webHookSecret = webHookSecret;
    }

    /**
     * get 回调url
     *
     * @return
     */
    public String getWebHookUrl() {
        return webHookUrl;
    }

    /**
     * set 回调url
     *
     * @param webHookUrl
     */
    public void setWebHookUrl(String webHookUrl) {
        this.webHookUrl = webHookUrl;
    }


    /**
     * set 幂等性校验参数,最长36位
     *
     * @param clientToken
     */
    public ApplyTemplateSpec clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set 联系人列表
     *
     * @param contacts
     */
    public ApplyTemplateSpec contacts(List<BaseContact> contacts) {
        this.contacts = contacts;
        return this;
    }

    /**
     * set dataCenters，该资源所处地域，与resourceIds一一对应
     *
     * @param dataCenters
     */
    public ApplyTemplateSpec dataCenters(List<String> dataCenters) {
        this.dataCenters = dataCenters;
        return this;
    }

    /**
     * set 资源ID列表，resourceIds数量为1--40，每一项不能为空或包含*
     *
     * @param resourceIds
     */
    public ApplyTemplateSpec resourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    /**
     * set 资源类型
     *
     * @param serviceCode
     */
    public ApplyTemplateSpec serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 标签组，模板下面规则对应的tags，与resourceIds一一对应
     *
     * @param tagsArray
     */
    public ApplyTemplateSpec tagsArray(List<Object> tagsArray) {
        this.tagsArray = tagsArray;
        return this;
    }

    /**
     * set 模板类型，1表示默认模板，2表示用户自定义模板
     *
     * @param templateType
     */
    public ApplyTemplateSpec templateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * set 回调content 注:仅webHookUrl和webHookContent均不为空时,才会创建webHook
     *
     * @param webHookContent
     */
    public ApplyTemplateSpec webHookContent(String webHookContent) {
        this.webHookContent = webHookContent;
        return this;
    }

    /**
     * set webHook协议,https或http 注:此处需和webHookUrl相匹配
     *
     * @param webHookProtocol
     */
    public ApplyTemplateSpec webHookProtocol(String webHookProtocol) {
        this.webHookProtocol = webHookProtocol;
        return this;
    }

    /**
     * set 回调secret,用户请求签名,防伪造
     *
     * @param webHookSecret
     */
    public ApplyTemplateSpec webHookSecret(String webHookSecret) {
        this.webHookSecret = webHookSecret;
        return this;
    }

    /**
     * set 回调url
     *
     * @param webHookUrl
     */
    public ApplyTemplateSpec webHookUrl(String webHookUrl) {
        this.webHookUrl = webHookUrl;
        return this;
    }


    /**
     * add item to 联系人列表
     *
     * @param contact
     */
    public void addContact(BaseContact contact) {
        if (this.contacts == null) {
            this.contacts = new ArrayList<>();
        }
        this.contacts.add(contact);
    }

    /**
     * add item to dataCenters，该资源所处地域，与resourceIds一一对应
     *
     * @param dataCenter
     */
    public void addDataCenter(String dataCenter) {
        if (this.dataCenters == null) {
            this.dataCenters = new ArrayList<>();
        }
        this.dataCenters.add(dataCenter);
    }

    /**
     * add item to 资源ID列表，resourceIds数量为1--40，每一项不能为空或包含*
     *
     * @param resourceId
     */
    public void addResourceId(String resourceId) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceId);
    }

    /**
     * add item to 标签组，模板下面规则对应的tags，与resourceIds一一对应
     *
     * @param tagsArray
     */
    public void addTagsArray(Object tagsArray) {
        if (this.tagsArray == null) {
            this.tagsArray = new ArrayList<>();
        }
        this.tagsArray.add(tagsArray);
    }

}