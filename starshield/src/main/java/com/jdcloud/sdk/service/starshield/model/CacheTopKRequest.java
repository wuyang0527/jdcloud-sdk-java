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
 * Log-Analytics
 * Analytics data for a zone/instance
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 按请求次数统计。获取内容类型、路径、主机、设备类型、国家/地区、状态代码的TopK.
 */
public class CacheTopKRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * zoneName
     */
    private String zoneName;

    /**
     * since
     */
    private String since;

    /**
     * until
     */
    private String until;

    /**
     * topK
     */
    private Integer topK;

    /**
     * filters
     */
    
    private List<AnalyticsReportingFilter> filters;
    /**
     * zone_identifier
     * Required:true
     */
    @Required
    private String zone_identifier;



    /**
     * get zoneName
     *
     * @return
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * set zoneName
     *
     * @param zoneName
     */
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }


    /**
     * get since
     *
     * @return
     */
    public String getSince() {
        return since;
    }

    /**
     * set since
     *
     * @param since
     */
    public void setSince(String since) {
        this.since = since;
    }


    /**
     * get until
     *
     * @return
     */
    public String getUntil() {
        return until;
    }

    /**
     * set until
     *
     * @param until
     */
    public void setUntil(String until) {
        this.until = until;
    }


    /**
     * get topK
     *
     * @return
     */
    public Integer getTopK() {
        return topK;
    }

    /**
     * set topK
     *
     * @param topK
     */
    public void setTopK(Integer topK) {
        this.topK = topK;
    }


    /**
    * get filters
    *
    * @return
    */
    public List<AnalyticsReportingFilter> getFilters() {
        return filters;
    }

    /**
    * set filters
    *
    * @param filters
    */
    public void setFilters(List<AnalyticsReportingFilter> filters) {
        this.filters = filters;
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
     * set zoneName
     *
     * @param zoneName
     */
    public CacheTopKRequest zoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }


    /**
     * set since
     *
     * @param since
     */
    public CacheTopKRequest since(String since) {
        this.since = since;
        return this;
    }


    /**
     * set until
     *
     * @param until
     */
    public CacheTopKRequest until(String until) {
        this.until = until;
        return this;
    }


    /**
     * set topK
     *
     * @param topK
     */
    public CacheTopKRequest topK(Integer topK) {
        this.topK = topK;
        return this;
    }


    /**
    * set filters
    *
    * @param filters
    */
    public CacheTopKRequest filters(List<AnalyticsReportingFilter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public CacheTopKRequest zone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
        return this;
    }



    /**
     * add item to filters
     *
     * @param filter
     */
    public void addFilter(AnalyticsReportingFilter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }
}