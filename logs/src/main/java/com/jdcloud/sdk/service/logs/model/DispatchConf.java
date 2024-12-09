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

package com.jdcloud.sdk.service.logs.model;


/**
 * dispatchConf
 */
public class DispatchConf  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 租户字段
     */
    private String tenantName;

    /**
     * 集群字段
     */
    private String clusterName;

    /**
     * 机房字段
     */
    private String zoneName;

    /**
     * node-ip字段
     */
    private String nodeIp;

    /**
     * 采集配置字段
     */
    private String conf;



    /**
     * get 租户字段
     *
     * @return
     */
    public String getTenantName() {
        return tenantName;
    }

    /**
     * set 租户字段
     *
     * @param tenantName
     */
    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }


    /**
     * get 集群字段
     *
     * @return
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * set 集群字段
     *
     * @param clusterName
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }


    /**
     * get 机房字段
     *
     * @return
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * set 机房字段
     *
     * @param zoneName
     */
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }


    /**
     * get node-ip字段
     *
     * @return
     */
    public String getNodeIp() {
        return nodeIp;
    }

    /**
     * set node-ip字段
     *
     * @param nodeIp
     */
    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }


    /**
     * get 采集配置字段
     *
     * @return
     */
    public String getConf() {
        return conf;
    }

    /**
     * set 采集配置字段
     *
     * @param conf
     */
    public void setConf(String conf) {
        this.conf = conf;
    }



    /**
     * set 租户字段
     *
     * @param tenantName
     */
    public DispatchConf tenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }


    /**
     * set 集群字段
     *
     * @param clusterName
     */
    public DispatchConf clusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }


    /**
     * set 机房字段
     *
     * @param zoneName
     */
    public DispatchConf zoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }


    /**
     * set node-ip字段
     *
     * @param nodeIp
     */
    public DispatchConf nodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }


    /**
     * set 采集配置字段
     *
     * @param conf
     */
    public DispatchConf conf(String conf) {
        this.conf = conf;
        return this;
    }


}