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
 * Forwarding-Rules-Group
 * 转发规则组相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.lb.model.UrlMap;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询转发规则组列表详情
 */
public class DescribeUrlMapsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * urlMaps
     */
    
    private List<UrlMap> urlMaps;
    /**
     * 总数量
     */
    private Integer totalCount;



    /**
    * get urlMaps
    *
    * @return
    */
    public List<UrlMap> getUrlMaps() {
        return urlMaps;
    }

    /**
    * set urlMaps
    *
    * @param urlMaps
    */
    public void setUrlMaps(List<UrlMap> urlMaps) {
        this.urlMaps = urlMaps;
    }


    /**
     * get 总数量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set urlMaps
    *
    * @param urlMaps
    */
    public DescribeUrlMapsResult urlMaps(List<UrlMap> urlMaps) {
        this.urlMaps = urlMaps;
        return this;
    }


    /**
     * set 总数量
     *
     * @param totalCount
     */
    public DescribeUrlMapsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to urlMaps
     *
     * @param urlMap
     */
    public void addUrlMap(UrlMap urlMap) {
        if (this.urlMaps == null) {
            this.urlMaps = new ArrayList<>();
        }
        this.urlMaps.add(urlMap);
    }
}