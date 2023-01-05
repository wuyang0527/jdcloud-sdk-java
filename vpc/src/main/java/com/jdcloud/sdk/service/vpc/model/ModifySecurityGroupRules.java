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

import com.jdcloud.sdk.annotation.Required;

/**
 * modifySecurityGroupRules
 */
public class ModifySecurityGroupRules  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 安全组规则的ID。
     * Required:true
     */
    @Required
    private String ruleId;

    /**
     * 规则限定协议。300:All; 6:TCP; 17:UDP; 1:ICMP
     */
    private Number protocol;

    /**
     * 安全组规则的起始端口。取值范围：1-65535
     */
    private Integer fromPort;

    /**
     * 安全组规则的终端口。取值范围：1-65535
     */
    private Integer toPort;

    /**
     * 安全组规则前缀，取值范围：正确的CIDR
     */
    private String addressPrefix;

    /**
     * 安全组规则的描述，取值范围：0-256个UTF-8编码下的全部字符
     */
    private String description;



    /**
     * get 安全组规则的ID。
     *
     * @return
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * set 安全组规则的ID。
     *
     * @param ruleId
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
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
     * get 安全组规则的起始端口。取值范围：1-65535
     *
     * @return
     */
    public Integer getFromPort() {
        return fromPort;
    }

    /**
     * set 安全组规则的起始端口。取值范围：1-65535
     *
     * @param fromPort
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }


    /**
     * get 安全组规则的终端口。取值范围：1-65535
     *
     * @return
     */
    public Integer getToPort() {
        return toPort;
    }

    /**
     * set 安全组规则的终端口。取值范围：1-65535
     *
     * @param toPort
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }


    /**
     * get 安全组规则前缀，取值范围：正确的CIDR
     *
     * @return
     */
    public String getAddressPrefix() {
        return addressPrefix;
    }

    /**
     * set 安全组规则前缀，取值范围：正确的CIDR
     *
     * @param addressPrefix
     */
    public void setAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
    }


    /**
     * get 安全组规则的描述，取值范围：0-256个UTF-8编码下的全部字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 安全组规则的描述，取值范围：0-256个UTF-8编码下的全部字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }



    /**
     * set 安全组规则的ID。
     *
     * @param ruleId
     */
    public ModifySecurityGroupRules ruleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }


    /**
     * set 规则限定协议。300:All; 6:TCP; 17:UDP; 1:ICMP
     *
     * @param protocol
     */
    public ModifySecurityGroupRules protocol(Number protocol) {
        this.protocol = protocol;
        return this;
    }


    /**
     * set 安全组规则的起始端口。取值范围：1-65535
     *
     * @param fromPort
     */
    public ModifySecurityGroupRules fromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }


    /**
     * set 安全组规则的终端口。取值范围：1-65535
     *
     * @param toPort
     */
    public ModifySecurityGroupRules toPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }


    /**
     * set 安全组规则前缀，取值范围：正确的CIDR
     *
     * @param addressPrefix
     */
    public ModifySecurityGroupRules addressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }


    /**
     * set 安全组规则的描述，取值范围：0-256个UTF-8编码下的全部字符
     *
     * @param description
     */
    public ModifySecurityGroupRules description(String description) {
        this.description = description;
        return this;
    }


}