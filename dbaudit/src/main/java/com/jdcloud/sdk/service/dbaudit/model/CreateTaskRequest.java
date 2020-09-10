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
 * Report Task Interface
 * Report Task Interface
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbaudit.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.dbaudit.model.TaskSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建任务报表
 */
public class CreateTaskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 报表配置信息
     * Required:true
     */
    @Required
    private TaskSpec taskSpec;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 报表配置信息
     *
     * @return
     */
    public TaskSpec getTaskSpec() {
        return taskSpec;
    }

    /**
     * set 报表配置信息
     *
     * @param taskSpec
     */
    public void setTaskSpec(TaskSpec taskSpec) {
        this.taskSpec = taskSpec;
    }

    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 报表配置信息
     *
     * @param taskSpec
     */
    public CreateTaskRequest taskSpec(TaskSpec taskSpec) {
        this.taskSpec = taskSpec;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public CreateTaskRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}