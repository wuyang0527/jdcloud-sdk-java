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

import java.util.List;
import java.util.ArrayList;

/**
 * indexInfo
 */
public class IndexInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 索引名。
     */
    private String indexName;

    /**
     * 列类型，普通索引：NORMAL，唯一索引：UNIQUE。
     */
    private String indexType;

    /**
     * 列名称。
     */
    private List<String> columnNames;


    /**
     * get 索引名。
     *
     * @return
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * set 索引名。
     *
     * @param indexName
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * get 列类型，普通索引：NORMAL，唯一索引：UNIQUE。
     *
     * @return
     */
    public String getIndexType() {
        return indexType;
    }

    /**
     * set 列类型，普通索引：NORMAL，唯一索引：UNIQUE。
     *
     * @param indexType
     */
    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    /**
     * get 列名称。
     *
     * @return
     */
    public List<String> getColumnNames() {
        return columnNames;
    }

    /**
     * set 列名称。
     *
     * @param columnNames
     */
    public void setColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
    }


    /**
     * set 索引名。
     *
     * @param indexName
     */
    public IndexInfo indexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * set 列类型，普通索引：NORMAL，唯一索引：UNIQUE。
     *
     * @param indexType
     */
    public IndexInfo indexType(String indexType) {
        this.indexType = indexType;
        return this;
    }

    /**
     * set 列名称。
     *
     * @param columnNames
     */
    public IndexInfo columnNames(List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }


    /**
     * add item to 列名称。
     *
     * @param columnName
     */
    public void addColumnName(String columnName) {
        if (this.columnNames == null) {
            this.columnNames = new ArrayList<>();
        }
        this.columnNames.add(columnName);
    }

}