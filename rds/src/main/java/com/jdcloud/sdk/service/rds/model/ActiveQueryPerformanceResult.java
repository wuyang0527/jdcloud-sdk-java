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
 * 性能统计
 * 性能统计相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * activeQueryPerformanceResult
 */
public class ActiveQueryPerformanceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * sql语句
     */
    private String sql;

    /**
     * 开始执行时间，格式为YYYY-MM-DD hh:mm:ss
     */
    private String startTime;

    /**
     * 执行时长，单位秒
     */
    private Integer elapsedTime;

    /**
     * 数据库名
     */
    private String db;

    /**
     * 该SQL执行时的Session ID
     */
    private String sessionId;

    /**
     * 执行该SQL的用户名
     */
    private String user;

    /**
     * SQL 的执行状态
     */
    private String status;



    /**
     * get sql语句
     *
     * @return
     */
    public String getSql() {
        return sql;
    }

    /**
     * set sql语句
     *
     * @param sql
     */
    public void setSql(String sql) {
        this.sql = sql;
    }


    /**
     * get 开始执行时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始执行时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 执行时长，单位秒
     *
     * @return
     */
    public Integer getElapsedTime() {
        return elapsedTime;
    }

    /**
     * set 执行时长，单位秒
     *
     * @param elapsedTime
     */
    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }


    /**
     * get 数据库名
     *
     * @return
     */
    public String getDb() {
        return db;
    }

    /**
     * set 数据库名
     *
     * @param db
     */
    public void setDb(String db) {
        this.db = db;
    }


    /**
     * get 该SQL执行时的Session ID
     *
     * @return
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * set 该SQL执行时的Session ID
     *
     * @param sessionId
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * get 执行该SQL的用户名
     *
     * @return
     */
    public String getUser() {
        return user;
    }

    /**
     * set 执行该SQL的用户名
     *
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }


    /**
     * get SQL 的执行状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set SQL 的执行状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }



    /**
     * set sql语句
     *
     * @param sql
     */
    public ActiveQueryPerformanceResult sql(String sql) {
        this.sql = sql;
        return this;
    }


    /**
     * set 开始执行时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @param startTime
     */
    public ActiveQueryPerformanceResult startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 执行时长，单位秒
     *
     * @param elapsedTime
     */
    public ActiveQueryPerformanceResult elapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }


    /**
     * set 数据库名
     *
     * @param db
     */
    public ActiveQueryPerformanceResult db(String db) {
        this.db = db;
        return this;
    }


    /**
     * set 该SQL执行时的Session ID
     *
     * @param sessionId
     */
    public ActiveQueryPerformanceResult sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }


    /**
     * set 执行该SQL的用户名
     *
     * @param user
     */
    public ActiveQueryPerformanceResult user(String user) {
        this.user = user;
        return this;
    }


    /**
     * set SQL 的执行状态
     *
     * @param status
     */
    public ActiveQueryPerformanceResult status(String status) {
        this.status = status;
        return this;
    }


}