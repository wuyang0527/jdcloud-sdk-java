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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clickhouse.model;

import java.util.List;
import java.util.ArrayList;

/**
 * chSpec
 */
public class ChSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规格代码
     */
    private List<Flavor> flavors;

    /**
     * 支持的最大分片数
     */
    private Integer partitionMaxNum;

    /**
     * 支持的最大副本数
     */
    private Integer replicaMaxNum;


    /**
     * get 规格代码
     *
     * @return
     */
    public List<Flavor> getFlavors() {
        return flavors;
    }

    /**
     * set 规格代码
     *
     * @param flavors
     */
    public void setFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
    }

    /**
     * get 支持的最大分片数
     *
     * @return
     */
    public Integer getPartitionMaxNum() {
        return partitionMaxNum;
    }

    /**
     * set 支持的最大分片数
     *
     * @param partitionMaxNum
     */
    public void setPartitionMaxNum(Integer partitionMaxNum) {
        this.partitionMaxNum = partitionMaxNum;
    }

    /**
     * get 支持的最大副本数
     *
     * @return
     */
    public Integer getReplicaMaxNum() {
        return replicaMaxNum;
    }

    /**
     * set 支持的最大副本数
     *
     * @param replicaMaxNum
     */
    public void setReplicaMaxNum(Integer replicaMaxNum) {
        this.replicaMaxNum = replicaMaxNum;
    }


    /**
     * set 规格代码
     *
     * @param flavors
     */
    public ChSpec flavors(List<Flavor> flavors) {
        this.flavors = flavors;
        return this;
    }

    /**
     * set 支持的最大分片数
     *
     * @param partitionMaxNum
     */
    public ChSpec partitionMaxNum(Integer partitionMaxNum) {
        this.partitionMaxNum = partitionMaxNum;
        return this;
    }

    /**
     * set 支持的最大副本数
     *
     * @param replicaMaxNum
     */
    public ChSpec replicaMaxNum(Integer replicaMaxNum) {
        this.replicaMaxNum = replicaMaxNum;
        return this;
    }


    /**
     * add item to 规格代码
     *
     * @param flavor
     */
    public void addFlavor(Flavor flavor) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavor);
    }

}