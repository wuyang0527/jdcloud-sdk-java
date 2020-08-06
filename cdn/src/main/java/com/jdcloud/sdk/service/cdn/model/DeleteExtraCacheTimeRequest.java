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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除异常码缓存时间
 */
public class DeleteExtraCacheTimeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 异常状态码 [&quot;4xx&quot;,&quot;400&quot;, &quot;401&quot;,  &quot;402&quot;, &quot;404&quot;, &quot;405&quot;, &quot;406&quot;, &quot;407&quot;, &quot;408&quot;, &quot;409&quot;, &quot;410&quot;, &quot;411&quot;, &quot;412&quot;, &quot;413&quot;, &quot;414&quot;, &quot;415&quot;, &quot;416&quot;, &quot;417&quot;,  &quot;5xx&quot;,&quot;500&quot;, &quot;501&quot;, &quot;502&quot;, &quot;503&quot;, &quot;504&quot;, &quot;505&quot;]中的其中一个
     */
    private String httpCode;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;


    /**
     * get 异常状态码 [&quot;4xx&quot;,&quot;400&quot;, &quot;401&quot;,  &quot;402&quot;, &quot;404&quot;, &quot;405&quot;, &quot;406&quot;, &quot;407&quot;, &quot;408&quot;, &quot;409&quot;, &quot;410&quot;, &quot;411&quot;, &quot;412&quot;, &quot;413&quot;, &quot;414&quot;, &quot;415&quot;, &quot;416&quot;, &quot;417&quot;,  &quot;5xx&quot;,&quot;500&quot;, &quot;501&quot;, &quot;502&quot;, &quot;503&quot;, &quot;504&quot;, &quot;505&quot;]中的其中一个
     *
     * @return
     */
    public String getHttpCode() {
        return httpCode;
    }

    /**
     * set 异常状态码 [&quot;4xx&quot;,&quot;400&quot;, &quot;401&quot;,  &quot;402&quot;, &quot;404&quot;, &quot;405&quot;, &quot;406&quot;, &quot;407&quot;, &quot;408&quot;, &quot;409&quot;, &quot;410&quot;, &quot;411&quot;, &quot;412&quot;, &quot;413&quot;, &quot;414&quot;, &quot;415&quot;, &quot;416&quot;, &quot;417&quot;,  &quot;5xx&quot;,&quot;500&quot;, &quot;501&quot;, &quot;502&quot;, &quot;503&quot;, &quot;504&quot;, &quot;505&quot;]中的其中一个
     *
     * @param httpCode
     */
    public void setHttpCode(String httpCode) {
        this.httpCode = httpCode;
    }

    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * set 异常状态码 [&quot;4xx&quot;,&quot;400&quot;, &quot;401&quot;,  &quot;402&quot;, &quot;404&quot;, &quot;405&quot;, &quot;406&quot;, &quot;407&quot;, &quot;408&quot;, &quot;409&quot;, &quot;410&quot;, &quot;411&quot;, &quot;412&quot;, &quot;413&quot;, &quot;414&quot;, &quot;415&quot;, &quot;416&quot;, &quot;417&quot;,  &quot;5xx&quot;,&quot;500&quot;, &quot;501&quot;, &quot;502&quot;, &quot;503&quot;, &quot;504&quot;, &quot;505&quot;]中的其中一个
     *
     * @param httpCode
     */
    public DeleteExtraCacheTimeRequest httpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public DeleteExtraCacheTimeRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


}