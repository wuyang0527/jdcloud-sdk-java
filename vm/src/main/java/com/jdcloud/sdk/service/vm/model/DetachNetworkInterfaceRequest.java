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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
为云主机解绑弹性网卡。

详细操作说明请参考帮助文档：[解绑弹性网卡](https://docs.jdcloud.com/cn/virtual-machines/detach-eni)

## 接口说明
- 实例状态必须为 &#x60;running&#x60; 或 &#x60;stopped&#x60; 状态，同时实例没有正在进行中的任务时才可以操作。
- 实例中的主网卡是不可以解绑和绑定的，解绑弹性网卡只支持解绑辅助网卡。

 */
public class DetachNetworkInterfaceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性网卡ID
     * Required:true
     */
    @Required
    private String networkInterfaceId;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云主机ID。
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 弹性网卡ID
     *
     * @return
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * set 弹性网卡ID
     *
     * @param networkInterfaceId
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * get 地域ID。
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 云主机ID。
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机ID。
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 弹性网卡ID
     *
     * @param networkInterfaceId
     */
    public DetachNetworkInterfaceRequest networkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public DetachNetworkInterfaceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 云主机ID。
     *
     * @param instanceId
     */
    public DetachNetworkInterfaceRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}