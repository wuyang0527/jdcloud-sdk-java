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
 * returnBill
 * 渠道管理平台返还单
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.partner.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * returnBillResult
 */
public class ReturnBillResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Number id;

    /**
     * 返还单号
     */
    private String retrunBillId;

    /**
     * 服务商ID
     */
    private String distributorId;

    /**
     * 服务商名称
     */
    private String distributorName;

    /**
     * 渠道商类型
     */
    private Integer distributorType;

    /**
     * month
     */
    private String month;

    /**
     * 生成时间
     */
    private String generateTime;

    /**
     * 开始时间
     */
    private String billBegin;

    /**
     * 结束时间
     */
    private String billEnd;

    /**
     * 周期类型
     */
    private Integer circleType;

    /**
     * 返还类型
     */
    private Integer returnType;

    /**
     * 返还类型名称
     */
    private String returnTypeName;

    /**
     * 返还金额
     */
    private Number returnMount;

    /**
     * 返还方式
     */
    private Integer returnMode;

    /**
     * 返还方式
     */
    private String returnModeName;

    /**
     * 合同主体
     */
    private String contractSubject;

    /**
     * 次数
     */
    private Integer redoQty;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 状态名称
     */
    private String statusName;

    /**
     * 驳回原因
     */
    private String reason;

    /**
     * 部门ID
     */
    private Integer deptId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 返还明细展示类型
     */
    private Integer returnDetailRuleType;

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
     * 是否删除0未删除,1已删除
     */
    private Integer yn;

    /**
     * 返还单明细
     */
    private List<ReturnBillDetailResult> returnBillDetailList;

    /**
     * 返还单状态
     */
    private List<ReturnBillStatusResult> returnBillStatusList;


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
     * get 返还单号
     *
     * @return
     */
    public String getRetrunBillId() {
        return retrunBillId;
    }

    /**
     * set 返还单号
     *
     * @param retrunBillId
     */
    public void setRetrunBillId(String retrunBillId) {
        this.retrunBillId = retrunBillId;
    }

    /**
     * get 服务商ID
     *
     * @return
     */
    public String getDistributorId() {
        return distributorId;
    }

    /**
     * set 服务商ID
     *
     * @param distributorId
     */
    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    /**
     * get 服务商名称
     *
     * @return
     */
    public String getDistributorName() {
        return distributorName;
    }

    /**
     * set 服务商名称
     *
     * @param distributorName
     */
    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
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
     * get month
     *
     * @return
     */
    public String getMonth() {
        return month;
    }

    /**
     * set month
     *
     * @param month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * get 生成时间
     *
     * @return
     */
    public String getGenerateTime() {
        return generateTime;
    }

    /**
     * set 生成时间
     *
     * @param generateTime
     */
    public void setGenerateTime(String generateTime) {
        this.generateTime = generateTime;
    }

    /**
     * get 开始时间
     *
     * @return
     */
    public String getBillBegin() {
        return billBegin;
    }

    /**
     * set 开始时间
     *
     * @param billBegin
     */
    public void setBillBegin(String billBegin) {
        this.billBegin = billBegin;
    }

    /**
     * get 结束时间
     *
     * @return
     */
    public String getBillEnd() {
        return billEnd;
    }

    /**
     * set 结束时间
     *
     * @param billEnd
     */
    public void setBillEnd(String billEnd) {
        this.billEnd = billEnd;
    }

    /**
     * get 周期类型
     *
     * @return
     */
    public Integer getCircleType() {
        return circleType;
    }

    /**
     * set 周期类型
     *
     * @param circleType
     */
    public void setCircleType(Integer circleType) {
        this.circleType = circleType;
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
     * get 返还类型名称
     *
     * @return
     */
    public String getReturnTypeName() {
        return returnTypeName;
    }

    /**
     * set 返还类型名称
     *
     * @param returnTypeName
     */
    public void setReturnTypeName(String returnTypeName) {
        this.returnTypeName = returnTypeName;
    }

    /**
     * get 返还金额
     *
     * @return
     */
    public Number getReturnMount() {
        return returnMount;
    }

    /**
     * set 返还金额
     *
     * @param returnMount
     */
    public void setReturnMount(Number returnMount) {
        this.returnMount = returnMount;
    }

    /**
     * get 返还方式
     *
     * @return
     */
    public Integer getReturnMode() {
        return returnMode;
    }

    /**
     * set 返还方式
     *
     * @param returnMode
     */
    public void setReturnMode(Integer returnMode) {
        this.returnMode = returnMode;
    }

    /**
     * get 返还方式
     *
     * @return
     */
    public String getReturnModeName() {
        return returnModeName;
    }

    /**
     * set 返还方式
     *
     * @param returnModeName
     */
    public void setReturnModeName(String returnModeName) {
        this.returnModeName = returnModeName;
    }

    /**
     * get 合同主体
     *
     * @return
     */
    public String getContractSubject() {
        return contractSubject;
    }

    /**
     * set 合同主体
     *
     * @param contractSubject
     */
    public void setContractSubject(String contractSubject) {
        this.contractSubject = contractSubject;
    }

    /**
     * get 次数
     *
     * @return
     */
    public Integer getRedoQty() {
        return redoQty;
    }

    /**
     * set 次数
     *
     * @param redoQty
     */
    public void setRedoQty(Integer redoQty) {
        this.redoQty = redoQty;
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
     * get 状态名称
     *
     * @return
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * set 状态名称
     *
     * @param statusName
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    /**
     * get 驳回原因
     *
     * @return
     */
    public String getReason() {
        return reason;
    }

    /**
     * set 驳回原因
     *
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
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
     * get 部门名称
     *
     * @return
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * set 部门名称
     *
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * get 返还明细展示类型
     *
     * @return
     */
    public Integer getReturnDetailRuleType() {
        return returnDetailRuleType;
    }

    /**
     * set 返还明细展示类型
     *
     * @param returnDetailRuleType
     */
    public void setReturnDetailRuleType(Integer returnDetailRuleType) {
        this.returnDetailRuleType = returnDetailRuleType;
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
     * get 是否删除0未删除,1已删除
     *
     * @return
     */
    public Integer getYn() {
        return yn;
    }

    /**
     * set 是否删除0未删除,1已删除
     *
     * @param yn
     */
    public void setYn(Integer yn) {
        this.yn = yn;
    }

    /**
     * get 返还单明细
     *
     * @return
     */
    public List<ReturnBillDetailResult> getReturnBillDetailList() {
        return returnBillDetailList;
    }

    /**
     * set 返还单明细
     *
     * @param returnBillDetailList
     */
    public void setReturnBillDetailList(List<ReturnBillDetailResult> returnBillDetailList) {
        this.returnBillDetailList = returnBillDetailList;
    }

    /**
     * get 返还单状态
     *
     * @return
     */
    public List<ReturnBillStatusResult> getReturnBillStatusList() {
        return returnBillStatusList;
    }

    /**
     * set 返还单状态
     *
     * @param returnBillStatusList
     */
    public void setReturnBillStatusList(List<ReturnBillStatusResult> returnBillStatusList) {
        this.returnBillStatusList = returnBillStatusList;
    }


    /**
     * set ID
     *
     * @param id
     */
    public ReturnBillResult id(Number id) {
        this.id = id;
        return this;
    }

    /**
     * set 返还单号
     *
     * @param retrunBillId
     */
    public ReturnBillResult retrunBillId(String retrunBillId) {
        this.retrunBillId = retrunBillId;
        return this;
    }

    /**
     * set 服务商ID
     *
     * @param distributorId
     */
    public ReturnBillResult distributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }

    /**
     * set 服务商名称
     *
     * @param distributorName
     */
    public ReturnBillResult distributorName(String distributorName) {
        this.distributorName = distributorName;
        return this;
    }

    /**
     * set 渠道商类型
     *
     * @param distributorType
     */
    public ReturnBillResult distributorType(Integer distributorType) {
        this.distributorType = distributorType;
        return this;
    }

    /**
     * set month
     *
     * @param month
     */
    public ReturnBillResult month(String month) {
        this.month = month;
        return this;
    }

    /**
     * set 生成时间
     *
     * @param generateTime
     */
    public ReturnBillResult generateTime(String generateTime) {
        this.generateTime = generateTime;
        return this;
    }

    /**
     * set 开始时间
     *
     * @param billBegin
     */
    public ReturnBillResult billBegin(String billBegin) {
        this.billBegin = billBegin;
        return this;
    }

    /**
     * set 结束时间
     *
     * @param billEnd
     */
    public ReturnBillResult billEnd(String billEnd) {
        this.billEnd = billEnd;
        return this;
    }

    /**
     * set 周期类型
     *
     * @param circleType
     */
    public ReturnBillResult circleType(Integer circleType) {
        this.circleType = circleType;
        return this;
    }

    /**
     * set 返还类型
     *
     * @param returnType
     */
    public ReturnBillResult returnType(Integer returnType) {
        this.returnType = returnType;
        return this;
    }

    /**
     * set 返还类型名称
     *
     * @param returnTypeName
     */
    public ReturnBillResult returnTypeName(String returnTypeName) {
        this.returnTypeName = returnTypeName;
        return this;
    }

    /**
     * set 返还金额
     *
     * @param returnMount
     */
    public ReturnBillResult returnMount(Number returnMount) {
        this.returnMount = returnMount;
        return this;
    }

    /**
     * set 返还方式
     *
     * @param returnMode
     */
    public ReturnBillResult returnMode(Integer returnMode) {
        this.returnMode = returnMode;
        return this;
    }

    /**
     * set 返还方式
     *
     * @param returnModeName
     */
    public ReturnBillResult returnModeName(String returnModeName) {
        this.returnModeName = returnModeName;
        return this;
    }

    /**
     * set 合同主体
     *
     * @param contractSubject
     */
    public ReturnBillResult contractSubject(String contractSubject) {
        this.contractSubject = contractSubject;
        return this;
    }

    /**
     * set 次数
     *
     * @param redoQty
     */
    public ReturnBillResult redoQty(Integer redoQty) {
        this.redoQty = redoQty;
        return this;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public ReturnBillResult status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 状态名称
     *
     * @param statusName
     */
    public ReturnBillResult statusName(String statusName) {
        this.statusName = statusName;
        return this;
    }

    /**
     * set 驳回原因
     *
     * @param reason
     */
    public ReturnBillResult reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * set 部门ID
     *
     * @param deptId
     */
    public ReturnBillResult deptId(Integer deptId) {
        this.deptId = deptId;
        return this;
    }

    /**
     * set 部门名称
     *
     * @param deptName
     */
    public ReturnBillResult deptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * set 返还明细展示类型
     *
     * @param returnDetailRuleType
     */
    public ReturnBillResult returnDetailRuleType(Integer returnDetailRuleType) {
        this.returnDetailRuleType = returnDetailRuleType;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public ReturnBillResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 创建人
     *
     * @param createUser
     */
    public ReturnBillResult createUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public ReturnBillResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 修改人
     *
     * @param updateUser
     */
    public ReturnBillResult updateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * set 是否删除0未删除,1已删除
     *
     * @param yn
     */
    public ReturnBillResult yn(Integer yn) {
        this.yn = yn;
        return this;
    }

    /**
     * set 返还单明细
     *
     * @param returnBillDetailList
     */
    public ReturnBillResult returnBillDetailList(List<ReturnBillDetailResult> returnBillDetailList) {
        this.returnBillDetailList = returnBillDetailList;
        return this;
    }

    /**
     * set 返还单状态
     *
     * @param returnBillStatusList
     */
    public ReturnBillResult returnBillStatusList(List<ReturnBillStatusResult> returnBillStatusList) {
        this.returnBillStatusList = returnBillStatusList;
        return this;
    }


    /**
     * add item to 返还单明细
     *
     * @param returnBillDetailList
     */
    public void addReturnBillDetailList(ReturnBillDetailResult returnBillDetailList) {
        if (this.returnBillDetailList == null) {
            this.returnBillDetailList = new ArrayList<>();
        }
        this.returnBillDetailList.add(returnBillDetailList);
    }

    /**
     * add item to 返还单状态
     *
     * @param returnBillStatusList
     */
    public void addReturnBillStatusList(ReturnBillStatusResult returnBillStatusList) {
        if (this.returnBillStatusList == null) {
            this.returnBillStatusList = new ArrayList<>();
        }
        this.returnBillStatusList.add(returnBillStatusList);
    }

}