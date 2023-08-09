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
 * 数据传输服务
 * 数据传输服务相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dts.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dts.model.CloudInstanceSpec;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取云实例列表
 */
public class ListCloudInstancesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例信息
     */
    
    private List<CloudInstanceSpec> instances;


    /**
    * get 实例信息
    *
    * @return
    */
    public List<CloudInstanceSpec> getInstances() {
        return instances;
    }

    /**
    * set 实例信息
    *
    * @param instances
    */
    public void setInstances(List<CloudInstanceSpec> instances) {
        this.instances = instances;
    }



    /**
    * set 实例信息
    *
    * @param instances
    */
    public ListCloudInstancesResult instances(List<CloudInstanceSpec> instances) {
        this.instances = instances;
        return this;
    }



    /**
     * add item to 实例信息
     *
     * @param instance
     */
    public void addInstance(CloudInstanceSpec instance) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instance);
    }
}