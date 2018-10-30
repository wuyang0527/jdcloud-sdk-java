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

package com.jdcloud.sdk.service.clouddnsservice.model;


/**
 * setalb
 */
public class Setalb  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 解析记录的ID。在getALB接口中获取。
     */
    private Integer id;

    /**
     * 此条解析记录的权重。
     */
    private Integer weight;


    /**
     * get 解析记录的ID。在getALB接口中获取。
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 解析记录的ID。在getALB接口中获取。
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 此条解析记录的权重。
     *
     * @return
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * set 此条解析记录的权重。
     *
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    /**
     * set 解析记录的ID。在getALB接口中获取。
     *
     * @param id
     */
    public Setalb id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 此条解析记录的权重。
     *
     * @param weight
     */
    public Setalb weight(Integer weight) {
        this.weight = weight;
        return this;
    }


}