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

import java.util.List;
import java.util.ArrayList;

/**
 * serverlessMasterVersion
 */
public class ServerlessMasterVersion  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 版本号
     */
    private String version;

    /**
     * 是否默认版本
     */
    private Boolean isDefault;

    /**
     * 版本状态
     */
    private String versionStatus;

    /**
     * 该版本可以安装的组件列表
     */
    
    private List<ClusterAddon> clusterAddons;


    /**
     * get 版本号
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 版本号
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }


    /**
     * get 是否默认版本
     *
     * @return
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * set 是否默认版本
     *
     * @param isDefault
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * get 版本状态
     *
     * @return
     */
    public String getVersionStatus() {
        return versionStatus;
    }

    /**
     * set 版本状态
     *
     * @param versionStatus
     */
    public void setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
    }


    /**
    * get 该版本可以安装的组件列表
    *
    * @return
    */
    public List<ClusterAddon> getClusterAddons() {
        return clusterAddons;
    }

    /**
    * set 该版本可以安装的组件列表
    *
    * @param clusterAddons
    */
    public void setClusterAddons(List<ClusterAddon> clusterAddons) {
        this.clusterAddons = clusterAddons;
    }



    /**
     * set 版本号
     *
     * @param version
     */
    public ServerlessMasterVersion version(String version) {
        this.version = version;
        return this;
    }


    /**
     * set 是否默认版本
     *
     * @param isDefault
     */
    public ServerlessMasterVersion isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }


    /**
     * set 版本状态
     *
     * @param versionStatus
     */
    public ServerlessMasterVersion versionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }


    /**
    * set 该版本可以安装的组件列表
    *
    * @param clusterAddons
    */
    public ServerlessMasterVersion clusterAddons(List<ClusterAddon> clusterAddons) {
        this.clusterAddons = clusterAddons;
        return this;
    }



    /**
     * add item to 该版本可以安装的组件列表
     *
     * @param clusterAddon
     */
    public void addClusterAddon(ClusterAddon clusterAddon) {
        if (this.clusterAddons == null) {
            this.clusterAddons = new ArrayList<>();
        }
        this.clusterAddons.add(clusterAddon);
    }
}