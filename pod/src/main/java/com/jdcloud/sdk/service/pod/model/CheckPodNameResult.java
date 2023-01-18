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
 * Pod
 * Pod 相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * podName 是否符合命名规范，以及查询指定 podName 区域内是否已经存在。

 */
public class CheckPodNameResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户指定 podName 是否通过校验 0 通过 1 名称为空 2 不符合规范 3 重名。
     */
    private Integer code;

    /**
     * code 字段非零时，给出详细原因。
     */
    private String reason;



    /**
     * get 用户指定 podName 是否通过校验 0 通过 1 名称为空 2 不符合规范 3 重名。
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set 用户指定 podName 是否通过校验 0 通过 1 名称为空 2 不符合规范 3 重名。
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }


    /**
     * get code 字段非零时，给出详细原因。
     *
     * @return
     */
    public String getReason() {
        return reason;
    }

    /**
     * set code 字段非零时，给出详细原因。
     *
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }



    /**
     * set 用户指定 podName 是否通过校验 0 通过 1 名称为空 2 不符合规范 3 重名。
     *
     * @param code
     */
    public CheckPodNameResult code(Integer code) {
        this.code = code;
        return this;
    }


    /**
     * set code 字段非零时，给出详细原因。
     *
     * @param reason
     */
    public CheckPodNameResult reason(String reason) {
        this.reason = reason;
        return this;
    }


}