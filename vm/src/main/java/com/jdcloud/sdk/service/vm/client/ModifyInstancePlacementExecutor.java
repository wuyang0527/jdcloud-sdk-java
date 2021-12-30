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

package com.jdcloud.sdk.service.vm.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.vm.model.ModifyInstancePlacementResponse;

/**
 * 
存量主机加入高可用组。

存量主机加入高可用组，或者主机从一个高可用组移动到另一个高可用组

详细操作说明请参考帮助文档：[存量主机加入高可用组](https://docs.jdcloud.com/cn/virtual-machines/rebuild-instance)

## 接口说明
- 不支持专属宿主机上的实例调整高可用组。
- 除GPU、vGPU（以P开头）外的一代机暂不支持调整高可用组。
- 与该高可用组关联实例模板的VPC不同的不支持调整高可用组。
- 与该高可用组可用区不匹配的实例不支持调整高可用组。
- 本地系统盘机型不支持强制均衡。
- 仅支持实例状态为已停止的实例强制均衡调整高可用组。
- 若不强制均衡，仅支持实例状态为运行中或已停止的实例调整高可用组。
- 若强制均衡，带本地数据盘的实例需确认清除本地盘数据。

 */
class ModifyInstancePlacementExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/instances/{instanceId}:modifyInstancePlacement";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return ModifyInstancePlacementResponse.class;
    }
}
