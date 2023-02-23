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
 * Instance-Reporting
 * 实例级报表
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 按域名的TopK总流量。查询范围最近6个月、查询最大跨度1个月。
 */
public class TrafficTopKRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * all - 所有
normal - 业务
mitigation - 缓解
cache - 缓存
origin - 回源

     * Required:true
     */
    @Required
    private String queryMode;

    /**
     * 查询开始时间
     * Required:true
     */
    @Required
    private String since;

    /**
     * 查询结束时间
     * Required:true
     */
    @Required
    private String until;

    /**
     * 实例标识
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get all - 所有
normal - 业务
mitigation - 缓解
cache - 缓存
origin - 回源

     *
     * @return
     */
    public String getQueryMode() {
        return queryMode;
    }

    /**
     * set all - 所有
normal - 业务
mitigation - 缓解
cache - 缓存
origin - 回源

     *
     * @param queryMode
     */
    public void setQueryMode(String queryMode) {
        this.queryMode = queryMode;
    }


    /**
     * get 查询开始时间
     *
     * @return
     */
    public String getSince() {
        return since;
    }

    /**
     * set 查询开始时间
     *
     * @param since
     */
    public void setSince(String since) {
        this.since = since;
    }


    /**
     * get 查询结束时间
     *
     * @return
     */
    public String getUntil() {
        return until;
    }

    /**
     * set 查询结束时间
     *
     * @param until
     */
    public void setUntil(String until) {
        this.until = until;
    }


    /**
     * get 实例标识
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例标识
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set all - 所有
normal - 业务
mitigation - 缓解
cache - 缓存
origin - 回源

     *
     * @param queryMode
     */
    public TrafficTopKRequest queryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }


    /**
     * set 查询开始时间
     *
     * @param since
     */
    public TrafficTopKRequest since(String since) {
        this.since = since;
        return this;
    }


    /**
     * set 查询结束时间
     *
     * @param until
     */
    public TrafficTopKRequest until(String until) {
        this.until = until;
        return this;
    }


    /**
     * set 实例标识
     *
     * @param instanceId
     */
    public TrafficTopKRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}