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

package com.jdcloud.sdk.service.kubernetes.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 工作节点配置信息
 */
public class NodeConfig  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例类型
     */
    private String instanceType;

    /**
     * 镜像信息
     */
    private String imageId;

    /**
     * 云主机SSH密钥对名称
     */
    
    private List<String> keyNames;
    /**
     * 云主机磁盘类型
     */
    private String systemDiskCategory;

    /**
     * 云主机云盘系统盘大小  单位(GB)
     */
    private Integer systemDiskSize;

    /**
     * 云主机云盘系统盘类型
     */
    private String systemDiskType;

    /**
     * 云主机云盘 iops，仅限 ssd 类型云盘有效
     */
    private Integer systemDiskIops;

    /**
     * 工作节点组标签
     */
    
    private List<LabelSpec> labels;
    /**
     * 云主机脚本，目前支持启动脚本，key为launch-script。
     */
    
    private List<UserScriptSpec> userScripts;
    /**
     * 数据盘配置信息
     */
    
    private List<DataDiskSpec> dataDiskSpec;
    /**
     * 数据盘配置信息
     */
    private DiskSpec systemDiskSpec;

    /**
     * 工作节点组的安全组配置，为空则使用默认安全组
     */
    private String securityGroup;



    /**
     * get 实例类型
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类型
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }


    /**
     * get 镜像信息
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像信息
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }


    /**
    * get 云主机SSH密钥对名称
    *
    * @return
    */
    public List<String> getKeyNames() {
        return keyNames;
    }

    /**
    * set 云主机SSH密钥对名称
    *
    * @param keyNames
    */
    public void setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
    }


    /**
     * get 云主机磁盘类型
     *
     * @return
     */
    public String getSystemDiskCategory() {
        return systemDiskCategory;
    }

    /**
     * set 云主机磁盘类型
     *
     * @param systemDiskCategory
     */
    public void setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
    }


    /**
     * get 云主机云盘系统盘大小  单位(GB)
     *
     * @return
     */
    public Integer getSystemDiskSize() {
        return systemDiskSize;
    }

    /**
     * set 云主机云盘系统盘大小  单位(GB)
     *
     * @param systemDiskSize
     */
    public void setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
    }


    /**
     * get 云主机云盘系统盘类型
     *
     * @return
     */
    public String getSystemDiskType() {
        return systemDiskType;
    }

    /**
     * set 云主机云盘系统盘类型
     *
     * @param systemDiskType
     */
    public void setSystemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
    }


    /**
     * get 云主机云盘 iops，仅限 ssd 类型云盘有效
     *
     * @return
     */
    public Integer getSystemDiskIops() {
        return systemDiskIops;
    }

    /**
     * set 云主机云盘 iops，仅限 ssd 类型云盘有效
     *
     * @param systemDiskIops
     */
    public void setSystemDiskIops(Integer systemDiskIops) {
        this.systemDiskIops = systemDiskIops;
    }


    /**
    * get 工作节点组标签
    *
    * @return
    */
    public List<LabelSpec> getLabels() {
        return labels;
    }

    /**
    * set 工作节点组标签
    *
    * @param labels
    */
    public void setLabels(List<LabelSpec> labels) {
        this.labels = labels;
    }


    /**
    * get 云主机脚本，目前支持启动脚本，key为launch-script。
    *
    * @return
    */
    public List<UserScriptSpec> getUserScripts() {
        return userScripts;
    }

    /**
    * set 云主机脚本，目前支持启动脚本，key为launch-script。
    *
    * @param userScripts
    */
    public void setUserScripts(List<UserScriptSpec> userScripts) {
        this.userScripts = userScripts;
    }


    /**
    * get 数据盘配置信息
    *
    * @return
    */
    public List<DataDiskSpec> getDataDiskSpec() {
        return dataDiskSpec;
    }

    /**
    * set 数据盘配置信息
    *
    * @param dataDiskSpec
    */
    public void setDataDiskSpec(List<DataDiskSpec> dataDiskSpec) {
        this.dataDiskSpec = dataDiskSpec;
    }


    /**
     * get 数据盘配置信息
     *
     * @return
     */
    public DiskSpec getSystemDiskSpec() {
        return systemDiskSpec;
    }

    /**
     * set 数据盘配置信息
     *
     * @param systemDiskSpec
     */
    public void setSystemDiskSpec(DiskSpec systemDiskSpec) {
        this.systemDiskSpec = systemDiskSpec;
    }


    /**
     * get 工作节点组的安全组配置，为空则使用默认安全组
     *
     * @return
     */
    public String getSecurityGroup() {
        return securityGroup;
    }

    /**
     * set 工作节点组的安全组配置，为空则使用默认安全组
     *
     * @param securityGroup
     */
    public void setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
    }



    /**
     * set 实例类型
     *
     * @param instanceType
     */
    public NodeConfig instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }


    /**
     * set 镜像信息
     *
     * @param imageId
     */
    public NodeConfig imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }


    /**
    * set 云主机SSH密钥对名称
    *
    * @param keyNames
    */
    public NodeConfig keyNames(List<String> keyNames) {
        this.keyNames = keyNames;
        return this;
    }


    /**
     * set 云主机磁盘类型
     *
     * @param systemDiskCategory
     */
    public NodeConfig systemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }


    /**
     * set 云主机云盘系统盘大小  单位(GB)
     *
     * @param systemDiskSize
     */
    public NodeConfig systemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }


    /**
     * set 云主机云盘系统盘类型
     *
     * @param systemDiskType
     */
    public NodeConfig systemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }


    /**
     * set 云主机云盘 iops，仅限 ssd 类型云盘有效
     *
     * @param systemDiskIops
     */
    public NodeConfig systemDiskIops(Integer systemDiskIops) {
        this.systemDiskIops = systemDiskIops;
        return this;
    }


    /**
    * set 工作节点组标签
    *
    * @param labels
    */
    public NodeConfig labels(List<LabelSpec> labels) {
        this.labels = labels;
        return this;
    }


    /**
    * set 云主机脚本，目前支持启动脚本，key为launch-script。
    *
    * @param userScripts
    */
    public NodeConfig userScripts(List<UserScriptSpec> userScripts) {
        this.userScripts = userScripts;
        return this;
    }


    /**
    * set 数据盘配置信息
    *
    * @param dataDiskSpec
    */
    public NodeConfig dataDiskSpec(List<DataDiskSpec> dataDiskSpec) {
        this.dataDiskSpec = dataDiskSpec;
        return this;
    }


    /**
     * set 数据盘配置信息
     *
     * @param systemDiskSpec
     */
    public NodeConfig systemDiskSpec(DiskSpec systemDiskSpec) {
        this.systemDiskSpec = systemDiskSpec;
        return this;
    }


    /**
     * set 工作节点组的安全组配置，为空则使用默认安全组
     *
     * @param securityGroup
     */
    public NodeConfig securityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }



    /**
     * add item to 云主机SSH密钥对名称
     *
     * @param keyName
     */
    public void addKeyName(String keyName) {
        if (this.keyNames == null) {
            this.keyNames = new ArrayList<>();
        }
        this.keyNames.add(keyName);
    }

    /**
     * add item to 工作节点组标签
     *
     * @param label
     */
    public void addLabel(LabelSpec label) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(label);
    }

    /**
     * add item to 云主机脚本，目前支持启动脚本，key为launch-script。
     *
     * @param userScript
     */
    public void addUserScript(UserScriptSpec userScript) {
        if (this.userScripts == null) {
            this.userScripts = new ArrayList<>();
        }
        this.userScripts.add(userScript);
    }

    /**
     * add item to 数据盘配置信息
     *
     * @param dataDiskSpec
     */
    public void addDataDiskSpec(DataDiskSpec dataDiskSpec) {
        if (this.dataDiskSpec == null) {
            this.dataDiskSpec = new ArrayList<>();
        }
        this.dataDiskSpec.add(dataDiskSpec);
    }
}