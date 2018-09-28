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

package com.jdcloud.sdk.service.billing.model;


/**
 * formula
 */
public class Formula  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 计费项别名
     */
    private String key;

    /**
     * 用量
     */
    private Double value;

    /**
     * 单位
     */
    private String unit;

    /**
     * 计费项数量
     */
    private Double number;


    /**
     * get 计费项别名
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 计费项别名
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * get 用量
     *
     * @return
     */
    public Double getValue() {
        return value;
    }

    /**
     * set 用量
     *
     * @param value
     */
    public void setValue(Double value) {
        this.value = value;
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
     * get 计费项数量
     *
     * @return
     */
    public Double getNumber() {
        return number;
    }

    /**
     * set 计费项数量
     *
     * @param number
     */
    public void setNumber(Double number) {
        this.number = number;
    }


    /**
     * set 计费项别名
     *
     * @param key
     */
    public Formula key(String key) {
        this.key = key;
        return this;
    }

    /**
     * set 用量
     *
     * @param value
     */
    public Formula value(Double value) {
        this.value = value;
        return this;
    }

    /**
     * set 单位
     *
     * @param unit
     */
    public Formula unit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * set 计费项数量
     *
     * @param number
     */
    public Formula number(Double number) {
        this.number = number;
        return this;
    }


}