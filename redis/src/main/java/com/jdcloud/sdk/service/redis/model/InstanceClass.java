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


/**
 * 某缓存Redis实例规格信息
 */
public class InstanceClass  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例规格代码,参见实例规格代码表
     */
    private String instanceClass;

    /**
     * cpu
     */
    private Integer cpu;

    /**
     * 内存
     */
    private Integer memoryMB;

    /**
     * 磁盘
     */
    private Integer diskGB;

    /**
     * 最大链接数
     */
    private Integer maxConnetction;

    /**
     * 带宽
     */
    private Integer bandwidthMbps;


    /**
     * get 实例规格代码,参见实例规格代码表
     *
     * @return
     */
    public String getInstanceClass() {
        return instanceClass;
    }

    /**
     * set 实例规格代码,参见实例规格代码表
     *
     * @param instanceClass
     */
    public void setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
    }

    /**
     * get cpu
     *
     * @return
     */
    public Integer getCpu() {
        return cpu;
    }

    /**
     * set cpu
     *
     * @param cpu
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * get 内存
     *
     * @return
     */
    public Integer getMemoryMB() {
        return memoryMB;
    }

    /**
     * set 内存
     *
     * @param memoryMB
     */
    public void setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
    }

    /**
     * get 磁盘
     *
     * @return
     */
    public Integer getDiskGB() {
        return diskGB;
    }

    /**
     * set 磁盘
     *
     * @param diskGB
     */
    public void setDiskGB(Integer diskGB) {
        this.diskGB = diskGB;
    }

    /**
     * get 最大链接数
     *
     * @return
     */
    public Integer getMaxConnetction() {
        return maxConnetction;
    }

    /**
     * set 最大链接数
     *
     * @param maxConnetction
     */
    public void setMaxConnetction(Integer maxConnetction) {
        this.maxConnetction = maxConnetction;
    }

    /**
     * get 带宽
     *
     * @return
     */
    public Integer getBandwidthMbps() {
        return bandwidthMbps;
    }

    /**
     * set 带宽
     *
     * @param bandwidthMbps
     */
    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }


    /**
     * set 实例规格代码,参见实例规格代码表
     *
     * @param instanceClass
     */
    public InstanceClass instanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }

    /**
     * set cpu
     *
     * @param cpu
     */
    public InstanceClass cpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * set 内存
     *
     * @param memoryMB
     */
    public InstanceClass memoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }

    /**
     * set 磁盘
     *
     * @param diskGB
     */
    public InstanceClass diskGB(Integer diskGB) {
        this.diskGB = diskGB;
        return this;
    }

    /**
     * set 最大链接数
     *
     * @param maxConnetction
     */
    public InstanceClass maxConnetction(Integer maxConnetction) {
        this.maxConnetction = maxConnetction;
        return this;
    }

    /**
     * set 带宽
     *
     * @param bandwidthMbps
     */
    public InstanceClass bandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
        return this;
    }


}