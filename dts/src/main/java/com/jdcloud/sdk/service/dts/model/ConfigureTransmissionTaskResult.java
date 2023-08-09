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
 * 数据传输服务
 * 数据传输服务相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dts.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 配置数据传输任务
 */
public class ConfigureTransmissionTaskResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务ID
     */
    private String id;



    /**
     * get 任务ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 任务ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }



    /**
     * set 任务ID
     *
     * @param id
     */
    public ConfigureTransmissionTaskResult id(String id) {
        this.id = id;
        return this;
    }


}