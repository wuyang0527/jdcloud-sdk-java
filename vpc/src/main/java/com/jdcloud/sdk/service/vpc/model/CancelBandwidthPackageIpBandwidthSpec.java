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
 * cancelBandwidthPackageIpBandwidthSpec
 */
public class CancelBandwidthPackageIpBandwidthSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 绑定的Ip Id
     */
    private String elasticIpId;


    /**
     * get 绑定的Ip Id
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set 绑定的Ip Id
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
    }


    /**
     * set 绑定的Ip Id
     *
     * @param elasticIpId
     */
    public CancelBandwidthPackageIpBandwidthSpec elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }


}