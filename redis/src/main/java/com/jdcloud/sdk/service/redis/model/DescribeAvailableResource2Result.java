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
 * Redis Available Resource API
 * 缓存Redis的规格列表新接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.redis.model.AvailableResource;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询支持的规格列表
 */
public class DescribeAvailableResource2Result extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * availableResources
     */
    private List<AvailableResource> availableResources;


    /**
     * get availableResources
     *
     * @return
     */
    public List<AvailableResource> getAvailableResources() {
        return availableResources;
    }

    /**
     * set availableResources
     *
     * @param availableResources
     */
    public void setAvailableResources(List<AvailableResource> availableResources) {
        this.availableResources = availableResources;
    }


    /**
     * set availableResources
     *
     * @param availableResources
     */
    public DescribeAvailableResource2Result availableResources(List<AvailableResource> availableResources) {
        this.availableResources = availableResources;
        return this;
    }


    /**
     * add item to availableResources
     *
     * @param availableResource
     */
    public void addAvailableResource(AvailableResource availableResource) {
        if (this.availableResources == null) {
            this.availableResources = new ArrayList<>();
        }
        this.availableResources.add(availableResource);
    }

}