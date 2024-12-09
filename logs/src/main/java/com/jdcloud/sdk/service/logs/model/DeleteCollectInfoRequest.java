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
 * CollectInfo APIs
 * 采集配置的管理控制接口，采集实例的管理控制接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除采集配置
 */
public class DeleteCollectInfoRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 采集配置 UID
     * Required:true
     */
    @Required
    private String collectInfoUID;



    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 采集配置 UID
     *
     * @return
     */
    public String getCollectInfoUID() {
        return collectInfoUID;
    }

    /**
     * set 采集配置 UID
     *
     * @param collectInfoUID
     */
    public void setCollectInfoUID(String collectInfoUID) {
        this.collectInfoUID = collectInfoUID;
    }



    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public DeleteCollectInfoRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 采集配置 UID
     *
     * @param collectInfoUID
     */
    public DeleteCollectInfoRequest collectInfoUID(String collectInfoUID) {
        this.collectInfoUID = collectInfoUID;
        return this;
    }


}