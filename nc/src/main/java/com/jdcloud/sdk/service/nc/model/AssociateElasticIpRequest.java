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
 * 原生容器
 * 原生容器相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.nc.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 容器绑定弹性公网 IP，绑定的是主网卡、主内网IP对应的弹性IP. &lt;br&gt;
一台云主机只能绑定一个弹性公网 IP(主网卡)，若主网卡已存在弹性公网IP，会返回错误。&lt;br&gt;
如果是黑名单中的用户，会返回错误。

 */
public class AssociateElasticIpRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性IP ID
     * Required:true
     */
    @Required
    private String elasticIpId;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Container ID
     * Required:true
     */
    @Required
    private String containerId;


    /**
     * get 弹性IP ID
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set 弹性IP ID
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
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
     * get Container ID
     *
     * @return
     */
    public String getContainerId() {
        return containerId;
    }

    /**
     * set Container ID
     *
     * @param containerId
     */
    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }


    /**
     * set 弹性IP ID
     *
     * @param elasticIpId
     */
    public AssociateElasticIpRequest elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public AssociateElasticIpRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Container ID
     *
     * @param containerId
     */
    public AssociateElasticIpRequest containerId(String containerId) {
        this.containerId = containerId;
        return this;
    }


}