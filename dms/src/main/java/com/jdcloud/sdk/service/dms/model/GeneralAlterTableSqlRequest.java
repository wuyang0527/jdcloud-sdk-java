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
 * GeneralSql
 * 生成sql相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dms.model.MetaTableInfo;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 生成修改表结构语句sql
 */
public class GeneralAlterTableSqlRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据源Id
     */
    private Integer dataSourceId;

    /**
     * 数据库名
     */
    private String dbName;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 表元信息。
     */
    private MetaTableInfo metaTableInfo;

    /**
     * 列信息。
     */
    private List<ColumnInfo> columnInfos;

    /**
     * 索引信息。
     */
    private List<IndexInfo> indexInfos;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 数据源Id
     *
     * @return
     */
    public Integer getDataSourceId() {
        return dataSourceId;
    }

    /**
     * set 数据源Id
     *
     * @param dataSourceId
     */
    public void setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * get 数据库名
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 表名
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * set 表名
     *
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * get 表元信息。
     *
     * @return
     */
    public MetaTableInfo getMetaTableInfo() {
        return metaTableInfo;
    }

    /**
     * set 表元信息。
     *
     * @param metaTableInfo
     */
    public void setMetaTableInfo(MetaTableInfo metaTableInfo) {
        this.metaTableInfo = metaTableInfo;
    }

    /**
     * get 列信息。
     *
     * @return
     */
    public List<ColumnInfo> getColumnInfos() {
        return columnInfos;
    }

    /**
     * set 列信息。
     *
     * @param columnInfos
     */
    public void setColumnInfos(List<ColumnInfo> columnInfos) {
        this.columnInfos = columnInfos;
    }

    /**
     * get 索引信息。
     *
     * @return
     */
    public List<IndexInfo> getIndexInfos() {
        return indexInfos;
    }

    /**
     * set 索引信息。
     *
     * @param indexInfos
     */
    public void setIndexInfos(List<IndexInfo> indexInfos) {
        this.indexInfos = indexInfos;
    }

    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 数据源Id
     *
     * @param dataSourceId
     */
    public GeneralAlterTableSqlRequest dataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * set 数据库名
     *
     * @param dbName
     */
    public GeneralAlterTableSqlRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 表名
     *
     * @param tableName
     */
    public GeneralAlterTableSqlRequest tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * set 表元信息。
     *
     * @param metaTableInfo
     */
    public GeneralAlterTableSqlRequest metaTableInfo(MetaTableInfo metaTableInfo) {
        this.metaTableInfo = metaTableInfo;
        return this;
    }

    /**
     * set 列信息。
     *
     * @param columnInfos
     */
    public GeneralAlterTableSqlRequest columnInfos(List<ColumnInfo> columnInfos) {
        this.columnInfos = columnInfos;
        return this;
    }

    /**
     * set 索引信息。
     *
     * @param indexInfos
     */
    public GeneralAlterTableSqlRequest indexInfos(List<IndexInfo> indexInfos) {
        this.indexInfos = indexInfos;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public GeneralAlterTableSqlRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 列信息。
     *
     * @param columnInfo
     */
    public void addColumnInfo(ColumnInfo columnInfo) {
        if (this.columnInfos == null) {
            this.columnInfos = new ArrayList<>();
        }
        this.columnInfos.add(columnInfo);
    }

    /**
     * add item to 索引信息。
     *
     * @param indexInfo
     */
    public void addIndexInfo(IndexInfo indexInfo) {
        if (this.indexInfos == null) {
            this.indexInfos = new ArrayList<>();
        }
        this.indexInfos.add(indexInfo);
    }

}