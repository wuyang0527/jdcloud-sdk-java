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
 * DNS Records for a Zone
 * Documentation for JDC StarShield DNS records
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.starshield.model.DnsRecord;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 列出、搜索、排序和筛选域的DNS记录。
 */
public class ListDNSRecordsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dataList
     */
    private List<DnsRecord> dataList;


    /**
     * get dataList
     *
     * @return
     */
    public List<DnsRecord> getDataList() {
        return dataList;
    }

    /**
     * set dataList
     *
     * @param dataList
     */
    public void setDataList(List<DnsRecord> dataList) {
        this.dataList = dataList;
    }


    /**
     * set dataList
     *
     * @param dataList
     */
    public ListDNSRecordsResult dataList(List<DnsRecord> dataList) {
        this.dataList = dataList;
        return this;
    }


    /**
     * add item to dataList
     *
     * @param dataList
     */
    public void addDataList(DnsRecord dataList) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataList);
    }

}