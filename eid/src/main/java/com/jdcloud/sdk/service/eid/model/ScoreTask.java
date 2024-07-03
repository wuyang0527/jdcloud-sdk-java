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

package com.jdcloud.sdk.service.eid.model;


/**
 * scoreTask
 */
public class ScoreTask  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据Id。需要保证在一次请求中所有的Id不重复
     */
    private String dataId;

    /**
     * 待检测数据，最长512个字符
     */
    private String content;

    /**
     * 数据类型，eid-设备
     */
    private String resourceType;



    /**
     * get 数据Id。需要保证在一次请求中所有的Id不重复
     *
     * @return
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * set 数据Id。需要保证在一次请求中所有的Id不重复
     *
     * @param dataId
     */
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }


    /**
     * get 待检测数据，最长512个字符
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set 待检测数据，最长512个字符
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * get 数据类型，eid-设备
     *
     * @return
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * set 数据类型，eid-设备
     *
     * @param resourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }



    /**
     * set 数据Id。需要保证在一次请求中所有的Id不重复
     *
     * @param dataId
     */
    public ScoreTask dataId(String dataId) {
        this.dataId = dataId;
        return this;
    }


    /**
     * set 待检测数据，最长512个字符
     *
     * @param content
     */
    public ScoreTask content(String content) {
        this.content = content;
        return this;
    }


    /**
     * set 数据类型，eid-设备
     *
     * @param resourceType
     */
    public ScoreTask resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }


}