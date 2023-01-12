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
 * availablePageRule
 */
public class AvailablePageRule  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设置名称
     */
    private String id;

    /**
     * 值的类型
     */
    
    private List<String> properties;


    /**
     * get 设置名称
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 设置名称
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
    * get 值的类型
    *
    * @return
    */
    public List<String> getProperties() {
        return properties;
    }

    /**
    * set 值的类型
    *
    * @param properties
    */
    public void setProperties(List<String> properties) {
        this.properties = properties;
    }



    /**
     * set 设置名称
     *
     * @param id
     */
    public AvailablePageRule id(String id) {
        this.id = id;
        return this;
    }


    /**
    * set 值的类型
    *
    * @param properties
    */
    public AvailablePageRule properties(List<String> properties) {
        this.properties = properties;
        return this;
    }



    /**
     * add item to 值的类型
     *
     * @param propertie
     */
    public void addPropertie(String propertie) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertie);
    }
}