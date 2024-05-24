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
 * Alarm API
 * 云托管服务的报警API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdccs.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 报警历史列表
 */
public class DescribeAlarmHistoryRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码, 默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小，默认为20
     */
    private Integer pageSize;

    /**
     * 报警规则ID
     */
    private String alarmId;

    /**
     * 机房英文标识
     */
    private String idc;

    /**
     * 查询时间范围的开始时间， UNIX时间戳
     */
    private Integer startTime;

    /**
     * 查询时间范围的结束时间， UNIX时间戳
     */
    private Integer endTime;



    /**
     * get 页码, 默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码, 默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 分页大小，默认为20
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小，默认为20
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get 报警规则ID
     *
     * @return
     */
    public String getAlarmId() {
        return alarmId;
    }

    /**
     * set 报警规则ID
     *
     * @param alarmId
     */
    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }


    /**
     * get 机房英文标识
     *
     * @return
     */
    public String getIdc() {
        return idc;
    }

    /**
     * set 机房英文标识
     *
     * @param idc
     */
    public void setIdc(String idc) {
        this.idc = idc;
    }


    /**
     * get 查询时间范围的开始时间， UNIX时间戳
     *
     * @return
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * set 查询时间范围的开始时间， UNIX时间戳
     *
     * @param startTime
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }


    /**
     * get 查询时间范围的结束时间， UNIX时间戳
     *
     * @return
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * set 查询时间范围的结束时间， UNIX时间戳
     *
     * @param endTime
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }



    /**
     * set 页码, 默认为1
     *
     * @param pageNumber
     */
    public DescribeAlarmHistoryRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小，默认为20
     *
     * @param pageSize
     */
    public DescribeAlarmHistoryRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 报警规则ID
     *
     * @param alarmId
     */
    public DescribeAlarmHistoryRequest alarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }


    /**
     * set 机房英文标识
     *
     * @param idc
     */
    public DescribeAlarmHistoryRequest idc(String idc) {
        this.idc = idc;
        return this;
    }


    /**
     * set 查询时间范围的开始时间， UNIX时间戳
     *
     * @param startTime
     */
    public DescribeAlarmHistoryRequest startTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 查询时间范围的结束时间， UNIX时间戳
     *
     * @param endTime
     */
    public DescribeAlarmHistoryRequest endTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }


}