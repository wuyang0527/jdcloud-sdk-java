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
 * tableShardingInfo
 */
public class TableShardingInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 表名。
     */
    private String tableName;

    /**
     * 数据库策略类型 STANDARD:标准分片（非必须）。
     */
    private String databaseStrategyType;

    /**
     * 数据库切分列名。
     */
    private String databaseShardingColumn;

    /**
     * 分库算法配置。
     */
    private OgShardingAlgorithmProperties databaseShardingAlgorithmProperties;

    /**
     * 数据库策略类型 STANDARD:标准分片（非必须）。
     */
    private String tableStrategyType;

    /**
     * 数据库切分列名。
     */
    private String tableShardingColumn;

    /**
     * 分表算法配置。
     */
    private OgShardingAlgorithmProperties tableShardingAlgorithmProperties;

    /**
     * 主键名称。
     */
    private String primaryKeyName;

    /**
     * 主键策略 UUID:UUID,SNOWFLAKE:SNOWFLAKE。
     */
    private String primaryKeyStrategy;



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
     * get 数据库策略类型 STANDARD:标准分片（非必须）。
     *
     * @return
     */
    public String getDatabaseStrategyType() {
        return databaseStrategyType;
    }

    /**
     * set 数据库策略类型 STANDARD:标准分片（非必须）。
     *
     * @param databaseStrategyType
     */
    public void setDatabaseStrategyType(String databaseStrategyType) {
        this.databaseStrategyType = databaseStrategyType;
    }


    /**
     * get 数据库切分列名。
     *
     * @return
     */
    public String getDatabaseShardingColumn() {
        return databaseShardingColumn;
    }

    /**
     * set 数据库切分列名。
     *
     * @param databaseShardingColumn
     */
    public void setDatabaseShardingColumn(String databaseShardingColumn) {
        this.databaseShardingColumn = databaseShardingColumn;
    }


    /**
     * get 分库算法配置。
     *
     * @return
     */
    public OgShardingAlgorithmProperties getDatabaseShardingAlgorithmProperties() {
        return databaseShardingAlgorithmProperties;
    }

    /**
     * set 分库算法配置。
     *
     * @param databaseShardingAlgorithmProperties
     */
    public void setDatabaseShardingAlgorithmProperties(OgShardingAlgorithmProperties databaseShardingAlgorithmProperties) {
        this.databaseShardingAlgorithmProperties = databaseShardingAlgorithmProperties;
    }


    /**
     * get 数据库策略类型 STANDARD:标准分片（非必须）。
     *
     * @return
     */
    public String getTableStrategyType() {
        return tableStrategyType;
    }

    /**
     * set 数据库策略类型 STANDARD:标准分片（非必须）。
     *
     * @param tableStrategyType
     */
    public void setTableStrategyType(String tableStrategyType) {
        this.tableStrategyType = tableStrategyType;
    }


    /**
     * get 数据库切分列名。
     *
     * @return
     */
    public String getTableShardingColumn() {
        return tableShardingColumn;
    }

    /**
     * set 数据库切分列名。
     *
     * @param tableShardingColumn
     */
    public void setTableShardingColumn(String tableShardingColumn) {
        this.tableShardingColumn = tableShardingColumn;
    }


    /**
     * get 分表算法配置。
     *
     * @return
     */
    public OgShardingAlgorithmProperties getTableShardingAlgorithmProperties() {
        return tableShardingAlgorithmProperties;
    }

    /**
     * set 分表算法配置。
     *
     * @param tableShardingAlgorithmProperties
     */
    public void setTableShardingAlgorithmProperties(OgShardingAlgorithmProperties tableShardingAlgorithmProperties) {
        this.tableShardingAlgorithmProperties = tableShardingAlgorithmProperties;
    }


    /**
     * get 主键名称。
     *
     * @return
     */
    public String getPrimaryKeyName() {
        return primaryKeyName;
    }

    /**
     * set 主键名称。
     *
     * @param primaryKeyName
     */
    public void setPrimaryKeyName(String primaryKeyName) {
        this.primaryKeyName = primaryKeyName;
    }


    /**
     * get 主键策略 UUID:UUID,SNOWFLAKE:SNOWFLAKE。
     *
     * @return
     */
    public String getPrimaryKeyStrategy() {
        return primaryKeyStrategy;
    }

    /**
     * set 主键策略 UUID:UUID,SNOWFLAKE:SNOWFLAKE。
     *
     * @param primaryKeyStrategy
     */
    public void setPrimaryKeyStrategy(String primaryKeyStrategy) {
        this.primaryKeyStrategy = primaryKeyStrategy;
    }



    /**
     * set 表名。
     *
     * @param tableName
     */
    public TableShardingInfo tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }


    /**
     * set 数据库策略类型 STANDARD:标准分片（非必须）。
     *
     * @param databaseStrategyType
     */
    public TableShardingInfo databaseStrategyType(String databaseStrategyType) {
        this.databaseStrategyType = databaseStrategyType;
        return this;
    }


    /**
     * set 数据库切分列名。
     *
     * @param databaseShardingColumn
     */
    public TableShardingInfo databaseShardingColumn(String databaseShardingColumn) {
        this.databaseShardingColumn = databaseShardingColumn;
        return this;
    }


    /**
     * set 分库算法配置。
     *
     * @param databaseShardingAlgorithmProperties
     */
    public TableShardingInfo databaseShardingAlgorithmProperties(OgShardingAlgorithmProperties databaseShardingAlgorithmProperties) {
        this.databaseShardingAlgorithmProperties = databaseShardingAlgorithmProperties;
        return this;
    }


    /**
     * set 数据库策略类型 STANDARD:标准分片（非必须）。
     *
     * @param tableStrategyType
     */
    public TableShardingInfo tableStrategyType(String tableStrategyType) {
        this.tableStrategyType = tableStrategyType;
        return this;
    }


    /**
     * set 数据库切分列名。
     *
     * @param tableShardingColumn
     */
    public TableShardingInfo tableShardingColumn(String tableShardingColumn) {
        this.tableShardingColumn = tableShardingColumn;
        return this;
    }


    /**
     * set 分表算法配置。
     *
     * @param tableShardingAlgorithmProperties
     */
    public TableShardingInfo tableShardingAlgorithmProperties(OgShardingAlgorithmProperties tableShardingAlgorithmProperties) {
        this.tableShardingAlgorithmProperties = tableShardingAlgorithmProperties;
        return this;
    }


    /**
     * set 主键名称。
     *
     * @param primaryKeyName
     */
    public TableShardingInfo primaryKeyName(String primaryKeyName) {
        this.primaryKeyName = primaryKeyName;
        return this;
    }


    /**
     * set 主键策略 UUID:UUID,SNOWFLAKE:SNOWFLAKE。
     *
     * @param primaryKeyStrategy
     */
    public TableShardingInfo primaryKeyStrategy(String primaryKeyStrategy) {
        this.primaryKeyStrategy = primaryKeyStrategy;
        return this;
    }


}