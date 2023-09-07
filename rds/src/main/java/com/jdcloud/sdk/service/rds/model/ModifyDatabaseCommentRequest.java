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
 * 数据库管理
 * 数据库管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改数据库备注，仅支持MySQL
 */
public class ModifyDatabaseCommentRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库的备注信息，支持中午，ASCII字符，最大长度64
     * Required:true
     */
    @Required
    private String comment;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 库名称
     * Required:true
     */
    @Required
    private String dbName;



    /**
     * get 数据库的备注信息，支持中午，ASCII字符，最大长度64
     *
     * @return
     */
    public String getComment() {
        return comment;
    }

    /**
     * set 数据库的备注信息，支持中午，ASCII字符，最大长度64
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get RDS 实例ID，唯一标识一个RDS实例
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get 库名称
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 库名称
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }



    /**
     * set 数据库的备注信息，支持中午，ASCII字符，最大长度64
     *
     * @param comment
     */
    public ModifyDatabaseCommentRequest comment(String comment) {
        this.comment = comment;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public ModifyDatabaseCommentRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public ModifyDatabaseCommentRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set 库名称
     *
     * @param dbName
     */
    public ModifyDatabaseCommentRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }


}