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

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.service.vpc.model.NetworkInterfaceSpec;
import com.jdcloud.sdk.annotation.Required;

/**
 * 主网卡配置信息。
 */
public class NetworkInterfaceAttachmentSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指明删除pod时是否删除网卡，主网卡默认是true,辅助网卡默认false
     */
    private Boolean autoDelete;

    /**
     * 设备Index，目前pod只支持一个网卡，所以只能设置为1
     */
    private Integer deviceIndex;

    /**
     * 网卡接口规范
     * Required:true
     */
    @Required
    private NetworkInterfaceSpec networkInterface;



    /**
     * get 指明删除pod时是否删除网卡，主网卡默认是true,辅助网卡默认false
     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 指明删除pod时是否删除网卡，主网卡默认是true,辅助网卡默认false
     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }


    /**
     * get 设备Index，目前pod只支持一个网卡，所以只能设置为1
     *
     * @return
     */
    public Integer getDeviceIndex() {
        return deviceIndex;
    }

    /**
     * set 设备Index，目前pod只支持一个网卡，所以只能设置为1
     *
     * @param deviceIndex
     */
    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }


    /**
     * get 网卡接口规范
     *
     * @return
     */
    public NetworkInterfaceSpec getNetworkInterface() {
        return networkInterface;
    }

    /**
     * set 网卡接口规范
     *
     * @param networkInterface
     */
    public void setNetworkInterface(NetworkInterfaceSpec networkInterface) {
        this.networkInterface = networkInterface;
    }



    /**
     * set 指明删除pod时是否删除网卡，主网卡默认是true,辅助网卡默认false
     *
     * @param autoDelete
     */
    public NetworkInterfaceAttachmentSpec autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }


    /**
     * set 设备Index，目前pod只支持一个网卡，所以只能设置为1
     *
     * @param deviceIndex
     */
    public NetworkInterfaceAttachmentSpec deviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }


    /**
     * set 网卡接口规范
     *
     * @param networkInterface
     */
    public NetworkInterfaceAttachmentSpec networkInterface(NetworkInterfaceSpec networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }


}