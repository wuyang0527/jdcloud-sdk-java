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
 * JDCLOUD IAS Services API
 * 京东云联合登陆Api
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ias.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除应用
 */
public class DeleteAppRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * regionId
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * clientId
     * Required:true
     */
    @Required
    private String clientId;


    /**
     * get regionId
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get clientId
     *
     * @return
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * set clientId
     *
     * @param clientId
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }


    /**
     * set regionId
     *
     * @param regionId
     */
    public DeleteAppRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set clientId
     *
     * @param clientId
     */
    public DeleteAppRequest clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }


}