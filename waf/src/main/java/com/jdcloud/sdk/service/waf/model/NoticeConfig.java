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

package com.jdcloud.sdk.service.waf.model;


/**
 * noticeConfig
 */
public class NoticeConfig  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id序号
     */
    private Integer id;

    /**
     * 公告类型,1-规则更新通知，2-功能更新公告
     */
    private Integer noticeType;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容类型
     */
    private Integer docType;

    /**
     * 更新时间，s
     */
    private Integer updateTime;


    /**
     * get id序号
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id序号
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 公告类型,1-规则更新通知，2-功能更新公告
     *
     * @return
     */
    public Integer getNoticeType() {
        return noticeType;
    }

    /**
     * set 公告类型,1-规则更新通知，2-功能更新公告
     *
     * @param noticeType
     */
    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
    }

    /**
     * get 标题
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set 标题
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get 内容类型
     *
     * @return
     */
    public Integer getDocType() {
        return docType;
    }

    /**
     * set 内容类型
     *
     * @param docType
     */
    public void setDocType(Integer docType) {
        this.docType = docType;
    }

    /**
     * get 更新时间，s
     *
     * @return
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间，s
     *
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set id序号
     *
     * @param id
     */
    public NoticeConfig id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 公告类型,1-规则更新通知，2-功能更新公告
     *
     * @param noticeType
     */
    public NoticeConfig noticeType(Integer noticeType) {
        this.noticeType = noticeType;
        return this;
    }

    /**
     * set 标题
     *
     * @param title
     */
    public NoticeConfig title(String title) {
        this.title = title;
        return this;
    }

    /**
     * set 内容类型
     *
     * @param docType
     */
    public NoticeConfig docType(Integer docType) {
        this.docType = docType;
        return this;
    }

    /**
     * set 更新时间，s
     *
     * @param updateTime
     */
    public NoticeConfig updateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}