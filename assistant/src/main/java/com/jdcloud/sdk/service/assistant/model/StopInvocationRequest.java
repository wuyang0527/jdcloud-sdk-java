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
 * Invocation
 * 云助手相关命令操作接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.assistant.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
停止执行命令。

详细操作说明请参考帮助文档：[用户自定义命令概述](https://docs.jdcloud.com/cn/virtual-machines/assistant-overview)

## 接口说明
- 该接口用于停止执行命令。
- 对于已经开始执行的命令，有可能会停止失败

 */
public class StopInvocationRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 命令调用Id

     * Required:true
     */
    @Required
    private String invokeId;

    /**
     * 要停止执行的虚机Id
     * Required:true
     */
    @Required
    
    private List<String> instances;
    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 命令调用Id

     *
     * @return
     */
    public String getInvokeId() {
        return invokeId;
    }

    /**
     * set 命令调用Id

     *
     * @param invokeId
     */
    public void setInvokeId(String invokeId) {
        this.invokeId = invokeId;
    }


    /**
    * get 要停止执行的虚机Id
    *
    * @return
    */
    public List<String> getInstances() {
        return instances;
    }

    /**
    * set 要停止执行的虚机Id
    *
    * @param instances
    */
    public void setInstances(List<String> instances) {
        this.instances = instances;
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
     * set 命令调用Id

     *
     * @param invokeId
     */
    public StopInvocationRequest invokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }


    /**
    * set 要停止执行的虚机Id
    *
    * @param instances
    */
    public StopInvocationRequest instances(List<String> instances) {
        this.instances = instances;
        return this;
    }


    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public StopInvocationRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 要停止执行的虚机Id
     *
     * @param instance
     */
    public void addInstance(String instance) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instance);
    }
}