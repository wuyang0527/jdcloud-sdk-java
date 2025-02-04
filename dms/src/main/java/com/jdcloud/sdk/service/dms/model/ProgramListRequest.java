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
 * DmsProgram
 * 编程对象相关接口
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
 * 获取视图列表
 */
public class ProgramListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据源id
     */
    private Integer dataSourceId;

    /**
     * 数据库名称。
     */
    private String dbName;

    /**
     * 过滤条件。
     */
    private String filter;

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
     * get 数据库名称。
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名称。
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 过滤条件。
     *
     * @return
     */
    public String getFilter() {
        return filter;
    }

    /**
     * set 过滤条件。
     *
     * @param filter
     */
    public void setFilter(String filter) {
        this.filter = filter;
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
    public ProgramListRequest dataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * set 数据库名称。
     *
     * @param dbName
     */
    public ProgramListRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 过滤条件。
     *
     * @param filter
     */
    public ProgramListRequest filter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public ProgramListRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}