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

import com.jdcloud.sdk.annotation.Required;

/**
 * personalMobile3
 */
public class PersonalMobile3  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     * Required:true
     */
    @Required
    private String name;

    /**
     * 身份证号码
     * Required:true
     */
    @Required
    private String idCard;

    /**
     * 手机号
     * Required:true
     */
    @Required
    private String mobile;



    /**
     * get 姓名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 姓名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 身份证号码
     *
     * @return
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * set 身份证号码
     *
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }


    /**
     * get 手机号
     *
     * @return
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * set 手机号
     *
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



    /**
     * set 姓名
     *
     * @param name
     */
    public PersonalMobile3 name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 身份证号码
     *
     * @param idCard
     */
    public PersonalMobile3 idCard(String idCard) {
        this.idCard = idCard;
        return this;
    }


    /**
     * set 手机号
     *
     * @param mobile
     */
    public PersonalMobile3 mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }


}