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
import com.jdcloud.sdk.service.dms.model.DmsTableStruct;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取sql中建表语句，表中列信息，支持Mysql，Stardb，Tidb，ClickHouse
 */
public class SqlTableInfoResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dmsTableStructs
     */
    
    private List<DmsTableStruct> dmsTableStructs;


    /**
    * get dmsTableStructs
    *
    * @return
    */
    public List<DmsTableStruct> getDmsTableStructs() {
        return dmsTableStructs;
    }

    /**
    * set dmsTableStructs
    *
    * @param dmsTableStructs
    */
    public void setDmsTableStructs(List<DmsTableStruct> dmsTableStructs) {
        this.dmsTableStructs = dmsTableStructs;
    }



    /**
    * set dmsTableStructs
    *
    * @param dmsTableStructs
    */
    public SqlTableInfoResult dmsTableStructs(List<DmsTableStruct> dmsTableStructs) {
        this.dmsTableStructs = dmsTableStructs;
        return this;
    }



    /**
     * add item to dmsTableStructs
     *
     * @param dmsTableStruct
     */
    public void addDmsTableStruct(DmsTableStruct dmsTableStruct) {
        if (this.dmsTableStructs == null) {
            this.dmsTableStructs = new ArrayList<>();
        }
        this.dmsTableStructs.add(dmsTableStruct);
    }
}