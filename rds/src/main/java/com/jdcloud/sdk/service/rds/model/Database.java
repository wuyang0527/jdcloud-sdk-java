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

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;

/**
 * database
 */
public class Database  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     */
    private String dbName;

    /**
     * 数据库状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- **MySQL：不支持，不返回该字段**&lt;br&gt;- **SQL Server：返回该字段**
     */
    private String dbStatus;

    /**
     * 字符集，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String characterSetName;

    /**
     * 数据库创建时间，格式YYYY-MM-DD HH:mm:ss&lt;br&gt;- 仅支持SQL Server
     */
    private String createTime;

    /**
     * 数据库备注&lt;br&gt;- 仅支持MySQL
     */
    private String comment;

    /**
     * 该数据库相关账户权限列表
     */
    private List<DBAccessPrivilege> accessPrivilege;


    /**
     * get 数据库名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 数据库状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- **MySQL：不支持，不返回该字段**&lt;br&gt;- **SQL Server：返回该字段**
     *
     * @return
     */
    public String getDbStatus() {
        return dbStatus;
    }

    /**
     * set 数据库状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- **MySQL：不支持，不返回该字段**&lt;br&gt;- **SQL Server：返回该字段**
     *
     * @param dbStatus
     */
    public void setDbStatus(String dbStatus) {
        this.dbStatus = dbStatus;
    }

    /**
     * get 字符集，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * set 字符集，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param characterSetName
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * get 数据库创建时间，格式YYYY-MM-DD HH:mm:ss&lt;br&gt;- 仅支持SQL Server
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 数据库创建时间，格式YYYY-MM-DD HH:mm:ss&lt;br&gt;- 仅支持SQL Server
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 数据库备注&lt;br&gt;- 仅支持MySQL
     *
     * @return
     */
    public String getComment() {
        return comment;
    }

    /**
     * set 数据库备注&lt;br&gt;- 仅支持MySQL
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * get 该数据库相关账户权限列表
     *
     * @return
     */
    public List<DBAccessPrivilege> getAccessPrivilege() {
        return accessPrivilege;
    }

    /**
     * set 该数据库相关账户权限列表
     *
     * @param accessPrivilege
     */
    public void setAccessPrivilege(List<DBAccessPrivilege> accessPrivilege) {
        this.accessPrivilege = accessPrivilege;
    }


    /**
     * set 数据库名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Database-and-Cache-Service/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @param dbName
     */
    public Database dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 数据库状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)&lt;br&gt;- **MySQL：不支持，不返回该字段**&lt;br&gt;- **SQL Server：返回该字段**
     *
     * @param dbStatus
     */
    public Database dbStatus(String dbStatus) {
        this.dbStatus = dbStatus;
        return this;
    }

    /**
     * set 字符集，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param characterSetName
     */
    public Database characterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * set 数据库创建时间，格式YYYY-MM-DD HH:mm:ss&lt;br&gt;- 仅支持SQL Server
     *
     * @param createTime
     */
    public Database createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 数据库备注&lt;br&gt;- 仅支持MySQL
     *
     * @param comment
     */
    public Database comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * set 该数据库相关账户权限列表
     *
     * @param accessPrivilege
     */
    public Database accessPrivilege(List<DBAccessPrivilege> accessPrivilege) {
        this.accessPrivilege = accessPrivilege;
        return this;
    }


    /**
     * add item to 该数据库相关账户权限列表
     *
     * @param accessPrivilege
     */
    public void addAccessPrivilege(DBAccessPrivilege accessPrivilege) {
        if (this.accessPrivilege == null) {
            this.accessPrivilege = new ArrayList<>();
        }
        this.accessPrivilege.add(accessPrivilege);
    }

}