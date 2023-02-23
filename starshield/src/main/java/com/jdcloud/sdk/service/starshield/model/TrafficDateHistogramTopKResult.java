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
 * Instance-Reporting
 * 实例级报表
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.starshield.model.DateHistogram;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * TopK域名的流量图。查询范围最近6个月、查询最大跨度1个月。
 */
public class TrafficDateHistogramTopKResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dateHistograms
     */
    
    private List<DateHistogram> dateHistograms;
    /**
     * timeScope
     */
    
    private List<Number> timeScope;
    /**
     * since
     */
    private String since;

    /**
     * util
     */
    private String util;



    /**
    * get dateHistograms
    *
    * @return
    */
    public List<DateHistogram> getDateHistograms() {
        return dateHistograms;
    }

    /**
    * set dateHistograms
    *
    * @param dateHistograms
    */
    public void setDateHistograms(List<DateHistogram> dateHistograms) {
        this.dateHistograms = dateHistograms;
    }


    /**
    * get timeScope
    *
    * @return
    */
    public List<Number> getTimeScope() {
        return timeScope;
    }

    /**
    * set timeScope
    *
    * @param timeScope
    */
    public void setTimeScope(List<Number> timeScope) {
        this.timeScope = timeScope;
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
     * get util
     *
     * @return
     */
    public String getUtil() {
        return util;
    }

    /**
     * set util
     *
     * @param util
     */
    public void setUtil(String util) {
        this.util = util;
    }



    /**
    * set dateHistograms
    *
    * @param dateHistograms
    */
    public TrafficDateHistogramTopKResult dateHistograms(List<DateHistogram> dateHistograms) {
        this.dateHistograms = dateHistograms;
        return this;
    }


    /**
    * set timeScope
    *
    * @param timeScope
    */
    public TrafficDateHistogramTopKResult timeScope(List<Number> timeScope) {
        this.timeScope = timeScope;
        return this;
    }


    /**
     * set since
     *
     * @param since
     */
    public TrafficDateHistogramTopKResult since(String since) {
        this.since = since;
        return this;
    }


    /**
     * set util
     *
     * @param util
     */
    public TrafficDateHistogramTopKResult util(String util) {
        this.util = util;
        return this;
    }



    /**
     * add item to dateHistograms
     *
     * @param dateHistogram
     */
    public void addDateHistogram(DateHistogram dateHistogram) {
        if (this.dateHistograms == null) {
            this.dateHistograms = new ArrayList<>();
        }
        this.dateHistograms.add(dateHistogram);
    }

    /**
     * add item to timeScope
     *
     * @param timeScope
     */
    public void addTimeScope(Number timeScope) {
        if (this.timeScope == null) {
            this.timeScope = new ArrayList<>();
        }
        this.timeScope.add(timeScope);
    }
}