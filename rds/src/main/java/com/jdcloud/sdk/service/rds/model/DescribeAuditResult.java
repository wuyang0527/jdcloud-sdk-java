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
 * 审计管理
 * 审计管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看当前实例已开启的审计选项。如当前实例未开启审计，则返回空&lt;br&gt;- 仅支持SQL Server
 */
public class DescribeAuditResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前已开启的审计选项。如当前实例未开启审计，则返回空数组
     */
    
    private List<String> enabled;


    /**
    * get 当前已开启的审计选项。如当前实例未开启审计，则返回空数组
    *
    * @return
    */
    public List<String> getEnabled() {
        return enabled;
    }

    /**
    * set 当前已开启的审计选项。如当前实例未开启审计，则返回空数组
    *
    * @param enabled
    */
    public void setEnabled(List<String> enabled) {
        this.enabled = enabled;
    }



    /**
    * set 当前已开启的审计选项。如当前实例未开启审计，则返回空数组
    *
    * @param enabled
    */
    public DescribeAuditResult enabled(List<String> enabled) {
        this.enabled = enabled;
        return this;
    }



    /**
     * add item to 当前已开启的审计选项。如当前实例未开启审计，则返回空数组
     *
     * @param enabled
     */
    public void addEnabled(String enabled) {
        if (this.enabled == null) {
            this.enabled = new ArrayList<>();
        }
        this.enabled.add(enabled);
    }
}