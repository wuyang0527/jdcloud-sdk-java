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
 * Alarm Template APIs
 * monitor API
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
import com.jdcloud.sdk.service.monitor.model.BaseRuleT;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 更新自定义报警模板
 */
public class UpdateTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板描述
     */
    private String description;

    /**
     * 规则的资源类型
     * Required:true
     */
    @Required
    private String ruleServiceCode;

    /**
     * 模板的资源类型
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 模板ID
     * Required:true
     */
    @Required
    private Long templateId;

    /**
     * 模板名称
     * Required:true
     */
    @Required
    private String templateName;

    /**
     * 模板内包含的规则
     * Required:true
     */
    @Required
    private List<BaseRuleT> templateRules;


    /**
     * get 模板描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 模板描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 规则的资源类型
     *
     * @return
     */
    public String getRuleServiceCode() {
        return ruleServiceCode;
    }

    /**
     * set 规则的资源类型
     *
     * @param ruleServiceCode
     */
    public void setRuleServiceCode(String ruleServiceCode) {
        this.ruleServiceCode = ruleServiceCode;
    }

    /**
     * get 模板的资源类型
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 模板的资源类型
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 模板ID
     *
     * @return
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * set 模板ID
     *
     * @param templateId
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    /**
     * get 模板名称
     *
     * @return
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * set 模板名称
     *
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * get 模板内包含的规则
     *
     * @return
     */
    public List<BaseRuleT> getTemplateRules() {
        return templateRules;
    }

    /**
     * set 模板内包含的规则
     *
     * @param templateRules
     */
    public void setTemplateRules(List<BaseRuleT> templateRules) {
        this.templateRules = templateRules;
    }


    /**
     * set 模板描述
     *
     * @param description
     */
    public UpdateTemplateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 规则的资源类型
     *
     * @param ruleServiceCode
     */
    public UpdateTemplateRequest ruleServiceCode(String ruleServiceCode) {
        this.ruleServiceCode = ruleServiceCode;
        return this;
    }

    /**
     * set 模板的资源类型
     *
     * @param serviceCode
     */
    public UpdateTemplateRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 模板ID
     *
     * @param templateId
     */
    public UpdateTemplateRequest templateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * set 模板名称
     *
     * @param templateName
     */
    public UpdateTemplateRequest templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * set 模板内包含的规则
     *
     * @param templateRules
     */
    public UpdateTemplateRequest templateRules(List<BaseRuleT> templateRules) {
        this.templateRules = templateRules;
        return this;
    }


    /**
     * add item to 模板内包含的规则
     *
     * @param templateRule
     */
    public void addTemplateRule(BaseRuleT templateRule) {
        if (this.templateRules == null) {
            this.templateRules = new ArrayList<>();
        }
        this.templateRules.add(templateRule);
    }

}