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

package com.jdcloud.sdk.service.nativecontainer.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 环境变量
 */
public class EnvVar  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 环境变量名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 环境变量的值
     */
    private String value;



    /**
     * get 环境变量名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 环境变量名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 环境变量的值
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 环境变量的值
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }



    /**
     * set 环境变量名称
     *
     * @param name
     */
    public EnvVar name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 环境变量的值
     *
     * @param value
     */
    public EnvVar value(String value) {
        this.value = value;
        return this;
    }


}