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

package com.jdcloud.sdk.service.logs.model;

import java.util.List;
import java.util.ArrayList;

/**
 * customLogSearchOut
 */
public class CustomLogSearchOut  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * code
     */
    private Long code;

    /**
     * data
     */
    
    private List<Object> data;
    /**
     * message
     */
    private String message;

    /**
     * size
     */
    private Long size;

    /**
     * total
     */
    private Long total;



    /**
     * get code
     *
     * @return
     */
    public Long getCode() {
        return code;
    }

    /**
     * set code
     *
     * @param code
     */
    public void setCode(Long code) {
        this.code = code;
    }


    /**
    * get data
    *
    * @return
    */
    public List<Object> getData() {
        return data;
    }

    /**
    * set data
    *
    * @param data
    */
    public void setData(List<Object> data) {
        this.data = data;
    }


    /**
     * get message
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set message
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * get size
     *
     * @return
     */
    public Long getSize() {
        return size;
    }

    /**
     * set size
     *
     * @param size
     */
    public void setSize(Long size) {
        this.size = size;
    }


    /**
     * get total
     *
     * @return
     */
    public Long getTotal() {
        return total;
    }

    /**
     * set total
     *
     * @param total
     */
    public void setTotal(Long total) {
        this.total = total;
    }



    /**
     * set code
     *
     * @param code
     */
    public CustomLogSearchOut code(Long code) {
        this.code = code;
        return this;
    }


    /**
    * set data
    *
    * @param data
    */
    public CustomLogSearchOut data(List<Object> data) {
        this.data = data;
        return this;
    }


    /**
     * set message
     *
     * @param message
     */
    public CustomLogSearchOut message(String message) {
        this.message = message;
        return this;
    }


    /**
     * set size
     *
     * @param size
     */
    public CustomLogSearchOut size(Long size) {
        this.size = size;
        return this;
    }


    /**
     * set total
     *
     * @param total
     */
    public CustomLogSearchOut total(Long total) {
        this.total = total;
        return this;
    }



    /**
     * add item to data
     *
     * @param data
     */
    public void addData(Object data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }
}