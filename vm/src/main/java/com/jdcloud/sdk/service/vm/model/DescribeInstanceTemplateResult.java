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
 * Instance-Template
 * 与实例模板相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.service.vm.model.InstanceTemplate;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 
查询实例模板详情。

详细操作说明请参考帮助文档：[实例模板](https://docs.jdcloud.com/cn/virtual-machines/instance-template-overview)

## 接口说明
- 该接口与查询实例模板列表返回的信息一致。
- 只需要查询单个实例模板详细信息的时候可以调用该接口。

 */
public class DescribeInstanceTemplateResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 响应结果。
     */
    private InstanceTemplate instanceTemplate;


    /**
     * get 响应结果。
     *
     * @return
     */
    public InstanceTemplate getInstanceTemplate() {
        return instanceTemplate;
    }

    /**
     * set 响应结果。
     *
     * @param instanceTemplate
     */
    public void setInstanceTemplate(InstanceTemplate instanceTemplate) {
        this.instanceTemplate = instanceTemplate;
    }


    /**
     * set 响应结果。
     *
     * @param instanceTemplate
     */
    public DescribeInstanceTemplateResult instanceTemplate(InstanceTemplate instanceTemplate) {
        this.instanceTemplate = instanceTemplate;
        return this;
    }


}