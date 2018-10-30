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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.disk.model.DiskSpec;

/**
 * 磁盘分类  cloud： 基于云硬盘的卷  root volume只能是cloud类型
 */
public class VolumeMountSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 磁盘分类 cloud： 基于云硬盘的卷 root volume只能是cloud类型
     * Required:true
     */
    @Required
    private String category;

    /**
     * 自动删除，删除容器时自动删除此volume，默认为True；只支持磁盘是云硬盘的场景
     */
    private Boolean autoDelete;

    /**
     * 容器内的挂载目录；root volume不需要指定，挂载目录是（/）；data volume必须指定；必须是绝对路径，不能包含(:)
     */
    private String mountPath;

    /**
     * 只读，默认false；只针对data volume有效；root volume为false，也就是可读可写
     */
    private Boolean readOnly;

    /**
     * 云硬盘规格；随容器自动创建的云硬盘，不会对磁盘分区，只会格式化文件系统
     */
    private DiskSpec cloudDiskSpec;

    /**
     * 云硬盘ID；如果使用已有的云硬盘，必须指定partion和fsType
     */
    private String cloudDiskId;

    /**
     * 指定volume文件系统类型，目前支持[xfs, ext4]；如果新创建的盘，不指定文件系统类型默认格式化成xfs
     */
    private String fsType;

    /**
     * 随容器自动创建的新盘，会自动格式化成指定的文件系统类型；挂载已有的盘，默认不会格式化，只会按照指定的fsType去挂载；如果希望格式化，必须设置此字段为true
     */
    private Boolean formatVolume;


    /**
     * get 磁盘分类 cloud： 基于云硬盘的卷 root volume只能是cloud类型
     *
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     * set 磁盘分类 cloud： 基于云硬盘的卷 root volume只能是cloud类型
     *
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * get 自动删除，删除容器时自动删除此volume，默认为True；只支持磁盘是云硬盘的场景
     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 自动删除，删除容器时自动删除此volume，默认为True；只支持磁盘是云硬盘的场景
     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * get 容器内的挂载目录；root volume不需要指定，挂载目录是（/）；data volume必须指定；必须是绝对路径，不能包含(:)
     *
     * @return
     */
    public String getMountPath() {
        return mountPath;
    }

    /**
     * set 容器内的挂载目录；root volume不需要指定，挂载目录是（/）；data volume必须指定；必须是绝对路径，不能包含(:)
     *
     * @param mountPath
     */
    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    /**
     * get 只读，默认false；只针对data volume有效；root volume为false，也就是可读可写
     *
     * @return
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * set 只读，默认false；只针对data volume有效；root volume为false，也就是可读可写
     *
     * @param readOnly
     */
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * get 云硬盘规格；随容器自动创建的云硬盘，不会对磁盘分区，只会格式化文件系统
     *
     * @return
     */
    public DiskSpec getCloudDiskSpec() {
        return cloudDiskSpec;
    }

    /**
     * set 云硬盘规格；随容器自动创建的云硬盘，不会对磁盘分区，只会格式化文件系统
     *
     * @param cloudDiskSpec
     */
    public void setCloudDiskSpec(DiskSpec cloudDiskSpec) {
        this.cloudDiskSpec = cloudDiskSpec;
    }

    /**
     * get 云硬盘ID；如果使用已有的云硬盘，必须指定partion和fsType
     *
     * @return
     */
    public String getCloudDiskId() {
        return cloudDiskId;
    }

    /**
     * set 云硬盘ID；如果使用已有的云硬盘，必须指定partion和fsType
     *
     * @param cloudDiskId
     */
    public void setCloudDiskId(String cloudDiskId) {
        this.cloudDiskId = cloudDiskId;
    }

    /**
     * get 指定volume文件系统类型，目前支持[xfs, ext4]；如果新创建的盘，不指定文件系统类型默认格式化成xfs
     *
     * @return
     */
    public String getFsType() {
        return fsType;
    }

    /**
     * set 指定volume文件系统类型，目前支持[xfs, ext4]；如果新创建的盘，不指定文件系统类型默认格式化成xfs
     *
     * @param fsType
     */
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * get 随容器自动创建的新盘，会自动格式化成指定的文件系统类型；挂载已有的盘，默认不会格式化，只会按照指定的fsType去挂载；如果希望格式化，必须设置此字段为true
     *
     * @return
     */
    public Boolean getFormatVolume() {
        return formatVolume;
    }

    /**
     * set 随容器自动创建的新盘，会自动格式化成指定的文件系统类型；挂载已有的盘，默认不会格式化，只会按照指定的fsType去挂载；如果希望格式化，必须设置此字段为true
     *
     * @param formatVolume
     */
    public void setFormatVolume(Boolean formatVolume) {
        this.formatVolume = formatVolume;
    }


    /**
     * set 磁盘分类 cloud： 基于云硬盘的卷 root volume只能是cloud类型
     *
     * @param category
     */
    public VolumeMountSpec category(String category) {
        this.category = category;
        return this;
    }

    /**
     * set 自动删除，删除容器时自动删除此volume，默认为True；只支持磁盘是云硬盘的场景
     *
     * @param autoDelete
     */
    public VolumeMountSpec autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * set 容器内的挂载目录；root volume不需要指定，挂载目录是（/）；data volume必须指定；必须是绝对路径，不能包含(:)
     *
     * @param mountPath
     */
    public VolumeMountSpec mountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * set 只读，默认false；只针对data volume有效；root volume为false，也就是可读可写
     *
     * @param readOnly
     */
    public VolumeMountSpec readOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * set 云硬盘规格；随容器自动创建的云硬盘，不会对磁盘分区，只会格式化文件系统
     *
     * @param cloudDiskSpec
     */
    public VolumeMountSpec cloudDiskSpec(DiskSpec cloudDiskSpec) {
        this.cloudDiskSpec = cloudDiskSpec;
        return this;
    }

    /**
     * set 云硬盘ID；如果使用已有的云硬盘，必须指定partion和fsType
     *
     * @param cloudDiskId
     */
    public VolumeMountSpec cloudDiskId(String cloudDiskId) {
        this.cloudDiskId = cloudDiskId;
        return this;
    }

    /**
     * set 指定volume文件系统类型，目前支持[xfs, ext4]；如果新创建的盘，不指定文件系统类型默认格式化成xfs
     *
     * @param fsType
     */
    public VolumeMountSpec fsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    /**
     * set 随容器自动创建的新盘，会自动格式化成指定的文件系统类型；挂载已有的盘，默认不会格式化，只会按照指定的fsType去挂载；如果希望格式化，必须设置此字段为true
     *
     * @param formatVolume
     */
    public VolumeMountSpec formatVolume(Boolean formatVolume) {
        this.formatVolume = formatVolume;
        return this;
    }


}