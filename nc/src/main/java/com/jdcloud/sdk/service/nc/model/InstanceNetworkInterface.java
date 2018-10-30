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

package com.jdcloud.sdk.service.nc.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 描述实例的网卡信息
 */
public class InstanceNetworkInterface  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性网卡ID
     */
    private String networkInterfaceId;

    /**
     * 以太网地址
     */
    private String macAddress;

    /**
     * 虚拟网络ID
     */
    private String vpcId;

    /**
     * 描述
     */
    private String description;

    /**
     * 安全组列表
     */
    private List<SecurityGroupSimple> securityGroups;

    /**
     * 源和目标IP地址校验，取值为0或者1
     */
    private Boolean sanityCheck;

    /**
     * 网卡主IP
     */
    private NetworkInterfacePrivateIp primaryIp;

    /**
     * null
     */
    private List<NetworkInterfacePrivateIp> secondaryIps;


    /**
     * get 弹性网卡ID
     *
     * @return
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * set 弹性网卡ID
     *
     * @param networkInterfaceId
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * get 以太网地址
     *
     * @return
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * set 以太网地址
     *
     * @param macAddress
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * get 虚拟网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 虚拟网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 安全组列表
     *
     * @return
     */
    public List<SecurityGroupSimple> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * set 安全组列表
     *
     * @param securityGroups
     */
    public void setSecurityGroups(List<SecurityGroupSimple> securityGroups) {
        this.securityGroups = securityGroups;
    }

    /**
     * get 源和目标IP地址校验，取值为0或者1
     *
     * @return
     */
    public Boolean getSanityCheck() {
        return sanityCheck;
    }

    /**
     * set 源和目标IP地址校验，取值为0或者1
     *
     * @param sanityCheck
     */
    public void setSanityCheck(Boolean sanityCheck) {
        this.sanityCheck = sanityCheck;
    }

    /**
     * get 网卡主IP
     *
     * @return
     */
    public NetworkInterfacePrivateIp getPrimaryIp() {
        return primaryIp;
    }

    /**
     * set 网卡主IP
     *
     * @param primaryIp
     */
    public void setPrimaryIp(NetworkInterfacePrivateIp primaryIp) {
        this.primaryIp = primaryIp;
    }

    /**
     * get null
     *
     * @return
     */
    public List<NetworkInterfacePrivateIp> getSecondaryIps() {
        return secondaryIps;
    }

    /**
     * set null
     *
     * @param secondaryIps
     */
    public void setSecondaryIps(List<NetworkInterfacePrivateIp> secondaryIps) {
        this.secondaryIps = secondaryIps;
    }


    /**
     * set 弹性网卡ID
     *
     * @param networkInterfaceId
     */
    public InstanceNetworkInterface networkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * set 以太网地址
     *
     * @param macAddress
     */
    public InstanceNetworkInterface macAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * set 虚拟网络ID
     *
     * @param vpcId
     */
    public InstanceNetworkInterface vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public InstanceNetworkInterface description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 安全组列表
     *
     * @param securityGroups
     */
    public InstanceNetworkInterface securityGroups(List<SecurityGroupSimple> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * set 源和目标IP地址校验，取值为0或者1
     *
     * @param sanityCheck
     */
    public InstanceNetworkInterface sanityCheck(Boolean sanityCheck) {
        this.sanityCheck = sanityCheck;
        return this;
    }

    /**
     * set 网卡主IP
     *
     * @param primaryIp
     */
    public InstanceNetworkInterface primaryIp(NetworkInterfacePrivateIp primaryIp) {
        this.primaryIp = primaryIp;
        return this;
    }

    /**
     * set null
     *
     * @param secondaryIps
     */
    public InstanceNetworkInterface secondaryIps(List<NetworkInterfacePrivateIp> secondaryIps) {
        this.secondaryIps = secondaryIps;
        return this;
    }


    /**
     * add item to 安全组列表
     *
     * @param securityGroup
     */
    public void addSecurityGroup(SecurityGroupSimple securityGroup) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroup);
    }

    /**
     * add item to null
     *
     * @param secondaryIp
     */
    public void addSecondaryIp(NetworkInterfacePrivateIp secondaryIp) {
        if (this.secondaryIps == null) {
            this.secondaryIps = new ArrayList<>();
        }
        this.secondaryIps.add(secondaryIp);
    }

}