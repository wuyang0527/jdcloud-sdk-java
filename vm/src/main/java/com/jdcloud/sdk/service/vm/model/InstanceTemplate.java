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

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 实例模板信息。
 */
public class InstanceTemplate  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例模板ID
     */
    private String id;

    /**
     * 实例模板名称。
     */
    private String name;

    /**
     * 实例模板描述。
     */
    private String description;

    /**
     * 实例模板详细配置。
     */
    private InstanceTemplateData instanceTemplateData;

    /**
     * 关联的高可用组(ag)信息。
     */
    private List<Ag> ags;

    /**
     * 实例模板创建时间。
     */
    private String createdTime;


    /**
     * get 实例模板ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 实例模板ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 实例模板名称。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 实例模板名称。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 实例模板描述。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 实例模板描述。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 实例模板详细配置。
     *
     * @return
     */
    public InstanceTemplateData getInstanceTemplateData() {
        return instanceTemplateData;
    }

    /**
     * set 实例模板详细配置。
     *
     * @param instanceTemplateData
     */
    public void setInstanceTemplateData(InstanceTemplateData instanceTemplateData) {
        this.instanceTemplateData = instanceTemplateData;
    }

    /**
     * get 关联的高可用组(ag)信息。
     *
     * @return
     */
    public List<Ag> getAgs() {
        return ags;
    }

    /**
     * set 关联的高可用组(ag)信息。
     *
     * @param ags
     */
    public void setAgs(List<Ag> ags) {
        this.ags = ags;
    }

    /**
     * get 实例模板创建时间。
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 实例模板创建时间。
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * set 实例模板ID
     *
     * @param id
     */
    public InstanceTemplate id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 实例模板名称。
     *
     * @param name
     */
    public InstanceTemplate name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 实例模板描述。
     *
     * @param description
     */
    public InstanceTemplate description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 实例模板详细配置。
     *
     * @param instanceTemplateData
     */
    public InstanceTemplate instanceTemplateData(InstanceTemplateData instanceTemplateData) {
        this.instanceTemplateData = instanceTemplateData;
        return this;
    }

    /**
     * set 关联的高可用组(ag)信息。
     *
     * @param ags
     */
    public InstanceTemplate ags(List<Ag> ags) {
        this.ags = ags;
        return this;
    }

    /**
     * set 实例模板创建时间。
     *
     * @param createdTime
     */
    public InstanceTemplate createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


    /**
     * add item to 关联的高可用组(ag)信息。
     *
     * @param ag
     */
    public void addAg(Ag ag) {
        if (this.ags == null) {
            this.ags = new ArrayList<>();
        }
        this.ags.add(ag);
    }

}