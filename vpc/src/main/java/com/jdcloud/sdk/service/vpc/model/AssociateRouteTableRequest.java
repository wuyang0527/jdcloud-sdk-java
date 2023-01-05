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
 * 路由表
 * 路由表相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 路由表绑定子网接口
 */
public class AssociateRouteTableRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 路由表要绑定的子网ID列表, 只有associateType是subnet类型的路由表才支持绑定；subnet已被其他路由表绑定时，自动解绑。路由表绑定的子网属性要相同，或者都是标准子网，或者都是相同边缘可用区的边缘子网。
     * Required:true
     */
    @Required
    
    private List<String> subnetIds;
    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RouteTable ID
     * Required:true
     */
    @Required
    private String routeTableId;



    /**
    * get 路由表要绑定的子网ID列表, 只有associateType是subnet类型的路由表才支持绑定；subnet已被其他路由表绑定时，自动解绑。路由表绑定的子网属性要相同，或者都是标准子网，或者都是相同边缘可用区的边缘子网。
    *
    * @return
    */
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
    * set 路由表要绑定的子网ID列表, 只有associateType是subnet类型的路由表才支持绑定；subnet已被其他路由表绑定时，自动解绑。路由表绑定的子网属性要相同，或者都是标准子网，或者都是相同边缘可用区的边缘子网。
    *
    * @param subnetIds
    */
    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }


    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get RouteTable ID
     *
     * @return
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * set RouteTable ID
     *
     * @param routeTableId
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }



    /**
    * set 路由表要绑定的子网ID列表, 只有associateType是subnet类型的路由表才支持绑定；subnet已被其他路由表绑定时，自动解绑。路由表绑定的子网属性要相同，或者都是标准子网，或者都是相同边缘可用区的边缘子网。
    *
    * @param subnetIds
    */
    public AssociateRouteTableRequest subnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public AssociateRouteTableRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set RouteTable ID
     *
     * @param routeTableId
     */
    public AssociateRouteTableRequest routeTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }



    /**
     * add item to 路由表要绑定的子网ID列表, 只有associateType是subnet类型的路由表才支持绑定；subnet已被其他路由表绑定时，自动解绑。路由表绑定的子网属性要相同，或者都是标准子网，或者都是相同边缘可用区的边缘子网。
     *
     * @param subnetId
     */
    public void addSubnetId(String subnetId) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetId);
    }
}