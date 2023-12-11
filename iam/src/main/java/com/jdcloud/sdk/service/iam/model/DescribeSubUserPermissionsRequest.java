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
 * Permission Management
 * Permission Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询子用户策略列表
 */
public class DescribeSubUserPermissionsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码
     * Required:true
     */
    @Required
    private Integer pageNumber;

    /**
     * 每页显示数目
     * Required:true
     */
    @Required
    private Integer pageSize;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 子用户用户名
     * Required:true
     */
    @Required
    private String subUser;



    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 每页显示数目
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页显示数目
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
     * get 子用户用户名
     *
     * @return
     */
    public String getSubUser() {
        return subUser;
    }

    /**
     * set 子用户用户名
     *
     * @param subUser
     */
    public void setSubUser(String subUser) {
        this.subUser = subUser;
    }



    /**
     * set 页码
     *
     * @param pageNumber
     */
    public DescribeSubUserPermissionsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 每页显示数目
     *
     * @param pageSize
     */
    public DescribeSubUserPermissionsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public DescribeSubUserPermissionsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 子用户用户名
     *
     * @param subUser
     */
    public DescribeSubUserPermissionsRequest subUser(String subUser) {
        this.subUser = subUser;
        return this;
    }


}