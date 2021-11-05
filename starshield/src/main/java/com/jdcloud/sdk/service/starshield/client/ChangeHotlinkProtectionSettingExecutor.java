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
 * Zone Settings
 * A Zone setting changes how the Zone works in relation to caching, security, or other features of JDC StarShield
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.starshield.model.ChangeHotlinkProtectionSettingResponse;

/**
 * 启用后，热链路保护选项可确保其他网站无法通过建立使用您网站上托管的图像的页面来占用您的带宽。只要您的网站上的图像请求被星盾选中，我们就会检查以确保这不是其他网站在请求它们。
人们仍然能够从你的网页上下载和查看图像，但其他网站将无法窃取它们用于自己的网页。

 */
class ChangeHotlinkProtectionSettingExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "PATCH";
    }

    @Override
    public String url() {
        return "/zones/{zone_identifier}/settings$$hotlink_protection";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return ChangeHotlinkProtectionSettingResponse.class;
    }
}
