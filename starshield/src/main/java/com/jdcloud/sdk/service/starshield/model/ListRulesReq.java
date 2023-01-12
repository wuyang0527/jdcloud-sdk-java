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
 * listRulesReq
 */
public class ListRulesReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则类型
     */
    private String ruleType;

    /**
     * 页码，[1-100]，默认是1
     */
    private Integer pageIndex;

    /**
     * 页大小，[1-100]，默认是10
     */
    private Integer pageSize;



    /**
     * get 规则类型
     *
     * @return
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * set 规则类型
     *
     * @param ruleType
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }


    /**
     * get 页码，[1-100]，默认是1
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 页码，[1-100]，默认是1
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }


    /**
     * get 页大小，[1-100]，默认是10
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页大小，[1-100]，默认是10
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }



    /**
     * set 规则类型
     *
     * @param ruleType
     */
    public ListRulesReq ruleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }


    /**
     * set 页码，[1-100]，默认是1
     *
     * @param pageIndex
     */
    public ListRulesReq pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }


    /**
     * set 页大小，[1-100]，默认是10
     *
     * @param pageSize
     */
    public ListRulesReq pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


}