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

import com.jdcloud.sdk.service.starshield.model.TopkAnalytics;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 按响应带宽统计。获取内容类型、路径、主机、设备类型、国家/地区、状态代码的TopK.
 */
public class CacheBandwidthTopKResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * topkAnalytics
     */
    private TopkAnalytics topkAnalytics;



    /**
     * get topkAnalytics
     *
     * @return
     */
    public TopkAnalytics getTopkAnalytics() {
        return topkAnalytics;
    }

    /**
     * set topkAnalytics
     *
     * @param topkAnalytics
     */
    public void setTopkAnalytics(TopkAnalytics topkAnalytics) {
        this.topkAnalytics = topkAnalytics;
    }



    /**
     * set topkAnalytics
     *
     * @param topkAnalytics
     */
    public CacheBandwidthTopKResult topkAnalytics(TopkAnalytics topkAnalytics) {
        this.topkAnalytics = topkAnalytics;
        return this;
    }


}