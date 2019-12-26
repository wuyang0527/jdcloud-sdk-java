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

package com.jdcloud.sdk.service.partner.model;


/**
 * returnPolicyMainQuery
 */
public class ReturnPolicyMainQuery  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Number id;

    /**
     * 部门ID
     */
    private Integer deptId;

    /**
     * 渠道商类型
     */
    private Integer distributorType;

    /**
     * 返还类型
     */
    private Integer returnType;

    /**
     * 返还政策主名称
     */
    private String returnPolicyName;

    /**
     * 返还政策主名称like
     */
    private String returnPolicyNameLike;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 当前页序号
     */
    private Integer pageIndex;

    /**
     * 每页结果数量
     */
    private Integer pageSize;

    /**
     * offset
     */
    private Integer offset;


    /**
     * get ID
     *
     * @return
     */
    public Number getId() {
        return id;
    }

    /**
     * set ID
     *
     * @param id
     */
    public void setId(Number id) {
        this.id = id;
    }

    /**
     * get 部门ID
     *
     * @return
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * set 部门ID
     *
     * @param deptId
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * get 渠道商类型
     *
     * @return
     */
    public Integer getDistributorType() {
        return distributorType;
    }

    /**
     * set 渠道商类型
     *
     * @param distributorType
     */
    public void setDistributorType(Integer distributorType) {
        this.distributorType = distributorType;
    }

    /**
     * get 返还类型
     *
     * @return
     */
    public Integer getReturnType() {
        return returnType;
    }

    /**
     * set 返还类型
     *
     * @param returnType
     */
    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    /**
     * get 返还政策主名称
     *
     * @return
     */
    public String getReturnPolicyName() {
        return returnPolicyName;
    }

    /**
     * set 返还政策主名称
     *
     * @param returnPolicyName
     */
    public void setReturnPolicyName(String returnPolicyName) {
        this.returnPolicyName = returnPolicyName;
    }

    /**
     * get 返还政策主名称like
     *
     * @return
     */
    public String getReturnPolicyNameLike() {
        return returnPolicyNameLike;
    }

    /**
     * set 返还政策主名称like
     *
     * @param returnPolicyNameLike
     */
    public void setReturnPolicyNameLike(String returnPolicyNameLike) {
        this.returnPolicyNameLike = returnPolicyNameLike;
    }

    /**
     * get 备注
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 备注
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * get 状态
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 创建人
     *
     * @return
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * set 创建人
     *
     * @param createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 修改人
     *
     * @return
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * set 修改人
     *
     * @param updateUser
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * get 当前页序号
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 当前页序号
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * get 每页结果数量
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页结果数量
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get offset
     *
     * @return
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * set offset
     *
     * @param offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }


    /**
     * set ID
     *
     * @param id
     */
    public ReturnPolicyMainQuery id(Number id) {
        this.id = id;
        return this;
    }

    /**
     * set 部门ID
     *
     * @param deptId
     */
    public ReturnPolicyMainQuery deptId(Integer deptId) {
        this.deptId = deptId;
        return this;
    }

    /**
     * set 渠道商类型
     *
     * @param distributorType
     */
    public ReturnPolicyMainQuery distributorType(Integer distributorType) {
        this.distributorType = distributorType;
        return this;
    }

    /**
     * set 返还类型
     *
     * @param returnType
     */
    public ReturnPolicyMainQuery returnType(Integer returnType) {
        this.returnType = returnType;
        return this;
    }

    /**
     * set 返还政策主名称
     *
     * @param returnPolicyName
     */
    public ReturnPolicyMainQuery returnPolicyName(String returnPolicyName) {
        this.returnPolicyName = returnPolicyName;
        return this;
    }

    /**
     * set 返还政策主名称like
     *
     * @param returnPolicyNameLike
     */
    public ReturnPolicyMainQuery returnPolicyNameLike(String returnPolicyNameLike) {
        this.returnPolicyNameLike = returnPolicyNameLike;
        return this;
    }

    /**
     * set 备注
     *
     * @param remark
     */
    public ReturnPolicyMainQuery remark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public ReturnPolicyMainQuery status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public ReturnPolicyMainQuery createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 创建人
     *
     * @param createUser
     */
    public ReturnPolicyMainQuery createUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public ReturnPolicyMainQuery updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 修改人
     *
     * @param updateUser
     */
    public ReturnPolicyMainQuery updateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * set 当前页序号
     *
     * @param pageIndex
     */
    public ReturnPolicyMainQuery pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set 每页结果数量
     *
     * @param pageSize
     */
    public ReturnPolicyMainQuery pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set offset
     *
     * @param offset
     */
    public ReturnPolicyMainQuery offset(Integer offset) {
        this.offset = offset;
        return this;
    }


}