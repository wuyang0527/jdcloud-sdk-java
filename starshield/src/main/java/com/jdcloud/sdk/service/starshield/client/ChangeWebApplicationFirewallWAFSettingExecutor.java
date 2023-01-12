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
import com.jdcloud.sdk.service.starshield.model.ChangeWebApplicationFirewallWAFSettingResponse;

/**
 * WAF检查对您网站的HTTP请求。它检查GET和POST请求，并应用规则来帮助从合法的网站访问者中过滤出非法流量。星盾 WAF 检查网站地址或 URL 以检测任何不正常的东西。
如果星盾 WAF确定了可疑的用户行为。那么 WAF 将用一个页面 &quot;挑战 &quot;网络访客，要求他们成功提交验证码以继续其行动。
如果挑战失败，行动将被停止。这意味着 星盾 的 WAF 将在任何被识别为非法的流量到达您的源网络服务器之前将其阻止。

 */
class ChangeWebApplicationFirewallWAFSettingExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "PATCH";
    }

    @Override
    public String url() {
        return "/zones/{zone_identifier}/settings$$waf";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return ChangeWebApplicationFirewallWAFSettingResponse.class;
    }
}
