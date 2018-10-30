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
 * 解析记录
 * 云解析OpenAPI自定义线路接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clouddnsservice.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询域名的自定义解析线路
 */
public class GetUserViewRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主域名ID
     * Required:true
     */
    @Required
    private Integer domainId;

    /**
     * 自定义线路ID
     * Required:true
     */
    @Required
    private Integer viewId;

    /**
     * 自定义线路名称, 最多64个字符
     */
    private Integer viewName;

    /**
     * 分页参数，页的序号
     * Required:true
     */
    @Required
    private Integer pageNumber;

    /**
     * 分页参数，每页含有的结果的数目
     * Required:true
     */
    @Required
    private Integer pageSize;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 主域名ID
     *
     * @return
     */
    public Integer getDomainId() {
        return domainId;
    }

    /**
     * set 主域名ID
     *
     * @param domainId
     */
    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    /**
     * get 自定义线路ID
     *
     * @return
     */
    public Integer getViewId() {
        return viewId;
    }

    /**
     * set 自定义线路ID
     *
     * @param viewId
     */
    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    /**
     * get 自定义线路名称, 最多64个字符
     *
     * @return
     */
    public Integer getViewName() {
        return viewName;
    }

    /**
     * set 自定义线路名称, 最多64个字符
     *
     * @param viewName
     */
    public void setViewName(Integer viewName) {
        this.viewName = viewName;
    }

    /**
     * get 分页参数，页的序号
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 分页参数，页的序号
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页参数，每页含有的结果的数目
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页参数，每页含有的结果的数目
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 主域名ID
     *
     * @param domainId
     */
    public GetUserViewRequest domainId(Integer domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * set 自定义线路ID
     *
     * @param viewId
     */
    public GetUserViewRequest viewId(Integer viewId) {
        this.viewId = viewId;
        return this;
    }

    /**
     * set 自定义线路名称, 最多64个字符
     *
     * @param viewName
     */
    public GetUserViewRequest viewName(Integer viewName) {
        this.viewName = viewName;
        return this;
    }

    /**
     * set 分页参数，页的序号
     *
     * @param pageNumber
     */
    public GetUserViewRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页参数，每页含有的结果的数目
     *
     * @param pageSize
     */
    public GetUserViewRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GetUserViewRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}