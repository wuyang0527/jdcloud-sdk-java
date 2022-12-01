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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kubernetes.model;


/**
 * 集群维护窗口
 */
public class MaintenanceWindow  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * daily, weekly, monthly， 默认 weekly
     */
    private String periodType;

    /**
     * 维护操作开始具体日期, 仅对 periodType 取值为 weekly 或 monthly 时有效, periodType 为 weekly 时可以取 1-7, periodType 为 monthly 时可取 1-28

     */
    private Integer startDay;

    /**
     * 维护操作开始具体时间. 时间格式符合RFC3339，并使用 UTC 时间，精确到分钟，例如 23:27
     */
    private String startTime;

    /**
     * 维护运行时长: 4-24 小时，步长 1 小时， 默认为： 4小时
     */
    private Integer duration;



    /**
     * get daily, weekly, monthly， 默认 weekly
     *
     * @return
     */
    public String getPeriodType() {
        return periodType;
    }

    /**
     * set daily, weekly, monthly， 默认 weekly
     *
     * @param periodType
     */
    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }


    /**
     * get 维护操作开始具体日期, 仅对 periodType 取值为 weekly 或 monthly 时有效, periodType 为 weekly 时可以取 1-7, periodType 为 monthly 时可取 1-28

     *
     * @return
     */
    public Integer getStartDay() {
        return startDay;
    }

    /**
     * set 维护操作开始具体日期, 仅对 periodType 取值为 weekly 或 monthly 时有效, periodType 为 weekly 时可以取 1-7, periodType 为 monthly 时可取 1-28

     *
     * @param startDay
     */
    public void setStartDay(Integer startDay) {
        this.startDay = startDay;
    }


    /**
     * get 维护操作开始具体时间. 时间格式符合RFC3339，并使用 UTC 时间，精确到分钟，例如 23:27
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 维护操作开始具体时间. 时间格式符合RFC3339，并使用 UTC 时间，精确到分钟，例如 23:27
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 维护运行时长: 4-24 小时，步长 1 小时， 默认为： 4小时
     *
     * @return
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * set 维护运行时长: 4-24 小时，步长 1 小时， 默认为： 4小时
     *
     * @param duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }



    /**
     * set daily, weekly, monthly， 默认 weekly
     *
     * @param periodType
     */
    public MaintenanceWindow periodType(String periodType) {
        this.periodType = periodType;
        return this;
    }


    /**
     * set 维护操作开始具体日期, 仅对 periodType 取值为 weekly 或 monthly 时有效, periodType 为 weekly 时可以取 1-7, periodType 为 monthly 时可取 1-28

     *
     * @param startDay
     */
    public MaintenanceWindow startDay(Integer startDay) {
        this.startDay = startDay;
        return this;
    }


    /**
     * set 维护操作开始具体时间. 时间格式符合RFC3339，并使用 UTC 时间，精确到分钟，例如 23:27
     *
     * @param startTime
     */
    public MaintenanceWindow startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 维护运行时长: 4-24 小时，步长 1 小时， 默认为： 4小时
     *
     * @param duration
     */
    public MaintenanceWindow duration(Integer duration) {
        this.duration = duration;
        return this;
    }


}