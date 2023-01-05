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
 * Security-Group
 * 安全组相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.vpc.model.ModifySecurityGroupRules;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改安全组规则
 */
public class ModifyNetworkSecurityGroupRulesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 安全组规则信息
     * Required:true
     */
    @Required
    
    private List<ModifySecurityGroupRules> modifySecurityGroupRuleSpecs;
    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * NetworkSecurityGroup ID
     * Required:true
     */
    @Required
    private String networkSecurityGroupId;



    /**
    * get 安全组规则信息
    *
    * @return
    */
    public List<ModifySecurityGroupRules> getModifySecurityGroupRuleSpecs() {
        return modifySecurityGroupRuleSpecs;
    }

    /**
    * set 安全组规则信息
    *
    * @param modifySecurityGroupRuleSpecs
    */
    public void setModifySecurityGroupRuleSpecs(List<ModifySecurityGroupRules> modifySecurityGroupRuleSpecs) {
        this.modifySecurityGroupRuleSpecs = modifySecurityGroupRuleSpecs;
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
     * get NetworkSecurityGroup ID
     *
     * @return
     */
    public String getNetworkSecurityGroupId() {
        return networkSecurityGroupId;
    }

    /**
     * set NetworkSecurityGroup ID
     *
     * @param networkSecurityGroupId
     */
    public void setNetworkSecurityGroupId(String networkSecurityGroupId) {
        this.networkSecurityGroupId = networkSecurityGroupId;
    }



    /**
    * set 安全组规则信息
    *
    * @param modifySecurityGroupRuleSpecs
    */
    public ModifyNetworkSecurityGroupRulesRequest modifySecurityGroupRuleSpecs(List<ModifySecurityGroupRules> modifySecurityGroupRuleSpecs) {
        this.modifySecurityGroupRuleSpecs = modifySecurityGroupRuleSpecs;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyNetworkSecurityGroupRulesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set NetworkSecurityGroup ID
     *
     * @param networkSecurityGroupId
     */
    public ModifyNetworkSecurityGroupRulesRequest networkSecurityGroupId(String networkSecurityGroupId) {
        this.networkSecurityGroupId = networkSecurityGroupId;
        return this;
    }



    /**
     * add item to 安全组规则信息
     *
     * @param modifySecurityGroupRuleSpec
     */
    public void addModifySecurityGroupRuleSpec(ModifySecurityGroupRules modifySecurityGroupRuleSpec) {
        if (this.modifySecurityGroupRuleSpecs == null) {
            this.modifySecurityGroupRuleSpecs = new ArrayList<>();
        }
        this.modifySecurityGroupRuleSpecs.add(modifySecurityGroupRuleSpec);
    }
}