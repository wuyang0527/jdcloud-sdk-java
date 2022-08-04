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

package com.jdcloud.sdk.service.jdccs.model;


/**
 * 报警历史
 */
public class AlarmHistory  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则实例ID
     */
    private String alarmId;

    /**
     * 规则名称
     */
    private String name;

    /**
     * 机房英文标识
     */
    private String idc;

    /**
     * 机房名称
     */
    private String idcName;

    /**
     * 资源类型 bandwidth:带宽
     */
    private String resourceType;

    /**
     * 资源ID
     */
    private String resourceId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 监控项英文标识
     */
    private String metric;

    /**
     * 监控项名称
     */
    private String metricName;

    /**
     * 统计周期（单位：分钟）
     */
    private Integer period;

    /**
     * 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min
     */
    private String statisticMethod;

    /**
     * 计算方式 &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;、！&#x3D;
     */
    private String operator;

    /**
     * 阈值
     */
    private Double threshold;

    /**
     * 连续多少次后报警
     */
    private Integer times;

    /**
     * 通知周期 单位：小时
     */
    private Integer noticePeriod;

    /**
     * 规则状态 disabled:禁用 enabled:启用
     */
    private String status;

    /**
     * IP地址
     */
    private String managementIp;

    /**
     * 端口名称
     */
    private String ifName;

    /**
     * 报警状态 normal:正常 alarm:报警
     */
    private String alarmStatus;

    /**
     * 报警值
     */
    private Double value;

    /**
     * 报警时间 遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     */
    private String noticeTime;

    /**
     * 报警条件
     */
    private String condition;


    /**
     * get 规则实例ID
     *
     * @return
     */
    public String getAlarmId() {
        return alarmId;
    }

    /**
     * set 规则实例ID
     *
     * @param alarmId
     */
    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    /**
     * get 规则名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 规则名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * get 机房名称
     *
     * @return
     */
    public String getIdcName() {
        return idcName;
    }

    /**
     * set 机房名称
     *
     * @param idcName
     */
    public void setIdcName(String idcName) {
        this.idcName = idcName;
    }

    /**
     * get 资源类型 bandwidth:带宽
     *
     * @return
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * set 资源类型 bandwidth:带宽
     *
     * @param resourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * get 资源ID
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 资源名称
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * get 监控项英文标识
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控项英文标识
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * get 监控项名称
     *
     * @return
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * set 监控项名称
     *
     * @param metricName
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * get 统计周期（单位：分钟）
     *
     * @return
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * set 统计周期（单位：分钟）
     *
     * @param period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * get 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min
     *
     * @return
     */
    public String getStatisticMethod() {
        return statisticMethod;
    }

    /**
     * set 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min
     *
     * @param statisticMethod
     */
    public void setStatisticMethod(String statisticMethod) {
        this.statisticMethod = statisticMethod;
    }

    /**
     * get 计算方式 &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;、！&#x3D;
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 计算方式 &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;、！&#x3D;
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * get 阈值
     *
     * @return
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * set 阈值
     *
     * @param threshold
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * get 连续多少次后报警
     *
     * @return
     */
    public Integer getTimes() {
        return times;
    }

    /**
     * set 连续多少次后报警
     *
     * @param times
     */
    public void setTimes(Integer times) {
        this.times = times;
    }

    /**
     * get 通知周期 单位：小时
     *
     * @return
     */
    public Integer getNoticePeriod() {
        return noticePeriod;
    }

    /**
     * set 通知周期 单位：小时
     *
     * @param noticePeriod
     */
    public void setNoticePeriod(Integer noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    /**
     * get 规则状态 disabled:禁用 enabled:启用
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 规则状态 disabled:禁用 enabled:启用
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get IP地址
     *
     * @return
     */
    public String getManagementIp() {
        return managementIp;
    }

    /**
     * set IP地址
     *
     * @param managementIp
     */
    public void setManagementIp(String managementIp) {
        this.managementIp = managementIp;
    }

    /**
     * get 端口名称
     *
     * @return
     */
    public String getIfName() {
        return ifName;
    }

    /**
     * set 端口名称
     *
     * @param ifName
     */
    public void setIfName(String ifName) {
        this.ifName = ifName;
    }

    /**
     * get 报警状态 normal:正常 alarm:报警
     *
     * @return
     */
    public String getAlarmStatus() {
        return alarmStatus;
    }

    /**
     * set 报警状态 normal:正常 alarm:报警
     *
     * @param alarmStatus
     */
    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    /**
     * get 报警值
     *
     * @return
     */
    public Double getValue() {
        return value;
    }

    /**
     * set 报警值
     *
     * @param value
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * get 报警时间 遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @return
     */
    public String getNoticeTime() {
        return noticeTime;
    }

    /**
     * set 报警时间 遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @param noticeTime
     */
    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    /**
     * get 报警条件
     *
     * @return
     */
    public String getCondition() {
        return condition;
    }

    /**
     * set 报警条件
     *
     * @param condition
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }


    /**
     * set 规则实例ID
     *
     * @param alarmId
     */
    public AlarmHistory alarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * set 规则名称
     *
     * @param name
     */
    public AlarmHistory name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 机房英文标识
     *
     * @param idc
     */
    public AlarmHistory idc(String idc) {
        this.idc = idc;
        return this;
    }

    /**
     * set 机房名称
     *
     * @param idcName
     */
    public AlarmHistory idcName(String idcName) {
        this.idcName = idcName;
        return this;
    }

    /**
     * set 资源类型 bandwidth:带宽
     *
     * @param resourceType
     */
    public AlarmHistory resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public AlarmHistory resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public AlarmHistory resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * set 监控项英文标识
     *
     * @param metric
     */
    public AlarmHistory metric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * set 监控项名称
     *
     * @param metricName
     */
    public AlarmHistory metricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * set 统计周期（单位：分钟）
     *
     * @param period
     */
    public AlarmHistory period(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * set 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min
     *
     * @param statisticMethod
     */
    public AlarmHistory statisticMethod(String statisticMethod) {
        this.statisticMethod = statisticMethod;
        return this;
    }

    /**
     * set 计算方式 &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;、！&#x3D;
     *
     * @param operator
     */
    public AlarmHistory operator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * set 阈值
     *
     * @param threshold
     */
    public AlarmHistory threshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * set 连续多少次后报警
     *
     * @param times
     */
    public AlarmHistory times(Integer times) {
        this.times = times;
        return this;
    }

    /**
     * set 通知周期 单位：小时
     *
     * @param noticePeriod
     */
    public AlarmHistory noticePeriod(Integer noticePeriod) {
        this.noticePeriod = noticePeriod;
        return this;
    }

    /**
     * set 规则状态 disabled:禁用 enabled:启用
     *
     * @param status
     */
    public AlarmHistory status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set IP地址
     *
     * @param managementIp
     */
    public AlarmHistory managementIp(String managementIp) {
        this.managementIp = managementIp;
        return this;
    }

    /**
     * set 端口名称
     *
     * @param ifName
     */
    public AlarmHistory ifName(String ifName) {
        this.ifName = ifName;
        return this;
    }

    /**
     * set 报警状态 normal:正常 alarm:报警
     *
     * @param alarmStatus
     */
    public AlarmHistory alarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    /**
     * set 报警值
     *
     * @param value
     */
    public AlarmHistory value(Double value) {
        this.value = value;
        return this;
    }

    /**
     * set 报警时间 遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @param noticeTime
     */
    public AlarmHistory noticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
        return this;
    }

    /**
     * set 报警条件
     *
     * @param condition
     */
    public AlarmHistory condition(String condition) {
        this.condition = condition;
        return this;
    }


}