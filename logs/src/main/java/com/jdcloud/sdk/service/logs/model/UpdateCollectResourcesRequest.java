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
 * CollectInfo APIs
 * 采集配置的管理控制接口，采集实例的管理控制接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.logs.model.Resource;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 增量更新采集实例列表。更新的动作支持 add 、 remove
 */
public class UpdateCollectResourcesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * action
     * Required:true
     */
    @Required
    private String action;

    /**
     * 采集实例列表（系统日志存在上限限制）
     */
    
    private List<Resource> resources;
    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 采集配置 UID
     * Required:true
     */
    @Required
    private String collectInfoUID;



    /**
     * get action
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set action
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }


    /**
    * get 采集实例列表（系统日志存在上限限制）
    *
    * @return
    */
    public List<Resource> getResources() {
        return resources;
    }

    /**
    * set 采集实例列表（系统日志存在上限限制）
    *
    * @param resources
    */
    public void setResources(List<Resource> resources) {
        this.resources = resources;
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
     * get 采集配置 UID
     *
     * @return
     */
    public String getCollectInfoUID() {
        return collectInfoUID;
    }

    /**
     * set 采集配置 UID
     *
     * @param collectInfoUID
     */
    public void setCollectInfoUID(String collectInfoUID) {
        this.collectInfoUID = collectInfoUID;
    }



    /**
     * set action
     *
     * @param action
     */
    public UpdateCollectResourcesRequest action(String action) {
        this.action = action;
        return this;
    }


    /**
    * set 采集实例列表（系统日志存在上限限制）
    *
    * @param resources
    */
    public UpdateCollectResourcesRequest resources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }


    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public UpdateCollectResourcesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 采集配置 UID
     *
     * @param collectInfoUID
     */
    public UpdateCollectResourcesRequest collectInfoUID(String collectInfoUID) {
        this.collectInfoUID = collectInfoUID;
        return this;
    }



    /**
     * add item to 采集实例列表（系统日志存在上限限制）
     *
     * @param resource
     */
    public void addResource(Resource resource) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resource);
    }
}