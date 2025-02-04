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

package com.jdcloud.sdk.service.dms.model;


/**
 * tableFilter
 */
public class TableFilter  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 表名。
     */
    private String tableName;

    /**
     * 查询条件。
     */
    private String filter;


    /**
     * get 表名。
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * set 表名。
     *
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * get 查询条件。
     *
     * @return
     */
    public String getFilter() {
        return filter;
    }

    /**
     * set 查询条件。
     *
     * @param filter
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }


    /**
     * set 表名。
     *
     * @param tableName
     */
    public TableFilter tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * set 查询条件。
     *
     * @param filter
     */
    public TableFilter filter(String filter) {
        this.filter = filter;
        return this;
    }


}