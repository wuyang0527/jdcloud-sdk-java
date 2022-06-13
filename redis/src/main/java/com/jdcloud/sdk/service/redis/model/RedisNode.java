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

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * Redis节点信息
 */
public class RedisNode  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 节点名称，唯一标识一个节点
     * Required:true
     */
    @Required
    private String name;

    /**
     * 节点分片ID，从0开始
     * Required:true
     */
    @Required
    private String shardId;

    /**
     * 节点角色，master表示主节点，slave表示从节点
     */
    private String role;

    /**
     * 节点访问地址
     */
    private String address;

    /**
     * 节点所属AZ
     */
    private String az;

    /**
     * 节点状态，running表示节点正常，error表示节点异常
     */
    private String status;

    /**
     * 节点负责的Slot个数
     */
    private Integer slots;

    /**
     * 节点已使用内存，单位Byte
     */
    private Integer usedMemory;

    /**
     * 节点总内存，单位Byte
     */
    private Integer maxMemory;


    /**
     * get 节点名称，唯一标识一个节点
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 节点名称，唯一标识一个节点
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 节点分片ID，从0开始
     *
     * @return
     */
    public String getShardId() {
        return shardId;
    }

    /**
     * set 节点分片ID，从0开始
     *
     * @param shardId
     */
    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    /**
     * get 节点角色，master表示主节点，slave表示从节点
     *
     * @return
     */
    public String getRole() {
        return role;
    }

    /**
     * set 节点角色，master表示主节点，slave表示从节点
     *
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * get 节点访问地址
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * set 节点访问地址
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * get 节点所属AZ
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 节点所属AZ
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 节点状态，running表示节点正常，error表示节点异常
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 节点状态，running表示节点正常，error表示节点异常
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 节点负责的Slot个数
     *
     * @return
     */
    public Integer getSlots() {
        return slots;
    }

    /**
     * set 节点负责的Slot个数
     *
     * @param slots
     */
    public void setSlots(Integer slots) {
        this.slots = slots;
    }

    /**
     * get 节点已使用内存，单位Byte
     *
     * @return
     */
    public Integer getUsedMemory() {
        return usedMemory;
    }

    /**
     * set 节点已使用内存，单位Byte
     *
     * @param usedMemory
     */
    public void setUsedMemory(Integer usedMemory) {
        this.usedMemory = usedMemory;
    }

    /**
     * get 节点总内存，单位Byte
     *
     * @return
     */
    public Integer getMaxMemory() {
        return maxMemory;
    }

    /**
     * set 节点总内存，单位Byte
     *
     * @param maxMemory
     */
    public void setMaxMemory(Integer maxMemory) {
        this.maxMemory = maxMemory;
    }


    /**
     * set 节点名称，唯一标识一个节点
     *
     * @param name
     */
    public RedisNode name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 节点分片ID，从0开始
     *
     * @param shardId
     */
    public RedisNode shardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * set 节点角色，master表示主节点，slave表示从节点
     *
     * @param role
     */
    public RedisNode role(String role) {
        this.role = role;
        return this;
    }

    /**
     * set 节点访问地址
     *
     * @param address
     */
    public RedisNode address(String address) {
        this.address = address;
        return this;
    }

    /**
     * set 节点所属AZ
     *
     * @param az
     */
    public RedisNode az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 节点状态，running表示节点正常，error表示节点异常
     *
     * @param status
     */
    public RedisNode status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 节点负责的Slot个数
     *
     * @param slots
     */
    public RedisNode slots(Integer slots) {
        this.slots = slots;
        return this;
    }

    /**
     * set 节点已使用内存，单位Byte
     *
     * @param usedMemory
     */
    public RedisNode usedMemory(Integer usedMemory) {
        this.usedMemory = usedMemory;
        return this;
    }

    /**
     * set 节点总内存，单位Byte
     *
     * @param maxMemory
     */
    public RedisNode maxMemory(Integer maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }


}