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

package com.jdcloud.sdk.service.ydsms.model;


/**
 * receiptRecord
 */
public class ReceiptRecord  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 短信回执量
     */
    private Long receiptCount;

    /**
     * 短信未回执量
     */
    private Long unReceiptCount;

    /**
     * 短信回执率
     */
    private String receiptRate;

    /**
     * 短信回执成功量
     */
    private Long receiptSuccessCount;

    /**
     * 短信回执失败量
     */
    private Long receiptFailCount;

    /**
     * 短信回执成功率率
     */
    private String receiptSuccessRate;

    /**
     * 聚合开始时间
     */
    private String startTime;

    /**
     * 聚合截止时间
     */
    private String endTime;


    /**
     * get 短信回执量
     *
     * @return
     */
    public Long getReceiptCount() {
        return receiptCount;
    }

    /**
     * set 短信回执量
     *
     * @param receiptCount
     */
    public void setReceiptCount(Long receiptCount) {
        this.receiptCount = receiptCount;
    }

    /**
     * get 短信未回执量
     *
     * @return
     */
    public Long getUnReceiptCount() {
        return unReceiptCount;
    }

    /**
     * set 短信未回执量
     *
     * @param unReceiptCount
     */
    public void setUnReceiptCount(Long unReceiptCount) {
        this.unReceiptCount = unReceiptCount;
    }

    /**
     * get 短信回执率
     *
     * @return
     */
    public String getReceiptRate() {
        return receiptRate;
    }

    /**
     * set 短信回执率
     *
     * @param receiptRate
     */
    public void setReceiptRate(String receiptRate) {
        this.receiptRate = receiptRate;
    }

    /**
     * get 短信回执成功量
     *
     * @return
     */
    public Long getReceiptSuccessCount() {
        return receiptSuccessCount;
    }

    /**
     * set 短信回执成功量
     *
     * @param receiptSuccessCount
     */
    public void setReceiptSuccessCount(Long receiptSuccessCount) {
        this.receiptSuccessCount = receiptSuccessCount;
    }

    /**
     * get 短信回执失败量
     *
     * @return
     */
    public Long getReceiptFailCount() {
        return receiptFailCount;
    }

    /**
     * set 短信回执失败量
     *
     * @param receiptFailCount
     */
    public void setReceiptFailCount(Long receiptFailCount) {
        this.receiptFailCount = receiptFailCount;
    }

    /**
     * get 短信回执成功率率
     *
     * @return
     */
    public String getReceiptSuccessRate() {
        return receiptSuccessRate;
    }

    /**
     * set 短信回执成功率率
     *
     * @param receiptSuccessRate
     */
    public void setReceiptSuccessRate(String receiptSuccessRate) {
        this.receiptSuccessRate = receiptSuccessRate;
    }

    /**
     * get 聚合开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 聚合开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 聚合截止时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 聚合截止时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * set 短信回执量
     *
     * @param receiptCount
     */
    public ReceiptRecord receiptCount(Long receiptCount) {
        this.receiptCount = receiptCount;
        return this;
    }

    /**
     * set 短信未回执量
     *
     * @param unReceiptCount
     */
    public ReceiptRecord unReceiptCount(Long unReceiptCount) {
        this.unReceiptCount = unReceiptCount;
        return this;
    }

    /**
     * set 短信回执率
     *
     * @param receiptRate
     */
    public ReceiptRecord receiptRate(String receiptRate) {
        this.receiptRate = receiptRate;
        return this;
    }

    /**
     * set 短信回执成功量
     *
     * @param receiptSuccessCount
     */
    public ReceiptRecord receiptSuccessCount(Long receiptSuccessCount) {
        this.receiptSuccessCount = receiptSuccessCount;
        return this;
    }

    /**
     * set 短信回执失败量
     *
     * @param receiptFailCount
     */
    public ReceiptRecord receiptFailCount(Long receiptFailCount) {
        this.receiptFailCount = receiptFailCount;
        return this;
    }

    /**
     * set 短信回执成功率率
     *
     * @param receiptSuccessRate
     */
    public ReceiptRecord receiptSuccessRate(String receiptSuccessRate) {
        this.receiptSuccessRate = receiptSuccessRate;
        return this;
    }

    /**
     * set 聚合开始时间
     *
     * @param startTime
     */
    public ReceiptRecord startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 聚合截止时间
     *
     * @param endTime
     */
    public ReceiptRecord endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


}