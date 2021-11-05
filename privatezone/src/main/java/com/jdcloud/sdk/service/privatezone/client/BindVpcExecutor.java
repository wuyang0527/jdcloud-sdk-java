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
 * 私有域名zone
 * 私有域名zone API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.privatezone.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.privatezone.model.BindVpcResponse;

/**
 * 绑定vpc
- vpc信息为空时，会将之前的绑定关系全部解除
- 该接口为覆盖类的接口，请将需要的vpc全部进行绑定

 */
class BindVpcExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "PUT";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/zone/{zoneId}/vpc:bind";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return BindVpcResponse.class;
    }
}
