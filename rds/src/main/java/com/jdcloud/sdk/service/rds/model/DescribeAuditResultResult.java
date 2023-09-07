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
 * 审计管理
 * 审计管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.rds.model.AuditResult;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看RDS实例的审计内容&lt;br&gt;- 仅支持 MySQL 5.6, MySQL 5.7, Percona, MariaDB, PostgreSQL
 */
public class DescribeAuditResultResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * auditResult
     */
    
    private List<AuditResult> auditResult;
    /**
     * totalCount
     */
    private Integer totalCount;



    /**
    * get auditResult
    *
    * @return
    */
    public List<AuditResult> getAuditResult() {
        return auditResult;
    }

    /**
    * set auditResult
    *
    * @param auditResult
    */
    public void setAuditResult(List<AuditResult> auditResult) {
        this.auditResult = auditResult;
    }


    /**
     * get totalCount
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set auditResult
    *
    * @param auditResult
    */
    public DescribeAuditResultResult auditResult(List<AuditResult> auditResult) {
        this.auditResult = auditResult;
        return this;
    }


    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeAuditResultResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to auditResult
     *
     * @param auditResult
     */
    public void addAuditResult(AuditResult auditResult) {
        if (this.auditResult == null) {
            this.auditResult = new ArrayList<>();
        }
        this.auditResult.add(auditResult);
    }
}