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
 * Instance-Template
 * 与实例模板相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.service.vm.model.UpdateInstanceTemplateSpec;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
修改实例模板属性。

详细操作说明请参考帮助文档：[实例模板](https://docs.jdcloud.com/cn/virtual-machines/instance-template-overview)

## 接口说明
- 名称、描述、实例模板配置信息至少要传一项。
- 参数时，对应的参数不做更改。

 */
public class UpdateInstanceTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例模板的名称，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     */
    private String name;

    /**
     * 实例模板的描述，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     */
    private String description;

    /**
     * 实例模板配置信息。
     */
    private UpdateInstanceTemplateSpec instanceTemplateData;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例模板ID。
     * Required:true
     */
    @Required
    private String instanceTemplateId;


    /**
     * get 实例模板的名称，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 实例模板的名称，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 实例模板的描述，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 实例模板的描述，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 实例模板配置信息。
     *
     * @return
     */
    public UpdateInstanceTemplateSpec getInstanceTemplateData() {
        return instanceTemplateData;
    }

    /**
     * set 实例模板配置信息。
     *
     * @param instanceTemplateData
     */
    public void setInstanceTemplateData(UpdateInstanceTemplateSpec instanceTemplateData) {
        this.instanceTemplateData = instanceTemplateData;
    }

    /**
     * get 地域ID。
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 实例模板ID。
     *
     * @return
     */
    public String getInstanceTemplateId() {
        return instanceTemplateId;
    }

    /**
     * set 实例模板ID。
     *
     * @param instanceTemplateId
     */
    public void setInstanceTemplateId(String instanceTemplateId) {
        this.instanceTemplateId = instanceTemplateId;
    }


    /**
     * set 实例模板的名称，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @param name
     */
    public UpdateInstanceTemplateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 实例模板的描述，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @param description
     */
    public UpdateInstanceTemplateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 实例模板配置信息。
     *
     * @param instanceTemplateData
     */
    public UpdateInstanceTemplateRequest instanceTemplateData(UpdateInstanceTemplateSpec instanceTemplateData) {
        this.instanceTemplateData = instanceTemplateData;
        return this;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public UpdateInstanceTemplateRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例模板ID。
     *
     * @param instanceTemplateId
     */
    public UpdateInstanceTemplateRequest instanceTemplateId(String instanceTemplateId) {
        this.instanceTemplateId = instanceTemplateId;
        return this;
    }


}