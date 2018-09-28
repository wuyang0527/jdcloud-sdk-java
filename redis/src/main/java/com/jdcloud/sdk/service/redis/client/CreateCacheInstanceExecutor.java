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
 * 缓存Redis实例接口
 * 缓存Redis实例相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.redis.model.CreateCacheInstanceResponse;

/**
 * 创建一个指定配置的缓存Redis实例
规格性能：创建缓存Redis实例的规格，分为主从版和集群版两种规格。每种规格都有最大连接数，内网带宽上限，CPU处理能力，规格代码等信息，具体可查看：&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/411/isCatalog/1&quot;&gt;实例规格代码&lt;/a&gt;
可用区：可用区是指在同一地域下，电力、网络等基础设施互相独立的物理区域。一个地域包含一个或多个可用区，同一地域下的多个可用区可以彼此连通。地域可用区详细信息可查询：&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/2222/isCatalog/1&quot;&gt;地域可用区详情&lt;/a&gt;
私有网络：简称VPC，自定义的逻辑隔离网络空间，支持自定义网段划分、路由策略等。具体信息可查询：&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/1509/isCatalog/1&quot;&gt;私有网络VPC详情&lt;/a&gt;
子网：子网是所属VPC IP地址范围内的IP地址块，简称subnet，在VPC下创建子网，同一VPC下子网的网段不可以重叠，不同VPC下子网的网段可以重叠。具体信息可查询：&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/1510/isCatalog/1&quot;&gt;子网subnet详情&lt;/a&gt;

 */
class CreateCacheInstanceExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/cacheInstance";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return CreateCacheInstanceResponse.class;
    }
}
