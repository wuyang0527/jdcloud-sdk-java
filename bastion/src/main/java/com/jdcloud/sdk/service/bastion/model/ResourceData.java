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

package com.jdcloud.sdk.service.bastion.model;

import java.util.List;
import java.util.ArrayList;

/**
 * resourceData
 */
public class ResourceData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 资源绑定信息列表
     */
    
    private List<ResourceData> bind;


    /**
     * get 资源id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * get 资源名称
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }


    /**
     * get 备注
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 备注
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
    * get 资源绑定信息列表
    *
    * @return
    */
    public List<ResourceData> getBind() {
        return bind;
    }

    /**
    * set 资源绑定信息列表
    *
    * @param bind
    */
    public void setBind(List<ResourceData> bind) {
        this.bind = bind;
    }



    /**
     * set 资源id
     *
     * @param resourceId
     */
    public ResourceData resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public ResourceData resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }


    /**
     * set 备注
     *
     * @param remark
     */
    public ResourceData remark(String remark) {
        this.remark = remark;
        return this;
    }


    /**
    * set 资源绑定信息列表
    *
    * @param bind
    */
    public ResourceData bind(List<ResourceData> bind) {
        this.bind = bind;
        return this;
    }



    /**
     * add item to 资源绑定信息列表
     *
     * @param bind
     */
    public void addBind(ResourceData bind) {
        if (this.bind == null) {
            this.bind = new ArrayList<>();
        }
        this.bind.add(bind);
    }
}