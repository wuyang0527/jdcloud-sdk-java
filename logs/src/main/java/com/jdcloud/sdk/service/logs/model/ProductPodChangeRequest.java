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
 * ProductPodChange APIs
 * 产品pod信息同步
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 产品pod同步
 */
public class ProductPodChangeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作类型
     */
    private String operate;

    /**
     * pod详情
     */
    private String podInfo;

    /**
     * 租户
     */
    private String tenant;

    /**
     * pod详情数组
     */
    private String podListStr;

    /**
     * 是否所有租户可见
     */
    private Boolean allTenantDistributability;



    /**
     * get 操作类型
     *
     * @return
     */
    public String getOperate() {
        return operate;
    }

    /**
     * set 操作类型
     *
     * @param operate
     */
    public void setOperate(String operate) {
        this.operate = operate;
    }


    /**
     * get pod详情
     *
     * @return
     */
    public String getPodInfo() {
        return podInfo;
    }

    /**
     * set pod详情
     *
     * @param podInfo
     */
    public void setPodInfo(String podInfo) {
        this.podInfo = podInfo;
    }


    /**
     * get 租户
     *
     * @return
     */
    public String getTenant() {
        return tenant;
    }

    /**
     * set 租户
     *
     * @param tenant
     */
    public void setTenant(String tenant) {
        this.tenant = tenant;
    }


    /**
     * get pod详情数组
     *
     * @return
     */
    public String getPodListStr() {
        return podListStr;
    }

    /**
     * set pod详情数组
     *
     * @param podListStr
     */
    public void setPodListStr(String podListStr) {
        this.podListStr = podListStr;
    }


    /**
     * get 是否所有租户可见
     *
     * @return
     */
    public Boolean getAllTenantDistributability() {
        return allTenantDistributability;
    }

    /**
     * set 是否所有租户可见
     *
     * @param allTenantDistributability
     */
    public void setAllTenantDistributability(Boolean allTenantDistributability) {
        this.allTenantDistributability = allTenantDistributability;
    }



    /**
     * set 操作类型
     *
     * @param operate
     */
    public ProductPodChangeRequest operate(String operate) {
        this.operate = operate;
        return this;
    }


    /**
     * set pod详情
     *
     * @param podInfo
     */
    public ProductPodChangeRequest podInfo(String podInfo) {
        this.podInfo = podInfo;
        return this;
    }


    /**
     * set 租户
     *
     * @param tenant
     */
    public ProductPodChangeRequest tenant(String tenant) {
        this.tenant = tenant;
        return this;
    }


    /**
     * set pod详情数组
     *
     * @param podListStr
     */
    public ProductPodChangeRequest podListStr(String podListStr) {
        this.podListStr = podListStr;
        return this;
    }


    /**
     * set 是否所有租户可见
     *
     * @param allTenantDistributability
     */
    public ProductPodChangeRequest allTenantDistributability(Boolean allTenantDistributability) {
        this.allTenantDistributability = allTenantDistributability;
        return this;
    }


}