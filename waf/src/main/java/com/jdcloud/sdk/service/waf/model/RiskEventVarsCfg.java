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

package com.jdcloud.sdk.service.waf.model;

import java.util.List;
import java.util.ArrayList;

/**
 * riskEventVarsCfg
 */
public class RiskEventVarsCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * WAF实例id
     */
    private String wafInstanceId;

    /**
     * 域名
     */
    private String domain;

    /**
     * 名称
     */
    private String name;

    /**
     * 事件信息
     */
    private RiskEventCfg event;

    /**
     * 变量信息
     */
    private List<RiskVarCfg> vars;

    /**
     * 策略信息
     */
    private List<RiskPolicyCfg> policys;


    /**
     * get WAF实例id
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }

    /**
     * get 域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 事件信息
     *
     * @return
     */
    public RiskEventCfg getEvent() {
        return event;
    }

    /**
     * set 事件信息
     *
     * @param event
     */
    public void setEvent(RiskEventCfg event) {
        this.event = event;
    }

    /**
     * get 变量信息
     *
     * @return
     */
    public List<RiskVarCfg> getVars() {
        return vars;
    }

    /**
     * set 变量信息
     *
     * @param vars
     */
    public void setVars(List<RiskVarCfg> vars) {
        this.vars = vars;
    }

    /**
     * get 策略信息
     *
     * @return
     */
    public List<RiskPolicyCfg> getPolicys() {
        return policys;
    }

    /**
     * set 策略信息
     *
     * @param policys
     */
    public void setPolicys(List<RiskPolicyCfg> policys) {
        this.policys = policys;
    }


    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public RiskEventVarsCfg wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public RiskEventVarsCfg domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public RiskEventVarsCfg name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 事件信息
     *
     * @param event
     */
    public RiskEventVarsCfg event(RiskEventCfg event) {
        this.event = event;
        return this;
    }

    /**
     * set 变量信息
     *
     * @param vars
     */
    public RiskEventVarsCfg vars(List<RiskVarCfg> vars) {
        this.vars = vars;
        return this;
    }

    /**
     * set 策略信息
     *
     * @param policys
     */
    public RiskEventVarsCfg policys(List<RiskPolicyCfg> policys) {
        this.policys = policys;
        return this;
    }


    /**
     * add item to 变量信息
     *
     * @param var
     */
    public void addVar(RiskVarCfg var) {
        if (this.vars == null) {
            this.vars = new ArrayList<>();
        }
        this.vars.add(var);
    }

    /**
     * add item to 策略信息
     *
     * @param policy
     */
    public void addPolicy(RiskPolicyCfg policy) {
        if (this.policys == null) {
            this.policys = new ArrayList<>();
        }
        this.policys.add(policy);
    }

}