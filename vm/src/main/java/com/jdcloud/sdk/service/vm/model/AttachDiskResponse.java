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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.service.JdcloudResponse;

/**
 * 
为一台云主机挂载云硬盘。

详细操作说明请参考帮助文档：[挂载云硬盘](https://docs.jdcloud.com/cn/virtual-machines/attach-cloud-disk)

## 接口说明
- 云主机和云硬盘都没有正在进行中的的任务时才可以操作。
- 云主机状态必须是 &#x60;running&#x60; 或 &#x60;stopped&#x60; 状态。操作系统盘时必须先停止实例。
- 实例挂载云硬盘的数量，不能超过实例规格的限制。可查询  [DescribeInstanceTypes](https://docs.jdcloud.com/virtual-machines/api/describeinstancetypes)  接口获得指定规格可挂载云硬盘的数量上限。
- 云硬盘作为系统盘时，容量不能小于40GB，并且不能超过500GB。
- 待挂载的云硬盘与云主机实例必须在同一个可用区下。
- 共享型云硬盘最多可挂载16个云主机实例，并且只能用作数据盘，不能用于系统盘。非共享型云盘最多只能挂载一个云主机实例。

 */
public class AttachDiskResponse extends JdcloudResponse<AttachDiskResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}