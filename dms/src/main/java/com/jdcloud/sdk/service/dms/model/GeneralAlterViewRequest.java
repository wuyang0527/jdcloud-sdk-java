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
 * DmsView
 * 视图相关接口
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
 * 生成修改视图sql语句，支持Mysql
 */
public class GeneralAlterViewRequest extends JdcloudRequest implements java.io.Serializable {

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
     * 视图名称。
     */
    private String viewName;

    /**
     * 原始视图名称。
     */
    private String originViewName;

    /**
     * 视图算法，DEFAULT(&quot;DEFAULT&quot;, 1),UNDEFINED(&quot;UNDEFINED&quot;, 2), MERGE(&quot;MERGE&quot;, 3), TEMPTABLE(&quot;TEMPTABLE&quot;, 4);
     */
    private String viewAlgorithm;

    /**
     * 定义者。
     */
    private String definer;

    /**
     * 安全性，DEFAULT(&quot;DEFAULT&quot;, 1),DEFINER(&quot;DEFINER&quot;, 2), INVOKER(&quot;INVOKER&quot;, 3);
     */
    private String viewSecurity;

    /**
     * 检查选项，DEFAULT(&quot;DEFAULT&quot;, 1),LOCAL(&quot;LOCAL&quot;, 2), CASCADED(&quot;CASCADED&quot;, 3);;
     */
    private String viewCheckOption;

    /**
     * 视图定义。
     */
    private String definitionSql;

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
     * get 视图名称。
     *
     * @return
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * set 视图名称。
     *
     * @param viewName
     */
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }


    /**
     * get 原始视图名称。
     *
     * @return
     */
    public String getOriginViewName() {
        return originViewName;
    }

    /**
     * set 原始视图名称。
     *
     * @param originViewName
     */
    public void setOriginViewName(String originViewName) {
        this.originViewName = originViewName;
    }


    /**
     * get 视图算法，DEFAULT(&quot;DEFAULT&quot;, 1),UNDEFINED(&quot;UNDEFINED&quot;, 2), MERGE(&quot;MERGE&quot;, 3), TEMPTABLE(&quot;TEMPTABLE&quot;, 4);
     *
     * @return
     */
    public String getViewAlgorithm() {
        return viewAlgorithm;
    }

    /**
     * set 视图算法，DEFAULT(&quot;DEFAULT&quot;, 1),UNDEFINED(&quot;UNDEFINED&quot;, 2), MERGE(&quot;MERGE&quot;, 3), TEMPTABLE(&quot;TEMPTABLE&quot;, 4);
     *
     * @param viewAlgorithm
     */
    public void setViewAlgorithm(String viewAlgorithm) {
        this.viewAlgorithm = viewAlgorithm;
    }


    /**
     * get 定义者。
     *
     * @return
     */
    public String getDefiner() {
        return definer;
    }

    /**
     * set 定义者。
     *
     * @param definer
     */
    public void setDefiner(String definer) {
        this.definer = definer;
    }


    /**
     * get 安全性，DEFAULT(&quot;DEFAULT&quot;, 1),DEFINER(&quot;DEFINER&quot;, 2), INVOKER(&quot;INVOKER&quot;, 3);
     *
     * @return
     */
    public String getViewSecurity() {
        return viewSecurity;
    }

    /**
     * set 安全性，DEFAULT(&quot;DEFAULT&quot;, 1),DEFINER(&quot;DEFINER&quot;, 2), INVOKER(&quot;INVOKER&quot;, 3);
     *
     * @param viewSecurity
     */
    public void setViewSecurity(String viewSecurity) {
        this.viewSecurity = viewSecurity;
    }


    /**
     * get 检查选项，DEFAULT(&quot;DEFAULT&quot;, 1),LOCAL(&quot;LOCAL&quot;, 2), CASCADED(&quot;CASCADED&quot;, 3);;
     *
     * @return
     */
    public String getViewCheckOption() {
        return viewCheckOption;
    }

    /**
     * set 检查选项，DEFAULT(&quot;DEFAULT&quot;, 1),LOCAL(&quot;LOCAL&quot;, 2), CASCADED(&quot;CASCADED&quot;, 3);;
     *
     * @param viewCheckOption
     */
    public void setViewCheckOption(String viewCheckOption) {
        this.viewCheckOption = viewCheckOption;
    }


    /**
     * get 视图定义。
     *
     * @return
     */
    public String getDefinitionSql() {
        return definitionSql;
    }

    /**
     * set 视图定义。
     *
     * @param definitionSql
     */
    public void setDefinitionSql(String definitionSql) {
        this.definitionSql = definitionSql;
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
    public GeneralAlterViewRequest dataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }


    /**
     * set 数据库名称。
     *
     * @param dbName
     */
    public GeneralAlterViewRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }


    /**
     * set 视图名称。
     *
     * @param viewName
     */
    public GeneralAlterViewRequest viewName(String viewName) {
        this.viewName = viewName;
        return this;
    }


    /**
     * set 原始视图名称。
     *
     * @param originViewName
     */
    public GeneralAlterViewRequest originViewName(String originViewName) {
        this.originViewName = originViewName;
        return this;
    }


    /**
     * set 视图算法，DEFAULT(&quot;DEFAULT&quot;, 1),UNDEFINED(&quot;UNDEFINED&quot;, 2), MERGE(&quot;MERGE&quot;, 3), TEMPTABLE(&quot;TEMPTABLE&quot;, 4);
     *
     * @param viewAlgorithm
     */
    public GeneralAlterViewRequest viewAlgorithm(String viewAlgorithm) {
        this.viewAlgorithm = viewAlgorithm;
        return this;
    }


    /**
     * set 定义者。
     *
     * @param definer
     */
    public GeneralAlterViewRequest definer(String definer) {
        this.definer = definer;
        return this;
    }


    /**
     * set 安全性，DEFAULT(&quot;DEFAULT&quot;, 1),DEFINER(&quot;DEFINER&quot;, 2), INVOKER(&quot;INVOKER&quot;, 3);
     *
     * @param viewSecurity
     */
    public GeneralAlterViewRequest viewSecurity(String viewSecurity) {
        this.viewSecurity = viewSecurity;
        return this;
    }


    /**
     * set 检查选项，DEFAULT(&quot;DEFAULT&quot;, 1),LOCAL(&quot;LOCAL&quot;, 2), CASCADED(&quot;CASCADED&quot;, 3);;
     *
     * @param viewCheckOption
     */
    public GeneralAlterViewRequest viewCheckOption(String viewCheckOption) {
        this.viewCheckOption = viewCheckOption;
        return this;
    }


    /**
     * set 视图定义。
     *
     * @param definitionSql
     */
    public GeneralAlterViewRequest definitionSql(String definitionSql) {
        this.definitionSql = definitionSql;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public GeneralAlterViewRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}