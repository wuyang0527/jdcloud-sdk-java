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
 * NAT-Gateway
 * NAT网关相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建NAT网关接口
 */
public class CreateNatGatewayResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * NAT网关ID
     */
    private String natGatewayId;



    /**
     * get NAT网关ID
     *
     * @return
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    /**
     * set NAT网关ID
     *
     * @param natGatewayId
     */
    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }



    /**
     * set NAT网关ID
     *
     * @param natGatewayId
     */
    public CreateNatGatewayResult natGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }


}