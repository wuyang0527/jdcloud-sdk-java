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
 * Quota
 * 关于高可用组配额的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ag.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ag.model.Quota;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询(ag)配额
 */
public class DescribeQuotasResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * quotas
     */
    
    private List<Quota> quotas;


    /**
    * get quotas
    *
    * @return
    */
    public List<Quota> getQuotas() {
        return quotas;
    }

    /**
    * set quotas
    *
    * @param quotas
    */
    public void setQuotas(List<Quota> quotas) {
        this.quotas = quotas;
    }



    /**
    * set quotas
    *
    * @param quotas
    */
    public DescribeQuotasResult quotas(List<Quota> quotas) {
        this.quotas = quotas;
        return this;
    }



    /**
     * add item to quotas
     *
     * @param quota
     */
    public void addQuota(Quota quota) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quota);
    }
}