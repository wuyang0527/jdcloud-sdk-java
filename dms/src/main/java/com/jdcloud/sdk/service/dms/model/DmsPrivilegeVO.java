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

package com.jdcloud.sdk.service.dms.model;


/**
 * dmsPrivilegeVO
 */
public class DmsPrivilegeVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id。
     */
    private Long id;

    /**
     * 用户名。
     */
    private String username;

    /**
     * 用户pin。
     */
    private String pin;

    /**
     * 用户权限名称。
     */
    private String privilegeName;

    /**
     * 实例ID。
     */
    private String instanceId;

    /**
     * 实例名称。
     */
    private String instanceName;

    /**
     * 数据库库名。
     */
    private String databaseName;

    /**
     * 表名。
     */
    private String tableName;

    /**
     * 字段名称。
     */
    private String fieldName;

    /**
     * 授权状态。
     */
    private String authStatus;

    /**
     * 授权时间
     */
    private String authDate;

    /**
     * 过期时间
     */
    private String expireDate;

    /**
     * 权限是否已经释放。
     */
    private Boolean releaseStatus;

    /**
     * 实例类型。
     */
    private String instanceType;

    /**
     * 实例所属区域。
     */
    private String regionId;



    /**
     * get 主键Id。
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 主键Id。
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * get 用户名。
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * set 用户名。
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * get 用户pin。
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin。
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 用户权限名称。
     *
     * @return
     */
    public String getPrivilegeName() {
        return privilegeName;
    }

    /**
     * set 用户权限名称。
     *
     * @param privilegeName
     */
    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }


    /**
     * get 实例ID。
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID。
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get 实例名称。
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称。
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }


    /**
     * get 数据库库名。
     *
     * @return
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * set 数据库库名。
     *
     * @param databaseName
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }


    /**
     * get 表名。
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * set 表名。
     *
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    /**
     * get 字段名称。
     *
     * @return
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * set 字段名称。
     *
     * @param fieldName
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * get 授权状态。
     *
     * @return
     */
    public String getAuthStatus() {
        return authStatus;
    }

    /**
     * set 授权状态。
     *
     * @param authStatus
     */
    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }


    /**
     * get 授权时间
     *
     * @return
     */
    public String getAuthDate() {
        return authDate;
    }

    /**
     * set 授权时间
     *
     * @param authDate
     */
    public void setAuthDate(String authDate) {
        this.authDate = authDate;
    }


    /**
     * get 过期时间
     *
     * @return
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * set 过期时间
     *
     * @param expireDate
     */
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * get 权限是否已经释放。
     *
     * @return
     */
    public Boolean getReleaseStatus() {
        return releaseStatus;
    }

    /**
     * set 权限是否已经释放。
     *
     * @param releaseStatus
     */
    public void setReleaseStatus(Boolean releaseStatus) {
        this.releaseStatus = releaseStatus;
    }


    /**
     * get 实例类型。
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类型。
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }


    /**
     * get 实例所属区域。
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 实例所属区域。
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 主键Id。
     *
     * @param id
     */
    public DmsPrivilegeVO id(Long id) {
        this.id = id;
        return this;
    }


    /**
     * set 用户名。
     *
     * @param username
     */
    public DmsPrivilegeVO username(String username) {
        this.username = username;
        return this;
    }


    /**
     * set 用户pin。
     *
     * @param pin
     */
    public DmsPrivilegeVO pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 用户权限名称。
     *
     * @param privilegeName
     */
    public DmsPrivilegeVO privilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
        return this;
    }


    /**
     * set 实例ID。
     *
     * @param instanceId
     */
    public DmsPrivilegeVO instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set 实例名称。
     *
     * @param instanceName
     */
    public DmsPrivilegeVO instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }


    /**
     * set 数据库库名。
     *
     * @param databaseName
     */
    public DmsPrivilegeVO databaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }


    /**
     * set 表名。
     *
     * @param tableName
     */
    public DmsPrivilegeVO tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }


    /**
     * set 字段名称。
     *
     * @param fieldName
     */
    public DmsPrivilegeVO fieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }


    /**
     * set 授权状态。
     *
     * @param authStatus
     */
    public DmsPrivilegeVO authStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }


    /**
     * set 授权时间
     *
     * @param authDate
     */
    public DmsPrivilegeVO authDate(String authDate) {
        this.authDate = authDate;
        return this;
    }


    /**
     * set 过期时间
     *
     * @param expireDate
     */
    public DmsPrivilegeVO expireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }


    /**
     * set 权限是否已经释放。
     *
     * @param releaseStatus
     */
    public DmsPrivilegeVO releaseStatus(Boolean releaseStatus) {
        this.releaseStatus = releaseStatus;
        return this;
    }


    /**
     * set 实例类型。
     *
     * @param instanceType
     */
    public DmsPrivilegeVO instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }


    /**
     * set 实例所属区域。
     *
     * @param regionId
     */
    public DmsPrivilegeVO regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}