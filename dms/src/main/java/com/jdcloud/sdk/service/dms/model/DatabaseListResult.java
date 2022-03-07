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
 * DmsMeta
 * 获取库表元数据
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取数据库实例的库列表
 */
public class DatabaseListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库名称
     */
    private List<String> databaseNames;


    /**
     * get 数据库名称
     *
     * @return
     */
    public List<String> getDatabaseNames() {
        return databaseNames;
    }

    /**
     * set 数据库名称
     *
     * @param databaseNames
     */
    public void setDatabaseNames(List<String> databaseNames) {
        this.databaseNames = databaseNames;
    }


    /**
     * set 数据库名称
     *
     * @param databaseNames
     */
    public DatabaseListResult databaseNames(List<String> databaseNames) {
        this.databaseNames = databaseNames;
        return this;
    }


    /**
     * add item to 数据库名称
     *
     * @param databaseName
     */
    public void addDatabaseName(String databaseName) {
        if (this.databaseNames == null) {
            this.databaseNames = new ArrayList<>();
        }
        this.databaseNames.add(databaseName);
    }

}