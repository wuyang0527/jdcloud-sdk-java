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

package com.jdcloud.sdk.service.iotcore.model;


/**
 * deviceOnlineInfo
 */
public class DeviceOnlineInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备ID
     */
    private String device_id;

    /**
     * 在线时长
     */
    private Integer online_time;

    /**
     * 上线次数
     */
    private Integer count_time;

    /**
     * 连接码
     */
    private String identifier;

    /**
     * 设备状态
     */
    private Integer status;

    /**
     * 采集器类型
     */
    private String collDeviceType;


    /**
     * get 设备ID
     *
     * @return
     */
    public String getDevice_id() {
        return device_id;
    }

    /**
     * set 设备ID
     *
     * @param device_id
     */
    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    /**
     * get 在线时长
     *
     * @return
     */
    public Integer getOnline_time() {
        return online_time;
    }

    /**
     * set 在线时长
     *
     * @param online_time
     */
    public void setOnline_time(Integer online_time) {
        this.online_time = online_time;
    }

    /**
     * get 上线次数
     *
     * @return
     */
    public Integer getCount_time() {
        return count_time;
    }

    /**
     * set 上线次数
     *
     * @param count_time
     */
    public void setCount_time(Integer count_time) {
        this.count_time = count_time;
    }

    /**
     * get 连接码
     *
     * @return
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * set 连接码
     *
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * get 设备状态
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 设备状态
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 采集器类型
     *
     * @return
     */
    public String getCollDeviceType() {
        return collDeviceType;
    }

    /**
     * set 采集器类型
     *
     * @param collDeviceType
     */
    public void setCollDeviceType(String collDeviceType) {
        this.collDeviceType = collDeviceType;
    }


    /**
     * set 设备ID
     *
     * @param device_id
     */
    public DeviceOnlineInfo device_id(String device_id) {
        this.device_id = device_id;
        return this;
    }

    /**
     * set 在线时长
     *
     * @param online_time
     */
    public DeviceOnlineInfo online_time(Integer online_time) {
        this.online_time = online_time;
        return this;
    }

    /**
     * set 上线次数
     *
     * @param count_time
     */
    public DeviceOnlineInfo count_time(Integer count_time) {
        this.count_time = count_time;
        return this;
    }

    /**
     * set 连接码
     *
     * @param identifier
     */
    public DeviceOnlineInfo identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * set 设备状态
     *
     * @param status
     */
    public DeviceOnlineInfo status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 采集器类型
     *
     * @param collDeviceType
     */
    public DeviceOnlineInfo collDeviceType(String collDeviceType) {
        this.collDeviceType = collDeviceType;
        return this;
    }


}