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
 * Back Management
 * Back Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * createSensitiveActionRequest
 */
public class CreateSensitiveActionRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * serviceName
     */
    private String serviceName;

    /**
     * action
     */
    private String action;

    /**
     * description
     */
    private String description;



    /**
     * get serviceName
     *
     * @return
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * set serviceName
     *
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * get action
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set action
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }


    /**
     * get description
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set description
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }



    /**
     * set serviceName
     *
     * @param serviceName
     */
    public CreateSensitiveActionRequest serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }


    /**
     * set action
     *
     * @param action
     */
    public CreateSensitiveActionRequest action(String action) {
        this.action = action;
        return this;
    }


    /**
     * set description
     *
     * @param description
     */
    public CreateSensitiveActionRequest description(String description) {
        this.description = description;
        return this;
    }


}