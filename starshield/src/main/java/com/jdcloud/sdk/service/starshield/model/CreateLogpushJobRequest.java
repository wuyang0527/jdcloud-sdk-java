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
 * 为域创建新的日志推送作业
 */
public class CreateLogpushJobRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名
     */
    private String zone_name;

    /**
     * 唯一标识数据推送目的地的字符串。可能包括目的地支持的其他参数。
例如：splunk://splunk.cf-analytics.com:8088/services/collector/raw?channel&#x3D;xxx&amp;header_Authorization&#x3D;Splunk xxx&amp;sourcetype&#x3D;xxx&amp;insecure-skip-verify&#x3D;false

     */
    private String destination_conf;

    /**
     * 可选的用户可读的作业名称。不是独一无二的。使用户更容易识别工作。建议包含域名称。
     */
    private String name;

    /**
     * 默认值false
     */
    private Boolean enabled;

    /**
     * 要推送的数据集。合法值为：http/firewall。
     */
    private String dataset;

    /**
     * 它指定了诸如请求的字段和时间戳格式之类的内容。例如：fields&#x3D;fieldName1,fieldName2,fileNamek&amp;timestamps&#x3D;rfc3339&amp;sample&#x3D;0.1
     */
    private String logpull_options;

    /**
     * zone_identifier
     * Required:true
     */
    @Required
    private String zone_identifier;



    /**
     * get 域名
     *
     * @return
     */
    public String getZone_name() {
        return zone_name;
    }

    /**
     * set 域名
     *
     * @param zone_name
     */
    public void setZone_name(String zone_name) {
        this.zone_name = zone_name;
    }


    /**
     * get 唯一标识数据推送目的地的字符串。可能包括目的地支持的其他参数。
例如：splunk://splunk.cf-analytics.com:8088/services/collector/raw?channel&#x3D;xxx&amp;header_Authorization&#x3D;Splunk xxx&amp;sourcetype&#x3D;xxx&amp;insecure-skip-verify&#x3D;false

     *
     * @return
     */
    public String getDestination_conf() {
        return destination_conf;
    }

    /**
     * set 唯一标识数据推送目的地的字符串。可能包括目的地支持的其他参数。
例如：splunk://splunk.cf-analytics.com:8088/services/collector/raw?channel&#x3D;xxx&amp;header_Authorization&#x3D;Splunk xxx&amp;sourcetype&#x3D;xxx&amp;insecure-skip-verify&#x3D;false

     *
     * @param destination_conf
     */
    public void setDestination_conf(String destination_conf) {
        this.destination_conf = destination_conf;
    }


    /**
     * get 可选的用户可读的作业名称。不是独一无二的。使用户更容易识别工作。建议包含域名称。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 可选的用户可读的作业名称。不是独一无二的。使用户更容易识别工作。建议包含域名称。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 默认值false
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 默认值false
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * get 要推送的数据集。合法值为：http/firewall。
     *
     * @return
     */
    public String getDataset() {
        return dataset;
    }

    /**
     * set 要推送的数据集。合法值为：http/firewall。
     *
     * @param dataset
     */
    public void setDataset(String dataset) {
        this.dataset = dataset;
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
     * set 域名
     *
     * @param zone_name
     */
    public CreateLogpushJobRequest zone_name(String zone_name) {
        this.zone_name = zone_name;
        return this;
    }


    /**
     * set 唯一标识数据推送目的地的字符串。可能包括目的地支持的其他参数。
例如：splunk://splunk.cf-analytics.com:8088/services/collector/raw?channel&#x3D;xxx&amp;header_Authorization&#x3D;Splunk xxx&amp;sourcetype&#x3D;xxx&amp;insecure-skip-verify&#x3D;false

     *
     * @param destination_conf
     */
    public CreateLogpushJobRequest destination_conf(String destination_conf) {
        this.destination_conf = destination_conf;
        return this;
    }


    /**
     * set 可选的用户可读的作业名称。不是独一无二的。使用户更容易识别工作。建议包含域名称。
     *
     * @param name
     */
    public CreateLogpushJobRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 默认值false
     *
     * @param enabled
     */
    public CreateLogpushJobRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }


    /**
     * set 要推送的数据集。合法值为：http/firewall。
     *
     * @param dataset
     */
    public CreateLogpushJobRequest dataset(String dataset) {
        this.dataset = dataset;
        return this;
    }


    /**
     * set 它指定了诸如请求的字段和时间戳格式之类的内容。例如：fields&#x3D;fieldName1,fieldName2,fileNamek&amp;timestamps&#x3D;rfc3339&amp;sample&#x3D;0.1
     *
     * @param logpull_options
     */
    public CreateLogpushJobRequest logpull_options(String logpull_options) {
        this.logpull_options = logpull_options;
        return this;
    }


    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public CreateLogpushJobRequest zone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
        return this;
    }


}