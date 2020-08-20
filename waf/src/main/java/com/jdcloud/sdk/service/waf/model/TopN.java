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

package com.jdcloud.sdk.service.waf.model;


/**
 * topN
 */
public class TopN  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * addr_top10
     */
    private TopValue addr_top10;

    /**
     * area_top10
     */
    private TopValue area_top10;

    /**
     * url_top10
     */
    private TopValue url_top10;

    /**
     * ua_top10
     */
    private TopValue ua_top10;


    /**
     * get addr_top10
     *
     * @return
     */
    public TopValue getAddr_top10() {
        return addr_top10;
    }

    /**
     * set addr_top10
     *
     * @param addr_top10
     */
    public void setAddr_top10(TopValue addr_top10) {
        this.addr_top10 = addr_top10;
    }

    /**
     * get area_top10
     *
     * @return
     */
    public TopValue getArea_top10() {
        return area_top10;
    }

    /**
     * set area_top10
     *
     * @param area_top10
     */
    public void setArea_top10(TopValue area_top10) {
        this.area_top10 = area_top10;
    }

    /**
     * get url_top10
     *
     * @return
     */
    public TopValue getUrl_top10() {
        return url_top10;
    }

    /**
     * set url_top10
     *
     * @param url_top10
     */
    public void setUrl_top10(TopValue url_top10) {
        this.url_top10 = url_top10;
    }

    /**
     * get ua_top10
     *
     * @return
     */
    public TopValue getUa_top10() {
        return ua_top10;
    }

    /**
     * set ua_top10
     *
     * @param ua_top10
     */
    public void setUa_top10(TopValue ua_top10) {
        this.ua_top10 = ua_top10;
    }


    /**
     * set addr_top10
     *
     * @param addr_top10
     */
    public TopN addr_top10(TopValue addr_top10) {
        this.addr_top10 = addr_top10;
        return this;
    }

    /**
     * set area_top10
     *
     * @param area_top10
     */
    public TopN area_top10(TopValue area_top10) {
        this.area_top10 = area_top10;
        return this;
    }

    /**
     * set url_top10
     *
     * @param url_top10
     */
    public TopN url_top10(TopValue url_top10) {
        this.url_top10 = url_top10;
        return this;
    }

    /**
     * set ua_top10
     *
     * @param ua_top10
     */
    public TopN ua_top10(TopValue ua_top10) {
        this.ua_top10 = ua_top10;
        return this;
    }


}