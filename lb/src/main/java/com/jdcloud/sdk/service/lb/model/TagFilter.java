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

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;

/**
 * tagFilter
 */
public class TagFilter  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Tag键
     */
    private String key;

    /**
     * Tag值
     */
    private List<String> values;


    /**
     * get Tag键
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set Tag键
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * get Tag值
     *
     * @return
     */
    public List<String> getValues() {
        return values;
    }

    /**
     * set Tag值
     *
     * @param values
     */
    public void setValues(List<String> values) {
        this.values = values;
    }


    /**
     * set Tag键
     *
     * @param key
     */
    public TagFilter key(String key) {
        this.key = key;
        return this;
    }

    /**
     * set Tag值
     *
     * @param values
     */
    public TagFilter values(List<String> values) {
        this.values = values;
        return this;
    }


    /**
     * add item to Tag值
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