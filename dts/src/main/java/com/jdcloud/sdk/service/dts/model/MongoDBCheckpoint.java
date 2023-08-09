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

package com.jdcloud.sdk.service.dts.model;


/**
 * mongoDBCheckpoint
 */
public class MongoDBCheckpoint  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 源端的名字
     */
    private String replset;

    /**
     * 已经拉取的checkpoint位点（不一定写入）
     */
    private MongoLSN lsn;

    /**
     * 已经成功写入目的端的checkpoint位点（已经成功写入，但是不一定持久化）
     */
    private MongoLSN lsnAck;

    /**
     * 已经成功持久化的checkpoint位点
     */
    private MongoLSN lsnCkpt;

    /**
     * 当前的时间
     */
    private MongoLSN now;



    /**
     * get 源端的名字
     *
     * @return
     */
    public String getReplset() {
        return replset;
    }

    /**
     * set 源端的名字
     *
     * @param replset
     */
    public void setReplset(String replset) {
        this.replset = replset;
    }


    /**
     * get 已经拉取的checkpoint位点（不一定写入）
     *
     * @return
     */
    public MongoLSN getLsn() {
        return lsn;
    }

    /**
     * set 已经拉取的checkpoint位点（不一定写入）
     *
     * @param lsn
     */
    public void setLsn(MongoLSN lsn) {
        this.lsn = lsn;
    }


    /**
     * get 已经成功写入目的端的checkpoint位点（已经成功写入，但是不一定持久化）
     *
     * @return
     */
    public MongoLSN getLsnAck() {
        return lsnAck;
    }

    /**
     * set 已经成功写入目的端的checkpoint位点（已经成功写入，但是不一定持久化）
     *
     * @param lsnAck
     */
    public void setLsnAck(MongoLSN lsnAck) {
        this.lsnAck = lsnAck;
    }


    /**
     * get 已经成功持久化的checkpoint位点
     *
     * @return
     */
    public MongoLSN getLsnCkpt() {
        return lsnCkpt;
    }

    /**
     * set 已经成功持久化的checkpoint位点
     *
     * @param lsnCkpt
     */
    public void setLsnCkpt(MongoLSN lsnCkpt) {
        this.lsnCkpt = lsnCkpt;
    }


    /**
     * get 当前的时间
     *
     * @return
     */
    public MongoLSN getNow() {
        return now;
    }

    /**
     * set 当前的时间
     *
     * @param now
     */
    public void setNow(MongoLSN now) {
        this.now = now;
    }



    /**
     * set 源端的名字
     *
     * @param replset
     */
    public MongoDBCheckpoint replset(String replset) {
        this.replset = replset;
        return this;
    }


    /**
     * set 已经拉取的checkpoint位点（不一定写入）
     *
     * @param lsn
     */
    public MongoDBCheckpoint lsn(MongoLSN lsn) {
        this.lsn = lsn;
        return this;
    }


    /**
     * set 已经成功写入目的端的checkpoint位点（已经成功写入，但是不一定持久化）
     *
     * @param lsnAck
     */
    public MongoDBCheckpoint lsnAck(MongoLSN lsnAck) {
        this.lsnAck = lsnAck;
        return this;
    }


    /**
     * set 已经成功持久化的checkpoint位点
     *
     * @param lsnCkpt
     */
    public MongoDBCheckpoint lsnCkpt(MongoLSN lsnCkpt) {
        this.lsnCkpt = lsnCkpt;
        return this;
    }


    /**
     * set 当前的时间
     *
     * @param now
     */
    public MongoDBCheckpoint now(MongoLSN now) {
        this.now = now;
        return this;
    }


}