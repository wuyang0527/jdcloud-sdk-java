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
 * modifyBandwidthPackageIpBandwidthSpec
 */
public class ModifyBandwidthPackageIpBandwidthSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公网IP ID，当为弹性公网IP时，为elasticIpId。
     * Required:true
     */
    @Required
    private String publicIpId;

    /**
     * 单个公网IP带宽上限，单位为Mbps，大小不能超过共享带宽包的带宽上限，还可配置0和-1，0表示禁止流量通过， -1表示关闭单个公网IP带宽限速，默认值为-1
     */
    private Integer bandwidthMbps;


    /**
     * get 公网IP ID，当为弹性公网IP时，为elasticIpId。
     *
     * @return
     */
    public String getPublicIpId() {
        return publicIpId;
    }

    /**
     * set 公网IP ID，当为弹性公网IP时，为elasticIpId。
     *
     * @param publicIpId
     */
    public void setPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
    }

    /**
     * get 单个公网IP带宽上限，单位为Mbps，大小不能超过共享带宽包的带宽上限，还可配置0和-1，0表示禁止流量通过， -1表示关闭单个公网IP带宽限速，默认值为-1
     *
     * @return
     */
    public Integer getBandwidthMbps() {
        return bandwidthMbps;
    }

    /**
     * set 单个公网IP带宽上限，单位为Mbps，大小不能超过共享带宽包的带宽上限，还可配置0和-1，0表示禁止流量通过， -1表示关闭单个公网IP带宽限速，默认值为-1
     *
     * @param bandwidthMbps
     */
    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }


    /**
     * set 公网IP ID，当为弹性公网IP时，为elasticIpId。
     *
     * @param publicIpId
     */
    public ModifyBandwidthPackageIpBandwidthSpec publicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
        return this;
    }

    /**
     * set 单个公网IP带宽上限，单位为Mbps，大小不能超过共享带宽包的带宽上限，还可配置0和-1，0表示禁止流量通过， -1表示关闭单个公网IP带宽限速，默认值为-1
     *
     * @param bandwidthMbps
     */
    public ModifyBandwidthPackageIpBandwidthSpec bandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
        return this;
    }


}