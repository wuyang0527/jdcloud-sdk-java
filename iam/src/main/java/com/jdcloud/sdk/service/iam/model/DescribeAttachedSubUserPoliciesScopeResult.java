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
 * SubUser Management
 * SubUser Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.iam.model.ResourceGroup;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询子用户绑定的策略对应资源组列表
 */
public class DescribeAttachedSubUserPoliciesScopeResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总数
     */
    private Integer total;

    /**
     * policies
     */
    
    private List<ResourceGroup> policies;


    /**
     * get 总数
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * set 总数
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }


    /**
    * get policies
    *
    * @return
    */
    public List<ResourceGroup> getPolicies() {
        return policies;
    }

    /**
    * set policies
    *
    * @param policies
    */
    public void setPolicies(List<ResourceGroup> policies) {
        this.policies = policies;
    }



    /**
     * set 总数
     *
     * @param total
     */
    public DescribeAttachedSubUserPoliciesScopeResult total(Integer total) {
        this.total = total;
        return this;
    }


    /**
    * set policies
    *
    * @param policies
    */
    public DescribeAttachedSubUserPoliciesScopeResult policies(List<ResourceGroup> policies) {
        this.policies = policies;
        return this;
    }



    /**
     * add item to policies
     *
     * @param policie
     */
    public void addPolicie(ResourceGroup policie) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policie);
    }
}