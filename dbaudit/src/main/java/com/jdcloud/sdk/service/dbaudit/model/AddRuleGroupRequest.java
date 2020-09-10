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
 * Rule Interface
 * Rule Interface
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbaudit.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.dbaudit.model.RuleGroup;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 新增规则组
 */
public class AddRuleGroupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则组详情
     * Required:true
     */
    @Required
    private RuleGroup ruleGroup;

    /**
     * 数据库ID
     */
    private String dbId;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 审计实例ID
     * Required:true
     */
    @Required
    private String insId;


    /**
     * get 规则组详情
     *
     * @return
     */
    public RuleGroup getRuleGroup() {
        return ruleGroup;
    }

    /**
     * set 规则组详情
     *
     * @param ruleGroup
     */
    public void setRuleGroup(RuleGroup ruleGroup) {
        this.ruleGroup = ruleGroup;
    }

    /**
     * get 数据库ID
     *
     * @return
     */
    public String getDbId() {
        return dbId;
    }

    /**
     * set 数据库ID
     *
     * @param dbId
     */
    public void setDbId(String dbId) {
        this.dbId = dbId;
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
     * get 审计实例ID
     *
     * @return
     */
    public String getInsId() {
        return insId;
    }

    /**
     * set 审计实例ID
     *
     * @param insId
     */
    public void setInsId(String insId) {
        this.insId = insId;
    }


    /**
     * set 规则组详情
     *
     * @param ruleGroup
     */
    public AddRuleGroupRequest ruleGroup(RuleGroup ruleGroup) {
        this.ruleGroup = ruleGroup;
        return this;
    }

    /**
     * set 数据库ID
     *
     * @param dbId
     */
    public AddRuleGroupRequest dbId(String dbId) {
        this.dbId = dbId;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public AddRuleGroupRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 审计实例ID
     *
     * @param insId
     */
    public AddRuleGroupRequest insId(String insId) {
        this.insId = insId;
        return this;
    }


}