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
 * disassociateElasticIpSpec
 */
public class DisassociateElasticIpSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指定解绑的弹性Ip Id
     */
    private String elasticIpId;

    /**
     * 指定解绑的弹性Ip地址
     */
    private String elasticIpAddress;



    /**
     * get 指定解绑的弹性Ip Id
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set 指定解绑的弹性Ip Id
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
    }


    /**
     * get 指定解绑的弹性Ip地址
     *
     * @return
     */
    public String getElasticIpAddress() {
        return elasticIpAddress;
    }

    /**
     * set 指定解绑的弹性Ip地址
     *
     * @param elasticIpAddress
     */
    public void setElasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
    }



    /**
     * set 指定解绑的弹性Ip Id
     *
     * @param elasticIpId
     */
    public DisassociateElasticIpSpec elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }


    /**
     * set 指定解绑的弹性Ip地址
     *
     * @param elasticIpAddress
     */
    public DisassociateElasticIpSpec elasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
        return this;
    }


}