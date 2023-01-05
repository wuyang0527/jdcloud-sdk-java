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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;

/**
 * createBandwidthPackageSpec
 */
public class CreateBandwidthPackageSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 名称，只支持中文、数字、大小写字母、英文下划线“_”及中划线“-”，且长度不超过32个字符
     * Required:true
     */
    @Required
    private String name;

    /**
     * 描述，长度不超过256个字符
     */
    private String description;

    /**
     * 共享带宽包带宽上限，取值范围200-5000，单位为Mbps，保底带宽 &#x3D; 共享带宽包带宽上限 * 20%
     * Required:true
     */
    @Required
    private Integer bandwidthMbps;

    /**
     * 线路信息，默认bgp，目前只支持中心节点的BGP线路
     */
    private String provider;

    /**
     * 计费配置。支持包年包月、按配置、按用量计费模式
     */
    private ChargeSpec chargeSpec;

    /**
     * 用户标签
     */
    
    private List<Tag> userTags;
    /**
     * 资源所属资源组ID
     */
    private String resourceGroupId;



    /**
     * get 名称，只支持中文、数字、大小写字母、英文下划线“_”及中划线“-”，且长度不超过32个字符
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称，只支持中文、数字、大小写字母、英文下划线“_”及中划线“-”，且长度不超过32个字符
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 描述，长度不超过256个字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述，长度不超过256个字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 共享带宽包带宽上限，取值范围200-5000，单位为Mbps，保底带宽 &#x3D; 共享带宽包带宽上限 * 20%
     *
     * @return
     */
    public Integer getBandwidthMbps() {
        return bandwidthMbps;
    }

    /**
     * set 共享带宽包带宽上限，取值范围200-5000，单位为Mbps，保底带宽 &#x3D; 共享带宽包带宽上限 * 20%
     *
     * @param bandwidthMbps
     */
    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }


    /**
     * get 线路信息，默认bgp，目前只支持中心节点的BGP线路
     *
     * @return
     */
    public String getProvider() {
        return provider;
    }

    /**
     * set 线路信息，默认bgp，目前只支持中心节点的BGP线路
     *
     * @param provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }


    /**
     * get 计费配置。支持包年包月、按配置、按用量计费模式
     *
     * @return
     */
    public ChargeSpec getChargeSpec() {
        return chargeSpec;
    }

    /**
     * set 计费配置。支持包年包月、按配置、按用量计费模式
     *
     * @param chargeSpec
     */
    public void setChargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
    }


    /**
    * get 用户标签
    *
    * @return
    */
    public List<Tag> getUserTags() {
        return userTags;
    }

    /**
    * set 用户标签
    *
    * @param userTags
    */
    public void setUserTags(List<Tag> userTags) {
        this.userTags = userTags;
    }


    /**
     * get 资源所属资源组ID
     *
     * @return
     */
    public String getResourceGroupId() {
        return resourceGroupId;
    }

    /**
     * set 资源所属资源组ID
     *
     * @param resourceGroupId
     */
    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }



    /**
     * set 名称，只支持中文、数字、大小写字母、英文下划线“_”及中划线“-”，且长度不超过32个字符
     *
     * @param name
     */
    public CreateBandwidthPackageSpec name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 描述，长度不超过256个字符
     *
     * @param description
     */
    public CreateBandwidthPackageSpec description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 共享带宽包带宽上限，取值范围200-5000，单位为Mbps，保底带宽 &#x3D; 共享带宽包带宽上限 * 20%
     *
     * @param bandwidthMbps
     */
    public CreateBandwidthPackageSpec bandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
        return this;
    }


    /**
     * set 线路信息，默认bgp，目前只支持中心节点的BGP线路
     *
     * @param provider
     */
    public CreateBandwidthPackageSpec provider(String provider) {
        this.provider = provider;
        return this;
    }


    /**
     * set 计费配置。支持包年包月、按配置、按用量计费模式
     *
     * @param chargeSpec
     */
    public CreateBandwidthPackageSpec chargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
        return this;
    }


    /**
    * set 用户标签
    *
    * @param userTags
    */
    public CreateBandwidthPackageSpec userTags(List<Tag> userTags) {
        this.userTags = userTags;
        return this;
    }


    /**
     * set 资源所属资源组ID
     *
     * @param resourceGroupId
     */
    public CreateBandwidthPackageSpec resourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }



    /**
     * add item to 用户标签
     *
     * @param userTag
     */
    public void addUserTag(Tag userTag) {
        if (this.userTags == null) {
            this.userTags = new ArrayList<>();
        }
        this.userTags.add(userTag);
    }
}