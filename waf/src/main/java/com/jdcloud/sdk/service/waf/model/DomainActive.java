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
 * domainActive
 */
public class DomainActive  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 0-未选择，1-选择
     */
    private Integer active;

    /**
     * 域名
     */
    private String domain;


    /**
     * get 0-未选择，1-选择
     *
     * @return
     */
    public Integer getActive() {
        return active;
    }

    /**
     * set 0-未选择，1-选择
     *
     * @param active
     */
    public void setActive(Integer active) {
        this.active = active;
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
     * set 0-未选择，1-选择
     *
     * @param active
     */
    public DomainActive active(Integer active) {
        this.active = active;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public DomainActive domain(String domain) {
        this.domain = domain;
        return this;
    }


}