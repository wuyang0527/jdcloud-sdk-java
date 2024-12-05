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
 * history replicator task
 * 同步历史数据API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.model;

import java.util.List;
import java.util.ArrayList;

/**
 * historyReplicationTaskInfo
 */
public class HistoryReplicationTaskInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * taskId
     */
    private Long taskId;

    /**
     * 是否覆盖
     */
    private String action;

    /**
     * bucket名称
     */
    private String bucketName;

    /**
     * bucket所属区域
     */
    private String bucketRegion;

    /**
     * 目标bucket名称
     */
    private String targetBucketName;

    /**
     * 目标bucket所属区域
     */
    private String targetBucketRegion;

    /**
     * 存储类型
     */
    private String storageClass;

    /**
     * prefixSet
     */
    
    private List<String> prefixSet;
    /**
     * 任务创建时间
     */
    private String createdTime;

    /**
     * 任务进度
     */
    private Double progress;

    /**
     * 任务状态
     */
    private String status;



    /**
     * get taskId
     *
     * @return
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * set taskId
     *
     * @param taskId
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }


    /**
     * get 是否覆盖
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 是否覆盖
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }


    /**
     * get bucket名称
     *
     * @return
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * set bucket名称
     *
     * @param bucketName
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }


    /**
     * get bucket所属区域
     *
     * @return
     */
    public String getBucketRegion() {
        return bucketRegion;
    }

    /**
     * set bucket所属区域
     *
     * @param bucketRegion
     */
    public void setBucketRegion(String bucketRegion) {
        this.bucketRegion = bucketRegion;
    }


    /**
     * get 目标bucket名称
     *
     * @return
     */
    public String getTargetBucketName() {
        return targetBucketName;
    }

    /**
     * set 目标bucket名称
     *
     * @param targetBucketName
     */
    public void setTargetBucketName(String targetBucketName) {
        this.targetBucketName = targetBucketName;
    }


    /**
     * get 目标bucket所属区域
     *
     * @return
     */
    public String getTargetBucketRegion() {
        return targetBucketRegion;
    }

    /**
     * set 目标bucket所属区域
     *
     * @param targetBucketRegion
     */
    public void setTargetBucketRegion(String targetBucketRegion) {
        this.targetBucketRegion = targetBucketRegion;
    }


    /**
     * get 存储类型
     *
     * @return
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * set 存储类型
     *
     * @param storageClass
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }


    /**
    * get prefixSet
    *
    * @return
    */
    public List<String> getPrefixSet() {
        return prefixSet;
    }

    /**
    * set prefixSet
    *
    * @param prefixSet
    */
    public void setPrefixSet(List<String> prefixSet) {
        this.prefixSet = prefixSet;
    }


    /**
     * get 任务创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 任务创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * get 任务进度
     *
     * @return
     */
    public Double getProgress() {
        return progress;
    }

    /**
     * set 任务进度
     *
     * @param progress
     */
    public void setProgress(Double progress) {
        this.progress = progress;
    }


    /**
     * get 任务状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 任务状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }



    /**
     * set taskId
     *
     * @param taskId
     */
    public HistoryReplicationTaskInfo taskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }


    /**
     * set 是否覆盖
     *
     * @param action
     */
    public HistoryReplicationTaskInfo action(String action) {
        this.action = action;
        return this;
    }


    /**
     * set bucket名称
     *
     * @param bucketName
     */
    public HistoryReplicationTaskInfo bucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }


    /**
     * set bucket所属区域
     *
     * @param bucketRegion
     */
    public HistoryReplicationTaskInfo bucketRegion(String bucketRegion) {
        this.bucketRegion = bucketRegion;
        return this;
    }


    /**
     * set 目标bucket名称
     *
     * @param targetBucketName
     */
    public HistoryReplicationTaskInfo targetBucketName(String targetBucketName) {
        this.targetBucketName = targetBucketName;
        return this;
    }


    /**
     * set 目标bucket所属区域
     *
     * @param targetBucketRegion
     */
    public HistoryReplicationTaskInfo targetBucketRegion(String targetBucketRegion) {
        this.targetBucketRegion = targetBucketRegion;
        return this;
    }


    /**
     * set 存储类型
     *
     * @param storageClass
     */
    public HistoryReplicationTaskInfo storageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }


    /**
    * set prefixSet
    *
    * @param prefixSet
    */
    public HistoryReplicationTaskInfo prefixSet(List<String> prefixSet) {
        this.prefixSet = prefixSet;
        return this;
    }


    /**
     * set 任务创建时间
     *
     * @param createdTime
     */
    public HistoryReplicationTaskInfo createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


    /**
     * set 任务进度
     *
     * @param progress
     */
    public HistoryReplicationTaskInfo progress(Double progress) {
        this.progress = progress;
        return this;
    }


    /**
     * set 任务状态
     *
     * @param status
     */
    public HistoryReplicationTaskInfo status(String status) {
        this.status = status;
        return this;
    }



    /**
     * add item to prefixSet
     *
     * @param prefixSet
     */
    public void addPrefixSet(String prefixSet) {
        if (this.prefixSet == null) {
            this.prefixSet = new ArrayList<>();
        }
        this.prefixSet.add(prefixSet);
    }
}