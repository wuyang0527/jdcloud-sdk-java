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

package com.jdcloud.sdk.service.vod.model;


/**
 * 修改截图模板请求信息
 */
public class UpdateSnapshotTemplateRequestInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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
     * set 模板标题。长度不超过 128 个字节。UTF-8 编码。
     *
     * @param templateName
     */
    public UpdateSnapshotTemplateRequestInfo templateName(String templateName) {
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
    public UpdateSnapshotTemplateRequestInfo snapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * set 采样截图模板配置
     *
     * @param imageSampleConfig
     */
    public UpdateSnapshotTemplateRequestInfo imageSampleConfig(ImageSampleConfig imageSampleConfig) {
        this.imageSampleConfig = imageSampleConfig;
        return this;
    }

    /**
     * set 雪碧图模板配置
     *
     * @param imageSpriteConfig
     */
    public UpdateSnapshotTemplateRequestInfo imageSpriteConfig(ImageSpriteConfig imageSpriteConfig) {
        this.imageSpriteConfig = imageSpriteConfig;
        return this;
    }


}