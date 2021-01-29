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
 * JDCLOUD quota API
 * API JDCLOUD quota API
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.quota.model;

import java.util.List;
import java.util.ArrayList;

/**
 * vo
 */
public class Vo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源
     */
    private List<QuotaReqVo> resources;

    /**
     * 操作类型
     */
    private String opType;

    /**
     * 产品线
     */
    private String serviceCode;


    /**
     * get 资源
     *
     * @return
     */
    public List<QuotaReqVo> getResources() {
        return resources;
    }

    /**
     * set 资源
     *
     * @param resources
     */
    public void setResources(List<QuotaReqVo> resources) {
        this.resources = resources;
    }

    /**
     * get 操作类型
     *
     * @return
     */
    public String getOpType() {
        return opType;
    }

    /**
     * set 操作类型
     *
     * @param opType
     */
    public void setOpType(String opType) {
        this.opType = opType;
    }

    /**
     * get 产品线
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * set 资源
     *
     * @param resources
     */
    public Vo resources(List<QuotaReqVo> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * set 操作类型
     *
     * @param opType
     */
    public Vo opType(String opType) {
        this.opType = opType;
        return this;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public Vo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * add item to 资源
     *
     * @param resource
     */
    public void addResource(QuotaReqVo resource) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resource);
    }

}