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
 * Logtopic APIs
 * 日志服务日志主题相关的管理控制接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 更新日志主题。日志主题名称不可更新。
 */
public class UpdateLogtopicRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志主题名称
     */
    private String name;

    /**
     * 日志主题描述
     * Required:true
     */
    @Required
    private String description;

    /**
     * 保存周期，只能是 7， 15， 30
     */
    private Long lifeCycle;

    /**
     * 保序
     */
    private Boolean inOrder;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 日志主题 UID
     * Required:true
     */
    @Required
    private String logtopicUID;



    /**
     * get 日志主题名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 日志主题名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 日志主题描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 日志主题描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 保存周期，只能是 7， 15， 30
     *
     * @return
     */
    public Long getLifeCycle() {
        return lifeCycle;
    }

    /**
     * set 保存周期，只能是 7， 15， 30
     *
     * @param lifeCycle
     */
    public void setLifeCycle(Long lifeCycle) {
        this.lifeCycle = lifeCycle;
    }


    /**
     * get 保序
     *
     * @return
     */
    public Boolean getInOrder() {
        return inOrder;
    }

    /**
     * set 保序
     *
     * @param inOrder
     */
    public void setInOrder(Boolean inOrder) {
        this.inOrder = inOrder;
    }


    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 日志主题 UID
     *
     * @return
     */
    public String getLogtopicUID() {
        return logtopicUID;
    }

    /**
     * set 日志主题 UID
     *
     * @param logtopicUID
     */
    public void setLogtopicUID(String logtopicUID) {
        this.logtopicUID = logtopicUID;
    }



    /**
     * set 日志主题名称
     *
     * @param name
     */
    public UpdateLogtopicRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 日志主题描述
     *
     * @param description
     */
    public UpdateLogtopicRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 保存周期，只能是 7， 15， 30
     *
     * @param lifeCycle
     */
    public UpdateLogtopicRequest lifeCycle(Long lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }


    /**
     * set 保序
     *
     * @param inOrder
     */
    public UpdateLogtopicRequest inOrder(Boolean inOrder) {
        this.inOrder = inOrder;
        return this;
    }


    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public UpdateLogtopicRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 日志主题 UID
     *
     * @param logtopicUID
     */
    public UpdateLogtopicRequest logtopicUID(String logtopicUID) {
        this.logtopicUID = logtopicUID;
        return this;
    }


}