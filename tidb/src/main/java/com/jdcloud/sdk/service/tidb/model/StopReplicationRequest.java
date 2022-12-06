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
 * Data-Replication
 * TiCDC复制管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 暂停指定的复制任务。注意：如果暂停的时间过长，会导致 TiCDC 节点的磁盘空间写满，导致复制任务错误或失败。
 */
public class StopReplicationRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例ID
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 复制任务ID
     * Required:true
     */
    @Required
    private String taskId;



    /**
     * get 地域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get 复制任务ID
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 复制任务ID
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }



    /**
     * set 地域代码
     *
     * @param regionId
     */
    public StopReplicationRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public StopReplicationRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set 复制任务ID
     *
     * @param taskId
     */
    public StopReplicationRequest taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }


}