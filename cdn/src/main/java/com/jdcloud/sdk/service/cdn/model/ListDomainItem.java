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

package com.jdcloud.sdk.service.cdn.model;


/**
 * listDomainItem
 */
public class ListDomainItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * cname
     */
    private String cname;

    /**
     * description
     */
    private String description;

    /**
     * domain
     */
    private String domain;

    /**
     * created
     */
    private String created;

    /**
     * modified
     */
    private String modified;

    /**
     * status
     */
    private String status;

    /**
     * type
     */
    private String type;

    /**
     * auditStatus
     */
    private String auditStatus;


    /**
     * get cname
     *
     * @return
     */
    public String getCname() {
        return cname;
    }

    /**
     * set cname
     *
     * @param cname
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * get description
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set description
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get domain
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get created
     *
     * @return
     */
    public String getCreated() {
        return created;
    }

    /**
     * set created
     *
     * @param created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * get modified
     *
     * @return
     */
    public String getModified() {
        return modified;
    }

    /**
     * set modified
     *
     * @param modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * get status
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set status
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get type
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set type
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get auditStatus
     *
     * @return
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * set auditStatus
     *
     * @param auditStatus
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }


    /**
     * set cname
     *
     * @param cname
     */
    public ListDomainItem cname(String cname) {
        this.cname = cname;
        return this;
    }

    /**
     * set description
     *
     * @param description
     */
    public ListDomainItem description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set domain
     *
     * @param domain
     */
    public ListDomainItem domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set created
     *
     * @param created
     */
    public ListDomainItem created(String created) {
        this.created = created;
        return this;
    }

    /**
     * set modified
     *
     * @param modified
     */
    public ListDomainItem modified(String modified) {
        this.modified = modified;
        return this;
    }

    /**
     * set status
     *
     * @param status
     */
    public ListDomainItem status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set type
     *
     * @param type
     */
    public ListDomainItem type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set auditStatus
     *
     * @param auditStatus
     */
    public ListDomainItem auditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }


}