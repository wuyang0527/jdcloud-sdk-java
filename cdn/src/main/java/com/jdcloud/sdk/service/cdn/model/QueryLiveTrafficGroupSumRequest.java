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
 * 查询统计数据并进行汇总加和
 */
public class QueryLiveTrafficGroupSumRequest extends JdcloudRequest implements java.io.Serializable {

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
     * 查询泛域名时，指定的子域名列表，多个用逗号分隔。非泛域名时，传入空即可
     */
    private String subDomain;

    /**
     * 查询的App名称，多个用逗号分隔。
     */
    private String appName;

    /**
     * 查询的流名称，多个用逗号分隔。
     */
    private String streamName;

    /**
     * 需要查询的字段
     */
    private String fields;

    /**
     * 查询的区域，如beijing,shanghai。多个用逗号分隔
     */
    private String area;

    /**
     * 查询的运营商，cmcc,cnc,ct，表示移动、联通、电信。多个用逗号分隔
     */
    private String isp;

    /**
     * 查询的流协议，取值范围：&quot;rtmp,hdl,hls&quot;，多个用逗号分隔，默认为空，表示查询所有协议。
     */
    private String scheme;

    /**
     * 时间粒度，可选值:[oneMin,fiveMin,followTime],followTime只会返回一个汇总后的数据
     */
    private String period;

    /**
     * 分组依据，可选值：[appname,streamname,domain,area,isp,scheme]
     */
    private String groupBy;

    /**
     * 当前取值范围(&quot;GET,HEAD,forward,forward-hls,ingest,play,publish,detour-ingest,Forward-Origin&quot;)
     */
    private String reqMethod;

    /**
     * cacheLevel，可选值：[L1,L2,L3]
     */
    private String cacheLevel;

    /**
     * 查询节点层级，可选值:[all,edge,mid],默认查询all,edge边缘 mid中间
     */
    private String cacheType;



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
     * get 查询泛域名时，指定的子域名列表，多个用逗号分隔。非泛域名时，传入空即可
     *
     * @return
     */
    public String getSubDomain() {
        return subDomain;
    }

    /**
     * set 查询泛域名时，指定的子域名列表，多个用逗号分隔。非泛域名时，传入空即可
     *
     * @param subDomain
     */
    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }


    /**
     * get 查询的App名称，多个用逗号分隔。
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 查询的App名称，多个用逗号分隔。
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }


    /**
     * get 查询的流名称，多个用逗号分隔。
     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 查询的流名称，多个用逗号分隔。
     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }


    /**
     * get 需要查询的字段
     *
     * @return
     */
    public String getFields() {
        return fields;
    }

    /**
     * set 需要查询的字段
     *
     * @param fields
     */
    public void setFields(String fields) {
        this.fields = fields;
    }


    /**
     * get 查询的区域，如beijing,shanghai。多个用逗号分隔
     *
     * @return
     */
    public String getArea() {
        return area;
    }

    /**
     * set 查询的区域，如beijing,shanghai。多个用逗号分隔
     *
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }


    /**
     * get 查询的运营商，cmcc,cnc,ct，表示移动、联通、电信。多个用逗号分隔
     *
     * @return
     */
    public String getIsp() {
        return isp;
    }

    /**
     * set 查询的运营商，cmcc,cnc,ct，表示移动、联通、电信。多个用逗号分隔
     *
     * @param isp
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }


    /**
     * get 查询的流协议，取值范围：&quot;rtmp,hdl,hls&quot;，多个用逗号分隔，默认为空，表示查询所有协议。
     *
     * @return
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * set 查询的流协议，取值范围：&quot;rtmp,hdl,hls&quot;，多个用逗号分隔，默认为空，表示查询所有协议。
     *
     * @param scheme
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }


    /**
     * get 时间粒度，可选值:[oneMin,fiveMin,followTime],followTime只会返回一个汇总后的数据
     *
     * @return
     */
    public String getPeriod() {
        return period;
    }

    /**
     * set 时间粒度，可选值:[oneMin,fiveMin,followTime],followTime只会返回一个汇总后的数据
     *
     * @param period
     */
    public void setPeriod(String period) {
        this.period = period;
    }


    /**
     * get 分组依据，可选值：[appname,streamname,domain,area,isp,scheme]
     *
     * @return
     */
    public String getGroupBy() {
        return groupBy;
    }

    /**
     * set 分组依据，可选值：[appname,streamname,domain,area,isp,scheme]
     *
     * @param groupBy
     */
    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }


    /**
     * get 当前取值范围(&quot;GET,HEAD,forward,forward-hls,ingest,play,publish,detour-ingest,Forward-Origin&quot;)
     *
     * @return
     */
    public String getReqMethod() {
        return reqMethod;
    }

    /**
     * set 当前取值范围(&quot;GET,HEAD,forward,forward-hls,ingest,play,publish,detour-ingest,Forward-Origin&quot;)
     *
     * @param reqMethod
     */
    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
    }


    /**
     * get cacheLevel，可选值：[L1,L2,L3]
     *
     * @return
     */
    public String getCacheLevel() {
        return cacheLevel;
    }

    /**
     * set cacheLevel，可选值：[L1,L2,L3]
     *
     * @param cacheLevel
     */
    public void setCacheLevel(String cacheLevel) {
        this.cacheLevel = cacheLevel;
    }


    /**
     * get 查询节点层级，可选值:[all,edge,mid],默认查询all,edge边缘 mid中间
     *
     * @return
     */
    public String getCacheType() {
        return cacheType;
    }

    /**
     * set 查询节点层级，可选值:[all,edge,mid],默认查询all,edge边缘 mid中间
     *
     * @param cacheType
     */
    public void setCacheType(String cacheType) {
        this.cacheType = cacheType;
    }



    /**
     * set 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param startTime
     */
    public QueryLiveTrafficGroupSumRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param endTime
     */
    public QueryLiveTrafficGroupSumRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 需要查询的域名, 必须为用户pin下有权限的域名
     *
     * @param domain
     */
    public QueryLiveTrafficGroupSumRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 查询泛域名时，指定的子域名列表，多个用逗号分隔。非泛域名时，传入空即可
     *
     * @param subDomain
     */
    public QueryLiveTrafficGroupSumRequest subDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }


    /**
     * set 查询的App名称，多个用逗号分隔。
     *
     * @param appName
     */
    public QueryLiveTrafficGroupSumRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


    /**
     * set 查询的流名称，多个用逗号分隔。
     *
     * @param streamName
     */
    public QueryLiveTrafficGroupSumRequest streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }


    /**
     * set 需要查询的字段
     *
     * @param fields
     */
    public QueryLiveTrafficGroupSumRequest fields(String fields) {
        this.fields = fields;
        return this;
    }


    /**
     * set 查询的区域，如beijing,shanghai。多个用逗号分隔
     *
     * @param area
     */
    public QueryLiveTrafficGroupSumRequest area(String area) {
        this.area = area;
        return this;
    }


    /**
     * set 查询的运营商，cmcc,cnc,ct，表示移动、联通、电信。多个用逗号分隔
     *
     * @param isp
     */
    public QueryLiveTrafficGroupSumRequest isp(String isp) {
        this.isp = isp;
        return this;
    }


    /**
     * set 查询的流协议，取值范围：&quot;rtmp,hdl,hls&quot;，多个用逗号分隔，默认为空，表示查询所有协议。
     *
     * @param scheme
     */
    public QueryLiveTrafficGroupSumRequest scheme(String scheme) {
        this.scheme = scheme;
        return this;
    }


    /**
     * set 时间粒度，可选值:[oneMin,fiveMin,followTime],followTime只会返回一个汇总后的数据
     *
     * @param period
     */
    public QueryLiveTrafficGroupSumRequest period(String period) {
        this.period = period;
        return this;
    }


    /**
     * set 分组依据，可选值：[appname,streamname,domain,area,isp,scheme]
     *
     * @param groupBy
     */
    public QueryLiveTrafficGroupSumRequest groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }


    /**
     * set 当前取值范围(&quot;GET,HEAD,forward,forward-hls,ingest,play,publish,detour-ingest,Forward-Origin&quot;)
     *
     * @param reqMethod
     */
    public QueryLiveTrafficGroupSumRequest reqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
        return this;
    }


    /**
     * set cacheLevel，可选值：[L1,L2,L3]
     *
     * @param cacheLevel
     */
    public QueryLiveTrafficGroupSumRequest cacheLevel(String cacheLevel) {
        this.cacheLevel = cacheLevel;
        return this;
    }


    /**
     * set 查询节点层级，可选值:[all,edge,mid],默认查询all,edge边缘 mid中间
     *
     * @param cacheType
     */
    public QueryLiveTrafficGroupSumRequest cacheType(String cacheType) {
        this.cacheType = cacheType;
        return this;
    }


}