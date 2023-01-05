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


/**
 * securityGroupRule
 */
public class SecurityGroupRule  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 安全组规则ID
     */
    private String ruleId;

    /**
     * 安全组规则方向。0：入规则; 1：出规则
     */
    private Number direction;

    /**
     * 规则限定协议。300:All; 6:TCP; 17:UDP; 1:ICMP
     */
    private Number protocol;

    /**
     * 匹配地址前缀
     */
    private String addressPrefix;

    /**
     * 匹配地址协议版本。4：IPv4
     */
    private Number ipVersion;

    /**
     * 规则限定起始传输层端口, 默认1 ，若protocal不是传输层协议，恒为0
     */
    private Number fromPort;

    /**
     * 规则限定终止传输层端口, 默认1 ，若protocal不是传输层协议，恒为0
     */
    private Number toPort;

    /**
     * 安全组规则创建时间
     */
    private String createdTime;

    /**
     * 描述, 允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * 安全组规则类型, default：默认安全组规则，custom：自定义安全组规则
     */
    private String ruleType;



    /**
     * get 安全组规则ID
     *
     * @return
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * set 安全组规则ID
     *
     * @param ruleId
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }


    /**
     * get 安全组规则方向。0：入规则; 1：出规则
     *
     * @return
     */
    public Number getDirection() {
        return direction;
    }

    /**
     * set 安全组规则方向。0：入规则; 1：出规则
     *
     * @param direction
     */
    public void setDirection(Number direction) {
        this.direction = direction;
    }


    /**
     * get 规则限定协议。300:All; 6:TCP; 17:UDP; 1:ICMP
     *
     * @return
     */
    public Number getProtocol() {
        return protocol;
    }

    /**
     * set 规则限定协议。300:All; 6:TCP; 17:UDP; 1:ICMP
     *
     * @param protocol
     */
    public void setProtocol(Number protocol) {
        this.protocol = protocol;
    }


    /**
     * get 匹配地址前缀
     *
     * @return
     */
    public String getAddressPrefix() {
        return addressPrefix;
    }

    /**
     * set 匹配地址前缀
     *
     * @param addressPrefix
     */
    public void setAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
    }


    /**
     * get 匹配地址协议版本。4：IPv4
     *
     * @return
     */
    public Number getIpVersion() {
        return ipVersion;
    }

    /**
     * set 匹配地址协议版本。4：IPv4
     *
     * @param ipVersion
     */
    public void setIpVersion(Number ipVersion) {
        this.ipVersion = ipVersion;
    }


    /**
     * get 规则限定起始传输层端口, 默认1 ，若protocal不是传输层协议，恒为0
     *
     * @return
     */
    public Number getFromPort() {
        return fromPort;
    }

    /**
     * set 规则限定起始传输层端口, 默认1 ，若protocal不是传输层协议，恒为0
     *
     * @param fromPort
     */
    public void setFromPort(Number fromPort) {
        this.fromPort = fromPort;
    }


    /**
     * get 规则限定终止传输层端口, 默认1 ，若protocal不是传输层协议，恒为0
     *
     * @return
     */
    public Number getToPort() {
        return toPort;
    }

    /**
     * set 规则限定终止传输层端口, 默认1 ，若protocal不是传输层协议，恒为0
     *
     * @param toPort
     */
    public void setToPort(Number toPort) {
        this.toPort = toPort;
    }


    /**
     * get 安全组规则创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 安全组规则创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * get 描述, 允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述, 允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 安全组规则类型, default：默认安全组规则，custom：自定义安全组规则
     *
     * @return
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * set 安全组规则类型, default：默认安全组规则，custom：自定义安全组规则
     *
     * @param ruleType
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }



    /**
     * set 安全组规则ID
     *
     * @param ruleId
     */
    public SecurityGroupRule ruleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }


    /**
     * set 安全组规则方向。0：入规则; 1：出规则
     *
     * @param direction
     */
    public SecurityGroupRule direction(Number direction) {
        this.direction = direction;
        return this;
    }


    /**
     * set 规则限定协议。300:All; 6:TCP; 17:UDP; 1:ICMP
     *
     * @param protocol
     */
    public SecurityGroupRule protocol(Number protocol) {
        this.protocol = protocol;
        return this;
    }


    /**
     * set 匹配地址前缀
     *
     * @param addressPrefix
     */
    public SecurityGroupRule addressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }


    /**
     * set 匹配地址协议版本。4：IPv4
     *
     * @param ipVersion
     */
    public SecurityGroupRule ipVersion(Number ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }


    /**
     * set 规则限定起始传输层端口, 默认1 ，若protocal不是传输层协议，恒为0
     *
     * @param fromPort
     */
    public SecurityGroupRule fromPort(Number fromPort) {
        this.fromPort = fromPort;
        return this;
    }


    /**
     * set 规则限定终止传输层端口, 默认1 ，若protocal不是传输层协议，恒为0
     *
     * @param toPort
     */
    public SecurityGroupRule toPort(Number toPort) {
        this.toPort = toPort;
        return this;
    }


    /**
     * set 安全组规则创建时间
     *
     * @param createdTime
     */
    public SecurityGroupRule createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


    /**
     * set 描述, 允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public SecurityGroupRule description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 安全组规则类型, default：默认安全组规则，custom：自定义安全组规则
     *
     * @param ruleType
     */
    public SecurityGroupRule ruleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }


}