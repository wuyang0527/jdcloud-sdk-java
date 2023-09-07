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
 * Read-Write-Proxy-Management
 * 读写分离代理管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.rds.model.EnableReadWriteProxyInternetAccessResponse;

/**
 * 开启读写分离代理服务的外网访问功能。开启后，用户可以通过 internet 连接读写分离代理服务&lt;br&gt;- 仅支持MySQL、PostgreSQL
 */
class EnableReadWriteProxyInternetAccessExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/readWriteProxy/{readWriteProxyId}:enableReadWriteProxyInternetAccess";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return EnableReadWriteProxyInternetAccessResponse.class;
    }
}
