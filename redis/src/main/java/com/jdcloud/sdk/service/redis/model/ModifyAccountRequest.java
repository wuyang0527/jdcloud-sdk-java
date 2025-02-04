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
 * Redis Instance API
 * 缓存Redis实例的创建、删除、修改基本信息、设置密码、变配、实例列表、备份、配置参数等接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改账号信息
 */
public class ModifyAccountRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账号名称
     * Required:true
     */
    @Required
    private String accountName;

    /**
     * 账号密码
     */
    private String accountPassword;

    /**
     * 账号权限。支持RoleReadOnly（只读权限）、RoleReadWrite（读写权限）
     */
    private String accountPrivilege;

    /**
     * 账号备注
     */
    private String accountDescription;

    /**
     * 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 缓存Redis实例ID，是访问实例的唯一标识
     * Required:true
     */
    @Required
    private String cacheInstanceId;


    /**
     * get 账号名称
     *
     * @return
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * set 账号名称
     *
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * get 账号密码
     *
     * @return
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * set 账号密码
     *
     * @param accountPassword
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    /**
     * get 账号权限。支持RoleReadOnly（只读权限）、RoleReadWrite（读写权限）
     *
     * @return
     */
    public String getAccountPrivilege() {
        return accountPrivilege;
    }

    /**
     * set 账号权限。支持RoleReadOnly（只读权限）、RoleReadWrite（读写权限）
     *
     * @param accountPrivilege
     */
    public void setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
    }

    /**
     * get 账号备注
     *
     * @return
     */
    public String getAccountDescription() {
        return accountDescription;
    }

    /**
     * set 账号备注
     *
     * @param accountDescription
     */
    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    /**
     * get 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 缓存Redis实例ID，是访问实例的唯一标识
     *
     * @return
     */
    public String getCacheInstanceId() {
        return cacheInstanceId;
    }

    /**
     * set 缓存Redis实例ID，是访问实例的唯一标识
     *
     * @param cacheInstanceId
     */
    public void setCacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
    }


    /**
     * set 账号名称
     *
     * @param accountName
     */
    public ModifyAccountRequest accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * set 账号密码
     *
     * @param accountPassword
     */
    public ModifyAccountRequest accountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }

    /**
     * set 账号权限。支持RoleReadOnly（只读权限）、RoleReadWrite（读写权限）
     *
     * @param accountPrivilege
     */
    public ModifyAccountRequest accountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }

    /**
     * set 账号备注
     *
     * @param accountDescription
     */
    public ModifyAccountRequest accountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }

    /**
     * set 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public ModifyAccountRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 缓存Redis实例ID，是访问实例的唯一标识
     *
     * @param cacheInstanceId
     */
    public ModifyAccountRequest cacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
        return this;
    }


}