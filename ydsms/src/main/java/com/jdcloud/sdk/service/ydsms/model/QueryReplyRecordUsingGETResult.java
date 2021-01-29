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
 * 云鼎短信服务-应用相关接口
 * 云鼎短信服务-应用相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ydsms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ydsms.model.ReplyRecord;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询短信回复记录
 */
public class QueryReplyRecordUsingGETResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * replyRecords
     */
    private List<ReplyRecord> replyRecords;

    /**
     * totalCount
     */
    private Long totalCount;


    /**
     * get replyRecords
     *
     * @return
     */
    public List<ReplyRecord> getReplyRecords() {
        return replyRecords;
    }

    /**
     * set replyRecords
     *
     * @param replyRecords
     */
    public void setReplyRecords(List<ReplyRecord> replyRecords) {
        this.replyRecords = replyRecords;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set replyRecords
     *
     * @param replyRecords
     */
    public QueryReplyRecordUsingGETResult replyRecords(List<ReplyRecord> replyRecords) {
        this.replyRecords = replyRecords;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public QueryReplyRecordUsingGETResult totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to replyRecords
     *
     * @param replyRecord
     */
    public void addReplyRecord(ReplyRecord replyRecord) {
        if (this.replyRecords == null) {
            this.replyRecords = new ArrayList<>();
        }
        this.replyRecords.add(replyRecord);
    }

}