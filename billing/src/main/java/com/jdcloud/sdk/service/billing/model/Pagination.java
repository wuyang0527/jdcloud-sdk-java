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

package com.jdcloud.sdk.service.billing.model;


/**
 * pagination
 */
public class Pagination  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页
     */
    private Integer currPageNo;

    /**
     * 页数
     */
    private Integer numberPages;

    /**
     * 每页记录数
     */
    private Integer numberRecords;

    /**
     * 页面大小
     */
    private Integer pageSize;

    /**
     * 起始页
     */
    private Integer startIndex;


    /**
     * get 当前页
     *
     * @return
     */
    public Integer getCurrPageNo() {
        return currPageNo;
    }

    /**
     * set 当前页
     *
     * @param currPageNo
     */
    public void setCurrPageNo(Integer currPageNo) {
        this.currPageNo = currPageNo;
    }

    /**
     * get 页数
     *
     * @return
     */
    public Integer getNumberPages() {
        return numberPages;
    }

    /**
     * set 页数
     *
     * @param numberPages
     */
    public void setNumberPages(Integer numberPages) {
        this.numberPages = numberPages;
    }

    /**
     * get 每页记录数
     *
     * @return
     */
    public Integer getNumberRecords() {
        return numberRecords;
    }

    /**
     * set 每页记录数
     *
     * @param numberRecords
     */
    public void setNumberRecords(Integer numberRecords) {
        this.numberRecords = numberRecords;
    }

    /**
     * get 页面大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页面大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 起始页
     *
     * @return
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    /**
     * set 起始页
     *
     * @param startIndex
     */
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }


    /**
     * set 当前页
     *
     * @param currPageNo
     */
    public Pagination currPageNo(Integer currPageNo) {
        this.currPageNo = currPageNo;
        return this;
    }

    /**
     * set 页数
     *
     * @param numberPages
     */
    public Pagination numberPages(Integer numberPages) {
        this.numberPages = numberPages;
        return this;
    }

    /**
     * set 每页记录数
     *
     * @param numberRecords
     */
    public Pagination numberRecords(Integer numberRecords) {
        this.numberRecords = numberRecords;
        return this;
    }

    /**
     * set 页面大小
     *
     * @param pageSize
     */
    public Pagination pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 起始页
     *
     * @param startIndex
     */
    public Pagination startIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }


}