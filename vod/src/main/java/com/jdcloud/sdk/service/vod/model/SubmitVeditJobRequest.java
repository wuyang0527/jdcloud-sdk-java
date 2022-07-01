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
 * Vedit
 * 视频剪辑作业相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.vod.model.MediaMetadata;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 提交视频剪辑作业
 */
public class SubmitVeditJobRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工程ID
     * Required:true
     */
    @Required
    private Long projectId;

    /**
     * 合成媒资元数据
     */
    private MediaMetadata mediaMetadata;

    /**
     * 用户数据，JSON格式的字符串。
在Timeline中的所有MediaClip中，若有2个或以上的不同MediaId，即素材片段来源于2个或以上不同视频，则在提交剪辑作业时，必须在UserData中指明合并后的视频画面的宽高。
如 {\&quot;extendData\&quot;: {\&quot;width\&quot;: 720, \&quot;height\&quot;: 500}}，其中width和height必须为[16, 4096]之间的偶数
videoMode 支持 normal 普通模式 screen_record 屏幕录制模式 两种模式，默认为 normal。
如 &quot;{\&quot;extendData\&quot;:{\&quot;videoMode\&quot;:\&quot;screen_record\&quot;}}&quot;

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
     * get 用户数据，JSON格式的字符串。
在Timeline中的所有MediaClip中，若有2个或以上的不同MediaId，即素材片段来源于2个或以上不同视频，则在提交剪辑作业时，必须在UserData中指明合并后的视频画面的宽高。
如 {\&quot;extendData\&quot;: {\&quot;width\&quot;: 720, \&quot;height\&quot;: 500}}，其中width和height必须为[16, 4096]之间的偶数
videoMode 支持 normal 普通模式 screen_record 屏幕录制模式 两种模式，默认为 normal。
如 &quot;{\&quot;extendData\&quot;:{\&quot;videoMode\&quot;:\&quot;screen_record\&quot;}}&quot;

     *
     * @return
     */
    public String getUserData() {
        return userData;
    }

    /**
     * set 用户数据，JSON格式的字符串。
在Timeline中的所有MediaClip中，若有2个或以上的不同MediaId，即素材片段来源于2个或以上不同视频，则在提交剪辑作业时，必须在UserData中指明合并后的视频画面的宽高。
如 {\&quot;extendData\&quot;: {\&quot;width\&quot;: 720, \&quot;height\&quot;: 500}}，其中width和height必须为[16, 4096]之间的偶数
videoMode 支持 normal 普通模式 screen_record 屏幕录制模式 两种模式，默认为 normal。
如 &quot;{\&quot;extendData\&quot;:{\&quot;videoMode\&quot;:\&quot;screen_record\&quot;}}&quot;

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
    public SubmitVeditJobRequest projectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * set 合成媒资元数据
     *
     * @param mediaMetadata
     */
    public SubmitVeditJobRequest mediaMetadata(MediaMetadata mediaMetadata) {
        this.mediaMetadata = mediaMetadata;
        return this;
    }

    /**
     * set 用户数据，JSON格式的字符串。
在Timeline中的所有MediaClip中，若有2个或以上的不同MediaId，即素材片段来源于2个或以上不同视频，则在提交剪辑作业时，必须在UserData中指明合并后的视频画面的宽高。
如 {\&quot;extendData\&quot;: {\&quot;width\&quot;: 720, \&quot;height\&quot;: 500}}，其中width和height必须为[16, 4096]之间的偶数
videoMode 支持 normal 普通模式 screen_record 屏幕录制模式 两种模式，默认为 normal。
如 &quot;{\&quot;extendData\&quot;:{\&quot;videoMode\&quot;:\&quot;screen_record\&quot;}}&quot;

     *
     * @param userData
     */
    public SubmitVeditJobRequest userData(String userData) {
        this.userData = userData;
        return this;
    }


}