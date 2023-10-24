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
 * ImageCache
 * 镜像缓存相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.pod.model.GetMostSuitableImageCacheResponse;

/**
 * 根据镜像信息匹配镜像缓存，根据镜像缓存的体积（体积小的优先）和创建时间（创建时间晚的优先）进行匹配

 */
class GetMostSuitableImageCacheExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/imageCache:getMostSuitable";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return GetMostSuitableImageCacheResponse.class;
    }
}
