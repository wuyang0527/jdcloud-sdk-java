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


/**
 * ccConf
 */
public class CcConf  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否使能 0表示否
     */
    private Integer enable;

    /**
     * 0表示正常，1表示攻击紧急
     */
    private Integer ccMode;

    /**
     * qps配置
     */
    private Integer qps;

    /**
     * 是否支持自定义cc，0表示否
     */
    private Integer enableUserDefine;

    /**
     * cc自定义规则个数
     */
    private Integer rulesCount;


    /**
     * get 是否使能 0表示否
     *
     * @return
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * set 是否使能 0表示否
     *
     * @param enable
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * get 0表示正常，1表示攻击紧急
     *
     * @return
     */
    public Integer getCcMode() {
        return ccMode;
    }

    /**
     * set 0表示正常，1表示攻击紧急
     *
     * @param ccMode
     */
    public void setCcMode(Integer ccMode) {
        this.ccMode = ccMode;
    }

    /**
     * get qps配置
     *
     * @return
     */
    public Integer getQps() {
        return qps;
    }

    /**
     * set qps配置
     *
     * @param qps
     */
    public void setQps(Integer qps) {
        this.qps = qps;
    }

    /**
     * get 是否支持自定义cc，0表示否
     *
     * @return
     */
    public Integer getEnableUserDefine() {
        return enableUserDefine;
    }

    /**
     * set 是否支持自定义cc，0表示否
     *
     * @param enableUserDefine
     */
    public void setEnableUserDefine(Integer enableUserDefine) {
        this.enableUserDefine = enableUserDefine;
    }

    /**
     * get cc自定义规则个数
     *
     * @return
     */
    public Integer getRulesCount() {
        return rulesCount;
    }

    /**
     * set cc自定义规则个数
     *
     * @param rulesCount
     */
    public void setRulesCount(Integer rulesCount) {
        this.rulesCount = rulesCount;
    }


    /**
     * set 是否使能 0表示否
     *
     * @param enable
     */
    public CcConf enable(Integer enable) {
        this.enable = enable;
        return this;
    }

    /**
     * set 0表示正常，1表示攻击紧急
     *
     * @param ccMode
     */
    public CcConf ccMode(Integer ccMode) {
        this.ccMode = ccMode;
        return this;
    }

    /**
     * set qps配置
     *
     * @param qps
     */
    public CcConf qps(Integer qps) {
        this.qps = qps;
        return this;
    }

    /**
     * set 是否支持自定义cc，0表示否
     *
     * @param enableUserDefine
     */
    public CcConf enableUserDefine(Integer enableUserDefine) {
        this.enableUserDefine = enableUserDefine;
        return this;
    }

    /**
     * set cc自定义规则个数
     *
     * @param rulesCount
     */
    public CcConf rulesCount(Integer rulesCount) {
        this.rulesCount = rulesCount;
        return this;
    }


}