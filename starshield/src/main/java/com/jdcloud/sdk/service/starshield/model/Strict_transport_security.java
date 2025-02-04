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
 * strict_transport_security
 */
public class Strict_transport_security  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否启用了严格传输安全
     */
    private Boolean enabled;

    /**
     * 严格传输安全的最大时间（秒）。
     */
    private Number max_age;

    /**
     * 包括所有子域，以保证严格传输安全
     */
    private Boolean include_subdomains;

    /**
     * 是否包含&#39;X-Content-Type-Options.. nosniff&#39;头
     */
    private Boolean nosniff;


    /**
     * get 是否启用了严格传输安全
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用了严格传输安全
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * get 严格传输安全的最大时间（秒）。
     *
     * @return
     */
    public Number getMax_age() {
        return max_age;
    }

    /**
     * set 严格传输安全的最大时间（秒）。
     *
     * @param max_age
     */
    public void setMax_age(Number max_age) {
        this.max_age = max_age;
    }

    /**
     * get 包括所有子域，以保证严格传输安全
     *
     * @return
     */
    public Boolean getInclude_subdomains() {
        return include_subdomains;
    }

    /**
     * set 包括所有子域，以保证严格传输安全
     *
     * @param include_subdomains
     */
    public void setInclude_subdomains(Boolean include_subdomains) {
        this.include_subdomains = include_subdomains;
    }

    /**
     * get 是否包含&#39;X-Content-Type-Options.. nosniff&#39;头
     *
     * @return
     */
    public Boolean getNosniff() {
        return nosniff;
    }

    /**
     * set 是否包含&#39;X-Content-Type-Options.. nosniff&#39;头
     *
     * @param nosniff
     */
    public void setNosniff(Boolean nosniff) {
        this.nosniff = nosniff;
    }


    /**
     * set 是否启用了严格传输安全
     *
     * @param enabled
     */
    public Strict_transport_security enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 严格传输安全的最大时间（秒）。
     *
     * @param max_age
     */
    public Strict_transport_security max_age(Number max_age) {
        this.max_age = max_age;
        return this;
    }

    /**
     * set 包括所有子域，以保证严格传输安全
     *
     * @param include_subdomains
     */
    public Strict_transport_security include_subdomains(Boolean include_subdomains) {
        this.include_subdomains = include_subdomains;
        return this;
    }

    /**
     * set 是否包含&#39;X-Content-Type-Options.. nosniff&#39;头
     *
     * @param nosniff
     */
    public Strict_transport_security nosniff(Boolean nosniff) {
        this.nosniff = nosniff;
        return this;
    }


}