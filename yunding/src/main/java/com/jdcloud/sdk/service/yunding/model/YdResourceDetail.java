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

package com.jdcloud.sdk.service.yunding.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * ydResourceDetail
 */
public class YdResourceDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * jdcloudPin
     * Required:true
     */
    @Required
    private String pin;

    /**
     * 云鼎 serviceCode
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 云鼎资源 id
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get jdcloudPin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set jdcloudPin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 云鼎 serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 云鼎 serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 云鼎资源 id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云鼎资源 id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set jdcloudPin
     *
     * @param pin
     */
    public YdResourceDetail pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 云鼎 serviceCode
     *
     * @param serviceCode
     */
    public YdResourceDetail serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 云鼎资源 id
     *
     * @param instanceId
     */
    public YdResourceDetail instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}