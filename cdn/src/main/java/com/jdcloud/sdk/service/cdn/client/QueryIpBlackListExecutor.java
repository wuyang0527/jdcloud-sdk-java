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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.cdn.model.QueryIpBlackListResponse;

/**
 * 查询ip黑白名单
 */
class QueryIpBlackListExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String url() {
        return "/domain/{domain}/ipBlackList";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return QueryIpBlackListResponse.class;
    }
}
