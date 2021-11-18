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
 * meta
 */
public class Meta  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 如果星盾在初始设置期间自动添加了此 DNS 记录，则会存在。
     */
    private Boolean auto_added;

    /**
     * 记录来自哪里
     */
    private String source;


    /**
     * get 如果星盾在初始设置期间自动添加了此 DNS 记录，则会存在。
     *
     * @return
     */
    public Boolean getAuto_added() {
        return auto_added;
    }

    /**
     * set 如果星盾在初始设置期间自动添加了此 DNS 记录，则会存在。
     *
     * @param auto_added
     */
    public void setAuto_added(Boolean auto_added) {
        this.auto_added = auto_added;
    }

    /**
     * get 记录来自哪里
     *
     * @return
     */
    public String getSource() {
        return source;
    }

    /**
     * set 记录来自哪里
     *
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }


    /**
     * set 如果星盾在初始设置期间自动添加了此 DNS 记录，则会存在。
     *
     * @param auto_added
     */
    public Meta auto_added(Boolean auto_added) {
        this.auto_added = auto_added;
        return this;
    }

    /**
     * set 记录来自哪里
     *
     * @param source
     */
    public Meta source(String source) {
        this.source = source;
        return this;
    }


}