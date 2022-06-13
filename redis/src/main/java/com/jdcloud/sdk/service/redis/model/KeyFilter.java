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

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * key清理过滤条件
 */
public class KeyFilter  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 按过期时间过滤(ttl)、按空闲时间过滤(idle)
     * Required:true
     */
    @Required
    private String filterType;

    /**
     * 操作符(eq、gt、lt)
     * Required:true
     */
    @Required
    private String operator;

    /**
     * 操作值
     * Required:true
     */
    @Required
    private Integer value;


    /**
     * get 按过期时间过滤(ttl)、按空闲时间过滤(idle)
     *
     * @return
     */
    public String getFilterType() {
        return filterType;
    }

    /**
     * set 按过期时间过滤(ttl)、按空闲时间过滤(idle)
     *
     * @param filterType
     */
    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    /**
     * get 操作符(eq、gt、lt)
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 操作符(eq、gt、lt)
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * get 操作值
     *
     * @return
     */
    public Integer getValue() {
        return value;
    }

    /**
     * set 操作值
     *
     * @param value
     */
    public void setValue(Integer value) {
        this.value = value;
    }


    /**
     * set 按过期时间过滤(ttl)、按空闲时间过滤(idle)
     *
     * @param filterType
     */
    public KeyFilter filterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    /**
     * set 操作符(eq、gt、lt)
     *
     * @param operator
     */
    public KeyFilter operator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * set 操作值
     *
     * @param value
     */
    public KeyFilter value(Integer value) {
        this.value = value;
        return this;
    }


}