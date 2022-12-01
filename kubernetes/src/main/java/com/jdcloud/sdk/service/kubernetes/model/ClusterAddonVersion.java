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


/**
 * 集群组件配置
 */
public class ClusterAddonVersion  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 组件名称
     */
    private String name;

    /**
     * 组件版本，非必须
     */
    private String version;

    /**
     * 组件版本简要说明
     */
    private String description;

    /**
     * 组件版本发布说明
     */
    private String releaseNote;

    /**
     * 适配的k8s最低版本，如 1.12
     */
    private String minAdaptedK8sVersion;

    /**
     * 适配的k8s最高版本，如 1.18
     */
    private String maxAdaptedK8sVersion;



    /**
     * get 组件名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 组件名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 组件版本，非必须
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 组件版本，非必须
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }


    /**
     * get 组件版本简要说明
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 组件版本简要说明
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 组件版本发布说明
     *
     * @return
     */
    public String getReleaseNote() {
        return releaseNote;
    }

    /**
     * set 组件版本发布说明
     *
     * @param releaseNote
     */
    public void setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
    }


    /**
     * get 适配的k8s最低版本，如 1.12
     *
     * @return
     */
    public String getMinAdaptedK8sVersion() {
        return minAdaptedK8sVersion;
    }

    /**
     * set 适配的k8s最低版本，如 1.12
     *
     * @param minAdaptedK8sVersion
     */
    public void setMinAdaptedK8sVersion(String minAdaptedK8sVersion) {
        this.minAdaptedK8sVersion = minAdaptedK8sVersion;
    }


    /**
     * get 适配的k8s最高版本，如 1.18
     *
     * @return
     */
    public String getMaxAdaptedK8sVersion() {
        return maxAdaptedK8sVersion;
    }

    /**
     * set 适配的k8s最高版本，如 1.18
     *
     * @param maxAdaptedK8sVersion
     */
    public void setMaxAdaptedK8sVersion(String maxAdaptedK8sVersion) {
        this.maxAdaptedK8sVersion = maxAdaptedK8sVersion;
    }



    /**
     * set 组件名称
     *
     * @param name
     */
    public ClusterAddonVersion name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 组件版本，非必须
     *
     * @param version
     */
    public ClusterAddonVersion version(String version) {
        this.version = version;
        return this;
    }


    /**
     * set 组件版本简要说明
     *
     * @param description
     */
    public ClusterAddonVersion description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 组件版本发布说明
     *
     * @param releaseNote
     */
    public ClusterAddonVersion releaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }


    /**
     * set 适配的k8s最低版本，如 1.12
     *
     * @param minAdaptedK8sVersion
     */
    public ClusterAddonVersion minAdaptedK8sVersion(String minAdaptedK8sVersion) {
        this.minAdaptedK8sVersion = minAdaptedK8sVersion;
        return this;
    }


    /**
     * set 适配的k8s最高版本，如 1.18
     *
     * @param maxAdaptedK8sVersion
     */
    public ClusterAddonVersion maxAdaptedK8sVersion(String maxAdaptedK8sVersion) {
        this.maxAdaptedK8sVersion = maxAdaptedK8sVersion;
        return this;
    }


}