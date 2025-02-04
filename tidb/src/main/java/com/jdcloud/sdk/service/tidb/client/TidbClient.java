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
 * 分布式数据库TiDB
 * 分布式数据库TiDB
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.tidb.model.CreateAccountRequest;
import com.jdcloud.sdk.service.tidb.model.CreateAccountResponse;
import com.jdcloud.sdk.service.tidb.client.CreateAccountExecutor;
import com.jdcloud.sdk.service.tidb.model.DeleteWhiteListGroupRequest;
import com.jdcloud.sdk.service.tidb.model.DeleteWhiteListGroupResponse;
import com.jdcloud.sdk.service.tidb.client.DeleteWhiteListGroupExecutor;
import com.jdcloud.sdk.service.tidb.model.UpgradeEngineVersionRequest;
import com.jdcloud.sdk.service.tidb.model.UpgradeEngineVersionResponse;
import com.jdcloud.sdk.service.tidb.client.UpgradeEngineVersionExecutor;
import com.jdcloud.sdk.service.tidb.model.ModifyInstanceNameRequest;
import com.jdcloud.sdk.service.tidb.model.ModifyInstanceNameResponse;
import com.jdcloud.sdk.service.tidb.client.ModifyInstanceNameExecutor;
import com.jdcloud.sdk.service.tidb.model.VerifyFilefromOSSRequest;
import com.jdcloud.sdk.service.tidb.model.VerifyFilefromOSSResponse;
import com.jdcloud.sdk.service.tidb.client.VerifyFilefromOSSExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeAvailableZonesRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeAvailableZonesResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeAvailableZonesExecutor;
import com.jdcloud.sdk.service.tidb.model.CreateBackupRequest;
import com.jdcloud.sdk.service.tidb.model.CreateBackupResponse;
import com.jdcloud.sdk.service.tidb.client.CreateBackupExecutor;
import com.jdcloud.sdk.service.tidb.model.ModifyBackupPolicyRequest;
import com.jdcloud.sdk.service.tidb.model.ModifyBackupPolicyResponse;
import com.jdcloud.sdk.service.tidb.client.ModifyBackupPolicyExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeBackupsRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeBackupsResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeBackupsExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeDataMigrationRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeDataMigrationResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeDataMigrationExecutor;
import com.jdcloud.sdk.service.tidb.model.DeleteInstanceRequest;
import com.jdcloud.sdk.service.tidb.model.DeleteInstanceResponse;
import com.jdcloud.sdk.service.tidb.client.DeleteInstanceExecutor;
import com.jdcloud.sdk.service.tidb.model.ModifyParametersRequest;
import com.jdcloud.sdk.service.tidb.model.ModifyParametersResponse;
import com.jdcloud.sdk.service.tidb.client.ModifyParametersExecutor;
import com.jdcloud.sdk.service.tidb.model.CreateDataMigrationRequest;
import com.jdcloud.sdk.service.tidb.model.CreateDataMigrationResponse;
import com.jdcloud.sdk.service.tidb.client.CreateDataMigrationExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeInstancesRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeInstancesResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeInstancesExecutor;
import com.jdcloud.sdk.service.tidb.model.AddWhiteListGroupRequest;
import com.jdcloud.sdk.service.tidb.model.AddWhiteListGroupResponse;
import com.jdcloud.sdk.service.tidb.client.AddWhiteListGroupExecutor;
import com.jdcloud.sdk.service.tidb.model.ModifyNodeNumRequest;
import com.jdcloud.sdk.service.tidb.model.ModifyNodeNumResponse;
import com.jdcloud.sdk.service.tidb.client.ModifyNodeNumExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeParametersRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeParametersResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeParametersExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeAccountsRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeAccountsResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeAccountsExecutor;
import com.jdcloud.sdk.service.tidb.model.CreateInstanceFromBackupRequest;
import com.jdcloud.sdk.service.tidb.model.CreateInstanceFromBackupResponse;
import com.jdcloud.sdk.service.tidb.client.CreateInstanceFromBackupExecutor;
import com.jdcloud.sdk.service.tidb.model.ModifyInstanceSpecRequest;
import com.jdcloud.sdk.service.tidb.model.ModifyInstanceSpecResponse;
import com.jdcloud.sdk.service.tidb.client.ModifyInstanceSpecExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeWhiteListRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeWhiteListResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeWhiteListExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeVersionsRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeVersionsResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeVersionsExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeInstanceClassesRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeInstanceClassesResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeInstanceClassesExecutor;
import com.jdcloud.sdk.service.tidb.model.ModifyWhiteListRequest;
import com.jdcloud.sdk.service.tidb.model.ModifyWhiteListResponse;
import com.jdcloud.sdk.service.tidb.client.ModifyWhiteListExecutor;
import com.jdcloud.sdk.service.tidb.model.ResetPasswordRequest;
import com.jdcloud.sdk.service.tidb.model.ResetPasswordResponse;
import com.jdcloud.sdk.service.tidb.client.ResetPasswordExecutor;
import com.jdcloud.sdk.service.tidb.model.RebootPodRequest;
import com.jdcloud.sdk.service.tidb.model.RebootPodResponse;
import com.jdcloud.sdk.service.tidb.client.RebootPodExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeBackupPolicyRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeBackupPolicyResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeBackupPolicyExecutor;
import com.jdcloud.sdk.service.tidb.model.CreateInstanceRequest;
import com.jdcloud.sdk.service.tidb.model.CreateInstanceResponse;
import com.jdcloud.sdk.service.tidb.client.CreateInstanceExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeOrderableInstanceTypeRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeOrderableInstanceTypeResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeOrderableInstanceTypeExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeNodesRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeNodesResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeNodesExecutor;
import com.jdcloud.sdk.service.tidb.model.DeleteBackupRequest;
import com.jdcloud.sdk.service.tidb.model.DeleteBackupResponse;
import com.jdcloud.sdk.service.tidb.client.DeleteBackupExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeInstanceAttributesRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeInstanceAttributesResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeInstanceAttributesExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeUpgradePlanRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeUpgradePlanResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeUpgradePlanExecutor;
import com.jdcloud.sdk.service.tidb.model.DescribeUpgradeVersionsRequest;
import com.jdcloud.sdk.service.tidb.model.DescribeUpgradeVersionsResponse;
import com.jdcloud.sdk.service.tidb.client.DescribeUpgradeVersionsExecutor;

/**
 * tidbClient
 */
public class TidbClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.8";
    public final static String DefaultEndpoint = "tidb.jdcloud-api.com";
    public final static String ServiceName = "tidb";
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

    private TidbClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 创建数据库账号，用户可以使用客户端，应用程序等通过该账号和密码登录数据库实例。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateAccountResponse createAccount(CreateAccountRequest request) throws JdcloudSdkException {
        return new CreateAccountExecutor().client(this).execute(request);
    }

    /**
     * 删除白名单分组。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteWhiteListGroupResponse deleteWhiteListGroup(DeleteWhiteListGroupRequest request) throws JdcloudSdkException {
        return new DeleteWhiteListGroupExecutor().client(this).execute(request);
    }

    /**
     * 升级TiDB引擎版本，例如从4.0.6 升级到4.0.8. 目前支持小版本的升级，可升级到平台支持的最新的小版本
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpgradeEngineVersionResponse upgradeEngineVersion(UpgradeEngineVersionRequest request) throws JdcloudSdkException {
        return new UpgradeEngineVersionExecutor().client(this).execute(request);
    }

    /**
     * 修改实例名称，可支持中文，实例名的具体规则可参见帮助中心文档
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceNameResponse modifyInstanceName(ModifyInstanceNameRequest request) throws JdcloudSdkException {
        return new ModifyInstanceNameExecutor().client(this).execute(request);
    }

    /**
     * 校验需要导入的备份文件在OSS上是否存在，需要的读取权限是否具备
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public VerifyFilefromOSSResponse verifyFilefromOSS(VerifyFilefromOSSRequest request) throws JdcloudSdkException {
        return new VerifyFilefromOSSExecutor().client(this).execute(request);
    }

    /**
     * 获取可用区
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAvailableZonesResponse describeAvailableZones(DescribeAvailableZonesRequest request) throws JdcloudSdkException {
        return new DescribeAvailableZonesExecutor().client(this).execute(request);
    }

    /**
     * 创建一个实例全量备份，可以对整个实例所有的数据库进行全量备份。同一时间点，只能有一个正在运行的备份任务
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateBackupResponse createBackup(CreateBackupRequest request) throws JdcloudSdkException {
        return new CreateBackupExecutor().client(this).execute(request);
    }

    /**
     * 修改TiDB实例备份策略。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws JdcloudSdkException {
        return new ModifyBackupPolicyExecutor().client(this).execute(request);
    }

    /**
     * 查看该实例下所有备份的详细信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws JdcloudSdkException {
        return new DescribeBackupsExecutor().client(this).execute(request);
    }

    /**
     * 查询 TiDB 数据迁移任务的信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDataMigrationResponse describeDataMigration(DescribeDataMigrationRequest request) throws JdcloudSdkException {
        return new DescribeDataMigrationExecutor().client(this).execute(request);
    }

    /**
     * 删除一个TiDB实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws JdcloudSdkException {
        return new DeleteInstanceExecutor().client(this).execute(request);
    }

    /**
     * 修改TiDB实例的配置参数。部分参数修改后，需要重启才能生效，具体可以参考PingCAP的相关文档
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyParametersResponse modifyParameters(ModifyParametersRequest request) throws JdcloudSdkException {
        return new ModifyParametersExecutor().client(this).execute(request);
    }

    /**
     * 查询 TiDB 数据迁移任务的信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateDataMigrationResponse createDataMigration(CreateDataMigrationRequest request) throws JdcloudSdkException {
        return new CreateDataMigrationExecutor().client(this).execute(request);
    }

    /**
     * 查询实例列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws JdcloudSdkException {
        return new DescribeInstancesExecutor().client(this).execute(request);
    }

    /**
     * 增加白名单分组。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddWhiteListGroupResponse addWhiteListGroup(AddWhiteListGroupRequest request) throws JdcloudSdkException {
        return new AddWhiteListGroupExecutor().client(this).execute(request);
    }

    /**
     * 增加实例的节点数量。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyNodeNumResponse modifyNodeNum(ModifyNodeNumRequest request) throws JdcloudSdkException {
        return new ModifyNodeNumExecutor().client(this).execute(request);
    }

    /**
     * 查看TiDB实例的配置参数
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeParametersResponse describeParameters(DescribeParametersRequest request) throws JdcloudSdkException {
        return new DescribeParametersExecutor().client(this).execute(request);
    }

    /**
     * 查看某个实例下的账号信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws JdcloudSdkException {
        return new DescribeAccountsExecutor().client(this).execute(request);
    }

    /**
     * 根据源实例全量备份创建一个新实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateInstanceFromBackupResponse createInstanceFromBackup(CreateInstanceFromBackupRequest request) throws JdcloudSdkException {
        return new CreateInstanceFromBackupExecutor().client(this).execute(request);
    }

    /**
     * 修改实例规格，包含节点的水平扩容与垂直扩容
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceSpecResponse modifyInstanceSpec(ModifyInstanceSpecRequest request) throws JdcloudSdkException {
        return new ModifyInstanceSpecExecutor().client(this).execute(request);
    }

    /**
     * 查看实例当前白名单。白名单是允许访问当前实例的IP/IP段列表，缺省情况下，白名单对本VPC开放。如果用户开启了外网访问的功能，还需要对外网的IP配置白名单。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeWhiteListResponse describeWhiteList(DescribeWhiteListRequest request) throws JdcloudSdkException {
        return new DescribeWhiteListExecutor().client(this).execute(request);
    }

    /**
     * 获取TiDB产品提供的所有版本
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeVersionsResponse describeVersions(DescribeVersionsRequest request) throws JdcloudSdkException {
        return new DescribeVersionsExecutor().client(this).execute(request);
    }

    /**
     * 规格获取接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceClassesResponse describeInstanceClasses(DescribeInstanceClassesRequest request) throws JdcloudSdkException {
        return new DescribeInstanceClassesExecutor().client(this).execute(request);
    }

    /**
     * 修改允许访问实例的IP白名单。白名单是允许访问当前实例的IP/IP段列表，缺省情况下，白名单对本VPC开放。如果用户开启了外网访问的功能，还需要对外网的IP配置白名单。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyWhiteListResponse modifyWhiteList(ModifyWhiteListRequest request) throws JdcloudSdkException {
        return new ModifyWhiteListExecutor().client(this).execute(request);
    }

    /**
     * 创建数据库账号，用户可以使用客户端，应用程序等通过该账号和密码登录RDS数据库实例。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) throws JdcloudSdkException {
        return new ResetPasswordExecutor().client(this).execute(request);
    }

    /**
     * 重启实例的pod
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RebootPodResponse rebootPod(RebootPodRequest request) throws JdcloudSdkException {
        return new RebootPodExecutor().client(this).execute(request);
    }

    /**
     * 查看实例当前的备份备份策略。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws JdcloudSdkException {
        return new DescribeBackupPolicyExecutor().client(this).execute(request);
    }

    /**
     * 创建一个TiDB实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws JdcloudSdkException {
        return new CreateInstanceExecutor().client(this).execute(request);
    }

    /**
     * 获取当前用户售罄信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeOrderableInstanceTypeResponse describeOrderableInstanceType(DescribeOrderableInstanceTypeRequest request) throws JdcloudSdkException {
        return new DescribeOrderableInstanceTypeExecutor().client(this).execute(request);
    }

    /**
     * 获取某个实例下的节点信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeNodesResponse describeNodes(DescribeNodesRequest request) throws JdcloudSdkException {
        return new DescribeNodesExecutor().client(this).execute(request);
    }

    /**
     * 删除TiDB的备份，仅允许删除用户生成的备份，系统自动备份不允许删除。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) throws JdcloudSdkException {
        return new DeleteBackupExecutor().client(this).execute(request);
    }

    /**
     * 查询 TiDB 实例的详细信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceAttributesResponse describeInstanceAttributes(DescribeInstanceAttributesRequest request) throws JdcloudSdkException {
        return new DescribeInstanceAttributesExecutor().client(this).execute(request);
    }

    /**
     * 查询TiDB数据库的升级计划
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeUpgradePlanResponse describeUpgradePlan(DescribeUpgradePlanRequest request) throws JdcloudSdkException {
        return new DescribeUpgradePlanExecutor().client(this).execute(request);
    }

    /**
     * 获取TiDB数据库可升级到的版本
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeUpgradeVersionsResponse describeUpgradeVersions(DescribeUpgradeVersionsRequest request) throws JdcloudSdkException {
        return new DescribeUpgradeVersionsExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public TidbClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private TidbClient tidbClient;

        public DefaultBuilder() {
            tidbClient = new TidbClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            tidbClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            tidbClient.httpRequestConfig = config;
            return this;
        }

        public TidbClient build() throws JdcloudSdkException {

            if (tidbClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                tidbClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (tidbClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("TidbClient build error: jdcloud credentials provider not set");
                }
            }
            if (tidbClient.httpRequestConfig == null) {
                tidbClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (tidbClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("TidbClient build error: http request config not set");
                }
            }
            return tidbClient;
        }

        public Builder environment(Environment environment) {
            tidbClient.environment = environment;
            return this;
        }
    }
}
