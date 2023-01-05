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
 * Subnet
 * 子网相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改子网接口
 */
public class ModifySubnetRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子网名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     */
    private String subnetName;

    /**
     * 子网描述信息，允许输入UTF-8编码下的全部字符，不超过256字符。
     */
    private String description;

    /**
     * 子网内预留网段掩码长度，此网段IP地址按照单个申请，子网内其余部分IP地址以网段形式分配。此参数非必选，缺省值为0，代表子网内所有IP地址都按照单个申请
     */
    private Integer ipMaskLen;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Subnet ID
     * Required:true
     */
    @Required
    private String subnetId;



    /**
     * get 子网名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @return
     */
    public String getSubnetName() {
        return subnetName;
    }

    /**
     * set 子网名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param subnetName
     */
    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }


    /**
     * get 子网描述信息，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 子网描述信息，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 子网内预留网段掩码长度，此网段IP地址按照单个申请，子网内其余部分IP地址以网段形式分配。此参数非必选，缺省值为0，代表子网内所有IP地址都按照单个申请
     *
     * @return
     */
    public Integer getIpMaskLen() {
        return ipMaskLen;
    }

    /**
     * set 子网内预留网段掩码长度，此网段IP地址按照单个申请，子网内其余部分IP地址以网段形式分配。此参数非必选，缺省值为0，代表子网内所有IP地址都按照单个申请
     *
     * @param ipMaskLen
     */
    public void setIpMaskLen(Integer ipMaskLen) {
        this.ipMaskLen = ipMaskLen;
    }


    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get Subnet ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set Subnet ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }



    /**
     * set 子网名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param subnetName
     */
    public ModifySubnetRequest subnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }


    /**
     * set 子网描述信息，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @param description
     */
    public ModifySubnetRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 子网内预留网段掩码长度，此网段IP地址按照单个申请，子网内其余部分IP地址以网段形式分配。此参数非必选，缺省值为0，代表子网内所有IP地址都按照单个申请
     *
     * @param ipMaskLen
     */
    public ModifySubnetRequest ipMaskLen(Integer ipMaskLen) {
        this.ipMaskLen = ipMaskLen;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifySubnetRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set Subnet ID
     *
     * @param subnetId
     */
    public ModifySubnetRequest subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }


}