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

package com.jdcloud.sdk.service.cloudauth.model;


/**
 * aliveResultInfo
 */
public class AliveResultInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 人脸照片base64
     */
    private String faceImage;

    /**
     * 场景照片base64
     */
    private String sceneImage;

    /**
     * H5活体检测结果
     */
    private String h5Result;

    /**
     * 实名认证检测结果
     */
    private String smResult;

    /**
     * 人像对比结果
     */
    private String rxResult;

    /**
     * 人像对比相似度
     */
    private String score;

    /**
     * 描述
     */
    private String desc;



    /**
     * get 人脸照片base64
     *
     * @return
     */
    public String getFaceImage() {
        return faceImage;
    }

    /**
     * set 人脸照片base64
     *
     * @param faceImage
     */
    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }


    /**
     * get 场景照片base64
     *
     * @return
     */
    public String getSceneImage() {
        return sceneImage;
    }

    /**
     * set 场景照片base64
     *
     * @param sceneImage
     */
    public void setSceneImage(String sceneImage) {
        this.sceneImage = sceneImage;
    }


    /**
     * get H5活体检测结果
     *
     * @return
     */
    public String getH5Result() {
        return h5Result;
    }

    /**
     * set H5活体检测结果
     *
     * @param h5Result
     */
    public void setH5Result(String h5Result) {
        this.h5Result = h5Result;
    }


    /**
     * get 实名认证检测结果
     *
     * @return
     */
    public String getSmResult() {
        return smResult;
    }

    /**
     * set 实名认证检测结果
     *
     * @param smResult
     */
    public void setSmResult(String smResult) {
        this.smResult = smResult;
    }


    /**
     * get 人像对比结果
     *
     * @return
     */
    public String getRxResult() {
        return rxResult;
    }

    /**
     * set 人像对比结果
     *
     * @param rxResult
     */
    public void setRxResult(String rxResult) {
        this.rxResult = rxResult;
    }


    /**
     * get 人像对比相似度
     *
     * @return
     */
    public String getScore() {
        return score;
    }

    /**
     * set 人像对比相似度
     *
     * @param score
     */
    public void setScore(String score) {
        this.score = score;
    }


    /**
     * get 描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 描述
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }



    /**
     * set 人脸照片base64
     *
     * @param faceImage
     */
    public AliveResultInfo faceImage(String faceImage) {
        this.faceImage = faceImage;
        return this;
    }


    /**
     * set 场景照片base64
     *
     * @param sceneImage
     */
    public AliveResultInfo sceneImage(String sceneImage) {
        this.sceneImage = sceneImage;
        return this;
    }


    /**
     * set H5活体检测结果
     *
     * @param h5Result
     */
    public AliveResultInfo h5Result(String h5Result) {
        this.h5Result = h5Result;
        return this;
    }


    /**
     * set 实名认证检测结果
     *
     * @param smResult
     */
    public AliveResultInfo smResult(String smResult) {
        this.smResult = smResult;
        return this;
    }


    /**
     * set 人像对比结果
     *
     * @param rxResult
     */
    public AliveResultInfo rxResult(String rxResult) {
        this.rxResult = rxResult;
        return this;
    }


    /**
     * set 人像对比相似度
     *
     * @param score
     */
    public AliveResultInfo score(String score) {
        this.score = score;
        return this;
    }


    /**
     * set 描述
     *
     * @param desc
     */
    public AliveResultInfo desc(String desc) {
        this.desc = desc;
        return this;
    }


}