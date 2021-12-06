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
 * Page Rules for a Zone
 * A rule describing target patterns for requests and actions to perform on matching requests
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除页面规则
 */
public class DeletePageRuleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * zone_identifier
     * Required:true
     */
    @Required
    private String zone_identifier;

    /**
     * identifier
     * Required:true
     */
    @Required
    private String identifier;


    /**
     * get zone_identifier
     *
     * @return
     */
    public String getZone_identifier() {
        return zone_identifier;
    }

    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public void setZone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
    }

    /**
     * get identifier
     *
     * @return
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * set identifier
     *
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }


    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public DeletePageRuleRequest zone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
        return this;
    }

    /**
     * set identifier
     *
     * @param identifier
     */
    public DeletePageRuleRequest identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }


}