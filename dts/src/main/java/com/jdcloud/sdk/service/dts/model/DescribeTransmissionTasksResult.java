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
 * 数据传输服务
 * 数据传输服务相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dts.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dts.model.TransmissionTask;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询数据传输任务信息
 */
public class DescribeTransmissionTasksResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dts
     */
    
    private List<TransmissionTask> dts;
    /**
     * 总记录数
     */
    private Integer totalCount;



    /**
    * get dts
    *
    * @return
    */
    public List<TransmissionTask> getDts() {
        return dts;
    }

    /**
    * set dts
    *
    * @param dts
    */
    public void setDts(List<TransmissionTask> dts) {
        this.dts = dts;
    }


    /**
     * get 总记录数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总记录数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set dts
    *
    * @param dts
    */
    public DescribeTransmissionTasksResult dts(List<TransmissionTask> dts) {
        this.dts = dts;
        return this;
    }


    /**
     * set 总记录数
     *
     * @param totalCount
     */
    public DescribeTransmissionTasksResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to dts
     *
     * @param dt
     */
    public void addDt(TransmissionTask dt) {
        if (this.dts == null) {
            this.dts = new ArrayList<>();
        }
        this.dts.add(dt);
    }
}