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
 * 机柜概览
 */
public class CabinetOverview  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机柜总数目
     */
    private Integer sum;

    /**
     * 已开通机柜数目
     */
    private Integer enabled;

    /**
     * 未开通机柜数目
     */
    private Integer disabled;

    /**
     * 开通中机柜数目
     */
    private Integer enabling;

    /**
     * 关闭中机柜数目
     */
    private Integer disabling;



    /**
     * get 机柜总数目
     *
     * @return
     */
    public Integer getSum() {
        return sum;
    }

    /**
     * set 机柜总数目
     *
     * @param sum
     */
    public void setSum(Integer sum) {
        this.sum = sum;
    }


    /**
     * get 已开通机柜数目
     *
     * @return
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * set 已开通机柜数目
     *
     * @param enabled
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }


    /**
     * get 未开通机柜数目
     *
     * @return
     */
    public Integer getDisabled() {
        return disabled;
    }

    /**
     * set 未开通机柜数目
     *
     * @param disabled
     */
    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }


    /**
     * get 开通中机柜数目
     *
     * @return
     */
    public Integer getEnabling() {
        return enabling;
    }

    /**
     * set 开通中机柜数目
     *
     * @param enabling
     */
    public void setEnabling(Integer enabling) {
        this.enabling = enabling;
    }


    /**
     * get 关闭中机柜数目
     *
     * @return
     */
    public Integer getDisabling() {
        return disabling;
    }

    /**
     * set 关闭中机柜数目
     *
     * @param disabling
     */
    public void setDisabling(Integer disabling) {
        this.disabling = disabling;
    }



    /**
     * set 机柜总数目
     *
     * @param sum
     */
    public CabinetOverview sum(Integer sum) {
        this.sum = sum;
        return this;
    }


    /**
     * set 已开通机柜数目
     *
     * @param enabled
     */
    public CabinetOverview enabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }


    /**
     * set 未开通机柜数目
     *
     * @param disabled
     */
    public CabinetOverview disabled(Integer disabled) {
        this.disabled = disabled;
        return this;
    }


    /**
     * set 开通中机柜数目
     *
     * @param enabling
     */
    public CabinetOverview enabling(Integer enabling) {
        this.enabling = enabling;
        return this;
    }


    /**
     * set 关闭中机柜数目
     *
     * @param disabling
     */
    public CabinetOverview disabling(Integer disabling) {
        this.disabling = disabling;
        return this;
    }


}