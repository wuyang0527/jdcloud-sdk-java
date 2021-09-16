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
import com.jdcloud.sdk.service.vm.model.ModifyInstanceDiskAttributeResponse;

/**
 * 
修改一台云主机中的云硬盘属性。

详细操作说明请参考帮助文档：[配置云硬盘删除属性](https://docs.jdcloud.com/cn/virtual-machines/configurate-delete-attributes)

## 接口说明
- 该接口当前只能修改实例中的云硬盘随实例删除属性。
- 仅按配置计费、并且非共享型的云硬盘支持修改。
- 包年包月计费的云硬盘该属性不生效，实例删除时云硬盘将保留。

 */
class ModifyInstanceDiskAttributeExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/instances/{instanceId}:modifyInstanceDiskAttribute";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return ModifyInstanceDiskAttributeResponse.class;
    }
}
