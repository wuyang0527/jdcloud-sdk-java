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

import com.jdcloud.sdk.service.disk.model.Disk;

/**
 * 云主机实例磁盘挂载点信息。
 */
public class InstanceDiskAttachment  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 磁盘类型。
**系统盘**：取值为：&#x60;local&#x60; 本地系统盘 或 &#x60;cloud&#x60; 云盘系统盘。
**数据盘**：取值为：&#x60;local&#x60; 本地数据盘 或 &#x60;cloud&#x60; 云盘数据盘。

     */
    private String diskCategory;

    /**
     * 是否随实例一起删除，即删除实例时是否自动删除此磁盘。此参数仅对按配置计费的非多点挂载云硬盘生效。
&#x60;true&#x60;：随实例删除。
&#x60;false&#x60;：不随实例删除。

     */
    private Boolean autoDelete;

    /**
     * 本地磁盘配置，对应 &#x60;diskCategory&#x3D;local&#x60;。
     */
    private LocalDisk localDisk;

    /**
     * 云硬盘配置，对应 &#x60;diskCategory&#x3D;cloud&#x60;。
     */
    private Disk cloudDisk;

    /**
     * 磁盘逻辑挂载点。
**系统盘**：默认为vda。
**数据盘**：取值范围：&#x60;[vdb~vdbm]&#x60;。

     */
    private String deviceName;

    /**
     * 磁盘挂载状态。
取值范围：&#x60;attaching、detaching、attached、detached、error_attach、error_detach&#x60;。
     */
    private String status;


    /**
     * get 磁盘类型。
**系统盘**：取值为：&#x60;local&#x60; 本地系统盘 或 &#x60;cloud&#x60; 云盘系统盘。
**数据盘**：取值为：&#x60;local&#x60; 本地数据盘 或 &#x60;cloud&#x60; 云盘数据盘。

     *
     * @return
     */
    public String getDiskCategory() {
        return diskCategory;
    }

    /**
     * set 磁盘类型。
**系统盘**：取值为：&#x60;local&#x60; 本地系统盘 或 &#x60;cloud&#x60; 云盘系统盘。
**数据盘**：取值为：&#x60;local&#x60; 本地数据盘 或 &#x60;cloud&#x60; 云盘数据盘。

     *
     * @param diskCategory
     */
    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

    /**
     * get 是否随实例一起删除，即删除实例时是否自动删除此磁盘。此参数仅对按配置计费的非多点挂载云硬盘生效。
&#x60;true&#x60;：随实例删除。
&#x60;false&#x60;：不随实例删除。

     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 是否随实例一起删除，即删除实例时是否自动删除此磁盘。此参数仅对按配置计费的非多点挂载云硬盘生效。
&#x60;true&#x60;：随实例删除。
&#x60;false&#x60;：不随实例删除。

     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * get 本地磁盘配置，对应 &#x60;diskCategory&#x3D;local&#x60;。
     *
     * @return
     */
    public LocalDisk getLocalDisk() {
        return localDisk;
    }

    /**
     * set 本地磁盘配置，对应 &#x60;diskCategory&#x3D;local&#x60;。
     *
     * @param localDisk
     */
    public void setLocalDisk(LocalDisk localDisk) {
        this.localDisk = localDisk;
    }

    /**
     * get 云硬盘配置，对应 &#x60;diskCategory&#x3D;cloud&#x60;。
     *
     * @return
     */
    public Disk getCloudDisk() {
        return cloudDisk;
    }

    /**
     * set 云硬盘配置，对应 &#x60;diskCategory&#x3D;cloud&#x60;。
     *
     * @param cloudDisk
     */
    public void setCloudDisk(Disk cloudDisk) {
        this.cloudDisk = cloudDisk;
    }

    /**
     * get 磁盘逻辑挂载点。
**系统盘**：默认为vda。
**数据盘**：取值范围：&#x60;[vdb~vdbm]&#x60;。

     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 磁盘逻辑挂载点。
**系统盘**：默认为vda。
**数据盘**：取值范围：&#x60;[vdb~vdbm]&#x60;。

     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get 磁盘挂载状态。
取值范围：&#x60;attaching、detaching、attached、detached、error_attach、error_detach&#x60;。
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 磁盘挂载状态。
取值范围：&#x60;attaching、detaching、attached、detached、error_attach、error_detach&#x60;。
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * set 磁盘类型。
**系统盘**：取值为：&#x60;local&#x60; 本地系统盘 或 &#x60;cloud&#x60; 云盘系统盘。
**数据盘**：取值为：&#x60;local&#x60; 本地数据盘 或 &#x60;cloud&#x60; 云盘数据盘。

     *
     * @param diskCategory
     */
    public InstanceDiskAttachment diskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }

    /**
     * set 是否随实例一起删除，即删除实例时是否自动删除此磁盘。此参数仅对按配置计费的非多点挂载云硬盘生效。
&#x60;true&#x60;：随实例删除。
&#x60;false&#x60;：不随实例删除。

     *
     * @param autoDelete
     */
    public InstanceDiskAttachment autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * set 本地磁盘配置，对应 &#x60;diskCategory&#x3D;local&#x60;。
     *
     * @param localDisk
     */
    public InstanceDiskAttachment localDisk(LocalDisk localDisk) {
        this.localDisk = localDisk;
        return this;
    }

    /**
     * set 云硬盘配置，对应 &#x60;diskCategory&#x3D;cloud&#x60;。
     *
     * @param cloudDisk
     */
    public InstanceDiskAttachment cloudDisk(Disk cloudDisk) {
        this.cloudDisk = cloudDisk;
        return this;
    }

    /**
     * set 磁盘逻辑挂载点。
**系统盘**：默认为vda。
**数据盘**：取值范围：&#x60;[vdb~vdbm]&#x60;。

     *
     * @param deviceName
     */
    public InstanceDiskAttachment deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 磁盘挂载状态。
取值范围：&#x60;attaching、detaching、attached、detached、error_attach、error_detach&#x60;。
     *
     * @param status
     */
    public InstanceDiskAttachment status(String status) {
        this.status = status;
        return this;
    }


}