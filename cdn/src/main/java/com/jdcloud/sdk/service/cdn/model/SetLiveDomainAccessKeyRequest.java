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
 * 直播域名配置类接口
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
 * 设置URL鉴权
 */
public class SetLiveDomainAccessKeyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * url鉴权开启1关闭0
     */
    private Integer accesskeyType;

    /**
     * url鉴权开启时必传
     */
    private String accesskeyKey;

    /**
     * 开启时默认值为300s,关闭时为0
     */
    private Integer authLifeTime;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;



    /**
     * get url鉴权开启1关闭0
     *
     * @return
     */
    public Integer getAccesskeyType() {
        return accesskeyType;
    }

    /**
     * set url鉴权开启1关闭0
     *
     * @param accesskeyType
     */
    public void setAccesskeyType(Integer accesskeyType) {
        this.accesskeyType = accesskeyType;
    }


    /**
     * get url鉴权开启时必传
     *
     * @return
     */
    public String getAccesskeyKey() {
        return accesskeyKey;
    }

    /**
     * set url鉴权开启时必传
     *
     * @param accesskeyKey
     */
    public void setAccesskeyKey(String accesskeyKey) {
        this.accesskeyKey = accesskeyKey;
    }


    /**
     * get 开启时默认值为300s,关闭时为0
     *
     * @return
     */
    public Integer getAuthLifeTime() {
        return authLifeTime;
    }

    /**
     * set 开启时默认值为300s,关闭时为0
     *
     * @param authLifeTime
     */
    public void setAuthLifeTime(Integer authLifeTime) {
        this.authLifeTime = authLifeTime;
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
     * set url鉴权开启1关闭0
     *
     * @param accesskeyType
     */
    public SetLiveDomainAccessKeyRequest accesskeyType(Integer accesskeyType) {
        this.accesskeyType = accesskeyType;
        return this;
    }


    /**
     * set url鉴权开启时必传
     *
     * @param accesskeyKey
     */
    public SetLiveDomainAccessKeyRequest accesskeyKey(String accesskeyKey) {
        this.accesskeyKey = accesskeyKey;
        return this;
    }


    /**
     * set 开启时默认值为300s,关闭时为0
     *
     * @param authLifeTime
     */
    public SetLiveDomainAccessKeyRequest authLifeTime(Integer authLifeTime) {
        this.authLifeTime = authLifeTime;
        return this;
    }


    /**
     * set 用户域名
     *
     * @param domain
     */
    public SetLiveDomainAccessKeyRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


}