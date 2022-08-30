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

package com.jdcloud.sdk.service.cdn.model;


/**
 * queryLivePrefetchItem
 */
public class QueryLivePrefetchItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * stream
     */
    private String stream;

    /**
     * code
     */
    private Integer code;

    /**
     * message
     */
    private String message;



    /**
     * get stream
     *
     * @return
     */
    public String getStream() {
        return stream;
    }

    /**
     * set stream
     *
     * @param stream
     */
    public void setStream(String stream) {
        this.stream = stream;
    }


    /**
     * get code
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set code
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
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
     * set stream
     *
     * @param stream
     */
    public QueryLivePrefetchItem stream(String stream) {
        this.stream = stream;
        return this;
    }


    /**
     * set code
     *
     * @param code
     */
    public QueryLivePrefetchItem code(Integer code) {
        this.code = code;
        return this;
    }


    /**
     * set message
     *
     * @param message
     */
    public QueryLivePrefetchItem message(String message) {
        this.message = message;
        return this;
    }


}