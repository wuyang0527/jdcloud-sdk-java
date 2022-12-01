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
 * DmsOnlineSqlTask
 * 任务管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dms.model.DmsOnlineProxySubTask;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询sql子任务状态
 */
public class OnlineProxySubTaskQueryResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dmsOnlineProxySubTasks
     */
    
    private List<DmsOnlineProxySubTask> dmsOnlineProxySubTasks;


    /**
    * get dmsOnlineProxySubTasks
    *
    * @return
    */
    public List<DmsOnlineProxySubTask> getDmsOnlineProxySubTasks() {
        return dmsOnlineProxySubTasks;
    }

    /**
    * set dmsOnlineProxySubTasks
    *
    * @param dmsOnlineProxySubTasks
    */
    public void setDmsOnlineProxySubTasks(List<DmsOnlineProxySubTask> dmsOnlineProxySubTasks) {
        this.dmsOnlineProxySubTasks = dmsOnlineProxySubTasks;
    }



    /**
    * set dmsOnlineProxySubTasks
    *
    * @param dmsOnlineProxySubTasks
    */
    public OnlineProxySubTaskQueryResult dmsOnlineProxySubTasks(List<DmsOnlineProxySubTask> dmsOnlineProxySubTasks) {
        this.dmsOnlineProxySubTasks = dmsOnlineProxySubTasks;
        return this;
    }



    /**
     * add item to dmsOnlineProxySubTasks
     *
     * @param dmsOnlineProxySubTask
     */
    public void addDmsOnlineProxySubTask(DmsOnlineProxySubTask dmsOnlineProxySubTask) {
        if (this.dmsOnlineProxySubTasks == null) {
            this.dmsOnlineProxySubTasks = new ArrayList<>();
        }
        this.dmsOnlineProxySubTasks.add(dmsOnlineProxySubTask);
    }
}