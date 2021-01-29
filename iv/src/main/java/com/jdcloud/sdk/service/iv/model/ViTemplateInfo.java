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

package com.jdcloud.sdk.service.iv.model;


/**
 * 模板信息
 */
public class ViTemplateInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板ID
     */
    private String templateId;

    /**
     * 模板名称。长度不超过128个字符。UTF-8编码。

     */
    private String templateName;

    /**
     * 截图间隔
     */
    private Integer shotInterval;

    /**
     * 间隔类型：time, percent
     */
    private String shotIntervalType;

    /**
     * 截图格式：png, jpg
     */
    private String shotFormat;

    /**
     * 截图帧类型：any, key
     */
    private String shotFrameType;

    /**
     * 截图宽度
     */
    private Integer shotWidth;

    /**
     * 截图高度
     */
    private Integer shotHeight;

    /**
     * 截图填充类型：stretch, gauss, black, white
     */
    private String shotFillType;

    /**
     * 审查配置，JSON格式
     */
    private String inspectItems;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;


    /**
     * get 模板ID
     *
     * @return
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * set 模板ID
     *
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * get 模板名称。长度不超过128个字符。UTF-8编码。

     *
     * @return
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * set 模板名称。长度不超过128个字符。UTF-8编码。

     *
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * get 截图间隔
     *
     * @return
     */
    public Integer getShotInterval() {
        return shotInterval;
    }

    /**
     * set 截图间隔
     *
     * @param shotInterval
     */
    public void setShotInterval(Integer shotInterval) {
        this.shotInterval = shotInterval;
    }

    /**
     * get 间隔类型：time, percent
     *
     * @return
     */
    public String getShotIntervalType() {
        return shotIntervalType;
    }

    /**
     * set 间隔类型：time, percent
     *
     * @param shotIntervalType
     */
    public void setShotIntervalType(String shotIntervalType) {
        this.shotIntervalType = shotIntervalType;
    }

    /**
     * get 截图格式：png, jpg
     *
     * @return
     */
    public String getShotFormat() {
        return shotFormat;
    }

    /**
     * set 截图格式：png, jpg
     *
     * @param shotFormat
     */
    public void setShotFormat(String shotFormat) {
        this.shotFormat = shotFormat;
    }

    /**
     * get 截图帧类型：any, key
     *
     * @return
     */
    public String getShotFrameType() {
        return shotFrameType;
    }

    /**
     * set 截图帧类型：any, key
     *
     * @param shotFrameType
     */
    public void setShotFrameType(String shotFrameType) {
        this.shotFrameType = shotFrameType;
    }

    /**
     * get 截图宽度
     *
     * @return
     */
    public Integer getShotWidth() {
        return shotWidth;
    }

    /**
     * set 截图宽度
     *
     * @param shotWidth
     */
    public void setShotWidth(Integer shotWidth) {
        this.shotWidth = shotWidth;
    }

    /**
     * get 截图高度
     *
     * @return
     */
    public Integer getShotHeight() {
        return shotHeight;
    }

    /**
     * set 截图高度
     *
     * @param shotHeight
     */
    public void setShotHeight(Integer shotHeight) {
        this.shotHeight = shotHeight;
    }

    /**
     * get 截图填充类型：stretch, gauss, black, white
     *
     * @return
     */
    public String getShotFillType() {
        return shotFillType;
    }

    /**
     * set 截图填充类型：stretch, gauss, black, white
     *
     * @param shotFillType
     */
    public void setShotFillType(String shotFillType) {
        this.shotFillType = shotFillType;
    }

    /**
     * get 审查配置，JSON格式
     *
     * @return
     */
    public String getInspectItems() {
        return inspectItems;
    }

    /**
     * set 审查配置，JSON格式
     *
     * @param inspectItems
     */
    public void setInspectItems(String inspectItems) {
        this.inspectItems = inspectItems;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 模板ID
     *
     * @param templateId
     */
    public ViTemplateInfo templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * set 模板名称。长度不超过128个字符。UTF-8编码。

     *
     * @param templateName
     */
    public ViTemplateInfo templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * set 截图间隔
     *
     * @param shotInterval
     */
    public ViTemplateInfo shotInterval(Integer shotInterval) {
        this.shotInterval = shotInterval;
        return this;
    }

    /**
     * set 间隔类型：time, percent
     *
     * @param shotIntervalType
     */
    public ViTemplateInfo shotIntervalType(String shotIntervalType) {
        this.shotIntervalType = shotIntervalType;
        return this;
    }

    /**
     * set 截图格式：png, jpg
     *
     * @param shotFormat
     */
    public ViTemplateInfo shotFormat(String shotFormat) {
        this.shotFormat = shotFormat;
        return this;
    }

    /**
     * set 截图帧类型：any, key
     *
     * @param shotFrameType
     */
    public ViTemplateInfo shotFrameType(String shotFrameType) {
        this.shotFrameType = shotFrameType;
        return this;
    }

    /**
     * set 截图宽度
     *
     * @param shotWidth
     */
    public ViTemplateInfo shotWidth(Integer shotWidth) {
        this.shotWidth = shotWidth;
        return this;
    }

    /**
     * set 截图高度
     *
     * @param shotHeight
     */
    public ViTemplateInfo shotHeight(Integer shotHeight) {
        this.shotHeight = shotHeight;
        return this;
    }

    /**
     * set 截图填充类型：stretch, gauss, black, white
     *
     * @param shotFillType
     */
    public ViTemplateInfo shotFillType(String shotFillType) {
        this.shotFillType = shotFillType;
        return this;
    }

    /**
     * set 审查配置，JSON格式
     *
     * @param inspectItems
     */
    public ViTemplateInfo inspectItems(String inspectItems) {
        this.inspectItems = inspectItems;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public ViTemplateInfo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public ViTemplateInfo updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}