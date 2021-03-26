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
 * DataSource
 * 敏感数据保护-数据源相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dcap.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.dcap.model.DataSourceSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加数据源
 */
public class CreateDataSourceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 添加数据源需要的信息
     * Required:true
     */
    @Required
    private DataSourceSpec dataSourceSpec;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 添加数据源需要的信息
     *
     * @return
     */
    public DataSourceSpec getDataSourceSpec() {
        return dataSourceSpec;
    }

    /**
     * set 添加数据源需要的信息
     *
     * @param dataSourceSpec
     */
    public void setDataSourceSpec(DataSourceSpec dataSourceSpec) {
        this.dataSourceSpec = dataSourceSpec;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 添加数据源需要的信息
     *
     * @param dataSourceSpec
     */
    public CreateDataSourceRequest dataSourceSpec(DataSourceSpec dataSourceSpec) {
        this.dataSourceSpec = dataSourceSpec;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreateDataSourceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}