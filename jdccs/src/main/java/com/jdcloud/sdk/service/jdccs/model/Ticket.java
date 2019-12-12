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

package com.jdcloud.sdk.service.jdccs.model;


/**
 * 工单
 */
public class Ticket  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工单编号
     */
    private String ticketNo;

    /**
     * 工单名称
     */
    private String ticketTemplateName;

    /**
     * 工单模板CODE
     */
    private String ticketTemplateCode;

    /**
     * 工单类型
     */
    private String ticketTypeName;

    /**
     * 工单状态 pendingReview:待审核 已撤销 revoked:已撤销 processing:处理中 pendingVerification:待核验 pendingClose:待关单 rejected:已拒绝 completed:已完成 cancelled:已取消 draft:草稿中
     */
    private String status;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     */
    private String createdTime;

    /**
     * 关闭时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     */
    private String closedTime;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 机房英文标识
     */
    private String idc;

    /**
     * 机房名称
     */
    private String idcName;


    /**
     * get 工单编号
     *
     * @return
     */
    public String getTicketNo() {
        return ticketNo;
    }

    /**
     * set 工单编号
     *
     * @param ticketNo
     */
    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    /**
     * get 工单名称
     *
     * @return
     */
    public String getTicketTemplateName() {
        return ticketTemplateName;
    }

    /**
     * set 工单名称
     *
     * @param ticketTemplateName
     */
    public void setTicketTemplateName(String ticketTemplateName) {
        this.ticketTemplateName = ticketTemplateName;
    }

    /**
     * get 工单模板CODE
     *
     * @return
     */
    public String getTicketTemplateCode() {
        return ticketTemplateCode;
    }

    /**
     * set 工单模板CODE
     *
     * @param ticketTemplateCode
     */
    public void setTicketTemplateCode(String ticketTemplateCode) {
        this.ticketTemplateCode = ticketTemplateCode;
    }

    /**
     * get 工单类型
     *
     * @return
     */
    public String getTicketTypeName() {
        return ticketTypeName;
    }

    /**
     * set 工单类型
     *
     * @param ticketTypeName
     */
    public void setTicketTypeName(String ticketTypeName) {
        this.ticketTypeName = ticketTypeName;
    }

    /**
     * get 工单状态 pendingReview:待审核 已撤销 revoked:已撤销 processing:处理中 pendingVerification:待核验 pendingClose:待关单 rejected:已拒绝 completed:已完成 cancelled:已取消 draft:草稿中
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 工单状态 pendingReview:待审核 已撤销 revoked:已撤销 processing:处理中 pendingVerification:待核验 pendingClose:待关单 rejected:已拒绝 completed:已完成 cancelled:已取消 draft:草稿中
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 创建时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 创建时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get 关闭时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @return
     */
    public String getClosedTime() {
        return closedTime;
    }

    /**
     * set 关闭时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param closedTime
     */
    public void setClosedTime(String closedTime) {
        this.closedTime = closedTime;
    }

    /**
     * get 电话
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 电话
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * get 邮箱
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get 机房英文标识
     *
     * @return
     */
    public String getIdc() {
        return idc;
    }

    /**
     * set 机房英文标识
     *
     * @param idc
     */
    public void setIdc(String idc) {
        this.idc = idc;
    }

    /**
     * get 机房名称
     *
     * @return
     */
    public String getIdcName() {
        return idcName;
    }

    /**
     * set 机房名称
     *
     * @param idcName
     */
    public void setIdcName(String idcName) {
        this.idcName = idcName;
    }


    /**
     * set 工单编号
     *
     * @param ticketNo
     */
    public Ticket ticketNo(String ticketNo) {
        this.ticketNo = ticketNo;
        return this;
    }

    /**
     * set 工单名称
     *
     * @param ticketTemplateName
     */
    public Ticket ticketTemplateName(String ticketTemplateName) {
        this.ticketTemplateName = ticketTemplateName;
        return this;
    }

    /**
     * set 工单模板CODE
     *
     * @param ticketTemplateCode
     */
    public Ticket ticketTemplateCode(String ticketTemplateCode) {
        this.ticketTemplateCode = ticketTemplateCode;
        return this;
    }

    /**
     * set 工单类型
     *
     * @param ticketTypeName
     */
    public Ticket ticketTypeName(String ticketTypeName) {
        this.ticketTypeName = ticketTypeName;
        return this;
    }

    /**
     * set 工单状态 pendingReview:待审核 已撤销 revoked:已撤销 processing:处理中 pendingVerification:待核验 pendingClose:待关单 rejected:已拒绝 completed:已完成 cancelled:已取消 draft:草稿中
     *
     * @param status
     */
    public Ticket status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public Ticket description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 创建时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param createdTime
     */
    public Ticket createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 关闭时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param closedTime
     */
    public Ticket closedTime(String closedTime) {
        this.closedTime = closedTime;
        return this;
    }

    /**
     * set 电话
     *
     * @param phone
     */
    public Ticket phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public Ticket email(String email) {
        this.email = email;
        return this;
    }

    /**
     * set 机房英文标识
     *
     * @param idc
     */
    public Ticket idc(String idc) {
        this.idc = idc;
        return this;
    }

    /**
     * set 机房名称
     *
     * @param idcName
     */
    public Ticket idcName(String idcName) {
        this.idcName = idcName;
        return this;
    }


}