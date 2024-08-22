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
 * JDCLOUD Invoice API
 * 京东云发票
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.invoice.model;

import com.jdcloud.sdk.service.invoice.model.TaxInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据产品线取税率
 */
public class GetTaxInfoResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * result
     */
    private TaxInfo result;



    /**
     * get result
     *
     * @return
     */
    public TaxInfo getResult() {
        return result;
    }

    /**
     * set result
     *
     * @param result
     */
    public void setResult(TaxInfo result) {
        this.result = result;
    }



    /**
     * set result
     *
     * @param result
     */
    public GetTaxInfoResult result(TaxInfo result) {
        this.result = result;
        return this;
    }


}