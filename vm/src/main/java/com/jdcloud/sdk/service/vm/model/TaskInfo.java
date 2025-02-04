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

package com.jdcloud.sdk.service.vm.model;


/**
 * 镜像导入导出任务详情。
 */
public class TaskInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务ID。
     */
    private String taskId;

    /**
     * 任务操作类型。支持范围：&#x60;ImportImage、ExportImage&#x60;。
     */
    private String action;

    /**
     * 任务状态。支持范围：&#x60;pending、running、failed、finished&#x60;。
     */
    private String taskStatus;

    /**
     * 任务进度，0% - 100%。
     */
    private Integer progress;

    /**
     * 任务失败的原因。
     */
    private String errorInfo;

    /**
     * 额外描述信息。
     */
    private String message;

    /**
     * 任务创建时间。
     */
    private String createdTime;

    /**
     * 任务完成时间。
     */
    private String finishedTime;

    /**
     * 镜像ID。
     */
    private String imageId;

    /**
     * 导出镜像时有效，表示目标OSS存储地址。
     */
    private String ossUrl;

    /**
     * 导出镜像时有效，表示生成的ossObject名称。
     */
    private String ossObject;

    /**
     * 导入镜像时有效，表示用户指定的镜像名称。
     */
    private String imageName;

    /**
     * 导入镜像时有效，源OSS外链地址。
     */
    private String imageUrl;


    /**
     * get 任务ID。
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 任务ID。
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * get 任务操作类型。支持范围：&#x60;ImportImage、ExportImage&#x60;。
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 任务操作类型。支持范围：&#x60;ImportImage、ExportImage&#x60;。
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
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
     * get 任务进度，0% - 100%。
     *
     * @return
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * set 任务进度，0% - 100%。
     *
     * @param progress
     */
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    /**
     * get 任务失败的原因。
     *
     * @return
     */
    public String getErrorInfo() {
        return errorInfo;
    }

    /**
     * set 任务失败的原因。
     *
     * @param errorInfo
     */
    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * get 额外描述信息。
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 额外描述信息。
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * get 任务创建时间。
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 任务创建时间。
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get 任务完成时间。
     *
     * @return
     */
    public String getFinishedTime() {
        return finishedTime;
    }

    /**
     * set 任务完成时间。
     *
     * @param finishedTime
     */
    public void setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
    }

    /**
     * get 镜像ID。
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID。
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * get 导出镜像时有效，表示目标OSS存储地址。
     *
     * @return
     */
    public String getOssUrl() {
        return ossUrl;
    }

    /**
     * set 导出镜像时有效，表示目标OSS存储地址。
     *
     * @param ossUrl
     */
    public void setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
    }

    /**
     * get 导出镜像时有效，表示生成的ossObject名称。
     *
     * @return
     */
    public String getOssObject() {
        return ossObject;
    }

    /**
     * set 导出镜像时有效，表示生成的ossObject名称。
     *
     * @param ossObject
     */
    public void setOssObject(String ossObject) {
        this.ossObject = ossObject;
    }

    /**
     * get 导入镜像时有效，表示用户指定的镜像名称。
     *
     * @return
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * set 导入镜像时有效，表示用户指定的镜像名称。
     *
     * @param imageName
     */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * get 导入镜像时有效，源OSS外链地址。
     *
     * @return
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * set 导入镜像时有效，源OSS外链地址。
     *
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    /**
     * set 任务ID。
     *
     * @param taskId
     */
    public TaskInfo taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * set 任务操作类型。支持范围：&#x60;ImportImage、ExportImage&#x60;。
     *
     * @param action
     */
    public TaskInfo action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set 任务状态。支持范围：&#x60;pending、running、failed、finished&#x60;。
     *
     * @param taskStatus
     */
    public TaskInfo taskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * set 任务进度，0% - 100%。
     *
     * @param progress
     */
    public TaskInfo progress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * set 任务失败的原因。
     *
     * @param errorInfo
     */
    public TaskInfo errorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    /**
     * set 额外描述信息。
     *
     * @param message
     */
    public TaskInfo message(String message) {
        this.message = message;
        return this;
    }

    /**
     * set 任务创建时间。
     *
     * @param createdTime
     */
    public TaskInfo createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 任务完成时间。
     *
     * @param finishedTime
     */
    public TaskInfo finishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }

    /**
     * set 镜像ID。
     *
     * @param imageId
     */
    public TaskInfo imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * set 导出镜像时有效，表示目标OSS存储地址。
     *
     * @param ossUrl
     */
    public TaskInfo ossUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }

    /**
     * set 导出镜像时有效，表示生成的ossObject名称。
     *
     * @param ossObject
     */
    public TaskInfo ossObject(String ossObject) {
        this.ossObject = ossObject;
        return this;
    }

    /**
     * set 导入镜像时有效，表示用户指定的镜像名称。
     *
     * @param imageName
     */
    public TaskInfo imageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * set 导入镜像时有效，源OSS外链地址。
     *
     * @param imageUrl
     */
    public TaskInfo imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }


}