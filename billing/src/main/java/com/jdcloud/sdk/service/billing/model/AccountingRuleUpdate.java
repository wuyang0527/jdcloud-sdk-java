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
 * accountingRuleUpdate
 */
public class AccountingRuleUpdate  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 站点
     */
    private Integer site;

    /**
     * pin
     */
    private String pin;

    /**
     * 出账类型  1：实时出账    2：定期出账
     */
    private Integer outAccountType;

    /**
     * 出账周期：限制范围 1-28
     */
    private Integer outAccountDay;

    /**
     * 定期出账  时间表达式
     */
    private String timeCron;


    /**
     * get 站点
     *
     * @return
     */
    public Integer getSite() {
        return site;
    }

    /**
     * set 站点
     *
     * @param site
     */
    public void setSite(Integer site) {
        this.site = site;
    }

    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 出账类型  1：实时出账    2：定期出账
     *
     * @return
     */
    public Integer getOutAccountType() {
        return outAccountType;
    }

    /**
     * set 出账类型  1：实时出账    2：定期出账
     *
     * @param outAccountType
     */
    public void setOutAccountType(Integer outAccountType) {
        this.outAccountType = outAccountType;
    }

    /**
     * get 出账周期：限制范围 1-28
     *
     * @return
     */
    public Integer getOutAccountDay() {
        return outAccountDay;
    }

    /**
     * set 出账周期：限制范围 1-28
     *
     * @param outAccountDay
     */
    public void setOutAccountDay(Integer outAccountDay) {
        this.outAccountDay = outAccountDay;
    }

    /**
     * get 定期出账  时间表达式
     *
     * @return
     */
    public String getTimeCron() {
        return timeCron;
    }

    /**
     * set 定期出账  时间表达式
     *
     * @param timeCron
     */
    public void setTimeCron(String timeCron) {
        this.timeCron = timeCron;
    }


    /**
     * set 站点
     *
     * @param site
     */
    public AccountingRuleUpdate site(Integer site) {
        this.site = site;
        return this;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public AccountingRuleUpdate pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 出账类型  1：实时出账    2：定期出账
     *
     * @param outAccountType
     */
    public AccountingRuleUpdate outAccountType(Integer outAccountType) {
        this.outAccountType = outAccountType;
        return this;
    }

    /**
     * set 出账周期：限制范围 1-28
     *
     * @param outAccountDay
     */
    public AccountingRuleUpdate outAccountDay(Integer outAccountDay) {
        this.outAccountDay = outAccountDay;
        return this;
    }

    /**
     * set 定期出账  时间表达式
     *
     * @param timeCron
     */
    public AccountingRuleUpdate timeCron(String timeCron) {
        this.timeCron = timeCron;
        return this;
    }


}