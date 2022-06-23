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
 * listCcRuleCfg
 */
public class ListCcRuleCfg  implements java.io.Serializable {

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
     * 规则名称
     */
    private String ruleName;

    /**
     * uri以/开头
     */
    private String uri;

    /**
     * 匹配uri 类型 0 精确匹配，1 前缀匹配（目前就支持精确匹配）
     */
    private Integer matchType;

    /**
     * 检测周期，单位是秒，[30~600]
     */
    private Integer detectPeriod;

    /**
     * ip访问次数，[1~9999999]
     */
    private Integer singleIpLimit;

    /**
     * 阻断类型 3:封禁，2:人机交互
     */
    private Integer blockType;

    /**
     * block 持续时间，单位为分钟[1~24*60]
     */
    private Integer blockTime;

    /**
     * 更新时间，s
     */
    private Integer updateTime;

    /**
     * 0-使用中 1-禁用
     */
    private Integer disable;

    /**
     * 跳转地址，blockType为1时必须为当前实例下的域名的url，为2时为自定义页面名称
     */
    private String redirection;

    /**
     * cc 统计维度，ip或cookie
     */
    private String dimension;

    /**
     * cookiename, 只有当 dimension 为 cookie 时才有效
     */
    private String dmvalue;


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
     * get 规则名称
     *
     * @return
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * set 规则名称
     *
     * @param ruleName
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * get uri以/开头
     *
     * @return
     */
    public String getUri() {
        return uri;
    }

    /**
     * set uri以/开头
     *
     * @param uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * get 匹配uri 类型 0 精确匹配，1 前缀匹配（目前就支持精确匹配）
     *
     * @return
     */
    public Integer getMatchType() {
        return matchType;
    }

    /**
     * set 匹配uri 类型 0 精确匹配，1 前缀匹配（目前就支持精确匹配）
     *
     * @param matchType
     */
    public void setMatchType(Integer matchType) {
        this.matchType = matchType;
    }

    /**
     * get 检测周期，单位是秒，[30~600]
     *
     * @return
     */
    public Integer getDetectPeriod() {
        return detectPeriod;
    }

    /**
     * set 检测周期，单位是秒，[30~600]
     *
     * @param detectPeriod
     */
    public void setDetectPeriod(Integer detectPeriod) {
        this.detectPeriod = detectPeriod;
    }

    /**
     * get ip访问次数，[1~9999999]
     *
     * @return
     */
    public Integer getSingleIpLimit() {
        return singleIpLimit;
    }

    /**
     * set ip访问次数，[1~9999999]
     *
     * @param singleIpLimit
     */
    public void setSingleIpLimit(Integer singleIpLimit) {
        this.singleIpLimit = singleIpLimit;
    }

    /**
     * get 阻断类型 3:封禁，2:人机交互
     *
     * @return
     */
    public Integer getBlockType() {
        return blockType;
    }

    /**
     * set 阻断类型 3:封禁，2:人机交互
     *
     * @param blockType
     */
    public void setBlockType(Integer blockType) {
        this.blockType = blockType;
    }

    /**
     * get block 持续时间，单位为分钟[1~24*60]
     *
     * @return
     */
    public Integer getBlockTime() {
        return blockTime;
    }

    /**
     * set block 持续时间，单位为分钟[1~24*60]
     *
     * @param blockTime
     */
    public void setBlockTime(Integer blockTime) {
        this.blockTime = blockTime;
    }

    /**
     * get 更新时间，s
     *
     * @return
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间，s
     *
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 0-使用中 1-禁用
     *
     * @return
     */
    public Integer getDisable() {
        return disable;
    }

    /**
     * set 0-使用中 1-禁用
     *
     * @param disable
     */
    public void setDisable(Integer disable) {
        this.disable = disable;
    }

    /**
     * get 跳转地址，blockType为1时必须为当前实例下的域名的url，为2时为自定义页面名称
     *
     * @return
     */
    public String getRedirection() {
        return redirection;
    }

    /**
     * set 跳转地址，blockType为1时必须为当前实例下的域名的url，为2时为自定义页面名称
     *
     * @param redirection
     */
    public void setRedirection(String redirection) {
        this.redirection = redirection;
    }

    /**
     * get cc 统计维度，ip或cookie
     *
     * @return
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * set cc 统计维度，ip或cookie
     *
     * @param dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * get cookiename, 只有当 dimension 为 cookie 时才有效
     *
     * @return
     */
    public String getDmvalue() {
        return dmvalue;
    }

    /**
     * set cookiename, 只有当 dimension 为 cookie 时才有效
     *
     * @param dmvalue
     */
    public void setDmvalue(String dmvalue) {
        this.dmvalue = dmvalue;
    }


    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public ListCcRuleCfg wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public ListCcRuleCfg domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 规则名称
     *
     * @param ruleName
     */
    public ListCcRuleCfg ruleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * set uri以/开头
     *
     * @param uri
     */
    public ListCcRuleCfg uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * set 匹配uri 类型 0 精确匹配，1 前缀匹配（目前就支持精确匹配）
     *
     * @param matchType
     */
    public ListCcRuleCfg matchType(Integer matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * set 检测周期，单位是秒，[30~600]
     *
     * @param detectPeriod
     */
    public ListCcRuleCfg detectPeriod(Integer detectPeriod) {
        this.detectPeriod = detectPeriod;
        return this;
    }

    /**
     * set ip访问次数，[1~9999999]
     *
     * @param singleIpLimit
     */
    public ListCcRuleCfg singleIpLimit(Integer singleIpLimit) {
        this.singleIpLimit = singleIpLimit;
        return this;
    }

    /**
     * set 阻断类型 3:封禁，2:人机交互
     *
     * @param blockType
     */
    public ListCcRuleCfg blockType(Integer blockType) {
        this.blockType = blockType;
        return this;
    }

    /**
     * set block 持续时间，单位为分钟[1~24*60]
     *
     * @param blockTime
     */
    public ListCcRuleCfg blockTime(Integer blockTime) {
        this.blockTime = blockTime;
        return this;
    }

    /**
     * set 更新时间，s
     *
     * @param updateTime
     */
    public ListCcRuleCfg updateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 0-使用中 1-禁用
     *
     * @param disable
     */
    public ListCcRuleCfg disable(Integer disable) {
        this.disable = disable;
        return this;
    }

    /**
     * set 跳转地址，blockType为1时必须为当前实例下的域名的url，为2时为自定义页面名称
     *
     * @param redirection
     */
    public ListCcRuleCfg redirection(String redirection) {
        this.redirection = redirection;
        return this;
    }

    /**
     * set cc 统计维度，ip或cookie
     *
     * @param dimension
     */
    public ListCcRuleCfg dimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * set cookiename, 只有当 dimension 为 cookie 时才有效
     *
     * @param dmvalue
     */
    public ListCcRuleCfg dmvalue(String dmvalue) {
        this.dmvalue = dmvalue;
        return this;
    }


}