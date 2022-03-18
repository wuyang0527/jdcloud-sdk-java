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
 * zkSpec
 */
public class ZkSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规格代码
     */
    private List<Flavor> flavors;

    /**
     * ZooKeeper节点的最小数目
     */
    private Integer minNum;

    /**
     * ZooKeeper节点的最大数目
     */
    private Integer maxNum;


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
     * get ZooKeeper节点的最小数目
     *
     * @return
     */
    public Integer getMinNum() {
        return minNum;
    }

    /**
     * set ZooKeeper节点的最小数目
     *
     * @param minNum
     */
    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }

    /**
     * get ZooKeeper节点的最大数目
     *
     * @return
     */
    public Integer getMaxNum() {
        return maxNum;
    }

    /**
     * set ZooKeeper节点的最大数目
     *
     * @param maxNum
     */
    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }


    /**
     * set 规格代码
     *
     * @param flavors
     */
    public ZkSpec flavors(List<Flavor> flavors) {
        this.flavors = flavors;
        return this;
    }

    /**
     * set ZooKeeper节点的最小数目
     *
     * @param minNum
     */
    public ZkSpec minNum(Integer minNum) {
        this.minNum = minNum;
        return this;
    }

    /**
     * set ZooKeeper节点的最大数目
     *
     * @param maxNum
     */
    public ZkSpec maxNum(Integer maxNum) {
        this.maxNum = maxNum;
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