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
 * 统计查询类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询TOP IP，仅可查询中国境内的相关信息
 */
public class QueryStatisticsTopIpRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     */
    private String startTime;

    /**
     * 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     */
    private String endTime;

    /**
     * 需要查询的域名, 必须为用户pin下有权限的域名
     */
    private String domain;

    /**
     * 待查询的子域名,查询泛域名时，指定的子域名列表，多个用逗号分隔。非泛域名时，传入空即可
     */
    private String subDomain;

    /**
     * 查询的topN的条数，取值范围：1-100，默认为20
     */
    private Integer size;

    /**
     * 排序依据,当前可选：pv,flow, 分别表示按pv、按流量topN ip，默认为&quot;pv&quot;
     */
    private String topBy;


    /**
     * get 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 需要查询的域名, 必须为用户pin下有权限的域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 需要查询的域名, 必须为用户pin下有权限的域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get 待查询的子域名,查询泛域名时，指定的子域名列表，多个用逗号分隔。非泛域名时，传入空即可
     *
     * @return
     */
    public String getSubDomain() {
        return subDomain;
    }

    /**
     * set 待查询的子域名,查询泛域名时，指定的子域名列表，多个用逗号分隔。非泛域名时，传入空即可
     *
     * @param subDomain
     */
    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    /**
     * get 查询的topN的条数，取值范围：1-100，默认为20
     *
     * @return
     */
    public Integer getSize() {
        return size;
    }

    /**
     * set 查询的topN的条数，取值范围：1-100，默认为20
     *
     * @param size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * get 排序依据,当前可选：pv,flow, 分别表示按pv、按流量topN ip，默认为&quot;pv&quot;
     *
     * @return
     */
    public String getTopBy() {
        return topBy;
    }

    /**
     * set 排序依据,当前可选：pv,flow, 分别表示按pv、按流量topN ip，默认为&quot;pv&quot;
     *
     * @param topBy
     */
    public void setTopBy(String topBy) {
        this.topBy = topBy;
    }


    /**
     * set 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param startTime
     */
    public QueryStatisticsTopIpRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param endTime
     */
    public QueryStatisticsTopIpRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 需要查询的域名, 必须为用户pin下有权限的域名
     *
     * @param domain
     */
    public QueryStatisticsTopIpRequest domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 待查询的子域名,查询泛域名时，指定的子域名列表，多个用逗号分隔。非泛域名时，传入空即可
     *
     * @param subDomain
     */
    public QueryStatisticsTopIpRequest subDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }

    /**
     * set 查询的topN的条数，取值范围：1-100，默认为20
     *
     * @param size
     */
    public QueryStatisticsTopIpRequest size(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * set 排序依据,当前可选：pv,flow, 分别表示按pv、按流量topN ip，默认为&quot;pv&quot;
     *
     * @param topBy
     */
    public QueryStatisticsTopIpRequest topBy(String topBy) {
        this.topBy = topBy;
        return this;
    }


}