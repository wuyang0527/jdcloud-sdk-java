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

package com.jdcloud.sdk.service.vm.model;


/**
 * instanceTypeBurstInfo
 */
public class InstanceTypeBurstInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 每小时获得的积分数
     */
    private Float creditsEarnedPerHour;

    /**
     * 基准性能倍率
     */
    private Float basePerformance;



    /**
     * get 每小时获得的积分数
     *
     * @return
     */
    public Float getCreditsEarnedPerHour() {
        return creditsEarnedPerHour;
    }

    /**
     * set 每小时获得的积分数
     *
     * @param creditsEarnedPerHour
     */
    public void setCreditsEarnedPerHour(Float creditsEarnedPerHour) {
        this.creditsEarnedPerHour = creditsEarnedPerHour;
    }


    /**
     * get 基准性能倍率
     *
     * @return
     */
    public Float getBasePerformance() {
        return basePerformance;
    }

    /**
     * set 基准性能倍率
     *
     * @param basePerformance
     */
    public void setBasePerformance(Float basePerformance) {
        this.basePerformance = basePerformance;
    }



    /**
     * set 每小时获得的积分数
     *
     * @param creditsEarnedPerHour
     */
    public InstanceTypeBurstInfo creditsEarnedPerHour(Float creditsEarnedPerHour) {
        this.creditsEarnedPerHour = creditsEarnedPerHour;
        return this;
    }


    /**
     * set 基准性能倍率
     *
     * @param basePerformance
     */
    public InstanceTypeBurstInfo basePerformance(Float basePerformance) {
        this.basePerformance = basePerformance;
        return this;
    }


}