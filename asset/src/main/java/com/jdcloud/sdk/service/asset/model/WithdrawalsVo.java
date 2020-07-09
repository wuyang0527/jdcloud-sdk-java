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

package com.jdcloud.sdk.service.asset.model;


/**
 * withdrawalsVo
 */
public class WithdrawalsVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * createTime
     */
    private String createTime;

    /**
     * fee
     */
    private Double fee;

    /**
     * id
     */
    private Long id;

    /**
     * pin
     */
    private String pin;

    /**
     * remark
     */
    private String remark;

    /**
     * status
     */
    private Integer status;

    /**
     * updateTime
     */
    private String updateTime;

    /**
     * usableFee
     */
    private Double usableFee;

    /**
     * withdrawalsId
     */
    private String withdrawalsId;


    /**
     * get createTime
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get fee
     *
     * @return
     */
    public Double getFee() {
        return fee;
    }

    /**
     * set fee
     *
     * @param fee
     */
    public void setFee(Double fee) {
        this.fee = fee;
    }

    /**
     * get id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get remark
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set remark
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * get status
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set status
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get usableFee
     *
     * @return
     */
    public Double getUsableFee() {
        return usableFee;
    }

    /**
     * set usableFee
     *
     * @param usableFee
     */
    public void setUsableFee(Double usableFee) {
        this.usableFee = usableFee;
    }

    /**
     * get withdrawalsId
     *
     * @return
     */
    public String getWithdrawalsId() {
        return withdrawalsId;
    }

    /**
     * set withdrawalsId
     *
     * @param withdrawalsId
     */
    public void setWithdrawalsId(String withdrawalsId) {
        this.withdrawalsId = withdrawalsId;
    }


    /**
     * set createTime
     *
     * @param createTime
     */
    public WithdrawalsVo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set fee
     *
     * @param fee
     */
    public WithdrawalsVo fee(Double fee) {
        this.fee = fee;
        return this;
    }

    /**
     * set id
     *
     * @param id
     */
    public WithdrawalsVo id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public WithdrawalsVo pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set remark
     *
     * @param remark
     */
    public WithdrawalsVo remark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * set status
     *
     * @param status
     */
    public WithdrawalsVo status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public WithdrawalsVo updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set usableFee
     *
     * @param usableFee
     */
    public WithdrawalsVo usableFee(Double usableFee) {
        this.usableFee = usableFee;
        return this;
    }

    /**
     * set withdrawalsId
     *
     * @param withdrawalsId
     */
    public WithdrawalsVo withdrawalsId(String withdrawalsId) {
        this.withdrawalsId = withdrawalsId;
        return this;
    }


}