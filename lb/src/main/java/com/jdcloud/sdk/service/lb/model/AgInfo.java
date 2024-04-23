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


/**
 * agInfo
 */
public class AgInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 高可用组的Id
     */
    private String agId;

    /**
     * 默认权重
     */
    private Integer defaultWeight;



    /**
     * get 高可用组的Id
     *
     * @return
     */
    public String getAgId() {
        return agId;
    }

    /**
     * set 高可用组的Id
     *
     * @param agId
     */
    public void setAgId(String agId) {
        this.agId = agId;
    }


    /**
     * get 默认权重
     *
     * @return
     */
    public Integer getDefaultWeight() {
        return defaultWeight;
    }

    /**
     * set 默认权重
     *
     * @param defaultWeight
     */
    public void setDefaultWeight(Integer defaultWeight) {
        this.defaultWeight = defaultWeight;
    }



    /**
     * set 高可用组的Id
     *
     * @param agId
     */
    public AgInfo agId(String agId) {
        this.agId = agId;
        return this;
    }


    /**
     * set 默认权重
     *
     * @param defaultWeight
     */
    public AgInfo defaultWeight(Integer defaultWeight) {
        this.defaultWeight = defaultWeight;
        return this;
    }


}