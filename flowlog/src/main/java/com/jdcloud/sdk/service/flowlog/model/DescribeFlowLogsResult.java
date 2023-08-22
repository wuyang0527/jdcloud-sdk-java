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
 * Flow Log
 * 流量日志相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.flowlog.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.flowlog.model.FlowLog;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 本接口用于查询流日志资源列表
 */
public class DescribeFlowLogsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * flowLogs
     */
    
    private List<FlowLog> flowLogs;
    /**
     * 总数量
     */
    private Number totalCount;



    /**
    * get flowLogs
    *
    * @return
    */
    public List<FlowLog> getFlowLogs() {
        return flowLogs;
    }

    /**
    * set flowLogs
    *
    * @param flowLogs
    */
    public void setFlowLogs(List<FlowLog> flowLogs) {
        this.flowLogs = flowLogs;
    }


    /**
     * get 总数量
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set flowLogs
    *
    * @param flowLogs
    */
    public DescribeFlowLogsResult flowLogs(List<FlowLog> flowLogs) {
        this.flowLogs = flowLogs;
        return this;
    }


    /**
     * set 总数量
     *
     * @param totalCount
     */
    public DescribeFlowLogsResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to flowLogs
     *
     * @param flowLog
     */
    public void addFlowLog(FlowLog flowLog) {
        if (this.flowLogs == null) {
            this.flowLogs = new ArrayList<>();
        }
        this.flowLogs.add(flowLog);
    }
}