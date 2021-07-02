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


/**
 * imageListInfo
 */
public class ImageListInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * type为1时为自定义图片名单，type为2时为自定义敏感词名单
     */
    private String type;

    /**
     * 该图片命中自定义图片名单对应原始添加的根源图片url
     */
    private String url;

    /**
     * 历史针对该数据源图片命中所有次数
     */
    private String hitCount;

    /**
     * 该图片命中的自定义敏感词
     */
    private String word;


    /**
     * get type为1时为自定义图片名单，type为2时为自定义敏感词名单
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set type为1时为自定义图片名单，type为2时为自定义敏感词名单
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get 该图片命中自定义图片名单对应原始添加的根源图片url
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set 该图片命中自定义图片名单对应原始添加的根源图片url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * get 历史针对该数据源图片命中所有次数
     *
     * @return
     */
    public String getHitCount() {
        return hitCount;
    }

    /**
     * set 历史针对该数据源图片命中所有次数
     *
     * @param hitCount
     */
    public void setHitCount(String hitCount) {
        this.hitCount = hitCount;
    }

    /**
     * get 该图片命中的自定义敏感词
     *
     * @return
     */
    public String getWord() {
        return word;
    }

    /**
     * set 该图片命中的自定义敏感词
     *
     * @param word
     */
    public void setWord(String word) {
        this.word = word;
    }


    /**
     * set type为1时为自定义图片名单，type为2时为自定义敏感词名单
     *
     * @param type
     */
    public ImageListInfo type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set 该图片命中自定义图片名单对应原始添加的根源图片url
     *
     * @param url
     */
    public ImageListInfo url(String url) {
        this.url = url;
        return this;
    }

    /**
     * set 历史针对该数据源图片命中所有次数
     *
     * @param hitCount
     */
    public ImageListInfo hitCount(String hitCount) {
        this.hitCount = hitCount;
        return this;
    }

    /**
     * set 该图片命中的自定义敏感词
     *
     * @param word
     */
    public ImageListInfo word(String word) {
        this.word = word;
        return this;
    }


}