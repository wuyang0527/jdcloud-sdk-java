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
import com.jdcloud.sdk.service.dts.model.LogDetail;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询数据传输日志信息
 */
public class DescribeTransmissionLogResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * details
     */
    
    private List<LogDetail> details;
    /**
     * 总数
     */
    private Integer totalCount;



    /**
    * get details
    *
    * @return
    */
    public List<LogDetail> getDetails() {
        return details;
    }

    /**
    * set details
    *
    * @param details
    */
    public void setDetails(List<LogDetail> details) {
        this.details = details;
    }


    /**
     * get 总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set details
    *
    * @param details
    */
    public DescribeTransmissionLogResult details(List<LogDetail> details) {
        this.details = details;
        return this;
    }


    /**
     * set 总数
     *
     * @param totalCount
     */
    public DescribeTransmissionLogResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to details
     *
     * @param detail
     */
    public void addDetail(LogDetail detail) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detail);
    }
}