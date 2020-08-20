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
 * enableNameReq
 */
public class EnableNameReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例id，WAF实例
     * Required:true
     */
    @Required
    private String wafInstanceId;

    /**
     * 域名
     * Required:true
     */
    @Required
    private String domain;

    /**
     * 名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 是否使能，0表示否
     */
    private Integer enable;


    /**
     * get 实例id，WAF实例
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set 实例id，WAF实例
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
     * get 是否使能，0表示否
     *
     * @return
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * set 是否使能，0表示否
     *
     * @param enable
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }


    /**
     * set 实例id，WAF实例
     *
     * @param wafInstanceId
     */
    public EnableNameReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public EnableNameReq domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public EnableNameReq name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 是否使能，0表示否
     *
     * @param enable
     */
    public EnableNameReq enable(Integer enable) {
        this.enable = enable;
        return this;
    }


}