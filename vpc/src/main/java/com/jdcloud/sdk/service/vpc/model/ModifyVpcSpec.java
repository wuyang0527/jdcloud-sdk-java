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

package com.jdcloud.sdk.service.vpc.model;


/**
 * modifyVpcSpec
 */
public class ModifyVpcSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 私有网络名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     */
    private String vpcName;

    /**
     * vpc描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     */
    private String description;

    /**
     * 取值包括true、false，默认为false，不开启组播。
     */
    private Boolean enableMulticast;



    /**
     * get 私有网络名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @return
     */
    public String getVpcName() {
        return vpcName;
    }

    /**
     * set 私有网络名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param vpcName
     */
    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }


    /**
     * get vpc描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set vpc描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 取值包括true、false，默认为false，不开启组播。
     *
     * @return
     */
    public Boolean getEnableMulticast() {
        return enableMulticast;
    }

    /**
     * set 取值包括true、false，默认为false，不开启组播。
     *
     * @param enableMulticast
     */
    public void setEnableMulticast(Boolean enableMulticast) {
        this.enableMulticast = enableMulticast;
    }



    /**
     * set 私有网络名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param vpcName
     */
    public ModifyVpcSpec vpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }


    /**
     * set vpc描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @param description
     */
    public ModifyVpcSpec description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 取值包括true、false，默认为false，不开启组播。
     *
     * @param enableMulticast
     */
    public ModifyVpcSpec enableMulticast(Boolean enableMulticast) {
        this.enableMulticast = enableMulticast;
        return this;
    }


}