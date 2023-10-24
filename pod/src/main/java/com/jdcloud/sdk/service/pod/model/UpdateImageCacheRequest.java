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
 * ImageCache
 * 镜像缓存相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改镜像缓存的属性。

 */
public class UpdateImageCacheRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 新的镜像缓存名称
     */
    private String name;

    /**
     * 新的保留日期，以创建时间为准计算过期时间，新的过期时间不得为当前时间之前
     */
    private Integer retentionDays;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * imageCacheId
     * Required:true
     */
    @Required
    private String imageCacheId;



    /**
     * get 新的镜像缓存名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 新的镜像缓存名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 新的保留日期，以创建时间为准计算过期时间，新的过期时间不得为当前时间之前
     *
     * @return
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    /**
     * set 新的保留日期，以创建时间为准计算过期时间，新的过期时间不得为当前时间之前
     *
     * @param retentionDays
     */
    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
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
     * get imageCacheId
     *
     * @return
     */
    public String getImageCacheId() {
        return imageCacheId;
    }

    /**
     * set imageCacheId
     *
     * @param imageCacheId
     */
    public void setImageCacheId(String imageCacheId) {
        this.imageCacheId = imageCacheId;
    }



    /**
     * set 新的镜像缓存名称
     *
     * @param name
     */
    public UpdateImageCacheRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 新的保留日期，以创建时间为准计算过期时间，新的过期时间不得为当前时间之前
     *
     * @param retentionDays
     */
    public UpdateImageCacheRequest retentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public UpdateImageCacheRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set imageCacheId
     *
     * @param imageCacheId
     */
    public UpdateImageCacheRequest imageCacheId(String imageCacheId) {
        this.imageCacheId = imageCacheId;
        return this;
    }


}