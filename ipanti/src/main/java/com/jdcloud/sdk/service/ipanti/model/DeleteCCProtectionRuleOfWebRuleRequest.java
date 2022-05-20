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
 * Anti DDoS Pro Web Rule Configuration APIs
 * Anti DDoS Pro Web Rule Configuration APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除网站规则的 CC 防护规则
 */
public class DeleteCCProtectionRuleOfWebRuleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 高防实例 Id
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 网站规则 Id
     * Required:true
     */
    @Required
    private String webRuleId;

    /**
     * 网站类规则的 CC 防护规则 Id
     * Required:true
     */
    @Required
    private String ccProtectionRuleId;


    /**
     * get 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 高防实例 Id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 高防实例 Id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 网站规则 Id
     *
     * @return
     */
    public String getWebRuleId() {
        return webRuleId;
    }

    /**
     * set 网站规则 Id
     *
     * @param webRuleId
     */
    public void setWebRuleId(String webRuleId) {
        this.webRuleId = webRuleId;
    }

    /**
     * get 网站类规则的 CC 防护规则 Id
     *
     * @return
     */
    public String getCcProtectionRuleId() {
        return ccProtectionRuleId;
    }

    /**
     * set 网站类规则的 CC 防护规则 Id
     *
     * @param ccProtectionRuleId
     */
    public void setCcProtectionRuleId(String ccProtectionRuleId) {
        this.ccProtectionRuleId = ccProtectionRuleId;
    }


    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public DeleteCCProtectionRuleOfWebRuleRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 高防实例 Id
     *
     * @param instanceId
     */
    public DeleteCCProtectionRuleOfWebRuleRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 网站规则 Id
     *
     * @param webRuleId
     */
    public DeleteCCProtectionRuleOfWebRuleRequest webRuleId(String webRuleId) {
        this.webRuleId = webRuleId;
        return this;
    }

    /**
     * set 网站类规则的 CC 防护规则 Id
     *
     * @param ccProtectionRuleId
     */
    public DeleteCCProtectionRuleOfWebRuleRequest ccProtectionRuleId(String ccProtectionRuleId) {
        this.ccProtectionRuleId = ccProtectionRuleId;
        return this;
    }


}