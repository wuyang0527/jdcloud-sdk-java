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
 * Logpush-Jobs
 * Logpush jobs
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
 * 更新日志推送作业
 */
public class UpdateLogpushJobRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * enabled
     */
    private Boolean enabled;

    /**
     * 它指定了诸如请求的字段和时间戳格式之类的内容。例如：fields&#x3D;fieldName1,fieldName2,fileNamek&amp;timestamps&#x3D;rfc3339&amp;sample&#x3D;0.1
     */
    private String logpull_options;

    /**
     * 唯一标识数据推送目的地的字符串。可能包括目的地支持的其他参数。
     */
    private String destination_conf;

    /**
     * zone_identifier
     * Required:true
     */
    @Required
    private String zone_identifier;

    /**
     * job_identifier
     * Required:true
     */
    @Required
    private String job_identifier;



    /**
     * get enabled
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set enabled
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * get 它指定了诸如请求的字段和时间戳格式之类的内容。例如：fields&#x3D;fieldName1,fieldName2,fileNamek&amp;timestamps&#x3D;rfc3339&amp;sample&#x3D;0.1
     *
     * @return
     */
    public String getLogpull_options() {
        return logpull_options;
    }

    /**
     * set 它指定了诸如请求的字段和时间戳格式之类的内容。例如：fields&#x3D;fieldName1,fieldName2,fileNamek&amp;timestamps&#x3D;rfc3339&amp;sample&#x3D;0.1
     *
     * @param logpull_options
     */
    public void setLogpull_options(String logpull_options) {
        this.logpull_options = logpull_options;
    }


    /**
     * get 唯一标识数据推送目的地的字符串。可能包括目的地支持的其他参数。
     *
     * @return
     */
    public String getDestination_conf() {
        return destination_conf;
    }

    /**
     * set 唯一标识数据推送目的地的字符串。可能包括目的地支持的其他参数。
     *
     * @param destination_conf
     */
    public void setDestination_conf(String destination_conf) {
        this.destination_conf = destination_conf;
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
     * get job_identifier
     *
     * @return
     */
    public String getJob_identifier() {
        return job_identifier;
    }

    /**
     * set job_identifier
     *
     * @param job_identifier
     */
    public void setJob_identifier(String job_identifier) {
        this.job_identifier = job_identifier;
    }



    /**
     * set enabled
     *
     * @param enabled
     */
    public UpdateLogpushJobRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }


    /**
     * set 它指定了诸如请求的字段和时间戳格式之类的内容。例如：fields&#x3D;fieldName1,fieldName2,fileNamek&amp;timestamps&#x3D;rfc3339&amp;sample&#x3D;0.1
     *
     * @param logpull_options
     */
    public UpdateLogpushJobRequest logpull_options(String logpull_options) {
        this.logpull_options = logpull_options;
        return this;
    }


    /**
     * set 唯一标识数据推送目的地的字符串。可能包括目的地支持的其他参数。
     *
     * @param destination_conf
     */
    public UpdateLogpushJobRequest destination_conf(String destination_conf) {
        this.destination_conf = destination_conf;
        return this;
    }


    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public UpdateLogpushJobRequest zone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
        return this;
    }


    /**
     * set job_identifier
     *
     * @param job_identifier
     */
    public UpdateLogpushJobRequest job_identifier(String job_identifier) {
        this.job_identifier = job_identifier;
        return this;
    }


}