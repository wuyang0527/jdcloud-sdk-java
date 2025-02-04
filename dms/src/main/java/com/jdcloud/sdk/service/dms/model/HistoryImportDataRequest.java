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
 * Historysql
 * 历史sql相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取当前实例用户查询导入数据sql历史
 */
public class HistoryImportDataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据源id
     */
    private Integer dataSourceId;

    /**
     * 数据库名称
     */
    private String dbName;

    /**
     * 显示数据的页码，取值范围：[1,∞)。pageNumber为Null时，返回所有数据页码；超过总页数时，无数据。
     */
    private Integer pageNumber;

    /**
     * 每页显示的数据条数，用于查询列表的接口。
     */
    private Integer pageSize;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 数据源id
     *
     * @return
     */
    public Integer getDataSourceId() {
        return dataSourceId;
    }

    /**
     * set 数据源id
     *
     * @param dataSourceId
     */
    public void setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * get 数据库名称
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 显示数据的页码，取值范围：[1,∞)。pageNumber为Null时，返回所有数据页码；超过总页数时，无数据。
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 显示数据的页码，取值范围：[1,∞)。pageNumber为Null时，返回所有数据页码；超过总页数时，无数据。
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 每页显示的数据条数，用于查询列表的接口。
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页显示的数据条数，用于查询列表的接口。
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
     * set 数据源id
     *
     * @param dataSourceId
     */
    public HistoryImportDataRequest dataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public HistoryImportDataRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 显示数据的页码，取值范围：[1,∞)。pageNumber为Null时，返回所有数据页码；超过总页数时，无数据。
     *
     * @param pageNumber
     */
    public HistoryImportDataRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 每页显示的数据条数，用于查询列表的接口。
     *
     * @param pageSize
     */
    public HistoryImportDataRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public HistoryImportDataRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}