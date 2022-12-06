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
 * 修改 TiDB 实例中各类节点中的数目与规格。支持 TiDB 节点和 Monitor 节点数目和规格的同时调整。 如果当前实例无 TiFlash 和 TiCDC 节点，那么在增加 TiFlash 和 TiCDC 节点数目时，可同时指定其规格。
 */
public class ModifyInstanceSpecResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * orderId
     */
    private String orderId;



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
     * set orderId
     *
     * @param orderId
     */
    public ModifyInstanceSpecResult orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }


}