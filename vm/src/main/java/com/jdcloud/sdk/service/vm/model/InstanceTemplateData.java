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
 * instanceTemplateData
 */
public class InstanceTemplateData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例规格
     */
    private String instanceType;

    /**
     * 主网卡所属VPC的ID
     */
    private String vpcId;

    /**
     * 镜像ID
     */
    private String imageId;

    /**
     * 启动模板中是否包含自定义密码，true：包含密码，false：不包含密码
     */
    private Boolean includePassword;

    /**
     * 系统盘信息
     */
    private InstanceTemplateDiskAttachment systemDisk;

    /**
     * 数据盘信息，本地盘(local类型)做系统盘的云主机可挂载8块数据盘，云硬盘(cloud类型)做系统盘的云主机可挂载7块数据盘。
     */
    private List<InstanceTemplateDiskAttachment> dataDisks;

    /**
     * 主网卡信息
     */
    private InstanceTemplateNetworkInterfaceAttachmentSpec primaryNetworkInterface;

    /**
     * 主网卡主IP关联的弹性IP规格
     */
    private InstanceTemplateElasticIp elasticIp;

    /**
     * 密钥对名称；当前只支持一个
     */
    private List<String> keyNames;


    /**
     * get 实例规格
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例规格
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 主网卡所属VPC的ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 主网卡所属VPC的ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 镜像ID
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * get 启动模板中是否包含自定义密码，true：包含密码，false：不包含密码
     *
     * @return
     */
    public Boolean getIncludePassword() {
        return includePassword;
    }

    /**
     * set 启动模板中是否包含自定义密码，true：包含密码，false：不包含密码
     *
     * @param includePassword
     */
    public void setIncludePassword(Boolean includePassword) {
        this.includePassword = includePassword;
    }

    /**
     * get 系统盘信息
     *
     * @return
     */
    public InstanceTemplateDiskAttachment getSystemDisk() {
        return systemDisk;
    }

    /**
     * set 系统盘信息
     *
     * @param systemDisk
     */
    public void setSystemDisk(InstanceTemplateDiskAttachment systemDisk) {
        this.systemDisk = systemDisk;
    }

    /**
     * get 数据盘信息，本地盘(local类型)做系统盘的云主机可挂载8块数据盘，云硬盘(cloud类型)做系统盘的云主机可挂载7块数据盘。
     *
     * @return
     */
    public List<InstanceTemplateDiskAttachment> getDataDisks() {
        return dataDisks;
    }

    /**
     * set 数据盘信息，本地盘(local类型)做系统盘的云主机可挂载8块数据盘，云硬盘(cloud类型)做系统盘的云主机可挂载7块数据盘。
     *
     * @param dataDisks
     */
    public void setDataDisks(List<InstanceTemplateDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
    }

    /**
     * get 主网卡信息
     *
     * @return
     */
    public InstanceTemplateNetworkInterfaceAttachmentSpec getPrimaryNetworkInterface() {
        return primaryNetworkInterface;
    }

    /**
     * set 主网卡信息
     *
     * @param primaryNetworkInterface
     */
    public void setPrimaryNetworkInterface(InstanceTemplateNetworkInterfaceAttachmentSpec primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
    }

    /**
     * get 主网卡主IP关联的弹性IP规格
     *
     * @return
     */
    public InstanceTemplateElasticIp getElasticIp() {
        return elasticIp;
    }

    /**
     * set 主网卡主IP关联的弹性IP规格
     *
     * @param elasticIp
     */
    public void setElasticIp(InstanceTemplateElasticIp elasticIp) {
        this.elasticIp = elasticIp;
    }

    /**
     * get 密钥对名称；当前只支持一个
     *
     * @return
     */
    public List<String> getKeyNames() {
        return keyNames;
    }

    /**
     * set 密钥对名称；当前只支持一个
     *
     * @param keyNames
     */
    public void setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
    }


    /**
     * set 实例规格
     *
     * @param instanceType
     */
    public InstanceTemplateData instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 主网卡所属VPC的ID
     *
     * @param vpcId
     */
    public InstanceTemplateData vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public InstanceTemplateData imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * set 启动模板中是否包含自定义密码，true：包含密码，false：不包含密码
     *
     * @param includePassword
     */
    public InstanceTemplateData includePassword(Boolean includePassword) {
        this.includePassword = includePassword;
        return this;
    }

    /**
     * set 系统盘信息
     *
     * @param systemDisk
     */
    public InstanceTemplateData systemDisk(InstanceTemplateDiskAttachment systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }

    /**
     * set 数据盘信息，本地盘(local类型)做系统盘的云主机可挂载8块数据盘，云硬盘(cloud类型)做系统盘的云主机可挂载7块数据盘。
     *
     * @param dataDisks
     */
    public InstanceTemplateData dataDisks(List<InstanceTemplateDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * set 主网卡信息
     *
     * @param primaryNetworkInterface
     */
    public InstanceTemplateData primaryNetworkInterface(InstanceTemplateNetworkInterfaceAttachmentSpec primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
        return this;
    }

    /**
     * set 主网卡主IP关联的弹性IP规格
     *
     * @param elasticIp
     */
    public InstanceTemplateData elasticIp(InstanceTemplateElasticIp elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }

    /**
     * set 密钥对名称；当前只支持一个
     *
     * @param keyNames
     */
    public InstanceTemplateData keyNames(List<String> keyNames) {
        this.keyNames = keyNames;
        return this;
    }


    /**
     * add item to 数据盘信息，本地盘(local类型)做系统盘的云主机可挂载8块数据盘，云硬盘(cloud类型)做系统盘的云主机可挂载7块数据盘。
     *
     * @param dataDisk
     */
    public void addDataDisk(InstanceTemplateDiskAttachment dataDisk) {
        if (this.dataDisks == null) {
            this.dataDisks = new ArrayList<>();
        }
        this.dataDisks.add(dataDisk);
    }

    /**
     * add item to 密钥对名称；当前只支持一个
     *
     * @param keyName
     */
    public void addKeyName(String keyName) {
        if (this.keyNames == null) {
            this.keyNames = new ArrayList<>();
        }
        this.keyNames.add(keyName);
    }

}