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
 * Page-Rules-for-a-Zone
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
 * 获取页面规则列表
 */
public class ListPageRulesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页面规则的状态
     */
    private String status;

    /**
     * 用于按顺序排列页面规则的字段
     */
    private String order;

    /**
     * asc - 升序；desc - 降序
     */
    private String direction;

    /**
     * 是否匹配所有搜索要求或至少一个（任何）
     */
    private String match;

    /**
     * zone_identifier
     * Required:true
     */
    @Required
    private String zone_identifier;



    /**
     * get 页面规则的状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 页面规则的状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 用于按顺序排列页面规则的字段
     *
     * @return
     */
    public String getOrder() {
        return order;
    }

    /**
     * set 用于按顺序排列页面规则的字段
     *
     * @param order
     */
    public void setOrder(String order) {
        this.order = order;
    }


    /**
     * get asc - 升序；desc - 降序
     *
     * @return
     */
    public String getDirection() {
        return direction;
    }

    /**
     * set asc - 升序；desc - 降序
     *
     * @param direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }


    /**
     * get 是否匹配所有搜索要求或至少一个（任何）
     *
     * @return
     */
    public String getMatch() {
        return match;
    }

    /**
     * set 是否匹配所有搜索要求或至少一个（任何）
     *
     * @param match
     */
    public void setMatch(String match) {
        this.match = match;
    }


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
     * set 页面规则的状态
     *
     * @param status
     */
    public ListPageRulesRequest status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 用于按顺序排列页面规则的字段
     *
     * @param order
     */
    public ListPageRulesRequest order(String order) {
        this.order = order;
        return this;
    }


    /**
     * set asc - 升序；desc - 降序
     *
     * @param direction
     */
    public ListPageRulesRequest direction(String direction) {
        this.direction = direction;
        return this;
    }


    /**
     * set 是否匹配所有搜索要求或至少一个（任何）
     *
     * @param match
     */
    public ListPageRulesRequest match(String match) {
        this.match = match;
        return this;
    }


    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public ListPageRulesRequest zone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
        return this;
    }


}