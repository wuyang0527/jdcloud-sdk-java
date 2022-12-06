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
 * Instance-Management
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建一个 TiDB 实例。创建时需要指定 TiDB 各类节点的数目，规格，存储空间等。 TiFlash和TiCDC节点在创建时不是必须的，可以在需要时，通过扩容的功能创建TiFlash和TiCDC节点。
 */
public class CreateInstanceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * instanceId
     */
    private String instanceId;

    /**
     * orderId
     */
    private String orderId;



    /**
     * get instanceId
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set instanceId
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get orderId
     *
     * @return
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * set orderId
     *
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }



    /**
     * set instanceId
     *
     * @param instanceId
     */
    public CreateInstanceResult instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set orderId
     *
     * @param orderId
     */
    public CreateInstanceResult orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }


}