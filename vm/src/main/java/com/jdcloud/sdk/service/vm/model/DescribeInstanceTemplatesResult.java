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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vm.model.InstanceTemplate;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 
查询实例模板列表。

详细操作说明请参考帮助文档：[实例模板](https://docs.jdcloud.com/cn/virtual-machines/instance-template-overview)

## 接口说明
- 使用 &#x60;filters&#x60; 过滤器进行条件筛选，每个 &#x60;filter&#x60; 之间的关系为逻辑与（AND）的关系。
- 单次查询最大可查询100条实例模板数据。

 */
public class DescribeInstanceTemplatesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * instanceTemplates
     */
    private List<InstanceTemplate> instanceTemplates;

    /**
     * 本次查询可匹配到的总记录数，使用者需要结合 &#x60;pageNumber&#x60; 和 &#x60;pageSize&#x60; 计算是否可以继续分页。
     */
    private Number totalCount;


    /**
     * get instanceTemplates
     *
     * @return
     */
    public List<InstanceTemplate> getInstanceTemplates() {
        return instanceTemplates;
    }

    /**
     * set instanceTemplates
     *
     * @param instanceTemplates
     */
    public void setInstanceTemplates(List<InstanceTemplate> instanceTemplates) {
        this.instanceTemplates = instanceTemplates;
    }

    /**
     * get 本次查询可匹配到的总记录数，使用者需要结合 &#x60;pageNumber&#x60; 和 &#x60;pageSize&#x60; 计算是否可以继续分页。
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set 本次查询可匹配到的总记录数，使用者需要结合 &#x60;pageNumber&#x60; 和 &#x60;pageSize&#x60; 计算是否可以继续分页。
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set instanceTemplates
     *
     * @param instanceTemplates
     */
    public DescribeInstanceTemplatesResult instanceTemplates(List<InstanceTemplate> instanceTemplates) {
        this.instanceTemplates = instanceTemplates;
        return this;
    }

    /**
     * set 本次查询可匹配到的总记录数，使用者需要结合 &#x60;pageNumber&#x60; 和 &#x60;pageSize&#x60; 计算是否可以继续分页。
     *
     * @param totalCount
     */
    public DescribeInstanceTemplatesResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to instanceTemplates
     *
     * @param instanceTemplate
     */
    public void addInstanceTemplate(InstanceTemplate instanceTemplate) {
        if (this.instanceTemplates == null) {
            this.instanceTemplates = new ArrayList<>();
        }
        this.instanceTemplates.add(instanceTemplate);
    }

}