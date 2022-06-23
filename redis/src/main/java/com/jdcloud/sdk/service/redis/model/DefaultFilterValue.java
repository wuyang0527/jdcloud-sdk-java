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

package com.jdcloud.sdk.service.redis.model;


/**
 * 客户端性能日志默认过滤延时
 */
public class DefaultFilterValue  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * tp999
     */
    private Integer tp999;

    /**
     * tp99
     */
    private Integer tp99;

    /**
     * tp90
     */
    private Integer tp90;

    /**
     * tp50
     */
    private Integer tp50;


    /**
     * get tp999
     *
     * @return
     */
    public Integer getTp999() {
        return tp999;
    }

    /**
     * set tp999
     *
     * @param tp999
     */
    public void setTp999(Integer tp999) {
        this.tp999 = tp999;
    }

    /**
     * get tp99
     *
     * @return
     */
    public Integer getTp99() {
        return tp99;
    }

    /**
     * set tp99
     *
     * @param tp99
     */
    public void setTp99(Integer tp99) {
        this.tp99 = tp99;
    }

    /**
     * get tp90
     *
     * @return
     */
    public Integer getTp90() {
        return tp90;
    }

    /**
     * set tp90
     *
     * @param tp90
     */
    public void setTp90(Integer tp90) {
        this.tp90 = tp90;
    }

    /**
     * get tp50
     *
     * @return
     */
    public Integer getTp50() {
        return tp50;
    }

    /**
     * set tp50
     *
     * @param tp50
     */
    public void setTp50(Integer tp50) {
        this.tp50 = tp50;
    }


    /**
     * set tp999
     *
     * @param tp999
     */
    public DefaultFilterValue tp999(Integer tp999) {
        this.tp999 = tp999;
        return this;
    }

    /**
     * set tp99
     *
     * @param tp99
     */
    public DefaultFilterValue tp99(Integer tp99) {
        this.tp99 = tp99;
        return this;
    }

    /**
     * set tp90
     *
     * @param tp90
     */
    public DefaultFilterValue tp90(Integer tp90) {
        this.tp90 = tp90;
        return this;
    }

    /**
     * set tp50
     *
     * @param tp50
     */
    public DefaultFilterValue tp50(Integer tp50) {
        this.tp50 = tp50;
        return this;
    }


}