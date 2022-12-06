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
 * Data-Replication
 * TiCDC复制管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.tidb.model.ReplicationTask;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询当前实例下所有的复制任务。
 */
public class DescribeReplicationsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总记录数
     */
    private Integer totalCount;

    /**
     * 要复制的对象
     */
    
    private List<ReplicationTask> replications;


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
    * get 要复制的对象
    *
    * @return
    */
    public List<ReplicationTask> getReplications() {
        return replications;
    }

    /**
    * set 要复制的对象
    *
    * @param replications
    */
    public void setReplications(List<ReplicationTask> replications) {
        this.replications = replications;
    }



    /**
     * set 总记录数
     *
     * @param totalCount
     */
    public DescribeReplicationsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
    * set 要复制的对象
    *
    * @param replications
    */
    public DescribeReplicationsResult replications(List<ReplicationTask> replications) {
        this.replications = replications;
        return this;
    }



    /**
     * add item to 要复制的对象
     *
     * @param replication
     */
    public void addReplication(ReplicationTask replication) {
        if (this.replications == null) {
            this.replications = new ArrayList<>();
        }
        this.replications.add(replication);
    }
}