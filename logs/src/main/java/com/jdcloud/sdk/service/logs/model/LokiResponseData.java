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

package com.jdcloud.sdk.service.logs.model;

import java.util.List;
import java.util.ArrayList;

/**
 * lokiResponseData
 */
public class LokiResponseData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * resultType
     */
    private String resultType;

    /**
     * result
     */
    
    private List<LokiResponseResult> result;
    /**
     * 查询结果
     */
    private LokiResponseStats stats;



    /**
     * get resultType
     *
     * @return
     */
    public String getResultType() {
        return resultType;
    }

    /**
     * set resultType
     *
     * @param resultType
     */
    public void setResultType(String resultType) {
        this.resultType = resultType;
    }


    /**
    * get result
    *
    * @return
    */
    public List<LokiResponseResult> getResult() {
        return result;
    }

    /**
    * set result
    *
    * @param result
    */
    public void setResult(List<LokiResponseResult> result) {
        this.result = result;
    }


    /**
     * get 查询结果
     *
     * @return
     */
    public LokiResponseStats getStats() {
        return stats;
    }

    /**
     * set 查询结果
     *
     * @param stats
     */
    public void setStats(LokiResponseStats stats) {
        this.stats = stats;
    }



    /**
     * set resultType
     *
     * @param resultType
     */
    public LokiResponseData resultType(String resultType) {
        this.resultType = resultType;
        return this;
    }


    /**
    * set result
    *
    * @param result
    */
    public LokiResponseData result(List<LokiResponseResult> result) {
        this.result = result;
        return this;
    }


    /**
     * set 查询结果
     *
     * @param stats
     */
    public LokiResponseData stats(LokiResponseStats stats) {
        this.stats = stats;
        return this;
    }



    /**
     * add item to result
     *
     * @param result
     */
    public void addResult(LokiResponseResult result) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(result);
    }
}