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
 * Pod
 * Pod 相关接口
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
 * 修改 pod 的描述。

 */
public class ModifyPodAttributeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 修改后的描述
     */
    private String description;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Pod ID
     * Required:true
     */
    @Required
    private String podId;



    /**
     * get 修改后的描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 修改后的描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * get Pod ID
     *
     * @return
     */
    public String getPodId() {
        return podId;
    }

    /**
     * set Pod ID
     *
     * @param podId
     */
    public void setPodId(String podId) {
        this.podId = podId;
    }



    /**
     * set 修改后的描述
     *
     * @param description
     */
    public ModifyPodAttributeRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyPodAttributeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set Pod ID
     *
     * @param podId
     */
    public ModifyPodAttributeRequest podId(String podId) {
        this.podId = podId;
        return this;
    }


}