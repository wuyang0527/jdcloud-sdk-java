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
 * Monitoring Rules APIs
 * 云监控规则相关接口，提供创建、查询、修改、删除监控规则等功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.AlarmHistoryWithDetail;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询报警历史
检索条件组合优先级从高到低为
1. serviceCode
1.1 serviceCode + resourceId
1.2 serviceCode + resourceIds
2. serviceCodes
3. 用户所有规则
 */
public class DescribeAlarmHistoryAllRegionResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * list
     */
    private List<AlarmHistoryWithDetail> list;

    /**
     * 总数
     */
    private Long total;


    /**
     * get list
     *
     * @return
     */
    public List<AlarmHistoryWithDetail> getList() {
        return list;
    }

    /**
     * set list
     *
     * @param list
     */
    public void setList(List<AlarmHistoryWithDetail> list) {
        this.list = list;
    }

    /**
     * get 总数
     *
     * @return
     */
    public Long getTotal() {
        return total;
    }

    /**
     * set 总数
     *
     * @param total
     */
    public void setTotal(Long total) {
        this.total = total;
    }


    /**
     * set list
     *
     * @param list
     */
    public DescribeAlarmHistoryAllRegionResult list(List<AlarmHistoryWithDetail> list) {
        this.list = list;
        return this;
    }

    /**
     * set 总数
     *
     * @param total
     */
    public DescribeAlarmHistoryAllRegionResult total(Long total) {
        this.total = total;
        return this;
    }


    /**
     * add item to list
     *
     * @param list
     */
    public void addList(AlarmHistoryWithDetail list) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(list);
    }

}