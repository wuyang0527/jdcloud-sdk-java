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

package com.jdcloud.sdk.service.ag.model;


/**
 * 告警任务信息
 */
public class AsAlarmInfoByAsRule  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 告警任务ID
     */
    private String asAlarmId;

    /**
     * 告警任务名称
     */
    private String name;

    /**
     * 告警任务描述
     */
    private String description;

    /**
     * 监控项类型，取值范围：[&#x60;System&#x60;,&#x60;Custom&#x60;]
     */
    private String metricType;

    /**
     * 监控项，云主机监控指标说明：https://docs.jdcloud.com/cn/monitoring/vm
目前支持的指标项如下:
- &#x60;cpu_util&#x60;: &#x60;CPU使用率&#x60;
- &#x60;memory.usage&#x60;: &#x60;内存使用率&#x60;
- &#x60;vm.disk.bytes.read&#x60;: &#x60;磁盘读吞吐量(host)&#x60;
- &#x60;vm.disk.bytes.write&#x60;: &#x60;磁盘写吞吐量(host)&#x60;
- &#x60;vm.network.bytes.incoming&#x60;: &#x60;网络进速率(host)&#x60;
- &#x60;vm.network.bytes.outgoing&#x60;: &#x60;网络出速率(host)&#x60;

     */
    private String metricName;

    /**
     * 命名空间，仅当&#x60;metricType&#x60;为&#x60;Custom&#x60;时返回
     */
    private String namespace;

    /**
     * 监控项数据统计周期，单位分钟，取值范围：[&#x60;1&#x60;,&#x60;2&#x60;,&#x60;5&#x60;,&#x60;10&#x60;,&#x60;15&#x60;,&#x60;30&#x60;,&#x60;60&#x60;]
     */
    private Integer period;

    /**
     * 统计监控项数据的方法
- 系统监控取值范围：[&#x60;avg&#x60;,&#x60;max&#x60;,&#x60;min&#x60;]
- 自定义监控取值范围：[&#x60;avg&#x60;]

     */
    private String statistic;

    /**
     * 监控指标的阈值，必须大于0，阈值单位与监控项单位一致
     */
    private Double threshold;

    /**
     * 对监控项阈值的判断方式，取值范围：[&#x60;gte&#x60;:&#x60;大于等于&#x60;,&#x60;lte&#x60;:&#x60;小于等于&#x60;,&#x60;gt&#x60;:&#x60;大于&#x60;,&#x60;lt&#x60;:&#x60;小于&#x60;]
     */
    private String comparison;

    /**
     * 触发告警需要满足阈值表达式的次数，默认为&#x60;3&#x60;，取值范围：[&#x60;1&#x60;,&#x60;2&#x60;,&#x60;3&#x60;,&#x60;5&#x60;,&#x60;10&#x60;,&#x60;15&#x60;,&#x60;30&#x60;,&#x60;60&#x60;]
     */
    private Integer hitCount;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 告警任务状态，取值范围如下：
- &#x60;Disabled&#x60;：已禁用
- &#x60;Normal&#x60;：正常
- &#x60;DataMissing&#x60;：监控数据不足
- &#x60;Alarm&#x60;：告警中

     */
    private String state;



    /**
     * get 告警任务ID
     *
     * @return
     */
    public String getAsAlarmId() {
        return asAlarmId;
    }

    /**
     * set 告警任务ID
     *
     * @param asAlarmId
     */
    public void setAsAlarmId(String asAlarmId) {
        this.asAlarmId = asAlarmId;
    }


    /**
     * get 告警任务名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 告警任务名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 告警任务描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 告警任务描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 监控项类型，取值范围：[&#x60;System&#x60;,&#x60;Custom&#x60;]
     *
     * @return
     */
    public String getMetricType() {
        return metricType;
    }

    /**
     * set 监控项类型，取值范围：[&#x60;System&#x60;,&#x60;Custom&#x60;]
     *
     * @param metricType
     */
    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }


    /**
     * get 监控项，云主机监控指标说明：https://docs.jdcloud.com/cn/monitoring/vm
目前支持的指标项如下:
- &#x60;cpu_util&#x60;: &#x60;CPU使用率&#x60;
- &#x60;memory.usage&#x60;: &#x60;内存使用率&#x60;
- &#x60;vm.disk.bytes.read&#x60;: &#x60;磁盘读吞吐量(host)&#x60;
- &#x60;vm.disk.bytes.write&#x60;: &#x60;磁盘写吞吐量(host)&#x60;
- &#x60;vm.network.bytes.incoming&#x60;: &#x60;网络进速率(host)&#x60;
- &#x60;vm.network.bytes.outgoing&#x60;: &#x60;网络出速率(host)&#x60;

     *
     * @return
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * set 监控项，云主机监控指标说明：https://docs.jdcloud.com/cn/monitoring/vm
目前支持的指标项如下:
- &#x60;cpu_util&#x60;: &#x60;CPU使用率&#x60;
- &#x60;memory.usage&#x60;: &#x60;内存使用率&#x60;
- &#x60;vm.disk.bytes.read&#x60;: &#x60;磁盘读吞吐量(host)&#x60;
- &#x60;vm.disk.bytes.write&#x60;: &#x60;磁盘写吞吐量(host)&#x60;
- &#x60;vm.network.bytes.incoming&#x60;: &#x60;网络进速率(host)&#x60;
- &#x60;vm.network.bytes.outgoing&#x60;: &#x60;网络出速率(host)&#x60;

     *
     * @param metricName
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }


    /**
     * get 命名空间，仅当&#x60;metricType&#x60;为&#x60;Custom&#x60;时返回
     *
     * @return
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * set 命名空间，仅当&#x60;metricType&#x60;为&#x60;Custom&#x60;时返回
     *
     * @param namespace
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }


    /**
     * get 监控项数据统计周期，单位分钟，取值范围：[&#x60;1&#x60;,&#x60;2&#x60;,&#x60;5&#x60;,&#x60;10&#x60;,&#x60;15&#x60;,&#x60;30&#x60;,&#x60;60&#x60;]
     *
     * @return
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * set 监控项数据统计周期，单位分钟，取值范围：[&#x60;1&#x60;,&#x60;2&#x60;,&#x60;5&#x60;,&#x60;10&#x60;,&#x60;15&#x60;,&#x60;30&#x60;,&#x60;60&#x60;]
     *
     * @param period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }


    /**
     * get 统计监控项数据的方法
- 系统监控取值范围：[&#x60;avg&#x60;,&#x60;max&#x60;,&#x60;min&#x60;]
- 自定义监控取值范围：[&#x60;avg&#x60;]

     *
     * @return
     */
    public String getStatistic() {
        return statistic;
    }

    /**
     * set 统计监控项数据的方法
- 系统监控取值范围：[&#x60;avg&#x60;,&#x60;max&#x60;,&#x60;min&#x60;]
- 自定义监控取值范围：[&#x60;avg&#x60;]

     *
     * @param statistic
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }


    /**
     * get 监控指标的阈值，必须大于0，阈值单位与监控项单位一致
     *
     * @return
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * set 监控指标的阈值，必须大于0，阈值单位与监控项单位一致
     *
     * @param threshold
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }


    /**
     * get 对监控项阈值的判断方式，取值范围：[&#x60;gte&#x60;:&#x60;大于等于&#x60;,&#x60;lte&#x60;:&#x60;小于等于&#x60;,&#x60;gt&#x60;:&#x60;大于&#x60;,&#x60;lt&#x60;:&#x60;小于&#x60;]
     *
     * @return
     */
    public String getComparison() {
        return comparison;
    }

    /**
     * set 对监控项阈值的判断方式，取值范围：[&#x60;gte&#x60;:&#x60;大于等于&#x60;,&#x60;lte&#x60;:&#x60;小于等于&#x60;,&#x60;gt&#x60;:&#x60;大于&#x60;,&#x60;lt&#x60;:&#x60;小于&#x60;]
     *
     * @param comparison
     */
    public void setComparison(String comparison) {
        this.comparison = comparison;
    }


    /**
     * get 触发告警需要满足阈值表达式的次数，默认为&#x60;3&#x60;，取值范围：[&#x60;1&#x60;,&#x60;2&#x60;,&#x60;3&#x60;,&#x60;5&#x60;,&#x60;10&#x60;,&#x60;15&#x60;,&#x60;30&#x60;,&#x60;60&#x60;]
     *
     * @return
     */
    public Integer getHitCount() {
        return hitCount;
    }

    /**
     * set 触发告警需要满足阈值表达式的次数，默认为&#x60;3&#x60;，取值范围：[&#x60;1&#x60;,&#x60;2&#x60;,&#x60;3&#x60;,&#x60;5&#x60;,&#x60;10&#x60;,&#x60;15&#x60;,&#x60;30&#x60;,&#x60;60&#x60;]
     *
     * @param hitCount
     */
    public void setHitCount(Integer hitCount) {
        this.hitCount = hitCount;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 告警任务状态，取值范围如下：
- &#x60;Disabled&#x60;：已禁用
- &#x60;Normal&#x60;：正常
- &#x60;DataMissing&#x60;：监控数据不足
- &#x60;Alarm&#x60;：告警中

     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * set 告警任务状态，取值范围如下：
- &#x60;Disabled&#x60;：已禁用
- &#x60;Normal&#x60;：正常
- &#x60;DataMissing&#x60;：监控数据不足
- &#x60;Alarm&#x60;：告警中

     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }



    /**
     * set 告警任务ID
     *
     * @param asAlarmId
     */
    public AsAlarmInfoByAsRule asAlarmId(String asAlarmId) {
        this.asAlarmId = asAlarmId;
        return this;
    }


    /**
     * set 告警任务名称
     *
     * @param name
     */
    public AsAlarmInfoByAsRule name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 告警任务描述
     *
     * @param description
     */
    public AsAlarmInfoByAsRule description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 监控项类型，取值范围：[&#x60;System&#x60;,&#x60;Custom&#x60;]
     *
     * @param metricType
     */
    public AsAlarmInfoByAsRule metricType(String metricType) {
        this.metricType = metricType;
        return this;
    }


    /**
     * set 监控项，云主机监控指标说明：https://docs.jdcloud.com/cn/monitoring/vm
目前支持的指标项如下:
- &#x60;cpu_util&#x60;: &#x60;CPU使用率&#x60;
- &#x60;memory.usage&#x60;: &#x60;内存使用率&#x60;
- &#x60;vm.disk.bytes.read&#x60;: &#x60;磁盘读吞吐量(host)&#x60;
- &#x60;vm.disk.bytes.write&#x60;: &#x60;磁盘写吞吐量(host)&#x60;
- &#x60;vm.network.bytes.incoming&#x60;: &#x60;网络进速率(host)&#x60;
- &#x60;vm.network.bytes.outgoing&#x60;: &#x60;网络出速率(host)&#x60;

     *
     * @param metricName
     */
    public AsAlarmInfoByAsRule metricName(String metricName) {
        this.metricName = metricName;
        return this;
    }


    /**
     * set 命名空间，仅当&#x60;metricType&#x60;为&#x60;Custom&#x60;时返回
     *
     * @param namespace
     */
    public AsAlarmInfoByAsRule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }


    /**
     * set 监控项数据统计周期，单位分钟，取值范围：[&#x60;1&#x60;,&#x60;2&#x60;,&#x60;5&#x60;,&#x60;10&#x60;,&#x60;15&#x60;,&#x60;30&#x60;,&#x60;60&#x60;]
     *
     * @param period
     */
    public AsAlarmInfoByAsRule period(Integer period) {
        this.period = period;
        return this;
    }


    /**
     * set 统计监控项数据的方法
- 系统监控取值范围：[&#x60;avg&#x60;,&#x60;max&#x60;,&#x60;min&#x60;]
- 自定义监控取值范围：[&#x60;avg&#x60;]

     *
     * @param statistic
     */
    public AsAlarmInfoByAsRule statistic(String statistic) {
        this.statistic = statistic;
        return this;
    }


    /**
     * set 监控指标的阈值，必须大于0，阈值单位与监控项单位一致
     *
     * @param threshold
     */
    public AsAlarmInfoByAsRule threshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }


    /**
     * set 对监控项阈值的判断方式，取值范围：[&#x60;gte&#x60;:&#x60;大于等于&#x60;,&#x60;lte&#x60;:&#x60;小于等于&#x60;,&#x60;gt&#x60;:&#x60;大于&#x60;,&#x60;lt&#x60;:&#x60;小于&#x60;]
     *
     * @param comparison
     */
    public AsAlarmInfoByAsRule comparison(String comparison) {
        this.comparison = comparison;
        return this;
    }


    /**
     * set 触发告警需要满足阈值表达式的次数，默认为&#x60;3&#x60;，取值范围：[&#x60;1&#x60;,&#x60;2&#x60;,&#x60;3&#x60;,&#x60;5&#x60;,&#x60;10&#x60;,&#x60;15&#x60;,&#x60;30&#x60;,&#x60;60&#x60;]
     *
     * @param hitCount
     */
    public AsAlarmInfoByAsRule hitCount(Integer hitCount) {
        this.hitCount = hitCount;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public AsAlarmInfoByAsRule createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public AsAlarmInfoByAsRule updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 告警任务状态，取值范围如下：
- &#x60;Disabled&#x60;：已禁用
- &#x60;Normal&#x60;：正常
- &#x60;DataMissing&#x60;：监控数据不足
- &#x60;Alarm&#x60;：告警中

     *
     * @param state
     */
    public AsAlarmInfoByAsRule state(String state) {
        this.state = state;
        return this;
    }


}