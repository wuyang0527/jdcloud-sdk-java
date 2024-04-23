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
 * CustomizedConfiguration
 * 个性化配置相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 给资源绑定个性化配置
 */
public class AssociateCustomizedConfigurationRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 个性化配置要绑定的资源ID列表, 对于已绑定配置的资源需要先解绑
     * Required:true
     */
    @Required
    
    private List<String> resourceIds;
    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Customized Configuration Id
     * Required:true
     */
    @Required
    private String customizedConfigurationId;



    /**
    * get 个性化配置要绑定的资源ID列表, 对于已绑定配置的资源需要先解绑
    *
    * @return
    */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    /**
    * set 个性化配置要绑定的资源ID列表, 对于已绑定配置的资源需要先解绑
    *
    * @param resourceIds
    */
    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
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
     * get Customized Configuration Id
     *
     * @return
     */
    public String getCustomizedConfigurationId() {
        return customizedConfigurationId;
    }

    /**
     * set Customized Configuration Id
     *
     * @param customizedConfigurationId
     */
    public void setCustomizedConfigurationId(String customizedConfigurationId) {
        this.customizedConfigurationId = customizedConfigurationId;
    }



    /**
    * set 个性化配置要绑定的资源ID列表, 对于已绑定配置的资源需要先解绑
    *
    * @param resourceIds
    */
    public AssociateCustomizedConfigurationRequest resourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public AssociateCustomizedConfigurationRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set Customized Configuration Id
     *
     * @param customizedConfigurationId
     */
    public AssociateCustomizedConfigurationRequest customizedConfigurationId(String customizedConfigurationId) {
        this.customizedConfigurationId = customizedConfigurationId;
        return this;
    }



    /**
     * add item to 个性化配置要绑定的资源ID列表, 对于已绑定配置的资源需要先解绑
     *
     * @param resourceId
     */
    public void addResourceId(String resourceId) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceId);
    }
}