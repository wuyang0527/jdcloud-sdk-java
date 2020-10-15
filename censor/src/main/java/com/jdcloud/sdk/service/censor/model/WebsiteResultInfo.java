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

import java.util.List;
import java.util.ArrayList;

/**
 * websiteResultInfo
 */
public class WebsiteResultInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String websiteInstanceId;

    /**
     * 域名，不含协议
     */
    private String host;

    /**
     * 总量
     */
    private Integer totalCount;

    /**
     * 高风险数
     */
    private Integer highRisk;

    /**
     * 中风险数
     */
    private Integer mediumRisk;

    /**
     * 低风险数
     */
    private Integer lowRisk;

    /**
     * 未处理数
     */
    private Integer pending;

    /**
     * 实例检测详情
     */
    private List<WebsiteRiskLog> list;


    /**
     * get 实例ID
     *
     * @return
     */
    public String getWebsiteInstanceId() {
        return websiteInstanceId;
    }

    /**
     * set 实例ID
     *
     * @param websiteInstanceId
     */
    public void setWebsiteInstanceId(String websiteInstanceId) {
        this.websiteInstanceId = websiteInstanceId;
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
     * get 总量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get 高风险数
     *
     * @return
     */
    public Integer getHighRisk() {
        return highRisk;
    }

    /**
     * set 高风险数
     *
     * @param highRisk
     */
    public void setHighRisk(Integer highRisk) {
        this.highRisk = highRisk;
    }

    /**
     * get 中风险数
     *
     * @return
     */
    public Integer getMediumRisk() {
        return mediumRisk;
    }

    /**
     * set 中风险数
     *
     * @param mediumRisk
     */
    public void setMediumRisk(Integer mediumRisk) {
        this.mediumRisk = mediumRisk;
    }

    /**
     * get 低风险数
     *
     * @return
     */
    public Integer getLowRisk() {
        return lowRisk;
    }

    /**
     * set 低风险数
     *
     * @param lowRisk
     */
    public void setLowRisk(Integer lowRisk) {
        this.lowRisk = lowRisk;
    }

    /**
     * get 未处理数
     *
     * @return
     */
    public Integer getPending() {
        return pending;
    }

    /**
     * set 未处理数
     *
     * @param pending
     */
    public void setPending(Integer pending) {
        this.pending = pending;
    }

    /**
     * get 实例检测详情
     *
     * @return
     */
    public List<WebsiteRiskLog> getList() {
        return list;
    }

    /**
     * set 实例检测详情
     *
     * @param list
     */
    public void setList(List<WebsiteRiskLog> list) {
        this.list = list;
    }


    /**
     * set 实例ID
     *
     * @param websiteInstanceId
     */
    public WebsiteResultInfo websiteInstanceId(String websiteInstanceId) {
        this.websiteInstanceId = websiteInstanceId;
        return this;
    }

    /**
     * set 域名，不含协议
     *
     * @param host
     */
    public WebsiteResultInfo host(String host) {
        this.host = host;
        return this;
    }

    /**
     * set 总量
     *
     * @param totalCount
     */
    public WebsiteResultInfo totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set 高风险数
     *
     * @param highRisk
     */
    public WebsiteResultInfo highRisk(Integer highRisk) {
        this.highRisk = highRisk;
        return this;
    }

    /**
     * set 中风险数
     *
     * @param mediumRisk
     */
    public WebsiteResultInfo mediumRisk(Integer mediumRisk) {
        this.mediumRisk = mediumRisk;
        return this;
    }

    /**
     * set 低风险数
     *
     * @param lowRisk
     */
    public WebsiteResultInfo lowRisk(Integer lowRisk) {
        this.lowRisk = lowRisk;
        return this;
    }

    /**
     * set 未处理数
     *
     * @param pending
     */
    public WebsiteResultInfo pending(Integer pending) {
        this.pending = pending;
        return this;
    }

    /**
     * set 实例检测详情
     *
     * @param list
     */
    public WebsiteResultInfo list(List<WebsiteRiskLog> list) {
        this.list = list;
        return this;
    }


    /**
     * add item to 实例检测详情
     *
     * @param list
     */
    public void addList(WebsiteRiskLog list) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(list);
    }

}