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
 * Policy Management
 * Policy Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.iam.model.CreatePolicyInfo;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建策略, &lt;br&gt;
访问 &lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/iam/policy-overview&quot;&gt;策略管理&lt;/a&gt; 了解更多内容 &lt;br&gt;

 */
public class CreatePolicyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略信息
     * Required:true
     */
    @Required
    private CreatePolicyInfo createPolicyInfo;



    /**
     * get 策略信息
     *
     * @return
     */
    public CreatePolicyInfo getCreatePolicyInfo() {
        return createPolicyInfo;
    }

    /**
     * set 策略信息
     *
     * @param createPolicyInfo
     */
    public void setCreatePolicyInfo(CreatePolicyInfo createPolicyInfo) {
        this.createPolicyInfo = createPolicyInfo;
    }



    /**
     * set 策略信息
     *
     * @param createPolicyInfo
     */
    public CreatePolicyRequest createPolicyInfo(CreatePolicyInfo createPolicyInfo) {
        this.createPolicyInfo = createPolicyInfo;
        return this;
    }


}