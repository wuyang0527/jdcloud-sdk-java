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


/**
 * filter
 */
public class Filter  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 筛选器标识符
     */
    private String id;

    /**
     * 要使用的筛选器表达式
     */
    private String expression;

    /**
     * 此筛选器当前是否已暂停
     */
    private Boolean paused;

    /**
     * 可用于描述过滤器用途的注释
     */
    private String description;

    /**
     * 短引用标记，用于快速选择相关规则。
     */
    private String ref;


    /**
     * get 筛选器标识符
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 筛选器标识符
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 要使用的筛选器表达式
     *
     * @return
     */
    public String getExpression() {
        return expression;
    }

    /**
     * set 要使用的筛选器表达式
     *
     * @param expression
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * get 此筛选器当前是否已暂停
     *
     * @return
     */
    public Boolean getPaused() {
        return paused;
    }

    /**
     * set 此筛选器当前是否已暂停
     *
     * @param paused
     */
    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    /**
     * get 可用于描述过滤器用途的注释
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 可用于描述过滤器用途的注释
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 短引用标记，用于快速选择相关规则。
     *
     * @return
     */
    public String getRef() {
        return ref;
    }

    /**
     * set 短引用标记，用于快速选择相关规则。
     *
     * @param ref
     */
    public void setRef(String ref) {
        this.ref = ref;
    }


    /**
     * set 筛选器标识符
     *
     * @param id
     */
    public Filter id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 要使用的筛选器表达式
     *
     * @param expression
     */
    public Filter expression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * set 此筛选器当前是否已暂停
     *
     * @param paused
     */
    public Filter paused(Boolean paused) {
        this.paused = paused;
        return this;
    }

    /**
     * set 可用于描述过滤器用途的注释
     *
     * @param description
     */
    public Filter description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 短引用标记，用于快速选择相关规则。
     *
     * @param ref
     */
    public Filter ref(String ref) {
        this.ref = ref;
        return this;
    }


}