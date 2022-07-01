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
 * Vedit Project
 * 视频剪辑工程管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.service.vod.model.Timeline;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 修改视频剪辑工程信息
 */
public class UpdateVeditProjectResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工程ID
     */
    private Long projectId;

    /**
     * 工程名称
     */
    private String projectName;

    /**
     * 工程描述
     */
    private String description;

    /**
     * 时间线信息
     */
    private Timeline timeline;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;


    /**
     * get 工程ID
     *
     * @return
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * set 工程ID
     *
     * @param projectId
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * get 工程名称
     *
     * @return
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * set 工程名称
     *
     * @param projectName
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * get 工程描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 工程描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 时间线信息
     *
     * @return
     */
    public Timeline getTimeline() {
        return timeline;
    }

    /**
     * set 时间线信息
     *
     * @param timeline
     */
    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 工程ID
     *
     * @param projectId
     */
    public UpdateVeditProjectResult projectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * set 工程名称
     *
     * @param projectName
     */
    public UpdateVeditProjectResult projectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * set 工程描述
     *
     * @param description
     */
    public UpdateVeditProjectResult description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 时间线信息
     *
     * @param timeline
     */
    public UpdateVeditProjectResult timeline(Timeline timeline) {
        this.timeline = timeline;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public UpdateVeditProjectResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public UpdateVeditProjectResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}