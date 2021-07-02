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

package com.jdcloud.sdk.service.censor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * antispamVideoLabelItemDetail
 */
public class AntispamVideoLabelItemDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 针对命中sublabel的补充说明
     */
    private List<String> hitInfos;

    /**
     * 命中标签详细信息，对于返回的hintInfo的解释说明，可能为空
     */
    private List<ImageTagInfo> imageTagInfo;

    /**
     * imageListInfo
     */
    private List<ImageListInfo> imageListInfo;

    /**
     * hitLocationInfos
     */
    private List<HitLocationInfos> hitLocationInfos;


    /**
     * get 针对命中sublabel的补充说明
     *
     * @return
     */
    public List<String> getHitInfos() {
        return hitInfos;
    }

    /**
     * set 针对命中sublabel的补充说明
     *
     * @param hitInfos
     */
    public void setHitInfos(List<String> hitInfos) {
        this.hitInfos = hitInfos;
    }

    /**
     * get 命中标签详细信息，对于返回的hintInfo的解释说明，可能为空
     *
     * @return
     */
    public List<ImageTagInfo> getImageTagInfo() {
        return imageTagInfo;
    }

    /**
     * set 命中标签详细信息，对于返回的hintInfo的解释说明，可能为空
     *
     * @param imageTagInfo
     */
    public void setImageTagInfo(List<ImageTagInfo> imageTagInfo) {
        this.imageTagInfo = imageTagInfo;
    }

    /**
     * get imageListInfo
     *
     * @return
     */
    public List<ImageListInfo> getImageListInfo() {
        return imageListInfo;
    }

    /**
     * set imageListInfo
     *
     * @param imageListInfo
     */
    public void setImageListInfo(List<ImageListInfo> imageListInfo) {
        this.imageListInfo = imageListInfo;
    }

    /**
     * get hitLocationInfos
     *
     * @return
     */
    public List<HitLocationInfos> getHitLocationInfos() {
        return hitLocationInfos;
    }

    /**
     * set hitLocationInfos
     *
     * @param hitLocationInfos
     */
    public void setHitLocationInfos(List<HitLocationInfos> hitLocationInfos) {
        this.hitLocationInfos = hitLocationInfos;
    }


    /**
     * set 针对命中sublabel的补充说明
     *
     * @param hitInfos
     */
    public AntispamVideoLabelItemDetail hitInfos(List<String> hitInfos) {
        this.hitInfos = hitInfos;
        return this;
    }

    /**
     * set 命中标签详细信息，对于返回的hintInfo的解释说明，可能为空
     *
     * @param imageTagInfo
     */
    public AntispamVideoLabelItemDetail imageTagInfo(List<ImageTagInfo> imageTagInfo) {
        this.imageTagInfo = imageTagInfo;
        return this;
    }

    /**
     * set imageListInfo
     *
     * @param imageListInfo
     */
    public AntispamVideoLabelItemDetail imageListInfo(List<ImageListInfo> imageListInfo) {
        this.imageListInfo = imageListInfo;
        return this;
    }

    /**
     * set hitLocationInfos
     *
     * @param hitLocationInfos
     */
    public AntispamVideoLabelItemDetail hitLocationInfos(List<HitLocationInfos> hitLocationInfos) {
        this.hitLocationInfos = hitLocationInfos;
        return this;
    }


    /**
     * add item to 针对命中sublabel的补充说明
     *
     * @param hitInfo
     */
    public void addHitInfo(String hitInfo) {
        if (this.hitInfos == null) {
            this.hitInfos = new ArrayList<>();
        }
        this.hitInfos.add(hitInfo);
    }

    /**
     * add item to 命中标签详细信息，对于返回的hintInfo的解释说明，可能为空
     *
     * @param imageTagInfo
     */
    public void addImageTagInfo(ImageTagInfo imageTagInfo) {
        if (this.imageTagInfo == null) {
            this.imageTagInfo = new ArrayList<>();
        }
        this.imageTagInfo.add(imageTagInfo);
    }

    /**
     * add item to imageListInfo
     *
     * @param imageListInfo
     */
    public void addImageListInfo(ImageListInfo imageListInfo) {
        if (this.imageListInfo == null) {
            this.imageListInfo = new ArrayList<>();
        }
        this.imageListInfo.add(imageListInfo);
    }

    /**
     * add item to hitLocationInfos
     *
     * @param hitLocationInfo
     */
    public void addHitLocationInfo(HitLocationInfos hitLocationInfo) {
        if (this.hitLocationInfos == null) {
            this.hitLocationInfos = new ArrayList<>();
        }
        this.hitLocationInfos.add(hitLocationInfo);
    }

}