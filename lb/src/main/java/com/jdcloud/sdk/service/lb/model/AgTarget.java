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

package com.jdcloud.sdk.service.lb.model;


/**
 * agTarget
 */
public class AgTarget  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Target的Id
     */
    private String targetId;

    /**
     * TargetGroup的Id, target 属于 targetGroup 或者 AG, target 从属于 AG 时,该字段无用
     */
    private String targetGroupId;

    /**
     * 高可用组(ag)的id, target 属于 targetGroup 或者 AG, target 从属于 targetGroup 时,该字段无用
     */
    private String agId;

    /**
     * Target的类型，取值为vm、container或ip, 默认为vm
     */
    private String type;

    /**
     * Target所属实例（vm或container）的Id
     */
    private String instanceId;

    /**
     * Target提供服务的端口，取值范围：0-65535，其中0表示与backend的端口相同，默认为0。 &lt;br&gt;【dnlb】使用限制：dnlb同一TargetGroup下，同一实例/ip仅允许一个端口提供服务
     */
    private Integer port;

    /**
     * 该Target的权重，取值范围：0-100 ，默认为10。0表示不参与流量转发，仅alb支持权重为0的target
     */
    private Integer weight;

    /**
     * Target所属实例（vm或container）的内网IP地址
     */
    private String privateIpAddress;

    /**
     * Target的IP地址。当Target类型为vm或container时，表示vm或container的内网IP地址；当Target类型为ip时，表示注册Target时指定的IP地址
     */
    private String ipAddress;



    /**
     * get Target的Id
     *
     * @return
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * set Target的Id
     *
     * @param targetId
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }


    /**
     * get TargetGroup的Id, target 属于 targetGroup 或者 AG, target 从属于 AG 时,该字段无用
     *
     * @return
     */
    public String getTargetGroupId() {
        return targetGroupId;
    }

    /**
     * set TargetGroup的Id, target 属于 targetGroup 或者 AG, target 从属于 AG 时,该字段无用
     *
     * @param targetGroupId
     */
    public void setTargetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
    }


    /**
     * get 高可用组(ag)的id, target 属于 targetGroup 或者 AG, target 从属于 targetGroup 时,该字段无用
     *
     * @return
     */
    public String getAgId() {
        return agId;
    }

    /**
     * set 高可用组(ag)的id, target 属于 targetGroup 或者 AG, target 从属于 targetGroup 时,该字段无用
     *
     * @param agId
     */
    public void setAgId(String agId) {
        this.agId = agId;
    }


    /**
     * get Target的类型，取值为vm、container或ip, 默认为vm
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set Target的类型，取值为vm、container或ip, 默认为vm
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * get Target所属实例（vm或container）的Id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set Target所属实例（vm或container）的Id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get Target提供服务的端口，取值范围：0-65535，其中0表示与backend的端口相同，默认为0。 &lt;br&gt;【dnlb】使用限制：dnlb同一TargetGroup下，同一实例/ip仅允许一个端口提供服务
     *
     * @return
     */
    public Integer getPort() {
        return port;
    }

    /**
     * set Target提供服务的端口，取值范围：0-65535，其中0表示与backend的端口相同，默认为0。 &lt;br&gt;【dnlb】使用限制：dnlb同一TargetGroup下，同一实例/ip仅允许一个端口提供服务
     *
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }


    /**
     * get 该Target的权重，取值范围：0-100 ，默认为10。0表示不参与流量转发，仅alb支持权重为0的target
     *
     * @return
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * set 该Target的权重，取值范围：0-100 ，默认为10。0表示不参与流量转发，仅alb支持权重为0的target
     *
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    /**
     * get Target所属实例（vm或container）的内网IP地址
     *
     * @return
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * set Target所属实例（vm或container）的内网IP地址
     *
     * @param privateIpAddress
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }


    /**
     * get Target的IP地址。当Target类型为vm或container时，表示vm或container的内网IP地址；当Target类型为ip时，表示注册Target时指定的IP地址
     *
     * @return
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * set Target的IP地址。当Target类型为vm或container时，表示vm或container的内网IP地址；当Target类型为ip时，表示注册Target时指定的IP地址
     *
     * @param ipAddress
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }



    /**
     * set Target的Id
     *
     * @param targetId
     */
    public AgTarget targetId(String targetId) {
        this.targetId = targetId;
        return this;
    }


    /**
     * set TargetGroup的Id, target 属于 targetGroup 或者 AG, target 从属于 AG 时,该字段无用
     *
     * @param targetGroupId
     */
    public AgTarget targetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
        return this;
    }


    /**
     * set 高可用组(ag)的id, target 属于 targetGroup 或者 AG, target 从属于 targetGroup 时,该字段无用
     *
     * @param agId
     */
    public AgTarget agId(String agId) {
        this.agId = agId;
        return this;
    }


    /**
     * set Target的类型，取值为vm、container或ip, 默认为vm
     *
     * @param type
     */
    public AgTarget type(String type) {
        this.type = type;
        return this;
    }


    /**
     * set Target所属实例（vm或container）的Id
     *
     * @param instanceId
     */
    public AgTarget instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set Target提供服务的端口，取值范围：0-65535，其中0表示与backend的端口相同，默认为0。 &lt;br&gt;【dnlb】使用限制：dnlb同一TargetGroup下，同一实例/ip仅允许一个端口提供服务
     *
     * @param port
     */
    public AgTarget port(Integer port) {
        this.port = port;
        return this;
    }


    /**
     * set 该Target的权重，取值范围：0-100 ，默认为10。0表示不参与流量转发，仅alb支持权重为0的target
     *
     * @param weight
     */
    public AgTarget weight(Integer weight) {
        this.weight = weight;
        return this;
    }


    /**
     * set Target所属实例（vm或container）的内网IP地址
     *
     * @param privateIpAddress
     */
    public AgTarget privateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }


    /**
     * set Target的IP地址。当Target类型为vm或container时，表示vm或container的内网IP地址；当Target类型为ip时，表示注册Target时指定的IP地址
     *
     * @param ipAddress
     */
    public AgTarget ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }


}