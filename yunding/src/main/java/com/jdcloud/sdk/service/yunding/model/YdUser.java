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

package com.jdcloud.sdk.service.yunding.model;


/**
 * ydUser
 */
public class YdUser  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云鼎pin
     */
    private String ydPin;

    /**
     * 京东云pin
     */
    private String jdcloudPin;

    /**
     * 云鼎pin-子账号pin
     */
    private String ydSubPin;

    /**
     * 京东云pin-子账号pin
     */
    private String jdcloudSubPin;



    /**
     * get 云鼎pin
     *
     * @return
     */
    public String getYdPin() {
        return ydPin;
    }

    /**
     * set 云鼎pin
     *
     * @param ydPin
     */
    public void setYdPin(String ydPin) {
        this.ydPin = ydPin;
    }


    /**
     * get 京东云pin
     *
     * @return
     */
    public String getJdcloudPin() {
        return jdcloudPin;
    }

    /**
     * set 京东云pin
     *
     * @param jdcloudPin
     */
    public void setJdcloudPin(String jdcloudPin) {
        this.jdcloudPin = jdcloudPin;
    }


    /**
     * get 云鼎pin-子账号pin
     *
     * @return
     */
    public String getYdSubPin() {
        return ydSubPin;
    }

    /**
     * set 云鼎pin-子账号pin
     *
     * @param ydSubPin
     */
    public void setYdSubPin(String ydSubPin) {
        this.ydSubPin = ydSubPin;
    }


    /**
     * get 京东云pin-子账号pin
     *
     * @return
     */
    public String getJdcloudSubPin() {
        return jdcloudSubPin;
    }

    /**
     * set 京东云pin-子账号pin
     *
     * @param jdcloudSubPin
     */
    public void setJdcloudSubPin(String jdcloudSubPin) {
        this.jdcloudSubPin = jdcloudSubPin;
    }



    /**
     * set 云鼎pin
     *
     * @param ydPin
     */
    public YdUser ydPin(String ydPin) {
        this.ydPin = ydPin;
        return this;
    }


    /**
     * set 京东云pin
     *
     * @param jdcloudPin
     */
    public YdUser jdcloudPin(String jdcloudPin) {
        this.jdcloudPin = jdcloudPin;
        return this;
    }


    /**
     * set 云鼎pin-子账号pin
     *
     * @param ydSubPin
     */
    public YdUser ydSubPin(String ydSubPin) {
        this.ydSubPin = ydSubPin;
        return this;
    }


    /**
     * set 京东云pin-子账号pin
     *
     * @param jdcloudSubPin
     */
    public YdUser jdcloudSubPin(String jdcloudSubPin) {
        this.jdcloudSubPin = jdcloudSubPin;
        return this;
    }


}