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
 * dosage bucket capacity openapi
 * dosage bucket capacity openapi
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据type获取指定bucket用量数据
 */
public class GetSingleBucketCapacityRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * &lt;p&gt;查询用量数据类型：&lt;/p&gt;&lt;br&gt;&lt;code&gt;1000040&lt;/code&gt;:标准存储&lt;br&gt;&lt;code&gt;1000041&lt;/code&gt;:低冗余存储&lt;br&gt;&lt;code&gt;1000042&lt;/code&gt;:归档存储&lt;br&gt;&lt;code&gt;1000043&lt;/code&gt;归档overHead存储:&lt;br&gt;&lt;code&gt;1000044&lt;/code&gt;低频存储:&lt;br&gt;&lt;code&gt;1000045&lt;/code&gt;低频overHead存储:&lt;br&gt;&lt;code&gt;1&lt;/code&gt;:内网GET流量&lt;br&gt;&lt;code&gt;2&lt;/code&gt;:内网HEAD流量&lt;br&gt;&lt;code&gt;3&lt;/code&gt;:内网PUT流量&lt;br&gt;&lt;code&gt;4&lt;/code&gt;:内网POST流量&lt;br&gt;&lt;code&gt;5&lt;/code&gt;:内网DELETE流量&lt;br&gt;&lt;code&gt;6&lt;/code&gt;:内网OPTIONS流量&lt;br&gt;&lt;code&gt;7&lt;/code&gt;:内网TRACE流量&lt;br&gt;&lt;code&gt;11&lt;/code&gt;:外网GET流量&lt;br&gt;&lt;code&gt;12&lt;/code&gt;:外网HEAD流量&lt;br&gt;&lt;code&gt;13&lt;/code&gt;:外网PUT流量&lt;br&gt;&lt;code&gt;14&lt;/code&gt;:外网POST流量&lt;br&gt;&lt;code&gt;15&lt;/code&gt;:外网DELETE流量&lt;br&gt;&lt;code&gt;16&lt;/code&gt;:外网OPTIONS流量&lt;br&gt;&lt;code&gt;17&lt;/code&gt;:外网TRACE流量&lt;br&gt;&lt;code&gt;21&lt;/code&gt;:CDN GET流量&lt;br&gt;&lt;code&gt;22&lt;/code&gt;:CDN HEAD流量&lt;br&gt;&lt;code&gt;23&lt;/code&gt;:CDN PUT流量&lt;br&gt;&lt;code&gt;24&lt;/code&gt;:CDN POST流量&lt;br&gt;&lt;code&gt;25&lt;/code&gt;:CDN DELETE流量&lt;br&gt;&lt;code&gt;26&lt;/code&gt;:CDN OPTIONS流量&lt;br&gt;&lt;code&gt;27&lt;/code&gt;:CDN TRACE流量&lt;br&gt;&lt;code&gt;31&lt;/code&gt;:内网GET数&lt;br&gt;&lt;code&gt;32&lt;/code&gt;:内网HEAD数&lt;br&gt;&lt;code&gt;33&lt;/code&gt;:内网PUT数&lt;br&gt;&lt;code&gt;34&lt;/code&gt;:内网POST数&lt;br&gt;&lt;code&gt;35&lt;/code&gt;:内网DELETE数&lt;br&gt;&lt;code&gt;36&lt;/code&gt;:内网OPTIONS数&lt;br&gt;&lt;code&gt;37&lt;/code&gt;:内网TRACE数&lt;br&gt;&lt;code&gt;51&lt;/code&gt;:外网GET数&lt;br&gt;&lt;code&gt;52&lt;/code&gt;:外网HEAD数&lt;br&gt;&lt;code&gt;53&lt;/code&gt;:外网PUT数&lt;br&gt;&lt;code&gt;54&lt;/code&gt;:外网POST数&lt;br&gt;&lt;code&gt;55&lt;/code&gt;:外网DELETE数&lt;br&gt;&lt;code&gt;56&lt;/code&gt;:外网OPTIONS数&lt;br&gt;&lt;code&gt;57&lt;/code&gt;:外网TRACE数&lt;br&gt;&lt;code&gt;61&lt;/code&gt;:CDN GET数&lt;br&gt;&lt;code&gt;62&lt;/code&gt;:CDN HEAD数&lt;br&gt;&lt;code&gt;63&lt;/code&gt;:CDN PUT数&lt;br&gt;&lt;code&gt;64&lt;/code&gt;:CDN POST数&lt;br&gt;&lt;code&gt;65&lt;/code&gt;:CDN DELETE数&lt;br&gt;&lt;code&gt;66&lt;/code&gt;:CDN OPTIONS数&lt;br&gt;&lt;code&gt;67&lt;/code&gt;:CDN TRACE数&lt;br&gt;&lt;code&gt;71&lt;/code&gt;:归档提前删除&lt;br&gt;&lt;code&gt;72&lt;/code&gt;:低频提前删除&lt;br&gt;&lt;code&gt;81&lt;/code&gt;:归档取回Bulk&lt;br&gt;&lt;code&gt;82&lt;/code&gt;:归档取回Std&lt;br&gt;&lt;code&gt;83&lt;/code&gt;:归档取回Exp&lt;br&gt;&lt;code&gt;84&lt;/code&gt;:低频数据取回

     * Required:true
     */
    @Required
    
    private List<Integer> capacityTypes;
    /**
     * 开始时间，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ss&#39;Z&#39;
     */
    private String beginTime;

    /**
     * 结束时间，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ss&#39;Z&#39;
     */
    private String endTime;

    /**
     * 查询数据的聚合方式:&lt;br&gt;&lt;code&gt;0&lt;/code&gt;:all, 最大查询区间365天 &lt;br&gt;&lt;code&gt;1&lt;/code&gt;:hour，最大查询区间31天。默认1&lt;br&gt;&lt;code&gt;2&lt;/code&gt;:day, 最大查询区间365天。
     */
    private Integer periodType;

    /**
     * 返回数据的方式： &lt;code&gt;1&lt;/code&gt;:recent(区间值), &lt;code&gt;2&lt;/code&gt;:current(当前值。method &#x3D; 2 时如果查询当前值时传入beginTime，则按照beginTime时间来进行查询；如果不传beginTime，则按照后端系统时间查询。)
     * Required:true
     */
    @Required
    private Integer method;

    /**
     * 区域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 查询用量的指定bucket
     * Required:true
     */
    @Required
    private String bucketName;



    /**
    * get &lt;p&gt;查询用量数据类型：&lt;/p&gt;&lt;br&gt;&lt;code&gt;1000040&lt;/code&gt;:标准存储&lt;br&gt;&lt;code&gt;1000041&lt;/code&gt;:低冗余存储&lt;br&gt;&lt;code&gt;1000042&lt;/code&gt;:归档存储&lt;br&gt;&lt;code&gt;1000043&lt;/code&gt;归档overHead存储:&lt;br&gt;&lt;code&gt;1000044&lt;/code&gt;低频存储:&lt;br&gt;&lt;code&gt;1000045&lt;/code&gt;低频overHead存储:&lt;br&gt;&lt;code&gt;1&lt;/code&gt;:内网GET流量&lt;br&gt;&lt;code&gt;2&lt;/code&gt;:内网HEAD流量&lt;br&gt;&lt;code&gt;3&lt;/code&gt;:内网PUT流量&lt;br&gt;&lt;code&gt;4&lt;/code&gt;:内网POST流量&lt;br&gt;&lt;code&gt;5&lt;/code&gt;:内网DELETE流量&lt;br&gt;&lt;code&gt;6&lt;/code&gt;:内网OPTIONS流量&lt;br&gt;&lt;code&gt;7&lt;/code&gt;:内网TRACE流量&lt;br&gt;&lt;code&gt;11&lt;/code&gt;:外网GET流量&lt;br&gt;&lt;code&gt;12&lt;/code&gt;:外网HEAD流量&lt;br&gt;&lt;code&gt;13&lt;/code&gt;:外网PUT流量&lt;br&gt;&lt;code&gt;14&lt;/code&gt;:外网POST流量&lt;br&gt;&lt;code&gt;15&lt;/code&gt;:外网DELETE流量&lt;br&gt;&lt;code&gt;16&lt;/code&gt;:外网OPTIONS流量&lt;br&gt;&lt;code&gt;17&lt;/code&gt;:外网TRACE流量&lt;br&gt;&lt;code&gt;21&lt;/code&gt;:CDN GET流量&lt;br&gt;&lt;code&gt;22&lt;/code&gt;:CDN HEAD流量&lt;br&gt;&lt;code&gt;23&lt;/code&gt;:CDN PUT流量&lt;br&gt;&lt;code&gt;24&lt;/code&gt;:CDN POST流量&lt;br&gt;&lt;code&gt;25&lt;/code&gt;:CDN DELETE流量&lt;br&gt;&lt;code&gt;26&lt;/code&gt;:CDN OPTIONS流量&lt;br&gt;&lt;code&gt;27&lt;/code&gt;:CDN TRACE流量&lt;br&gt;&lt;code&gt;31&lt;/code&gt;:内网GET数&lt;br&gt;&lt;code&gt;32&lt;/code&gt;:内网HEAD数&lt;br&gt;&lt;code&gt;33&lt;/code&gt;:内网PUT数&lt;br&gt;&lt;code&gt;34&lt;/code&gt;:内网POST数&lt;br&gt;&lt;code&gt;35&lt;/code&gt;:内网DELETE数&lt;br&gt;&lt;code&gt;36&lt;/code&gt;:内网OPTIONS数&lt;br&gt;&lt;code&gt;37&lt;/code&gt;:内网TRACE数&lt;br&gt;&lt;code&gt;51&lt;/code&gt;:外网GET数&lt;br&gt;&lt;code&gt;52&lt;/code&gt;:外网HEAD数&lt;br&gt;&lt;code&gt;53&lt;/code&gt;:外网PUT数&lt;br&gt;&lt;code&gt;54&lt;/code&gt;:外网POST数&lt;br&gt;&lt;code&gt;55&lt;/code&gt;:外网DELETE数&lt;br&gt;&lt;code&gt;56&lt;/code&gt;:外网OPTIONS数&lt;br&gt;&lt;code&gt;57&lt;/code&gt;:外网TRACE数&lt;br&gt;&lt;code&gt;61&lt;/code&gt;:CDN GET数&lt;br&gt;&lt;code&gt;62&lt;/code&gt;:CDN HEAD数&lt;br&gt;&lt;code&gt;63&lt;/code&gt;:CDN PUT数&lt;br&gt;&lt;code&gt;64&lt;/code&gt;:CDN POST数&lt;br&gt;&lt;code&gt;65&lt;/code&gt;:CDN DELETE数&lt;br&gt;&lt;code&gt;66&lt;/code&gt;:CDN OPTIONS数&lt;br&gt;&lt;code&gt;67&lt;/code&gt;:CDN TRACE数&lt;br&gt;&lt;code&gt;71&lt;/code&gt;:归档提前删除&lt;br&gt;&lt;code&gt;72&lt;/code&gt;:低频提前删除&lt;br&gt;&lt;code&gt;81&lt;/code&gt;:归档取回Bulk&lt;br&gt;&lt;code&gt;82&lt;/code&gt;:归档取回Std&lt;br&gt;&lt;code&gt;83&lt;/code&gt;:归档取回Exp&lt;br&gt;&lt;code&gt;84&lt;/code&gt;:低频数据取回

    *
    * @return
    */
    public List<Integer> getCapacityTypes() {
        return capacityTypes;
    }

    /**
    * set &lt;p&gt;查询用量数据类型：&lt;/p&gt;&lt;br&gt;&lt;code&gt;1000040&lt;/code&gt;:标准存储&lt;br&gt;&lt;code&gt;1000041&lt;/code&gt;:低冗余存储&lt;br&gt;&lt;code&gt;1000042&lt;/code&gt;:归档存储&lt;br&gt;&lt;code&gt;1000043&lt;/code&gt;归档overHead存储:&lt;br&gt;&lt;code&gt;1000044&lt;/code&gt;低频存储:&lt;br&gt;&lt;code&gt;1000045&lt;/code&gt;低频overHead存储:&lt;br&gt;&lt;code&gt;1&lt;/code&gt;:内网GET流量&lt;br&gt;&lt;code&gt;2&lt;/code&gt;:内网HEAD流量&lt;br&gt;&lt;code&gt;3&lt;/code&gt;:内网PUT流量&lt;br&gt;&lt;code&gt;4&lt;/code&gt;:内网POST流量&lt;br&gt;&lt;code&gt;5&lt;/code&gt;:内网DELETE流量&lt;br&gt;&lt;code&gt;6&lt;/code&gt;:内网OPTIONS流量&lt;br&gt;&lt;code&gt;7&lt;/code&gt;:内网TRACE流量&lt;br&gt;&lt;code&gt;11&lt;/code&gt;:外网GET流量&lt;br&gt;&lt;code&gt;12&lt;/code&gt;:外网HEAD流量&lt;br&gt;&lt;code&gt;13&lt;/code&gt;:外网PUT流量&lt;br&gt;&lt;code&gt;14&lt;/code&gt;:外网POST流量&lt;br&gt;&lt;code&gt;15&lt;/code&gt;:外网DELETE流量&lt;br&gt;&lt;code&gt;16&lt;/code&gt;:外网OPTIONS流量&lt;br&gt;&lt;code&gt;17&lt;/code&gt;:外网TRACE流量&lt;br&gt;&lt;code&gt;21&lt;/code&gt;:CDN GET流量&lt;br&gt;&lt;code&gt;22&lt;/code&gt;:CDN HEAD流量&lt;br&gt;&lt;code&gt;23&lt;/code&gt;:CDN PUT流量&lt;br&gt;&lt;code&gt;24&lt;/code&gt;:CDN POST流量&lt;br&gt;&lt;code&gt;25&lt;/code&gt;:CDN DELETE流量&lt;br&gt;&lt;code&gt;26&lt;/code&gt;:CDN OPTIONS流量&lt;br&gt;&lt;code&gt;27&lt;/code&gt;:CDN TRACE流量&lt;br&gt;&lt;code&gt;31&lt;/code&gt;:内网GET数&lt;br&gt;&lt;code&gt;32&lt;/code&gt;:内网HEAD数&lt;br&gt;&lt;code&gt;33&lt;/code&gt;:内网PUT数&lt;br&gt;&lt;code&gt;34&lt;/code&gt;:内网POST数&lt;br&gt;&lt;code&gt;35&lt;/code&gt;:内网DELETE数&lt;br&gt;&lt;code&gt;36&lt;/code&gt;:内网OPTIONS数&lt;br&gt;&lt;code&gt;37&lt;/code&gt;:内网TRACE数&lt;br&gt;&lt;code&gt;51&lt;/code&gt;:外网GET数&lt;br&gt;&lt;code&gt;52&lt;/code&gt;:外网HEAD数&lt;br&gt;&lt;code&gt;53&lt;/code&gt;:外网PUT数&lt;br&gt;&lt;code&gt;54&lt;/code&gt;:外网POST数&lt;br&gt;&lt;code&gt;55&lt;/code&gt;:外网DELETE数&lt;br&gt;&lt;code&gt;56&lt;/code&gt;:外网OPTIONS数&lt;br&gt;&lt;code&gt;57&lt;/code&gt;:外网TRACE数&lt;br&gt;&lt;code&gt;61&lt;/code&gt;:CDN GET数&lt;br&gt;&lt;code&gt;62&lt;/code&gt;:CDN HEAD数&lt;br&gt;&lt;code&gt;63&lt;/code&gt;:CDN PUT数&lt;br&gt;&lt;code&gt;64&lt;/code&gt;:CDN POST数&lt;br&gt;&lt;code&gt;65&lt;/code&gt;:CDN DELETE数&lt;br&gt;&lt;code&gt;66&lt;/code&gt;:CDN OPTIONS数&lt;br&gt;&lt;code&gt;67&lt;/code&gt;:CDN TRACE数&lt;br&gt;&lt;code&gt;71&lt;/code&gt;:归档提前删除&lt;br&gt;&lt;code&gt;72&lt;/code&gt;:低频提前删除&lt;br&gt;&lt;code&gt;81&lt;/code&gt;:归档取回Bulk&lt;br&gt;&lt;code&gt;82&lt;/code&gt;:归档取回Std&lt;br&gt;&lt;code&gt;83&lt;/code&gt;:归档取回Exp&lt;br&gt;&lt;code&gt;84&lt;/code&gt;:低频数据取回

    *
    * @param capacityTypes
    */
    public void setCapacityTypes(List<Integer> capacityTypes) {
        this.capacityTypes = capacityTypes;
    }


    /**
     * get 开始时间，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ss&#39;Z&#39;
     *
     * @return
     */
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * set 开始时间，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ss&#39;Z&#39;
     *
     * @param beginTime
     */
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }


    /**
     * get 结束时间，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ss&#39;Z&#39;
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ss&#39;Z&#39;
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get 查询数据的聚合方式:&lt;br&gt;&lt;code&gt;0&lt;/code&gt;:all, 最大查询区间365天 &lt;br&gt;&lt;code&gt;1&lt;/code&gt;:hour，最大查询区间31天。默认1&lt;br&gt;&lt;code&gt;2&lt;/code&gt;:day, 最大查询区间365天。
     *
     * @return
     */
    public Integer getPeriodType() {
        return periodType;
    }

    /**
     * set 查询数据的聚合方式:&lt;br&gt;&lt;code&gt;0&lt;/code&gt;:all, 最大查询区间365天 &lt;br&gt;&lt;code&gt;1&lt;/code&gt;:hour，最大查询区间31天。默认1&lt;br&gt;&lt;code&gt;2&lt;/code&gt;:day, 最大查询区间365天。
     *
     * @param periodType
     */
    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }


    /**
     * get 返回数据的方式： &lt;code&gt;1&lt;/code&gt;:recent(区间值), &lt;code&gt;2&lt;/code&gt;:current(当前值。method &#x3D; 2 时如果查询当前值时传入beginTime，则按照beginTime时间来进行查询；如果不传beginTime，则按照后端系统时间查询。)
     *
     * @return
     */
    public Integer getMethod() {
        return method;
    }

    /**
     * set 返回数据的方式： &lt;code&gt;1&lt;/code&gt;:recent(区间值), &lt;code&gt;2&lt;/code&gt;:current(当前值。method &#x3D; 2 时如果查询当前值时传入beginTime，则按照beginTime时间来进行查询；如果不传beginTime，则按照后端系统时间查询。)
     *
     * @param method
     */
    public void setMethod(Integer method) {
        this.method = method;
    }


    /**
     * get 区域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 查询用量的指定bucket
     *
     * @return
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * set 查询用量的指定bucket
     *
     * @param bucketName
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }



    /**
    * set &lt;p&gt;查询用量数据类型：&lt;/p&gt;&lt;br&gt;&lt;code&gt;1000040&lt;/code&gt;:标准存储&lt;br&gt;&lt;code&gt;1000041&lt;/code&gt;:低冗余存储&lt;br&gt;&lt;code&gt;1000042&lt;/code&gt;:归档存储&lt;br&gt;&lt;code&gt;1000043&lt;/code&gt;归档overHead存储:&lt;br&gt;&lt;code&gt;1000044&lt;/code&gt;低频存储:&lt;br&gt;&lt;code&gt;1000045&lt;/code&gt;低频overHead存储:&lt;br&gt;&lt;code&gt;1&lt;/code&gt;:内网GET流量&lt;br&gt;&lt;code&gt;2&lt;/code&gt;:内网HEAD流量&lt;br&gt;&lt;code&gt;3&lt;/code&gt;:内网PUT流量&lt;br&gt;&lt;code&gt;4&lt;/code&gt;:内网POST流量&lt;br&gt;&lt;code&gt;5&lt;/code&gt;:内网DELETE流量&lt;br&gt;&lt;code&gt;6&lt;/code&gt;:内网OPTIONS流量&lt;br&gt;&lt;code&gt;7&lt;/code&gt;:内网TRACE流量&lt;br&gt;&lt;code&gt;11&lt;/code&gt;:外网GET流量&lt;br&gt;&lt;code&gt;12&lt;/code&gt;:外网HEAD流量&lt;br&gt;&lt;code&gt;13&lt;/code&gt;:外网PUT流量&lt;br&gt;&lt;code&gt;14&lt;/code&gt;:外网POST流量&lt;br&gt;&lt;code&gt;15&lt;/code&gt;:外网DELETE流量&lt;br&gt;&lt;code&gt;16&lt;/code&gt;:外网OPTIONS流量&lt;br&gt;&lt;code&gt;17&lt;/code&gt;:外网TRACE流量&lt;br&gt;&lt;code&gt;21&lt;/code&gt;:CDN GET流量&lt;br&gt;&lt;code&gt;22&lt;/code&gt;:CDN HEAD流量&lt;br&gt;&lt;code&gt;23&lt;/code&gt;:CDN PUT流量&lt;br&gt;&lt;code&gt;24&lt;/code&gt;:CDN POST流量&lt;br&gt;&lt;code&gt;25&lt;/code&gt;:CDN DELETE流量&lt;br&gt;&lt;code&gt;26&lt;/code&gt;:CDN OPTIONS流量&lt;br&gt;&lt;code&gt;27&lt;/code&gt;:CDN TRACE流量&lt;br&gt;&lt;code&gt;31&lt;/code&gt;:内网GET数&lt;br&gt;&lt;code&gt;32&lt;/code&gt;:内网HEAD数&lt;br&gt;&lt;code&gt;33&lt;/code&gt;:内网PUT数&lt;br&gt;&lt;code&gt;34&lt;/code&gt;:内网POST数&lt;br&gt;&lt;code&gt;35&lt;/code&gt;:内网DELETE数&lt;br&gt;&lt;code&gt;36&lt;/code&gt;:内网OPTIONS数&lt;br&gt;&lt;code&gt;37&lt;/code&gt;:内网TRACE数&lt;br&gt;&lt;code&gt;51&lt;/code&gt;:外网GET数&lt;br&gt;&lt;code&gt;52&lt;/code&gt;:外网HEAD数&lt;br&gt;&lt;code&gt;53&lt;/code&gt;:外网PUT数&lt;br&gt;&lt;code&gt;54&lt;/code&gt;:外网POST数&lt;br&gt;&lt;code&gt;55&lt;/code&gt;:外网DELETE数&lt;br&gt;&lt;code&gt;56&lt;/code&gt;:外网OPTIONS数&lt;br&gt;&lt;code&gt;57&lt;/code&gt;:外网TRACE数&lt;br&gt;&lt;code&gt;61&lt;/code&gt;:CDN GET数&lt;br&gt;&lt;code&gt;62&lt;/code&gt;:CDN HEAD数&lt;br&gt;&lt;code&gt;63&lt;/code&gt;:CDN PUT数&lt;br&gt;&lt;code&gt;64&lt;/code&gt;:CDN POST数&lt;br&gt;&lt;code&gt;65&lt;/code&gt;:CDN DELETE数&lt;br&gt;&lt;code&gt;66&lt;/code&gt;:CDN OPTIONS数&lt;br&gt;&lt;code&gt;67&lt;/code&gt;:CDN TRACE数&lt;br&gt;&lt;code&gt;71&lt;/code&gt;:归档提前删除&lt;br&gt;&lt;code&gt;72&lt;/code&gt;:低频提前删除&lt;br&gt;&lt;code&gt;81&lt;/code&gt;:归档取回Bulk&lt;br&gt;&lt;code&gt;82&lt;/code&gt;:归档取回Std&lt;br&gt;&lt;code&gt;83&lt;/code&gt;:归档取回Exp&lt;br&gt;&lt;code&gt;84&lt;/code&gt;:低频数据取回

    *
    * @param capacityTypes
    */
    public GetSingleBucketCapacityRequest capacityTypes(List<Integer> capacityTypes) {
        this.capacityTypes = capacityTypes;
        return this;
    }


    /**
     * set 开始时间，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ss&#39;Z&#39;
     *
     * @param beginTime
     */
    public GetSingleBucketCapacityRequest beginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }


    /**
     * set 结束时间，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ss&#39;Z&#39;
     *
     * @param endTime
     */
    public GetSingleBucketCapacityRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 查询数据的聚合方式:&lt;br&gt;&lt;code&gt;0&lt;/code&gt;:all, 最大查询区间365天 &lt;br&gt;&lt;code&gt;1&lt;/code&gt;:hour，最大查询区间31天。默认1&lt;br&gt;&lt;code&gt;2&lt;/code&gt;:day, 最大查询区间365天。
     *
     * @param periodType
     */
    public GetSingleBucketCapacityRequest periodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }


    /**
     * set 返回数据的方式： &lt;code&gt;1&lt;/code&gt;:recent(区间值), &lt;code&gt;2&lt;/code&gt;:current(当前值。method &#x3D; 2 时如果查询当前值时传入beginTime，则按照beginTime时间来进行查询；如果不传beginTime，则按照后端系统时间查询。)
     *
     * @param method
     */
    public GetSingleBucketCapacityRequest method(Integer method) {
        this.method = method;
        return this;
    }


    /**
     * set 区域ID
     *
     * @param regionId
     */
    public GetSingleBucketCapacityRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 查询用量的指定bucket
     *
     * @param bucketName
     */
    public GetSingleBucketCapacityRequest bucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }



    /**
     * add item to &lt;p&gt;查询用量数据类型：&lt;/p&gt;&lt;br&gt;&lt;code&gt;1000040&lt;/code&gt;:标准存储&lt;br&gt;&lt;code&gt;1000041&lt;/code&gt;:低冗余存储&lt;br&gt;&lt;code&gt;1000042&lt;/code&gt;:归档存储&lt;br&gt;&lt;code&gt;1000043&lt;/code&gt;归档overHead存储:&lt;br&gt;&lt;code&gt;1000044&lt;/code&gt;低频存储:&lt;br&gt;&lt;code&gt;1000045&lt;/code&gt;低频overHead存储:&lt;br&gt;&lt;code&gt;1&lt;/code&gt;:内网GET流量&lt;br&gt;&lt;code&gt;2&lt;/code&gt;:内网HEAD流量&lt;br&gt;&lt;code&gt;3&lt;/code&gt;:内网PUT流量&lt;br&gt;&lt;code&gt;4&lt;/code&gt;:内网POST流量&lt;br&gt;&lt;code&gt;5&lt;/code&gt;:内网DELETE流量&lt;br&gt;&lt;code&gt;6&lt;/code&gt;:内网OPTIONS流量&lt;br&gt;&lt;code&gt;7&lt;/code&gt;:内网TRACE流量&lt;br&gt;&lt;code&gt;11&lt;/code&gt;:外网GET流量&lt;br&gt;&lt;code&gt;12&lt;/code&gt;:外网HEAD流量&lt;br&gt;&lt;code&gt;13&lt;/code&gt;:外网PUT流量&lt;br&gt;&lt;code&gt;14&lt;/code&gt;:外网POST流量&lt;br&gt;&lt;code&gt;15&lt;/code&gt;:外网DELETE流量&lt;br&gt;&lt;code&gt;16&lt;/code&gt;:外网OPTIONS流量&lt;br&gt;&lt;code&gt;17&lt;/code&gt;:外网TRACE流量&lt;br&gt;&lt;code&gt;21&lt;/code&gt;:CDN GET流量&lt;br&gt;&lt;code&gt;22&lt;/code&gt;:CDN HEAD流量&lt;br&gt;&lt;code&gt;23&lt;/code&gt;:CDN PUT流量&lt;br&gt;&lt;code&gt;24&lt;/code&gt;:CDN POST流量&lt;br&gt;&lt;code&gt;25&lt;/code&gt;:CDN DELETE流量&lt;br&gt;&lt;code&gt;26&lt;/code&gt;:CDN OPTIONS流量&lt;br&gt;&lt;code&gt;27&lt;/code&gt;:CDN TRACE流量&lt;br&gt;&lt;code&gt;31&lt;/code&gt;:内网GET数&lt;br&gt;&lt;code&gt;32&lt;/code&gt;:内网HEAD数&lt;br&gt;&lt;code&gt;33&lt;/code&gt;:内网PUT数&lt;br&gt;&lt;code&gt;34&lt;/code&gt;:内网POST数&lt;br&gt;&lt;code&gt;35&lt;/code&gt;:内网DELETE数&lt;br&gt;&lt;code&gt;36&lt;/code&gt;:内网OPTIONS数&lt;br&gt;&lt;code&gt;37&lt;/code&gt;:内网TRACE数&lt;br&gt;&lt;code&gt;51&lt;/code&gt;:外网GET数&lt;br&gt;&lt;code&gt;52&lt;/code&gt;:外网HEAD数&lt;br&gt;&lt;code&gt;53&lt;/code&gt;:外网PUT数&lt;br&gt;&lt;code&gt;54&lt;/code&gt;:外网POST数&lt;br&gt;&lt;code&gt;55&lt;/code&gt;:外网DELETE数&lt;br&gt;&lt;code&gt;56&lt;/code&gt;:外网OPTIONS数&lt;br&gt;&lt;code&gt;57&lt;/code&gt;:外网TRACE数&lt;br&gt;&lt;code&gt;61&lt;/code&gt;:CDN GET数&lt;br&gt;&lt;code&gt;62&lt;/code&gt;:CDN HEAD数&lt;br&gt;&lt;code&gt;63&lt;/code&gt;:CDN PUT数&lt;br&gt;&lt;code&gt;64&lt;/code&gt;:CDN POST数&lt;br&gt;&lt;code&gt;65&lt;/code&gt;:CDN DELETE数&lt;br&gt;&lt;code&gt;66&lt;/code&gt;:CDN OPTIONS数&lt;br&gt;&lt;code&gt;67&lt;/code&gt;:CDN TRACE数&lt;br&gt;&lt;code&gt;71&lt;/code&gt;:归档提前删除&lt;br&gt;&lt;code&gt;72&lt;/code&gt;:低频提前删除&lt;br&gt;&lt;code&gt;81&lt;/code&gt;:归档取回Bulk&lt;br&gt;&lt;code&gt;82&lt;/code&gt;:归档取回Std&lt;br&gt;&lt;code&gt;83&lt;/code&gt;:归档取回Exp&lt;br&gt;&lt;code&gt;84&lt;/code&gt;:低频数据取回

     *
     * @param capacityType
     */
    public void addCapacityType(Integer capacityType) {
        if (this.capacityTypes == null) {
            this.capacityTypes = new ArrayList<>();
        }
        this.capacityTypes.add(capacityType);
    }
}