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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除直播拉流转推任务

 */
public class DeleteLiveForwardTaskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务ID,批量用,分隔

     * Required:true
     */
    @Required
    private String taskIds;


    /**
     * get 任务ID,批量用,分隔

     *
     * @return
     */
    public String getTaskIds() {
        return taskIds;
    }

    /**
     * set 任务ID,批量用,分隔

     *
     * @param taskIds
     */
    public void setTaskIds(String taskIds) {
        this.taskIds = taskIds;
    }


    /**
     * set 任务ID,批量用,分隔

     *
     * @param taskIds
     */
    public DeleteLiveForwardTaskRequest taskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }


}