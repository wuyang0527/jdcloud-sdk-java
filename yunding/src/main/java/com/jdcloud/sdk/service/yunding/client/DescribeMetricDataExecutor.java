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
 * yunding-monitor
 * 云鼎-云监控相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yunding.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.yunding.model.DescribeMetricDataResponse;

/**
 * 查看某资源单个监控项数据，metric介绍：&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/monitoring/metrics&quot;&gt;Metrics&lt;/a&gt;，可以使用接口&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/monitoring/metrics&quot;&gt;describeMetrics&lt;/a&gt;：查询产品线可用的metric列表。
 */
class DescribeMetricDataExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/ydMetrics/{metric}/metricData";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DescribeMetricDataResponse.class;
    }
}
