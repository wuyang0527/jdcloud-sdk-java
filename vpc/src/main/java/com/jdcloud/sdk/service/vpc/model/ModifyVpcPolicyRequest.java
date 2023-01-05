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
 * Vpc-Policy
 * vpc支持oss权限访问控制相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改VPC Policy接口
 */
public class ModifyVpcPolicyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 访问控制策略的Id
     * Required:true
     */
    @Required
    private String vpcPolicyId;

    /**
     * VpcPolicy的名称,不为空(有变更再传)。取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     */
    private String vpcPolicyName;

    /**
     * 具体策略内容(格式参考样例)
     */
    private String policyDocument;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 访问控制策略的Id
     *
     * @return
     */
    public String getVpcPolicyId() {
        return vpcPolicyId;
    }

    /**
     * set 访问控制策略的Id
     *
     * @param vpcPolicyId
     */
    public void setVpcPolicyId(String vpcPolicyId) {
        this.vpcPolicyId = vpcPolicyId;
    }


    /**
     * get VpcPolicy的名称,不为空(有变更再传)。取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @return
     */
    public String getVpcPolicyName() {
        return vpcPolicyName;
    }

    /**
     * set VpcPolicy的名称,不为空(有变更再传)。取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param vpcPolicyName
     */
    public void setVpcPolicyName(String vpcPolicyName) {
        this.vpcPolicyName = vpcPolicyName;
    }


    /**
     * get 具体策略内容(格式参考样例)
     *
     * @return
     */
    public String getPolicyDocument() {
        return policyDocument;
    }

    /**
     * set 具体策略内容(格式参考样例)
     *
     * @param policyDocument
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
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
     * set 访问控制策略的Id
     *
     * @param vpcPolicyId
     */
    public ModifyVpcPolicyRequest vpcPolicyId(String vpcPolicyId) {
        this.vpcPolicyId = vpcPolicyId;
        return this;
    }


    /**
     * set VpcPolicy的名称,不为空(有变更再传)。取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param vpcPolicyName
     */
    public ModifyVpcPolicyRequest vpcPolicyName(String vpcPolicyName) {
        this.vpcPolicyName = vpcPolicyName;
        return this;
    }


    /**
     * set 具体策略内容(格式参考样例)
     *
     * @param policyDocument
     */
    public ModifyVpcPolicyRequest policyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyVpcPolicyRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}