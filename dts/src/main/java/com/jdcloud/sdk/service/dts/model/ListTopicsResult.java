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
 * 数据传输服务
 * 数据传输服务相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dts.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dts.model.Topic;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取Topic列表
 */
public class ListTopicsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * tables
     */
    
    private List<Topic> tables;


    /**
    * get tables
    *
    * @return
    */
    public List<Topic> getTables() {
        return tables;
    }

    /**
    * set tables
    *
    * @param tables
    */
    public void setTables(List<Topic> tables) {
        this.tables = tables;
    }



    /**
    * set tables
    *
    * @param tables
    */
    public ListTopicsResult tables(List<Topic> tables) {
        this.tables = tables;
        return this;
    }



    /**
     * add item to tables
     *
     * @param table
     */
    public void addTable(Topic table) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(table);
    }
}