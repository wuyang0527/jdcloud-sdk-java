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
 * yunding-rds
 * 云鼎-云数据库管理相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yunding.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取当前实例的所有数据库详细信息的列表
 */
public class DescribeRdsDatabasesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库名。如果不指定数据库名，则返回所有数据库列表&lt;br&gt;- **MySQL：不支持该字段**&lt;br&gt;- **SQL Server：支持该字段**
     */
    private String dbName;

    /**
     * 显示数据的页码，默认为1，取值范围：[-1,∞)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页;
     */
    private Integer pageNumber;

    /**
     * 每页显示的数据条数，默认为100，取值范围：[10,100]，用于查询列表的接口
     */
    private Integer pageSize;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 数据库名。如果不指定数据库名，则返回所有数据库列表&lt;br&gt;- **MySQL：不支持该字段**&lt;br&gt;- **SQL Server：支持该字段**
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名。如果不指定数据库名，则返回所有数据库列表&lt;br&gt;- **MySQL：不支持该字段**&lt;br&gt;- **SQL Server：支持该字段**
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 显示数据的页码，默认为1，取值范围：[-1,∞)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页;
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页;
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 每页显示的数据条数，默认为100，取值范围：[10,100]，用于查询列表的接口
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页显示的数据条数，默认为100，取值范围：[10,100]，用于查询列表的接口
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
     * get RDS 实例ID，唯一标识一个RDS实例
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 数据库名。如果不指定数据库名，则返回所有数据库列表&lt;br&gt;- **MySQL：不支持该字段**&lt;br&gt;- **SQL Server：支持该字段**
     *
     * @param dbName
     */
    public DescribeRdsDatabasesRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)。pageNumber为-1时，返回所有数据页码；超过总页数时，显示最后一页;
     *
     * @param pageNumber
     */
    public DescribeRdsDatabasesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 每页显示的数据条数，默认为100，取值范围：[10,100]，用于查询列表的接口
     *
     * @param pageSize
     */
    public DescribeRdsDatabasesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public DescribeRdsDatabasesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public DescribeRdsDatabasesRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}