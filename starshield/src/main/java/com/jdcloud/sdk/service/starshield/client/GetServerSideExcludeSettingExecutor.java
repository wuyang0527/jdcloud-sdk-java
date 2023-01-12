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
 * Zone-Settings
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
import com.jdcloud.sdk.service.starshield.model.GetServerSideExcludeSettingResponse;

/**
 * 如果你的网站上有敏感的内容，你想让真正的访问者看到，但你想对可疑的访问者进行隐藏，你所要做的就是用星盾SSE标签来包装这些内容。
用下面的SSE标签包住任何你想不让可疑访客看到的内容，&lt;!--sse--&gt;&lt;!--/sse--&gt;。
例如，&lt;!--sse--&gt;不好的访问者不会看到我的电话号码，555-555-5555&lt;!--/sse--&gt;。注意，SSE只对HTML起作用。
如果你启用了HTML最小化功能，当你的HTML源代码通过星盾提供服务时，你不会看到SSE标签。
在这种情况下，SSE 仍将发挥作用，因为星盾的 HTML 缩减和 SSE 功能是在资源通过我们的网络传输给我们时即时发生的。当资源通过我们的网络移动到访问者的计算机上时，SSE 仍会发挥作用。

 */
class GetServerSideExcludeSettingExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String url() {
        return "/zones/{zone_identifier}/settings$$server_side_exclude";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return GetServerSideExcludeSettingResponse.class;
    }
}
