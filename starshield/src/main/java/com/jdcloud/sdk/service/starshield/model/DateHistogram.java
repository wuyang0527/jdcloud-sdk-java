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
 * dateHistogram
 */
public class DateHistogram  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * name
     */
    private String name;

    /**
     * timeseries
     */
    private List<Number> timeseries;

    /**
     * unit
     */
    private String unit;

    /**
     * total
     */
    private Number total;


    /**
     * get name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get timeseries
     *
     * @return
     */
    public List<Number> getTimeseries() {
        return timeseries;
    }

    /**
     * set timeseries
     *
     * @param timeseries
     */
    public void setTimeseries(List<Number> timeseries) {
        this.timeseries = timeseries;
    }

    /**
     * get unit
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set unit
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * get total
     *
     * @return
     */
    public Number getTotal() {
        return total;
    }

    /**
     * set total
     *
     * @param total
     */
    public void setTotal(Number total) {
        this.total = total;
    }


    /**
     * set name
     *
     * @param name
     */
    public DateHistogram name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set timeseries
     *
     * @param timeseries
     */
    public DateHistogram timeseries(List<Number> timeseries) {
        this.timeseries = timeseries;
        return this;
    }

    /**
     * set unit
     *
     * @param unit
     */
    public DateHistogram unit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * set total
     *
     * @param total
     */
    public DateHistogram total(Number total) {
        this.total = total;
        return this;
    }


    /**
     * add item to timeseries
     *
     * @param timeserie
     */
    public void addTimeserie(Number timeserie) {
        if (this.timeseries == null) {
            this.timeseries = new ArrayList<>();
        }
        this.timeseries.add(timeserie);
    }

}