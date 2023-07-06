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
 * 弹性伸缩规则管理
 * 弹性伸缩规则管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ag.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.ag.model.CreateAsRuleResponse;

/**
 * 创建伸缩规则
- 所有参数取值为字符串类型的都严格区分大小写
- 伸缩功能关闭的情况下，不支持调用此接口
- 目标跟踪规则创建后会自动生成两个告警任务，分别用于扩容和缩容
- 步进规则必须绑定一个告警任务

 */
class CreateAsRuleExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/asRules";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return CreateAsRuleResponse.class;
    }
}
