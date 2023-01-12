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

package com.jdcloud.sdk.service.starshield.model;


/**
 * owner
 */
public class Owner  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * user_owner
     */
    private User_owner user_owner;

    /**
     * organization_owner
     */
    private Organization_owner organization_owner;



    /**
     * get user_owner
     *
     * @return
     */
    public User_owner getUser_owner() {
        return user_owner;
    }

    /**
     * set user_owner
     *
     * @param user_owner
     */
    public void setUser_owner(User_owner user_owner) {
        this.user_owner = user_owner;
    }


    /**
     * get organization_owner
     *
     * @return
     */
    public Organization_owner getOrganization_owner() {
        return organization_owner;
    }

    /**
     * set organization_owner
     *
     * @param organization_owner
     */
    public void setOrganization_owner(Organization_owner organization_owner) {
        this.organization_owner = organization_owner;
    }



    /**
     * set user_owner
     *
     * @param user_owner
     */
    public Owner user_owner(User_owner user_owner) {
        this.user_owner = user_owner;
        return this;
    }


    /**
     * set organization_owner
     *
     * @param organization_owner
     */
    public Owner organization_owner(Organization_owner organization_owner) {
        this.organization_owner = organization_owner;
        return this;
    }


}