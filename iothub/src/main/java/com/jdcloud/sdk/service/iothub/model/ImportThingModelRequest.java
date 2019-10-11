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
 * ProductAbility
 * 关于产品功能信息操作的相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iothub.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 导入物模型
 */
public class ImportThingModelRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物模型JSON
     * Required:true
     */
    @Required
    private Object thingModel;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 产品Key
     * Required:true
     */
    @Required
    private String productKey;


    /**
     * get 物模型JSON
     *
     * @return
     */
    public Object getThingModel() {
        return thingModel;
    }

    /**
     * set 物模型JSON
     *
     * @param thingModel
     */
    public void setThingModel(Object thingModel) {
        this.thingModel = thingModel;
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
     * get 产品Key
     *
     * @return
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }


    /**
     * set 物模型JSON
     *
     * @param thingModel
     */
    public ImportThingModelRequest thingModel(Object thingModel) {
        this.thingModel = thingModel;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public ImportThingModelRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public ImportThingModelRequest productKey(String productKey) {
        this.productKey = productKey;
        return this;
    }


}