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

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * natGateway
 */
public class NatGateway  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * NAT网关ID
     */
    private String natGatewayId;

    /**
     * NAT网关名称
     */
    private String natGatewayName;

    /**
     * NAT网关规格，取值small（100万并发连接数），medium（300万并发连接数），large（1000万并发连接数）
     */
    private String natGatewaySpec;

    /**
     * NAT网关的状态
     */
    private NatGatewayState state;

    /**
     * NAT网关的描述信息
     */
    private String description;

    /**
     * NAT网关计费配置
     */
    private Charge natGatewayCharge;

    /**
     * NAT网关可用区属性
     */
    private List<String> azs;

    /**
     * 私有网络ID
     */
    private String vpcId;

    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * NAT网关的IP可用区属性
     */
    private List<AzIp> azIp;

    /**
     * NAT网关创建时间
     */
    private String createdTime;

    /**
     * Tag信息
     */
    private List<Tag> tags;


    /**
     * get NAT网关ID
     *
     * @return
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    /**
     * set NAT网关ID
     *
     * @param natGatewayId
     */
    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * get NAT网关名称
     *
     * @return
     */
    public String getNatGatewayName() {
        return natGatewayName;
    }

    /**
     * set NAT网关名称
     *
     * @param natGatewayName
     */
    public void setNatGatewayName(String natGatewayName) {
        this.natGatewayName = natGatewayName;
    }

    /**
     * get NAT网关规格，取值small（100万并发连接数），medium（300万并发连接数），large（1000万并发连接数）
     *
     * @return
     */
    public String getNatGatewaySpec() {
        return natGatewaySpec;
    }

    /**
     * set NAT网关规格，取值small（100万并发连接数），medium（300万并发连接数），large（1000万并发连接数）
     *
     * @param natGatewaySpec
     */
    public void setNatGatewaySpec(String natGatewaySpec) {
        this.natGatewaySpec = natGatewaySpec;
    }

    /**
     * get NAT网关的状态
     *
     * @return
     */
    public NatGatewayState getState() {
        return state;
    }

    /**
     * set NAT网关的状态
     *
     * @param state
     */
    public void setState(NatGatewayState state) {
        this.state = state;
    }

    /**
     * get NAT网关的描述信息
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set NAT网关的描述信息
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get NAT网关计费配置
     *
     * @return
     */
    public Charge getNatGatewayCharge() {
        return natGatewayCharge;
    }

    /**
     * set NAT网关计费配置
     *
     * @param natGatewayCharge
     */
    public void setNatGatewayCharge(Charge natGatewayCharge) {
        this.natGatewayCharge = natGatewayCharge;
    }

    /**
     * get NAT网关可用区属性
     *
     * @return
     */
    public List<String> getAzs() {
        return azs;
    }

    /**
     * set NAT网关可用区属性
     *
     * @param azs
     */
    public void setAzs(List<String> azs) {
        this.azs = azs;
    }

    /**
     * get 私有网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 子网ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get NAT网关的IP可用区属性
     *
     * @return
     */
    public List<AzIp> getAzIp() {
        return azIp;
    }

    /**
     * set NAT网关的IP可用区属性
     *
     * @param azIp
     */
    public void setAzIp(List<AzIp> azIp) {
        this.azIp = azIp;
    }

    /**
     * get NAT网关创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set NAT网关创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get Tag信息
     *
     * @return
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * set Tag信息
     *
     * @param tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }


    /**
     * set NAT网关ID
     *
     * @param natGatewayId
     */
    public NatGateway natGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    /**
     * set NAT网关名称
     *
     * @param natGatewayName
     */
    public NatGateway natGatewayName(String natGatewayName) {
        this.natGatewayName = natGatewayName;
        return this;
    }

    /**
     * set NAT网关规格，取值small（100万并发连接数），medium（300万并发连接数），large（1000万并发连接数）
     *
     * @param natGatewaySpec
     */
    public NatGateway natGatewaySpec(String natGatewaySpec) {
        this.natGatewaySpec = natGatewaySpec;
        return this;
    }

    /**
     * set NAT网关的状态
     *
     * @param state
     */
    public NatGateway state(NatGatewayState state) {
        this.state = state;
        return this;
    }

    /**
     * set NAT网关的描述信息
     *
     * @param description
     */
    public NatGateway description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set NAT网关计费配置
     *
     * @param natGatewayCharge
     */
    public NatGateway natGatewayCharge(Charge natGatewayCharge) {
        this.natGatewayCharge = natGatewayCharge;
        return this;
    }

    /**
     * set NAT网关可用区属性
     *
     * @param azs
     */
    public NatGateway azs(List<String> azs) {
        this.azs = azs;
        return this;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public NatGateway vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public NatGateway subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set NAT网关的IP可用区属性
     *
     * @param azIp
     */
    public NatGateway azIp(List<AzIp> azIp) {
        this.azIp = azIp;
        return this;
    }

    /**
     * set NAT网关创建时间
     *
     * @param createdTime
     */
    public NatGateway createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set Tag信息
     *
     * @param tags
     */
    public NatGateway tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }


    /**
     * add item to NAT网关可用区属性
     *
     * @param az
     */
    public void addAz(String az) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(az);
    }

    /**
     * add item to NAT网关的IP可用区属性
     *
     * @param azIp
     */
    public void addAzIp(AzIp azIp) {
        if (this.azIp == null) {
            this.azIp = new ArrayList<>();
        }
        this.azIp.add(azIp);
    }

    /**
     * add item to Tag信息
     *
     * @param tag
     */
    public void addTag(Tag tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}