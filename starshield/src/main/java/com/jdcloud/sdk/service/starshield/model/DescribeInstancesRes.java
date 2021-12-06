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

package com.jdcloud.sdk.service.starshield.model;


/**
 * describeInstancesRes
 */
public class DescribeInstancesRes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 套餐类型
     */
    private String packType;

    /**
     * 计费状态
     */
    private String chargeState;

    /**
     * 域名增量包数量
     */
    private Integer zonePackNum;

    /**
     * 流量包数量
     */
    private Integer trafficExpansion;

    /**
     * 已使用流量（单位：Byte）
     */
    private Number flowUsedCnt;

    /**
     * 剩余流量(单位：Gb)
     */
    private Double flowRemain;

    /**
     * 套餐模式(BASE-&gt;基础套餐 FLOW-&gt;流量套餐)
     */
    private String packMode;

    /**
     * 备注
     */
    private String memo;

    /**
     * 购买时间, UTC时间格式，例如2017-11-10T23:00:00Z
     */
    private String createTime;

    /**
     * 到期时间, UTC时间格式，例如2017-11-10T23:00:00Z
     */
    private String expireTime;

    /**
     * 套餐信息
     */
    private DescribePackRes packageInfo;


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 实例名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 套餐类型
     *
     * @return
     */
    public String getPackType() {
        return packType;
    }

    /**
     * set 套餐类型
     *
     * @param packType
     */
    public void setPackType(String packType) {
        this.packType = packType;
    }

    /**
     * get 计费状态
     *
     * @return
     */
    public String getChargeState() {
        return chargeState;
    }

    /**
     * set 计费状态
     *
     * @param chargeState
     */
    public void setChargeState(String chargeState) {
        this.chargeState = chargeState;
    }

    /**
     * get 域名增量包数量
     *
     * @return
     */
    public Integer getZonePackNum() {
        return zonePackNum;
    }

    /**
     * set 域名增量包数量
     *
     * @param zonePackNum
     */
    public void setZonePackNum(Integer zonePackNum) {
        this.zonePackNum = zonePackNum;
    }

    /**
     * get 流量包数量
     *
     * @return
     */
    public Integer getTrafficExpansion() {
        return trafficExpansion;
    }

    /**
     * set 流量包数量
     *
     * @param trafficExpansion
     */
    public void setTrafficExpansion(Integer trafficExpansion) {
        this.trafficExpansion = trafficExpansion;
    }

    /**
     * get 已使用流量（单位：Byte）
     *
     * @return
     */
    public Number getFlowUsedCnt() {
        return flowUsedCnt;
    }

    /**
     * set 已使用流量（单位：Byte）
     *
     * @param flowUsedCnt
     */
    public void setFlowUsedCnt(Number flowUsedCnt) {
        this.flowUsedCnt = flowUsedCnt;
    }

    /**
     * get 剩余流量(单位：Gb)
     *
     * @return
     */
    public Double getFlowRemain() {
        return flowRemain;
    }

    /**
     * set 剩余流量(单位：Gb)
     *
     * @param flowRemain
     */
    public void setFlowRemain(Double flowRemain) {
        this.flowRemain = flowRemain;
    }

    /**
     * get 套餐模式(BASE-&gt;基础套餐 FLOW-&gt;流量套餐)
     *
     * @return
     */
    public String getPackMode() {
        return packMode;
    }

    /**
     * set 套餐模式(BASE-&gt;基础套餐 FLOW-&gt;流量套餐)
     *
     * @param packMode
     */
    public void setPackMode(String packMode) {
        this.packMode = packMode;
    }

    /**
     * get 备注
     *
     * @return
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set 备注
     *
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * get 购买时间, UTC时间格式，例如2017-11-10T23:00:00Z
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 购买时间, UTC时间格式，例如2017-11-10T23:00:00Z
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 到期时间, UTC时间格式，例如2017-11-10T23:00:00Z
     *
     * @return
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * set 到期时间, UTC时间格式，例如2017-11-10T23:00:00Z
     *
     * @param expireTime
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * get 套餐信息
     *
     * @return
     */
    public DescribePackRes getPackageInfo() {
        return packageInfo;
    }

    /**
     * set 套餐信息
     *
     * @param packageInfo
     */
    public void setPackageInfo(DescribePackRes packageInfo) {
        this.packageInfo = packageInfo;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public DescribeInstancesRes instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public DescribeInstancesRes instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 套餐类型
     *
     * @param packType
     */
    public DescribeInstancesRes packType(String packType) {
        this.packType = packType;
        return this;
    }

    /**
     * set 计费状态
     *
     * @param chargeState
     */
    public DescribeInstancesRes chargeState(String chargeState) {
        this.chargeState = chargeState;
        return this;
    }

    /**
     * set 域名增量包数量
     *
     * @param zonePackNum
     */
    public DescribeInstancesRes zonePackNum(Integer zonePackNum) {
        this.zonePackNum = zonePackNum;
        return this;
    }

    /**
     * set 流量包数量
     *
     * @param trafficExpansion
     */
    public DescribeInstancesRes trafficExpansion(Integer trafficExpansion) {
        this.trafficExpansion = trafficExpansion;
        return this;
    }

    /**
     * set 已使用流量（单位：Byte）
     *
     * @param flowUsedCnt
     */
    public DescribeInstancesRes flowUsedCnt(Number flowUsedCnt) {
        this.flowUsedCnt = flowUsedCnt;
        return this;
    }

    /**
     * set 剩余流量(单位：Gb)
     *
     * @param flowRemain
     */
    public DescribeInstancesRes flowRemain(Double flowRemain) {
        this.flowRemain = flowRemain;
        return this;
    }

    /**
     * set 套餐模式(BASE-&gt;基础套餐 FLOW-&gt;流量套餐)
     *
     * @param packMode
     */
    public DescribeInstancesRes packMode(String packMode) {
        this.packMode = packMode;
        return this;
    }

    /**
     * set 备注
     *
     * @param memo
     */
    public DescribeInstancesRes memo(String memo) {
        this.memo = memo;
        return this;
    }

    /**
     * set 购买时间, UTC时间格式，例如2017-11-10T23:00:00Z
     *
     * @param createTime
     */
    public DescribeInstancesRes createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 到期时间, UTC时间格式，例如2017-11-10T23:00:00Z
     *
     * @param expireTime
     */
    public DescribeInstancesRes expireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * set 套餐信息
     *
     * @param packageInfo
     */
    public DescribeInstancesRes packageInfo(DescribePackRes packageInfo) {
        this.packageInfo = packageInfo;
        return this;
    }


}