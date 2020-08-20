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

import java.util.List;
import java.util.ArrayList;

/**
 * stdBotRules
 */
public class StdBotRules  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * bot类型
     */
    private String botType;

    /**
     * bot子类
     */
    private List<String> subType;

    /**
     * 0-使用中，1-禁用
     */
    private Integer disable;

    /**
     * 动作配置
     */
    private DenyActionCfg action;


    /**
     * get bot类型
     *
     * @return
     */
    public String getBotType() {
        return botType;
    }

    /**
     * set bot类型
     *
     * @param botType
     */
    public void setBotType(String botType) {
        this.botType = botType;
    }

    /**
     * get bot子类
     *
     * @return
     */
    public List<String> getSubType() {
        return subType;
    }

    /**
     * set bot子类
     *
     * @param subType
     */
    public void setSubType(List<String> subType) {
        this.subType = subType;
    }

    /**
     * get 0-使用中，1-禁用
     *
     * @return
     */
    public Integer getDisable() {
        return disable;
    }

    /**
     * set 0-使用中，1-禁用
     *
     * @param disable
     */
    public void setDisable(Integer disable) {
        this.disable = disable;
    }

    /**
     * get 动作配置
     *
     * @return
     */
    public DenyActionCfg getAction() {
        return action;
    }

    /**
     * set 动作配置
     *
     * @param action
     */
    public void setAction(DenyActionCfg action) {
        this.action = action;
    }


    /**
     * set bot类型
     *
     * @param botType
     */
    public StdBotRules botType(String botType) {
        this.botType = botType;
        return this;
    }

    /**
     * set bot子类
     *
     * @param subType
     */
    public StdBotRules subType(List<String> subType) {
        this.subType = subType;
        return this;
    }

    /**
     * set 0-使用中，1-禁用
     *
     * @param disable
     */
    public StdBotRules disable(Integer disable) {
        this.disable = disable;
        return this;
    }

    /**
     * set 动作配置
     *
     * @param action
     */
    public StdBotRules action(DenyActionCfg action) {
        this.action = action;
        return this;
    }


    /**
     * add item to bot子类
     *
     * @param subType
     */
    public void addSubType(String subType) {
        if (this.subType == null) {
            this.subType = new ArrayList<>();
        }
        this.subType.add(subType);
    }

}