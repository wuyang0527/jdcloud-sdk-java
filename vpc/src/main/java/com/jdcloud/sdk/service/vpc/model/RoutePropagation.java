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

package com.jdcloud.sdk.service.vpc.model;


/**
 * routePropagation
 */
public class RoutePropagation  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 路由传播Id
     */
    private String propagationId;

    /**
     * 边界网关Id
     */
    private String bgwId;

    /**
     * 路由传播范围，指定路由传播网段，CIDR格式，多个CIDR之间以英文逗号“,”分隔，0.0.0.0/0表示接受所有传播路由，设置特定网段就只能接收该网段范围内或子网段的路由传播
     */
    private String propagationCidrs;


    /**
     * get 路由传播Id
     *
     * @return
     */
    public String getPropagationId() {
        return propagationId;
    }

    /**
     * set 路由传播Id
     *
     * @param propagationId
     */
    public void setPropagationId(String propagationId) {
        this.propagationId = propagationId;
    }

    /**
     * get 边界网关Id
     *
     * @return
     */
    public String getBgwId() {
        return bgwId;
    }

    /**
     * set 边界网关Id
     *
     * @param bgwId
     */
    public void setBgwId(String bgwId) {
        this.bgwId = bgwId;
    }

    /**
     * get 路由传播范围，指定路由传播网段，CIDR格式，多个CIDR之间以英文逗号“,”分隔，0.0.0.0/0表示接受所有传播路由，设置特定网段就只能接收该网段范围内或子网段的路由传播
     *
     * @return
     */
    public String getPropagationCidrs() {
        return propagationCidrs;
    }

    /**
     * set 路由传播范围，指定路由传播网段，CIDR格式，多个CIDR之间以英文逗号“,”分隔，0.0.0.0/0表示接受所有传播路由，设置特定网段就只能接收该网段范围内或子网段的路由传播
     *
     * @param propagationCidrs
     */
    public void setPropagationCidrs(String propagationCidrs) {
        this.propagationCidrs = propagationCidrs;
    }


    /**
     * set 路由传播Id
     *
     * @param propagationId
     */
    public RoutePropagation propagationId(String propagationId) {
        this.propagationId = propagationId;
        return this;
    }

    /**
     * set 边界网关Id
     *
     * @param bgwId
     */
    public RoutePropagation bgwId(String bgwId) {
        this.bgwId = bgwId;
        return this;
    }

    /**
     * set 路由传播范围，指定路由传播网段，CIDR格式，多个CIDR之间以英文逗号“,”分隔，0.0.0.0/0表示接受所有传播路由，设置特定网段就只能接收该网段范围内或子网段的路由传播
     *
     * @param propagationCidrs
     */
    public RoutePropagation propagationCidrs(String propagationCidrs) {
        this.propagationCidrs = propagationCidrs;
        return this;
    }


}