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
 * Iotlink-Related-API
 * 物联网卡服务相关API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotlink.model;

import com.jdcloud.sdk.service.iotlink.model.SimRealNameRegResp;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 物联网卡移动实名登记接口
 */
public class SimRealNameRegResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 请求状态(0:成功;其他:失败)
     */
    private String status;

    /**
     * 消息描述
     */
    private String message;

    /**
     * 物联网卡移动实名登记信息
     */
    private SimRealNameRegResp result;



    /**
     * get 请求状态(0:成功;其他:失败)
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 请求状态(0:成功;其他:失败)
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 消息描述
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 消息描述
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * get 物联网卡移动实名登记信息
     *
     * @return
     */
    public SimRealNameRegResp getResult() {
        return result;
    }

    /**
     * set 物联网卡移动实名登记信息
     *
     * @param result
     */
    public void setResult(SimRealNameRegResp result) {
        this.result = result;
    }



    /**
     * set 请求状态(0:成功;其他:失败)
     *
     * @param status
     */
    public SimRealNameRegResult status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 消息描述
     *
     * @param message
     */
    public SimRealNameRegResult message(String message) {
        this.message = message;
        return this;
    }


    /**
     * set 物联网卡移动实名登记信息
     *
     * @param result
     */
    public SimRealNameRegResult result(SimRealNameRegResp result) {
        this.result = result;
        return this;
    }


}