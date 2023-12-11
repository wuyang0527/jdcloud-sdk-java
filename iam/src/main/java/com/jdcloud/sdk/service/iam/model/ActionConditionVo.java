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

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * actionConditionVo
 */
public class ActionConditionVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     * Required:true
     */
    @Required
    private Integer id;

    /**
     * serviceName
     * Required:true
     */
    @Required
    private String serviceName;

    /**
     * action
     * Required:true
     */
    @Required
    private String action;

    /**
     * conditionName
     * Required:true
     */
    @Required
    private String conditionName;

    /**
     * postProcess
     * Required:true
     */
    @Required
    private Integer postProcess;

    /**
     * type
     * Required:true
     */
    @Required
    private Integer type;

    /**
     * createTime
     * Required:true
     */
    @Required
    private String createTime;

    /**
     * updateTime
     * Required:true
     */
    @Required
    private String updateTime;



    /**
     * get id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get serviceName
     *
     * @return
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * set serviceName
     *
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * get action
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set action
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }


    /**
     * get conditionName
     *
     * @return
     */
    public String getConditionName() {
        return conditionName;
    }

    /**
     * set conditionName
     *
     * @param conditionName
     */
    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }


    /**
     * get postProcess
     *
     * @return
     */
    public Integer getPostProcess() {
        return postProcess;
    }

    /**
     * set postProcess
     *
     * @param postProcess
     */
    public void setPostProcess(Integer postProcess) {
        this.postProcess = postProcess;
    }


    /**
     * get type
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set type
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }


    /**
     * get createTime
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }



    /**
     * set id
     *
     * @param id
     */
    public ActionConditionVo id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set serviceName
     *
     * @param serviceName
     */
    public ActionConditionVo serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }


    /**
     * set action
     *
     * @param action
     */
    public ActionConditionVo action(String action) {
        this.action = action;
        return this;
    }


    /**
     * set conditionName
     *
     * @param conditionName
     */
    public ActionConditionVo conditionName(String conditionName) {
        this.conditionName = conditionName;
        return this;
    }


    /**
     * set postProcess
     *
     * @param postProcess
     */
    public ActionConditionVo postProcess(Integer postProcess) {
        this.postProcess = postProcess;
        return this;
    }


    /**
     * set type
     *
     * @param type
     */
    public ActionConditionVo type(Integer type) {
        this.type = type;
        return this;
    }


    /**
     * set createTime
     *
     * @param createTime
     */
    public ActionConditionVo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set updateTime
     *
     * @param updateTime
     */
    public ActionConditionVo updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}