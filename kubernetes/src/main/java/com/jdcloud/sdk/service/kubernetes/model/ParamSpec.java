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

package com.jdcloud.sdk.service.kubernetes.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 组件参数
 */
public class ParamSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 组件参数键
     * Required:true
     */
    @Required
    private String key;

    /**
     * 组件参数值
     */
    private String name;



    /**
     * get 组件参数键
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 组件参数键
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
     * get 组件参数值
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 组件参数值
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }



    /**
     * set 组件参数键
     *
     * @param key
     */
    public ParamSpec key(String key) {
        this.key = key;
        return this;
    }


    /**
     * set 组件参数值
     *
     * @param name
     */
    public ParamSpec name(String name) {
        this.name = name;
        return this;
    }


}