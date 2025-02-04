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

package com.jdcloud.sdk.service.tidb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;

/**
 * tidbInstanceSpec
 */
public class TidbInstanceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例名
     * Required:true
     */
    @Required
    private String instanceName;

    /**
     * TiDB引擎版本
     */
    private String engineVersion;

    /**
     * TiDB节点规格和数目
     * Required:true
     */
    @Required
    private NodeSpec tidbNodeSpec;

    /**
     * TiKV节点规格和数目
     * Required:true
     */
    @Required
    private NodeSpec tikvNodeSpec;

    /**
     * PD节点规格和数目
     * Required:true
     */
    @Required
    private NodeSpec pdNodeSpec;

    /**
     * Monitor节点规格，只能有1个Monitor节点
     * Required:true
     */
    @Required
    private NodeSpec monitorNodeSpec;

    /**
     * TiFlash节点规格和数目
     */
    private NodeSpec tiflashNodeSpec;

    /**
     * Ticdc节点规格和数目
     */
    private NodeSpec ticdcNodeSpec;

    /**
     * 可用区ID，目前仅支持单可用区部署
     * Required:true
     */
    @Required
    private List<String> azId;

    /**
     * VPC的ID
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * 子网ID
     * Required:true
     */
    @Required
    private String subnetId;

    /**
     * 计费规格，包括计费类型，计费周期等
     * Required:true
     */
    @Required
    private ChargeSpec chargeSpec;

    /**
     * 标签信息
     */
    private List<Tag> tagSpec;


    /**
     * get 实例名
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get TiDB引擎版本
     *
     * @return
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * set TiDB引擎版本
     *
     * @param engineVersion
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * get TiDB节点规格和数目
     *
     * @return
     */
    public NodeSpec getTidbNodeSpec() {
        return tidbNodeSpec;
    }

    /**
     * set TiDB节点规格和数目
     *
     * @param tidbNodeSpec
     */
    public void setTidbNodeSpec(NodeSpec tidbNodeSpec) {
        this.tidbNodeSpec = tidbNodeSpec;
    }

    /**
     * get TiKV节点规格和数目
     *
     * @return
     */
    public NodeSpec getTikvNodeSpec() {
        return tikvNodeSpec;
    }

    /**
     * set TiKV节点规格和数目
     *
     * @param tikvNodeSpec
     */
    public void setTikvNodeSpec(NodeSpec tikvNodeSpec) {
        this.tikvNodeSpec = tikvNodeSpec;
    }

    /**
     * get PD节点规格和数目
     *
     * @return
     */
    public NodeSpec getPdNodeSpec() {
        return pdNodeSpec;
    }

    /**
     * set PD节点规格和数目
     *
     * @param pdNodeSpec
     */
    public void setPdNodeSpec(NodeSpec pdNodeSpec) {
        this.pdNodeSpec = pdNodeSpec;
    }

    /**
     * get Monitor节点规格，只能有1个Monitor节点
     *
     * @return
     */
    public NodeSpec getMonitorNodeSpec() {
        return monitorNodeSpec;
    }

    /**
     * set Monitor节点规格，只能有1个Monitor节点
     *
     * @param monitorNodeSpec
     */
    public void setMonitorNodeSpec(NodeSpec monitorNodeSpec) {
        this.monitorNodeSpec = monitorNodeSpec;
    }

    /**
     * get TiFlash节点规格和数目
     *
     * @return
     */
    public NodeSpec getTiflashNodeSpec() {
        return tiflashNodeSpec;
    }

    /**
     * set TiFlash节点规格和数目
     *
     * @param tiflashNodeSpec
     */
    public void setTiflashNodeSpec(NodeSpec tiflashNodeSpec) {
        this.tiflashNodeSpec = tiflashNodeSpec;
    }

    /**
     * get Ticdc节点规格和数目
     *
     * @return
     */
    public NodeSpec getTicdcNodeSpec() {
        return ticdcNodeSpec;
    }

    /**
     * set Ticdc节点规格和数目
     *
     * @param ticdcNodeSpec
     */
    public void setTicdcNodeSpec(NodeSpec ticdcNodeSpec) {
        this.ticdcNodeSpec = ticdcNodeSpec;
    }

    /**
     * get 可用区ID，目前仅支持单可用区部署
     *
     * @return
     */
    public List<String> getAzId() {
        return azId;
    }

    /**
     * set 可用区ID，目前仅支持单可用区部署
     *
     * @param azId
     */
    public void setAzId(List<String> azId) {
        this.azId = azId;
    }

    /**
     * get VPC的ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set VPC的ID
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
     * get 计费规格，包括计费类型，计费周期等
     *
     * @return
     */
    public ChargeSpec getChargeSpec() {
        return chargeSpec;
    }

    /**
     * set 计费规格，包括计费类型，计费周期等
     *
     * @param chargeSpec
     */
    public void setChargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
    }

    /**
     * get 标签信息
     *
     * @return
     */
    public List<Tag> getTagSpec() {
        return tagSpec;
    }

    /**
     * set 标签信息
     *
     * @param tagSpec
     */
    public void setTagSpec(List<Tag> tagSpec) {
        this.tagSpec = tagSpec;
    }


    /**
     * set 实例名
     *
     * @param instanceName
     */
    public TidbInstanceSpec instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set TiDB引擎版本
     *
     * @param engineVersion
     */
    public TidbInstanceSpec engineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * set TiDB节点规格和数目
     *
     * @param tidbNodeSpec
     */
    public TidbInstanceSpec tidbNodeSpec(NodeSpec tidbNodeSpec) {
        this.tidbNodeSpec = tidbNodeSpec;
        return this;
    }

    /**
     * set TiKV节点规格和数目
     *
     * @param tikvNodeSpec
     */
    public TidbInstanceSpec tikvNodeSpec(NodeSpec tikvNodeSpec) {
        this.tikvNodeSpec = tikvNodeSpec;
        return this;
    }

    /**
     * set PD节点规格和数目
     *
     * @param pdNodeSpec
     */
    public TidbInstanceSpec pdNodeSpec(NodeSpec pdNodeSpec) {
        this.pdNodeSpec = pdNodeSpec;
        return this;
    }

    /**
     * set Monitor节点规格，只能有1个Monitor节点
     *
     * @param monitorNodeSpec
     */
    public TidbInstanceSpec monitorNodeSpec(NodeSpec monitorNodeSpec) {
        this.monitorNodeSpec = monitorNodeSpec;
        return this;
    }

    /**
     * set TiFlash节点规格和数目
     *
     * @param tiflashNodeSpec
     */
    public TidbInstanceSpec tiflashNodeSpec(NodeSpec tiflashNodeSpec) {
        this.tiflashNodeSpec = tiflashNodeSpec;
        return this;
    }

    /**
     * set Ticdc节点规格和数目
     *
     * @param ticdcNodeSpec
     */
    public TidbInstanceSpec ticdcNodeSpec(NodeSpec ticdcNodeSpec) {
        this.ticdcNodeSpec = ticdcNodeSpec;
        return this;
    }

    /**
     * set 可用区ID，目前仅支持单可用区部署
     *
     * @param azId
     */
    public TidbInstanceSpec azId(List<String> azId) {
        this.azId = azId;
        return this;
    }

    /**
     * set VPC的ID
     *
     * @param vpcId
     */
    public TidbInstanceSpec vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public TidbInstanceSpec subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 计费规格，包括计费类型，计费周期等
     *
     * @param chargeSpec
     */
    public TidbInstanceSpec chargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
        return this;
    }

    /**
     * set 标签信息
     *
     * @param tagSpec
     */
    public TidbInstanceSpec tagSpec(List<Tag> tagSpec) {
        this.tagSpec = tagSpec;
        return this;
    }


    /**
     * add item to 可用区ID，目前仅支持单可用区部署
     *
     * @param azId
     */
    public void addAzId(String azId) {
        if (this.azId == null) {
            this.azId = new ArrayList<>();
        }
        this.azId.add(azId);
    }

    /**
     * add item to 标签信息
     *
     * @param tagSpec
     */
    public void addTagSpec(Tag tagSpec) {
        if (this.tagSpec == null) {
            this.tagSpec = new ArrayList<>();
        }
        this.tagSpec.add(tagSpec);
    }

}