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

package com.jdcloud.sdk.service.waf.model;


/**
 * filterSenseConf
 */
public class FilterSenseConf  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否使能 0表示否
     */
    private Integer enable;

    /**
     * 响应码条数  即将废弃
     */
    private Integer respCodeNum;

    /**
     * 敏感信息条数
     */
    private Integer senseinfoNum;

    /**
     * 总条数
     */
    private Integer total;


    /**
     * get 是否使能 0表示否
     *
     * @return
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * set 是否使能 0表示否
     *
     * @param enable
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * get 响应码条数  即将废弃
     *
     * @return
     */
    public Integer getRespCodeNum() {
        return respCodeNum;
    }

    /**
     * set 响应码条数  即将废弃
     *
     * @param respCodeNum
     */
    public void setRespCodeNum(Integer respCodeNum) {
        this.respCodeNum = respCodeNum;
    }

    /**
     * get 敏感信息条数
     *
     * @return
     */
    public Integer getSenseinfoNum() {
        return senseinfoNum;
    }

    /**
     * set 敏感信息条数
     *
     * @param senseinfoNum
     */
    public void setSenseinfoNum(Integer senseinfoNum) {
        this.senseinfoNum = senseinfoNum;
    }

    /**
     * get 总条数
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * set 总条数
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }


    /**
     * set 是否使能 0表示否
     *
     * @param enable
     */
    public FilterSenseConf enable(Integer enable) {
        this.enable = enable;
        return this;
    }

    /**
     * set 响应码条数  即将废弃
     *
     * @param respCodeNum
     */
    public FilterSenseConf respCodeNum(Integer respCodeNum) {
        this.respCodeNum = respCodeNum;
        return this;
    }

    /**
     * set 敏感信息条数
     *
     * @param senseinfoNum
     */
    public FilterSenseConf senseinfoNum(Integer senseinfoNum) {
        this.senseinfoNum = senseinfoNum;
        return this;
    }

    /**
     * set 总条数
     *
     * @param total
     */
    public FilterSenseConf total(Integer total) {
        this.total = total;
        return this;
    }


}