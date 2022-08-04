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
 * 实例模板详细配置。
 */
public class InstanceTemplateData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例规格。
     */
    private String instanceType;

    /**
     * 主网卡所属VPC的ID。
     */
    private String vpcId;

    /**
     * 云主机使用的镜像ID。
     */
    private String imageId;

    /**
     * 实例模板中是否包含自定义密码。&#x60;true&#x60;：包含自定义密码，&#x60;false&#x60;：不包含自定义密码。
     */
    private Boolean includePassword;

    /**
     * 系统盘配置。
     */
    private InstanceTemplateDiskAttachment systemDisk;

    /**
     * 数据盘配置列表。
     */
    private List<InstanceTemplateDiskAttachment> dataDisks;

    /**
     * 主网卡配置。
     */
    private InstanceTemplateNetworkInterfaceAttachment primaryNetworkInterface;

    /**
     * 主网卡主IP关联的弹性公网IP配置。
     */
    private InstanceTemplateElasticIp elasticIp;

    /**
     * 云主机使用的密钥对名称。
     */
    private List<String> keyNames;

    /**
     * 停机不计费模式。该参数仅对按配置计费且系统盘为云硬盘的实例生效，并且不是专有宿主机中的实例。
&#x60;keepCharging&#x60;：关机后继续计费。
&#x60;stopCharging&#x60;：关机后停止计费。

     */
    private String chargeOnStopped;

    /**
     * 自动任务策略ID。
     */
    private String autoImagePolicyId;

    /**
     * 允许SSH密码登录。
&#x60;yes&#x60;：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。
仅在指定密钥时此参数有效，指定此参数后密码即使输入也将被忽略，同时会在系统内禁用SSH密码登录。

     */
    private String passwordAuth;

    /**
     * 使用镜像中的登录凭证，无须再指定密码或密钥（指定无效）。
&#x60;yes&#x60;：使用镜像登录凭证。
&#x60;no&#x60;：不使用镜像登录凭证。
仅使用私有或共享镜像时此参数有效。

     */
    private String imageInherit;

    /**
     * 突发型实例参数信息
     */
    private InstanceTemplateBurstInfo burstInfo;


    /**
     * get 实例规格。
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例规格。
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 主网卡所属VPC的ID。
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 主网卡所属VPC的ID。
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 云主机使用的镜像ID。
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 云主机使用的镜像ID。
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * get 实例模板中是否包含自定义密码。&#x60;true&#x60;：包含自定义密码，&#x60;false&#x60;：不包含自定义密码。
     *
     * @return
     */
    public Boolean getIncludePassword() {
        return includePassword;
    }

    /**
     * set 实例模板中是否包含自定义密码。&#x60;true&#x60;：包含自定义密码，&#x60;false&#x60;：不包含自定义密码。
     *
     * @param includePassword
     */
    public void setIncludePassword(Boolean includePassword) {
        this.includePassword = includePassword;
    }

    /**
     * get 系统盘配置。
     *
     * @return
     */
    public InstanceTemplateDiskAttachment getSystemDisk() {
        return systemDisk;
    }

    /**
     * set 系统盘配置。
     *
     * @param systemDisk
     */
    public void setSystemDisk(InstanceTemplateDiskAttachment systemDisk) {
        this.systemDisk = systemDisk;
    }

    /**
     * get 数据盘配置列表。
     *
     * @return
     */
    public List<InstanceTemplateDiskAttachment> getDataDisks() {
        return dataDisks;
    }

    /**
     * set 数据盘配置列表。
     *
     * @param dataDisks
     */
    public void setDataDisks(List<InstanceTemplateDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
    }

    /**
     * get 主网卡配置。
     *
     * @return
     */
    public InstanceTemplateNetworkInterfaceAttachment getPrimaryNetworkInterface() {
        return primaryNetworkInterface;
    }

    /**
     * set 主网卡配置。
     *
     * @param primaryNetworkInterface
     */
    public void setPrimaryNetworkInterface(InstanceTemplateNetworkInterfaceAttachment primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
    }

    /**
     * get 主网卡主IP关联的弹性公网IP配置。
     *
     * @return
     */
    public InstanceTemplateElasticIp getElasticIp() {
        return elasticIp;
    }

    /**
     * set 主网卡主IP关联的弹性公网IP配置。
     *
     * @param elasticIp
     */
    public void setElasticIp(InstanceTemplateElasticIp elasticIp) {
        this.elasticIp = elasticIp;
    }

    /**
     * get 云主机使用的密钥对名称。
     *
     * @return
     */
    public List<String> getKeyNames() {
        return keyNames;
    }

    /**
     * set 云主机使用的密钥对名称。
     *
     * @param keyNames
     */
    public void setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
    }

    /**
     * get 停机不计费模式。该参数仅对按配置计费且系统盘为云硬盘的实例生效，并且不是专有宿主机中的实例。
&#x60;keepCharging&#x60;：关机后继续计费。
&#x60;stopCharging&#x60;：关机后停止计费。

     *
     * @return
     */
    public String getChargeOnStopped() {
        return chargeOnStopped;
    }

    /**
     * set 停机不计费模式。该参数仅对按配置计费且系统盘为云硬盘的实例生效，并且不是专有宿主机中的实例。
&#x60;keepCharging&#x60;：关机后继续计费。
&#x60;stopCharging&#x60;：关机后停止计费。

     *
     * @param chargeOnStopped
     */
    public void setChargeOnStopped(String chargeOnStopped) {
        this.chargeOnStopped = chargeOnStopped;
    }

    /**
     * get 自动任务策略ID。
     *
     * @return
     */
    public String getAutoImagePolicyId() {
        return autoImagePolicyId;
    }

    /**
     * set 自动任务策略ID。
     *
     * @param autoImagePolicyId
     */
    public void setAutoImagePolicyId(String autoImagePolicyId) {
        this.autoImagePolicyId = autoImagePolicyId;
    }

    /**
     * get 允许SSH密码登录。
&#x60;yes&#x60;：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。
仅在指定密钥时此参数有效，指定此参数后密码即使输入也将被忽略，同时会在系统内禁用SSH密码登录。

     *
     * @return
     */
    public String getPasswordAuth() {
        return passwordAuth;
    }

    /**
     * set 允许SSH密码登录。
&#x60;yes&#x60;：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。
仅在指定密钥时此参数有效，指定此参数后密码即使输入也将被忽略，同时会在系统内禁用SSH密码登录。

     *
     * @param passwordAuth
     */
    public void setPasswordAuth(String passwordAuth) {
        this.passwordAuth = passwordAuth;
    }

    /**
     * get 使用镜像中的登录凭证，无须再指定密码或密钥（指定无效）。
&#x60;yes&#x60;：使用镜像登录凭证。
&#x60;no&#x60;：不使用镜像登录凭证。
仅使用私有或共享镜像时此参数有效。

     *
     * @return
     */
    public String getImageInherit() {
        return imageInherit;
    }

    /**
     * set 使用镜像中的登录凭证，无须再指定密码或密钥（指定无效）。
&#x60;yes&#x60;：使用镜像登录凭证。
&#x60;no&#x60;：不使用镜像登录凭证。
仅使用私有或共享镜像时此参数有效。

     *
     * @param imageInherit
     */
    public void setImageInherit(String imageInherit) {
        this.imageInherit = imageInherit;
    }

    /**
     * get 突发型实例参数信息
     *
     * @return
     */
    public InstanceTemplateBurstInfo getBurstInfo() {
        return burstInfo;
    }

    /**
     * set 突发型实例参数信息
     *
     * @param burstInfo
     */
    public void setBurstInfo(InstanceTemplateBurstInfo burstInfo) {
        this.burstInfo = burstInfo;
    }


    /**
     * set 实例规格。
     *
     * @param instanceType
     */
    public InstanceTemplateData instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 主网卡所属VPC的ID。
     *
     * @param vpcId
     */
    public InstanceTemplateData vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 云主机使用的镜像ID。
     *
     * @param imageId
     */
    public InstanceTemplateData imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * set 实例模板中是否包含自定义密码。&#x60;true&#x60;：包含自定义密码，&#x60;false&#x60;：不包含自定义密码。
     *
     * @param includePassword
     */
    public InstanceTemplateData includePassword(Boolean includePassword) {
        this.includePassword = includePassword;
        return this;
    }

    /**
     * set 系统盘配置。
     *
     * @param systemDisk
     */
    public InstanceTemplateData systemDisk(InstanceTemplateDiskAttachment systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }

    /**
     * set 数据盘配置列表。
     *
     * @param dataDisks
     */
    public InstanceTemplateData dataDisks(List<InstanceTemplateDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * set 主网卡配置。
     *
     * @param primaryNetworkInterface
     */
    public InstanceTemplateData primaryNetworkInterface(InstanceTemplateNetworkInterfaceAttachment primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
        return this;
    }

    /**
     * set 主网卡主IP关联的弹性公网IP配置。
     *
     * @param elasticIp
     */
    public InstanceTemplateData elasticIp(InstanceTemplateElasticIp elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }

    /**
     * set 云主机使用的密钥对名称。
     *
     * @param keyNames
     */
    public InstanceTemplateData keyNames(List<String> keyNames) {
        this.keyNames = keyNames;
        return this;
    }

    /**
     * set 停机不计费模式。该参数仅对按配置计费且系统盘为云硬盘的实例生效，并且不是专有宿主机中的实例。
&#x60;keepCharging&#x60;：关机后继续计费。
&#x60;stopCharging&#x60;：关机后停止计费。

     *
     * @param chargeOnStopped
     */
    public InstanceTemplateData chargeOnStopped(String chargeOnStopped) {
        this.chargeOnStopped = chargeOnStopped;
        return this;
    }

    /**
     * set 自动任务策略ID。
     *
     * @param autoImagePolicyId
     */
    public InstanceTemplateData autoImagePolicyId(String autoImagePolicyId) {
        this.autoImagePolicyId = autoImagePolicyId;
        return this;
    }

    /**
     * set 允许SSH密码登录。
&#x60;yes&#x60;：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。
仅在指定密钥时此参数有效，指定此参数后密码即使输入也将被忽略，同时会在系统内禁用SSH密码登录。

     *
     * @param passwordAuth
     */
    public InstanceTemplateData passwordAuth(String passwordAuth) {
        this.passwordAuth = passwordAuth;
        return this;
    }

    /**
     * set 使用镜像中的登录凭证，无须再指定密码或密钥（指定无效）。
&#x60;yes&#x60;：使用镜像登录凭证。
&#x60;no&#x60;：不使用镜像登录凭证。
仅使用私有或共享镜像时此参数有效。

     *
     * @param imageInherit
     */
    public InstanceTemplateData imageInherit(String imageInherit) {
        this.imageInherit = imageInherit;
        return this;
    }

    /**
     * set 突发型实例参数信息
     *
     * @param burstInfo
     */
    public InstanceTemplateData burstInfo(InstanceTemplateBurstInfo burstInfo) {
        this.burstInfo = burstInfo;
        return this;
    }


    /**
     * add item to 数据盘配置列表。
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
     * add item to 云主机使用的密钥对名称。
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