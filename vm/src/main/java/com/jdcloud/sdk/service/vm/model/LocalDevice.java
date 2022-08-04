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

package com.jdcloud.sdk.service.vm.model;


/**
 * 本地设备详情。
 */
public class LocalDevice  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备类型。
     */
    private String deviceType;

    /**
     * 设备的型号。
     */
    private String productModel;

    /**
     * 设备ID。
     */
    private String deviceId;

    /**
     * 挂载状态，attached、attaching、detaching。
     */
    private String attachState;

    /**
     * 配置信息。
     */
    private Object setting;


    /**
     * get 设备类型。
     *
     * @return
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * set 设备类型。
     *
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * get 设备的型号。
     *
     * @return
     */
    public String getProductModel() {
        return productModel;
    }

    /**
     * set 设备的型号。
     *
     * @param productModel
     */
    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    /**
     * get 设备ID。
     *
     * @return
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set 设备ID。
     *
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * get 挂载状态，attached、attaching、detaching。
     *
     * @return
     */
    public String getAttachState() {
        return attachState;
    }

    /**
     * set 挂载状态，attached、attaching、detaching。
     *
     * @param attachState
     */
    public void setAttachState(String attachState) {
        this.attachState = attachState;
    }

    /**
     * get 配置信息。
     *
     * @return
     */
    public Object getSetting() {
        return setting;
    }

    /**
     * set 配置信息。
     *
     * @param setting
     */
    public void setSetting(Object setting) {
        this.setting = setting;
    }


    /**
     * set 设备类型。
     *
     * @param deviceType
     */
    public LocalDevice deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * set 设备的型号。
     *
     * @param productModel
     */
    public LocalDevice productModel(String productModel) {
        this.productModel = productModel;
        return this;
    }

    /**
     * set 设备ID。
     *
     * @param deviceId
     */
    public LocalDevice deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * set 挂载状态，attached、attaching、detaching。
     *
     * @param attachState
     */
    public LocalDevice attachState(String attachState) {
        this.attachState = attachState;
        return this;
    }

    /**
     * set 配置信息。
     *
     * @param setting
     */
    public LocalDevice setting(Object setting) {
        this.setting = setting;
        return this;
    }


}