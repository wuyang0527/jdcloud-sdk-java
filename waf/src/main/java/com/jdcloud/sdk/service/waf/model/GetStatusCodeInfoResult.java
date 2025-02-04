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
 * Data-Chart
 * Data-Chart API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.service.waf.model.StatusCodeData;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取网站在一定时间内的状态码报表信息。
 */
public class GetStatusCodeInfoResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 状态码TopN
     */
    private StatusCodeData statusCodeData;


    /**
     * get 状态码TopN
     *
     * @return
     */
    public StatusCodeData getStatusCodeData() {
        return statusCodeData;
    }

    /**
     * set 状态码TopN
     *
     * @param statusCodeData
     */
    public void setStatusCodeData(StatusCodeData statusCodeData) {
        this.statusCodeData = statusCodeData;
    }


    /**
     * set 状态码TopN
     *
     * @param statusCodeData
     */
    public GetStatusCodeInfoResult statusCodeData(StatusCodeData statusCodeData) {
        this.statusCodeData = statusCodeData;
        return this;
    }


}