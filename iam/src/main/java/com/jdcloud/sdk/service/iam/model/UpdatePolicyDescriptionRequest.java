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
import com.jdcloud.sdk.service.iam.model.UpdatePolicyDescriptionInfo;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改策略描述
 */
public class UpdatePolicyDescriptionRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略描述信息
     * Required:true
     */
    @Required
    private UpdatePolicyDescriptionInfo updatePolicyDescriptionInfo;

    /**
     * 策略名称
     * Required:true
     */
    @Required
    private String policyName;



    /**
     * get 策略描述信息
     *
     * @return
     */
    public UpdatePolicyDescriptionInfo getUpdatePolicyDescriptionInfo() {
        return updatePolicyDescriptionInfo;
    }

    /**
     * set 策略描述信息
     *
     * @param updatePolicyDescriptionInfo
     */
    public void setUpdatePolicyDescriptionInfo(UpdatePolicyDescriptionInfo updatePolicyDescriptionInfo) {
        this.updatePolicyDescriptionInfo = updatePolicyDescriptionInfo;
    }


    /**
     * get 策略名称
     *
     * @return
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * set 策略名称
     *
     * @param policyName
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }



    /**
     * set 策略描述信息
     *
     * @param updatePolicyDescriptionInfo
     */
    public UpdatePolicyDescriptionRequest updatePolicyDescriptionInfo(UpdatePolicyDescriptionInfo updatePolicyDescriptionInfo) {
        this.updatePolicyDescriptionInfo = updatePolicyDescriptionInfo;
        return this;
    }


    /**
     * set 策略名称
     *
     * @param policyName
     */
    public UpdatePolicyDescriptionRequest policyName(String policyName) {
        this.policyName = policyName;
        return this;
    }


}