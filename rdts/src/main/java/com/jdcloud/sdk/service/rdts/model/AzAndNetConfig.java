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

package com.jdcloud.sdk.service.rdts.model;


/**
 * 可用区与网络配置
 */
public class AzAndNetConfig  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 可用区，可选目的端实例的主节点可用区、或目的端实例的从节点可用区，空表示使用目的端实例的主节点可用区
     */
    private String azId;

    /**
     * vpc ID，必须与目的端实例所在vpc保持一致，否则网络不通，空表示使用目的端实例vpc
     */
    private String vpcId;

    /**
     * subnet ID，可以与目的端实例所在子网保持一致，如果该子网IP不足可选其他相通的子网，空表示使用目的端实例子网
     */
    private String subnetId;


    /**
     * get 可用区，可选目的端实例的主节点可用区、或目的端实例的从节点可用区，空表示使用目的端实例的主节点可用区
     *
     * @return
     */
    public String getAzId() {
        return azId;
    }

    /**
     * set 可用区，可选目的端实例的主节点可用区、或目的端实例的从节点可用区，空表示使用目的端实例的主节点可用区
     *
     * @param azId
     */
    public void setAzId(String azId) {
        this.azId = azId;
    }

    /**
     * get vpc ID，必须与目的端实例所在vpc保持一致，否则网络不通，空表示使用目的端实例vpc
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set vpc ID，必须与目的端实例所在vpc保持一致，否则网络不通，空表示使用目的端实例vpc
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get subnet ID，可以与目的端实例所在子网保持一致，如果该子网IP不足可选其他相通的子网，空表示使用目的端实例子网
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set subnet ID，可以与目的端实例所在子网保持一致，如果该子网IP不足可选其他相通的子网，空表示使用目的端实例子网
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }


    /**
     * set 可用区，可选目的端实例的主节点可用区、或目的端实例的从节点可用区，空表示使用目的端实例的主节点可用区
     *
     * @param azId
     */
    public AzAndNetConfig azId(String azId) {
        this.azId = azId;
        return this;
    }

    /**
     * set vpc ID，必须与目的端实例所在vpc保持一致，否则网络不通，空表示使用目的端实例vpc
     *
     * @param vpcId
     */
    public AzAndNetConfig vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set subnet ID，可以与目的端实例所在子网保持一致，如果该子网IP不足可选其他相通的子网，空表示使用目的端实例子网
     *
     * @param subnetId
     */
    public AzAndNetConfig subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }


}