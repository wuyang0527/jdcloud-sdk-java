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
 * Snapshot Template
 * 截图模板管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vod.model.Filter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询截图模板列表。
允许通过条件过滤查询，支持的过滤字段如下：
  - snapshotType[eq] 按模板类型精确查询
  - templateId[eq] 按模板ID精确查询

 */
public class ListSnapshotTemplatesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认值为 1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认值为 10；取值范围 [10, 100]
     */
    private Integer pageSize;

    /**
     * filters
     */
    private List<Filter> filters;


    /**
     * get 页码；默认值为 1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认值为 1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；默认值为 10；取值范围 [10, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认值为 10；取值范围 [10, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get filters
     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set filters
     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * set 页码；默认值为 1
     *
     * @param pageNumber
     */
    public ListSnapshotTemplatesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；默认值为 10；取值范围 [10, 100]
     *
     * @param pageSize
     */
    public ListSnapshotTemplatesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set filters
     *
     * @param filters
     */
    public ListSnapshotTemplatesRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * add item to filters
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