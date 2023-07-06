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

package com.jdcloud.sdk.service.ag.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 步进规则信息
 */
public class StepAsRuleInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 步进规则关联的告警任务
     */
    private AsAlarmInfoByAsRule asAlarm;

    /**
     * 伸缩调整方式，取值范围：[&#x60;Number&#x60;,&#x60;Percentage&#x60;,&#x60;Total&#x60;]
- &#x60;Number&#x60;：增加或减少指定数量的实例
- &#x60;Percentage&#x60;：增加或减少指定百分比的实例
- &#x60;Total&#x60;：将当前伸缩组的实例数量调整到指定数量

     */
    private String adjustmentType;

    /**
     * 步进调整策略数组
     */
    
    private List<StepAdjustmentInfo> stepAdjustments;


    /**
     * get 步进规则关联的告警任务
     *
     * @return
     */
    public AsAlarmInfoByAsRule getAsAlarm() {
        return asAlarm;
    }

    /**
     * set 步进规则关联的告警任务
     *
     * @param asAlarm
     */
    public void setAsAlarm(AsAlarmInfoByAsRule asAlarm) {
        this.asAlarm = asAlarm;
    }


    /**
     * get 伸缩调整方式，取值范围：[&#x60;Number&#x60;,&#x60;Percentage&#x60;,&#x60;Total&#x60;]
- &#x60;Number&#x60;：增加或减少指定数量的实例
- &#x60;Percentage&#x60;：增加或减少指定百分比的实例
- &#x60;Total&#x60;：将当前伸缩组的实例数量调整到指定数量

     *
     * @return
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * set 伸缩调整方式，取值范围：[&#x60;Number&#x60;,&#x60;Percentage&#x60;,&#x60;Total&#x60;]
- &#x60;Number&#x60;：增加或减少指定数量的实例
- &#x60;Percentage&#x60;：增加或减少指定百分比的实例
- &#x60;Total&#x60;：将当前伸缩组的实例数量调整到指定数量

     *
     * @param adjustmentType
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }


    /**
    * get 步进调整策略数组
    *
    * @return
    */
    public List<StepAdjustmentInfo> getStepAdjustments() {
        return stepAdjustments;
    }

    /**
    * set 步进调整策略数组
    *
    * @param stepAdjustments
    */
    public void setStepAdjustments(List<StepAdjustmentInfo> stepAdjustments) {
        this.stepAdjustments = stepAdjustments;
    }



    /**
     * set 步进规则关联的告警任务
     *
     * @param asAlarm
     */
    public StepAsRuleInfo asAlarm(AsAlarmInfoByAsRule asAlarm) {
        this.asAlarm = asAlarm;
        return this;
    }


    /**
     * set 伸缩调整方式，取值范围：[&#x60;Number&#x60;,&#x60;Percentage&#x60;,&#x60;Total&#x60;]
- &#x60;Number&#x60;：增加或减少指定数量的实例
- &#x60;Percentage&#x60;：增加或减少指定百分比的实例
- &#x60;Total&#x60;：将当前伸缩组的实例数量调整到指定数量

     *
     * @param adjustmentType
     */
    public StepAsRuleInfo adjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }


    /**
    * set 步进调整策略数组
    *
    * @param stepAdjustments
    */
    public StepAsRuleInfo stepAdjustments(List<StepAdjustmentInfo> stepAdjustments) {
        this.stepAdjustments = stepAdjustments;
        return this;
    }



    /**
     * add item to 步进调整策略数组
     *
     * @param stepAdjustment
     */
    public void addStepAdjustment(StepAdjustmentInfo stepAdjustment) {
        if (this.stepAdjustments == null) {
            this.stepAdjustments = new ArrayList<>();
        }
        this.stepAdjustments.add(stepAdjustment);
    }
}