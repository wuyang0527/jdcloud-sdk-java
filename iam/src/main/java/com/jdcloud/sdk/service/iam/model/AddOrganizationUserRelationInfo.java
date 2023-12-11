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

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * addOrganizationUserRelationInfo
 */
public class AddOrganizationUserRelationInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子用户名
     * Required:true
     */
    @Required
    private String subUserName;

    /**
     * 组织用户标识，如：erp
     * Required:true
     */
    @Required
    private String userId;



    /**
     * get 子用户名
     *
     * @return
     */
    public String getSubUserName() {
        return subUserName;
    }

    /**
     * set 子用户名
     *
     * @param subUserName
     */
    public void setSubUserName(String subUserName) {
        this.subUserName = subUserName;
    }


    /**
     * get 组织用户标识，如：erp
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 组织用户标识，如：erp
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }



    /**
     * set 子用户名
     *
     * @param subUserName
     */
    public AddOrganizationUserRelationInfo subUserName(String subUserName) {
        this.subUserName = subUserName;
        return this;
    }


    /**
     * set 组织用户标识，如：erp
     *
     * @param userId
     */
    public AddOrganizationUserRelationInfo userId(String userId) {
        this.userId = userId;
        return this;
    }


}