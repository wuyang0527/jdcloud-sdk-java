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
 * listRewriteRulesReq
 */
public class ListRewriteRulesReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * WAF实例id
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
     * 重写类型 目前支持&quot;uri&quot;
     * Required:true
     */
    @Required
    private String rewriteType;

    /**
     * 页码，[1-100]，默认是1
     */
    private Integer pageIndex;

    /**
     * 页大小，[1-100]，默认是10
     */
    private Integer pageSize;


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
     * get 重写类型 目前支持&quot;uri&quot;
     *
     * @return
     */
    public String getRewriteType() {
        return rewriteType;
    }

    /**
     * set 重写类型 目前支持&quot;uri&quot;
     *
     * @param rewriteType
     */
    public void setRewriteType(String rewriteType) {
        this.rewriteType = rewriteType;
    }

    /**
     * get 页码，[1-100]，默认是1
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 页码，[1-100]，默认是1
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * get 页大小，[1-100]，默认是10
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页大小，[1-100]，默认是10
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public ListRewriteRulesReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public ListRewriteRulesReq domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 重写类型 目前支持&quot;uri&quot;
     *
     * @param rewriteType
     */
    public ListRewriteRulesReq rewriteType(String rewriteType) {
        this.rewriteType = rewriteType;
        return this;
    }

    /**
     * set 页码，[1-100]，默认是1
     *
     * @param pageIndex
     */
    public ListRewriteRulesReq pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set 页大小，[1-100]，默认是10
     *
     * @param pageSize
     */
    public ListRewriteRulesReq pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


}