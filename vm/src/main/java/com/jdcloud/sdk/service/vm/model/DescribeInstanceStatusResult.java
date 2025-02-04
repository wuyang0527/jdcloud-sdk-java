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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vm.model.InstanceStatus;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 
查询一台或多台云主机实例的状态。

云主机实例的状态说明请参考帮助文档：[云主机状态](https://docs.jdcloud.com/cn/virtual-machines/api/vm_status)

## 接口说明
- 使用 &#x60;filters&#x60; 过滤器进行条件筛选，每个 &#x60;filter&#x60; 之间的关系为逻辑与（AND）的关系。
- 单次查询最大可查询100条云主机状态。
- 尽量一次调用接口查询多条数据，不建议使用该批量查询接口一次查询一条数据，如果使用不当导致查询过于密集，可能导致网关触发限流。
- 由于该接口为 &#x60;GET&#x60; 方式请求，最终参数会转换为 &#x60;URL&#x60; 上的参数，但是 &#x60;HTTP&#x60; 协议下的 &#x60;GET&#x60; 请求参数长度是有大小限制的，使用者需要注意参数超长的问题。

 */
public class DescribeInstanceStatusResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * instanceStatuses
     */
    private List<InstanceStatus> instanceStatuses;

    /**
     * 本次查询可匹配到的总记录数，使用者需要结合 &#x60;pageNumber&#x60; 和 &#x60;pageSize&#x60; 计算是否可以继续分页。
     */
    private Number totalCount;


    /**
     * get instanceStatuses
     *
     * @return
     */
    public List<InstanceStatus> getInstanceStatuses() {
        return instanceStatuses;
    }

    /**
     * set instanceStatuses
     *
     * @param instanceStatuses
     */
    public void setInstanceStatuses(List<InstanceStatus> instanceStatuses) {
        this.instanceStatuses = instanceStatuses;
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
     * set instanceStatuses
     *
     * @param instanceStatuses
     */
    public DescribeInstanceStatusResult instanceStatuses(List<InstanceStatus> instanceStatuses) {
        this.instanceStatuses = instanceStatuses;
        return this;
    }

    /**
     * set 本次查询可匹配到的总记录数，使用者需要结合 &#x60;pageNumber&#x60; 和 &#x60;pageSize&#x60; 计算是否可以继续分页。
     *
     * @param totalCount
     */
    public DescribeInstanceStatusResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to instanceStatuses
     *
     * @param instanceStatuse
     */
    public void addInstanceStatuse(InstanceStatus instanceStatuse) {
        if (this.instanceStatuses == null) {
            this.instanceStatuses = new ArrayList<>();
        }
        this.instanceStatuses.add(instanceStatuse);
    }

}