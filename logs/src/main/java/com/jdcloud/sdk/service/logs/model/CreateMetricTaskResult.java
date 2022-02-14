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
 * Metric APIs
 * 日志服务日志监控任务相关的管理控制接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建监控任务，不可与当前日志主题下现有日志监控任务重名。
 */
public class CreateMetricTaskResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * UID
     */
    private String id;

    /**
     * suc
     */
    private String suc;


    /**
     * get UID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set UID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get suc
     *
     * @return
     */
    public String getSuc() {
        return suc;
    }

    /**
     * set suc
     *
     * @param suc
     */
    public void setSuc(String suc) {
        this.suc = suc;
    }


    /**
     * set UID
     *
     * @param id
     */
    public CreateMetricTaskResult id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set suc
     *
     * @param suc
     */
    public CreateMetricTaskResult suc(String suc) {
        this.suc = suc;
        return this;
    }


}