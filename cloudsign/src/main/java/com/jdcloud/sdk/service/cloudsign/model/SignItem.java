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

package com.jdcloud.sdk.service.cloudsign.model;


/**
 * signItem
 */
public class SignItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 13位时间戳
     */
    private String time;

    /**
     * 签章次数
     */
    private Integer value;


    /**
     * get 13位时间戳
     *
     * @return
     */
    public String getTime() {
        return time;
    }

    /**
     * set 13位时间戳
     *
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * get 签章次数
     *
     * @return
     */
    public Integer getValue() {
        return value;
    }

    /**
     * set 签章次数
     *
     * @param value
     */
    public void setValue(Integer value) {
        this.value = value;
    }


    /**
     * set 13位时间戳
     *
     * @param time
     */
    public SignItem time(String time) {
        this.time = time;
        return this;
    }

    /**
     * set 签章次数
     *
     * @param value
     */
    public SignItem value(Integer value) {
        this.value = value;
        return this;
    }


}