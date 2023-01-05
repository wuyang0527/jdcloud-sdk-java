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
 * 路由表
 * 路由表相关接口
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
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 移除路由表规则
 */
public class RemoveRouteTableRulesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 路由表规则Id列表
     * Required:true
     */
    @Required
    
    private List<String> ruleIds;
    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RouteTable ID
     * Required:true
     */
    @Required
    private String routeTableId;



    /**
    * get 路由表规则Id列表
    *
    * @return
    */
    public List<String> getRuleIds() {
        return ruleIds;
    }

    /**
    * set 路由表规则Id列表
    *
    * @param ruleIds
    */
    public void setRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
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
     * get RouteTable ID
     *
     * @return
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * set RouteTable ID
     *
     * @param routeTableId
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }



    /**
    * set 路由表规则Id列表
    *
    * @param ruleIds
    */
    public RemoveRouteTableRulesRequest ruleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public RemoveRouteTableRulesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set RouteTable ID
     *
     * @param routeTableId
     */
    public RemoveRouteTableRulesRequest routeTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }



    /**
     * add item to 路由表规则Id列表
     *
     * @param ruleId
     */
    public void addRuleId(String ruleId) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        this.ruleIds.add(ruleId);
    }
}