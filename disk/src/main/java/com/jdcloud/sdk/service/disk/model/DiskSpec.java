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

package com.jdcloud.sdk.service.disk.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;

/**
 * diskSpec
 */
public class DiskSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云硬盘所属的可用区
     * Required:true
     */
    @Required
    private String az;

    /**
     * 云硬盘名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 云硬盘描述,默认为空
     */
    private String description;

    /**
     * 云硬盘类型，取值为ssd、premium-hdd、ssd.gp1、ssd.io1、hdd.std1之一
     * Required:true
     */
    @Required
    private String diskType;

    /**
     * 云硬盘大小，单位为 GiB，ssd 类型取值范围[20,1000]GB，步长为10G，premium-hdd 类型取值范围[20,3000]GB，步长为10G, ssd.gp1, ssd.io1, hdd.std1 类型取值均是范围[20,16000]GB，步长为10G
     * Required:true
     */
    @Required
    private Integer diskSizeGB;

    /**
     * 云硬盘IOPS的大小，当且仅当云盘类型是ssd.io1型的云盘有效，步长是10.默认值为容量30，最大值为容量50
     */
    private Integer iops;

    /**
     * 用于创建云硬盘的快照ID，默认为空
     */
    private String snapshotId;

    /**
     * 策略ID,默认为空;当策略Id为空时,reps结果返回中policyRelations为空
     */
    private String policyId;

    /**
     * 计费配置；如不指定，默认计费类型是后付费-按使用时常付费
     */
    private ChargeSpec charge;

    /**
     * 云硬盘是否支持一盘多主机挂载，默认为false（不支持）
     */
    private Boolean multiAttachable;

    /**
     * 云硬盘是否加密，默认为false（不加密）
     */
    private Boolean encrypt;


    /**
     * get 云硬盘所属的可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 云硬盘所属的可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 云硬盘名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 云硬盘名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 云硬盘描述,默认为空
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 云硬盘描述,默认为空
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 云硬盘类型，取值为ssd、premium-hdd、ssd.gp1、ssd.io1、hdd.std1之一
     *
     * @return
     */
    public String getDiskType() {
        return diskType;
    }

    /**
     * set 云硬盘类型，取值为ssd、premium-hdd、ssd.gp1、ssd.io1、hdd.std1之一
     *
     * @param diskType
     */
    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    /**
     * get 云硬盘大小，单位为 GiB，ssd 类型取值范围[20,1000]GB，步长为10G，premium-hdd 类型取值范围[20,3000]GB，步长为10G, ssd.gp1, ssd.io1, hdd.std1 类型取值均是范围[20,16000]GB，步长为10G
     *
     * @return
     */
    public Integer getDiskSizeGB() {
        return diskSizeGB;
    }

    /**
     * set 云硬盘大小，单位为 GiB，ssd 类型取值范围[20,1000]GB，步长为10G，premium-hdd 类型取值范围[20,3000]GB，步长为10G, ssd.gp1, ssd.io1, hdd.std1 类型取值均是范围[20,16000]GB，步长为10G
     *
     * @param diskSizeGB
     */
    public void setDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
    }

    /**
     * get 云硬盘IOPS的大小，当且仅当云盘类型是ssd.io1型的云盘有效，步长是10.默认值为容量30，最大值为容量50
     *
     * @return
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * set 云硬盘IOPS的大小，当且仅当云盘类型是ssd.io1型的云盘有效，步长是10.默认值为容量30，最大值为容量50
     *
     * @param iops
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * get 用于创建云硬盘的快照ID，默认为空
     *
     * @return
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * set 用于创建云硬盘的快照ID，默认为空
     *
     * @param snapshotId
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * get 策略ID,默认为空;当策略Id为空时,reps结果返回中policyRelations为空
     *
     * @return
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * set 策略ID,默认为空;当策略Id为空时,reps结果返回中policyRelations为空
     *
     * @param policyId
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * get 计费配置；如不指定，默认计费类型是后付费-按使用时常付费
     *
     * @return
     */
    public ChargeSpec getCharge() {
        return charge;
    }

    /**
     * set 计费配置；如不指定，默认计费类型是后付费-按使用时常付费
     *
     * @param charge
     */
    public void setCharge(ChargeSpec charge) {
        this.charge = charge;
    }

    /**
     * get 云硬盘是否支持一盘多主机挂载，默认为false（不支持）
     *
     * @return
     */
    public Boolean getMultiAttachable() {
        return multiAttachable;
    }

    /**
     * set 云硬盘是否支持一盘多主机挂载，默认为false（不支持）
     *
     * @param multiAttachable
     */
    public void setMultiAttachable(Boolean multiAttachable) {
        this.multiAttachable = multiAttachable;
    }

    /**
     * get 云硬盘是否加密，默认为false（不加密）
     *
     * @return
     */
    public Boolean getEncrypt() {
        return encrypt;
    }

    /**
     * set 云硬盘是否加密，默认为false（不加密）
     *
     * @param encrypt
     */
    public void setEncrypt(Boolean encrypt) {
        this.encrypt = encrypt;
    }


    /**
     * set 云硬盘所属的可用区
     *
     * @param az
     */
    public DiskSpec az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 云硬盘名称
     *
     * @param name
     */
    public DiskSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 云硬盘描述,默认为空
     *
     * @param description
     */
    public DiskSpec description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 云硬盘类型，取值为ssd、premium-hdd、ssd.gp1、ssd.io1、hdd.std1之一
     *
     * @param diskType
     */
    public DiskSpec diskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set 云硬盘大小，单位为 GiB，ssd 类型取值范围[20,1000]GB，步长为10G，premium-hdd 类型取值范围[20,3000]GB，步长为10G, ssd.gp1, ssd.io1, hdd.std1 类型取值均是范围[20,16000]GB，步长为10G
     *
     * @param diskSizeGB
     */
    public DiskSpec diskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * set 云硬盘IOPS的大小，当且仅当云盘类型是ssd.io1型的云盘有效，步长是10.默认值为容量30，最大值为容量50
     *
     * @param iops
     */
    public DiskSpec iops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * set 用于创建云硬盘的快照ID，默认为空
     *
     * @param snapshotId
     */
    public DiskSpec snapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * set 策略ID,默认为空;当策略Id为空时,reps结果返回中policyRelations为空
     *
     * @param policyId
     */
    public DiskSpec policyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * set 计费配置；如不指定，默认计费类型是后付费-按使用时常付费
     *
     * @param charge
     */
    public DiskSpec charge(ChargeSpec charge) {
        this.charge = charge;
        return this;
    }

    /**
     * set 云硬盘是否支持一盘多主机挂载，默认为false（不支持）
     *
     * @param multiAttachable
     */
    public DiskSpec multiAttachable(Boolean multiAttachable) {
        this.multiAttachable = multiAttachable;
        return this;
    }

    /**
     * set 云硬盘是否加密，默认为false（不加密）
     *
     * @param encrypt
     */
    public DiskSpec encrypt(Boolean encrypt) {
        this.encrypt = encrypt;
        return this;
    }


}