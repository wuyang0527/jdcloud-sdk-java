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
 * Bot报表
 * Bot报表
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.starshield.model.RequestBotGroup;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * Bot日期直方图.
 */
public class BotDateHistogramResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 请求的Bot分组集合。
     */
    
    private List<RequestBotGroup> dataSeries;
    /**
     * 时间点集合。时间点的值为时间戳对应的long值。
     */
    
    private List<Number> timeSeries;


    /**
    * get 请求的Bot分组集合。
    *
    * @return
    */
    public List<RequestBotGroup> getDataSeries() {
        return dataSeries;
    }

    /**
    * set 请求的Bot分组集合。
    *
    * @param dataSeries
    */
    public void setDataSeries(List<RequestBotGroup> dataSeries) {
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
    * set 请求的Bot分组集合。
    *
    * @param dataSeries
    */
    public BotDateHistogramResult dataSeries(List<RequestBotGroup> dataSeries) {
        this.dataSeries = dataSeries;
        return this;
    }


    /**
    * set 时间点集合。时间点的值为时间戳对应的long值。
    *
    * @param timeSeries
    */
    public BotDateHistogramResult timeSeries(List<Number> timeSeries) {
        this.timeSeries = timeSeries;
        return this;
    }



    /**
     * add item to 请求的Bot分组集合。
     *
     * @param dataSerie
     */
    public void addDataSerie(RequestBotGroup dataSerie) {
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