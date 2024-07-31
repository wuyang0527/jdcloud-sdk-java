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
 * describeAvailableUserVo
 */
public class DescribeAvailableUserVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户分组
     */
    private Integer userGroup;

    /**
     * 账户名
     */
    private String loginName;

    /**
     * 企业名
     */
    private String company;

    /**
     * pin
     */
    private Integer pin;



    /**
     * get 用户分组
     *
     * @return
     */
    public Integer getUserGroup() {
        return userGroup;
    }

    /**
     * set 用户分组
     *
     * @param userGroup
     */
    public void setUserGroup(Integer userGroup) {
        this.userGroup = userGroup;
    }


    /**
     * get 账户名
     *
     * @return
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * set 账户名
     *
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    /**
     * get 企业名
     *
     * @return
     */
    public String getCompany() {
        return company;
    }

    /**
     * set 企业名
     *
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }


    /**
     * get pin
     *
     * @return
     */
    public Integer getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(Integer pin) {
        this.pin = pin;
    }



    /**
     * set 用户分组
     *
     * @param userGroup
     */
    public DescribeAvailableUserVo userGroup(Integer userGroup) {
        this.userGroup = userGroup;
        return this;
    }


    /**
     * set 账户名
     *
     * @param loginName
     */
    public DescribeAvailableUserVo loginName(String loginName) {
        this.loginName = loginName;
        return this;
    }


    /**
     * set 企业名
     *
     * @param company
     */
    public DescribeAvailableUserVo company(String company) {
        this.company = company;
        return this;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public DescribeAvailableUserVo pin(Integer pin) {
        this.pin = pin;
        return this;
    }


}