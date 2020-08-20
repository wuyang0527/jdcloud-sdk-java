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
 * 网站防护类接口
 * 京东云WAF-OpenAPI网站防护类接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.service.waf.model.RiskJsCfg;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取网站业务风控js插入页面
 */
public class ListRiskJsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码
     */
    private Integer pageIndex;

    /**
     * 页大小
     */
    private Integer pageSize;

    /**
     * 配置总数
     */
    private Integer count;

    /**
     * js页面
     */
    private RiskJsCfg data;


    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 页码
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * get 页大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 配置总数
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set 配置总数
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * get js页面
     *
     * @return
     */
    public RiskJsCfg getData() {
        return data;
    }

    /**
     * set js页面
     *
     * @param data
     */
    public void setData(RiskJsCfg data) {
        this.data = data;
    }


    /**
     * set 页码
     *
     * @param pageIndex
     */
    public ListRiskJsResult pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set 页大小
     *
     * @param pageSize
     */
    public ListRiskJsResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 配置总数
     *
     * @param count
     */
    public ListRiskJsResult count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * set js页面
     *
     * @param data
     */
    public ListRiskJsResult data(RiskJsCfg data) {
        this.data = data;
        return this;
    }


}