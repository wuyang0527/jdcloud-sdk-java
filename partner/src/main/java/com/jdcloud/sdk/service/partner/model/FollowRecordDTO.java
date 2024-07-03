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
 * followRecordDTO
 */
public class FollowRecordDTO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Number id;

    /**
     * 业务操作（add添加、modify修改）
     */
    private String cmd;

    /**
     * 业务类型（1 合作线索 2合作伙伴 3合作信息）
     */
    private Integer businessType;

    /**
     * 业务ID
     */
    private String businessId;

    /**
     * 业务号码
     */
    private String businessNo;

    /**
     * 业务号码2
     */
    private String businessNo2;

    /**
     * 跟进人
     */
    private String followPerson;

    /**
     * 内容
     */
    private String content;

    /**
     * 跟进时间
     */
    private String followTime;

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
     * get 业务操作（add添加、modify修改）
     *
     * @return
     */
    public String getCmd() {
        return cmd;
    }

    /**
     * set 业务操作（add添加、modify修改）
     *
     * @param cmd
     */
    public void setCmd(String cmd) {
        this.cmd = cmd;
    }


    /**
     * get 业务类型（1 合作线索 2合作伙伴 3合作信息）
     *
     * @return
     */
    public Integer getBusinessType() {
        return businessType;
    }

    /**
     * set 业务类型（1 合作线索 2合作伙伴 3合作信息）
     *
     * @param businessType
     */
    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }


    /**
     * get 业务ID
     *
     * @return
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * set 业务ID
     *
     * @param businessId
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }


    /**
     * get 业务号码
     *
     * @return
     */
    public String getBusinessNo() {
        return businessNo;
    }

    /**
     * set 业务号码
     *
     * @param businessNo
     */
    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }


    /**
     * get 业务号码2
     *
     * @return
     */
    public String getBusinessNo2() {
        return businessNo2;
    }

    /**
     * set 业务号码2
     *
     * @param businessNo2
     */
    public void setBusinessNo2(String businessNo2) {
        this.businessNo2 = businessNo2;
    }


    /**
     * get 跟进人
     *
     * @return
     */
    public String getFollowPerson() {
        return followPerson;
    }

    /**
     * set 跟进人
     *
     * @param followPerson
     */
    public void setFollowPerson(String followPerson) {
        this.followPerson = followPerson;
    }


    /**
     * get 内容
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set 内容
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * get 跟进时间
     *
     * @return
     */
    public String getFollowTime() {
        return followTime;
    }

    /**
     * set 跟进时间
     *
     * @param followTime
     */
    public void setFollowTime(String followTime) {
        this.followTime = followTime;
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
     * set ID
     *
     * @param id
     */
    public FollowRecordDTO id(Number id) {
        this.id = id;
        return this;
    }


    /**
     * set 业务操作（add添加、modify修改）
     *
     * @param cmd
     */
    public FollowRecordDTO cmd(String cmd) {
        this.cmd = cmd;
        return this;
    }


    /**
     * set 业务类型（1 合作线索 2合作伙伴 3合作信息）
     *
     * @param businessType
     */
    public FollowRecordDTO businessType(Integer businessType) {
        this.businessType = businessType;
        return this;
    }


    /**
     * set 业务ID
     *
     * @param businessId
     */
    public FollowRecordDTO businessId(String businessId) {
        this.businessId = businessId;
        return this;
    }


    /**
     * set 业务号码
     *
     * @param businessNo
     */
    public FollowRecordDTO businessNo(String businessNo) {
        this.businessNo = businessNo;
        return this;
    }


    /**
     * set 业务号码2
     *
     * @param businessNo2
     */
    public FollowRecordDTO businessNo2(String businessNo2) {
        this.businessNo2 = businessNo2;
        return this;
    }


    /**
     * set 跟进人
     *
     * @param followPerson
     */
    public FollowRecordDTO followPerson(String followPerson) {
        this.followPerson = followPerson;
        return this;
    }


    /**
     * set 内容
     *
     * @param content
     */
    public FollowRecordDTO content(String content) {
        this.content = content;
        return this;
    }


    /**
     * set 跟进时间
     *
     * @param followTime
     */
    public FollowRecordDTO followTime(String followTime) {
        this.followTime = followTime;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public FollowRecordDTO createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 创建人
     *
     * @param createUser
     */
    public FollowRecordDTO createUser(String createUser) {
        this.createUser = createUser;
        return this;
    }


    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public FollowRecordDTO updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 修改人
     *
     * @param updateUser
     */
    public FollowRecordDTO updateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }


    /**
     * set 是否删除0未删除,1已删除
     *
     * @param yn
     */
    public FollowRecordDTO yn(Integer yn) {
        this.yn = yn;
        return this;
    }


}