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

package com.jdcloud.sdk.service.domainservice.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * recordsReqs
 */
public class RecordsReqs  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 解析记录的结构
     * Required:true
     */
    @Required
    private List<Records> records;

    /**
     * 解析记录所在的解析线路，请调用describeViewTree接口获取。如果不传是默认线路。
     */
    private List<String> views;

    /**
     * 解析记录的类型，支持A,CNAME,AAAA,JNAME
     * Required:true
     */
    @Required
    private String type;


    /**
     * get 解析记录的结构
     *
     * @return
     */
    public List<Records> getRecords() {
        return records;
    }

    /**
     * set 解析记录的结构
     *
     * @param records
     */
    public void setRecords(List<Records> records) {
        this.records = records;
    }

    /**
     * get 解析记录所在的解析线路，请调用describeViewTree接口获取。如果不传是默认线路。
     *
     * @return
     */
    public List<String> getViews() {
        return views;
    }

    /**
     * set 解析记录所在的解析线路，请调用describeViewTree接口获取。如果不传是默认线路。
     *
     * @param views
     */
    public void setViews(List<String> views) {
        this.views = views;
    }

    /**
     * get 解析记录的类型，支持A,CNAME,AAAA,JNAME
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 解析记录的类型，支持A,CNAME,AAAA,JNAME
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * set 解析记录的结构
     *
     * @param records
     */
    public RecordsReqs records(List<Records> records) {
        this.records = records;
        return this;
    }

    /**
     * set 解析记录所在的解析线路，请调用describeViewTree接口获取。如果不传是默认线路。
     *
     * @param views
     */
    public RecordsReqs views(List<String> views) {
        this.views = views;
        return this;
    }

    /**
     * set 解析记录的类型，支持A,CNAME,AAAA,JNAME
     *
     * @param type
     */
    public RecordsReqs type(String type) {
        this.type = type;
        return this;
    }


    /**
     * add item to 解析记录的结构
     *
     * @param record
     */
    public void addRecord(Records record) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(record);
    }

    /**
     * add item to 解析记录所在的解析线路，请调用describeViewTree接口获取。如果不传是默认线路。
     *
     * @param view
     */
    public void addView(String view) {
        if (this.views == null) {
            this.views = new ArrayList<>();
        }
        this.views.add(view);
    }

}