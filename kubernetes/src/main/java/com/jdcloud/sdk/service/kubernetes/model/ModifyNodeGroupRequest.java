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
 * NodeGroup
 * 工作节点组相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kubernetes.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改工作节点组的 名称 和 描述&lt;br&gt;name 和 description 必须要指定一个
 */
public class ModifyNodeGroupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工作节点组名称
     */
    private String name;

    /**
     * 工作节点组描述
     */
    private String description;

    /**
     * 地域 ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 工作节点组 ID
     * Required:true
     */
    @Required
    private String nodeGroupId;



    /**
     * get 工作节点组名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 工作节点组名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 工作节点组描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 工作节点组描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 地域 ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 工作节点组 ID
     *
     * @return
     */
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    /**
     * set 工作节点组 ID
     *
     * @param nodeGroupId
     */
    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }



    /**
     * set 工作节点组名称
     *
     * @param name
     */
    public ModifyNodeGroupRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 工作节点组描述
     *
     * @param description
     */
    public ModifyNodeGroupRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public ModifyNodeGroupRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 工作节点组 ID
     *
     * @param nodeGroupId
     */
    public ModifyNodeGroupRequest nodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }


}