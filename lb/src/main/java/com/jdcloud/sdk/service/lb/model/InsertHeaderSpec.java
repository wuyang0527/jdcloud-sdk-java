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

import com.jdcloud.sdk.annotation.Required;

/**
 * insertHeaderSpec
 */
public class InsertHeaderSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * http header的value类型：1.系统值类型；2.自定义值类型
     * Required:true
     */
    @Required
    private Integer valueType;

    /**
     * 新增http header的key，必填，最长40个字符，不区分大小写，支持大小写字母、数字、下划线（_）和短划线（-），不允许使用系统header+部分http标准header，同一个key在插入/删除中只能出现一次，具体不允许的key如下：
1.alb系统的header key：X-Forwarded-For、X-Forwarded-Client-Port、X-Forwarded-Host、X-Forwarded-Port、X-Forwarded-Proto、X-Forwarded-LBIP
2.部分http标准header：connection、upgrade、content-length、transfer-encoding、keep-alive、te、host、cookie

     * Required:true
     */
    @Required
    private String key;

    /**
     * 新增http header的value，必填，取值包括两种：
1.引用alb系统定义的header值：X-Forwarded-For、X-Forwarded-Client-Port、X-Forwarded-Host、X-Forwarded-Port、X-Forwarded-Proto、X-Forwarded-LBIP
2.客户自定义的header值，输入限制：最长128个字符，ASCII码值ch &gt;&#x3D; 32 &amp;&amp; ch &lt; 127范围内的可打印字符，字母区分大小写，开头和结尾不能为空格
     * Required:true
     */
    @Required
    private String value;



    /**
     * get http header的value类型：1.系统值类型；2.自定义值类型
     *
     * @return
     */
    public Integer getValueType() {
        return valueType;
    }

    /**
     * set http header的value类型：1.系统值类型；2.自定义值类型
     *
     * @param valueType
     */
    public void setValueType(Integer valueType) {
        this.valueType = valueType;
    }


    /**
     * get 新增http header的key，必填，最长40个字符，不区分大小写，支持大小写字母、数字、下划线（_）和短划线（-），不允许使用系统header+部分http标准header，同一个key在插入/删除中只能出现一次，具体不允许的key如下：
1.alb系统的header key：X-Forwarded-For、X-Forwarded-Client-Port、X-Forwarded-Host、X-Forwarded-Port、X-Forwarded-Proto、X-Forwarded-LBIP
2.部分http标准header：connection、upgrade、content-length、transfer-encoding、keep-alive、te、host、cookie

     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 新增http header的key，必填，最长40个字符，不区分大小写，支持大小写字母、数字、下划线（_）和短划线（-），不允许使用系统header+部分http标准header，同一个key在插入/删除中只能出现一次，具体不允许的key如下：
1.alb系统的header key：X-Forwarded-For、X-Forwarded-Client-Port、X-Forwarded-Host、X-Forwarded-Port、X-Forwarded-Proto、X-Forwarded-LBIP
2.部分http标准header：connection、upgrade、content-length、transfer-encoding、keep-alive、te、host、cookie

     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
     * get 新增http header的value，必填，取值包括两种：
1.引用alb系统定义的header值：X-Forwarded-For、X-Forwarded-Client-Port、X-Forwarded-Host、X-Forwarded-Port、X-Forwarded-Proto、X-Forwarded-LBIP
2.客户自定义的header值，输入限制：最长128个字符，ASCII码值ch &gt;&#x3D; 32 &amp;&amp; ch &lt; 127范围内的可打印字符，字母区分大小写，开头和结尾不能为空格
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 新增http header的value，必填，取值包括两种：
1.引用alb系统定义的header值：X-Forwarded-For、X-Forwarded-Client-Port、X-Forwarded-Host、X-Forwarded-Port、X-Forwarded-Proto、X-Forwarded-LBIP
2.客户自定义的header值，输入限制：最长128个字符，ASCII码值ch &gt;&#x3D; 32 &amp;&amp; ch &lt; 127范围内的可打印字符，字母区分大小写，开头和结尾不能为空格
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }



    /**
     * set http header的value类型：1.系统值类型；2.自定义值类型
     *
     * @param valueType
     */
    public InsertHeaderSpec valueType(Integer valueType) {
        this.valueType = valueType;
        return this;
    }


    /**
     * set 新增http header的key，必填，最长40个字符，不区分大小写，支持大小写字母、数字、下划线（_）和短划线（-），不允许使用系统header+部分http标准header，同一个key在插入/删除中只能出现一次，具体不允许的key如下：
1.alb系统的header key：X-Forwarded-For、X-Forwarded-Client-Port、X-Forwarded-Host、X-Forwarded-Port、X-Forwarded-Proto、X-Forwarded-LBIP
2.部分http标准header：connection、upgrade、content-length、transfer-encoding、keep-alive、te、host、cookie

     *
     * @param key
     */
    public InsertHeaderSpec key(String key) {
        this.key = key;
        return this;
    }


    /**
     * set 新增http header的value，必填，取值包括两种：
1.引用alb系统定义的header值：X-Forwarded-For、X-Forwarded-Client-Port、X-Forwarded-Host、X-Forwarded-Port、X-Forwarded-Proto、X-Forwarded-LBIP
2.客户自定义的header值，输入限制：最长128个字符，ASCII码值ch &gt;&#x3D; 32 &amp;&amp; ch &lt; 127范围内的可打印字符，字母区分大小写，开头和结尾不能为空格
     *
     * @param value
     */
    public InsertHeaderSpec value(String value) {
        this.value = value;
        return this;
    }


}