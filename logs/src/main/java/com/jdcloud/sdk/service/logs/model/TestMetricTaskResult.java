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
 * Metric APIs
 * 日志服务日志监控任务相关的管理控制接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 日志测试，根据用户输入的日志筛选条件以及监控指标设置进行模拟监控统计
 */
public class TestMetricTaskResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * lines
     */
    
    private List<String> lines;
    /**
     * 监控值
     */
    private Double value;



    /**
    * get lines
    *
    * @return
    */
    public List<String> getLines() {
        return lines;
    }

    /**
    * set lines
    *
    * @param lines
    */
    public void setLines(List<String> lines) {
        this.lines = lines;
    }


    /**
     * get 监控值
     *
     * @return
     */
    public Double getValue() {
        return value;
    }

    /**
     * set 监控值
     *
     * @param value
     */
    public void setValue(Double value) {
        this.value = value;
    }



    /**
    * set lines
    *
    * @param lines
    */
    public TestMetricTaskResult lines(List<String> lines) {
        this.lines = lines;
        return this;
    }


    /**
     * set 监控值
     *
     * @param value
     */
    public TestMetricTaskResult value(Double value) {
        this.value = value;
        return this;
    }



    /**
     * add item to lines
     *
     * @param line
     */
    public void addLine(String line) {
        if (this.lines == null) {
            this.lines = new ArrayList<>();
        }
        this.lines.add(line);
    }
}