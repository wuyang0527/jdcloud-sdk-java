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

package com.jdcloud.sdk.service.nc.model;


/**
 * 挂载的Volume
 */
public class VolumeMount  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 环境变量名称
     */
    private String category;

    /**
     * 自动删除，删除容器时自动删除此volume
     */
    private Boolean autoDelete;

    /**
     * 容器内的挂载目录
     */
    private String mountPath;

    /**
     * 只读，默认false；只针对data volume有效，root volume为false
     */
    private Boolean readOnly;

    /**
     * 云硬盘规格
     */
    private InstanceCloudDisk cloudDisk;

    /**
     * 指定volume文件系统类型，目前支持[xfs, ext4]
     */
    private String fsType;


    /**
     * get 环境变量名称
     *
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     * set 环境变量名称
     *
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * get 自动删除，删除容器时自动删除此volume
     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 自动删除，删除容器时自动删除此volume
     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * get 容器内的挂载目录
     *
     * @return
     */
    public String getMountPath() {
        return mountPath;
    }

    /**
     * set 容器内的挂载目录
     *
     * @param mountPath
     */
    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    /**
     * get 只读，默认false；只针对data volume有效，root volume为false
     *
     * @return
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * set 只读，默认false；只针对data volume有效，root volume为false
     *
     * @param readOnly
     */
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * get 云硬盘规格
     *
     * @return
     */
    public InstanceCloudDisk getCloudDisk() {
        return cloudDisk;
    }

    /**
     * set 云硬盘规格
     *
     * @param cloudDisk
     */
    public void setCloudDisk(InstanceCloudDisk cloudDisk) {
        this.cloudDisk = cloudDisk;
    }

    /**
     * get 指定volume文件系统类型，目前支持[xfs, ext4]
     *
     * @return
     */
    public String getFsType() {
        return fsType;
    }

    /**
     * set 指定volume文件系统类型，目前支持[xfs, ext4]
     *
     * @param fsType
     */
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }


    /**
     * set 环境变量名称
     *
     * @param category
     */
    public VolumeMount category(String category) {
        this.category = category;
        return this;
    }

    /**
     * set 自动删除，删除容器时自动删除此volume
     *
     * @param autoDelete
     */
    public VolumeMount autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * set 容器内的挂载目录
     *
     * @param mountPath
     */
    public VolumeMount mountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * set 只读，默认false；只针对data volume有效，root volume为false
     *
     * @param readOnly
     */
    public VolumeMount readOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * set 云硬盘规格
     *
     * @param cloudDisk
     */
    public VolumeMount cloudDisk(InstanceCloudDisk cloudDisk) {
        this.cloudDisk = cloudDisk;
        return this;
    }

    /**
     * set 指定volume文件系统类型，目前支持[xfs, ext4]
     *
     * @param fsType
     */
    public VolumeMount fsType(String fsType) {
        this.fsType = fsType;
        return this;
    }


}