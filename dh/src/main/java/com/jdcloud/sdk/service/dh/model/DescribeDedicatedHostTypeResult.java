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
 * Dedicated-Host
 * 关于专有宿主机操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dh.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dh.model.HostType;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询专有宿主机机型。

 */
public class DescribeDedicatedHostTypeResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dedicatedHostTypes
     */
    private List<HostType> dedicatedHostTypes;

    /**
     * totalCount
     */
    private Number totalCount;


    /**
     * get dedicatedHostTypes
     *
     * @return
     */
    public List<HostType> getDedicatedHostTypes() {
        return dedicatedHostTypes;
    }

    /**
     * set dedicatedHostTypes
     *
     * @param dedicatedHostTypes
     */
    public void setDedicatedHostTypes(List<HostType> dedicatedHostTypes) {
        this.dedicatedHostTypes = dedicatedHostTypes;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set dedicatedHostTypes
     *
     * @param dedicatedHostTypes
     */
    public DescribeDedicatedHostTypeResult dedicatedHostTypes(List<HostType> dedicatedHostTypes) {
        this.dedicatedHostTypes = dedicatedHostTypes;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeDedicatedHostTypeResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to dedicatedHostTypes
     *
     * @param dedicatedHostType
     */
    public void addDedicatedHostType(HostType dedicatedHostType) {
        if (this.dedicatedHostTypes == null) {
            this.dedicatedHostTypes = new ArrayList<>();
        }
        this.dedicatedHostTypes.add(dedicatedHostType);
    }

}