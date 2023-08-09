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

package com.jdcloud.sdk.service.dts.model;


/**
 * 实例规格信息
 */
public class InstanceClass  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例规格名称
     */
    private String name;

    /**
     * 计费代码
     */
    private String priceCode;



    /**
     * get 实例规格名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 实例规格名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 计费代码
     *
     * @return
     */
    public String getPriceCode() {
        return priceCode;
    }

    /**
     * set 计费代码
     *
     * @param priceCode
     */
    public void setPriceCode(String priceCode) {
        this.priceCode = priceCode;
    }



    /**
     * set 实例规格名称
     *
     * @param name
     */
    public InstanceClass name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 计费代码
     *
     * @param priceCode
     */
    public InstanceClass priceCode(String priceCode) {
        this.priceCode = priceCode;
        return this;
    }


}