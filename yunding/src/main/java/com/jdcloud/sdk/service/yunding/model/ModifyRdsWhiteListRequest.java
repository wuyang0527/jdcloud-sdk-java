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
 * yunding-rds
 * 云鼎-云数据库管理相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yunding.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改允许访问实例的IP白名单。白名单是允许访问当前实例的IP/IP段列表，缺省情况下，白名单对本VPC开放。如果用户开启了外网访问的功能，还需要对外网的IP配置白名单。
 */
public class ModifyRdsWhiteListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * IP或IP段，不同的IP/IP段之间用英文逗号分隔，例如0.0.0.0/0,192.168.0.10
     * Required:true
     */
    @Required
    private String ips;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get IP或IP段，不同的IP/IP段之间用英文逗号分隔，例如0.0.0.0/0,192.168.0.10
     *
     * @return
     */
    public String getIps() {
        return ips;
    }

    /**
     * set IP或IP段，不同的IP/IP段之间用英文逗号分隔，例如0.0.0.0/0,192.168.0.10
     *
     * @param ips
     */
    public void setIps(String ips) {
        this.ips = ips;
    }

    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get RDS 实例ID，唯一标识一个RDS实例
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set IP或IP段，不同的IP/IP段之间用英文逗号分隔，例如0.0.0.0/0,192.168.0.10
     *
     * @param ips
     */
    public ModifyRdsWhiteListRequest ips(String ips) {
        this.ips = ips;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public ModifyRdsWhiteListRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public ModifyRdsWhiteListRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}