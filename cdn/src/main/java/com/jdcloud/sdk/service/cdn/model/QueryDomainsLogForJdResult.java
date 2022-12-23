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
 * 统计查询类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cdn.model.DomainsLog;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 批量域名查询日志-pin维度
 */
public class QueryDomainsLogForJdResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * logs
     */
    
    private List<DomainsLog> logs;


    /**
    * get logs
    *
    * @return
    */
    public List<DomainsLog> getLogs() {
        return logs;
    }

    /**
    * set logs
    *
    * @param logs
    */
    public void setLogs(List<DomainsLog> logs) {
        this.logs = logs;
    }



    /**
    * set logs
    *
    * @param logs
    */
    public QueryDomainsLogForJdResult logs(List<DomainsLog> logs) {
        this.logs = logs;
        return this;
    }



    /**
     * add item to logs
     *
     * @param log
     */
    public void addLog(DomainsLog log) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(log);
    }
}