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

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;

/**
 * wAFRuleGroup
 */
public class WAFRuleGroup  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * WAF组标识符标签
     */
    private String id;

    /**
     * 防火墙规则组的名称
     */
    private String name;

    /**
     * WAF规则集的功能摘要
     */
    private String description;

    /**
     * 此组中包含多少条规则
     */
    private Number rules_count;

    /**
     * 组中有多少规则已从默认规则修改
     */
    private Number modified_rules_count;

    /**
     * WAF包标识符标签
     */
    private String package_id;

    /**
     * 此组中包含的规则是否可配置/可用
     */
    private String mode;

    /**
     * 组可以具有的可用状态。这将影响此组中规则的状态。
     */
    private List<String> allowed_modes;


    /**
     * get WAF组标识符标签
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set WAF组标识符标签
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 防火墙规则组的名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 防火墙规则组的名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get WAF规则集的功能摘要
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set WAF规则集的功能摘要
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 此组中包含多少条规则
     *
     * @return
     */
    public Number getRules_count() {
        return rules_count;
    }

    /**
     * set 此组中包含多少条规则
     *
     * @param rules_count
     */
    public void setRules_count(Number rules_count) {
        this.rules_count = rules_count;
    }

    /**
     * get 组中有多少规则已从默认规则修改
     *
     * @return
     */
    public Number getModified_rules_count() {
        return modified_rules_count;
    }

    /**
     * set 组中有多少规则已从默认规则修改
     *
     * @param modified_rules_count
     */
    public void setModified_rules_count(Number modified_rules_count) {
        this.modified_rules_count = modified_rules_count;
    }

    /**
     * get WAF包标识符标签
     *
     * @return
     */
    public String getPackage_id() {
        return package_id;
    }

    /**
     * set WAF包标识符标签
     *
     * @param package_id
     */
    public void setPackage_id(String package_id) {
        this.package_id = package_id;
    }

    /**
     * get 此组中包含的规则是否可配置/可用
     *
     * @return
     */
    public String getMode() {
        return mode;
    }

    /**
     * set 此组中包含的规则是否可配置/可用
     *
     * @param mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * get 组可以具有的可用状态。这将影响此组中规则的状态。
     *
     * @return
     */
    public List<String> getAllowed_modes() {
        return allowed_modes;
    }

    /**
     * set 组可以具有的可用状态。这将影响此组中规则的状态。
     *
     * @param allowed_modes
     */
    public void setAllowed_modes(List<String> allowed_modes) {
        this.allowed_modes = allowed_modes;
    }


    /**
     * set WAF组标识符标签
     *
     * @param id
     */
    public WAFRuleGroup id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 防火墙规则组的名称
     *
     * @param name
     */
    public WAFRuleGroup name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set WAF规则集的功能摘要
     *
     * @param description
     */
    public WAFRuleGroup description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 此组中包含多少条规则
     *
     * @param rules_count
     */
    public WAFRuleGroup rules_count(Number rules_count) {
        this.rules_count = rules_count;
        return this;
    }

    /**
     * set 组中有多少规则已从默认规则修改
     *
     * @param modified_rules_count
     */
    public WAFRuleGroup modified_rules_count(Number modified_rules_count) {
        this.modified_rules_count = modified_rules_count;
        return this;
    }

    /**
     * set WAF包标识符标签
     *
     * @param package_id
     */
    public WAFRuleGroup package_id(String package_id) {
        this.package_id = package_id;
        return this;
    }

    /**
     * set 此组中包含的规则是否可配置/可用
     *
     * @param mode
     */
    public WAFRuleGroup mode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * set 组可以具有的可用状态。这将影响此组中规则的状态。
     *
     * @param allowed_modes
     */
    public WAFRuleGroup allowed_modes(List<String> allowed_modes) {
        this.allowed_modes = allowed_modes;
        return this;
    }


    /**
     * add item to 组可以具有的可用状态。这将影响此组中规则的状态。
     *
     * @param allowed_mode
     */
    public void addAllowed_mode(String allowed_mode) {
        if (this.allowed_modes == null) {
            this.allowed_modes = new ArrayList<>();
        }
        this.allowed_modes.add(allowed_mode);
    }

}