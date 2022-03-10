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

package com.jdcloud.sdk.service.smartdba.model;


/**
 * executionPlan
 */
public class ExecutionPlan  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * sql执行顺序id
     */
    private String id;

    /**
     * select语句类型
     */
    private String selectType;

    /**
     * 表名
     */
    private String table;

    /**
     * 匹配的分区
     */
    private String partitions;

    /**
     * 访问行的类型
     */
    private String accessType;

    /**
     * 可能选用的索引
     */
    private String possibleKeys;

    /**
     * 确切使用到的索引
     */
    private String key;

    /**
     * 表示索引中使用的字节数
     */
    private String keyLen;

    /**
     * 哪个字段或常数与 key 一起被使用
     */
    private String ref;

    /**
     * 一共扫描了多少行. 是一个估计值
     */
    private String rows;

    /**
     * 此查询条件所过滤的数据的百分比
     */
    private String filtered;

    /**
     * 额外的信息
     */
    private String extra;


    /**
     * get sql执行顺序id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set sql执行顺序id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get select语句类型
     *
     * @return
     */
    public String getSelectType() {
        return selectType;
    }

    /**
     * set select语句类型
     *
     * @param selectType
     */
    public void setSelectType(String selectType) {
        this.selectType = selectType;
    }

    /**
     * get 表名
     *
     * @return
     */
    public String getTable() {
        return table;
    }

    /**
     * set 表名
     *
     * @param table
     */
    public void setTable(String table) {
        this.table = table;
    }

    /**
     * get 匹配的分区
     *
     * @return
     */
    public String getPartitions() {
        return partitions;
    }

    /**
     * set 匹配的分区
     *
     * @param partitions
     */
    public void setPartitions(String partitions) {
        this.partitions = partitions;
    }

    /**
     * get 访问行的类型
     *
     * @return
     */
    public String getAccessType() {
        return accessType;
    }

    /**
     * set 访问行的类型
     *
     * @param accessType
     */
    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    /**
     * get 可能选用的索引
     *
     * @return
     */
    public String getPossibleKeys() {
        return possibleKeys;
    }

    /**
     * set 可能选用的索引
     *
     * @param possibleKeys
     */
    public void setPossibleKeys(String possibleKeys) {
        this.possibleKeys = possibleKeys;
    }

    /**
     * get 确切使用到的索引
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 确切使用到的索引
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * get 表示索引中使用的字节数
     *
     * @return
     */
    public String getKeyLen() {
        return keyLen;
    }

    /**
     * set 表示索引中使用的字节数
     *
     * @param keyLen
     */
    public void setKeyLen(String keyLen) {
        this.keyLen = keyLen;
    }

    /**
     * get 哪个字段或常数与 key 一起被使用
     *
     * @return
     */
    public String getRef() {
        return ref;
    }

    /**
     * set 哪个字段或常数与 key 一起被使用
     *
     * @param ref
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * get 一共扫描了多少行. 是一个估计值
     *
     * @return
     */
    public String getRows() {
        return rows;
    }

    /**
     * set 一共扫描了多少行. 是一个估计值
     *
     * @param rows
     */
    public void setRows(String rows) {
        this.rows = rows;
    }

    /**
     * get 此查询条件所过滤的数据的百分比
     *
     * @return
     */
    public String getFiltered() {
        return filtered;
    }

    /**
     * set 此查询条件所过滤的数据的百分比
     *
     * @param filtered
     */
    public void setFiltered(String filtered) {
        this.filtered = filtered;
    }

    /**
     * get 额外的信息
     *
     * @return
     */
    public String getExtra() {
        return extra;
    }

    /**
     * set 额外的信息
     *
     * @param extra
     */
    public void setExtra(String extra) {
        this.extra = extra;
    }


    /**
     * set sql执行顺序id
     *
     * @param id
     */
    public ExecutionPlan id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set select语句类型
     *
     * @param selectType
     */
    public ExecutionPlan selectType(String selectType) {
        this.selectType = selectType;
        return this;
    }

    /**
     * set 表名
     *
     * @param table
     */
    public ExecutionPlan table(String table) {
        this.table = table;
        return this;
    }

    /**
     * set 匹配的分区
     *
     * @param partitions
     */
    public ExecutionPlan partitions(String partitions) {
        this.partitions = partitions;
        return this;
    }

    /**
     * set 访问行的类型
     *
     * @param accessType
     */
    public ExecutionPlan accessType(String accessType) {
        this.accessType = accessType;
        return this;
    }

    /**
     * set 可能选用的索引
     *
     * @param possibleKeys
     */
    public ExecutionPlan possibleKeys(String possibleKeys) {
        this.possibleKeys = possibleKeys;
        return this;
    }

    /**
     * set 确切使用到的索引
     *
     * @param key
     */
    public ExecutionPlan key(String key) {
        this.key = key;
        return this;
    }

    /**
     * set 表示索引中使用的字节数
     *
     * @param keyLen
     */
    public ExecutionPlan keyLen(String keyLen) {
        this.keyLen = keyLen;
        return this;
    }

    /**
     * set 哪个字段或常数与 key 一起被使用
     *
     * @param ref
     */
    public ExecutionPlan ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * set 一共扫描了多少行. 是一个估计值
     *
     * @param rows
     */
    public ExecutionPlan rows(String rows) {
        this.rows = rows;
        return this;
    }

    /**
     * set 此查询条件所过滤的数据的百分比
     *
     * @param filtered
     */
    public ExecutionPlan filtered(String filtered) {
        this.filtered = filtered;
        return this;
    }

    /**
     * set 额外的信息
     *
     * @param extra
     */
    public ExecutionPlan extra(String extra) {
        this.extra = extra;
        return this;
    }


}