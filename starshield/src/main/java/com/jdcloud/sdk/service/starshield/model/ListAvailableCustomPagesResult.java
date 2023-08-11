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
 * Custom-Pages-for-a-Zone
 * Custom pages associated with a zone
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.starshield.model.CustomPage;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 域可以使用的可用自定义页面列表
 */
public class ListAvailableCustomPagesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dataList
     */
    
    private List<CustomPage> dataList;
    /**
     * 当前页记录数量
     */
    private Integer currentCount;

    /**
     * 总记录数量
     */
    private Integer totalCount;

    /**
     * 总页数
     */
    private Integer totalPage;



    /**
    * get dataList
    *
    * @return
    */
    public List<CustomPage> getDataList() {
        return dataList;
    }

    /**
    * set dataList
    *
    * @param dataList
    */
    public void setDataList(List<CustomPage> dataList) {
        this.dataList = dataList;
    }


    /**
     * get 当前页记录数量
     *
     * @return
     */
    public Integer getCurrentCount() {
        return currentCount;
    }

    /**
     * set 当前页记录数量
     *
     * @param currentCount
     */
    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }


    /**
     * get 总记录数量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总记录数量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * get 总页数
     *
     * @return
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * set 总页数
     *
     * @param totalPage
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }



    /**
    * set dataList
    *
    * @param dataList
    */
    public ListAvailableCustomPagesResult dataList(List<CustomPage> dataList) {
        this.dataList = dataList;
        return this;
    }


    /**
     * set 当前页记录数量
     *
     * @param currentCount
     */
    public ListAvailableCustomPagesResult currentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }


    /**
     * set 总记录数量
     *
     * @param totalCount
     */
    public ListAvailableCustomPagesResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * set 总页数
     *
     * @param totalPage
     */
    public ListAvailableCustomPagesResult totalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }



    /**
     * add item to dataList
     *
     * @param dataList
     */
    public void addDataList(CustomPage dataList) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataList);
    }
}