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
 * auto_MinifyAssets
 */
public class Auto_MinifyAssets  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域设置的ID
     */
    private String id;

    /**
     * value
     */
    private Value_0_0 value;

    /**
     * 该配置是否可以修改
     */
    private Boolean editable;

    /**
     * 上次修改此设置的时间
     */
    private String modified_on;


    /**
     * get 域设置的ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 域设置的ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get value
     *
     * @return
     */
    public Value_0_0 getValue() {
        return value;
    }

    /**
     * set value
     *
     * @param value
     */
    public void setValue(Value_0_0 value) {
        this.value = value;
    }

    /**
     * get 该配置是否可以修改
     *
     * @return
     */
    public Boolean getEditable() {
        return editable;
    }

    /**
     * set 该配置是否可以修改
     *
     * @param editable
     */
    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    /**
     * get 上次修改此设置的时间
     *
     * @return
     */
    public String getModified_on() {
        return modified_on;
    }

    /**
     * set 上次修改此设置的时间
     *
     * @param modified_on
     */
    public void setModified_on(String modified_on) {
        this.modified_on = modified_on;
    }


    /**
     * set 域设置的ID
     *
     * @param id
     */
    public Auto_MinifyAssets id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set value
     *
     * @param value
     */
    public Auto_MinifyAssets value(Value_0_0 value) {
        this.value = value;
        return this;
    }

    /**
     * set 该配置是否可以修改
     *
     * @param editable
     */
    public Auto_MinifyAssets editable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    /**
     * set 上次修改此设置的时间
     *
     * @param modified_on
     */
    public Auto_MinifyAssets modified_on(String modified_on) {
        this.modified_on = modified_on;
        return this;
    }


}