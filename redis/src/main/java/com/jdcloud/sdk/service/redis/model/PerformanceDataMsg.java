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
 * 客户端性能日志信息
 */
public class PerformanceDataMsg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户端ip
     */
    private String ip;

    /**
     * 客户端性能日志数据
     */
    private TpStat tpStat;


    /**
     * get 客户端ip
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 客户端ip
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 客户端性能日志数据
     *
     * @return
     */
    public TpStat getTpStat() {
        return tpStat;
    }

    /**
     * set 客户端性能日志数据
     *
     * @param tpStat
     */
    public void setTpStat(TpStat tpStat) {
        this.tpStat = tpStat;
    }


    /**
     * set 客户端ip
     *
     * @param ip
     */
    public PerformanceDataMsg ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 客户端性能日志数据
     *
     * @param tpStat
     */
    public PerformanceDataMsg tpStat(TpStat tpStat) {
        this.tpStat = tpStat;
        return this;
    }


}