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

package com.jdcloud.sdk.service.bri.model;


/**
 * whitePinList
 */
public class WhitePinList  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据id
     */
    private Integer id;

    /**
     * 是否付费用户 0-白名单用户，购买资源包  1-付费用户,可购买资源包及免费测试
     */
    private Integer isPaidUser;

    /**
     * 用户pin
     */
    private String userPin;

    /**
     * 开始时间,秒级时间戳
     */
    private Integer startTime;

    /**
     * 结束时间，秒级时间戳
     */
    private Integer endTime;

    /**
     * 是否开通免费试用号码检测服务, 0-不开通  1-开通
     */
    private Integer phone;

    /**
     * 是否开通免费试用ip检测服务, 0-不开通  1-开通
     */
    private Integer ip;

    /**
     * 是否开通免费试用地址检测服务, 0-不开通  1-开通
     */
    private Integer addr;

    /**
     * 是否开通免费试用注册保护检测服务, 0-不开通  1-开通
     */
    private Integer signup;

    /**
     * 是否开通免费试用登录保护检测服务, 0-不开通  1-开通
     */
    private Integer login;

    /**
     * 是否开通免费试用营销保护检测服务, 0-不开通  1-开通
     */
    private Integer marketing;

    /**
     * QPS上限值
     */
    private Integer qpsLimit;

    /**
     * 客户名称
     */
    private String clientName;

    /**
     * 客户类型，Standard-标准版  Custom-定制版
     */
    private String clientType;


    /**
     * get 数据id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 数据id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 是否付费用户 0-白名单用户，购买资源包  1-付费用户,可购买资源包及免费测试
     *
     * @return
     */
    public Integer getIsPaidUser() {
        return isPaidUser;
    }

    /**
     * set 是否付费用户 0-白名单用户，购买资源包  1-付费用户,可购买资源包及免费测试
     *
     * @param isPaidUser
     */
    public void setIsPaidUser(Integer isPaidUser) {
        this.isPaidUser = isPaidUser;
    }

    /**
     * get 用户pin
     *
     * @return
     */
    public String getUserPin() {
        return userPin;
    }

    /**
     * set 用户pin
     *
     * @param userPin
     */
    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }

    /**
     * get 开始时间,秒级时间戳
     *
     * @return
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间,秒级时间戳
     *
     * @param startTime
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * get 结束时间，秒级时间戳
     *
     * @return
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间，秒级时间戳
     *
     * @param endTime
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * get 是否开通免费试用号码检测服务, 0-不开通  1-开通
     *
     * @return
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * set 是否开通免费试用号码检测服务, 0-不开通  1-开通
     *
     * @param phone
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * get 是否开通免费试用ip检测服务, 0-不开通  1-开通
     *
     * @return
     */
    public Integer getIp() {
        return ip;
    }

    /**
     * set 是否开通免费试用ip检测服务, 0-不开通  1-开通
     *
     * @param ip
     */
    public void setIp(Integer ip) {
        this.ip = ip;
    }

    /**
     * get 是否开通免费试用地址检测服务, 0-不开通  1-开通
     *
     * @return
     */
    public Integer getAddr() {
        return addr;
    }

    /**
     * set 是否开通免费试用地址检测服务, 0-不开通  1-开通
     *
     * @param addr
     */
    public void setAddr(Integer addr) {
        this.addr = addr;
    }

    /**
     * get 是否开通免费试用注册保护检测服务, 0-不开通  1-开通
     *
     * @return
     */
    public Integer getSignup() {
        return signup;
    }

    /**
     * set 是否开通免费试用注册保护检测服务, 0-不开通  1-开通
     *
     * @param signup
     */
    public void setSignup(Integer signup) {
        this.signup = signup;
    }

    /**
     * get 是否开通免费试用登录保护检测服务, 0-不开通  1-开通
     *
     * @return
     */
    public Integer getLogin() {
        return login;
    }

    /**
     * set 是否开通免费试用登录保护检测服务, 0-不开通  1-开通
     *
     * @param login
     */
    public void setLogin(Integer login) {
        this.login = login;
    }

    /**
     * get 是否开通免费试用营销保护检测服务, 0-不开通  1-开通
     *
     * @return
     */
    public Integer getMarketing() {
        return marketing;
    }

    /**
     * set 是否开通免费试用营销保护检测服务, 0-不开通  1-开通
     *
     * @param marketing
     */
    public void setMarketing(Integer marketing) {
        this.marketing = marketing;
    }

    /**
     * get QPS上限值
     *
     * @return
     */
    public Integer getQpsLimit() {
        return qpsLimit;
    }

    /**
     * set QPS上限值
     *
     * @param qpsLimit
     */
    public void setQpsLimit(Integer qpsLimit) {
        this.qpsLimit = qpsLimit;
    }

    /**
     * get 客户名称
     *
     * @return
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * set 客户名称
     *
     * @param clientName
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * get 客户类型，Standard-标准版  Custom-定制版
     *
     * @return
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * set 客户类型，Standard-标准版  Custom-定制版
     *
     * @param clientType
     */
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }


    /**
     * set 数据id
     *
     * @param id
     */
    public WhitePinList id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 是否付费用户 0-白名单用户，购买资源包  1-付费用户,可购买资源包及免费测试
     *
     * @param isPaidUser
     */
    public WhitePinList isPaidUser(Integer isPaidUser) {
        this.isPaidUser = isPaidUser;
        return this;
    }

    /**
     * set 用户pin
     *
     * @param userPin
     */
    public WhitePinList userPin(String userPin) {
        this.userPin = userPin;
        return this;
    }

    /**
     * set 开始时间,秒级时间戳
     *
     * @param startTime
     */
    public WhitePinList startTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 结束时间，秒级时间戳
     *
     * @param endTime
     */
    public WhitePinList endTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 是否开通免费试用号码检测服务, 0-不开通  1-开通
     *
     * @param phone
     */
    public WhitePinList phone(Integer phone) {
        this.phone = phone;
        return this;
    }

    /**
     * set 是否开通免费试用ip检测服务, 0-不开通  1-开通
     *
     * @param ip
     */
    public WhitePinList ip(Integer ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 是否开通免费试用地址检测服务, 0-不开通  1-开通
     *
     * @param addr
     */
    public WhitePinList addr(Integer addr) {
        this.addr = addr;
        return this;
    }

    /**
     * set 是否开通免费试用注册保护检测服务, 0-不开通  1-开通
     *
     * @param signup
     */
    public WhitePinList signup(Integer signup) {
        this.signup = signup;
        return this;
    }

    /**
     * set 是否开通免费试用登录保护检测服务, 0-不开通  1-开通
     *
     * @param login
     */
    public WhitePinList login(Integer login) {
        this.login = login;
        return this;
    }

    /**
     * set 是否开通免费试用营销保护检测服务, 0-不开通  1-开通
     *
     * @param marketing
     */
    public WhitePinList marketing(Integer marketing) {
        this.marketing = marketing;
        return this;
    }

    /**
     * set QPS上限值
     *
     * @param qpsLimit
     */
    public WhitePinList qpsLimit(Integer qpsLimit) {
        this.qpsLimit = qpsLimit;
        return this;
    }

    /**
     * set 客户名称
     *
     * @param clientName
     */
    public WhitePinList clientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * set 客户类型，Standard-标准版  Custom-定制版
     *
     * @param clientType
     */
    public WhitePinList clientType(String clientType) {
        this.clientType = clientType;
        return this;
    }


}