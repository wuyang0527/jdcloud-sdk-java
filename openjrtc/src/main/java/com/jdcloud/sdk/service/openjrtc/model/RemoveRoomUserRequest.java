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
 * JrtcRoomUser
 * 房间人员管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 移除房间内人员

 */
public class RemoveRoomUserRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * peerId列表,最多支持20个peerId
     */
    private List<Long> peerIds;

    /**
     * 应用ID
     * Required:true
     */
    @Required
    private String appId;

    /**
     * 房间ID
     * Required:true
     */
    @Required
    private Long roomId;


    /**
     * get peerId列表,最多支持20个peerId
     *
     * @return
     */
    public List<Long> getPeerIds() {
        return peerIds;
    }

    /**
     * set peerId列表,最多支持20个peerId
     *
     * @param peerIds
     */
    public void setPeerIds(List<Long> peerIds) {
        this.peerIds = peerIds;
    }

    /**
     * get 应用ID
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get 房间ID
     *
     * @return
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * set 房间ID
     *
     * @param roomId
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }


    /**
     * set peerId列表,最多支持20个peerId
     *
     * @param peerIds
     */
    public RemoveRoomUserRequest peerIds(List<Long> peerIds) {
        this.peerIds = peerIds;
        return this;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public RemoveRoomUserRequest appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 房间ID
     *
     * @param roomId
     */
    public RemoveRoomUserRequest roomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }


    /**
     * add item to peerId列表,最多支持20个peerId
     *
     * @param peerId
     */
    public void addPeerId(Long peerId) {
        if (this.peerIds == null) {
            this.peerIds = new ArrayList<>();
        }
        this.peerIds.add(peerId);
    }

}