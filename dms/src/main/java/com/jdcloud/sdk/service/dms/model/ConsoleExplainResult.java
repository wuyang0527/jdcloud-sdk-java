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
 * Sql
 * Sql操作
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dms.model.DmsSqlResult;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 执行计划
 */
public class ConsoleExplainResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dmsSqlResults
     */
    private List<DmsSqlResult> dmsSqlResults;


    /**
     * get dmsSqlResults
     *
     * @return
     */
    public List<DmsSqlResult> getDmsSqlResults() {
        return dmsSqlResults;
    }

    /**
     * set dmsSqlResults
     *
     * @param dmsSqlResults
     */
    public void setDmsSqlResults(List<DmsSqlResult> dmsSqlResults) {
        this.dmsSqlResults = dmsSqlResults;
    }


    /**
     * set dmsSqlResults
     *
     * @param dmsSqlResults
     */
    public ConsoleExplainResult dmsSqlResults(List<DmsSqlResult> dmsSqlResults) {
        this.dmsSqlResults = dmsSqlResults;
        return this;
    }


    /**
     * add item to dmsSqlResults
     *
     * @param dmsSqlResult
     */
    public void addDmsSqlResult(DmsSqlResult dmsSqlResult) {
        if (this.dmsSqlResults == null) {
            this.dmsSqlResults = new ArrayList<>();
        }
        this.dmsSqlResults.add(dmsSqlResult);
    }

}