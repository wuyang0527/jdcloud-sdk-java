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
 * 报表日志类接口
 * 京东云WAF-OpenAPI报表日志类接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.waf.model.GetChartReq;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取网站在一定时间内的qps信息。
 */
public class GetQpsDataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 请求
     * Required:true
     */
    @Required
    private GetChartReq req;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 请求
     *
     * @return
     */
    public GetChartReq getReq() {
        return req;
    }

    /**
     * set 请求
     *
     * @param req
     */
    public void setReq(GetChartReq req) {
        this.req = req;
    }

    /**
     * get 实例所属的地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 请求
     *
     * @param req
     */
    public GetQpsDataRequest req(GetChartReq req) {
        this.req = req;
        return this;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public GetQpsDataRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}