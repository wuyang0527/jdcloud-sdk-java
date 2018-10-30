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
 * result
 */
public class Result  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回的状态码
     */
    private Integer code;

    /**
     * 状态码相应的说明/错误说明
     */
    private String detail;


    /**
     * get 返回的状态码
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set 返回的状态码
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * get 状态码相应的说明/错误说明
     *
     * @return
     */
    public String getDetail() {
        return detail;
    }

    /**
     * set 状态码相应的说明/错误说明
     *
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }


    /**
     * set 返回的状态码
     *
     * @param code
     */
    public Result code(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * set 状态码相应的说明/错误说明
     *
     * @param detail
     */
    public Result detail(String detail) {
        this.detail = detail;
        return this;
    }


}