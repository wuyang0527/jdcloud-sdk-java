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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.tidb.model.Backup;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看该实例下所有备份的详细信息
 */
public class DescribeBackupsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * backups
     */
    
    private List<Backup> backups;
    /**
     * 总记录数
     */
    private Integer totalCount;



    /**
    * get backups
    *
    * @return
    */
    public List<Backup> getBackups() {
        return backups;
    }

    /**
    * set backups
    *
    * @param backups
    */
    public void setBackups(List<Backup> backups) {
        this.backups = backups;
    }


    /**
     * get 总记录数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总记录数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set backups
    *
    * @param backups
    */
    public DescribeBackupsResult backups(List<Backup> backups) {
        this.backups = backups;
        return this;
    }


    /**
     * set 总记录数
     *
     * @param totalCount
     */
    public DescribeBackupsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to backups
     *
     * @param backup
     */
    public void addBackup(Backup backup) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        this.backups.add(backup);
    }
}