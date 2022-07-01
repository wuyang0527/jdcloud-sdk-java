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
 * Snapshot Template
 * 截图模板管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.service.vod.model.ImageSampleConfig;
import com.jdcloud.sdk.service.vod.model.ImageSpriteConfig;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询截图模板
 */
public class GetSnapshotTemplateResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板ID
     */
    private String templateId;

    /**
     * 模板标题。长度不超过 128 个字节。UTF-8 编码。
     */
    private String templateName;

    /**
     * 模板类型。取值范围：
  sample - 采样截图模板
  sprite - 雪碧图模板

     */
    private String snapshotType;

    /**
     * 采样截图模板配置
     */
    private ImageSampleConfig imageSampleConfig;

    /**
     * 雪碧图模板配置
     */
    private ImageSpriteConfig imageSpriteConfig;

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
     * get 模板标题。长度不超过 128 个字节。UTF-8 编码。
     *
     * @return
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * set 模板标题。长度不超过 128 个字节。UTF-8 编码。
     *
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * get 模板类型。取值范围：
  sample - 采样截图模板
  sprite - 雪碧图模板

     *
     * @return
     */
    public String getSnapshotType() {
        return snapshotType;
    }

    /**
     * set 模板类型。取值范围：
  sample - 采样截图模板
  sprite - 雪碧图模板

     *
     * @param snapshotType
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * get 采样截图模板配置
     *
     * @return
     */
    public ImageSampleConfig getImageSampleConfig() {
        return imageSampleConfig;
    }

    /**
     * set 采样截图模板配置
     *
     * @param imageSampleConfig
     */
    public void setImageSampleConfig(ImageSampleConfig imageSampleConfig) {
        this.imageSampleConfig = imageSampleConfig;
    }

    /**
     * get 雪碧图模板配置
     *
     * @return
     */
    public ImageSpriteConfig getImageSpriteConfig() {
        return imageSpriteConfig;
    }

    /**
     * set 雪碧图模板配置
     *
     * @param imageSpriteConfig
     */
    public void setImageSpriteConfig(ImageSpriteConfig imageSpriteConfig) {
        this.imageSpriteConfig = imageSpriteConfig;
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
    public GetSnapshotTemplateResult templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * set 模板标题。长度不超过 128 个字节。UTF-8 编码。
     *
     * @param templateName
     */
    public GetSnapshotTemplateResult templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * set 模板类型。取值范围：
  sample - 采样截图模板
  sprite - 雪碧图模板

     *
     * @param snapshotType
     */
    public GetSnapshotTemplateResult snapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * set 采样截图模板配置
     *
     * @param imageSampleConfig
     */
    public GetSnapshotTemplateResult imageSampleConfig(ImageSampleConfig imageSampleConfig) {
        this.imageSampleConfig = imageSampleConfig;
        return this;
    }

    /**
     * set 雪碧图模板配置
     *
     * @param imageSpriteConfig
     */
    public GetSnapshotTemplateResult imageSpriteConfig(ImageSpriteConfig imageSpriteConfig) {
        this.imageSpriteConfig = imageSpriteConfig;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public GetSnapshotTemplateResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public GetSnapshotTemplateResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}