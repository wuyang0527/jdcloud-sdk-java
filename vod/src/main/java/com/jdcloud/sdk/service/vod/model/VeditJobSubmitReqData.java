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

package com.jdcloud.sdk.service.vod.model;


/**
 * 视频剪辑作业提交信息
 */
public class VeditJobSubmitReqData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工程ID
     */
    private Long projectId;

    /**
     * 合成媒资元数据
     */
    private MediaMetadata mediaMetadata;

    /**
     * 用户数据，JSON格式字符串
     */
    private String userData;


    /**
     * get 工程ID
     *
     * @return
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * set 工程ID
     *
     * @param projectId
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * get 合成媒资元数据
     *
     * @return
     */
    public MediaMetadata getMediaMetadata() {
        return mediaMetadata;
    }

    /**
     * set 合成媒资元数据
     *
     * @param mediaMetadata
     */
    public void setMediaMetadata(MediaMetadata mediaMetadata) {
        this.mediaMetadata = mediaMetadata;
    }

    /**
     * get 用户数据，JSON格式字符串
     *
     * @return
     */
    public String getUserData() {
        return userData;
    }

    /**
     * set 用户数据，JSON格式字符串
     *
     * @param userData
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }


    /**
     * set 工程ID
     *
     * @param projectId
     */
    public VeditJobSubmitReqData projectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * set 合成媒资元数据
     *
     * @param mediaMetadata
     */
    public VeditJobSubmitReqData mediaMetadata(MediaMetadata mediaMetadata) {
        this.mediaMetadata = mediaMetadata;
        return this;
    }

    /**
     * set 用户数据，JSON格式字符串
     *
     * @param userData
     */
    public VeditJobSubmitReqData userData(String userData) {
        this.userData = userData;
        return this;
    }


}