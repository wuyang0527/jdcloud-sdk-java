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
 * Instance Interface
 * Instance Interface
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbaudit.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改数据库审计实例名称和描述
 */
public class ModifyInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例名称
     */
    private String insName;

    /**
     * 实例描述
     */
    private String insDesc;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 审计实例ID
     * Required:true
     */
    @Required
    private String insId;


    /**
     * get 实例名称
     *
     * @return
     */
    public String getInsName() {
        return insName;
    }

    /**
     * set 实例名称
     *
     * @param insName
     */
    public void setInsName(String insName) {
        this.insName = insName;
    }

    /**
     * get 实例描述
     *
     * @return
     */
    public String getInsDesc() {
        return insDesc;
    }

    /**
     * set 实例描述
     *
     * @param insDesc
     */
    public void setInsDesc(String insDesc) {
        this.insDesc = insDesc;
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
     * get 审计实例ID
     *
     * @return
     */
    public String getInsId() {
        return insId;
    }

    /**
     * set 审计实例ID
     *
     * @param insId
     */
    public void setInsId(String insId) {
        this.insId = insId;
    }


    /**
     * set 实例名称
     *
     * @param insName
     */
    public ModifyInstanceRequest insName(String insName) {
        this.insName = insName;
        return this;
    }

    /**
     * set 实例描述
     *
     * @param insDesc
     */
    public ModifyInstanceRequest insDesc(String insDesc) {
        this.insDesc = insDesc;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public ModifyInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 审计实例ID
     *
     * @param insId
     */
    public ModifyInstanceRequest insId(String insId) {
        this.insId = insId;
        return this;
    }


}