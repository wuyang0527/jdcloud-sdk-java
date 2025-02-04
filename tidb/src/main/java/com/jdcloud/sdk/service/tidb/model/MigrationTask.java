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

package com.jdcloud.sdk.service.tidb.model;


/**
 * migrationTask
 */
public class MigrationTask  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 迁移任务ID
     */
    private String taskId;

    /**
     * 迁移任务类型，大小写不敏感，FULL_IMPORT:全量数据导入
     */
    private String migrationType;

    /**
     * 任务状态
     */
    private String status;

    /**
     * 任务开始时间
     */
    private String startTime;

    /**
     * 任务结束时间
     */
    private String endTime;

    /**
     * 任务持续时间，单位分钟
     */
    private Integer duration;

    /**
     * 迁移的数据文件名，包含bucket的全路径，例如dbbak/my_erp/erp.tar.gz
     */
    private String fileName;


    /**
     * get 迁移任务ID
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 迁移任务ID
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * get 迁移任务类型，大小写不敏感，FULL_IMPORT:全量数据导入
     *
     * @return
     */
    public String getMigrationType() {
        return migrationType;
    }

    /**
     * set 迁移任务类型，大小写不敏感，FULL_IMPORT:全量数据导入
     *
     * @param migrationType
     */
    public void setMigrationType(String migrationType) {
        this.migrationType = migrationType;
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
     * get 任务持续时间，单位分钟
     *
     * @return
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * set 任务持续时间，单位分钟
     *
     * @param duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * get 迁移的数据文件名，包含bucket的全路径，例如dbbak/my_erp/erp.tar.gz
     *
     * @return
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * set 迁移的数据文件名，包含bucket的全路径，例如dbbak/my_erp/erp.tar.gz
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * set 迁移任务ID
     *
     * @param taskId
     */
    public MigrationTask taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * set 迁移任务类型，大小写不敏感，FULL_IMPORT:全量数据导入
     *
     * @param migrationType
     */
    public MigrationTask migrationType(String migrationType) {
        this.migrationType = migrationType;
        return this;
    }

    /**
     * set 任务状态
     *
     * @param status
     */
    public MigrationTask status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 任务开始时间
     *
     * @param startTime
     */
    public MigrationTask startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 任务结束时间
     *
     * @param endTime
     */
    public MigrationTask endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 任务持续时间，单位分钟
     *
     * @param duration
     */
    public MigrationTask duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * set 迁移的数据文件名，包含bucket的全路径，例如dbbak/my_erp/erp.tar.gz
     *
     * @param fileName
     */
    public MigrationTask fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }


}