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

import java.util.List;
import java.util.ArrayList;

/**
 * activityDTO
 */
public class ActivityDTO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动开始时间
     */
    private String activityStartTime;

    /**
     * 活动结束时间
     */
    private String activityEndTime;

    /**
     * 活动地点
     */
    private String address;

    /**
     * 活动规模
     */
    private Integer scale;

    /**
     * 活动形式
     */
    private Integer form;

    /**
     * 活动目的
     */
    private String purpose;

    /**
     * 筹办方
     */
    private String organizer;

    /**
     * 活动预算
     */
    private String budget;

    /**
     * 重要参会组织
     */
    private String participateOrg;

    /**
     * 邀请嘉宾
     */
    private String guest;

    /**
     * 活动效果
     */
    private String effect;

    /**
     * 附件文件唯一标识
     */
    
    private List<String> fileUuids;


    /**
     * get 活动名称
     *
     * @return
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * set 活动名称
     *
     * @param activityName
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }


    /**
     * get 活动开始时间
     *
     * @return
     */
    public String getActivityStartTime() {
        return activityStartTime;
    }

    /**
     * set 活动开始时间
     *
     * @param activityStartTime
     */
    public void setActivityStartTime(String activityStartTime) {
        this.activityStartTime = activityStartTime;
    }


    /**
     * get 活动结束时间
     *
     * @return
     */
    public String getActivityEndTime() {
        return activityEndTime;
    }

    /**
     * set 活动结束时间
     *
     * @param activityEndTime
     */
    public void setActivityEndTime(String activityEndTime) {
        this.activityEndTime = activityEndTime;
    }


    /**
     * get 活动地点
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * set 活动地点
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * get 活动规模
     *
     * @return
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * set 活动规模
     *
     * @param scale
     */
    public void setScale(Integer scale) {
        this.scale = scale;
    }


    /**
     * get 活动形式
     *
     * @return
     */
    public Integer getForm() {
        return form;
    }

    /**
     * set 活动形式
     *
     * @param form
     */
    public void setForm(Integer form) {
        this.form = form;
    }


    /**
     * get 活动目的
     *
     * @return
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * set 活动目的
     *
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }


    /**
     * get 筹办方
     *
     * @return
     */
    public String getOrganizer() {
        return organizer;
    }

    /**
     * set 筹办方
     *
     * @param organizer
     */
    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }


    /**
     * get 活动预算
     *
     * @return
     */
    public String getBudget() {
        return budget;
    }

    /**
     * set 活动预算
     *
     * @param budget
     */
    public void setBudget(String budget) {
        this.budget = budget;
    }


    /**
     * get 重要参会组织
     *
     * @return
     */
    public String getParticipateOrg() {
        return participateOrg;
    }

    /**
     * set 重要参会组织
     *
     * @param participateOrg
     */
    public void setParticipateOrg(String participateOrg) {
        this.participateOrg = participateOrg;
    }


    /**
     * get 邀请嘉宾
     *
     * @return
     */
    public String getGuest() {
        return guest;
    }

    /**
     * set 邀请嘉宾
     *
     * @param guest
     */
    public void setGuest(String guest) {
        this.guest = guest;
    }


    /**
     * get 活动效果
     *
     * @return
     */
    public String getEffect() {
        return effect;
    }

    /**
     * set 活动效果
     *
     * @param effect
     */
    public void setEffect(String effect) {
        this.effect = effect;
    }


    /**
    * get 附件文件唯一标识
    *
    * @return
    */
    public List<String> getFileUuids() {
        return fileUuids;
    }

    /**
    * set 附件文件唯一标识
    *
    * @param fileUuids
    */
    public void setFileUuids(List<String> fileUuids) {
        this.fileUuids = fileUuids;
    }



    /**
     * set 活动名称
     *
     * @param activityName
     */
    public ActivityDTO activityName(String activityName) {
        this.activityName = activityName;
        return this;
    }


    /**
     * set 活动开始时间
     *
     * @param activityStartTime
     */
    public ActivityDTO activityStartTime(String activityStartTime) {
        this.activityStartTime = activityStartTime;
        return this;
    }


    /**
     * set 活动结束时间
     *
     * @param activityEndTime
     */
    public ActivityDTO activityEndTime(String activityEndTime) {
        this.activityEndTime = activityEndTime;
        return this;
    }


    /**
     * set 活动地点
     *
     * @param address
     */
    public ActivityDTO address(String address) {
        this.address = address;
        return this;
    }


    /**
     * set 活动规模
     *
     * @param scale
     */
    public ActivityDTO scale(Integer scale) {
        this.scale = scale;
        return this;
    }


    /**
     * set 活动形式
     *
     * @param form
     */
    public ActivityDTO form(Integer form) {
        this.form = form;
        return this;
    }


    /**
     * set 活动目的
     *
     * @param purpose
     */
    public ActivityDTO purpose(String purpose) {
        this.purpose = purpose;
        return this;
    }


    /**
     * set 筹办方
     *
     * @param organizer
     */
    public ActivityDTO organizer(String organizer) {
        this.organizer = organizer;
        return this;
    }


    /**
     * set 活动预算
     *
     * @param budget
     */
    public ActivityDTO budget(String budget) {
        this.budget = budget;
        return this;
    }


    /**
     * set 重要参会组织
     *
     * @param participateOrg
     */
    public ActivityDTO participateOrg(String participateOrg) {
        this.participateOrg = participateOrg;
        return this;
    }


    /**
     * set 邀请嘉宾
     *
     * @param guest
     */
    public ActivityDTO guest(String guest) {
        this.guest = guest;
        return this;
    }


    /**
     * set 活动效果
     *
     * @param effect
     */
    public ActivityDTO effect(String effect) {
        this.effect = effect;
        return this;
    }


    /**
    * set 附件文件唯一标识
    *
    * @param fileUuids
    */
    public ActivityDTO fileUuids(List<String> fileUuids) {
        this.fileUuids = fileUuids;
        return this;
    }



    /**
     * add item to 附件文件唯一标识
     *
     * @param fileUuid
     */
    public void addFileUuid(String fileUuid) {
        if (this.fileUuids == null) {
            this.fileUuids = new ArrayList<>();
        }
        this.fileUuids.add(fileUuid);
    }
}