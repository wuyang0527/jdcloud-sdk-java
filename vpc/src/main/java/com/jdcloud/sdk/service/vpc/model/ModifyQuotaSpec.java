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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * modifyQuotaSpec
 */
public class ModifyQuotaSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源类型，取值范围：vpc、elastic_ip、subnet、security_group、vpcpeering、network_interface（配额只统计辅助网卡）、acl、aclRule、routeTable、route、staticRoute、propagatedRoute、securityGroupRule、network_interface_cidr、bwpByUsage、bandwidthPackageIp、natGateway
     * Required:true
     */
    @Required
    private String type;

    /**
     * type为vpc、elastic_ip、network_interface、bwpByUsage、natGateway不设置, type为subnet、security_group、vpcpeering、acl、routeTable设置为vpcId, type为aclRule设置为aclId, type为route、staticRoute、propagatedRoute设置为routeTableId, type为securityGroupRule为securityGroupId, type为network_interface_cidr设置为networkInterfaceId，type为bandwidthPackageIp设置为bandwidthPackageId
     */
    private String parentResourceId;

    /**
     * 配额大小
     * Required:true
     */
    @Required
    private Integer maxLimit;


    /**
     * get 资源类型，取值范围：vpc、elastic_ip、subnet、security_group、vpcpeering、network_interface（配额只统计辅助网卡）、acl、aclRule、routeTable、route、staticRoute、propagatedRoute、securityGroupRule、network_interface_cidr、bwpByUsage、bandwidthPackageIp、natGateway
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 资源类型，取值范围：vpc、elastic_ip、subnet、security_group、vpcpeering、network_interface（配额只统计辅助网卡）、acl、aclRule、routeTable、route、staticRoute、propagatedRoute、securityGroupRule、network_interface_cidr、bwpByUsage、bandwidthPackageIp、natGateway
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get type为vpc、elastic_ip、network_interface、bwpByUsage、natGateway不设置, type为subnet、security_group、vpcpeering、acl、routeTable设置为vpcId, type为aclRule设置为aclId, type为route、staticRoute、propagatedRoute设置为routeTableId, type为securityGroupRule为securityGroupId, type为network_interface_cidr设置为networkInterfaceId，type为bandwidthPackageIp设置为bandwidthPackageId
     *
     * @return
     */
    public String getParentResourceId() {
        return parentResourceId;
    }

    /**
     * set type为vpc、elastic_ip、network_interface、bwpByUsage、natGateway不设置, type为subnet、security_group、vpcpeering、acl、routeTable设置为vpcId, type为aclRule设置为aclId, type为route、staticRoute、propagatedRoute设置为routeTableId, type为securityGroupRule为securityGroupId, type为network_interface_cidr设置为networkInterfaceId，type为bandwidthPackageIp设置为bandwidthPackageId
     *
     * @param parentResourceId
     */
    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    /**
     * get 配额大小
     *
     * @return
     */
    public Integer getMaxLimit() {
        return maxLimit;
    }

    /**
     * set 配额大小
     *
     * @param maxLimit
     */
    public void setMaxLimit(Integer maxLimit) {
        this.maxLimit = maxLimit;
    }


    /**
     * set 资源类型，取值范围：vpc、elastic_ip、subnet、security_group、vpcpeering、network_interface（配额只统计辅助网卡）、acl、aclRule、routeTable、route、staticRoute、propagatedRoute、securityGroupRule、network_interface_cidr、bwpByUsage、bandwidthPackageIp、natGateway
     *
     * @param type
     */
    public ModifyQuotaSpec type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set type为vpc、elastic_ip、network_interface、bwpByUsage、natGateway不设置, type为subnet、security_group、vpcpeering、acl、routeTable设置为vpcId, type为aclRule设置为aclId, type为route、staticRoute、propagatedRoute设置为routeTableId, type为securityGroupRule为securityGroupId, type为network_interface_cidr设置为networkInterfaceId，type为bandwidthPackageIp设置为bandwidthPackageId
     *
     * @param parentResourceId
     */
    public ModifyQuotaSpec parentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
        return this;
    }

    /**
     * set 配额大小
     *
     * @param maxLimit
     */
    public ModifyQuotaSpec maxLimit(Integer maxLimit) {
        this.maxLimit = maxLimit;
        return this;
    }


}