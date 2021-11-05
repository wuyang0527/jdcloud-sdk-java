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

package com.jdcloud.sdk.service.privatezone.model;


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
     * zone数量
     */
    private Integer zoneNum;

    /**
     * 绑定vpc数量
     */
    private Integer bindVpcNum;

    /**
     * zone级别
     */
    private Integer zoneLevel;

    /**
     * 解析记录数量
     */
    private Integer rrNum;

    /**
     * 域名等级
     */
    private Integer domainLevel;

    /**
     * 导出解析记录权限
     */
    private Boolean rrAuthorExport;

    /**
     * 购买时长
     */
    private Integer duration;

    /**
     * 时长单位（YEAR-&gt;年）
     */
    private String durationUnit;

    /**
     * 到期时间, UTC时间格式，例如2017-11-10T23:00:00Z
     */
    private String expireTime;

    /**
     * 计费状态（NORMAL-&gt;正常 EXPIRE-&gt;到期 DELETED-&gt;已删除）
     */
    private String chargeStutas;

    /**
     * 已使用zone数量
     */
    private Integer usedZoneNum;


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
     * get zone数量
     *
     * @return
     */
    public Integer getZoneNum() {
        return zoneNum;
    }

    /**
     * set zone数量
     *
     * @param zoneNum
     */
    public void setZoneNum(Integer zoneNum) {
        this.zoneNum = zoneNum;
    }

    /**
     * get 绑定vpc数量
     *
     * @return
     */
    public Integer getBindVpcNum() {
        return bindVpcNum;
    }

    /**
     * set 绑定vpc数量
     *
     * @param bindVpcNum
     */
    public void setBindVpcNum(Integer bindVpcNum) {
        this.bindVpcNum = bindVpcNum;
    }

    /**
     * get zone级别
     *
     * @return
     */
    public Integer getZoneLevel() {
        return zoneLevel;
    }

    /**
     * set zone级别
     *
     * @param zoneLevel
     */
    public void setZoneLevel(Integer zoneLevel) {
        this.zoneLevel = zoneLevel;
    }

    /**
     * get 解析记录数量
     *
     * @return
     */
    public Integer getRrNum() {
        return rrNum;
    }

    /**
     * set 解析记录数量
     *
     * @param rrNum
     */
    public void setRrNum(Integer rrNum) {
        this.rrNum = rrNum;
    }

    /**
     * get 域名等级
     *
     * @return
     */
    public Integer getDomainLevel() {
        return domainLevel;
    }

    /**
     * set 域名等级
     *
     * @param domainLevel
     */
    public void setDomainLevel(Integer domainLevel) {
        this.domainLevel = domainLevel;
    }

    /**
     * get 导出解析记录权限
     *
     * @return
     */
    public Boolean getRrAuthorExport() {
        return rrAuthorExport;
    }

    /**
     * set 导出解析记录权限
     *
     * @param rrAuthorExport
     */
    public void setRrAuthorExport(Boolean rrAuthorExport) {
        this.rrAuthorExport = rrAuthorExport;
    }

    /**
     * get 购买时长
     *
     * @return
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * set 购买时长
     *
     * @param duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * get 时长单位（YEAR-&gt;年）
     *
     * @return
     */
    public String getDurationUnit() {
        return durationUnit;
    }

    /**
     * set 时长单位（YEAR-&gt;年）
     *
     * @param durationUnit
     */
    public void setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
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
     * get 计费状态（NORMAL-&gt;正常 EXPIRE-&gt;到期 DELETED-&gt;已删除）
     *
     * @return
     */
    public String getChargeStutas() {
        return chargeStutas;
    }

    /**
     * set 计费状态（NORMAL-&gt;正常 EXPIRE-&gt;到期 DELETED-&gt;已删除）
     *
     * @param chargeStutas
     */
    public void setChargeStutas(String chargeStutas) {
        this.chargeStutas = chargeStutas;
    }

    /**
     * get 已使用zone数量
     *
     * @return
     */
    public Integer getUsedZoneNum() {
        return usedZoneNum;
    }

    /**
     * set 已使用zone数量
     *
     * @param usedZoneNum
     */
    public void setUsedZoneNum(Integer usedZoneNum) {
        this.usedZoneNum = usedZoneNum;
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
     * set zone数量
     *
     * @param zoneNum
     */
    public DescribeInstancesRes zoneNum(Integer zoneNum) {
        this.zoneNum = zoneNum;
        return this;
    }

    /**
     * set 绑定vpc数量
     *
     * @param bindVpcNum
     */
    public DescribeInstancesRes bindVpcNum(Integer bindVpcNum) {
        this.bindVpcNum = bindVpcNum;
        return this;
    }

    /**
     * set zone级别
     *
     * @param zoneLevel
     */
    public DescribeInstancesRes zoneLevel(Integer zoneLevel) {
        this.zoneLevel = zoneLevel;
        return this;
    }

    /**
     * set 解析记录数量
     *
     * @param rrNum
     */
    public DescribeInstancesRes rrNum(Integer rrNum) {
        this.rrNum = rrNum;
        return this;
    }

    /**
     * set 域名等级
     *
     * @param domainLevel
     */
    public DescribeInstancesRes domainLevel(Integer domainLevel) {
        this.domainLevel = domainLevel;
        return this;
    }

    /**
     * set 导出解析记录权限
     *
     * @param rrAuthorExport
     */
    public DescribeInstancesRes rrAuthorExport(Boolean rrAuthorExport) {
        this.rrAuthorExport = rrAuthorExport;
        return this;
    }

    /**
     * set 购买时长
     *
     * @param duration
     */
    public DescribeInstancesRes duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * set 时长单位（YEAR-&gt;年）
     *
     * @param durationUnit
     */
    public DescribeInstancesRes durationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
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
     * set 计费状态（NORMAL-&gt;正常 EXPIRE-&gt;到期 DELETED-&gt;已删除）
     *
     * @param chargeStutas
     */
    public DescribeInstancesRes chargeStutas(String chargeStutas) {
        this.chargeStutas = chargeStutas;
        return this;
    }

    /**
     * set 已使用zone数量
     *
     * @param usedZoneNum
     */
    public DescribeInstancesRes usedZoneNum(Integer usedZoneNum) {
        this.usedZoneNum = usedZoneNum;
        return this;
    }


}