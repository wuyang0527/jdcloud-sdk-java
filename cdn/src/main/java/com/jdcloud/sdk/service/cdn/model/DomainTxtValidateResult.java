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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 域名txt校验
 */
public class DomainTxtValidateResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否校验通过，true通过，false不通过
     */
    private Boolean pass;

    /**
     * 不通过原因，仅校验不通过时有值
     */
    private String errMsg;



    /**
     * get 是否校验通过，true通过，false不通过
     *
     * @return
     */
    public Boolean getPass() {
        return pass;
    }

    /**
     * set 是否校验通过，true通过，false不通过
     *
     * @param pass
     */
    public void setPass(Boolean pass) {
        this.pass = pass;
    }


    /**
     * get 不通过原因，仅校验不通过时有值
     *
     * @return
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * set 不通过原因，仅校验不通过时有值
     *
     * @param errMsg
     */
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }



    /**
     * set 是否校验通过，true通过，false不通过
     *
     * @param pass
     */
    public DomainTxtValidateResult pass(Boolean pass) {
        this.pass = pass;
        return this;
    }


    /**
     * set 不通过原因，仅校验不通过时有值
     *
     * @param errMsg
     */
    public DomainTxtValidateResult errMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }


}