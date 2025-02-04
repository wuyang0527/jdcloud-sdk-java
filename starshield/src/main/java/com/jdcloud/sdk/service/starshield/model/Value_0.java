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

package com.jdcloud.sdk.service.starshield.model;


/**
 * value_0
 */
public class Value_0  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否启用移动重定向
     */
    private String status;

    /**
     * 你希望将移动设备上的访客重定向到哪个子域前缀（子域必须已经存在）。
     */
    private String mobile_subdomain;

    /**
     * 是放弃当前页面路径并重定向到移动子域的URL根，还是保留路径并重定向到移动子域的同一页面
     */
    private Boolean strip_uri;


    /**
     * get 是否启用移动重定向
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 是否启用移动重定向
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 你希望将移动设备上的访客重定向到哪个子域前缀（子域必须已经存在）。
     *
     * @return
     */
    public String getMobile_subdomain() {
        return mobile_subdomain;
    }

    /**
     * set 你希望将移动设备上的访客重定向到哪个子域前缀（子域必须已经存在）。
     *
     * @param mobile_subdomain
     */
    public void setMobile_subdomain(String mobile_subdomain) {
        this.mobile_subdomain = mobile_subdomain;
    }

    /**
     * get 是放弃当前页面路径并重定向到移动子域的URL根，还是保留路径并重定向到移动子域的同一页面
     *
     * @return
     */
    public Boolean getStrip_uri() {
        return strip_uri;
    }

    /**
     * set 是放弃当前页面路径并重定向到移动子域的URL根，还是保留路径并重定向到移动子域的同一页面
     *
     * @param strip_uri
     */
    public void setStrip_uri(Boolean strip_uri) {
        this.strip_uri = strip_uri;
    }


    /**
     * set 是否启用移动重定向
     *
     * @param status
     */
    public Value_0 status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 你希望将移动设备上的访客重定向到哪个子域前缀（子域必须已经存在）。
     *
     * @param mobile_subdomain
     */
    public Value_0 mobile_subdomain(String mobile_subdomain) {
        this.mobile_subdomain = mobile_subdomain;
        return this;
    }

    /**
     * set 是放弃当前页面路径并重定向到移动子域的URL根，还是保留路径并重定向到移动子域的同一页面
     *
     * @param strip_uri
     */
    public Value_0 strip_uri(Boolean strip_uri) {
        this.strip_uri = strip_uri;
        return this;
    }


}