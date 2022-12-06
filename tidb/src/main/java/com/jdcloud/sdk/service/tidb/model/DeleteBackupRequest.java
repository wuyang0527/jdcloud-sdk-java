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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除TiDB的备份，仅允许删除用户创建的备份，系统的自动备份不允许删除。
 */
public class DeleteBackupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 备份ID
     * Required:true
     */
    @Required
    private String backupId;



    /**
     * get 地域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


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
     * set 地域代码
     *
     * @param regionId
     */
    public DeleteBackupRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 备份ID
     *
     * @param backupId
     */
    public DeleteBackupRequest backupId(String backupId) {
        this.backupId = backupId;
        return this;
    }


}