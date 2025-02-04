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
 * Order
 * Order API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建waf实例
 */
public class CreateInstanceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * buyId
     */
    private String buyId;

    /**
     * wafInstanceId
     */
    private String wafInstanceId;

    /**
     * orderNumber
     */
    private String orderNumber;


    /**
     * get buyId
     *
     * @return
     */
    public String getBuyId() {
        return buyId;
    }

    /**
     * set buyId
     *
     * @param buyId
     */
    public void setBuyId(String buyId) {
        this.buyId = buyId;
    }

    /**
     * get wafInstanceId
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set wafInstanceId
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }

    /**
     * get orderNumber
     *
     * @return
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * set orderNumber
     *
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * set buyId
     *
     * @param buyId
     */
    public CreateInstanceResult buyId(String buyId) {
        this.buyId = buyId;
        return this;
    }

    /**
     * set wafInstanceId
     *
     * @param wafInstanceId
     */
    public CreateInstanceResult wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set orderNumber
     *
     * @param orderNumber
     */
    public CreateInstanceResult orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }


}