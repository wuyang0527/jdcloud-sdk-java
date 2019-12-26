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
 * Security-Group
 * 安全组相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改安全组属性
 */
public class ModifyNetworkSecurityGroupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 安全组的名字。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     */
    private String networkSecurityGroupName;

    /**
     * 安全组的描述，取值范围：0-256个UTF-8编码下的全部字符
     */
    private String description;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * NetworkSecurityGroup ID
     * Required:true
     */
    @Required
    private String networkSecurityGroupId;


    /**
     * get 安全组的名字。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @return
     */
    public String getNetworkSecurityGroupName() {
        return networkSecurityGroupName;
    }

    /**
     * set 安全组的名字。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param networkSecurityGroupName
     */
    public void setNetworkSecurityGroupName(String networkSecurityGroupName) {
        this.networkSecurityGroupName = networkSecurityGroupName;
    }

    /**
     * get 安全组的描述，取值范围：0-256个UTF-8编码下的全部字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 安全组的描述，取值范围：0-256个UTF-8编码下的全部字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get NetworkSecurityGroup ID
     *
     * @return
     */
    public String getNetworkSecurityGroupId() {
        return networkSecurityGroupId;
    }

    /**
     * set NetworkSecurityGroup ID
     *
     * @param networkSecurityGroupId
     */
    public void setNetworkSecurityGroupId(String networkSecurityGroupId) {
        this.networkSecurityGroupId = networkSecurityGroupId;
    }


    /**
     * set 安全组的名字。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param networkSecurityGroupName
     */
    public ModifyNetworkSecurityGroupRequest networkSecurityGroupName(String networkSecurityGroupName) {
        this.networkSecurityGroupName = networkSecurityGroupName;
        return this;
    }

    /**
     * set 安全组的描述，取值范围：0-256个UTF-8编码下的全部字符
     *
     * @param description
     */
    public ModifyNetworkSecurityGroupRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyNetworkSecurityGroupRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set NetworkSecurityGroup ID
     *
     * @param networkSecurityGroupId
     */
    public ModifyNetworkSecurityGroupRequest networkSecurityGroupId(String networkSecurityGroupId) {
        this.networkSecurityGroupId = networkSecurityGroupId;
        return this;
    }


}