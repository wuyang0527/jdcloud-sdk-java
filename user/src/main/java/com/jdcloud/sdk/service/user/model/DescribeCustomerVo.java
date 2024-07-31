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

package com.jdcloud.sdk.service.user.model;


/**
 * describeCustomerVo
 */
public class DescribeCustomerVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * 用户分组
     */
    private Integer group;

    /**
     * 姓名
     */
    private String name;

    /**
     * 企业名
     */
    private String companyName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机
     */
    private String phone;

    /**
     * 激活时间
     */
    private String activeTime;

    /**
     * 计费状态
     */
    private String costDay;

    /**
     * 欠费时间
     */
    private String arrearageTime;

    /**
     * 用户类型
     */
    private String userType;



    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 用户分组
     *
     * @return
     */
    public Integer getGroup() {
        return group;
    }

    /**
     * set 用户分组
     *
     * @param group
     */
    public void setGroup(Integer group) {
        this.group = group;
    }


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
     * get 企业名
     *
     * @return
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * set 企业名
     *
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * get 邮箱
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * get 手机
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 手机
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * get 激活时间
     *
     * @return
     */
    public String getActiveTime() {
        return activeTime;
    }

    /**
     * set 激活时间
     *
     * @param activeTime
     */
    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }


    /**
     * get 计费状态
     *
     * @return
     */
    public String getCostDay() {
        return costDay;
    }

    /**
     * set 计费状态
     *
     * @param costDay
     */
    public void setCostDay(String costDay) {
        this.costDay = costDay;
    }


    /**
     * get 欠费时间
     *
     * @return
     */
    public String getArrearageTime() {
        return arrearageTime;
    }

    /**
     * set 欠费时间
     *
     * @param arrearageTime
     */
    public void setArrearageTime(String arrearageTime) {
        this.arrearageTime = arrearageTime;
    }


    /**
     * get 用户类型
     *
     * @return
     */
    public String getUserType() {
        return userType;
    }

    /**
     * set 用户类型
     *
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }



    /**
     * set pin
     *
     * @param pin
     */
    public DescribeCustomerVo pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 用户分组
     *
     * @param group
     */
    public DescribeCustomerVo group(Integer group) {
        this.group = group;
        return this;
    }


    /**
     * set 姓名
     *
     * @param name
     */
    public DescribeCustomerVo name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 企业名
     *
     * @param companyName
     */
    public DescribeCustomerVo companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }


    /**
     * set 邮箱
     *
     * @param email
     */
    public DescribeCustomerVo email(String email) {
        this.email = email;
        return this;
    }


    /**
     * set 手机
     *
     * @param phone
     */
    public DescribeCustomerVo phone(String phone) {
        this.phone = phone;
        return this;
    }


    /**
     * set 激活时间
     *
     * @param activeTime
     */
    public DescribeCustomerVo activeTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }


    /**
     * set 计费状态
     *
     * @param costDay
     */
    public DescribeCustomerVo costDay(String costDay) {
        this.costDay = costDay;
        return this;
    }


    /**
     * set 欠费时间
     *
     * @param arrearageTime
     */
    public DescribeCustomerVo arrearageTime(String arrearageTime) {
        this.arrearageTime = arrearageTime;
        return this;
    }


    /**
     * set 用户类型
     *
     * @param userType
     */
    public DescribeCustomerVo userType(String userType) {
        this.userType = userType;
        return this;
    }


}