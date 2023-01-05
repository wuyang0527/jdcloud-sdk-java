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
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 给网卡删除secondaryIp
 */
public class UnassignSecondaryIpsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指定删除的secondaryIp地址
     */
    
    private List<String> secondaryIps;
    /**
     * 指定删除的secondaryIp网段
     */
    
    private List<String> secondaryCidrs;
    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * networkInterface ID
     * Required:true
     */
    @Required
    private String networkInterfaceId;



    /**
    * get 指定删除的secondaryIp地址
    *
    * @return
    */
    public List<String> getSecondaryIps() {
        return secondaryIps;
    }

    /**
    * set 指定删除的secondaryIp地址
    *
    * @param secondaryIps
    */
    public void setSecondaryIps(List<String> secondaryIps) {
        this.secondaryIps = secondaryIps;
    }


    /**
    * get 指定删除的secondaryIp网段
    *
    * @return
    */
    public List<String> getSecondaryCidrs() {
        return secondaryCidrs;
    }

    /**
    * set 指定删除的secondaryIp网段
    *
    * @param secondaryCidrs
    */
    public void setSecondaryCidrs(List<String> secondaryCidrs) {
        this.secondaryCidrs = secondaryCidrs;
    }


    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get networkInterface ID
     *
     * @return
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * set networkInterface ID
     *
     * @param networkInterfaceId
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }



    /**
    * set 指定删除的secondaryIp地址
    *
    * @param secondaryIps
    */
    public UnassignSecondaryIpsRequest secondaryIps(List<String> secondaryIps) {
        this.secondaryIps = secondaryIps;
        return this;
    }


    /**
    * set 指定删除的secondaryIp网段
    *
    * @param secondaryCidrs
    */
    public UnassignSecondaryIpsRequest secondaryCidrs(List<String> secondaryCidrs) {
        this.secondaryCidrs = secondaryCidrs;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public UnassignSecondaryIpsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set networkInterface ID
     *
     * @param networkInterfaceId
     */
    public UnassignSecondaryIpsRequest networkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }



    /**
     * add item to 指定删除的secondaryIp地址
     *
     * @param secondaryIp
     */
    public void addSecondaryIp(String secondaryIp) {
        if (this.secondaryIps == null) {
            this.secondaryIps = new ArrayList<>();
        }
        this.secondaryIps.add(secondaryIp);
    }

    /**
     * add item to 指定删除的secondaryIp网段
     *
     * @param secondaryCidr
     */
    public void addSecondaryCidr(String secondaryCidr) {
        if (this.secondaryCidrs == null) {
            this.secondaryCidrs = new ArrayList<>();
        }
        this.secondaryCidrs.add(secondaryCidr);
    }
}