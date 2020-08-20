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

import com.jdcloud.sdk.annotation.Required;

/**
 * skipActionCfg
 */
public class SkipActionCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否跳过所有阶段，1表示是，0表示否
     * Required:true
     */
    @Required
    private Integer passAll;

    /**
     * 是否执行cc防护，1表示是，0表示否
     * Required:true
     */
    @Required
    private Integer cc;

    /**
     * 是否执行waf防护，1表示是，0表示否
     * Required:true
     */
    @Required
    private Integer waf;

    /**
     * 是否执行deny防护，1表示是，0表示否
     * Required:true
     */
    @Required
    private Integer deny;

    /**
     * 是否执行限速，1表示是，0表示否
     * Required:true
     */
    @Required
    private Integer rateLimit;

    /**
     * 是否执行bot，1表示是，0表示否
     * Required:true
     */
    @Required
    private Integer bot;

    /**
     * 是否执行风控，1表示是，0表示否
     * Required:true
     */
    @Required
    private Integer risk;


    /**
     * get 是否跳过所有阶段，1表示是，0表示否
     *
     * @return
     */
    public Integer getPassAll() {
        return passAll;
    }

    /**
     * set 是否跳过所有阶段，1表示是，0表示否
     *
     * @param passAll
     */
    public void setPassAll(Integer passAll) {
        this.passAll = passAll;
    }

    /**
     * get 是否执行cc防护，1表示是，0表示否
     *
     * @return
     */
    public Integer getCc() {
        return cc;
    }

    /**
     * set 是否执行cc防护，1表示是，0表示否
     *
     * @param cc
     */
    public void setCc(Integer cc) {
        this.cc = cc;
    }

    /**
     * get 是否执行waf防护，1表示是，0表示否
     *
     * @return
     */
    public Integer getWaf() {
        return waf;
    }

    /**
     * set 是否执行waf防护，1表示是，0表示否
     *
     * @param waf
     */
    public void setWaf(Integer waf) {
        this.waf = waf;
    }

    /**
     * get 是否执行deny防护，1表示是，0表示否
     *
     * @return
     */
    public Integer getDeny() {
        return deny;
    }

    /**
     * set 是否执行deny防护，1表示是，0表示否
     *
     * @param deny
     */
    public void setDeny(Integer deny) {
        this.deny = deny;
    }

    /**
     * get 是否执行限速，1表示是，0表示否
     *
     * @return
     */
    public Integer getRateLimit() {
        return rateLimit;
    }

    /**
     * set 是否执行限速，1表示是，0表示否
     *
     * @param rateLimit
     */
    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }

    /**
     * get 是否执行bot，1表示是，0表示否
     *
     * @return
     */
    public Integer getBot() {
        return bot;
    }

    /**
     * set 是否执行bot，1表示是，0表示否
     *
     * @param bot
     */
    public void setBot(Integer bot) {
        this.bot = bot;
    }

    /**
     * get 是否执行风控，1表示是，0表示否
     *
     * @return
     */
    public Integer getRisk() {
        return risk;
    }

    /**
     * set 是否执行风控，1表示是，0表示否
     *
     * @param risk
     */
    public void setRisk(Integer risk) {
        this.risk = risk;
    }


    /**
     * set 是否跳过所有阶段，1表示是，0表示否
     *
     * @param passAll
     */
    public SkipActionCfg passAll(Integer passAll) {
        this.passAll = passAll;
        return this;
    }

    /**
     * set 是否执行cc防护，1表示是，0表示否
     *
     * @param cc
     */
    public SkipActionCfg cc(Integer cc) {
        this.cc = cc;
        return this;
    }

    /**
     * set 是否执行waf防护，1表示是，0表示否
     *
     * @param waf
     */
    public SkipActionCfg waf(Integer waf) {
        this.waf = waf;
        return this;
    }

    /**
     * set 是否执行deny防护，1表示是，0表示否
     *
     * @param deny
     */
    public SkipActionCfg deny(Integer deny) {
        this.deny = deny;
        return this;
    }

    /**
     * set 是否执行限速，1表示是，0表示否
     *
     * @param rateLimit
     */
    public SkipActionCfg rateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    /**
     * set 是否执行bot，1表示是，0表示否
     *
     * @param bot
     */
    public SkipActionCfg bot(Integer bot) {
        this.bot = bot;
        return this;
    }

    /**
     * set 是否执行风控，1表示是，0表示否
     *
     * @param risk
     */
    public SkipActionCfg risk(Integer risk) {
        this.risk = risk;
        return this;
    }


}