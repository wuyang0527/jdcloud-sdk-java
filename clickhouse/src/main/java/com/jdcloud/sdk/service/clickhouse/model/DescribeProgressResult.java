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
 * 实例管理
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clickhouse.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询 Clickhouse 集群进度
 */
public class DescribeProgressResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 就绪的域名个数
     */
    private Integer instanceReadyDomain;

    /**
     * 总域名个数
     */
    private Integer instanceTotalDomain;

    /**
     * 就绪的节点个数
     */
    private Integer instanceReadyNode;

    /**
     * 总节点个数
     */
    private Integer instanceTotalNode;


    /**
     * get 就绪的域名个数
     *
     * @return
     */
    public Integer getInstanceReadyDomain() {
        return instanceReadyDomain;
    }

    /**
     * set 就绪的域名个数
     *
     * @param instanceReadyDomain
     */
    public void setInstanceReadyDomain(Integer instanceReadyDomain) {
        this.instanceReadyDomain = instanceReadyDomain;
    }

    /**
     * get 总域名个数
     *
     * @return
     */
    public Integer getInstanceTotalDomain() {
        return instanceTotalDomain;
    }

    /**
     * set 总域名个数
     *
     * @param instanceTotalDomain
     */
    public void setInstanceTotalDomain(Integer instanceTotalDomain) {
        this.instanceTotalDomain = instanceTotalDomain;
    }

    /**
     * get 就绪的节点个数
     *
     * @return
     */
    public Integer getInstanceReadyNode() {
        return instanceReadyNode;
    }

    /**
     * set 就绪的节点个数
     *
     * @param instanceReadyNode
     */
    public void setInstanceReadyNode(Integer instanceReadyNode) {
        this.instanceReadyNode = instanceReadyNode;
    }

    /**
     * get 总节点个数
     *
     * @return
     */
    public Integer getInstanceTotalNode() {
        return instanceTotalNode;
    }

    /**
     * set 总节点个数
     *
     * @param instanceTotalNode
     */
    public void setInstanceTotalNode(Integer instanceTotalNode) {
        this.instanceTotalNode = instanceTotalNode;
    }


    /**
     * set 就绪的域名个数
     *
     * @param instanceReadyDomain
     */
    public DescribeProgressResult instanceReadyDomain(Integer instanceReadyDomain) {
        this.instanceReadyDomain = instanceReadyDomain;
        return this;
    }

    /**
     * set 总域名个数
     *
     * @param instanceTotalDomain
     */
    public DescribeProgressResult instanceTotalDomain(Integer instanceTotalDomain) {
        this.instanceTotalDomain = instanceTotalDomain;
        return this;
    }

    /**
     * set 就绪的节点个数
     *
     * @param instanceReadyNode
     */
    public DescribeProgressResult instanceReadyNode(Integer instanceReadyNode) {
        this.instanceReadyNode = instanceReadyNode;
        return this;
    }

    /**
     * set 总节点个数
     *
     * @param instanceTotalNode
     */
    public DescribeProgressResult instanceTotalNode(Integer instanceTotalNode) {
        this.instanceTotalNode = instanceTotalNode;
        return this;
    }


}