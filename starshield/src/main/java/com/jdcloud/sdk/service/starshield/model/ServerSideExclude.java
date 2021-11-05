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
 * serverSideExclude
 */
public class ServerSideExclude  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID of the zone setting
     */
    private String id;

    /**
     * Value of the zone setting
     */
    private String value;

    /**
     * Whether or not this setting can be modified for this zone (based on your JDC StarShield plan level)
     */
    private Boolean editable;

    /**
     * last time this setting was modified
     */
    private String modified_on;


    /**
     * get ID of the zone setting
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set ID of the zone setting
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get Value of the zone setting
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set Value of the zone setting
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * get Whether or not this setting can be modified for this zone (based on your JDC StarShield plan level)
     *
     * @return
     */
    public Boolean getEditable() {
        return editable;
    }

    /**
     * set Whether or not this setting can be modified for this zone (based on your JDC StarShield plan level)
     *
     * @param editable
     */
    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    /**
     * get last time this setting was modified
     *
     * @return
     */
    public String getModified_on() {
        return modified_on;
    }

    /**
     * set last time this setting was modified
     *
     * @param modified_on
     */
    public void setModified_on(String modified_on) {
        this.modified_on = modified_on;
    }


    /**
     * set ID of the zone setting
     *
     * @param id
     */
    public ServerSideExclude id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set Value of the zone setting
     *
     * @param value
     */
    public ServerSideExclude value(String value) {
        this.value = value;
        return this;
    }

    /**
     * set Whether or not this setting can be modified for this zone (based on your JDC StarShield plan level)
     *
     * @param editable
     */
    public ServerSideExclude editable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    /**
     * set last time this setting was modified
     *
     * @param modified_on
     */
    public ServerSideExclude modified_on(String modified_on) {
        this.modified_on = modified_on;
        return this;
    }


}