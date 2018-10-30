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
import com.jdcloud.sdk.service.clouddnsservice.model.AddView;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加域名的自定义解析线路
 */
public class AddUserViewRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 添加自定义线路的参数
     * Required:true
     */
    @Required
    private AddView req;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 添加自定义线路的参数
     *
     * @return
     */
    public AddView getReq() {
        return req;
    }

    /**
     * set 添加自定义线路的参数
     *
     * @param req
     */
    public void setReq(AddView req) {
        this.req = req;
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
     * set 添加自定义线路的参数
     *
     * @param req
     */
    public AddUserViewRequest req(AddView req) {
        this.req = req;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public AddUserViewRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}