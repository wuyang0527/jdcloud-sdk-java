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
 * Anti DDoS Pro Web Rule Configuration APIs
 * Anti DDoS Pro Web Rule Configuration APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ipanti.model.CCProtectionRule;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询网站类规则的 CC 防护规则列表
 */
public class DescribeCCProtectionRulesOfWebRuleResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dataList
     */
    private List<CCProtectionRule> dataList;

    /**
     * 当前页数量
     */
    private Long currentCount;

    /**
     * 总数
     */
    private Long totalCount;

    /**
     * 总页数
     */
    private Long totalPage;


    /**
     * get dataList
     *
     * @return
     */
    public List<CCProtectionRule> getDataList() {
        return dataList;
    }

    /**
     * set dataList
     *
     * @param dataList
     */
    public void setDataList(List<CCProtectionRule> dataList) {
        this.dataList = dataList;
    }

    /**
     * get 当前页数量
     *
     * @return
     */
    public Long getCurrentCount() {
        return currentCount;
    }

    /**
     * set 当前页数量
     *
     * @param currentCount
     */
    public void setCurrentCount(Long currentCount) {
        this.currentCount = currentCount;
    }

    /**
     * get 总数
     *
     * @return
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数
     *
     * @param totalCount
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get 总页数
     *
     * @return
     */
    public Long getTotalPage() {
        return totalPage;
    }

    /**
     * set 总页数
     *
     * @param totalPage
     */
    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }


    /**
     * set dataList
     *
     * @param dataList
     */
    public DescribeCCProtectionRulesOfWebRuleResult dataList(List<CCProtectionRule> dataList) {
        this.dataList = dataList;
        return this;
    }

    /**
     * set 当前页数量
     *
     * @param currentCount
     */
    public DescribeCCProtectionRulesOfWebRuleResult currentCount(Long currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set 总数
     *
     * @param totalCount
     */
    public DescribeCCProtectionRulesOfWebRuleResult totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set 总页数
     *
     * @param totalPage
     */
    public DescribeCCProtectionRulesOfWebRuleResult totalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }


    /**
     * add item to dataList
     *
     * @param dataList
     */
    public void addDataList(CCProtectionRule dataList) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataList);
    }

}