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
import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * 云主机实例信息。
 */
public class Instance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云主机ID。
     */
    private String instanceId;

    /**
     * 云主机名称。
     */
    private String instanceName;

    /**
     * 云主机hostname。
     */
    private String hostname;

    /**
     * 实例规格。
     */
    private String instanceType;

    /**
     * 主网卡所属VPC的ID。
     */
    private String vpcId;

    /**
     * 主网卡所属子网的ID。
     */
    private String subnetId;

    /**
     * 主网卡主内网IP地址。
     */
    private String privateIpAddress;

    /**
     * 主网卡主IP绑定弹性IP的ID。
     */
    private String elasticIpId;

    /**
     * 主网卡主IP绑定弹性IP的地址。
     */
    private String elasticIpAddress;

    /**
     * 云主机状态，参考 [云主机状态](https://docs.jdcloud.com/virtual-machines/api/vm_status)。
     */
    private String status;

    /**
     * 云主机描述。
     */
    private String description;

    /**
     * 云主机使用的镜像ID。
     */
    private String imageId;

    /**
     * 系统盘配置。
     */
    private InstanceDiskAttachment systemDisk;

    /**
     * 数据盘配置列表。
     */
    
    private List<InstanceDiskAttachment> dataDisks;
    /**
     * 主网卡主IP关联的弹性公网IP配置。
     */
    private InstanceNetworkInterfaceAttachment primaryNetworkInterface;

    /**
     * 辅助网卡配置列表。
     */
    
    private List<InstanceNetworkInterfaceAttachment> secondaryNetworkInterfaces;
    /**
     * RDMA网卡配置列表。
     */
    
    private List<RdmaNetworkInterface> rdmaNetworkInterfaces;
    /**
     * 云主机实例的创建时间。
     */
    private String launchTime;

    /**
     * 云主机所在可用区。
     */
    private String az;

    /**
     * 云主机使用的密钥对名称。
     */
    
    private List<String> keyNames;
    /**
     * 云主机的计费信息。
     */
    private Charge charge;

    /**
     * 云主机使用镜像的计费配置与信息。
     */
    private ImageCharge imageCharge;

    /**
     * 抢占实例状态机
     */
    private String spotStatus;

    /**
     * 云主机关联的高可用组，如果创建云主机使用了高可用组，此处可展示高可用组名称。
     */
    private Ag ag;

    /**
     * 高可用组中的错误域。
     */
    private String faultDomain;

    /**
     * Tag信息。
     */
    
    private List<Tag> tags;
    /**
     * 停机不计费模式。该参数仅对按配置计费且系统盘为云硬盘的实例生效，并且不是专有宿主机中的实例。
&#x60;keepCharging&#x60;：关机后继续计费。
&#x60;stopCharging&#x60;：关机后停止计费。

     */
    private String chargeOnStopped;

    /**
     * 自动任务策略，关联了自动任务策略时可获取相应信息。
     */
    
    private List<Policy> policies;
    /**
     * 云主机所属的专有宿主机池。
     */
    private String dedicatedPoolId;

    /**
     * 云主机所属的专有宿主机ID。
     */
    private String dedicatedHostId;

    /**
     * 突发型实例参数信息
     */
    private BurstInfo burstInfo;

    /**
     * 资源组ID
     */
    private String resourceGroupId;

    /**
     * 云主机操作系统类型，如linux或者windows
     */
    private String osType;

    /**
     * 虚机CPU拓扑
     */
    private CpuTopology cpuTopology;

    /**
     * 云主机操作系统版本，如7.6
     */
    private String osVersion;

    /**
     * 具体操作系统CentOS
     */
    private String platform;

    /**
     * 架构信息，如x86_64
     */
    private String architecture;

    /**
     * 主机组详情
     */
    private HostGroup hostGroup;

    /**
     * 定时删除时间，例如:&quot;2025-01-01 00:00:00&quot;
     */
    private String autoReleaseTime;

    /**
     * 启动模式，支持 bios uefi
     */
    private String bootMode;



    /**
     * get 云主机ID。
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机ID。
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get 云主机名称。
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 云主机名称。
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }


    /**
     * get 云主机hostname。
     *
     * @return
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * set 云主机hostname。
     *
     * @param hostname
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }


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
     * get 主网卡所属子网的ID。
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 主网卡所属子网的ID。
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }


    /**
     * get 主网卡主内网IP地址。
     *
     * @return
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * set 主网卡主内网IP地址。
     *
     * @param privateIpAddress
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }


    /**
     * get 主网卡主IP绑定弹性IP的ID。
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set 主网卡主IP绑定弹性IP的ID。
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
    }


    /**
     * get 主网卡主IP绑定弹性IP的地址。
     *
     * @return
     */
    public String getElasticIpAddress() {
        return elasticIpAddress;
    }

    /**
     * set 主网卡主IP绑定弹性IP的地址。
     *
     * @param elasticIpAddress
     */
    public void setElasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
    }


    /**
     * get 云主机状态，参考 [云主机状态](https://docs.jdcloud.com/virtual-machines/api/vm_status)。
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 云主机状态，参考 [云主机状态](https://docs.jdcloud.com/virtual-machines/api/vm_status)。
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 云主机描述。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 云主机描述。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * get 系统盘配置。
     *
     * @return
     */
    public InstanceDiskAttachment getSystemDisk() {
        return systemDisk;
    }

    /**
     * set 系统盘配置。
     *
     * @param systemDisk
     */
    public void setSystemDisk(InstanceDiskAttachment systemDisk) {
        this.systemDisk = systemDisk;
    }


    /**
    * get 数据盘配置列表。
    *
    * @return
    */
    public List<InstanceDiskAttachment> getDataDisks() {
        return dataDisks;
    }

    /**
    * set 数据盘配置列表。
    *
    * @param dataDisks
    */
    public void setDataDisks(List<InstanceDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
    }


    /**
     * get 主网卡主IP关联的弹性公网IP配置。
     *
     * @return
     */
    public InstanceNetworkInterfaceAttachment getPrimaryNetworkInterface() {
        return primaryNetworkInterface;
    }

    /**
     * set 主网卡主IP关联的弹性公网IP配置。
     *
     * @param primaryNetworkInterface
     */
    public void setPrimaryNetworkInterface(InstanceNetworkInterfaceAttachment primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
    }


    /**
    * get 辅助网卡配置列表。
    *
    * @return
    */
    public List<InstanceNetworkInterfaceAttachment> getSecondaryNetworkInterfaces() {
        return secondaryNetworkInterfaces;
    }

    /**
    * set 辅助网卡配置列表。
    *
    * @param secondaryNetworkInterfaces
    */
    public void setSecondaryNetworkInterfaces(List<InstanceNetworkInterfaceAttachment> secondaryNetworkInterfaces) {
        this.secondaryNetworkInterfaces = secondaryNetworkInterfaces;
    }


    /**
    * get RDMA网卡配置列表。
    *
    * @return
    */
    public List<RdmaNetworkInterface> getRdmaNetworkInterfaces() {
        return rdmaNetworkInterfaces;
    }

    /**
    * set RDMA网卡配置列表。
    *
    * @param rdmaNetworkInterfaces
    */
    public void setRdmaNetworkInterfaces(List<RdmaNetworkInterface> rdmaNetworkInterfaces) {
        this.rdmaNetworkInterfaces = rdmaNetworkInterfaces;
    }


    /**
     * get 云主机实例的创建时间。
     *
     * @return
     */
    public String getLaunchTime() {
        return launchTime;
    }

    /**
     * set 云主机实例的创建时间。
     *
     * @param launchTime
     */
    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }


    /**
     * get 云主机所在可用区。
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 云主机所在可用区。
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
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
     * get 云主机的计费信息。
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 云主机的计费信息。
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }


    /**
     * get 云主机使用镜像的计费配置与信息。
     *
     * @return
     */
    public ImageCharge getImageCharge() {
        return imageCharge;
    }

    /**
     * set 云主机使用镜像的计费配置与信息。
     *
     * @param imageCharge
     */
    public void setImageCharge(ImageCharge imageCharge) {
        this.imageCharge = imageCharge;
    }


    /**
     * get 抢占实例状态机
     *
     * @return
     */
    public String getSpotStatus() {
        return spotStatus;
    }

    /**
     * set 抢占实例状态机
     *
     * @param spotStatus
     */
    public void setSpotStatus(String spotStatus) {
        this.spotStatus = spotStatus;
    }


    /**
     * get 云主机关联的高可用组，如果创建云主机使用了高可用组，此处可展示高可用组名称。
     *
     * @return
     */
    public Ag getAg() {
        return ag;
    }

    /**
     * set 云主机关联的高可用组，如果创建云主机使用了高可用组，此处可展示高可用组名称。
     *
     * @param ag
     */
    public void setAg(Ag ag) {
        this.ag = ag;
    }


    /**
     * get 高可用组中的错误域。
     *
     * @return
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * set 高可用组中的错误域。
     *
     * @param faultDomain
     */
    public void setFaultDomain(String faultDomain) {
        this.faultDomain = faultDomain;
    }


    /**
    * get Tag信息。
    *
    * @return
    */
    public List<Tag> getTags() {
        return tags;
    }

    /**
    * set Tag信息。
    *
    * @param tags
    */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
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
    * get 自动任务策略，关联了自动任务策略时可获取相应信息。
    *
    * @return
    */
    public List<Policy> getPolicies() {
        return policies;
    }

    /**
    * set 自动任务策略，关联了自动任务策略时可获取相应信息。
    *
    * @param policies
    */
    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }


    /**
     * get 云主机所属的专有宿主机池。
     *
     * @return
     */
    public String getDedicatedPoolId() {
        return dedicatedPoolId;
    }

    /**
     * set 云主机所属的专有宿主机池。
     *
     * @param dedicatedPoolId
     */
    public void setDedicatedPoolId(String dedicatedPoolId) {
        this.dedicatedPoolId = dedicatedPoolId;
    }


    /**
     * get 云主机所属的专有宿主机ID。
     *
     * @return
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    /**
     * set 云主机所属的专有宿主机ID。
     *
     * @param dedicatedHostId
     */
    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }


    /**
     * get 突发型实例参数信息
     *
     * @return
     */
    public BurstInfo getBurstInfo() {
        return burstInfo;
    }

    /**
     * set 突发型实例参数信息
     *
     * @param burstInfo
     */
    public void setBurstInfo(BurstInfo burstInfo) {
        this.burstInfo = burstInfo;
    }


    /**
     * get 资源组ID
     *
     * @return
     */
    public String getResourceGroupId() {
        return resourceGroupId;
    }

    /**
     * set 资源组ID
     *
     * @param resourceGroupId
     */
    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }


    /**
     * get 云主机操作系统类型，如linux或者windows
     *
     * @return
     */
    public String getOsType() {
        return osType;
    }

    /**
     * set 云主机操作系统类型，如linux或者windows
     *
     * @param osType
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }


    /**
     * get 虚机CPU拓扑
     *
     * @return
     */
    public CpuTopology getCpuTopology() {
        return cpuTopology;
    }

    /**
     * set 虚机CPU拓扑
     *
     * @param cpuTopology
     */
    public void setCpuTopology(CpuTopology cpuTopology) {
        this.cpuTopology = cpuTopology;
    }


    /**
     * get 云主机操作系统版本，如7.6
     *
     * @return
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * set 云主机操作系统版本，如7.6
     *
     * @param osVersion
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }


    /**
     * get 具体操作系统CentOS
     *
     * @return
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * set 具体操作系统CentOS
     *
     * @param platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }


    /**
     * get 架构信息，如x86_64
     *
     * @return
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * set 架构信息，如x86_64
     *
     * @param architecture
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }


    /**
     * get 主机组详情
     *
     * @return
     */
    public HostGroup getHostGroup() {
        return hostGroup;
    }

    /**
     * set 主机组详情
     *
     * @param hostGroup
     */
    public void setHostGroup(HostGroup hostGroup) {
        this.hostGroup = hostGroup;
    }


    /**
     * get 定时删除时间，例如:&quot;2025-01-01 00:00:00&quot;
     *
     * @return
     */
    public String getAutoReleaseTime() {
        return autoReleaseTime;
    }

    /**
     * set 定时删除时间，例如:&quot;2025-01-01 00:00:00&quot;
     *
     * @param autoReleaseTime
     */
    public void setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
    }


    /**
     * get 启动模式，支持 bios uefi
     *
     * @return
     */
    public String getBootMode() {
        return bootMode;
    }

    /**
     * set 启动模式，支持 bios uefi
     *
     * @param bootMode
     */
    public void setBootMode(String bootMode) {
        this.bootMode = bootMode;
    }



    /**
     * set 云主机ID。
     *
     * @param instanceId
     */
    public Instance instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set 云主机名称。
     *
     * @param instanceName
     */
    public Instance instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }


    /**
     * set 云主机hostname。
     *
     * @param hostname
     */
    public Instance hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }


    /**
     * set 实例规格。
     *
     * @param instanceType
     */
    public Instance instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }


    /**
     * set 主网卡所属VPC的ID。
     *
     * @param vpcId
     */
    public Instance vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }


    /**
     * set 主网卡所属子网的ID。
     *
     * @param subnetId
     */
    public Instance subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }


    /**
     * set 主网卡主内网IP地址。
     *
     * @param privateIpAddress
     */
    public Instance privateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }


    /**
     * set 主网卡主IP绑定弹性IP的ID。
     *
     * @param elasticIpId
     */
    public Instance elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }


    /**
     * set 主网卡主IP绑定弹性IP的地址。
     *
     * @param elasticIpAddress
     */
    public Instance elasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
        return this;
    }


    /**
     * set 云主机状态，参考 [云主机状态](https://docs.jdcloud.com/virtual-machines/api/vm_status)。
     *
     * @param status
     */
    public Instance status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 云主机描述。
     *
     * @param description
     */
    public Instance description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 云主机使用的镜像ID。
     *
     * @param imageId
     */
    public Instance imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }


    /**
     * set 系统盘配置。
     *
     * @param systemDisk
     */
    public Instance systemDisk(InstanceDiskAttachment systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }


    /**
    * set 数据盘配置列表。
    *
    * @param dataDisks
    */
    public Instance dataDisks(List<InstanceDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }


    /**
     * set 主网卡主IP关联的弹性公网IP配置。
     *
     * @param primaryNetworkInterface
     */
    public Instance primaryNetworkInterface(InstanceNetworkInterfaceAttachment primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
        return this;
    }


    /**
    * set 辅助网卡配置列表。
    *
    * @param secondaryNetworkInterfaces
    */
    public Instance secondaryNetworkInterfaces(List<InstanceNetworkInterfaceAttachment> secondaryNetworkInterfaces) {
        this.secondaryNetworkInterfaces = secondaryNetworkInterfaces;
        return this;
    }


    /**
    * set RDMA网卡配置列表。
    *
    * @param rdmaNetworkInterfaces
    */
    public Instance rdmaNetworkInterfaces(List<RdmaNetworkInterface> rdmaNetworkInterfaces) {
        this.rdmaNetworkInterfaces = rdmaNetworkInterfaces;
        return this;
    }


    /**
     * set 云主机实例的创建时间。
     *
     * @param launchTime
     */
    public Instance launchTime(String launchTime) {
        this.launchTime = launchTime;
        return this;
    }


    /**
     * set 云主机所在可用区。
     *
     * @param az
     */
    public Instance az(String az) {
        this.az = az;
        return this;
    }


    /**
    * set 云主机使用的密钥对名称。
    *
    * @param keyNames
    */
    public Instance keyNames(List<String> keyNames) {
        this.keyNames = keyNames;
        return this;
    }


    /**
     * set 云主机的计费信息。
     *
     * @param charge
     */
    public Instance charge(Charge charge) {
        this.charge = charge;
        return this;
    }


    /**
     * set 云主机使用镜像的计费配置与信息。
     *
     * @param imageCharge
     */
    public Instance imageCharge(ImageCharge imageCharge) {
        this.imageCharge = imageCharge;
        return this;
    }


    /**
     * set 抢占实例状态机
     *
     * @param spotStatus
     */
    public Instance spotStatus(String spotStatus) {
        this.spotStatus = spotStatus;
        return this;
    }


    /**
     * set 云主机关联的高可用组，如果创建云主机使用了高可用组，此处可展示高可用组名称。
     *
     * @param ag
     */
    public Instance ag(Ag ag) {
        this.ag = ag;
        return this;
    }


    /**
     * set 高可用组中的错误域。
     *
     * @param faultDomain
     */
    public Instance faultDomain(String faultDomain) {
        this.faultDomain = faultDomain;
        return this;
    }


    /**
    * set Tag信息。
    *
    * @param tags
    */
    public Instance tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }


    /**
     * set 停机不计费模式。该参数仅对按配置计费且系统盘为云硬盘的实例生效，并且不是专有宿主机中的实例。
&#x60;keepCharging&#x60;：关机后继续计费。
&#x60;stopCharging&#x60;：关机后停止计费。

     *
     * @param chargeOnStopped
     */
    public Instance chargeOnStopped(String chargeOnStopped) {
        this.chargeOnStopped = chargeOnStopped;
        return this;
    }


    /**
    * set 自动任务策略，关联了自动任务策略时可获取相应信息。
    *
    * @param policies
    */
    public Instance policies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }


    /**
     * set 云主机所属的专有宿主机池。
     *
     * @param dedicatedPoolId
     */
    public Instance dedicatedPoolId(String dedicatedPoolId) {
        this.dedicatedPoolId = dedicatedPoolId;
        return this;
    }


    /**
     * set 云主机所属的专有宿主机ID。
     *
     * @param dedicatedHostId
     */
    public Instance dedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }


    /**
     * set 突发型实例参数信息
     *
     * @param burstInfo
     */
    public Instance burstInfo(BurstInfo burstInfo) {
        this.burstInfo = burstInfo;
        return this;
    }


    /**
     * set 资源组ID
     *
     * @param resourceGroupId
     */
    public Instance resourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }


    /**
     * set 云主机操作系统类型，如linux或者windows
     *
     * @param osType
     */
    public Instance osType(String osType) {
        this.osType = osType;
        return this;
    }


    /**
     * set 虚机CPU拓扑
     *
     * @param cpuTopology
     */
    public Instance cpuTopology(CpuTopology cpuTopology) {
        this.cpuTopology = cpuTopology;
        return this;
    }


    /**
     * set 云主机操作系统版本，如7.6
     *
     * @param osVersion
     */
    public Instance osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }


    /**
     * set 具体操作系统CentOS
     *
     * @param platform
     */
    public Instance platform(String platform) {
        this.platform = platform;
        return this;
    }


    /**
     * set 架构信息，如x86_64
     *
     * @param architecture
     */
    public Instance architecture(String architecture) {
        this.architecture = architecture;
        return this;
    }


    /**
     * set 主机组详情
     *
     * @param hostGroup
     */
    public Instance hostGroup(HostGroup hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }


    /**
     * set 定时删除时间，例如:&quot;2025-01-01 00:00:00&quot;
     *
     * @param autoReleaseTime
     */
    public Instance autoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }


    /**
     * set 启动模式，支持 bios uefi
     *
     * @param bootMode
     */
    public Instance bootMode(String bootMode) {
        this.bootMode = bootMode;
        return this;
    }



    /**
     * add item to 数据盘配置列表。
     *
     * @param dataDisk
     */
    public void addDataDisk(InstanceDiskAttachment dataDisk) {
        if (this.dataDisks == null) {
            this.dataDisks = new ArrayList<>();
        }
        this.dataDisks.add(dataDisk);
    }

    /**
     * add item to 辅助网卡配置列表。
     *
     * @param secondaryNetworkInterface
     */
    public void addSecondaryNetworkInterface(InstanceNetworkInterfaceAttachment secondaryNetworkInterface) {
        if (this.secondaryNetworkInterfaces == null) {
            this.secondaryNetworkInterfaces = new ArrayList<>();
        }
        this.secondaryNetworkInterfaces.add(secondaryNetworkInterface);
    }

    /**
     * add item to RDMA网卡配置列表。
     *
     * @param rdmaNetworkInterface
     */
    public void addRdmaNetworkInterface(RdmaNetworkInterface rdmaNetworkInterface) {
        if (this.rdmaNetworkInterfaces == null) {
            this.rdmaNetworkInterfaces = new ArrayList<>();
        }
        this.rdmaNetworkInterfaces.add(rdmaNetworkInterface);
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

    /**
     * add item to Tag信息。
     *
     * @param tag
     */
    public void addTag(Tag tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

    /**
     * add item to 自动任务策略，关联了自动任务策略时可获取相应信息。
     *
     * @param policie
     */
    public void addPolicie(Policy policie) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policie);
    }
}