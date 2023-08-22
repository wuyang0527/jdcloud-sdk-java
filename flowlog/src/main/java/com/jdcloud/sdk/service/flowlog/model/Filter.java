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

package com.jdcloud.sdk.service.flowlog.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * filter
 */
public class Filter  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 过滤条件的名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 过滤条件的操作符，默认eq
     */
    private String operator;

    /**
     * 过滤条件的值
     * Required:true
     */
    @Required
    
    private List<String> values;


    /**
     * get 过滤条件的名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 过滤条件的名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 过滤条件的操作符，默认eq
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 过滤条件的操作符，默认eq
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }


    /**
    * get 过滤条件的值
    *
    * @return
    */
    public List<String> getValues() {
        return values;
    }

    /**
    * set 过滤条件的值
    *
    * @param values
    */
    public void setValues(List<String> values) {
        this.values = values;
    }



    /**
     * set 过滤条件的名称
     *
     * @param name
     */
    public Filter name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 过滤条件的操作符，默认eq
     *
     * @param operator
     */
    public Filter operator(String operator) {
        this.operator = operator;
        return this;
    }


    /**
    * set 过滤条件的值
    *
    * @param values
    */
    public Filter values(List<String> values) {
        this.values = values;
        return this;
    }



    /**
     * add item to 过滤条件的值
     *
     * @param value
     */
    public void addValue(String value) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(value);
    }
}