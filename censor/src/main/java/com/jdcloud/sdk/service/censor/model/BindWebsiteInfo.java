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

package com.jdcloud.sdk.service.censor.model;


/**
 * bindWebsiteInfo
 */
public class BindWebsiteInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 协议，http或https
     */
    private String scheme;

    /**
     * 域名，不含协议
     */
    private String host;

    /**
     * 全站检测频率，1d-1天，7d-7天
     */
    private String hostInterval;

    /**
     * 完整的首页地址
     */
    private String homePage;

    /**
     * 首页检测间隔，eg:1h表示一小时，必须为整小时
     */
    private String homePageInterval;


    /**
     * get 协议，http或https
     *
     * @return
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * set 协议，http或https
     *
     * @param scheme
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * get 域名，不含协议
     *
     * @return
     */
    public String getHost() {
        return host;
    }

    /**
     * set 域名，不含协议
     *
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * get 全站检测频率，1d-1天，7d-7天
     *
     * @return
     */
    public String getHostInterval() {
        return hostInterval;
    }

    /**
     * set 全站检测频率，1d-1天，7d-7天
     *
     * @param hostInterval
     */
    public void setHostInterval(String hostInterval) {
        this.hostInterval = hostInterval;
    }

    /**
     * get 完整的首页地址
     *
     * @return
     */
    public String getHomePage() {
        return homePage;
    }

    /**
     * set 完整的首页地址
     *
     * @param homePage
     */
    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    /**
     * get 首页检测间隔，eg:1h表示一小时，必须为整小时
     *
     * @return
     */
    public String getHomePageInterval() {
        return homePageInterval;
    }

    /**
     * set 首页检测间隔，eg:1h表示一小时，必须为整小时
     *
     * @param homePageInterval
     */
    public void setHomePageInterval(String homePageInterval) {
        this.homePageInterval = homePageInterval;
    }


    /**
     * set 协议，http或https
     *
     * @param scheme
     */
    public BindWebsiteInfo scheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * set 域名，不含协议
     *
     * @param host
     */
    public BindWebsiteInfo host(String host) {
        this.host = host;
        return this;
    }

    /**
     * set 全站检测频率，1d-1天，7d-7天
     *
     * @param hostInterval
     */
    public BindWebsiteInfo hostInterval(String hostInterval) {
        this.hostInterval = hostInterval;
        return this;
    }

    /**
     * set 完整的首页地址
     *
     * @param homePage
     */
    public BindWebsiteInfo homePage(String homePage) {
        this.homePage = homePage;
        return this;
    }

    /**
     * set 首页检测间隔，eg:1h表示一小时，必须为整小时
     *
     * @param homePageInterval
     */
    public BindWebsiteInfo homePageInterval(String homePageInterval) {
        this.homePageInterval = homePageInterval;
        return this;
    }


}