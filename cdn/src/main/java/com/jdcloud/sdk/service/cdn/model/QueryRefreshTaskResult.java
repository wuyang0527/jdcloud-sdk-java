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
 * CDN刷新预热类接口
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
import com.jdcloud.sdk.service.cdn.model.RefreshTask;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询刷新预热任务
 */
public class QueryRefreshTaskResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总的刷新预热条数.
     */
    private Integer total;

    /**
     * tasks
     */
    
    private List<RefreshTask> tasks;


    /**
     * get 总的刷新预热条数.
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * set 总的刷新预热条数.
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }


    /**
    * get tasks
    *
    * @return
    */
    public List<RefreshTask> getTasks() {
        return tasks;
    }

    /**
    * set tasks
    *
    * @param tasks
    */
    public void setTasks(List<RefreshTask> tasks) {
        this.tasks = tasks;
    }



    /**
     * set 总的刷新预热条数.
     *
     * @param total
     */
    public QueryRefreshTaskResult total(Integer total) {
        this.total = total;
        return this;
    }


    /**
    * set tasks
    *
    * @param tasks
    */
    public QueryRefreshTaskResult tasks(List<RefreshTask> tasks) {
        this.tasks = tasks;
        return this;
    }



    /**
     * add item to tasks
     *
     * @param task
     */
    public void addTask(RefreshTask task) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(task);
    }
}