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
 * Backup-Management
 * 备份管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 进行 TiDB 实例的全量备份，对实例中所有的数据库进行备份。同一时间，只能有一个正在运行的备份任务。
 */
public class CreateBackupResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 备份ID
     */
    private String backupId;



    /**
     * get 备份ID
     *
     * @return
     */
    public String getBackupId() {
        return backupId;
    }

    /**
     * set 备份ID
     *
     * @param backupId
     */
    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }



    /**
     * set 备份ID
     *
     * @param backupId
     */
    public CreateBackupResult backupId(String backupId) {
        this.backupId = backupId;
        return this;
    }


}