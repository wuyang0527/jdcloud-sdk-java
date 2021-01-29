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
 * Anti DDos Pro Instance APIs
 * Anti DDos Pro Instance APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.ipanti.model.CustomPageSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改自定义页面
 */
public class ModifyCustomPageRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 修改自定义页面请求参数
     * Required:true
     */
    @Required
    private CustomPageSpec customPageSpec;

    /**
     * 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例 ID
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 自定义页面Id
     * Required:true
     */
    @Required
    private String pageId;


    /**
     * get 修改自定义页面请求参数
     *
     * @return
     */
    public CustomPageSpec getCustomPageSpec() {
        return customPageSpec;
    }

    /**
     * set 修改自定义页面请求参数
     *
     * @param customPageSpec
     */
    public void setCustomPageSpec(CustomPageSpec customPageSpec) {
        this.customPageSpec = customPageSpec;
    }

    /**
     * get 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 实例 ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例 ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 自定义页面Id
     *
     * @return
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * set 自定义页面Id
     *
     * @param pageId
     */
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }


    /**
     * set 修改自定义页面请求参数
     *
     * @param customPageSpec
     */
    public ModifyCustomPageRequest customPageSpec(CustomPageSpec customPageSpec) {
        this.customPageSpec = customPageSpec;
        return this;
    }

    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public ModifyCustomPageRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例 ID
     *
     * @param instanceId
     */
    public ModifyCustomPageRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 自定义页面Id
     *
     * @param pageId
     */
    public ModifyCustomPageRequest pageId(String pageId) {
        this.pageId = pageId;
        return this;
    }


}