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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询转码时长数据
 */
public class DescribeLiveTranscodingDurationDataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 播放域名
     */
    private String domainName;

    /**
     * 码率档次，可以查询指定档次的转码时长，取值：
- video_h264_4k_1
- video_h264_2k_1
- video_h264_shd_1
- video_h264_hd_1
- video_h264_sd_1
- video_h265_4k_1
- video_h265_2k_1
- video_h265_shd_1
- video_h265_hd_1
- video_h265_sd_1

     */
    private String grade;

    /**
     * 查询周期，取值范围：“day,month,year,followTime”，分别表示1天，1月，1年，跟随时间。默认为空，表示day。当传入followTime时，表示按Endtime-StartTime的周期，只返回一个点

     */
    private String period;

    /**
     * 查询起始时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 查询截至时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，为空时默认为当前时间

     */
    private String endTime;


    /**
     * get 播放域名
     *
     * @return
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * set 播放域名
     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * get 码率档次，可以查询指定档次的转码时长，取值：
- video_h264_4k_1
- video_h264_2k_1
- video_h264_shd_1
- video_h264_hd_1
- video_h264_sd_1
- video_h265_4k_1
- video_h265_2k_1
- video_h265_shd_1
- video_h265_hd_1
- video_h265_sd_1

     *
     * @return
     */
    public String getGrade() {
        return grade;
    }

    /**
     * set 码率档次，可以查询指定档次的转码时长，取值：
- video_h264_4k_1
- video_h264_2k_1
- video_h264_shd_1
- video_h264_hd_1
- video_h264_sd_1
- video_h265_4k_1
- video_h265_2k_1
- video_h265_shd_1
- video_h265_hd_1
- video_h265_sd_1

     *
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * get 查询周期，取值范围：“day,month,year,followTime”，分别表示1天，1月，1年，跟随时间。默认为空，表示day。当传入followTime时，表示按Endtime-StartTime的周期，只返回一个点

     *
     * @return
     */
    public String getPeriod() {
        return period;
    }

    /**
     * set 查询周期，取值范围：“day,month,year,followTime”，分别表示1天，1月，1年，跟随时间。默认为空，表示day。当传入followTime时，表示按Endtime-StartTime的周期，只返回一个点

     *
     * @param period
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * get 查询起始时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询起始时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询截至时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，为空时默认为当前时间

     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询截至时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，为空时默认为当前时间

     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * set 播放域名
     *
     * @param domainName
     */
    public DescribeLiveTranscodingDurationDataRequest domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * set 码率档次，可以查询指定档次的转码时长，取值：
- video_h264_4k_1
- video_h264_2k_1
- video_h264_shd_1
- video_h264_hd_1
- video_h264_sd_1
- video_h265_4k_1
- video_h265_2k_1
- video_h265_shd_1
- video_h265_hd_1
- video_h265_sd_1

     *
     * @param grade
     */
    public DescribeLiveTranscodingDurationDataRequest grade(String grade) {
        this.grade = grade;
        return this;
    }

    /**
     * set 查询周期，取值范围：“day,month,year,followTime”，分别表示1天，1月，1年，跟随时间。默认为空，表示day。当传入followTime时，表示按Endtime-StartTime的周期，只返回一个点

     *
     * @param period
     */
    public DescribeLiveTranscodingDurationDataRequest period(String period) {
        this.period = period;
        return this;
    }

    /**
     * set 查询起始时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;

     *
     * @param startTime
     */
    public DescribeLiveTranscodingDurationDataRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询截至时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，为空时默认为当前时间

     *
     * @param endTime
     */
    public DescribeLiveTranscodingDurationDataRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


}