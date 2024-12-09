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
 * collectInfoDetailEnd
 */
public class CollectInfoDetailEnd  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * UID
     */
    private String uID;

    /**
     * 高可用组资源multi
     */
    
    private List<AgResourceEnd> agResource;
    /**
     * 日志来源
     */
    private String appCode;

    /**
     * binlog规格
     */
    private Object binlogSpec;

    /**
     * detail
     */
    private CollectTempalteEnd detail;

    /**
     * enabled
     */
    private Long enabled;

    /**
     * k8s规格
     */
    private Object k8sSpec;

    /**
     * 采集配置名称
     */
    private String name;

    /**
     * 采集资源时选择的模式，1.正常的选择实例模式（默认模式）；2.选择标签tag模式 3.选择高可用组ag模式
     */
    private Long resourceMode;

    /**
     * 采集实例类型, 只能是 all/part
     */
    private String resourceType;

    /**
     * 采集实例数量
     */
    private Long resourcesCount;

    /**
     * 产品线
     */
    private String serviceCode;

    /**
     * tagResource
     */
    private TagResourceEnd tagResource;

    /**
     * 日志类型名称
     */
    private String templateName;

    /**
     * 日志类型
     */
    private String templateUID;



    /**
     * get UID
     *
     * @return
     */
    public String getUID() {
        return uID;
    }

    /**
     * set UID
     *
     * @param uID
     */
    public void setUID(String uID) {
        this.uID = uID;
    }


    /**
    * get 高可用组资源multi
    *
    * @return
    */
    public List<AgResourceEnd> getAgResource() {
        return agResource;
    }

    /**
    * set 高可用组资源multi
    *
    * @param agResource
    */
    public void setAgResource(List<AgResourceEnd> agResource) {
        this.agResource = agResource;
    }


    /**
     * get 日志来源
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 日志来源
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }


    /**
     * get binlog规格
     *
     * @return
     */
    public Object getBinlogSpec() {
        return binlogSpec;
    }

    /**
     * set binlog规格
     *
     * @param binlogSpec
     */
    public void setBinlogSpec(Object binlogSpec) {
        this.binlogSpec = binlogSpec;
    }


    /**
     * get detail
     *
     * @return
     */
    public CollectTempalteEnd getDetail() {
        return detail;
    }

    /**
     * set detail
     *
     * @param detail
     */
    public void setDetail(CollectTempalteEnd detail) {
        this.detail = detail;
    }


    /**
     * get enabled
     *
     * @return
     */
    public Long getEnabled() {
        return enabled;
    }

    /**
     * set enabled
     *
     * @param enabled
     */
    public void setEnabled(Long enabled) {
        this.enabled = enabled;
    }


    /**
     * get k8s规格
     *
     * @return
     */
    public Object getK8sSpec() {
        return k8sSpec;
    }

    /**
     * set k8s规格
     *
     * @param k8sSpec
     */
    public void setK8sSpec(Object k8sSpec) {
        this.k8sSpec = k8sSpec;
    }


    /**
     * get 采集配置名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 采集配置名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 采集资源时选择的模式，1.正常的选择实例模式（默认模式）；2.选择标签tag模式 3.选择高可用组ag模式
     *
     * @return
     */
    public Long getResourceMode() {
        return resourceMode;
    }

    /**
     * set 采集资源时选择的模式，1.正常的选择实例模式（默认模式）；2.选择标签tag模式 3.选择高可用组ag模式
     *
     * @param resourceMode
     */
    public void setResourceMode(Long resourceMode) {
        this.resourceMode = resourceMode;
    }


    /**
     * get 采集实例类型, 只能是 all/part
     *
     * @return
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * set 采集实例类型, 只能是 all/part
     *
     * @param resourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }


    /**
     * get 采集实例数量
     *
     * @return
     */
    public Long getResourcesCount() {
        return resourcesCount;
    }

    /**
     * set 采集实例数量
     *
     * @param resourcesCount
     */
    public void setResourcesCount(Long resourcesCount) {
        this.resourcesCount = resourcesCount;
    }


    /**
     * get 产品线
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get tagResource
     *
     * @return
     */
    public TagResourceEnd getTagResource() {
        return tagResource;
    }

    /**
     * set tagResource
     *
     * @param tagResource
     */
    public void setTagResource(TagResourceEnd tagResource) {
        this.tagResource = tagResource;
    }


    /**
     * get 日志类型名称
     *
     * @return
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * set 日志类型名称
     *
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }


    /**
     * get 日志类型
     *
     * @return
     */
    public String getTemplateUID() {
        return templateUID;
    }

    /**
     * set 日志类型
     *
     * @param templateUID
     */
    public void setTemplateUID(String templateUID) {
        this.templateUID = templateUID;
    }



    /**
     * set UID
     *
     * @param uID
     */
    public CollectInfoDetailEnd uID(String uID) {
        this.uID = uID;
        return this;
    }


    /**
    * set 高可用组资源multi
    *
    * @param agResource
    */
    public CollectInfoDetailEnd agResource(List<AgResourceEnd> agResource) {
        this.agResource = agResource;
        return this;
    }


    /**
     * set 日志来源
     *
     * @param appCode
     */
    public CollectInfoDetailEnd appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }


    /**
     * set binlog规格
     *
     * @param binlogSpec
     */
    public CollectInfoDetailEnd binlogSpec(Object binlogSpec) {
        this.binlogSpec = binlogSpec;
        return this;
    }


    /**
     * set detail
     *
     * @param detail
     */
    public CollectInfoDetailEnd detail(CollectTempalteEnd detail) {
        this.detail = detail;
        return this;
    }


    /**
     * set enabled
     *
     * @param enabled
     */
    public CollectInfoDetailEnd enabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }


    /**
     * set k8s规格
     *
     * @param k8sSpec
     */
    public CollectInfoDetailEnd k8sSpec(Object k8sSpec) {
        this.k8sSpec = k8sSpec;
        return this;
    }


    /**
     * set 采集配置名称
     *
     * @param name
     */
    public CollectInfoDetailEnd name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 采集资源时选择的模式，1.正常的选择实例模式（默认模式）；2.选择标签tag模式 3.选择高可用组ag模式
     *
     * @param resourceMode
     */
    public CollectInfoDetailEnd resourceMode(Long resourceMode) {
        this.resourceMode = resourceMode;
        return this;
    }


    /**
     * set 采集实例类型, 只能是 all/part
     *
     * @param resourceType
     */
    public CollectInfoDetailEnd resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }


    /**
     * set 采集实例数量
     *
     * @param resourcesCount
     */
    public CollectInfoDetailEnd resourcesCount(Long resourcesCount) {
        this.resourcesCount = resourcesCount;
        return this;
    }


    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public CollectInfoDetailEnd serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set tagResource
     *
     * @param tagResource
     */
    public CollectInfoDetailEnd tagResource(TagResourceEnd tagResource) {
        this.tagResource = tagResource;
        return this;
    }


    /**
     * set 日志类型名称
     *
     * @param templateName
     */
    public CollectInfoDetailEnd templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }


    /**
     * set 日志类型
     *
     * @param templateUID
     */
    public CollectInfoDetailEnd templateUID(String templateUID) {
        this.templateUID = templateUID;
        return this;
    }



    /**
     * add item to 高可用组资源multi
     *
     * @param agResource
     */
    public void addAgResource(AgResourceEnd agResource) {
        if (this.agResource == null) {
            this.agResource = new ArrayList<>();
        }
        this.agResource.add(agResource);
    }
}