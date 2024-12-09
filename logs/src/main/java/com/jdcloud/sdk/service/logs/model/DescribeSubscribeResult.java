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
 * Subscribe APIs
 * 日志服务日志消费相关的管理控制接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 日志消费信息
 */
public class DescribeSubscribeResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * createdTime
     */
    private String createdTime;

    /**
     * kafka接入点
     */
    private String kafkaBroker;

    /**
     * kafka 用户密码
     */
    private String kafkaPassword;

    /**
     * kafka Topic
     */
    private String kafkaTopic;

    /**
     * kafka 用户名
     */
    private String kafkaUsername;

    /**
     * 日志主体
     */
    private String logtopicId;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 日志订阅状态，0表示未创建，1表示已创建，2表示开启，3表示关闭
     */
    private Long status;

    /**
     * updatedTime
     */
    private String updatedTime;



    /**
     * get createdTime
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set createdTime
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * get kafka接入点
     *
     * @return
     */
    public String getKafkaBroker() {
        return kafkaBroker;
    }

    /**
     * set kafka接入点
     *
     * @param kafkaBroker
     */
    public void setKafkaBroker(String kafkaBroker) {
        this.kafkaBroker = kafkaBroker;
    }


    /**
     * get kafka 用户密码
     *
     * @return
     */
    public String getKafkaPassword() {
        return kafkaPassword;
    }

    /**
     * set kafka 用户密码
     *
     * @param kafkaPassword
     */
    public void setKafkaPassword(String kafkaPassword) {
        this.kafkaPassword = kafkaPassword;
    }


    /**
     * get kafka Topic
     *
     * @return
     */
    public String getKafkaTopic() {
        return kafkaTopic;
    }

    /**
     * set kafka Topic
     *
     * @param kafkaTopic
     */
    public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
    }


    /**
     * get kafka 用户名
     *
     * @return
     */
    public String getKafkaUsername() {
        return kafkaUsername;
    }

    /**
     * set kafka 用户名
     *
     * @param kafkaUsername
     */
    public void setKafkaUsername(String kafkaUsername) {
        this.kafkaUsername = kafkaUsername;
    }


    /**
     * get 日志主体
     *
     * @return
     */
    public String getLogtopicId() {
        return logtopicId;
    }

    /**
     * set 日志主体
     *
     * @param logtopicId
     */
    public void setLogtopicId(String logtopicId) {
        this.logtopicId = logtopicId;
    }


    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 日志订阅状态，0表示未创建，1表示已创建，2表示开启，3表示关闭
     *
     * @return
     */
    public Long getStatus() {
        return status;
    }

    /**
     * set 日志订阅状态，0表示未创建，1表示已创建，2表示开启，3表示关闭
     *
     * @param status
     */
    public void setStatus(Long status) {
        this.status = status;
    }


    /**
     * get updatedTime
     *
     * @return
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * set updatedTime
     *
     * @param updatedTime
     */
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }



    /**
     * set createdTime
     *
     * @param createdTime
     */
    public DescribeSubscribeResult createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


    /**
     * set kafka接入点
     *
     * @param kafkaBroker
     */
    public DescribeSubscribeResult kafkaBroker(String kafkaBroker) {
        this.kafkaBroker = kafkaBroker;
        return this;
    }


    /**
     * set kafka 用户密码
     *
     * @param kafkaPassword
     */
    public DescribeSubscribeResult kafkaPassword(String kafkaPassword) {
        this.kafkaPassword = kafkaPassword;
        return this;
    }


    /**
     * set kafka Topic
     *
     * @param kafkaTopic
     */
    public DescribeSubscribeResult kafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
        return this;
    }


    /**
     * set kafka 用户名
     *
     * @param kafkaUsername
     */
    public DescribeSubscribeResult kafkaUsername(String kafkaUsername) {
        this.kafkaUsername = kafkaUsername;
        return this;
    }


    /**
     * set 日志主体
     *
     * @param logtopicId
     */
    public DescribeSubscribeResult logtopicId(String logtopicId) {
        this.logtopicId = logtopicId;
        return this;
    }


    /**
     * set 用户pin
     *
     * @param pin
     */
    public DescribeSubscribeResult pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 日志订阅状态，0表示未创建，1表示已创建，2表示开启，3表示关闭
     *
     * @param status
     */
    public DescribeSubscribeResult status(Long status) {
        this.status = status;
        return this;
    }


    /**
     * set updatedTime
     *
     * @param updatedTime
     */
    public DescribeSubscribeResult updatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }


}