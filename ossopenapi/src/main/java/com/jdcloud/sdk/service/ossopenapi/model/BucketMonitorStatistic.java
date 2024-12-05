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
 * dosage monitoring openapi
 * dosage monitoring openapi
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * bucketMonitorStatistic
 */
public class BucketMonitorStatistic  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * bucket name
     * Required:true
     */
    @Required
    private String bucketName;

    /**
     * 统计数值
     * Required:true
     */
    @Required
    private Long count;

    /**
     * 时间
     * Required:true
     */
    @Required
    private String time;



    /**
     * get bucket name
     *
     * @return
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * set bucket name
     *
     * @param bucketName
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }


    /**
     * get 统计数值
     *
     * @return
     */
    public Long getCount() {
        return count;
    }

    /**
     * set 统计数值
     *
     * @param count
     */
    public void setCount(Long count) {
        this.count = count;
    }


    /**
     * get 时间
     *
     * @return
     */
    public String getTime() {
        return time;
    }

    /**
     * set 时间
     *
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }



    /**
     * set bucket name
     *
     * @param bucketName
     */
    public BucketMonitorStatistic bucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }


    /**
     * set 统计数值
     *
     * @param count
     */
    public BucketMonitorStatistic count(Long count) {
        this.count = count;
        return this;
    }


    /**
     * set 时间
     *
     * @param time
     */
    public BucketMonitorStatistic time(String time) {
        this.time = time;
        return this;
    }


}