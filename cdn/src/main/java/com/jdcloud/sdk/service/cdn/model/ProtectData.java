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

package com.jdcloud.sdk.service.cdn.model;


/**
 * protectData
 */
public class ProtectData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 防护后流量序
     */
    private Float postProtect;

    /**
     * 防护前流量序
     */
    private Float preProtect;

    /**
     * 时间戳,到秒
     */
    private Long timeStamp;

    /**
     * UTC时间
     */
    private String timeUtc;



    /**
     * get 防护后流量序
     *
     * @return
     */
    public Float getPostProtect() {
        return postProtect;
    }

    /**
     * set 防护后流量序
     *
     * @param postProtect
     */
    public void setPostProtect(Float postProtect) {
        this.postProtect = postProtect;
    }


    /**
     * get 防护前流量序
     *
     * @return
     */
    public Float getPreProtect() {
        return preProtect;
    }

    /**
     * set 防护前流量序
     *
     * @param preProtect
     */
    public void setPreProtect(Float preProtect) {
        this.preProtect = preProtect;
    }


    /**
     * get 时间戳,到秒
     *
     * @return
     */
    public Long getTimeStamp() {
        return timeStamp;
    }

    /**
     * set 时间戳,到秒
     *
     * @param timeStamp
     */
    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * get UTC时间
     *
     * @return
     */
    public String getTimeUtc() {
        return timeUtc;
    }

    /**
     * set UTC时间
     *
     * @param timeUtc
     */
    public void setTimeUtc(String timeUtc) {
        this.timeUtc = timeUtc;
    }



    /**
     * set 防护后流量序
     *
     * @param postProtect
     */
    public ProtectData postProtect(Float postProtect) {
        this.postProtect = postProtect;
        return this;
    }


    /**
     * set 防护前流量序
     *
     * @param preProtect
     */
    public ProtectData preProtect(Float preProtect) {
        this.preProtect = preProtect;
        return this;
    }


    /**
     * set 时间戳,到秒
     *
     * @param timeStamp
     */
    public ProtectData timeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }


    /**
     * set UTC时间
     *
     * @param timeUtc
     */
    public ProtectData timeUtc(String timeUtc) {
        this.timeUtc = timeUtc;
        return this;
    }


}