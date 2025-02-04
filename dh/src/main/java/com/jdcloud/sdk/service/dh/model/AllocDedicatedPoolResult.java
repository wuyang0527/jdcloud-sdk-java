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
 * Dedicated-Pool
 * 关于专有宿主机池操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dh.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 申请专有宿主机池。&lt;br&gt;
专有宿主机池为专有宿主机的集合，为用户提供独享且跨机架的宿主机资源池，基于资源独享及故障隔离实现业务安全、高可用部署。&lt;br&gt;
申请宿主机池需要指定机器类型，目前每一个专有宿主机池只能指定一种机器类型。可供选用的机器类型有通用性，内存性，高频计算型及GPU型。&lt;br&gt;
deployPolicy表示是否强制池中专有宿主机在每个AZ内数量均衡。可选值为prefered和required，默认为prefered。

 */
public class AllocDedicatedPoolResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dedicatedPoolId
     */
    private String dedicatedPoolId;


    /**
     * get dedicatedPoolId
     *
     * @return
     */
    public String getDedicatedPoolId() {
        return dedicatedPoolId;
    }

    /**
     * set dedicatedPoolId
     *
     * @param dedicatedPoolId
     */
    public void setDedicatedPoolId(String dedicatedPoolId) {
        this.dedicatedPoolId = dedicatedPoolId;
    }


    /**
     * set dedicatedPoolId
     *
     * @param dedicatedPoolId
     */
    public AllocDedicatedPoolResult dedicatedPoolId(String dedicatedPoolId) {
        this.dedicatedPoolId = dedicatedPoolId;
        return this;
    }


}