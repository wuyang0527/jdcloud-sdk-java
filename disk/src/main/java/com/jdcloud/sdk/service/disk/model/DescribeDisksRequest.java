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
 * 云硬盘相关接口
 * 云硬盘相关接口，提供批量创建云硬盘，查询云硬盘，删除云硬盘，对云硬盘进行扩容，修改云硬盘信息以及使用快照恢复云硬盘等功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.disk.model.TagFilter;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * -   查询您已经创建的云硬盘。
-   filters多个过滤条件之间是逻辑与(AND)，每个条件内部的多个取值是逻辑或(OR)

 */
public class DescribeDisksRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码, 默认为1, 取值范围：[1,∞)
     */
    private Integer pageNumber;

    /**
     * 分页大小，默认为20，取值范围：[10,100]
     */
    private Integer pageSize;

    /**
     * Tag筛选条件
     */
    private List<TagFilter> tags;

    /**
     * diskId - 云硬盘ID，精确匹配，支持多个
diskType - 云硬盘类型，精确匹配，支持多个，取值为 ssd,premium-hdd,ssd.io1,ssd.gp1,hdd.std1
instanceId - 云硬盘所挂载主机的ID，精确匹配，支持多个
instanceType - 云硬盘所挂载主机的类型，精确匹配，支持多个
status - 云硬盘状态，精确匹配，支持多个 
az - 可用区，精确匹配，支持多个
name - 云硬盘名称，模糊匹配，支持单个
multiAttach - 云硬盘是否多点挂载，精确匹配，支持单个
encrypted - 云硬盘是否加密，精确匹配，支持单个
policyId - 绑定policyId的云硬盘，精确匹配，支持多个
notPolicyId - 未绑定policyId的云硬盘，精确匹配，支持多个

     */
    private List<Filter> filters;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码, 默认为1, 取值范围：[1,∞)
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码, 默认为1, 取值范围：[1,∞)
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小，默认为20，取值范围：[10,100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get Tag筛选条件
     *
     * @return
     */
    public List<TagFilter> getTags() {
        return tags;
    }

    /**
     * set Tag筛选条件
     *
     * @param tags
     */
    public void setTags(List<TagFilter> tags) {
        this.tags = tags;
    }

    /**
     * get diskId - 云硬盘ID，精确匹配，支持多个
diskType - 云硬盘类型，精确匹配，支持多个，取值为 ssd,premium-hdd,ssd.io1,ssd.gp1,hdd.std1
instanceId - 云硬盘所挂载主机的ID，精确匹配，支持多个
instanceType - 云硬盘所挂载主机的类型，精确匹配，支持多个
status - 云硬盘状态，精确匹配，支持多个 
az - 可用区，精确匹配，支持多个
name - 云硬盘名称，模糊匹配，支持单个
multiAttach - 云硬盘是否多点挂载，精确匹配，支持单个
encrypted - 云硬盘是否加密，精确匹配，支持单个
policyId - 绑定policyId的云硬盘，精确匹配，支持多个
notPolicyId - 未绑定policyId的云硬盘，精确匹配，支持多个

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set diskId - 云硬盘ID，精确匹配，支持多个
diskType - 云硬盘类型，精确匹配，支持多个，取值为 ssd,premium-hdd,ssd.io1,ssd.gp1,hdd.std1
instanceId - 云硬盘所挂载主机的ID，精确匹配，支持多个
instanceType - 云硬盘所挂载主机的类型，精确匹配，支持多个
status - 云硬盘状态，精确匹配，支持多个 
az - 可用区，精确匹配，支持多个
name - 云硬盘名称，模糊匹配，支持单个
multiAttach - 云硬盘是否多点挂载，精确匹配，支持单个
encrypted - 云硬盘是否加密，精确匹配，支持单个
policyId - 绑定policyId的云硬盘，精确匹配，支持多个
notPolicyId - 未绑定policyId的云硬盘，精确匹配，支持多个

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 页码, 默认为1, 取值范围：[1,∞)
     *
     * @param pageNumber
     */
    public DescribeDisksRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public DescribeDisksRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set Tag筛选条件
     *
     * @param tags
     */
    public DescribeDisksRequest tags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set diskId - 云硬盘ID，精确匹配，支持多个
diskType - 云硬盘类型，精确匹配，支持多个，取值为 ssd,premium-hdd,ssd.io1,ssd.gp1,hdd.std1
instanceId - 云硬盘所挂载主机的ID，精确匹配，支持多个
instanceType - 云硬盘所挂载主机的类型，精确匹配，支持多个
status - 云硬盘状态，精确匹配，支持多个 
az - 可用区，精确匹配，支持多个
name - 云硬盘名称，模糊匹配，支持单个
multiAttach - 云硬盘是否多点挂载，精确匹配，支持单个
encrypted - 云硬盘是否加密，精确匹配，支持单个
policyId - 绑定policyId的云硬盘，精确匹配，支持多个
notPolicyId - 未绑定policyId的云硬盘，精确匹配，支持多个

     *
     * @param filters
     */
    public DescribeDisksRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescribeDisksRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to Tag筛选条件
     *
     * @param tag
     */
    public void addTag(TagFilter tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

    /**
     * add item to diskId - 云硬盘ID，精确匹配，支持多个
diskType - 云硬盘类型，精确匹配，支持多个，取值为 ssd,premium-hdd,ssd.io1,ssd.gp1,hdd.std1
instanceId - 云硬盘所挂载主机的ID，精确匹配，支持多个
instanceType - 云硬盘所挂载主机的类型，精确匹配，支持多个
status - 云硬盘状态，精确匹配，支持多个 
az - 可用区，精确匹配，支持多个
name - 云硬盘名称，模糊匹配，支持单个
multiAttach - 云硬盘是否多点挂载，精确匹配，支持单个
encrypted - 云硬盘是否加密，精确匹配，支持单个
policyId - 绑定policyId的云硬盘，精确匹配，支持多个
notPolicyId - 未绑定policyId的云硬盘，精确匹配，支持多个

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}