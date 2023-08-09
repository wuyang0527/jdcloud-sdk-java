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

package com.jdcloud.sdk.service.dts.model;


/**
 * ticdcChangefeedInfo
 */
public class TicdcChangefeedInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 同步任务 ID
     */
    private String id;

    /**
     * 上游 ID
     */
    private Integer upstreamId;

    /**
     * 命名空间
     */
    private String namespace;

    /**
     * 任务状态
     */
    private String feedState;

    /**
     * 任务Checkpoint TSO
     */
    private String checkpointTso;

    /**
     * 任务Checkpoint Time
     */
    private String checkpointTime;

    /**
     * error
     */
    private TicdcError error;



    /**
     * get 同步任务 ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 同步任务 ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * get 上游 ID
     *
     * @return
     */
    public Integer getUpstreamId() {
        return upstreamId;
    }

    /**
     * set 上游 ID
     *
     * @param upstreamId
     */
    public void setUpstreamId(Integer upstreamId) {
        this.upstreamId = upstreamId;
    }


    /**
     * get 命名空间
     *
     * @return
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * set 命名空间
     *
     * @param namespace
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }


    /**
     * get 任务状态
     *
     * @return
     */
    public String getFeedState() {
        return feedState;
    }

    /**
     * set 任务状态
     *
     * @param feedState
     */
    public void setFeedState(String feedState) {
        this.feedState = feedState;
    }


    /**
     * get 任务Checkpoint TSO
     *
     * @return
     */
    public String getCheckpointTso() {
        return checkpointTso;
    }

    /**
     * set 任务Checkpoint TSO
     *
     * @param checkpointTso
     */
    public void setCheckpointTso(String checkpointTso) {
        this.checkpointTso = checkpointTso;
    }


    /**
     * get 任务Checkpoint Time
     *
     * @return
     */
    public String getCheckpointTime() {
        return checkpointTime;
    }

    /**
     * set 任务Checkpoint Time
     *
     * @param checkpointTime
     */
    public void setCheckpointTime(String checkpointTime) {
        this.checkpointTime = checkpointTime;
    }


    /**
     * get error
     *
     * @return
     */
    public TicdcError getError() {
        return error;
    }

    /**
     * set error
     *
     * @param error
     */
    public void setError(TicdcError error) {
        this.error = error;
    }



    /**
     * set 同步任务 ID
     *
     * @param id
     */
    public TicdcChangefeedInfo id(String id) {
        this.id = id;
        return this;
    }


    /**
     * set 上游 ID
     *
     * @param upstreamId
     */
    public TicdcChangefeedInfo upstreamId(Integer upstreamId) {
        this.upstreamId = upstreamId;
        return this;
    }


    /**
     * set 命名空间
     *
     * @param namespace
     */
    public TicdcChangefeedInfo namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }


    /**
     * set 任务状态
     *
     * @param feedState
     */
    public TicdcChangefeedInfo feedState(String feedState) {
        this.feedState = feedState;
        return this;
    }


    /**
     * set 任务Checkpoint TSO
     *
     * @param checkpointTso
     */
    public TicdcChangefeedInfo checkpointTso(String checkpointTso) {
        this.checkpointTso = checkpointTso;
        return this;
    }


    /**
     * set 任务Checkpoint Time
     *
     * @param checkpointTime
     */
    public TicdcChangefeedInfo checkpointTime(String checkpointTime) {
        this.checkpointTime = checkpointTime;
        return this;
    }


    /**
     * set error
     *
     * @param error
     */
    public TicdcChangefeedInfo error(TicdcError error) {
        this.error = error;
        return this;
    }


}