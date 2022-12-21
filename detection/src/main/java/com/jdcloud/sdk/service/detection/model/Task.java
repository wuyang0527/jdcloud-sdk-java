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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.detection.model;


/**
 * task
 */
public class Task  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务ID
     */
    private Long taskId;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务地址
     */
    private String taskUrl;

    /**
     * 任务类型 1、协议 2、网络
     */
    private Integer taskType;

    /**
     * 协议类型
     */
    private Integer protocolType;

    /**
     * 任务组ID
     */
    private Long taskGroupId;

    /**
     * 任务组名称
     */
    private String taskGroupName;

    /**
     * 拨测点数量
     */
    private Integer monitorPointCount;

    /**
     * 拨测点频率
     */
    private Integer monitorInterval;

    /**
     * 拨测开始时间
     */
    private String monitorStartDate;

    /**
     * 拨测结束时间
     */
    private String monitorEndDate;

    /**
     * 状态 0开启 1禁用
     */
    private Integer status;

    /**
     * 任务的创建时间
     */
    private String createdDate;



    /**
     * get 任务ID
     *
     * @return
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * set 任务ID
     *
     * @param taskId
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }


    /**
     * get 任务名称
     *
     * @return
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * set 任务名称
     *
     * @param taskName
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }


    /**
     * get 任务地址
     *
     * @return
     */
    public String getTaskUrl() {
        return taskUrl;
    }

    /**
     * set 任务地址
     *
     * @param taskUrl
     */
    public void setTaskUrl(String taskUrl) {
        this.taskUrl = taskUrl;
    }


    /**
     * get 任务类型 1、协议 2、网络
     *
     * @return
     */
    public Integer getTaskType() {
        return taskType;
    }

    /**
     * set 任务类型 1、协议 2、网络
     *
     * @param taskType
     */
    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }


    /**
     * get 协议类型
     *
     * @return
     */
    public Integer getProtocolType() {
        return protocolType;
    }

    /**
     * set 协议类型
     *
     * @param protocolType
     */
    public void setProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
    }


    /**
     * get 任务组ID
     *
     * @return
     */
    public Long getTaskGroupId() {
        return taskGroupId;
    }

    /**
     * set 任务组ID
     *
     * @param taskGroupId
     */
    public void setTaskGroupId(Long taskGroupId) {
        this.taskGroupId = taskGroupId;
    }


    /**
     * get 任务组名称
     *
     * @return
     */
    public String getTaskGroupName() {
        return taskGroupName;
    }

    /**
     * set 任务组名称
     *
     * @param taskGroupName
     */
    public void setTaskGroupName(String taskGroupName) {
        this.taskGroupName = taskGroupName;
    }


    /**
     * get 拨测点数量
     *
     * @return
     */
    public Integer getMonitorPointCount() {
        return monitorPointCount;
    }

    /**
     * set 拨测点数量
     *
     * @param monitorPointCount
     */
    public void setMonitorPointCount(Integer monitorPointCount) {
        this.monitorPointCount = monitorPointCount;
    }


    /**
     * get 拨测点频率
     *
     * @return
     */
    public Integer getMonitorInterval() {
        return monitorInterval;
    }

    /**
     * set 拨测点频率
     *
     * @param monitorInterval
     */
    public void setMonitorInterval(Integer monitorInterval) {
        this.monitorInterval = monitorInterval;
    }


    /**
     * get 拨测开始时间
     *
     * @return
     */
    public String getMonitorStartDate() {
        return monitorStartDate;
    }

    /**
     * set 拨测开始时间
     *
     * @param monitorStartDate
     */
    public void setMonitorStartDate(String monitorStartDate) {
        this.monitorStartDate = monitorStartDate;
    }


    /**
     * get 拨测结束时间
     *
     * @return
     */
    public String getMonitorEndDate() {
        return monitorEndDate;
    }

    /**
     * set 拨测结束时间
     *
     * @param monitorEndDate
     */
    public void setMonitorEndDate(String monitorEndDate) {
        this.monitorEndDate = monitorEndDate;
    }


    /**
     * get 状态 0开启 1禁用
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态 0开启 1禁用
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * get 任务的创建时间
     *
     * @return
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * set 任务的创建时间
     *
     * @param createdDate
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }



    /**
     * set 任务ID
     *
     * @param taskId
     */
    public Task taskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }


    /**
     * set 任务名称
     *
     * @param taskName
     */
    public Task taskName(String taskName) {
        this.taskName = taskName;
        return this;
    }


    /**
     * set 任务地址
     *
     * @param taskUrl
     */
    public Task taskUrl(String taskUrl) {
        this.taskUrl = taskUrl;
        return this;
    }


    /**
     * set 任务类型 1、协议 2、网络
     *
     * @param taskType
     */
    public Task taskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }


    /**
     * set 协议类型
     *
     * @param protocolType
     */
    public Task protocolType(Integer protocolType) {
        this.protocolType = protocolType;
        return this;
    }


    /**
     * set 任务组ID
     *
     * @param taskGroupId
     */
    public Task taskGroupId(Long taskGroupId) {
        this.taskGroupId = taskGroupId;
        return this;
    }


    /**
     * set 任务组名称
     *
     * @param taskGroupName
     */
    public Task taskGroupName(String taskGroupName) {
        this.taskGroupName = taskGroupName;
        return this;
    }


    /**
     * set 拨测点数量
     *
     * @param monitorPointCount
     */
    public Task monitorPointCount(Integer monitorPointCount) {
        this.monitorPointCount = monitorPointCount;
        return this;
    }


    /**
     * set 拨测点频率
     *
     * @param monitorInterval
     */
    public Task monitorInterval(Integer monitorInterval) {
        this.monitorInterval = monitorInterval;
        return this;
    }


    /**
     * set 拨测开始时间
     *
     * @param monitorStartDate
     */
    public Task monitorStartDate(String monitorStartDate) {
        this.monitorStartDate = monitorStartDate;
        return this;
    }


    /**
     * set 拨测结束时间
     *
     * @param monitorEndDate
     */
    public Task monitorEndDate(String monitorEndDate) {
        this.monitorEndDate = monitorEndDate;
        return this;
    }


    /**
     * set 状态 0开启 1禁用
     *
     * @param status
     */
    public Task status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 任务的创建时间
     *
     * @param createdDate
     */
    public Task createdDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }


}