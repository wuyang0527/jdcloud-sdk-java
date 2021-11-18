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
 * DNS Records for a Zone
 * Documentation for JDC StarShield DNS records
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.starshield.model.SRVdata;
import com.jdcloud.sdk.service.starshield.model.CAAdata;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建DNS记录
 */
public class CreateDNSRecordRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * DNS记录类型
     */
    private String ty_pe;

    /**
     * DNS记录名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * DNS记录内容
     * Required:true
     */
    @Required
    private String content;

    /**
     * DNS记录的生存时间。值为1是 &quot;自动&quot;。
     * Required:true
     */
    @Required
    private Number ttl;

    /**
     * 与一些记录如MX和SRV一起使用，以确定优先级。如果你没有为MX记录提供一个优先级，默认值为0将被设置。
     */
    private Number priority;

    /**
     * 是否利用星盾的性能和安全优势
     */
    private Boolean proxied;

    /**
     * srvData
     */
    private SRVdata srvData;

    /**
     * caaData
     */
    private CAAdata caaData;

    /**
     * zone_identifier
     * Required:true
     */
    @Required
    private String zone_identifier;


    /**
     * get DNS记录类型
     *
     * @return
     */
    public String getTy_pe() {
        return ty_pe;
    }

    /**
     * set DNS记录类型
     *
     * @param ty_pe
     */
    public void setTy_pe(String ty_pe) {
        this.ty_pe = ty_pe;
    }

    /**
     * get DNS记录名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set DNS记录名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get DNS记录内容
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set DNS记录内容
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * get DNS记录的生存时间。值为1是 &quot;自动&quot;。
     *
     * @return
     */
    public Number getTtl() {
        return ttl;
    }

    /**
     * set DNS记录的生存时间。值为1是 &quot;自动&quot;。
     *
     * @param ttl
     */
    public void setTtl(Number ttl) {
        this.ttl = ttl;
    }

    /**
     * get 与一些记录如MX和SRV一起使用，以确定优先级。如果你没有为MX记录提供一个优先级，默认值为0将被设置。
     *
     * @return
     */
    public Number getPriority() {
        return priority;
    }

    /**
     * set 与一些记录如MX和SRV一起使用，以确定优先级。如果你没有为MX记录提供一个优先级，默认值为0将被设置。
     *
     * @param priority
     */
    public void setPriority(Number priority) {
        this.priority = priority;
    }

    /**
     * get 是否利用星盾的性能和安全优势
     *
     * @return
     */
    public Boolean getProxied() {
        return proxied;
    }

    /**
     * set 是否利用星盾的性能和安全优势
     *
     * @param proxied
     */
    public void setProxied(Boolean proxied) {
        this.proxied = proxied;
    }

    /**
     * get srvData
     *
     * @return
     */
    public SRVdata getSrvData() {
        return srvData;
    }

    /**
     * set srvData
     *
     * @param srvData
     */
    public void setSrvData(SRVdata srvData) {
        this.srvData = srvData;
    }

    /**
     * get caaData
     *
     * @return
     */
    public CAAdata getCaaData() {
        return caaData;
    }

    /**
     * set caaData
     *
     * @param caaData
     */
    public void setCaaData(CAAdata caaData) {
        this.caaData = caaData;
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
     * set DNS记录类型
     *
     * @param ty_pe
     */
    public CreateDNSRecordRequest ty_pe(String ty_pe) {
        this.ty_pe = ty_pe;
        return this;
    }

    /**
     * set DNS记录名称
     *
     * @param name
     */
    public CreateDNSRecordRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set DNS记录内容
     *
     * @param content
     */
    public CreateDNSRecordRequest content(String content) {
        this.content = content;
        return this;
    }

    /**
     * set DNS记录的生存时间。值为1是 &quot;自动&quot;。
     *
     * @param ttl
     */
    public CreateDNSRecordRequest ttl(Number ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * set 与一些记录如MX和SRV一起使用，以确定优先级。如果你没有为MX记录提供一个优先级，默认值为0将被设置。
     *
     * @param priority
     */
    public CreateDNSRecordRequest priority(Number priority) {
        this.priority = priority;
        return this;
    }

    /**
     * set 是否利用星盾的性能和安全优势
     *
     * @param proxied
     */
    public CreateDNSRecordRequest proxied(Boolean proxied) {
        this.proxied = proxied;
        return this;
    }

    /**
     * set srvData
     *
     * @param srvData
     */
    public CreateDNSRecordRequest srvData(SRVdata srvData) {
        this.srvData = srvData;
        return this;
    }

    /**
     * set caaData
     *
     * @param caaData
     */
    public CreateDNSRecordRequest caaData(CAAdata caaData) {
        this.caaData = caaData;
        return this;
    }

    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public CreateDNSRecordRequest zone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
        return this;
    }


}