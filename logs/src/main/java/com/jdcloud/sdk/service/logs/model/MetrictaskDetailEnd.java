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

package com.jdcloud.sdk.service.logs.model;


/**
 * metrictaskDetailEnd
 */
public class MetrictaskDetailEnd  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 聚合函数
     */
    private String aggregate;

    /**
     * createdTime
     */
    private String createdTime;

    /**
     * 开启自定义单位
     */
    private String customUnit;

    /**
     * 查询字段
     */
    private String dataField;

    /**
     * 过滤语法
     */
    private String filterContent;

    /**
     * filterOpen
     */
    private String filterOpen;

    /**
     * 过滤类型
     */
    private String filterType;

    /**
     * id
     */
    private String id;

    /**
     * 周期
     */
    private Long interval;

    /**
     * 监控项名称
     */
    private String metric;

    /**
     * 监控任务名称
     */
    private String name;

    /**
     * 配置方式:枚举值 visual，sql；分别代表可视化配置及sql配置方式
     */
    private String settingType;

    /**
     * sqlSpec
     */
    private MetricTaskSqlSpec sqlSpec;

    /**
     * 单位
     */
    private String unit;

    /**
     * updateTime
     */
    private String updateTime;



    /**
     * get 聚合函数
     *
     * @return
     */
    public String getAggregate() {
        return aggregate;
    }

    /**
     * set 聚合函数
     *
     * @param aggregate
     */
    public void setAggregate(String aggregate) {
        this.aggregate = aggregate;
    }


    /**
     * get createdTime
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set createdTime
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * get 开启自定义单位
     *
     * @return
     */
    public String getCustomUnit() {
        return customUnit;
    }

    /**
     * set 开启自定义单位
     *
     * @param customUnit
     */
    public void setCustomUnit(String customUnit) {
        this.customUnit = customUnit;
    }


    /**
     * get 查询字段
     *
     * @return
     */
    public String getDataField() {
        return dataField;
    }

    /**
     * set 查询字段
     *
     * @param dataField
     */
    public void setDataField(String dataField) {
        this.dataField = dataField;
    }


    /**
     * get 过滤语法
     *
     * @return
     */
    public String getFilterContent() {
        return filterContent;
    }

    /**
     * set 过滤语法
     *
     * @param filterContent
     */
    public void setFilterContent(String filterContent) {
        this.filterContent = filterContent;
    }


    /**
     * get filterOpen
     *
     * @return
     */
    public String getFilterOpen() {
        return filterOpen;
    }

    /**
     * set filterOpen
     *
     * @param filterOpen
     */
    public void setFilterOpen(String filterOpen) {
        this.filterOpen = filterOpen;
    }


    /**
     * get 过滤类型
     *
     * @return
     */
    public String getFilterType() {
        return filterType;
    }

    /**
     * set 过滤类型
     *
     * @param filterType
     */
    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }


    /**
     * get id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * get 周期
     *
     * @return
     */
    public Long getInterval() {
        return interval;
    }

    /**
     * set 周期
     *
     * @param interval
     */
    public void setInterval(Long interval) {
        this.interval = interval;
    }


    /**
     * get 监控项名称
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控项名称
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }


    /**
     * get 监控任务名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 监控任务名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 配置方式:枚举值 visual，sql；分别代表可视化配置及sql配置方式
     *
     * @return
     */
    public String getSettingType() {
        return settingType;
    }

    /**
     * set 配置方式:枚举值 visual，sql；分别代表可视化配置及sql配置方式
     *
     * @param settingType
     */
    public void setSettingType(String settingType) {
        this.settingType = settingType;
    }


    /**
     * get sqlSpec
     *
     * @return
     */
    public MetricTaskSqlSpec getSqlSpec() {
        return sqlSpec;
    }

    /**
     * set sqlSpec
     *
     * @param sqlSpec
     */
    public void setSqlSpec(MetricTaskSqlSpec sqlSpec) {
        this.sqlSpec = sqlSpec;
    }


    /**
     * get 单位
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 单位
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }


    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }



    /**
     * set 聚合函数
     *
     * @param aggregate
     */
    public MetrictaskDetailEnd aggregate(String aggregate) {
        this.aggregate = aggregate;
        return this;
    }


    /**
     * set createdTime
     *
     * @param createdTime
     */
    public MetrictaskDetailEnd createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


    /**
     * set 开启自定义单位
     *
     * @param customUnit
     */
    public MetrictaskDetailEnd customUnit(String customUnit) {
        this.customUnit = customUnit;
        return this;
    }


    /**
     * set 查询字段
     *
     * @param dataField
     */
    public MetrictaskDetailEnd dataField(String dataField) {
        this.dataField = dataField;
        return this;
    }


    /**
     * set 过滤语法
     *
     * @param filterContent
     */
    public MetrictaskDetailEnd filterContent(String filterContent) {
        this.filterContent = filterContent;
        return this;
    }


    /**
     * set filterOpen
     *
     * @param filterOpen
     */
    public MetrictaskDetailEnd filterOpen(String filterOpen) {
        this.filterOpen = filterOpen;
        return this;
    }


    /**
     * set 过滤类型
     *
     * @param filterType
     */
    public MetrictaskDetailEnd filterType(String filterType) {
        this.filterType = filterType;
        return this;
    }


    /**
     * set id
     *
     * @param id
     */
    public MetrictaskDetailEnd id(String id) {
        this.id = id;
        return this;
    }


    /**
     * set 周期
     *
     * @param interval
     */
    public MetrictaskDetailEnd interval(Long interval) {
        this.interval = interval;
        return this;
    }


    /**
     * set 监控项名称
     *
     * @param metric
     */
    public MetrictaskDetailEnd metric(String metric) {
        this.metric = metric;
        return this;
    }


    /**
     * set 监控任务名称
     *
     * @param name
     */
    public MetrictaskDetailEnd name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 配置方式:枚举值 visual，sql；分别代表可视化配置及sql配置方式
     *
     * @param settingType
     */
    public MetrictaskDetailEnd settingType(String settingType) {
        this.settingType = settingType;
        return this;
    }


    /**
     * set sqlSpec
     *
     * @param sqlSpec
     */
    public MetrictaskDetailEnd sqlSpec(MetricTaskSqlSpec sqlSpec) {
        this.sqlSpec = sqlSpec;
        return this;
    }


    /**
     * set 单位
     *
     * @param unit
     */
    public MetrictaskDetailEnd unit(String unit) {
        this.unit = unit;
        return this;
    }


    /**
     * set updateTime
     *
     * @param updateTime
     */
    public MetrictaskDetailEnd updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}