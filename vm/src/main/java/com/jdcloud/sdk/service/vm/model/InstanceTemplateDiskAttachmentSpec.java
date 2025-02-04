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

package com.jdcloud.sdk.service.vm.model;


/**
 * 实例模板磁盘挂载点配置。
 */
public class InstanceTemplateDiskAttachmentSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 磁盘类型。
**系统盘**：此参数无须指定，其类型取决于镜像类型。
**数据盘**：数据盘仅支持云硬盘&#x60;cloud&#x60;。

     */
    private String diskCategory;

    /**
     * 是否随实例一起删除，即删除实例时是否自动删除此磁盘。此参数仅对按配置计费的非多点挂载云硬盘生效。
&#x60;true&#x60;：随实例删除。
&#x60;false&#x60;（默认值）：不随实例删除。

     */
    private Boolean autoDelete;

    /**
     * 磁盘详细配置。此参数仅针对云硬盘，本地系统盘无须指定且指定无效。
     */
    private InstanceTemplateDiskSpec cloudDiskSpec;

    /**
     * 磁盘逻辑挂载点。
**系统盘**：此参数无须指定且指定无效，默认为vda。
**数据盘**：取值范围：&#x60;[vdb~vdbm]&#x60;。

     */
    private String deviceName;

    /**
     * 排除设备，使用此参数 &#x60;noDevice&#x60; 配合 &#x60;deviceName&#x60; 一起使用。
创建实例模板的场景下：使用此参数可以排除镜像中的数据盘。
示例：如果镜像中除系统盘还包含一块或多块数据盘，期望仅使用镜像中的部分磁盘，配置&#x60;deviceName&#x3D;vdb&#x60;、&#x60;noDevice&#x3D;true&#x60;，则表示在使用实例模板创建实例时，忽略镜像中数据盘vdb配置，不创建磁盘。

     */
    private Boolean noDevice;


    /**
     * get 磁盘类型。
**系统盘**：此参数无须指定，其类型取决于镜像类型。
**数据盘**：数据盘仅支持云硬盘&#x60;cloud&#x60;。

     *
     * @return
     */
    public String getDiskCategory() {
        return diskCategory;
    }

    /**
     * set 磁盘类型。
**系统盘**：此参数无须指定，其类型取决于镜像类型。
**数据盘**：数据盘仅支持云硬盘&#x60;cloud&#x60;。

     *
     * @param diskCategory
     */
    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

    /**
     * get 是否随实例一起删除，即删除实例时是否自动删除此磁盘。此参数仅对按配置计费的非多点挂载云硬盘生效。
&#x60;true&#x60;：随实例删除。
&#x60;false&#x60;（默认值）：不随实例删除。

     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 是否随实例一起删除，即删除实例时是否自动删除此磁盘。此参数仅对按配置计费的非多点挂载云硬盘生效。
&#x60;true&#x60;：随实例删除。
&#x60;false&#x60;（默认值）：不随实例删除。

     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * get 磁盘详细配置。此参数仅针对云硬盘，本地系统盘无须指定且指定无效。
     *
     * @return
     */
    public InstanceTemplateDiskSpec getCloudDiskSpec() {
        return cloudDiskSpec;
    }

    /**
     * set 磁盘详细配置。此参数仅针对云硬盘，本地系统盘无须指定且指定无效。
     *
     * @param cloudDiskSpec
     */
    public void setCloudDiskSpec(InstanceTemplateDiskSpec cloudDiskSpec) {
        this.cloudDiskSpec = cloudDiskSpec;
    }

    /**
     * get 磁盘逻辑挂载点。
**系统盘**：此参数无须指定且指定无效，默认为vda。
**数据盘**：取值范围：&#x60;[vdb~vdbm]&#x60;。

     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 磁盘逻辑挂载点。
**系统盘**：此参数无须指定且指定无效，默认为vda。
**数据盘**：取值范围：&#x60;[vdb~vdbm]&#x60;。

     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get 排除设备，使用此参数 &#x60;noDevice&#x60; 配合 &#x60;deviceName&#x60; 一起使用。
创建实例模板的场景下：使用此参数可以排除镜像中的数据盘。
示例：如果镜像中除系统盘还包含一块或多块数据盘，期望仅使用镜像中的部分磁盘，配置&#x60;deviceName&#x3D;vdb&#x60;、&#x60;noDevice&#x3D;true&#x60;，则表示在使用实例模板创建实例时，忽略镜像中数据盘vdb配置，不创建磁盘。

     *
     * @return
     */
    public Boolean getNoDevice() {
        return noDevice;
    }

    /**
     * set 排除设备，使用此参数 &#x60;noDevice&#x60; 配合 &#x60;deviceName&#x60; 一起使用。
创建实例模板的场景下：使用此参数可以排除镜像中的数据盘。
示例：如果镜像中除系统盘还包含一块或多块数据盘，期望仅使用镜像中的部分磁盘，配置&#x60;deviceName&#x3D;vdb&#x60;、&#x60;noDevice&#x3D;true&#x60;，则表示在使用实例模板创建实例时，忽略镜像中数据盘vdb配置，不创建磁盘。

     *
     * @param noDevice
     */
    public void setNoDevice(Boolean noDevice) {
        this.noDevice = noDevice;
    }


    /**
     * set 磁盘类型。
**系统盘**：此参数无须指定，其类型取决于镜像类型。
**数据盘**：数据盘仅支持云硬盘&#x60;cloud&#x60;。

     *
     * @param diskCategory
     */
    public InstanceTemplateDiskAttachmentSpec diskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }

    /**
     * set 是否随实例一起删除，即删除实例时是否自动删除此磁盘。此参数仅对按配置计费的非多点挂载云硬盘生效。
&#x60;true&#x60;：随实例删除。
&#x60;false&#x60;（默认值）：不随实例删除。

     *
     * @param autoDelete
     */
    public InstanceTemplateDiskAttachmentSpec autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * set 磁盘详细配置。此参数仅针对云硬盘，本地系统盘无须指定且指定无效。
     *
     * @param cloudDiskSpec
     */
    public InstanceTemplateDiskAttachmentSpec cloudDiskSpec(InstanceTemplateDiskSpec cloudDiskSpec) {
        this.cloudDiskSpec = cloudDiskSpec;
        return this;
    }

    /**
     * set 磁盘逻辑挂载点。
**系统盘**：此参数无须指定且指定无效，默认为vda。
**数据盘**：取值范围：&#x60;[vdb~vdbm]&#x60;。

     *
     * @param deviceName
     */
    public InstanceTemplateDiskAttachmentSpec deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 排除设备，使用此参数 &#x60;noDevice&#x60; 配合 &#x60;deviceName&#x60; 一起使用。
创建实例模板的场景下：使用此参数可以排除镜像中的数据盘。
示例：如果镜像中除系统盘还包含一块或多块数据盘，期望仅使用镜像中的部分磁盘，配置&#x60;deviceName&#x3D;vdb&#x60;、&#x60;noDevice&#x3D;true&#x60;，则表示在使用实例模板创建实例时，忽略镜像中数据盘vdb配置，不创建磁盘。

     *
     * @param noDevice
     */
    public InstanceTemplateDiskAttachmentSpec noDevice(Boolean noDevice) {
        this.noDevice = noDevice;
        return this;
    }


}