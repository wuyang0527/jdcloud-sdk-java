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
 * edgeIpProvider
 */
public class EdgeIpProvider  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 边缘公网IP的线路
     */
    private String provider;

    /**
     * 边缘公网IP的线路接入区
     */
    private String pointOfAccess;

    /**
     * 边缘公网IP的资源关联范围
     */
    private String associationScope;

    /**
     * 边缘公网IP的服务类型
     */
    private String serviceType;

    /**
     * 边缘公网IP的可用区
     */
    private String az;



    /**
     * get 边缘公网IP的线路
     *
     * @return
     */
    public String getProvider() {
        return provider;
    }

    /**
     * set 边缘公网IP的线路
     *
     * @param provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }


    /**
     * get 边缘公网IP的线路接入区
     *
     * @return
     */
    public String getPointOfAccess() {
        return pointOfAccess;
    }

    /**
     * set 边缘公网IP的线路接入区
     *
     * @param pointOfAccess
     */
    public void setPointOfAccess(String pointOfAccess) {
        this.pointOfAccess = pointOfAccess;
    }


    /**
     * get 边缘公网IP的资源关联范围
     *
     * @return
     */
    public String getAssociationScope() {
        return associationScope;
    }

    /**
     * set 边缘公网IP的资源关联范围
     *
     * @param associationScope
     */
    public void setAssociationScope(String associationScope) {
        this.associationScope = associationScope;
    }


    /**
     * get 边缘公网IP的服务类型
     *
     * @return
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * set 边缘公网IP的服务类型
     *
     * @param serviceType
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * get 边缘公网IP的可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 边缘公网IP的可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }



    /**
     * set 边缘公网IP的线路
     *
     * @param provider
     */
    public EdgeIpProvider provider(String provider) {
        this.provider = provider;
        return this;
    }


    /**
     * set 边缘公网IP的线路接入区
     *
     * @param pointOfAccess
     */
    public EdgeIpProvider pointOfAccess(String pointOfAccess) {
        this.pointOfAccess = pointOfAccess;
        return this;
    }


    /**
     * set 边缘公网IP的资源关联范围
     *
     * @param associationScope
     */
    public EdgeIpProvider associationScope(String associationScope) {
        this.associationScope = associationScope;
        return this;
    }


    /**
     * set 边缘公网IP的服务类型
     *
     * @param serviceType
     */
    public EdgeIpProvider serviceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }


    /**
     * set 边缘公网IP的可用区
     *
     * @param az
     */
    public EdgeIpProvider az(String az) {
        this.az = az;
        return this;
    }


}