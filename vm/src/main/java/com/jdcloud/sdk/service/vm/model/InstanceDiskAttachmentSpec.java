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

import com.jdcloud.sdk.service.disk.model.DiskSpec;

/**
 * instanceDiskAttachmentSpec
 */
public class InstanceDiskAttachmentSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 磁盘分类，取值为本地盘(local)或者云硬盘(cloud)。
系统盘支持本地盘(local)或者云硬盘(cloud)。系统盘选择local类型，必须使用localDisk类型的镜像；同理系统盘选择cloud类型，必须使用cloudDisk类型的镜像。
数据盘仅支持云硬盘(cloud)。

     */
    private String diskCategory;

    /**
     * 是否随云主机一起删除，即删除主机时是否自动删除此磁盘，默认为true，本地盘(local)不能更改此值。
如果云主机中的数据盘(cloud)是包年包月计费方式，此参数不生效。
如果云主机中的数据盘(cloud)是共享型数据盘，此参数不生效。

     */
    private Boolean autoDelete;

    /**
     * 数据盘配置
     */
    private DiskSpec cloudDiskSpec;

    /**
     * 数据盘逻辑挂载点，取值范围：vda,vdb,vdc,vdd,vde,vdf,vdg,vdh,vdi
     */
    private String deviceName;

    /**
     * 排除设备，使用此参数noDevice配合deviceName一起使用。
创建整机镜像：如deviceName:vdb、noDevice:true，则表示云主机中的数据盘vdb不参与创建镜像。
创建模板：如deviceName:vdb、noDevice:true，则表示镜像中的数据盘vdb不参与创建主机。
创建主机：如deviceName:vdb、noDevice:true，则表示镜像中的数据盘vdb，或者模板(使用模板创建主机)中的数据盘vdb不参与创建主机。

     */
    private Boolean noDevice;


    /**
     * get 磁盘分类，取值为本地盘(local)或者云硬盘(cloud)。
系统盘支持本地盘(local)或者云硬盘(cloud)。系统盘选择local类型，必须使用localDisk类型的镜像；同理系统盘选择cloud类型，必须使用cloudDisk类型的镜像。
数据盘仅支持云硬盘(cloud)。

     *
     * @return
     */
    public String getDiskCategory() {
        return diskCategory;
    }

    /**
     * set 磁盘分类，取值为本地盘(local)或者云硬盘(cloud)。
系统盘支持本地盘(local)或者云硬盘(cloud)。系统盘选择local类型，必须使用localDisk类型的镜像；同理系统盘选择cloud类型，必须使用cloudDisk类型的镜像。
数据盘仅支持云硬盘(cloud)。

     *
     * @param diskCategory
     */
    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

    /**
     * get 是否随云主机一起删除，即删除主机时是否自动删除此磁盘，默认为true，本地盘(local)不能更改此值。
如果云主机中的数据盘(cloud)是包年包月计费方式，此参数不生效。
如果云主机中的数据盘(cloud)是共享型数据盘，此参数不生效。

     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 是否随云主机一起删除，即删除主机时是否自动删除此磁盘，默认为true，本地盘(local)不能更改此值。
如果云主机中的数据盘(cloud)是包年包月计费方式，此参数不生效。
如果云主机中的数据盘(cloud)是共享型数据盘，此参数不生效。

     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * get 数据盘配置
     *
     * @return
     */
    public DiskSpec getCloudDiskSpec() {
        return cloudDiskSpec;
    }

    /**
     * set 数据盘配置
     *
     * @param cloudDiskSpec
     */
    public void setCloudDiskSpec(DiskSpec cloudDiskSpec) {
        this.cloudDiskSpec = cloudDiskSpec;
    }

    /**
     * get 数据盘逻辑挂载点，取值范围：vda,vdb,vdc,vdd,vde,vdf,vdg,vdh,vdi
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 数据盘逻辑挂载点，取值范围：vda,vdb,vdc,vdd,vde,vdf,vdg,vdh,vdi
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get 排除设备，使用此参数noDevice配合deviceName一起使用。
创建整机镜像：如deviceName:vdb、noDevice:true，则表示云主机中的数据盘vdb不参与创建镜像。
创建模板：如deviceName:vdb、noDevice:true，则表示镜像中的数据盘vdb不参与创建主机。
创建主机：如deviceName:vdb、noDevice:true，则表示镜像中的数据盘vdb，或者模板(使用模板创建主机)中的数据盘vdb不参与创建主机。

     *
     * @return
     */
    public Boolean getNoDevice() {
        return noDevice;
    }

    /**
     * set 排除设备，使用此参数noDevice配合deviceName一起使用。
创建整机镜像：如deviceName:vdb、noDevice:true，则表示云主机中的数据盘vdb不参与创建镜像。
创建模板：如deviceName:vdb、noDevice:true，则表示镜像中的数据盘vdb不参与创建主机。
创建主机：如deviceName:vdb、noDevice:true，则表示镜像中的数据盘vdb，或者模板(使用模板创建主机)中的数据盘vdb不参与创建主机。

     *
     * @param noDevice
     */
    public void setNoDevice(Boolean noDevice) {
        this.noDevice = noDevice;
    }


    /**
     * set 磁盘分类，取值为本地盘(local)或者云硬盘(cloud)。
系统盘支持本地盘(local)或者云硬盘(cloud)。系统盘选择local类型，必须使用localDisk类型的镜像；同理系统盘选择cloud类型，必须使用cloudDisk类型的镜像。
数据盘仅支持云硬盘(cloud)。

     *
     * @param diskCategory
     */
    public InstanceDiskAttachmentSpec diskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }

    /**
     * set 是否随云主机一起删除，即删除主机时是否自动删除此磁盘，默认为true，本地盘(local)不能更改此值。
如果云主机中的数据盘(cloud)是包年包月计费方式，此参数不生效。
如果云主机中的数据盘(cloud)是共享型数据盘，此参数不生效。

     *
     * @param autoDelete
     */
    public InstanceDiskAttachmentSpec autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * set 数据盘配置
     *
     * @param cloudDiskSpec
     */
    public InstanceDiskAttachmentSpec cloudDiskSpec(DiskSpec cloudDiskSpec) {
        this.cloudDiskSpec = cloudDiskSpec;
        return this;
    }

    /**
     * set 数据盘逻辑挂载点，取值范围：vda,vdb,vdc,vdd,vde,vdf,vdg,vdh,vdi
     *
     * @param deviceName
     */
    public InstanceDiskAttachmentSpec deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 排除设备，使用此参数noDevice配合deviceName一起使用。
创建整机镜像：如deviceName:vdb、noDevice:true，则表示云主机中的数据盘vdb不参与创建镜像。
创建模板：如deviceName:vdb、noDevice:true，则表示镜像中的数据盘vdb不参与创建主机。
创建主机：如deviceName:vdb、noDevice:true，则表示镜像中的数据盘vdb，或者模板(使用模板创建主机)中的数据盘vdb不参与创建主机。

     *
     * @param noDevice
     */
    public InstanceDiskAttachmentSpec noDevice(Boolean noDevice) {
        this.noDevice = noDevice;
        return this;
    }


}