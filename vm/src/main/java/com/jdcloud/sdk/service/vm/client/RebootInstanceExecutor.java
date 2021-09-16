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
import com.jdcloud.sdk.service.vm.model.RebootInstanceResponse;

/**
 * 
重启云主机实例。

详细操作说明请参考帮助文档：[重启实例](https://docs.jdcloud.com/cn/virtual-machines/reboot-instance)

## 接口说明
- 实例状态必须为运行 &#x60;running&#x60; 状态，同时实例没有正在进行中的任务时才可以重启。
- 如果云主机实例已欠费或已到期，则无法重启。

 */
class RebootInstanceExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/instances/{instanceId}:rebootInstance";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return RebootInstanceResponse.class;
    }
}
