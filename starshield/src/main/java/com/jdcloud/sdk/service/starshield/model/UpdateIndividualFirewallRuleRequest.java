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
 * Firewall rules
 * Define Firewall rules using filter expressions for more control over how traffic is matched to the rule.
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.starshield.model.Filter;
import com.jdcloud.sdk.service.starshield.model.Action_parameters;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 更新一个单独的现有防火墙规则。
 */
public class UpdateIndividualFirewallRuleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用于匹配请求的行动。注意，行动 &quot;log &quot;只适用于企业客户。
     */
    private String action;

    /**
     * filter
     */
    private Filter filter;

    /**
     * products
     */
    private List<String> products;

    /**
     * 规则的优先级，允许控制处理顺序。一个较小的数字表示高优先级。如果不提供，任何有优先权的规则将在没有优先权的规则之前排序。
     */
    private Number priority;

    /**
     * 此防火墙规则当前是否已暂停。
     */
    private Boolean paused;

    /**
     * 短引用标记，用于快速选择相关规则。
     */
    private String ref;

    /**
     * action_parameters
     */
    private Action_parameters action_parameters;

    /**
     * 对规则的描述，以帮助识别它。
     */
    private String description;

    /**
     * zone_identifier
     * Required:true
     */
    @Required
    private String zone_identifier;

    /**
     * id
     * Required:true
     */
    @Required
    private String id;


    /**
     * get 应用于匹配请求的行动。注意，行动 &quot;log &quot;只适用于企业客户。
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 应用于匹配请求的行动。注意，行动 &quot;log &quot;只适用于企业客户。
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get filter
     *
     * @return
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * set filter
     *
     * @param filter
     */
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    /**
     * get products
     *
     * @return
     */
    public List<String> getProducts() {
        return products;
    }

    /**
     * set products
     *
     * @param products
     */
    public void setProducts(List<String> products) {
        this.products = products;
    }

    /**
     * get 规则的优先级，允许控制处理顺序。一个较小的数字表示高优先级。如果不提供，任何有优先权的规则将在没有优先权的规则之前排序。
     *
     * @return
     */
    public Number getPriority() {
        return priority;
    }

    /**
     * set 规则的优先级，允许控制处理顺序。一个较小的数字表示高优先级。如果不提供，任何有优先权的规则将在没有优先权的规则之前排序。
     *
     * @param priority
     */
    public void setPriority(Number priority) {
        this.priority = priority;
    }

    /**
     * get 此防火墙规则当前是否已暂停。
     *
     * @return
     */
    public Boolean getPaused() {
        return paused;
    }

    /**
     * set 此防火墙规则当前是否已暂停。
     *
     * @param paused
     */
    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    /**
     * get 短引用标记，用于快速选择相关规则。
     *
     * @return
     */
    public String getRef() {
        return ref;
    }

    /**
     * set 短引用标记，用于快速选择相关规则。
     *
     * @param ref
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * get action_parameters
     *
     * @return
     */
    public Action_parameters getAction_parameters() {
        return action_parameters;
    }

    /**
     * set action_parameters
     *
     * @param action_parameters
     */
    public void setAction_parameters(Action_parameters action_parameters) {
        this.action_parameters = action_parameters;
    }

    /**
     * get 对规则的描述，以帮助识别它。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 对规则的描述，以帮助识别它。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get zone_identifier
     *
     * @return
     */
    public String getZone_identifier() {
        return zone_identifier;
    }

    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public void setZone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
    }

    /**
     * get id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * set 应用于匹配请求的行动。注意，行动 &quot;log &quot;只适用于企业客户。
     *
     * @param action
     */
    public UpdateIndividualFirewallRuleRequest action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set filter
     *
     * @param filter
     */
    public UpdateIndividualFirewallRuleRequest filter(Filter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * set products
     *
     * @param products
     */
    public UpdateIndividualFirewallRuleRequest products(List<String> products) {
        this.products = products;
        return this;
    }

    /**
     * set 规则的优先级，允许控制处理顺序。一个较小的数字表示高优先级。如果不提供，任何有优先权的规则将在没有优先权的规则之前排序。
     *
     * @param priority
     */
    public UpdateIndividualFirewallRuleRequest priority(Number priority) {
        this.priority = priority;
        return this;
    }

    /**
     * set 此防火墙规则当前是否已暂停。
     *
     * @param paused
     */
    public UpdateIndividualFirewallRuleRequest paused(Boolean paused) {
        this.paused = paused;
        return this;
    }

    /**
     * set 短引用标记，用于快速选择相关规则。
     *
     * @param ref
     */
    public UpdateIndividualFirewallRuleRequest ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * set action_parameters
     *
     * @param action_parameters
     */
    public UpdateIndividualFirewallRuleRequest action_parameters(Action_parameters action_parameters) {
        this.action_parameters = action_parameters;
        return this;
    }

    /**
     * set 对规则的描述，以帮助识别它。
     *
     * @param description
     */
    public UpdateIndividualFirewallRuleRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public UpdateIndividualFirewallRuleRequest zone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
        return this;
    }

    /**
     * set id
     *
     * @param id
     */
    public UpdateIndividualFirewallRuleRequest id(String id) {
        this.id = id;
        return this;
    }


    /**
     * add item to products
     *
     * @param product
     */
    public void addProduct(String product) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(product);
    }

}