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

package com.jdcloud.sdk.service.redis.model;


/**
 * 任务进度信息
 */
public class TaskProgress  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务类型：resize表示变配，同一时刻只能有一个变配任务
     */
    private String taskType;

    /**
     * 任务id
     */
    private String taskId;

    /**
     * 任务状态：init表示初始化，running表示运行中，success表示成功，fail表示失败
     */
    private String taskStatus;

    /**
     * 任务执行百分比
     */
    private Integer progressPercent;

    /**
     * 执行时长（单位：秒）
     */
    private Integer elapsedTimeSecond;

    /**
     * 启动时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     */
    private String startTime;



    /**
     * get 任务类型：resize表示变配，同一时刻只能有一个变配任务
     *
     * @return
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * set 任务类型：resize表示变配，同一时刻只能有一个变配任务
     *
     * @param taskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }


    /**
     * get 任务id
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 任务id
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }


    /**
     * get 任务状态：init表示初始化，running表示运行中，success表示成功，fail表示失败
     *
     * @return
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * set 任务状态：init表示初始化，running表示运行中，success表示成功，fail表示失败
     *
     * @param taskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }


    /**
     * get 任务执行百分比
     *
     * @return
     */
    public Integer getProgressPercent() {
        return progressPercent;
    }

    /**
     * set 任务执行百分比
     *
     * @param progressPercent
     */
    public void setProgressPercent(Integer progressPercent) {
        this.progressPercent = progressPercent;
    }


    /**
     * get 执行时长（单位：秒）
     *
     * @return
     */
    public Integer getElapsedTimeSecond() {
        return elapsedTimeSecond;
    }

    /**
     * set 执行时长（单位：秒）
     *
     * @param elapsedTimeSecond
     */
    public void setElapsedTimeSecond(Integer elapsedTimeSecond) {
        this.elapsedTimeSecond = elapsedTimeSecond;
    }


    /**
     * get 启动时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 启动时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }



    /**
     * set 任务类型：resize表示变配，同一时刻只能有一个变配任务
     *
     * @param taskType
     */
    public TaskProgress taskType(String taskType) {
        this.taskType = taskType;
        return this;
    }


    /**
     * set 任务id
     *
     * @param taskId
     */
    public TaskProgress taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }


    /**
     * set 任务状态：init表示初始化，running表示运行中，success表示成功，fail表示失败
     *
     * @param taskStatus
     */
    public TaskProgress taskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }


    /**
     * set 任务执行百分比
     *
     * @param progressPercent
     */
    public TaskProgress progressPercent(Integer progressPercent) {
        this.progressPercent = progressPercent;
        return this;
    }


    /**
     * set 执行时长（单位：秒）
     *
     * @param elapsedTimeSecond
     */
    public TaskProgress elapsedTimeSecond(Integer elapsedTimeSecond) {
        this.elapsedTimeSecond = elapsedTimeSecond;
        return this;
    }


    /**
     * set 启动时间（ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ）
     *
     * @param startTime
     */
    public TaskProgress startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


}