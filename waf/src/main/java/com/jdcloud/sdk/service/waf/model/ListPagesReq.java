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
 * listPagesReq
 */
public class ListPagesReq  implements java.io.Serializable {

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
     * -1表示该项不是查询条件 0审核中 1通过 2不通过
     */
    private Integer checkStatus;

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
     * get -1表示该项不是查询条件 0审核中 1通过 2不通过
     *
     * @return
     */
    public Integer getCheckStatus() {
        return checkStatus;
    }

    /**
     * set -1表示该项不是查询条件 0审核中 1通过 2不通过
     *
     * @param checkStatus
     */
    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
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
    public ListPagesReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public ListPagesReq domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set -1表示该项不是查询条件 0审核中 1通过 2不通过
     *
     * @param checkStatus
     */
    public ListPagesReq checkStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }

    /**
     * set 页大小，[1-100]，默认是10
     *
     * @param pageSize
     */
    public ListPagesReq pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


}