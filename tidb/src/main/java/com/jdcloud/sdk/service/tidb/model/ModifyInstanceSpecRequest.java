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
 * Instance-Management
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import com.jdcloud.sdk.service.tidb.model.NodeSpec;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改 TiDB 实例中各类节点中的数目与规格。支持 TiDB 节点和 Monitor 节点数目和规格的同时调整。 如果当前实例无 TiFlash 和 TiCDC 节点，那么在增加 TiFlash 和 TiCDC 节点数目时，可同时指定其规格。
 */
public class ModifyInstanceSpecRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 调整后的tikv节点数
     */
    private Integer tikvNodeNum;

    /**
     * 调整后的pd节点数
     */
    private Integer pdNodeNum;

    /**
     * TiDB节点规格和数目
     */
    private NodeSpec tidbNodeSpec;

    /**
     * TiFlash节点规格和数目
     */
    private NodeSpec tiflashNodeSpec;

    /**
     * Ticdc节点规格和数目
     */
    private NodeSpec ticdcNodeSpec;

    /**
     * Monitor节点规格和数目
     */
    private NodeSpec monitorNodeSpec;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例ID
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get 调整后的tikv节点数
     *
     * @return
     */
    public Integer getTikvNodeNum() {
        return tikvNodeNum;
    }

    /**
     * set 调整后的tikv节点数
     *
     * @param tikvNodeNum
     */
    public void setTikvNodeNum(Integer tikvNodeNum) {
        this.tikvNodeNum = tikvNodeNum;
    }


    /**
     * get 调整后的pd节点数
     *
     * @return
     */
    public Integer getPdNodeNum() {
        return pdNodeNum;
    }

    /**
     * set 调整后的pd节点数
     *
     * @param pdNodeNum
     */
    public void setPdNodeNum(Integer pdNodeNum) {
        this.pdNodeNum = pdNodeNum;
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
     * get Monitor节点规格和数目
     *
     * @return
     */
    public NodeSpec getMonitorNodeSpec() {
        return monitorNodeSpec;
    }

    /**
     * set Monitor节点规格和数目
     *
     * @param monitorNodeSpec
     */
    public void setMonitorNodeSpec(NodeSpec monitorNodeSpec) {
        this.monitorNodeSpec = monitorNodeSpec;
    }


    /**
     * get 地域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


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
     * set 调整后的tikv节点数
     *
     * @param tikvNodeNum
     */
    public ModifyInstanceSpecRequest tikvNodeNum(Integer tikvNodeNum) {
        this.tikvNodeNum = tikvNodeNum;
        return this;
    }


    /**
     * set 调整后的pd节点数
     *
     * @param pdNodeNum
     */
    public ModifyInstanceSpecRequest pdNodeNum(Integer pdNodeNum) {
        this.pdNodeNum = pdNodeNum;
        return this;
    }


    /**
     * set TiDB节点规格和数目
     *
     * @param tidbNodeSpec
     */
    public ModifyInstanceSpecRequest tidbNodeSpec(NodeSpec tidbNodeSpec) {
        this.tidbNodeSpec = tidbNodeSpec;
        return this;
    }


    /**
     * set TiFlash节点规格和数目
     *
     * @param tiflashNodeSpec
     */
    public ModifyInstanceSpecRequest tiflashNodeSpec(NodeSpec tiflashNodeSpec) {
        this.tiflashNodeSpec = tiflashNodeSpec;
        return this;
    }


    /**
     * set Ticdc节点规格和数目
     *
     * @param ticdcNodeSpec
     */
    public ModifyInstanceSpecRequest ticdcNodeSpec(NodeSpec ticdcNodeSpec) {
        this.ticdcNodeSpec = ticdcNodeSpec;
        return this;
    }


    /**
     * set Monitor节点规格和数目
     *
     * @param monitorNodeSpec
     */
    public ModifyInstanceSpecRequest monitorNodeSpec(NodeSpec monitorNodeSpec) {
        this.monitorNodeSpec = monitorNodeSpec;
        return this;
    }


    /**
     * set 地域代码
     *
     * @param regionId
     */
    public ModifyInstanceSpecRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public ModifyInstanceSpecRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}