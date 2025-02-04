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

package com.jdcloud.sdk.service.billing.model;


/**
 * resourceStopDeleteRuleVo
 */
public class ResourceStopDeleteRuleVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Number id;

    /**
     * 站点
     */
    private Integer site;

    /**
     * 产品线编码
     */
    private String appCode;

    /**
     * 产品线名称
     */
    private String appCodeName;

    /**
     * 产品编码
     */
    private String serviceCode;

    /**
     * 产品名称
     */
    private String serviceCodeName;

    /**
     * 规则类型 1：试用规则 2、用户产品规则 3：用户规则 4：产品规则 5：通用规则 6：用户等级产品规则
     */
    private Integer ruleType;

    /**
     * pin
     */
    private String pin;

    /**
     * 按配置欠费是否停服  1：欠费需要停服 0：欠费不需要停服
     */
    private Integer arrearStop;

    /**
     * 按配置欠费停服延后时长
     */
    private Integer arrearStopDelayHours;

    /**
     * 按配置欠费停服是否释放资源  1：需要释放资源 0：不需要释放资源
     */
    private Integer arrearDelete;

    /**
     * 按配置欠费停服释放资源延后时长
     */
    private Integer arrearDeleteDelayHours;

    /**
     * 到期是否停服  1：到期需要停服 0：到期不需要停服
     */
    private Integer expireStop;

    /**
     * 到期停服延后时长
     */
    private Integer expireStopDelayHours;

    /**
     * 到期停服是否释放资源  1：需要释放资源 0：不需要释放资源
     */
    private Integer expireDelete;

    /**
     * 到期停服释放资源延后时长
     */
    private Integer expireDeleteDelayHours;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 按配置欠费释放类型 1：释放资源  2：释放数据
     */
    private Integer arrearDeleteType;

    /**
     * 到期释放类型 1：释放资源  2：释放数据
     */
    private Integer expireDeleteType;

    /**
     * 按用量欠费是否停服  1：欠费需要停服 0：欠费不需要停服
     */
    private Integer flowArrearStop;

    /**
     * 按用量欠费停服延后时长
     */
    private Integer flowArrearStopDelayHours;

    /**
     * 按用量欠费停服是否释放资源  1：需要释放资源 0：不需要释放资源
     */
    private Integer flowArrearDelete;

    /**
     * 按用量欠费停服释放资源延后时长
     */
    private Integer flowArrearDeleteDelayHours;

    /**
     * 按用量欠费释放类型 1：释放资源  2：释放数据
     */
    private Integer flowArrearDeleteType;

    /**
     * 客户级别 1-普通客户 2-VIP客户
     */
    private Integer clientType;


    /**
     * get 主键
     *
     * @return
     */
    public Number getId() {
        return id;
    }

    /**
     * set 主键
     *
     * @param id
     */
    public void setId(Number id) {
        this.id = id;
    }

    /**
     * get 站点
     *
     * @return
     */
    public Integer getSite() {
        return site;
    }

    /**
     * set 站点
     *
     * @param site
     */
    public void setSite(Integer site) {
        this.site = site;
    }

    /**
     * get 产品线编码
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 产品线编码
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get 产品线名称
     *
     * @return
     */
    public String getAppCodeName() {
        return appCodeName;
    }

    /**
     * set 产品线名称
     *
     * @param appCodeName
     */
    public void setAppCodeName(String appCodeName) {
        this.appCodeName = appCodeName;
    }

    /**
     * get 产品编码
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品编码
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 产品名称
     *
     * @return
     */
    public String getServiceCodeName() {
        return serviceCodeName;
    }

    /**
     * set 产品名称
     *
     * @param serviceCodeName
     */
    public void setServiceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
    }

    /**
     * get 规则类型 1：试用规则 2、用户产品规则 3：用户规则 4：产品规则 5：通用规则 6：用户等级产品规则
     *
     * @return
     */
    public Integer getRuleType() {
        return ruleType;
    }

    /**
     * set 规则类型 1：试用规则 2、用户产品规则 3：用户规则 4：产品规则 5：通用规则 6：用户等级产品规则
     *
     * @param ruleType
     */
    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

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
     * get 按配置欠费是否停服  1：欠费需要停服 0：欠费不需要停服
     *
     * @return
     */
    public Integer getArrearStop() {
        return arrearStop;
    }

    /**
     * set 按配置欠费是否停服  1：欠费需要停服 0：欠费不需要停服
     *
     * @param arrearStop
     */
    public void setArrearStop(Integer arrearStop) {
        this.arrearStop = arrearStop;
    }

    /**
     * get 按配置欠费停服延后时长
     *
     * @return
     */
    public Integer getArrearStopDelayHours() {
        return arrearStopDelayHours;
    }

    /**
     * set 按配置欠费停服延后时长
     *
     * @param arrearStopDelayHours
     */
    public void setArrearStopDelayHours(Integer arrearStopDelayHours) {
        this.arrearStopDelayHours = arrearStopDelayHours;
    }

    /**
     * get 按配置欠费停服是否释放资源  1：需要释放资源 0：不需要释放资源
     *
     * @return
     */
    public Integer getArrearDelete() {
        return arrearDelete;
    }

    /**
     * set 按配置欠费停服是否释放资源  1：需要释放资源 0：不需要释放资源
     *
     * @param arrearDelete
     */
    public void setArrearDelete(Integer arrearDelete) {
        this.arrearDelete = arrearDelete;
    }

    /**
     * get 按配置欠费停服释放资源延后时长
     *
     * @return
     */
    public Integer getArrearDeleteDelayHours() {
        return arrearDeleteDelayHours;
    }

    /**
     * set 按配置欠费停服释放资源延后时长
     *
     * @param arrearDeleteDelayHours
     */
    public void setArrearDeleteDelayHours(Integer arrearDeleteDelayHours) {
        this.arrearDeleteDelayHours = arrearDeleteDelayHours;
    }

    /**
     * get 到期是否停服  1：到期需要停服 0：到期不需要停服
     *
     * @return
     */
    public Integer getExpireStop() {
        return expireStop;
    }

    /**
     * set 到期是否停服  1：到期需要停服 0：到期不需要停服
     *
     * @param expireStop
     */
    public void setExpireStop(Integer expireStop) {
        this.expireStop = expireStop;
    }

    /**
     * get 到期停服延后时长
     *
     * @return
     */
    public Integer getExpireStopDelayHours() {
        return expireStopDelayHours;
    }

    /**
     * set 到期停服延后时长
     *
     * @param expireStopDelayHours
     */
    public void setExpireStopDelayHours(Integer expireStopDelayHours) {
        this.expireStopDelayHours = expireStopDelayHours;
    }

    /**
     * get 到期停服是否释放资源  1：需要释放资源 0：不需要释放资源
     *
     * @return
     */
    public Integer getExpireDelete() {
        return expireDelete;
    }

    /**
     * set 到期停服是否释放资源  1：需要释放资源 0：不需要释放资源
     *
     * @param expireDelete
     */
    public void setExpireDelete(Integer expireDelete) {
        this.expireDelete = expireDelete;
    }

    /**
     * get 到期停服释放资源延后时长
     *
     * @return
     */
    public Integer getExpireDeleteDelayHours() {
        return expireDeleteDelayHours;
    }

    /**
     * set 到期停服释放资源延后时长
     *
     * @param expireDeleteDelayHours
     */
    public void setExpireDeleteDelayHours(Integer expireDeleteDelayHours) {
        this.expireDeleteDelayHours = expireDeleteDelayHours;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 按配置欠费释放类型 1：释放资源  2：释放数据
     *
     * @return
     */
    public Integer getArrearDeleteType() {
        return arrearDeleteType;
    }

    /**
     * set 按配置欠费释放类型 1：释放资源  2：释放数据
     *
     * @param arrearDeleteType
     */
    public void setArrearDeleteType(Integer arrearDeleteType) {
        this.arrearDeleteType = arrearDeleteType;
    }

    /**
     * get 到期释放类型 1：释放资源  2：释放数据
     *
     * @return
     */
    public Integer getExpireDeleteType() {
        return expireDeleteType;
    }

    /**
     * set 到期释放类型 1：释放资源  2：释放数据
     *
     * @param expireDeleteType
     */
    public void setExpireDeleteType(Integer expireDeleteType) {
        this.expireDeleteType = expireDeleteType;
    }

    /**
     * get 按用量欠费是否停服  1：欠费需要停服 0：欠费不需要停服
     *
     * @return
     */
    public Integer getFlowArrearStop() {
        return flowArrearStop;
    }

    /**
     * set 按用量欠费是否停服  1：欠费需要停服 0：欠费不需要停服
     *
     * @param flowArrearStop
     */
    public void setFlowArrearStop(Integer flowArrearStop) {
        this.flowArrearStop = flowArrearStop;
    }

    /**
     * get 按用量欠费停服延后时长
     *
     * @return
     */
    public Integer getFlowArrearStopDelayHours() {
        return flowArrearStopDelayHours;
    }

    /**
     * set 按用量欠费停服延后时长
     *
     * @param flowArrearStopDelayHours
     */
    public void setFlowArrearStopDelayHours(Integer flowArrearStopDelayHours) {
        this.flowArrearStopDelayHours = flowArrearStopDelayHours;
    }

    /**
     * get 按用量欠费停服是否释放资源  1：需要释放资源 0：不需要释放资源
     *
     * @return
     */
    public Integer getFlowArrearDelete() {
        return flowArrearDelete;
    }

    /**
     * set 按用量欠费停服是否释放资源  1：需要释放资源 0：不需要释放资源
     *
     * @param flowArrearDelete
     */
    public void setFlowArrearDelete(Integer flowArrearDelete) {
        this.flowArrearDelete = flowArrearDelete;
    }

    /**
     * get 按用量欠费停服释放资源延后时长
     *
     * @return
     */
    public Integer getFlowArrearDeleteDelayHours() {
        return flowArrearDeleteDelayHours;
    }

    /**
     * set 按用量欠费停服释放资源延后时长
     *
     * @param flowArrearDeleteDelayHours
     */
    public void setFlowArrearDeleteDelayHours(Integer flowArrearDeleteDelayHours) {
        this.flowArrearDeleteDelayHours = flowArrearDeleteDelayHours;
    }

    /**
     * get 按用量欠费释放类型 1：释放资源  2：释放数据
     *
     * @return
     */
    public Integer getFlowArrearDeleteType() {
        return flowArrearDeleteType;
    }

    /**
     * set 按用量欠费释放类型 1：释放资源  2：释放数据
     *
     * @param flowArrearDeleteType
     */
    public void setFlowArrearDeleteType(Integer flowArrearDeleteType) {
        this.flowArrearDeleteType = flowArrearDeleteType;
    }

    /**
     * get 客户级别 1-普通客户 2-VIP客户
     *
     * @return
     */
    public Integer getClientType() {
        return clientType;
    }

    /**
     * set 客户级别 1-普通客户 2-VIP客户
     *
     * @param clientType
     */
    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }


    /**
     * set 主键
     *
     * @param id
     */
    public ResourceStopDeleteRuleVo id(Number id) {
        this.id = id;
        return this;
    }

    /**
     * set 站点
     *
     * @param site
     */
    public ResourceStopDeleteRuleVo site(Integer site) {
        this.site = site;
        return this;
    }

    /**
     * set 产品线编码
     *
     * @param appCode
     */
    public ResourceStopDeleteRuleVo appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set 产品线名称
     *
     * @param appCodeName
     */
    public ResourceStopDeleteRuleVo appCodeName(String appCodeName) {
        this.appCodeName = appCodeName;
        return this;
    }

    /**
     * set 产品编码
     *
     * @param serviceCode
     */
    public ResourceStopDeleteRuleVo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 产品名称
     *
     * @param serviceCodeName
     */
    public ResourceStopDeleteRuleVo serviceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
        return this;
    }

    /**
     * set 规则类型 1：试用规则 2、用户产品规则 3：用户规则 4：产品规则 5：通用规则 6：用户等级产品规则
     *
     * @param ruleType
     */
    public ResourceStopDeleteRuleVo ruleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public ResourceStopDeleteRuleVo pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 按配置欠费是否停服  1：欠费需要停服 0：欠费不需要停服
     *
     * @param arrearStop
     */
    public ResourceStopDeleteRuleVo arrearStop(Integer arrearStop) {
        this.arrearStop = arrearStop;
        return this;
    }

    /**
     * set 按配置欠费停服延后时长
     *
     * @param arrearStopDelayHours
     */
    public ResourceStopDeleteRuleVo arrearStopDelayHours(Integer arrearStopDelayHours) {
        this.arrearStopDelayHours = arrearStopDelayHours;
        return this;
    }

    /**
     * set 按配置欠费停服是否释放资源  1：需要释放资源 0：不需要释放资源
     *
     * @param arrearDelete
     */
    public ResourceStopDeleteRuleVo arrearDelete(Integer arrearDelete) {
        this.arrearDelete = arrearDelete;
        return this;
    }

    /**
     * set 按配置欠费停服释放资源延后时长
     *
     * @param arrearDeleteDelayHours
     */
    public ResourceStopDeleteRuleVo arrearDeleteDelayHours(Integer arrearDeleteDelayHours) {
        this.arrearDeleteDelayHours = arrearDeleteDelayHours;
        return this;
    }

    /**
     * set 到期是否停服  1：到期需要停服 0：到期不需要停服
     *
     * @param expireStop
     */
    public ResourceStopDeleteRuleVo expireStop(Integer expireStop) {
        this.expireStop = expireStop;
        return this;
    }

    /**
     * set 到期停服延后时长
     *
     * @param expireStopDelayHours
     */
    public ResourceStopDeleteRuleVo expireStopDelayHours(Integer expireStopDelayHours) {
        this.expireStopDelayHours = expireStopDelayHours;
        return this;
    }

    /**
     * set 到期停服是否释放资源  1：需要释放资源 0：不需要释放资源
     *
     * @param expireDelete
     */
    public ResourceStopDeleteRuleVo expireDelete(Integer expireDelete) {
        this.expireDelete = expireDelete;
        return this;
    }

    /**
     * set 到期停服释放资源延后时长
     *
     * @param expireDeleteDelayHours
     */
    public ResourceStopDeleteRuleVo expireDeleteDelayHours(Integer expireDeleteDelayHours) {
        this.expireDeleteDelayHours = expireDeleteDelayHours;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public ResourceStopDeleteRuleVo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 按配置欠费释放类型 1：释放资源  2：释放数据
     *
     * @param arrearDeleteType
     */
    public ResourceStopDeleteRuleVo arrearDeleteType(Integer arrearDeleteType) {
        this.arrearDeleteType = arrearDeleteType;
        return this;
    }

    /**
     * set 到期释放类型 1：释放资源  2：释放数据
     *
     * @param expireDeleteType
     */
    public ResourceStopDeleteRuleVo expireDeleteType(Integer expireDeleteType) {
        this.expireDeleteType = expireDeleteType;
        return this;
    }

    /**
     * set 按用量欠费是否停服  1：欠费需要停服 0：欠费不需要停服
     *
     * @param flowArrearStop
     */
    public ResourceStopDeleteRuleVo flowArrearStop(Integer flowArrearStop) {
        this.flowArrearStop = flowArrearStop;
        return this;
    }

    /**
     * set 按用量欠费停服延后时长
     *
     * @param flowArrearStopDelayHours
     */
    public ResourceStopDeleteRuleVo flowArrearStopDelayHours(Integer flowArrearStopDelayHours) {
        this.flowArrearStopDelayHours = flowArrearStopDelayHours;
        return this;
    }

    /**
     * set 按用量欠费停服是否释放资源  1：需要释放资源 0：不需要释放资源
     *
     * @param flowArrearDelete
     */
    public ResourceStopDeleteRuleVo flowArrearDelete(Integer flowArrearDelete) {
        this.flowArrearDelete = flowArrearDelete;
        return this;
    }

    /**
     * set 按用量欠费停服释放资源延后时长
     *
     * @param flowArrearDeleteDelayHours
     */
    public ResourceStopDeleteRuleVo flowArrearDeleteDelayHours(Integer flowArrearDeleteDelayHours) {
        this.flowArrearDeleteDelayHours = flowArrearDeleteDelayHours;
        return this;
    }

    /**
     * set 按用量欠费释放类型 1：释放资源  2：释放数据
     *
     * @param flowArrearDeleteType
     */
    public ResourceStopDeleteRuleVo flowArrearDeleteType(Integer flowArrearDeleteType) {
        this.flowArrearDeleteType = flowArrearDeleteType;
        return this;
    }

    /**
     * set 客户级别 1-普通客户 2-VIP客户
     *
     * @param clientType
     */
    public ResourceStopDeleteRuleVo clientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }


}