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
 * Agent Heartbeat APIs
 * Agent心跳接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * heartBeatRequest
 */
public class HeartBeatRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * agent ip
     */
    private String agent_ip;

    /**
     * agent类型
     */
    private String agent_type;

    /**
     * node
     */
    private String node;

    /**
     * 集群
     */
    private String cluster;

    /**
     * 配置版本
     */
    private String conf_version;

    /**
     * 设备id
     */
    private String devId;

    /**
     * agent产品类型
     */
    private String product;

    /**
     * 机房
     */
    private String zone;

    /**
     * node-ip字段
     */
    private String nodeIp;

    /**
     * agent url
     */
    private String agentUrl;

    /**
     * node name
     */
    private String nodeName;

    /**
     * 指令通道
     */
    private String commandChannel;

    /**
     * 指令执行方式
     */
    private String commandExecuteMethod;

    /**
     * 最大版本号
     */
    private String maxConfVersion;

    /**
     * agent版本号
     */
    private String agentVersion;

    /**
     * 集群来源标识
     */
    private String source;



    /**
     * get agent ip
     *
     * @return
     */
    public String getAgent_ip() {
        return agent_ip;
    }

    /**
     * set agent ip
     *
     * @param agent_ip
     */
    public void setAgent_ip(String agent_ip) {
        this.agent_ip = agent_ip;
    }


    /**
     * get agent类型
     *
     * @return
     */
    public String getAgent_type() {
        return agent_type;
    }

    /**
     * set agent类型
     *
     * @param agent_type
     */
    public void setAgent_type(String agent_type) {
        this.agent_type = agent_type;
    }


    /**
     * get node
     *
     * @return
     */
    public String getNode() {
        return node;
    }

    /**
     * set node
     *
     * @param node
     */
    public void setNode(String node) {
        this.node = node;
    }


    /**
     * get 集群
     *
     * @return
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * set 集群
     *
     * @param cluster
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }


    /**
     * get 配置版本
     *
     * @return
     */
    public String getConf_version() {
        return conf_version;
    }

    /**
     * set 配置版本
     *
     * @param conf_version
     */
    public void setConf_version(String conf_version) {
        this.conf_version = conf_version;
    }


    /**
     * get 设备id
     *
     * @return
     */
    public String getDevId() {
        return devId;
    }

    /**
     * set 设备id
     *
     * @param devId
     */
    public void setDevId(String devId) {
        this.devId = devId;
    }


    /**
     * get agent产品类型
     *
     * @return
     */
    public String getProduct() {
        return product;
    }

    /**
     * set agent产品类型
     *
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }


    /**
     * get 机房
     *
     * @return
     */
    public String getZone() {
        return zone;
    }

    /**
     * set 机房
     *
     * @param zone
     */
    public void setZone(String zone) {
        this.zone = zone;
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
     * get agent url
     *
     * @return
     */
    public String getAgentUrl() {
        return agentUrl;
    }

    /**
     * set agent url
     *
     * @param agentUrl
     */
    public void setAgentUrl(String agentUrl) {
        this.agentUrl = agentUrl;
    }


    /**
     * get node name
     *
     * @return
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * set node name
     *
     * @param nodeName
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }


    /**
     * get 指令通道
     *
     * @return
     */
    public String getCommandChannel() {
        return commandChannel;
    }

    /**
     * set 指令通道
     *
     * @param commandChannel
     */
    public void setCommandChannel(String commandChannel) {
        this.commandChannel = commandChannel;
    }


    /**
     * get 指令执行方式
     *
     * @return
     */
    public String getCommandExecuteMethod() {
        return commandExecuteMethod;
    }

    /**
     * set 指令执行方式
     *
     * @param commandExecuteMethod
     */
    public void setCommandExecuteMethod(String commandExecuteMethod) {
        this.commandExecuteMethod = commandExecuteMethod;
    }


    /**
     * get 最大版本号
     *
     * @return
     */
    public String getMaxConfVersion() {
        return maxConfVersion;
    }

    /**
     * set 最大版本号
     *
     * @param maxConfVersion
     */
    public void setMaxConfVersion(String maxConfVersion) {
        this.maxConfVersion = maxConfVersion;
    }


    /**
     * get agent版本号
     *
     * @return
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    /**
     * set agent版本号
     *
     * @param agentVersion
     */
    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }


    /**
     * get 集群来源标识
     *
     * @return
     */
    public String getSource() {
        return source;
    }

    /**
     * set 集群来源标识
     *
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }



    /**
     * set agent ip
     *
     * @param agent_ip
     */
    public HeartBeatRequest agent_ip(String agent_ip) {
        this.agent_ip = agent_ip;
        return this;
    }


    /**
     * set agent类型
     *
     * @param agent_type
     */
    public HeartBeatRequest agent_type(String agent_type) {
        this.agent_type = agent_type;
        return this;
    }


    /**
     * set node
     *
     * @param node
     */
    public HeartBeatRequest node(String node) {
        this.node = node;
        return this;
    }


    /**
     * set 集群
     *
     * @param cluster
     */
    public HeartBeatRequest cluster(String cluster) {
        this.cluster = cluster;
        return this;
    }


    /**
     * set 配置版本
     *
     * @param conf_version
     */
    public HeartBeatRequest conf_version(String conf_version) {
        this.conf_version = conf_version;
        return this;
    }


    /**
     * set 设备id
     *
     * @param devId
     */
    public HeartBeatRequest devId(String devId) {
        this.devId = devId;
        return this;
    }


    /**
     * set agent产品类型
     *
     * @param product
     */
    public HeartBeatRequest product(String product) {
        this.product = product;
        return this;
    }


    /**
     * set 机房
     *
     * @param zone
     */
    public HeartBeatRequest zone(String zone) {
        this.zone = zone;
        return this;
    }


    /**
     * set node-ip字段
     *
     * @param nodeIp
     */
    public HeartBeatRequest nodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }


    /**
     * set agent url
     *
     * @param agentUrl
     */
    public HeartBeatRequest agentUrl(String agentUrl) {
        this.agentUrl = agentUrl;
        return this;
    }


    /**
     * set node name
     *
     * @param nodeName
     */
    public HeartBeatRequest nodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }


    /**
     * set 指令通道
     *
     * @param commandChannel
     */
    public HeartBeatRequest commandChannel(String commandChannel) {
        this.commandChannel = commandChannel;
        return this;
    }


    /**
     * set 指令执行方式
     *
     * @param commandExecuteMethod
     */
    public HeartBeatRequest commandExecuteMethod(String commandExecuteMethod) {
        this.commandExecuteMethod = commandExecuteMethod;
        return this;
    }


    /**
     * set 最大版本号
     *
     * @param maxConfVersion
     */
    public HeartBeatRequest maxConfVersion(String maxConfVersion) {
        this.maxConfVersion = maxConfVersion;
        return this;
    }


    /**
     * set agent版本号
     *
     * @param agentVersion
     */
    public HeartBeatRequest agentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }


    /**
     * set 集群来源标识
     *
     * @param source
     */
    public HeartBeatRequest source(String source) {
        this.source = source;
        return this;
    }


}