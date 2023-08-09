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
 * 数据传输服务
 * 数据传输服务相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dts.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取Process
 */
public class ListProcessesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 获取Process列表的资源ID
     * Required:true
     */
    @Required
    private String id;

    /**
     * 获取Process列表的资源类型
     */
    private String resourceType;

    /**
     * 页码；默认为1，取值范围：-1，[1,∞)；-1时返回全部页码。
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为10；取值范围[1, 100]
     */
    private Integer pageSize;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》]
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 获取Process列表的资源ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 获取Process列表的资源ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * get 获取Process列表的资源类型
     *
     * @return
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * set 获取Process列表的资源类型
     *
     * @param resourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }


    /**
     * get 页码；默认为1，取值范围：-1，[1,∞)；-1时返回全部页码。
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1，取值范围：-1，[1,∞)；-1时返回全部页码。
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 分页大小；默认为10；取值范围[1, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为10；取值范围[1, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 获取Process列表的资源ID
     *
     * @param id
     */
    public ListProcessesRequest id(String id) {
        this.id = id;
        return this;
    }


    /**
     * set 获取Process列表的资源类型
     *
     * @param resourceType
     */
    public ListProcessesRequest resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }


    /**
     * set 页码；默认为1，取值范围：-1，[1,∞)；-1时返回全部页码。
     *
     * @param pageNumber
     */
    public ListProcessesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小；默认为10；取值范围[1, 100]
     *
     * @param pageSize
     */
    public ListProcessesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public ListProcessesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}