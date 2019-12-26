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
 * Elastic-Network-Interface
 * 弹性网卡相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vpc.model.NetworkInterface;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询弹性网卡列表
 */
public class DescribeNetworkInterfacesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * networkInterfaces
     */
    private List<NetworkInterface> networkInterfaces;

    /**
     * 总数量
     */
    private Number totalCount;


    /**
     * get networkInterfaces
     *
     * @return
     */
    public List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * set networkInterfaces
     *
     * @param networkInterfaces
     */
    public void setNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    /**
     * get 总数量
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set networkInterfaces
     *
     * @param networkInterfaces
     */
    public DescribeNetworkInterfacesResult networkInterfaces(List<NetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public DescribeNetworkInterfacesResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to networkInterfaces
     *
     * @param networkInterface
     */
    public void addNetworkInterface(NetworkInterface networkInterface) {
        if (this.networkInterfaces == null) {
            this.networkInterfaces = new ArrayList<>();
        }
        this.networkInterfaces.add(networkInterface);
    }

}