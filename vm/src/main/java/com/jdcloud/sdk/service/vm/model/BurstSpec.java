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

package com.jdcloud.sdk.service.vm.model;


/**
 * burstSpec
 */
public class BurstSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 突发模式，standard 为标准模式，unlimited 为无限模式，默认 standard。
     */
    private String burstMode;


    /**
     * get 突发模式，standard 为标准模式，unlimited 为无限模式，默认 standard。
     *
     * @return
     */
    public String getBurstMode() {
        return burstMode;
    }

    /**
     * set 突发模式，standard 为标准模式，unlimited 为无限模式，默认 standard。
     *
     * @param burstMode
     */
    public void setBurstMode(String burstMode) {
        this.burstMode = burstMode;
    }


    /**
     * set 突发模式，standard 为标准模式，unlimited 为无限模式，默认 standard。
     *
     * @param burstMode
     */
    public BurstSpec burstMode(String burstMode) {
        this.burstMode = burstMode;
        return this;
    }


}