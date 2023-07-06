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
 * Function
 * 函数 相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.fc.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 触发函数执行

可以添加header参数 &#x60;x-fc-invocation-type&#x60;指定调用方式。
- Async 异步调用
- Sync 同步调用（暂不支持）

异步调用函数时，请求会立即返回 requestId。 &lt;br&gt;

 */
public class InvokeFunctionRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 事件信息，以json格式表示，会在函数执行时作为参数传入，默认为{}
     */
    private String body;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Service Name
     * Required:true
     */
    @Required
    private String serviceName;

    /**
     * Function Name
     * Required:true
     */
    @Required
    private String functionName;



    /**
     * get 事件信息，以json格式表示，会在函数执行时作为参数传入，默认为{}
     *
     * @return
     */
    public String getBody() {
        return body;
    }

    /**
     * set 事件信息，以json格式表示，会在函数执行时作为参数传入，默认为{}
     *
     * @param body
     */
    public void setBody(String body) {
        this.body = body;
    }


    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get Service Name
     *
     * @return
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * set Service Name
     *
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * get Function Name
     *
     * @return
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * set Function Name
     *
     * @param functionName
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }



    /**
     * set 事件信息，以json格式表示，会在函数执行时作为参数传入，默认为{}
     *
     * @param body
     */
    public InvokeFunctionRequest body(String body) {
        this.body = body;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public InvokeFunctionRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set Service Name
     *
     * @param serviceName
     */
    public InvokeFunctionRequest serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }


    /**
     * set Function Name
     *
     * @param functionName
     */
    public InvokeFunctionRequest functionName(String functionName) {
        this.functionName = functionName;
        return this;
    }


}