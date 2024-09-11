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

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;

/**
 * paDateHistogram
 */
public class PaDateHistogram  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 对于获取流量类统计信息的接口，该和表示符合查询条件的流量总和，单位Byte

     */
    private Double sum;

    /**
     * 对于获取带宽类统计信息的接口，该最大值表示符合查询条件的最大带宽，单位bps（bit per second）

     */
    private Double max;

    /**
     * 对于获取带宽类统计信息的接口，该时间戳表示符合查询条件的最大带宽的发生时刻

     */
    private Number maxTimestamp;

    /**
     * 数据点集合。
如果是带宽，数据点的单位是bps（bit per second）
如果是流量，数据点的单位是Byte

     */
    
    private List<Double> dataSeries;
    /**
     * 时间点集合。时间点的值为时间戳对应的long值。
     */
    
    private List<Number> timeSeries;


    /**
     * get 对于获取流量类统计信息的接口，该和表示符合查询条件的流量总和，单位Byte

     *
     * @return
     */
    public Double getSum() {
        return sum;
    }

    /**
     * set 对于获取流量类统计信息的接口，该和表示符合查询条件的流量总和，单位Byte

     *
     * @param sum
     */
    public void setSum(Double sum) {
        this.sum = sum;
    }


    /**
     * get 对于获取带宽类统计信息的接口，该最大值表示符合查询条件的最大带宽，单位bps（bit per second）

     *
     * @return
     */
    public Double getMax() {
        return max;
    }

    /**
     * set 对于获取带宽类统计信息的接口，该最大值表示符合查询条件的最大带宽，单位bps（bit per second）

     *
     * @param max
     */
    public void setMax(Double max) {
        this.max = max;
    }


    /**
     * get 对于获取带宽类统计信息的接口，该时间戳表示符合查询条件的最大带宽的发生时刻

     *
     * @return
     */
    public Number getMaxTimestamp() {
        return maxTimestamp;
    }

    /**
     * set 对于获取带宽类统计信息的接口，该时间戳表示符合查询条件的最大带宽的发生时刻

     *
     * @param maxTimestamp
     */
    public void setMaxTimestamp(Number maxTimestamp) {
        this.maxTimestamp = maxTimestamp;
    }


    /**
    * get 数据点集合。
如果是带宽，数据点的单位是bps（bit per second）
如果是流量，数据点的单位是Byte

    *
    * @return
    */
    public List<Double> getDataSeries() {
        return dataSeries;
    }

    /**
    * set 数据点集合。
如果是带宽，数据点的单位是bps（bit per second）
如果是流量，数据点的单位是Byte

    *
    * @param dataSeries
    */
    public void setDataSeries(List<Double> dataSeries) {
        this.dataSeries = dataSeries;
    }


    /**
    * get 时间点集合。时间点的值为时间戳对应的long值。
    *
    * @return
    */
    public List<Number> getTimeSeries() {
        return timeSeries;
    }

    /**
    * set 时间点集合。时间点的值为时间戳对应的long值。
    *
    * @param timeSeries
    */
    public void setTimeSeries(List<Number> timeSeries) {
        this.timeSeries = timeSeries;
    }



    /**
     * set 对于获取流量类统计信息的接口，该和表示符合查询条件的流量总和，单位Byte

     *
     * @param sum
     */
    public PaDateHistogram sum(Double sum) {
        this.sum = sum;
        return this;
    }


    /**
     * set 对于获取带宽类统计信息的接口，该最大值表示符合查询条件的最大带宽，单位bps（bit per second）

     *
     * @param max
     */
    public PaDateHistogram max(Double max) {
        this.max = max;
        return this;
    }


    /**
     * set 对于获取带宽类统计信息的接口，该时间戳表示符合查询条件的最大带宽的发生时刻

     *
     * @param maxTimestamp
     */
    public PaDateHistogram maxTimestamp(Number maxTimestamp) {
        this.maxTimestamp = maxTimestamp;
        return this;
    }


    /**
    * set 数据点集合。
如果是带宽，数据点的单位是bps（bit per second）
如果是流量，数据点的单位是Byte

    *
    * @param dataSeries
    */
    public PaDateHistogram dataSeries(List<Double> dataSeries) {
        this.dataSeries = dataSeries;
        return this;
    }


    /**
    * set 时间点集合。时间点的值为时间戳对应的long值。
    *
    * @param timeSeries
    */
    public PaDateHistogram timeSeries(List<Number> timeSeries) {
        this.timeSeries = timeSeries;
        return this;
    }



    /**
     * add item to 数据点集合。
如果是带宽，数据点的单位是bps（bit per second）
如果是流量，数据点的单位是Byte

     *
     * @param dataSerie
     */
    public void addDataSerie(Double dataSerie) {
        if (this.dataSeries == null) {
            this.dataSeries = new ArrayList<>();
        }
        this.dataSeries.add(dataSerie);
    }

    /**
     * add item to 时间点集合。时间点的值为时间戳对应的long值。
     *
     * @param timeSerie
     */
    public void addTimeSerie(Number timeSerie) {
        if (this.timeSeries == null) {
            this.timeSeries = new ArrayList<>();
        }
        this.timeSeries.add(timeSerie);
    }
}