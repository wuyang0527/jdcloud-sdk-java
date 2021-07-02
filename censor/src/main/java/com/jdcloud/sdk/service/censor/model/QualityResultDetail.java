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
 * qualityResultDetail
 */
public class QualityResultDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片基本信息
     */
    private List<MetaInfoItem> metaInfo;

    /**
     * 美观度分数，0-1，分数越高美观度越高，建议0.5分以上可认为美观度较好，0.3分以下可认为美观度较差，具体视业务场景而定
     */
    private Float aestheticsRate;

    /**
     * 清晰度分数，0-1，分数越高清晰度越高，建议0.5分以上可认为清晰度较好，0.3分以下可认为清晰度较差，具体视业务场景而定
     */
    private Float sharpnessRate;

    /**
     * 图片边框信息
     */
    private List<BoarderInfoItem> boarderInfo;

    /**
     * 图片边框信息
     */
    private List<BackgroundInfoItem> backgroundInfo;


    /**
     * get 图片基本信息
     *
     * @return
     */
    public List<MetaInfoItem> getMetaInfo() {
        return metaInfo;
    }

    /**
     * set 图片基本信息
     *
     * @param metaInfo
     */
    public void setMetaInfo(List<MetaInfoItem> metaInfo) {
        this.metaInfo = metaInfo;
    }

    /**
     * get 美观度分数，0-1，分数越高美观度越高，建议0.5分以上可认为美观度较好，0.3分以下可认为美观度较差，具体视业务场景而定
     *
     * @return
     */
    public Float getAestheticsRate() {
        return aestheticsRate;
    }

    /**
     * set 美观度分数，0-1，分数越高美观度越高，建议0.5分以上可认为美观度较好，0.3分以下可认为美观度较差，具体视业务场景而定
     *
     * @param aestheticsRate
     */
    public void setAestheticsRate(Float aestheticsRate) {
        this.aestheticsRate = aestheticsRate;
    }

    /**
     * get 清晰度分数，0-1，分数越高清晰度越高，建议0.5分以上可认为清晰度较好，0.3分以下可认为清晰度较差，具体视业务场景而定
     *
     * @return
     */
    public Float getSharpnessRate() {
        return sharpnessRate;
    }

    /**
     * set 清晰度分数，0-1，分数越高清晰度越高，建议0.5分以上可认为清晰度较好，0.3分以下可认为清晰度较差，具体视业务场景而定
     *
     * @param sharpnessRate
     */
    public void setSharpnessRate(Float sharpnessRate) {
        this.sharpnessRate = sharpnessRate;
    }

    /**
     * get 图片边框信息
     *
     * @return
     */
    public List<BoarderInfoItem> getBoarderInfo() {
        return boarderInfo;
    }

    /**
     * set 图片边框信息
     *
     * @param boarderInfo
     */
    public void setBoarderInfo(List<BoarderInfoItem> boarderInfo) {
        this.boarderInfo = boarderInfo;
    }

    /**
     * get 图片边框信息
     *
     * @return
     */
    public List<BackgroundInfoItem> getBackgroundInfo() {
        return backgroundInfo;
    }

    /**
     * set 图片边框信息
     *
     * @param backgroundInfo
     */
    public void setBackgroundInfo(List<BackgroundInfoItem> backgroundInfo) {
        this.backgroundInfo = backgroundInfo;
    }


    /**
     * set 图片基本信息
     *
     * @param metaInfo
     */
    public QualityResultDetail metaInfo(List<MetaInfoItem> metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }

    /**
     * set 美观度分数，0-1，分数越高美观度越高，建议0.5分以上可认为美观度较好，0.3分以下可认为美观度较差，具体视业务场景而定
     *
     * @param aestheticsRate
     */
    public QualityResultDetail aestheticsRate(Float aestheticsRate) {
        this.aestheticsRate = aestheticsRate;
        return this;
    }

    /**
     * set 清晰度分数，0-1，分数越高清晰度越高，建议0.5分以上可认为清晰度较好，0.3分以下可认为清晰度较差，具体视业务场景而定
     *
     * @param sharpnessRate
     */
    public QualityResultDetail sharpnessRate(Float sharpnessRate) {
        this.sharpnessRate = sharpnessRate;
        return this;
    }

    /**
     * set 图片边框信息
     *
     * @param boarderInfo
     */
    public QualityResultDetail boarderInfo(List<BoarderInfoItem> boarderInfo) {
        this.boarderInfo = boarderInfo;
        return this;
    }

    /**
     * set 图片边框信息
     *
     * @param backgroundInfo
     */
    public QualityResultDetail backgroundInfo(List<BackgroundInfoItem> backgroundInfo) {
        this.backgroundInfo = backgroundInfo;
        return this;
    }


    /**
     * add item to 图片基本信息
     *
     * @param metaInfo
     */
    public void addMetaInfo(MetaInfoItem metaInfo) {
        if (this.metaInfo == null) {
            this.metaInfo = new ArrayList<>();
        }
        this.metaInfo.add(metaInfo);
    }

    /**
     * add item to 图片边框信息
     *
     * @param boarderInfo
     */
    public void addBoarderInfo(BoarderInfoItem boarderInfo) {
        if (this.boarderInfo == null) {
            this.boarderInfo = new ArrayList<>();
        }
        this.boarderInfo.add(boarderInfo);
    }

    /**
     * add item to 图片边框信息
     *
     * @param backgroundInfo
     */
    public void addBackgroundInfo(BackgroundInfoItem backgroundInfo) {
        if (this.backgroundInfo == null) {
            this.backgroundInfo = new ArrayList<>();
        }
        this.backgroundInfo.add(backgroundInfo);
    }

}