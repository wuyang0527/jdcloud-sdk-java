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
 * 镜像
 * 关于主机镜像操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
查询镜像任务详情。

将京东云私有镜像导出至京东云以外环境。

详细操作说明请参考帮助文档：
[导入私有镜像](https://docs.jdcloud.com/cn/virtual-machines/import-private-image)
[导出私有镜像](https://docs.jdcloud.com/cn/virtual-machines/export-private-image)

## 接口说明
- 调用该接口可查询镜像导入或导出的任务详情。

 */
public class ImageTasksRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务操作类型。支持范围：&#x60;ImportImage、ExportImage&#x60;。
     */
    private String taskAction;

    /**
     * 任务id列表。
     */
    private List<Integer> taskIds;

    /**
     * 任务状态。支持范围：&#x60;pending、running、failed、finished&#x60;。
     */
    private String taskStatus;

    /**
     * 任务开始时间
     */
    private String startTime;

    /**
     * 任务结束时间
     */
    private String endTime;

    /**
     * 页码；默认为1。
     */
    private Integer pageNumber;

    /**
     * 分页大小；取值范围[10, 100]。
     */
    private Integer pageSize;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 任务操作类型。支持范围：&#x60;ImportImage、ExportImage&#x60;。
     *
     * @return
     */
    public String getTaskAction() {
        return taskAction;
    }

    /**
     * set 任务操作类型。支持范围：&#x60;ImportImage、ExportImage&#x60;。
     *
     * @param taskAction
     */
    public void setTaskAction(String taskAction) {
        this.taskAction = taskAction;
    }

    /**
     * get 任务id列表。
     *
     * @return
     */
    public List<Integer> getTaskIds() {
        return taskIds;
    }

    /**
     * set 任务id列表。
     *
     * @param taskIds
     */
    public void setTaskIds(List<Integer> taskIds) {
        this.taskIds = taskIds;
    }

    /**
     * get 任务状态。支持范围：&#x60;pending、running、failed、finished&#x60;。
     *
     * @return
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * set 任务状态。支持范围：&#x60;pending、running、failed、finished&#x60;。
     *
     * @param taskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * get 任务开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 任务开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 任务结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 任务结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 页码；默认为1。
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1。
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；取值范围[10, 100]。
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；取值范围[10, 100]。
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
     * set 任务操作类型。支持范围：&#x60;ImportImage、ExportImage&#x60;。
     *
     * @param taskAction
     */
    public ImageTasksRequest taskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }

    /**
     * set 任务id列表。
     *
     * @param taskIds
     */
    public ImageTasksRequest taskIds(List<Integer> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    /**
     * set 任务状态。支持范围：&#x60;pending、running、failed、finished&#x60;。
     *
     * @param taskStatus
     */
    public ImageTasksRequest taskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * set 任务开始时间
     *
     * @param startTime
     */
    public ImageTasksRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 任务结束时间
     *
     * @param endTime
     */
    public ImageTasksRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 页码；默认为1。
     *
     * @param pageNumber
     */
    public ImageTasksRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；取值范围[10, 100]。
     *
     * @param pageSize
     */
    public ImageTasksRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public ImageTasksRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 任务id列表。
     *
     * @param taskId
     */
    public void addTaskId(Integer taskId) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskId);
    }

}