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
 * Monitoring Rules APIs
 * 云监控规则相关接口，提供创建、查询、修改、删除监控规则等功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.monitor.model.BaseContact;
import com.jdcloud.sdk.service.monitor.model.BaseRule;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 批量创建报警规则，可以为多个实例创建多个报警规则。
 */
public class BatchCreateAlarmsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 幂等性校验参数，最长36位
     * Required:true
     */
    @Required
    private String clientToken;

    /**
     * 通知的联系人
     */
    private List<BaseContact> contacts;

    /**
     * 地域
     */
    private String datacenter;

    /**
     * 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     */
    private Long enabled;

    /**
     * 报警规则对应实例列表，每次最多100个，例如&quot;[&#39;resourceId1&#39;,&#39;resourceId2&#39;]&quot;
     * Required:true
     */
    @Required
    private List<String> resourceIds;

    /**
     * 规则类型, 1表示资源监控，6表示站点监控，默认为1
     */
    private Long ruleType;

    /**
     * 要批量创建的规则列表
     * Required:true
     */
    @Required
    private List<BaseRule> rules;

    /**
     * 是否保存为模板
     */
    private Boolean saveTemplate;

    /**
     * 产品线标识，规则对应的serviceCode
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 模板名称，保存模板时，不能为空
     */
    private String templateName;

    /**
     * 产品线标识，保存为模板时，模板对应的serviceCode
     */
    private String templateServiceCode;

    /**
     * 回调content 注：仅webHookUrl和webHookContent均不为空时，才会创建webHook
     */
    private String webHookContent;

    /**
     * webHook协议
     */
    private String webHookProtocol;

    /**
     * 回调secret，用户请求签名，防伪造
     */
    private String webHookSecret;

    /**
     * 回调url
     */
    private String webHookUrl;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 幂等性校验参数，最长36位
     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 幂等性校验参数，最长36位
     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * get 通知的联系人
     *
     * @return
     */
    public List<BaseContact> getContacts() {
        return contacts;
    }

    /**
     * set 通知的联系人
     *
     * @param contacts
     */
    public void setContacts(List<BaseContact> contacts) {
        this.contacts = contacts;
    }

    /**
     * get 地域
     *
     * @return
     */
    public String getDatacenter() {
        return datacenter;
    }

    /**
     * set 地域
     *
     * @param datacenter
     */
    public void setDatacenter(String datacenter) {
        this.datacenter = datacenter;
    }

    /**
     * get 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @return
     */
    public Long getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @param enabled
     */
    public void setEnabled(Long enabled) {
        this.enabled = enabled;
    }

    /**
     * get 报警规则对应实例列表，每次最多100个，例如&quot;[&#39;resourceId1&#39;,&#39;resourceId2&#39;]&quot;
     *
     * @return
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * set 报警规则对应实例列表，每次最多100个，例如&quot;[&#39;resourceId1&#39;,&#39;resourceId2&#39;]&quot;
     *
     * @param resourceIds
     */
    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    /**
     * get 规则类型, 1表示资源监控，6表示站点监控，默认为1
     *
     * @return
     */
    public Long getRuleType() {
        return ruleType;
    }

    /**
     * set 规则类型, 1表示资源监控，6表示站点监控，默认为1
     *
     * @param ruleType
     */
    public void setRuleType(Long ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * get 要批量创建的规则列表
     *
     * @return
     */
    public List<BaseRule> getRules() {
        return rules;
    }

    /**
     * set 要批量创建的规则列表
     *
     * @param rules
     */
    public void setRules(List<BaseRule> rules) {
        this.rules = rules;
    }

    /**
     * get 是否保存为模板
     *
     * @return
     */
    public Boolean getSaveTemplate() {
        return saveTemplate;
    }

    /**
     * set 是否保存为模板
     *
     * @param saveTemplate
     */
    public void setSaveTemplate(Boolean saveTemplate) {
        this.saveTemplate = saveTemplate;
    }

    /**
     * get 产品线标识，规则对应的serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线标识，规则对应的serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 模板名称，保存模板时，不能为空
     *
     * @return
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * set 模板名称，保存模板时，不能为空
     *
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * get 产品线标识，保存为模板时，模板对应的serviceCode
     *
     * @return
     */
    public String getTemplateServiceCode() {
        return templateServiceCode;
    }

    /**
     * set 产品线标识，保存为模板时，模板对应的serviceCode
     *
     * @param templateServiceCode
     */
    public void setTemplateServiceCode(String templateServiceCode) {
        this.templateServiceCode = templateServiceCode;
    }

    /**
     * get 回调content 注：仅webHookUrl和webHookContent均不为空时，才会创建webHook
     *
     * @return
     */
    public String getWebHookContent() {
        return webHookContent;
    }

    /**
     * set 回调content 注：仅webHookUrl和webHookContent均不为空时，才会创建webHook
     *
     * @param webHookContent
     */
    public void setWebHookContent(String webHookContent) {
        this.webHookContent = webHookContent;
    }

    /**
     * get webHook协议
     *
     * @return
     */
    public String getWebHookProtocol() {
        return webHookProtocol;
    }

    /**
     * set webHook协议
     *
     * @param webHookProtocol
     */
    public void setWebHookProtocol(String webHookProtocol) {
        this.webHookProtocol = webHookProtocol;
    }

    /**
     * get 回调secret，用户请求签名，防伪造
     *
     * @return
     */
    public String getWebHookSecret() {
        return webHookSecret;
    }

    /**
     * set 回调secret，用户请求签名，防伪造
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
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 幂等性校验参数，最长36位
     *
     * @param clientToken
     */
    public BatchCreateAlarmsRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set 通知的联系人
     *
     * @param contacts
     */
    public BatchCreateAlarmsRequest contacts(List<BaseContact> contacts) {
        this.contacts = contacts;
        return this;
    }

    /**
     * set 地域
     *
     * @param datacenter
     */
    public BatchCreateAlarmsRequest datacenter(String datacenter) {
        this.datacenter = datacenter;
        return this;
    }

    /**
     * set 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @param enabled
     */
    public BatchCreateAlarmsRequest enabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 报警规则对应实例列表，每次最多100个，例如&quot;[&#39;resourceId1&#39;,&#39;resourceId2&#39;]&quot;
     *
     * @param resourceIds
     */
    public BatchCreateAlarmsRequest resourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    /**
     * set 规则类型, 1表示资源监控，6表示站点监控，默认为1
     *
     * @param ruleType
     */
    public BatchCreateAlarmsRequest ruleType(Long ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * set 要批量创建的规则列表
     *
     * @param rules
     */
    public BatchCreateAlarmsRequest rules(List<BaseRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * set 是否保存为模板
     *
     * @param saveTemplate
     */
    public BatchCreateAlarmsRequest saveTemplate(Boolean saveTemplate) {
        this.saveTemplate = saveTemplate;
        return this;
    }

    /**
     * set 产品线标识，规则对应的serviceCode
     *
     * @param serviceCode
     */
    public BatchCreateAlarmsRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 模板名称，保存模板时，不能为空
     *
     * @param templateName
     */
    public BatchCreateAlarmsRequest templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * set 产品线标识，保存为模板时，模板对应的serviceCode
     *
     * @param templateServiceCode
     */
    public BatchCreateAlarmsRequest templateServiceCode(String templateServiceCode) {
        this.templateServiceCode = templateServiceCode;
        return this;
    }

    /**
     * set 回调content 注：仅webHookUrl和webHookContent均不为空时，才会创建webHook
     *
     * @param webHookContent
     */
    public BatchCreateAlarmsRequest webHookContent(String webHookContent) {
        this.webHookContent = webHookContent;
        return this;
    }

    /**
     * set webHook协议
     *
     * @param webHookProtocol
     */
    public BatchCreateAlarmsRequest webHookProtocol(String webHookProtocol) {
        this.webHookProtocol = webHookProtocol;
        return this;
    }

    /**
     * set 回调secret，用户请求签名，防伪造
     *
     * @param webHookSecret
     */
    public BatchCreateAlarmsRequest webHookSecret(String webHookSecret) {
        this.webHookSecret = webHookSecret;
        return this;
    }

    /**
     * set 回调url
     *
     * @param webHookUrl
     */
    public BatchCreateAlarmsRequest webHookUrl(String webHookUrl) {
        this.webHookUrl = webHookUrl;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public BatchCreateAlarmsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 通知的联系人
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
     * add item to 报警规则对应实例列表，每次最多100个，例如&quot;[&#39;resourceId1&#39;,&#39;resourceId2&#39;]&quot;
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
     * add item to 要批量创建的规则列表
     *
     * @param rule
     */
    public void addRule(BaseRule rule) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rule);
    }

}