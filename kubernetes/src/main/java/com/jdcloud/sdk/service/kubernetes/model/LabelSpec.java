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

package com.jdcloud.sdk.service.kubernetes.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 工作节点组标签
 */
public class LabelSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * key包含两个部分：prefix与name，name是必须的，prefix是可选的。prefix与name分隔用&quot;/&quot;。 
name 可以是字母，数字，[-_.]。长度小于63。prefix：遵循DNS标准（例如：kubernetes.io/），长度不超过253 
[参照](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set)    

     * Required:true
     */
    @Required
    private String key;

    /**
     * 字母，数字,[-_.],长度不超过63
     */
    private String value;



    /**
     * get key包含两个部分：prefix与name，name是必须的，prefix是可选的。prefix与name分隔用&quot;/&quot;。 
name 可以是字母，数字，[-_.]。长度小于63。prefix：遵循DNS标准（例如：kubernetes.io/），长度不超过253 
[参照](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set)    

     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set key包含两个部分：prefix与name，name是必须的，prefix是可选的。prefix与name分隔用&quot;/&quot;。 
name 可以是字母，数字，[-_.]。长度小于63。prefix：遵循DNS标准（例如：kubernetes.io/），长度不超过253 
[参照](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set)    

     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
     * get 字母，数字,[-_.],长度不超过63
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 字母，数字,[-_.],长度不超过63
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }



    /**
     * set key包含两个部分：prefix与name，name是必须的，prefix是可选的。prefix与name分隔用&quot;/&quot;。 
name 可以是字母，数字，[-_.]。长度小于63。prefix：遵循DNS标准（例如：kubernetes.io/），长度不超过253 
[参照](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set)    

     *
     * @param key
     */
    public LabelSpec key(String key) {
        this.key = key;
        return this;
    }


    /**
     * set 字母，数字,[-_.],长度不超过63
     *
     * @param value
     */
    public LabelSpec value(String value) {
        this.value = value;
        return this;
    }


}