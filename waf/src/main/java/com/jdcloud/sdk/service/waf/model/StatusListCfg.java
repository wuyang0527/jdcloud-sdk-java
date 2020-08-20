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


/**
 * statusListCfg
 */
public class StatusListCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则名称
     */
    private String name;

    /**
     * 原有状态码
     */
    private String oriStatus;

    /**
     * 设置状态码，只能为&quot;200&quot;，&quot;302&quot;
     */
    private String setStatus;

    /**
     * 设置状态码为&quot;200&quot;时，改值为自定义页面名称，&quot;302&quot;时为跳转url
     */
    private String val;

    /**
     * 更新时间，s
     */
    private Integer updateTime;

    /**
     * 0-使用中 1-禁用
     */
    private Integer disable;


    /**
     * get 规则名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 规则名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 原有状态码
     *
     * @return
     */
    public String getOriStatus() {
        return oriStatus;
    }

    /**
     * set 原有状态码
     *
     * @param oriStatus
     */
    public void setOriStatus(String oriStatus) {
        this.oriStatus = oriStatus;
    }

    /**
     * get 设置状态码，只能为&quot;200&quot;，&quot;302&quot;
     *
     * @return
     */
    public String getSetStatus() {
        return setStatus;
    }

    /**
     * set 设置状态码，只能为&quot;200&quot;，&quot;302&quot;
     *
     * @param setStatus
     */
    public void setSetStatus(String setStatus) {
        this.setStatus = setStatus;
    }

    /**
     * get 设置状态码为&quot;200&quot;时，改值为自定义页面名称，&quot;302&quot;时为跳转url
     *
     * @return
     */
    public String getVal() {
        return val;
    }

    /**
     * set 设置状态码为&quot;200&quot;时，改值为自定义页面名称，&quot;302&quot;时为跳转url
     *
     * @param val
     */
    public void setVal(String val) {
        this.val = val;
    }

    /**
     * get 更新时间，s
     *
     * @return
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间，s
     *
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 0-使用中 1-禁用
     *
     * @return
     */
    public Integer getDisable() {
        return disable;
    }

    /**
     * set 0-使用中 1-禁用
     *
     * @param disable
     */
    public void setDisable(Integer disable) {
        this.disable = disable;
    }


    /**
     * set 规则名称
     *
     * @param name
     */
    public StatusListCfg name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 原有状态码
     *
     * @param oriStatus
     */
    public StatusListCfg oriStatus(String oriStatus) {
        this.oriStatus = oriStatus;
        return this;
    }

    /**
     * set 设置状态码，只能为&quot;200&quot;，&quot;302&quot;
     *
     * @param setStatus
     */
    public StatusListCfg setStatus(String setStatus) {
        this.setStatus = setStatus;
        return this;
    }

    /**
     * set 设置状态码为&quot;200&quot;时，改值为自定义页面名称，&quot;302&quot;时为跳转url
     *
     * @param val
     */
    public StatusListCfg val(String val) {
        this.val = val;
        return this;
    }

    /**
     * set 更新时间，s
     *
     * @param updateTime
     */
    public StatusListCfg updateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 0-使用中 1-禁用
     *
     * @param disable
     */
    public StatusListCfg disable(Integer disable) {
        this.disable = disable;
        return this;
    }


}