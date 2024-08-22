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
 * JDCLOUD Invoice API
 * 京东云发票
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.invoice.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询订单关联发票信息
 */
public class GetOrderRelateInvoiceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号
     * Required:true
     */
    @Required
    private String orderId;

    /**
     * 地域编码，参考OpenAPI公共说明
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 订单号
     *
     * @return
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * set 订单号
     *
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * get 地域编码，参考OpenAPI公共说明
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域编码，参考OpenAPI公共说明
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 订单号
     *
     * @param orderId
     */
    public GetOrderRelateInvoiceRequest orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }


    /**
     * set 地域编码，参考OpenAPI公共说明
     *
     * @param regionId
     */
    public GetOrderRelateInvoiceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}