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
 * Elastic-IP
 * 弹性公网IP相关接口
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
 * 修改弹性公网IP，当弹性公网IP加入共享带宽包后，此公网IP限速需要调用共享带宽包的接口（修改共享带宽包内公网IP带宽上限）
 */
public class ModifyElasticIpRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性公网IP的限速（单位：Mbps），取值范围为[1-200]
     * Required:true
     */
    @Required
    private Integer bandwidthMbps;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * ElasticIp ID
     * Required:true
     */
    @Required
    private String elasticIpId;


    /**
     * get 弹性公网IP的限速（单位：Mbps），取值范围为[1-200]
     *
     * @return
     */
    public Integer getBandwidthMbps() {
        return bandwidthMbps;
    }

    /**
     * set 弹性公网IP的限速（单位：Mbps），取值范围为[1-200]
     *
     * @param bandwidthMbps
     */
    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
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
     * get ElasticIp ID
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set ElasticIp ID
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
    }


    /**
     * set 弹性公网IP的限速（单位：Mbps），取值范围为[1-200]
     *
     * @param bandwidthMbps
     */
    public ModifyElasticIpRequest bandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyElasticIpRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set ElasticIp ID
     *
     * @param elasticIpId
     */
    public ModifyElasticIpRequest elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }


}