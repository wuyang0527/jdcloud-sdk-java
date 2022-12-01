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

package com.jdcloud.sdk.service.kubernetes.model;


/**
 * 集群升级计划
 */
public class UpgradePlan  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 升级方式 auto, manual
     */
    private String mode;

    /**
     * 升级范围 cluster, master, nodegroup
     */
    private String scope;

    /**
     * 升级计划状态 waiting, upgrading
     */
    private String state;

    /**
     * master 期望版本
     */
    private String masterExpectedVersion;

    /**
     * node 期望版本
     */
    private String nodeExpectedVersion;

    /**
     * 升级启动时间
     */
    private String startTime;

    /**
     * 持续时长
     */
    private Integer duration;



    /**
     * get 升级方式 auto, manual
     *
     * @return
     */
    public String getMode() {
        return mode;
    }

    /**
     * set 升级方式 auto, manual
     *
     * @param mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }


    /**
     * get 升级范围 cluster, master, nodegroup
     *
     * @return
     */
    public String getScope() {
        return scope;
    }

    /**
     * set 升级范围 cluster, master, nodegroup
     *
     * @param scope
     */
    public void setScope(String scope) {
        this.scope = scope;
    }


    /**
     * get 升级计划状态 waiting, upgrading
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * set 升级计划状态 waiting, upgrading
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * get master 期望版本
     *
     * @return
     */
    public String getMasterExpectedVersion() {
        return masterExpectedVersion;
    }

    /**
     * set master 期望版本
     *
     * @param masterExpectedVersion
     */
    public void setMasterExpectedVersion(String masterExpectedVersion) {
        this.masterExpectedVersion = masterExpectedVersion;
    }


    /**
     * get node 期望版本
     *
     * @return
     */
    public String getNodeExpectedVersion() {
        return nodeExpectedVersion;
    }

    /**
     * set node 期望版本
     *
     * @param nodeExpectedVersion
     */
    public void setNodeExpectedVersion(String nodeExpectedVersion) {
        this.nodeExpectedVersion = nodeExpectedVersion;
    }


    /**
     * get 升级启动时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 升级启动时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 持续时长
     *
     * @return
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * set 持续时长
     *
     * @param duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }



    /**
     * set 升级方式 auto, manual
     *
     * @param mode
     */
    public UpgradePlan mode(String mode) {
        this.mode = mode;
        return this;
    }


    /**
     * set 升级范围 cluster, master, nodegroup
     *
     * @param scope
     */
    public UpgradePlan scope(String scope) {
        this.scope = scope;
        return this;
    }


    /**
     * set 升级计划状态 waiting, upgrading
     *
     * @param state
     */
    public UpgradePlan state(String state) {
        this.state = state;
        return this;
    }


    /**
     * set master 期望版本
     *
     * @param masterExpectedVersion
     */
    public UpgradePlan masterExpectedVersion(String masterExpectedVersion) {
        this.masterExpectedVersion = masterExpectedVersion;
        return this;
    }


    /**
     * set node 期望版本
     *
     * @param nodeExpectedVersion
     */
    public UpgradePlan nodeExpectedVersion(String nodeExpectedVersion) {
        this.nodeExpectedVersion = nodeExpectedVersion;
        return this;
    }


    /**
     * set 升级启动时间
     *
     * @param startTime
     */
    public UpgradePlan startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 持续时长
     *
     * @param duration
     */
    public UpgradePlan duration(Integer duration) {
        this.duration = duration;
        return this;
    }


}