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

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;

/**
 * pageRule
 */
public class PageRule  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * API条目标识符标签
     */
    private String id;

    /**
     * 对请求进行评估的目标
     */
    private List<Target> targets;

    /**
     * 如果此规则的目标与请求相匹配，要执行的一系列行动。行动可以将网址重定向到另一个网址或覆盖设置（但不能同时进行）。
     */
    private List<Action> actions;

    /**
     * 一个数字，表示一个页面规则优先于另一个页面规则。
如果您可能有一个全面页面规则（例如#1 &#39;/images/&#39;）
但是想要更具体的规则优先（例如#2 &#39;/images/special/），
您需要在后者（#2）上指定更高的优先级，以便它将覆盖第一个优先级。

     */
    private Integer priority;

    /**
     * 页面规则的状态
     */
    private String status;

    /**
     * 上次修改页面规则的时间
     */
    private String modified_on;

    /**
     * 创建页面规则时间
     */
    private String created_on;


    /**
     * get API条目标识符标签
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set API条目标识符标签
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 对请求进行评估的目标
     *
     * @return
     */
    public List<Target> getTargets() {
        return targets;
    }

    /**
     * set 对请求进行评估的目标
     *
     * @param targets
     */
    public void setTargets(List<Target> targets) {
        this.targets = targets;
    }

    /**
     * get 如果此规则的目标与请求相匹配，要执行的一系列行动。行动可以将网址重定向到另一个网址或覆盖设置（但不能同时进行）。
     *
     * @return
     */
    public List<Action> getActions() {
        return actions;
    }

    /**
     * set 如果此规则的目标与请求相匹配，要执行的一系列行动。行动可以将网址重定向到另一个网址或覆盖设置（但不能同时进行）。
     *
     * @param actions
     */
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    /**
     * get 一个数字，表示一个页面规则优先于另一个页面规则。
如果您可能有一个全面页面规则（例如#1 &#39;/images/&#39;）
但是想要更具体的规则优先（例如#2 &#39;/images/special/），
您需要在后者（#2）上指定更高的优先级，以便它将覆盖第一个优先级。

     *
     * @return
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * set 一个数字，表示一个页面规则优先于另一个页面规则。
如果您可能有一个全面页面规则（例如#1 &#39;/images/&#39;）
但是想要更具体的规则优先（例如#2 &#39;/images/special/），
您需要在后者（#2）上指定更高的优先级，以便它将覆盖第一个优先级。

     *
     * @param priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * get 页面规则的状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 页面规则的状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 上次修改页面规则的时间
     *
     * @return
     */
    public String getModified_on() {
        return modified_on;
    }

    /**
     * set 上次修改页面规则的时间
     *
     * @param modified_on
     */
    public void setModified_on(String modified_on) {
        this.modified_on = modified_on;
    }

    /**
     * get 创建页面规则时间
     *
     * @return
     */
    public String getCreated_on() {
        return created_on;
    }

    /**
     * set 创建页面规则时间
     *
     * @param created_on
     */
    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }


    /**
     * set API条目标识符标签
     *
     * @param id
     */
    public PageRule id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 对请求进行评估的目标
     *
     * @param targets
     */
    public PageRule targets(List<Target> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * set 如果此规则的目标与请求相匹配，要执行的一系列行动。行动可以将网址重定向到另一个网址或覆盖设置（但不能同时进行）。
     *
     * @param actions
     */
    public PageRule actions(List<Action> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * set 一个数字，表示一个页面规则优先于另一个页面规则。
如果您可能有一个全面页面规则（例如#1 &#39;/images/&#39;）
但是想要更具体的规则优先（例如#2 &#39;/images/special/），
您需要在后者（#2）上指定更高的优先级，以便它将覆盖第一个优先级。

     *
     * @param priority
     */
    public PageRule priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * set 页面规则的状态
     *
     * @param status
     */
    public PageRule status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 上次修改页面规则的时间
     *
     * @param modified_on
     */
    public PageRule modified_on(String modified_on) {
        this.modified_on = modified_on;
        return this;
    }

    /**
     * set 创建页面规则时间
     *
     * @param created_on
     */
    public PageRule created_on(String created_on) {
        this.created_on = created_on;
        return this;
    }


    /**
     * add item to 对请求进行评估的目标
     *
     * @param target
     */
    public void addTarget(Target target) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(target);
    }

    /**
     * add item to 如果此规则的目标与请求相匹配，要执行的一系列行动。行动可以将网址重定向到另一个网址或覆盖设置（但不能同时进行）。
     *
     * @param action
     */
    public void addAction(Action action) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(action);
    }

}