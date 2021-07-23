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
 * Redis Instance API
 * 缓存Redis实例的创建、删除、修改基本信息、设置密码、变配、实例列表、备份、配置参数等接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.redis.model.TaskProgress;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询正在执行的任务进度列表
 */
public class DescribeTaskProgressListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * taskProgresses
     */
    private List<TaskProgress> taskProgresses;


    /**
     * get taskProgresses
     *
     * @return
     */
    public List<TaskProgress> getTaskProgresses() {
        return taskProgresses;
    }

    /**
     * set taskProgresses
     *
     * @param taskProgresses
     */
    public void setTaskProgresses(List<TaskProgress> taskProgresses) {
        this.taskProgresses = taskProgresses;
    }


    /**
     * set taskProgresses
     *
     * @param taskProgresses
     */
    public DescribeTaskProgressListResult taskProgresses(List<TaskProgress> taskProgresses) {
        this.taskProgresses = taskProgresses;
        return this;
    }


    /**
     * add item to taskProgresses
     *
     * @param taskProgresse
     */
    public void addTaskProgresse(TaskProgress taskProgresse) {
        if (this.taskProgresses == null) {
            this.taskProgresses = new ArrayList<>();
        }
        this.taskProgresses.add(taskProgresse);
    }

}