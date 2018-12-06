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
 * CustomMetric APIs
 * 自定义监控相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 删除自定义监控命名空间
 */
public class DeleteNamespaceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否成功
     */
    private Boolean result;


    /**
     * get 是否成功
     *
     * @return
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * set 是否成功
     *
     * @param result
     */
    public void setResult(Boolean result) {
        this.result = result;
    }


    /**
     * set 是否成功
     *
     * @param result
     */
    public DeleteNamespaceResult result(Boolean result) {
        this.result = result;
        return this;
    }


}