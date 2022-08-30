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

package com.jdcloud.sdk.service.cdn.model;


/**
 * cacheRule
 */
public class CacheRule  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * weight
     */
    private Integer weight;

    /**
     * ttl
     */
    private Long ttl;

    /**
     * configId
     */
    private Long configId;

    /**
     * contents
     */
    private String contents;

    /**
     * createTime
     */
    private String createTime;

    /**
     * updateTime
     */
    private String updateTime;

    /**
     * cacheType
     */
    private String cacheType;



    /**
     * get weight
     *
     * @return
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * set weight
     *
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    /**
     * get ttl
     *
     * @return
     */
    public Long getTtl() {
        return ttl;
    }

    /**
     * set ttl
     *
     * @param ttl
     */
    public void setTtl(Long ttl) {
        this.ttl = ttl;
    }


    /**
     * get configId
     *
     * @return
     */
    public Long getConfigId() {
        return configId;
    }

    /**
     * set configId
     *
     * @param configId
     */
    public void setConfigId(Long configId) {
        this.configId = configId;
    }


    /**
     * get contents
     *
     * @return
     */
    public String getContents() {
        return contents;
    }

    /**
     * set contents
     *
     * @param contents
     */
    public void setContents(String contents) {
        this.contents = contents;
    }


    /**
     * get createTime
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get cacheType
     *
     * @return
     */
    public String getCacheType() {
        return cacheType;
    }

    /**
     * set cacheType
     *
     * @param cacheType
     */
    public void setCacheType(String cacheType) {
        this.cacheType = cacheType;
    }



    /**
     * set weight
     *
     * @param weight
     */
    public CacheRule weight(Integer weight) {
        this.weight = weight;
        return this;
    }


    /**
     * set ttl
     *
     * @param ttl
     */
    public CacheRule ttl(Long ttl) {
        this.ttl = ttl;
        return this;
    }


    /**
     * set configId
     *
     * @param configId
     */
    public CacheRule configId(Long configId) {
        this.configId = configId;
        return this;
    }


    /**
     * set contents
     *
     * @param contents
     */
    public CacheRule contents(String contents) {
        this.contents = contents;
        return this;
    }


    /**
     * set createTime
     *
     * @param createTime
     */
    public CacheRule createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set updateTime
     *
     * @param updateTime
     */
    public CacheRule updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set cacheType
     *
     * @param cacheType
     */
    public CacheRule cacheType(String cacheType) {
        this.cacheType = cacheType;
        return this;
    }


}