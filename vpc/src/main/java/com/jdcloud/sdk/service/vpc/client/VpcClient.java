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
 * 京东云VPC
 * VPC相关API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.vpc.model.ModifyNetworkSecurityGroupRulesRequest;
import com.jdcloud.sdk.service.vpc.model.ModifyNetworkSecurityGroupRulesResponse;
import com.jdcloud.sdk.service.vpc.client.ModifyNetworkSecurityGroupRulesExecutor;
import com.jdcloud.sdk.service.vpc.model.CreateNetworkAclRequest;
import com.jdcloud.sdk.service.vpc.model.CreateNetworkAclResponse;
import com.jdcloud.sdk.service.vpc.client.CreateNetworkAclExecutor;
import com.jdcloud.sdk.service.vpc.model.DisassociateRouteTableRequest;
import com.jdcloud.sdk.service.vpc.model.DisassociateRouteTableResponse;
import com.jdcloud.sdk.service.vpc.client.DisassociateRouteTableExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeNetworkAclsRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeNetworkAclsResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeNetworkAclsExecutor;
import com.jdcloud.sdk.service.vpc.model.DeleteNetworkAclRequest;
import com.jdcloud.sdk.service.vpc.model.DeleteNetworkAclResponse;
import com.jdcloud.sdk.service.vpc.client.DeleteNetworkAclExecutor;
import com.jdcloud.sdk.service.vpc.model.DeleteRouteTableRequest;
import com.jdcloud.sdk.service.vpc.model.DeleteRouteTableResponse;
import com.jdcloud.sdk.service.vpc.client.DeleteRouteTableExecutor;
import com.jdcloud.sdk.service.vpc.model.ModifySubnetRequest;
import com.jdcloud.sdk.service.vpc.model.ModifySubnetResponse;
import com.jdcloud.sdk.service.vpc.client.ModifySubnetExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeRouteTablesRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeRouteTablesResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeRouteTablesExecutor;
import com.jdcloud.sdk.service.vpc.model.AssociateElasticIpRequest;
import com.jdcloud.sdk.service.vpc.model.AssociateElasticIpResponse;
import com.jdcloud.sdk.service.vpc.client.AssociateElasticIpExecutor;
import com.jdcloud.sdk.service.vpc.model.DisassociateNetworkAclRequest;
import com.jdcloud.sdk.service.vpc.model.DisassociateNetworkAclResponse;
import com.jdcloud.sdk.service.vpc.client.DisassociateNetworkAclExecutor;
import com.jdcloud.sdk.service.vpc.model.ModifyNetworkAclRequest;
import com.jdcloud.sdk.service.vpc.model.ModifyNetworkAclResponse;
import com.jdcloud.sdk.service.vpc.client.ModifyNetworkAclExecutor;
import com.jdcloud.sdk.service.vpc.model.RemoveNetworkSecurityGroupRulesRequest;
import com.jdcloud.sdk.service.vpc.model.RemoveNetworkSecurityGroupRulesResponse;
import com.jdcloud.sdk.service.vpc.client.RemoveNetworkSecurityGroupRulesExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeElasticIpRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeElasticIpResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeElasticIpExecutor;
import com.jdcloud.sdk.service.vpc.model.RemoveNetworkAclRulesRequest;
import com.jdcloud.sdk.service.vpc.model.RemoveNetworkAclRulesResponse;
import com.jdcloud.sdk.service.vpc.client.RemoveNetworkAclRulesExecutor;
import com.jdcloud.sdk.service.vpc.model.DeleteSubnetRequest;
import com.jdcloud.sdk.service.vpc.model.DeleteSubnetResponse;
import com.jdcloud.sdk.service.vpc.client.DeleteSubnetExecutor;
import com.jdcloud.sdk.service.vpc.model.AddNetworkAclRulesRequest;
import com.jdcloud.sdk.service.vpc.model.AddNetworkAclRulesResponse;
import com.jdcloud.sdk.service.vpc.client.AddNetworkAclRulesExecutor;
import com.jdcloud.sdk.service.vpc.model.CreateRouteTableRequest;
import com.jdcloud.sdk.service.vpc.model.CreateRouteTableResponse;
import com.jdcloud.sdk.service.vpc.client.CreateRouteTableExecutor;
import com.jdcloud.sdk.service.vpc.model.CreateNetworkInterfaceRequest;
import com.jdcloud.sdk.service.vpc.model.CreateNetworkInterfaceResponse;
import com.jdcloud.sdk.service.vpc.client.CreateNetworkInterfaceExecutor;
import com.jdcloud.sdk.service.vpc.model.AddRouteTableRulesRequest;
import com.jdcloud.sdk.service.vpc.model.AddRouteTableRulesResponse;
import com.jdcloud.sdk.service.vpc.client.AddRouteTableRulesExecutor;
import com.jdcloud.sdk.service.vpc.model.CreateElasticIpsRequest;
import com.jdcloud.sdk.service.vpc.model.CreateElasticIpsResponse;
import com.jdcloud.sdk.service.vpc.client.CreateElasticIpsExecutor;
import com.jdcloud.sdk.service.vpc.model.RemoveRouteTableRulesRequest;
import com.jdcloud.sdk.service.vpc.model.RemoveRouteTableRulesResponse;
import com.jdcloud.sdk.service.vpc.client.RemoveRouteTableRulesExecutor;
import com.jdcloud.sdk.service.vpc.model.UnassignSecondaryIpsRequest;
import com.jdcloud.sdk.service.vpc.model.UnassignSecondaryIpsResponse;
import com.jdcloud.sdk.service.vpc.client.UnassignSecondaryIpsExecutor;
import com.jdcloud.sdk.service.vpc.model.DeleteVpcRequest;
import com.jdcloud.sdk.service.vpc.model.DeleteVpcResponse;
import com.jdcloud.sdk.service.vpc.client.DeleteVpcExecutor;
import com.jdcloud.sdk.service.vpc.model.ModifyNetworkSecurityGroupRequest;
import com.jdcloud.sdk.service.vpc.model.ModifyNetworkSecurityGroupResponse;
import com.jdcloud.sdk.service.vpc.client.ModifyNetworkSecurityGroupExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeSubnetRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeSubnetResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeSubnetExecutor;
import com.jdcloud.sdk.service.vpc.model.ModifyRouteTableRequest;
import com.jdcloud.sdk.service.vpc.model.ModifyRouteTableResponse;
import com.jdcloud.sdk.service.vpc.client.ModifyRouteTableExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeNetworkSecurityGroupRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeNetworkSecurityGroupResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeNetworkSecurityGroupExecutor;
import com.jdcloud.sdk.service.vpc.model.DeleteVpcPeeringRequest;
import com.jdcloud.sdk.service.vpc.model.DeleteVpcPeeringResponse;
import com.jdcloud.sdk.service.vpc.client.DeleteVpcPeeringExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeNetworkAclRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeNetworkAclResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeNetworkAclExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeNetworkInterfacesRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeNetworkInterfacesResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeNetworkInterfacesExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeVpcsRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeVpcsResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeVpcsExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeVpcPeeringRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeVpcPeeringResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeVpcPeeringExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeQuotaRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeQuotaResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeQuotaExecutor;
import com.jdcloud.sdk.service.vpc.model.DisassociateElasticIpRequest;
import com.jdcloud.sdk.service.vpc.model.DisassociateElasticIpResponse;
import com.jdcloud.sdk.service.vpc.client.DisassociateElasticIpExecutor;
import com.jdcloud.sdk.service.vpc.model.CreateVpcRequest;
import com.jdcloud.sdk.service.vpc.model.CreateVpcResponse;
import com.jdcloud.sdk.service.vpc.client.CreateVpcExecutor;
import com.jdcloud.sdk.service.vpc.model.AddNetworkSecurityGroupRulesRequest;
import com.jdcloud.sdk.service.vpc.model.AddNetworkSecurityGroupRulesResponse;
import com.jdcloud.sdk.service.vpc.client.AddNetworkSecurityGroupRulesExecutor;
import com.jdcloud.sdk.service.vpc.model.ModifyVpcRequest;
import com.jdcloud.sdk.service.vpc.model.ModifyVpcResponse;
import com.jdcloud.sdk.service.vpc.client.ModifyVpcExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeRouteTableRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeRouteTableResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeRouteTableExecutor;
import com.jdcloud.sdk.service.vpc.model.ModifyNetworkAclRulesRequest;
import com.jdcloud.sdk.service.vpc.model.ModifyNetworkAclRulesResponse;
import com.jdcloud.sdk.service.vpc.client.ModifyNetworkAclRulesExecutor;
import com.jdcloud.sdk.service.vpc.model.ModifyNetworkInterfaceRequest;
import com.jdcloud.sdk.service.vpc.model.ModifyNetworkInterfaceResponse;
import com.jdcloud.sdk.service.vpc.client.ModifyNetworkInterfaceExecutor;
import com.jdcloud.sdk.service.vpc.model.DeleteNetworkInterfaceRequest;
import com.jdcloud.sdk.service.vpc.model.DeleteNetworkInterfaceResponse;
import com.jdcloud.sdk.service.vpc.client.DeleteNetworkInterfaceExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeElasticIpsRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeElasticIpsResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeElasticIpsExecutor;
import com.jdcloud.sdk.service.vpc.model.AssignSecondaryIpsRequest;
import com.jdcloud.sdk.service.vpc.model.AssignSecondaryIpsResponse;
import com.jdcloud.sdk.service.vpc.client.AssignSecondaryIpsExecutor;
import com.jdcloud.sdk.service.vpc.model.AssociateRouteTableRequest;
import com.jdcloud.sdk.service.vpc.model.AssociateRouteTableResponse;
import com.jdcloud.sdk.service.vpc.client.AssociateRouteTableExecutor;
import com.jdcloud.sdk.service.vpc.model.CreateNetworkSecurityGroupRequest;
import com.jdcloud.sdk.service.vpc.model.CreateNetworkSecurityGroupResponse;
import com.jdcloud.sdk.service.vpc.client.CreateNetworkSecurityGroupExecutor;
import com.jdcloud.sdk.service.vpc.model.ModifyElasticIpRequest;
import com.jdcloud.sdk.service.vpc.model.ModifyElasticIpResponse;
import com.jdcloud.sdk.service.vpc.client.ModifyElasticIpExecutor;
import com.jdcloud.sdk.service.vpc.model.DeleteNetworkSecurityGroupRequest;
import com.jdcloud.sdk.service.vpc.model.DeleteNetworkSecurityGroupResponse;
import com.jdcloud.sdk.service.vpc.client.DeleteNetworkSecurityGroupExecutor;
import com.jdcloud.sdk.service.vpc.model.CreateSubnetRequest;
import com.jdcloud.sdk.service.vpc.model.CreateSubnetResponse;
import com.jdcloud.sdk.service.vpc.client.CreateSubnetExecutor;
import com.jdcloud.sdk.service.vpc.model.ModifyRouteTableRulesRequest;
import com.jdcloud.sdk.service.vpc.model.ModifyRouteTableRulesResponse;
import com.jdcloud.sdk.service.vpc.client.ModifyRouteTableRulesExecutor;
import com.jdcloud.sdk.service.vpc.model.DeleteElasticIpRequest;
import com.jdcloud.sdk.service.vpc.model.DeleteElasticIpResponse;
import com.jdcloud.sdk.service.vpc.client.DeleteElasticIpExecutor;
import com.jdcloud.sdk.service.vpc.model.AssociateNetworkAclRequest;
import com.jdcloud.sdk.service.vpc.model.AssociateNetworkAclResponse;
import com.jdcloud.sdk.service.vpc.client.AssociateNetworkAclExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeNetworkInterfaceRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeNetworkInterfaceResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeNetworkInterfaceExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeVpcRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeVpcResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeVpcExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeVpcPeeringsRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeVpcPeeringsResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeVpcPeeringsExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeNetworkSecurityGroupsRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeNetworkSecurityGroupsResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeNetworkSecurityGroupsExecutor;
import com.jdcloud.sdk.service.vpc.model.DescribeSubnetsRequest;
import com.jdcloud.sdk.service.vpc.model.DescribeSubnetsResponse;
import com.jdcloud.sdk.service.vpc.client.DescribeSubnetsExecutor;
import com.jdcloud.sdk.service.vpc.model.CreateVpcPeeringRequest;
import com.jdcloud.sdk.service.vpc.model.CreateVpcPeeringResponse;
import com.jdcloud.sdk.service.vpc.client.CreateVpcPeeringExecutor;
import com.jdcloud.sdk.service.vpc.model.ModifyVpcPeeringRequest;
import com.jdcloud.sdk.service.vpc.model.ModifyVpcPeeringResponse;
import com.jdcloud.sdk.service.vpc.client.ModifyVpcPeeringExecutor;

/**
 * vpcClient
 */
public class VpcClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.8";
    public final static String DefaultEndpoint = "vpc.jdcloud-api.com";
    public final static String ServiceName = "vpc";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private VpcClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 修改安全组规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyNetworkSecurityGroupRulesResponse modifyNetworkSecurityGroupRules(ModifyNetworkSecurityGroupRulesRequest request) throws JdcloudSdkException {
        return new ModifyNetworkSecurityGroupRulesExecutor().client(this).execute(request);
    }

    /**
     * 创建networkAcl接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateNetworkAclResponse createNetworkAcl(CreateNetworkAclRequest request) throws JdcloudSdkException {
        return new CreateNetworkAclExecutor().client(this).execute(request);
    }

    /**
     * 给路由表解绑子网接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisassociateRouteTableResponse disassociateRouteTable(DisassociateRouteTableRequest request) throws JdcloudSdkException {
        return new DisassociateRouteTableExecutor().client(this).execute(request);
    }

    /**
     * 查询Acl列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeNetworkAclsResponse describeNetworkAcls(DescribeNetworkAclsRequest request) throws JdcloudSdkException {
        return new DescribeNetworkAclsExecutor().client(this).execute(request);
    }

    /**
     * 删除networkAcl接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteNetworkAclResponse deleteNetworkAcl(DeleteNetworkAclRequest request) throws JdcloudSdkException {
        return new DeleteNetworkAclExecutor().client(this).execute(request);
    }

    /**
     * 删除路由表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request) throws JdcloudSdkException {
        return new DeleteRouteTableExecutor().client(this).execute(request);
    }

    /**
     * 修改子网接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifySubnetResponse modifySubnet(ModifySubnetRequest request) throws JdcloudSdkException {
        return new ModifySubnetExecutor().client(this).execute(request);
    }

    /**
     * 查询路由表列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRouteTablesResponse describeRouteTables(DescribeRouteTablesRequest request) throws JdcloudSdkException {
        return new DescribeRouteTablesExecutor().client(this).execute(request);
    }

    /**
     * 给网卡绑定弹性Ip接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AssociateElasticIpResponse associateElasticIp(AssociateElasticIpRequest request) throws JdcloudSdkException {
        return new AssociateElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 给子网解绑NetworkAcl接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisassociateNetworkAclResponse disassociateNetworkAcl(DisassociateNetworkAclRequest request) throws JdcloudSdkException {
        return new DisassociateNetworkAclExecutor().client(this).execute(request);
    }

    /**
     * 修改networkAcl接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyNetworkAclResponse modifyNetworkAcl(ModifyNetworkAclRequest request) throws JdcloudSdkException {
        return new ModifyNetworkAclExecutor().client(this).execute(request);
    }

    /**
     * 移除安全组规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RemoveNetworkSecurityGroupRulesResponse removeNetworkSecurityGroupRules(RemoveNetworkSecurityGroupRulesRequest request) throws JdcloudSdkException {
        return new RemoveNetworkSecurityGroupRulesExecutor().client(this).execute(request);
    }

    /**
     * ElasticIp资源信息详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeElasticIpResponse describeElasticIp(DescribeElasticIpRequest request) throws JdcloudSdkException {
        return new DescribeElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 移除networkAcl规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RemoveNetworkAclRulesResponse removeNetworkAclRules(RemoveNetworkAclRulesRequest request) throws JdcloudSdkException {
        return new RemoveNetworkAclRulesExecutor().client(this).execute(request);
    }

    /**
     * 删除子网
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) throws JdcloudSdkException {
        return new DeleteSubnetExecutor().client(this).execute(request);
    }

    /**
     * 添加networkAcl规则接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddNetworkAclRulesResponse addNetworkAclRules(AddNetworkAclRulesRequest request) throws JdcloudSdkException {
        return new AddNetworkAclRulesExecutor().client(this).execute(request);
    }

    /**
     * 创建路由表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request) throws JdcloudSdkException {
        return new CreateRouteTableExecutor().client(this).execute(request);
    }

    /**
     * 创建网卡接口，只能创建辅助网卡
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateNetworkInterfaceResponse createNetworkInterface(CreateNetworkInterfaceRequest request) throws JdcloudSdkException {
        return new CreateNetworkInterfaceExecutor().client(this).execute(request);
    }

    /**
     * 添加路由表规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddRouteTableRulesResponse addRouteTableRules(AddRouteTableRulesRequest request) throws JdcloudSdkException {
        return new AddRouteTableRulesExecutor().client(this).execute(request);
    }

    /**
     * 创建一个或者多个弹性Ip
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateElasticIpsResponse createElasticIps(CreateElasticIpsRequest request) throws JdcloudSdkException {
        return new CreateElasticIpsExecutor().client(this).execute(request);
    }

    /**
     * 移除路由表规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RemoveRouteTableRulesResponse removeRouteTableRules(RemoveRouteTableRulesRequest request) throws JdcloudSdkException {
        return new RemoveRouteTableRulesExecutor().client(this).execute(request);
    }

    /**
     * 给网卡删除secondaryIp接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UnassignSecondaryIpsResponse unassignSecondaryIps(UnassignSecondaryIpsRequest request) throws JdcloudSdkException {
        return new UnassignSecondaryIpsExecutor().client(this).execute(request);
    }

    /**
     * 删除私有网络
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) throws JdcloudSdkException {
        return new DeleteVpcExecutor().client(this).execute(request);
    }

    /**
     * 修改安全组属性
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyNetworkSecurityGroupResponse modifyNetworkSecurityGroup(ModifyNetworkSecurityGroupRequest request) throws JdcloudSdkException {
        return new ModifyNetworkSecurityGroupExecutor().client(this).execute(request);
    }

    /**
     * 查询子网信息详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSubnetResponse describeSubnet(DescribeSubnetRequest request) throws JdcloudSdkException {
        return new DescribeSubnetExecutor().client(this).execute(request);
    }

    /**
     * 修改路由表属性
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyRouteTableResponse modifyRouteTable(ModifyRouteTableRequest request) throws JdcloudSdkException {
        return new ModifyRouteTableExecutor().client(this).execute(request);
    }

    /**
     * 查询安全组信息详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeNetworkSecurityGroupResponse describeNetworkSecurityGroup(DescribeNetworkSecurityGroupRequest request) throws JdcloudSdkException {
        return new DescribeNetworkSecurityGroupExecutor().client(this).execute(request);
    }

    /**
     * 删除VpcPeering接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVpcPeeringResponse deleteVpcPeering(DeleteVpcPeeringRequest request) throws JdcloudSdkException {
        return new DeleteVpcPeeringExecutor().client(this).execute(request);
    }

    /**
     * 查询networkAcl资源详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeNetworkAclResponse describeNetworkAcl(DescribeNetworkAclRequest request) throws JdcloudSdkException {
        return new DescribeNetworkAclExecutor().client(this).execute(request);
    }

    /**
     * 查询弹性网卡列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeNetworkInterfacesResponse describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) throws JdcloudSdkException {
        return new DescribeNetworkInterfacesExecutor().client(this).execute(request);
    }

    /**
     * 查询私有网络列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) throws JdcloudSdkException {
        return new DescribeVpcsExecutor().client(this).execute(request);
    }

    /**
     * 查询VpcPeering资源详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeVpcPeeringResponse describeVpcPeering(DescribeVpcPeeringRequest request) throws JdcloudSdkException {
        return new DescribeVpcPeeringExecutor().client(this).execute(request);
    }

    /**
     * 查询配额信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeQuotaResponse describeQuota(DescribeQuotaRequest request) throws JdcloudSdkException {
        return new DescribeQuotaExecutor().client(this).execute(request);
    }

    /**
     * 给网卡解绑弹性Ip接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisassociateElasticIpResponse disassociateElasticIp(DisassociateElasticIpRequest request) throws JdcloudSdkException {
        return new DisassociateElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 创建私有网络
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVpcResponse createVpc(CreateVpcRequest request) throws JdcloudSdkException {
        return new CreateVpcExecutor().client(this).execute(request);
    }

    /**
     * 添加安全组规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddNetworkSecurityGroupRulesResponse addNetworkSecurityGroupRules(AddNetworkSecurityGroupRulesRequest request) throws JdcloudSdkException {
        return new AddNetworkSecurityGroupRulesExecutor().client(this).execute(request);
    }

    /**
     * 修改私有网络接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyVpcResponse modifyVpc(ModifyVpcRequest request) throws JdcloudSdkException {
        return new ModifyVpcExecutor().client(this).execute(request);
    }

    /**
     * 查询路由表信息详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRouteTableResponse describeRouteTable(DescribeRouteTableRequest request) throws JdcloudSdkException {
        return new DescribeRouteTableExecutor().client(this).execute(request);
    }

    /**
     * 修改networkAcl接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyNetworkAclRulesResponse modifyNetworkAclRules(ModifyNetworkAclRulesRequest request) throws JdcloudSdkException {
        return new ModifyNetworkAclRulesExecutor().client(this).execute(request);
    }

    /**
     * 修改弹性网卡接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyNetworkInterfaceResponse modifyNetworkInterface(ModifyNetworkInterfaceRequest request) throws JdcloudSdkException {
        return new ModifyNetworkInterfaceExecutor().client(this).execute(request);
    }

    /**
     * 删除弹性网卡接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteNetworkInterfaceResponse deleteNetworkInterface(DeleteNetworkInterfaceRequest request) throws JdcloudSdkException {
        return new DeleteNetworkInterfaceExecutor().client(this).execute(request);
    }

    /**
     * 查询弹性ip列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeElasticIpsResponse describeElasticIps(DescribeElasticIpsRequest request) throws JdcloudSdkException {
        return new DescribeElasticIpsExecutor().client(this).execute(request);
    }

    /**
     * 给网卡分配secondaryIp接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AssignSecondaryIpsResponse assignSecondaryIps(AssignSecondaryIpsRequest request) throws JdcloudSdkException {
        return new AssignSecondaryIpsExecutor().client(this).execute(request);
    }

    /**
     * 路由表绑定子网接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AssociateRouteTableResponse associateRouteTable(AssociateRouteTableRequest request) throws JdcloudSdkException {
        return new AssociateRouteTableExecutor().client(this).execute(request);
    }

    /**
     * 创建安全组
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateNetworkSecurityGroupResponse createNetworkSecurityGroup(CreateNetworkSecurityGroupRequest request) throws JdcloudSdkException {
        return new CreateNetworkSecurityGroupExecutor().client(this).execute(request);
    }

    /**
     * 修改弹性IP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyElasticIpResponse modifyElasticIp(ModifyElasticIpRequest request) throws JdcloudSdkException {
        return new ModifyElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 删除安全组
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteNetworkSecurityGroupResponse deleteNetworkSecurityGroup(DeleteNetworkSecurityGroupRequest request) throws JdcloudSdkException {
        return new DeleteNetworkSecurityGroupExecutor().client(this).execute(request);
    }

    /**
     * 创建子网
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) throws JdcloudSdkException {
        return new CreateSubnetExecutor().client(this).execute(request);
    }

    /**
     * 修改路由表规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyRouteTableRulesResponse modifyRouteTableRules(ModifyRouteTableRulesRequest request) throws JdcloudSdkException {
        return new ModifyRouteTableRulesExecutor().client(this).execute(request);
    }

    /**
     * 删除弹性Ip
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteElasticIpResponse deleteElasticIp(DeleteElasticIpRequest request) throws JdcloudSdkException {
        return new DeleteElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 给子网绑定networkAcl接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AssociateNetworkAclResponse associateNetworkAcl(AssociateNetworkAclRequest request) throws JdcloudSdkException {
        return new AssociateNetworkAclExecutor().client(this).execute(request);
    }

    /**
     * 查询弹性网卡信息详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeNetworkInterfaceResponse describeNetworkInterface(DescribeNetworkInterfaceRequest request) throws JdcloudSdkException {
        return new DescribeNetworkInterfaceExecutor().client(this).execute(request);
    }

    /**
     * 查询Vpc信息详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeVpcResponse describeVpc(DescribeVpcRequest request) throws JdcloudSdkException {
        return new DescribeVpcExecutor().client(this).execute(request);
    }

    /**
     * 查询VpcPeering资源列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeVpcPeeringsResponse describeVpcPeerings(DescribeVpcPeeringsRequest request) throws JdcloudSdkException {
        return new DescribeVpcPeeringsExecutor().client(this).execute(request);
    }

    /**
     * 查询安全组列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeNetworkSecurityGroupsResponse describeNetworkSecurityGroups(DescribeNetworkSecurityGroupsRequest request) throws JdcloudSdkException {
        return new DescribeNetworkSecurityGroupsExecutor().client(this).execute(request);
    }

    /**
     * 查询子网列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSubnetsResponse describeSubnets(DescribeSubnetsRequest request) throws JdcloudSdkException {
        return new DescribeSubnetsExecutor().client(this).execute(request);
    }

    /**
     * 创建VpcPeering接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVpcPeeringResponse createVpcPeering(CreateVpcPeeringRequest request) throws JdcloudSdkException {
        return new CreateVpcPeeringExecutor().client(this).execute(request);
    }

    /**
     * 修改VpcPeering接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyVpcPeeringResponse modifyVpcPeering(ModifyVpcPeeringRequest request) throws JdcloudSdkException {
        return new ModifyVpcPeeringExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public VpcClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private VpcClient vpcClient;

        public DefaultBuilder() {
            vpcClient = new VpcClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            vpcClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            vpcClient.httpRequestConfig = config;
            return this;
        }

        public VpcClient build() throws JdcloudSdkException {

            if (vpcClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                vpcClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (vpcClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("VpcClient build error: jdcloud credentials provider not set");
                }
            }
            if (vpcClient.httpRequestConfig == null) {
                vpcClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (vpcClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("VpcClient build error: http request config not set");
                }
            }
            return vpcClient;
        }

        public Builder environment(Environment environment) {
            vpcClient.environment = environment;
            return this;
        }
    }
}
