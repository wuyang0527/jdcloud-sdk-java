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

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * orderReq
 */
public class OrderReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域信息, hb_bgp, hn, hd_bgp 企业版支持两个，旗舰版支持3个，多个以 , 分隔
     * Required:true
     */
    @Required
    private String region;

    /**
     * 购买类型, 1:创建 2:续费 3:升配
     * Required:true
     */
    @Required
    private Integer buyType;

    /**
     * 购买时长
     * Required:true
     */
    @Required
    private Integer timeSpan;

    /**
     * 时间单位，month, year
     * Required:true
     */
    @Required
    private String timeUnit;

    /**
     * 创建时间
     * Required:true
     */
    @Required
    private Long startTime;

    /**
     * 实例id，除新建必传
     */
    private String wafInstanceId;

    /**
     * 套餐类型 1:高级版, 2:企业版 3:旗舰版 4:基础版(仅支持新用户)
     * Required:true
     */
    @Required
    private Integer packageType;

    /**
     * 额外的域名扩展包
     * Required:true
     */
    @Required
    private Integer extraDomainsNum;

    /**
     * 实例名，新建订单时必传，只能包含汉字、英文字母、下划线、破折号、数字，且长度不能超过16
     */
    private String nickName;

    /**
     * 下单成功后返回的url, eg:http://abc.com
     * Required:true
     */
    @Required
    private String returnURL;

    /**
     * 额外的qps扩展包,单位为M 该值为50M的倍数
     * Required:true
     */
    @Required
    private Integer extraBitsLimit;

    /**
     * 云鼎的appCode
     */
    private String appCode;

    /**
     * 云鼎的serviceCode
     */
    private String serviceCode;

    /**
     * 购物车活动参数
     */
    private String buyScenario;

    /**
     * true表示支持autoPay
     */
    private Boolean needPay;



    /**
     * get 地域信息, hb_bgp, hn, hd_bgp 企业版支持两个，旗舰版支持3个，多个以 , 分隔
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域信息, hb_bgp, hn, hd_bgp 企业版支持两个，旗舰版支持3个，多个以 , 分隔
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * get 购买类型, 1:创建 2:续费 3:升配
     *
     * @return
     */
    public Integer getBuyType() {
        return buyType;
    }

    /**
     * set 购买类型, 1:创建 2:续费 3:升配
     *
     * @param buyType
     */
    public void setBuyType(Integer buyType) {
        this.buyType = buyType;
    }


    /**
     * get 购买时长
     *
     * @return
     */
    public Integer getTimeSpan() {
        return timeSpan;
    }

    /**
     * set 购买时长
     *
     * @param timeSpan
     */
    public void setTimeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
    }


    /**
     * get 时间单位，month, year
     *
     * @return
     */
    public String getTimeUnit() {
        return timeUnit;
    }

    /**
     * set 时间单位，month, year
     *
     * @param timeUnit
     */
    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * set 创建时间
     *
     * @param startTime
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }


    /**
     * get 实例id，除新建必传
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set 实例id，除新建必传
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }


    /**
     * get 套餐类型 1:高级版, 2:企业版 3:旗舰版 4:基础版(仅支持新用户)
     *
     * @return
     */
    public Integer getPackageType() {
        return packageType;
    }

    /**
     * set 套餐类型 1:高级版, 2:企业版 3:旗舰版 4:基础版(仅支持新用户)
     *
     * @param packageType
     */
    public void setPackageType(Integer packageType) {
        this.packageType = packageType;
    }


    /**
     * get 额外的域名扩展包
     *
     * @return
     */
    public Integer getExtraDomainsNum() {
        return extraDomainsNum;
    }

    /**
     * set 额外的域名扩展包
     *
     * @param extraDomainsNum
     */
    public void setExtraDomainsNum(Integer extraDomainsNum) {
        this.extraDomainsNum = extraDomainsNum;
    }


    /**
     * get 实例名，新建订单时必传，只能包含汉字、英文字母、下划线、破折号、数字，且长度不能超过16
     *
     * @return
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * set 实例名，新建订单时必传，只能包含汉字、英文字母、下划线、破折号、数字，且长度不能超过16
     *
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


    /**
     * get 下单成功后返回的url, eg:http://abc.com
     *
     * @return
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * set 下单成功后返回的url, eg:http://abc.com
     *
     * @param returnURL
     */
    public void setReturnURL(String returnURL) {
        this.returnURL = returnURL;
    }


    /**
     * get 额外的qps扩展包,单位为M 该值为50M的倍数
     *
     * @return
     */
    public Integer getExtraBitsLimit() {
        return extraBitsLimit;
    }

    /**
     * set 额外的qps扩展包,单位为M 该值为50M的倍数
     *
     * @param extraBitsLimit
     */
    public void setExtraBitsLimit(Integer extraBitsLimit) {
        this.extraBitsLimit = extraBitsLimit;
    }


    /**
     * get 云鼎的appCode
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 云鼎的appCode
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }


    /**
     * get 云鼎的serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 云鼎的serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 购物车活动参数
     *
     * @return
     */
    public String getBuyScenario() {
        return buyScenario;
    }

    /**
     * set 购物车活动参数
     *
     * @param buyScenario
     */
    public void setBuyScenario(String buyScenario) {
        this.buyScenario = buyScenario;
    }


    /**
     * get true表示支持autoPay
     *
     * @return
     */
    public Boolean getNeedPay() {
        return needPay;
    }

    /**
     * set true表示支持autoPay
     *
     * @param needPay
     */
    public void setNeedPay(Boolean needPay) {
        this.needPay = needPay;
    }



    /**
     * set 地域信息, hb_bgp, hn, hd_bgp 企业版支持两个，旗舰版支持3个，多个以 , 分隔
     *
     * @param region
     */
    public OrderReq region(String region) {
        this.region = region;
        return this;
    }


    /**
     * set 购买类型, 1:创建 2:续费 3:升配
     *
     * @param buyType
     */
    public OrderReq buyType(Integer buyType) {
        this.buyType = buyType;
        return this;
    }


    /**
     * set 购买时长
     *
     * @param timeSpan
     */
    public OrderReq timeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }


    /**
     * set 时间单位，month, year
     *
     * @param timeUnit
     */
    public OrderReq timeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param startTime
     */
    public OrderReq startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 实例id，除新建必传
     *
     * @param wafInstanceId
     */
    public OrderReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


    /**
     * set 套餐类型 1:高级版, 2:企业版 3:旗舰版 4:基础版(仅支持新用户)
     *
     * @param packageType
     */
    public OrderReq packageType(Integer packageType) {
        this.packageType = packageType;
        return this;
    }


    /**
     * set 额外的域名扩展包
     *
     * @param extraDomainsNum
     */
    public OrderReq extraDomainsNum(Integer extraDomainsNum) {
        this.extraDomainsNum = extraDomainsNum;
        return this;
    }


    /**
     * set 实例名，新建订单时必传，只能包含汉字、英文字母、下划线、破折号、数字，且长度不能超过16
     *
     * @param nickName
     */
    public OrderReq nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }


    /**
     * set 下单成功后返回的url, eg:http://abc.com
     *
     * @param returnURL
     */
    public OrderReq returnURL(String returnURL) {
        this.returnURL = returnURL;
        return this;
    }


    /**
     * set 额外的qps扩展包,单位为M 该值为50M的倍数
     *
     * @param extraBitsLimit
     */
    public OrderReq extraBitsLimit(Integer extraBitsLimit) {
        this.extraBitsLimit = extraBitsLimit;
        return this;
    }


    /**
     * set 云鼎的appCode
     *
     * @param appCode
     */
    public OrderReq appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }


    /**
     * set 云鼎的serviceCode
     *
     * @param serviceCode
     */
    public OrderReq serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 购物车活动参数
     *
     * @param buyScenario
     */
    public OrderReq buyScenario(String buyScenario) {
        this.buyScenario = buyScenario;
        return this;
    }


    /**
     * set true表示支持autoPay
     *
     * @param needPay
     */
    public OrderReq needPay(Boolean needPay) {
        this.needPay = needPay;
        return this;
    }


}