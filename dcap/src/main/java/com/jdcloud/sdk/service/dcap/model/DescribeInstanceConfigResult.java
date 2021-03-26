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
 * Instance
 * 敏感数据保护-实例相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dcap.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 插件获取配置文件
 */
public class DescribeInstanceConfigResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 配置文件
     */
    private String configuration;


    /**
     * get 配置文件
     *
     * @return
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * set 配置文件
     *
     * @param configuration
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }


    /**
     * set 配置文件
     *
     * @param configuration
     */
    public DescribeInstanceConfigResult configuration(String configuration) {
        this.configuration = configuration;
        return this;
    }


}