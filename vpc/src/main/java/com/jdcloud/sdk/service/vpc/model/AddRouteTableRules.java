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
 * addRouteTableRules
 */
public class AddRouteTableRules  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 下一跳类型, 取值范围:instance:云主机, internet:公网, vpc_peering:vpc对等连接, bgw:边界网关, natgw:NAT网关, elastic_network_interface:弹性网卡(主网卡不允许), havip:高可用虚拟IP
     * Required:true
     */
    @Required
    private String nextHopType;

    /**
     * 下一跳id
     * Required:true
     */
    @Required
    private String nextHopId;

    /**
     * 匹配地址前缀, internet类型路由跟其他类型的路由，addressPrefix不允许重复
     * Required:true
     */
    @Required
    private String addressPrefix;

    /**
     * 规则匹配优先级，取值范围[1,255]，默认为100。当路由规则子网掩码不同时，路由最长匹配优先；当路由规则子网掩码相同时, 按照优先级匹配转发, 优先级数字越小优先级越高，路由规则子网掩码相同、优先级相同、下一跳不同时，形成等价路由，不同下一跳负载均担。
     */
    private Number priority;

    /**
     * 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;



    /**
     * get 下一跳类型, 取值范围:instance:云主机, internet:公网, vpc_peering:vpc对等连接, bgw:边界网关, natgw:NAT网关, elastic_network_interface:弹性网卡(主网卡不允许), havip:高可用虚拟IP
     *
     * @return
     */
    public String getNextHopType() {
        return nextHopType;
    }

    /**
     * set 下一跳类型, 取值范围:instance:云主机, internet:公网, vpc_peering:vpc对等连接, bgw:边界网关, natgw:NAT网关, elastic_network_interface:弹性网卡(主网卡不允许), havip:高可用虚拟IP
     *
     * @param nextHopType
     */
    public void setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
    }


    /**
     * get 下一跳id
     *
     * @return
     */
    public String getNextHopId() {
        return nextHopId;
    }

    /**
     * set 下一跳id
     *
     * @param nextHopId
     */
    public void setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
    }


    /**
     * get 匹配地址前缀, internet类型路由跟其他类型的路由，addressPrefix不允许重复
     *
     * @return
     */
    public String getAddressPrefix() {
        return addressPrefix;
    }

    /**
     * set 匹配地址前缀, internet类型路由跟其他类型的路由，addressPrefix不允许重复
     *
     * @param addressPrefix
     */
    public void setAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
    }


    /**
     * get 规则匹配优先级，取值范围[1,255]，默认为100。当路由规则子网掩码不同时，路由最长匹配优先；当路由规则子网掩码相同时, 按照优先级匹配转发, 优先级数字越小优先级越高，路由规则子网掩码相同、优先级相同、下一跳不同时，形成等价路由，不同下一跳负载均担。
     *
     * @return
     */
    public Number getPriority() {
        return priority;
    }

    /**
     * set 规则匹配优先级，取值范围[1,255]，默认为100。当路由规则子网掩码不同时，路由最长匹配优先；当路由规则子网掩码相同时, 按照优先级匹配转发, 优先级数字越小优先级越高，路由规则子网掩码相同、优先级相同、下一跳不同时，形成等价路由，不同下一跳负载均担。
     *
     * @param priority
     */
    public void setPriority(Number priority) {
        this.priority = priority;
    }


    /**
     * get 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }



    /**
     * set 下一跳类型, 取值范围:instance:云主机, internet:公网, vpc_peering:vpc对等连接, bgw:边界网关, natgw:NAT网关, elastic_network_interface:弹性网卡(主网卡不允许), havip:高可用虚拟IP
     *
     * @param nextHopType
     */
    public AddRouteTableRules nextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }


    /**
     * set 下一跳id
     *
     * @param nextHopId
     */
    public AddRouteTableRules nextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }


    /**
     * set 匹配地址前缀, internet类型路由跟其他类型的路由，addressPrefix不允许重复
     *
     * @param addressPrefix
     */
    public AddRouteTableRules addressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }


    /**
     * set 规则匹配优先级，取值范围[1,255]，默认为100。当路由规则子网掩码不同时，路由最长匹配优先；当路由规则子网掩码相同时, 按照优先级匹配转发, 优先级数字越小优先级越高，路由规则子网掩码相同、优先级相同、下一跳不同时，形成等价路由，不同下一跳负载均担。
     *
     * @param priority
     */
    public AddRouteTableRules priority(Number priority) {
        this.priority = priority;
        return this;
    }


    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public AddRouteTableRules description(String description) {
        this.description = description;
        return this;
    }


}