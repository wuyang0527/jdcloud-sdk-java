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

package com.jdcloud.sdk.service.autotaskpolicy.model;


/**
 * quota
 */
public class Quota  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略类型
     */
    private String policyType;

    /**
     * 配额上限
     */
    private Integer limit;

    /**
     * 已用配额
     */
    private Integer used;



    /**
     * get 策略类型
     *
     * @return
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * set 策略类型
     *
     * @param policyType
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }


    /**
     * get 配额上限
     *
     * @return
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * set 配额上限
     *
     * @param limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }


    /**
     * get 已用配额
     *
     * @return
     */
    public Integer getUsed() {
        return used;
    }

    /**
     * set 已用配额
     *
     * @param used
     */
    public void setUsed(Integer used) {
        this.used = used;
    }



    /**
     * set 策略类型
     *
     * @param policyType
     */
    public Quota policyType(String policyType) {
        this.policyType = policyType;
        return this;
    }


    /**
     * set 配额上限
     *
     * @param limit
     */
    public Quota limit(Integer limit) {
        this.limit = limit;
        return this;
    }


    /**
     * set 已用配额
     *
     * @param used
     */
    public Quota used(Integer used) {
        this.used = used;
        return this;
    }


}