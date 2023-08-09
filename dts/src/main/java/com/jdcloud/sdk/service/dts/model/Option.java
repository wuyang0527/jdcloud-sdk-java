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

package com.jdcloud.sdk.service.dts.model;

import java.util.List;
import java.util.ArrayList;

/**
 * option
 */
public class Option  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签名称
     */
    private String label;

    /**
     * 参数值
     */
    private String value;

    /**
     * 该参数的可见性
     */
    
    private List<Visibility> visibility;
    /**
     * 子节点
     */
    
    private List<Option> children;


    /**
     * get 标签名称
     *
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * set 标签名称
     *
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }


    /**
     * get 参数值
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 参数值
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
    * get 该参数的可见性
    *
    * @return
    */
    public List<Visibility> getVisibility() {
        return visibility;
    }

    /**
    * set 该参数的可见性
    *
    * @param visibility
    */
    public void setVisibility(List<Visibility> visibility) {
        this.visibility = visibility;
    }


    /**
    * get 子节点
    *
    * @return
    */
    public List<Option> getChildren() {
        return children;
    }

    /**
    * set 子节点
    *
    * @param children
    */
    public void setChildren(List<Option> children) {
        this.children = children;
    }



    /**
     * set 标签名称
     *
     * @param label
     */
    public Option label(String label) {
        this.label = label;
        return this;
    }


    /**
     * set 参数值
     *
     * @param value
     */
    public Option value(String value) {
        this.value = value;
        return this;
    }


    /**
    * set 该参数的可见性
    *
    * @param visibility
    */
    public Option visibility(List<Visibility> visibility) {
        this.visibility = visibility;
        return this;
    }


    /**
    * set 子节点
    *
    * @param children
    */
    public Option children(List<Option> children) {
        this.children = children;
        return this;
    }



    /**
     * add item to 该参数的可见性
     *
     * @param visibility
     */
    public void addVisibility(Visibility visibility) {
        if (this.visibility == null) {
            this.visibility = new ArrayList<>();
        }
        this.visibility.add(visibility);
    }

    /**
     * add item to 子节点
     *
     * @param children
     */
    public void addChildren(Option children) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(children);
    }
}