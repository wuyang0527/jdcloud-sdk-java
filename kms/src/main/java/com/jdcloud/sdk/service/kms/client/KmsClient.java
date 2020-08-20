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
 * 密钥管理服务
 * 基于硬件保护密钥的安全数据托管服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kms.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.kms.model.GetPublicKeyRequest;
import com.jdcloud.sdk.service.kms.model.GetPublicKeyResponse;
import com.jdcloud.sdk.service.kms.client.GetPublicKeyExecutor;
import com.jdcloud.sdk.service.kms.model.DescribeKeyListRequest;
import com.jdcloud.sdk.service.kms.model.DescribeKeyListResponse;
import com.jdcloud.sdk.service.kms.client.DescribeKeyListExecutor;
import com.jdcloud.sdk.service.kms.model.UpdateSecretVersionRequest;
import com.jdcloud.sdk.service.kms.model.UpdateSecretVersionResponse;
import com.jdcloud.sdk.service.kms.client.UpdateSecretVersionExecutor;
import com.jdcloud.sdk.service.kms.model.GenerateDataKeyRequest;
import com.jdcloud.sdk.service.kms.model.GenerateDataKeyResponse;
import com.jdcloud.sdk.service.kms.client.GenerateDataKeyExecutor;
import com.jdcloud.sdk.service.kms.model.EnableKeyVersionRequest;
import com.jdcloud.sdk.service.kms.model.EnableKeyVersionResponse;
import com.jdcloud.sdk.service.kms.client.EnableKeyVersionExecutor;
import com.jdcloud.sdk.service.kms.model.CreateSecretRequest;
import com.jdcloud.sdk.service.kms.model.CreateSecretResponse;
import com.jdcloud.sdk.service.kms.client.CreateSecretExecutor;
import com.jdcloud.sdk.service.kms.model.EncryptRequest;
import com.jdcloud.sdk.service.kms.model.EncryptResponse;
import com.jdcloud.sdk.service.kms.client.EncryptExecutor;
import com.jdcloud.sdk.service.kms.model.EnableKeyRequest;
import com.jdcloud.sdk.service.kms.model.EnableKeyResponse;
import com.jdcloud.sdk.service.kms.client.EnableKeyExecutor;
import com.jdcloud.sdk.service.kms.model.CancelKeyDeletionRequest;
import com.jdcloud.sdk.service.kms.model.CancelKeyDeletionResponse;
import com.jdcloud.sdk.service.kms.client.CancelKeyDeletionExecutor;
import com.jdcloud.sdk.service.kms.model.DeleteSecretRequest;
import com.jdcloud.sdk.service.kms.model.DeleteSecretResponse;
import com.jdcloud.sdk.service.kms.client.DeleteSecretExecutor;
import com.jdcloud.sdk.service.kms.model.DisableSecretRequest;
import com.jdcloud.sdk.service.kms.model.DisableSecretResponse;
import com.jdcloud.sdk.service.kms.client.DisableSecretExecutor;
import com.jdcloud.sdk.service.kms.model.DisableSecretVersionRequest;
import com.jdcloud.sdk.service.kms.model.DisableSecretVersionResponse;
import com.jdcloud.sdk.service.kms.client.DisableSecretVersionExecutor;
import com.jdcloud.sdk.service.kms.model.CreateKeyRequest;
import com.jdcloud.sdk.service.kms.model.CreateKeyResponse;
import com.jdcloud.sdk.service.kms.client.CreateKeyExecutor;
import com.jdcloud.sdk.service.kms.model.UpdateKeyDescriptionRequest;
import com.jdcloud.sdk.service.kms.model.UpdateKeyDescriptionResponse;
import com.jdcloud.sdk.service.kms.client.UpdateKeyDescriptionExecutor;
import com.jdcloud.sdk.service.kms.model.SignRequest;
import com.jdcloud.sdk.service.kms.model.SignResponse;
import com.jdcloud.sdk.service.kms.client.SignExecutor;
import com.jdcloud.sdk.service.kms.model.DescribeSecretVersionListRequest;
import com.jdcloud.sdk.service.kms.model.DescribeSecretVersionListResponse;
import com.jdcloud.sdk.service.kms.client.DescribeSecretVersionListExecutor;
import com.jdcloud.sdk.service.kms.model.ValidateRequest;
import com.jdcloud.sdk.service.kms.model.ValidateResponse;
import com.jdcloud.sdk.service.kms.client.ValidateExecutor;
import com.jdcloud.sdk.service.kms.model.ExportSecretRequest;
import com.jdcloud.sdk.service.kms.model.ExportSecretResponse;
import com.jdcloud.sdk.service.kms.client.ExportSecretExecutor;
import com.jdcloud.sdk.service.kms.model.DeleteSecretVersionRequest;
import com.jdcloud.sdk.service.kms.model.DeleteSecretVersionResponse;
import com.jdcloud.sdk.service.kms.client.DeleteSecretVersionExecutor;
import com.jdcloud.sdk.service.kms.model.DescribeKeyRequest;
import com.jdcloud.sdk.service.kms.model.DescribeKeyResponse;
import com.jdcloud.sdk.service.kms.client.DescribeKeyExecutor;
import com.jdcloud.sdk.service.kms.model.ImportSecretRequest;
import com.jdcloud.sdk.service.kms.model.ImportSecretResponse;
import com.jdcloud.sdk.service.kms.client.ImportSecretExecutor;
import com.jdcloud.sdk.service.kms.model.ScheduleKeyDeletionRequest;
import com.jdcloud.sdk.service.kms.model.ScheduleKeyDeletionResponse;
import com.jdcloud.sdk.service.kms.client.ScheduleKeyDeletionExecutor;
import com.jdcloud.sdk.service.kms.model.KeyRotationRequest;
import com.jdcloud.sdk.service.kms.model.KeyRotationResponse;
import com.jdcloud.sdk.service.kms.client.KeyRotationExecutor;
import com.jdcloud.sdk.service.kms.model.DescribeSecretListRequest;
import com.jdcloud.sdk.service.kms.model.DescribeSecretListResponse;
import com.jdcloud.sdk.service.kms.client.DescribeSecretListExecutor;
import com.jdcloud.sdk.service.kms.model.DescribeSecretVersionInfoRequest;
import com.jdcloud.sdk.service.kms.model.DescribeSecretVersionInfoResponse;
import com.jdcloud.sdk.service.kms.client.DescribeSecretVersionInfoExecutor;
import com.jdcloud.sdk.service.kms.model.DisableKeyVersionRequest;
import com.jdcloud.sdk.service.kms.model.DisableKeyVersionResponse;
import com.jdcloud.sdk.service.kms.client.DisableKeyVersionExecutor;
import com.jdcloud.sdk.service.kms.model.DecryptRequest;
import com.jdcloud.sdk.service.kms.model.DecryptResponse;
import com.jdcloud.sdk.service.kms.client.DecryptExecutor;
import com.jdcloud.sdk.service.kms.model.EnableSecretRequest;
import com.jdcloud.sdk.service.kms.model.EnableSecretResponse;
import com.jdcloud.sdk.service.kms.client.EnableSecretExecutor;
import com.jdcloud.sdk.service.kms.model.DisableKeyRequest;
import com.jdcloud.sdk.service.kms.model.DisableKeyResponse;
import com.jdcloud.sdk.service.kms.client.DisableKeyExecutor;
import com.jdcloud.sdk.service.kms.model.EnableSecretVersionRequest;
import com.jdcloud.sdk.service.kms.model.EnableSecretVersionResponse;
import com.jdcloud.sdk.service.kms.client.EnableSecretVersionExecutor;
import com.jdcloud.sdk.service.kms.model.ScheduleKeyVersionDeletionRequest;
import com.jdcloud.sdk.service.kms.model.ScheduleKeyVersionDeletionResponse;
import com.jdcloud.sdk.service.kms.client.ScheduleKeyVersionDeletionExecutor;
import com.jdcloud.sdk.service.kms.model.DescribeKeyDetailRequest;
import com.jdcloud.sdk.service.kms.model.DescribeKeyDetailResponse;
import com.jdcloud.sdk.service.kms.client.DescribeKeyDetailExecutor;
import com.jdcloud.sdk.service.kms.model.CreateSecretVersionRequest;
import com.jdcloud.sdk.service.kms.model.CreateSecretVersionResponse;
import com.jdcloud.sdk.service.kms.client.CreateSecretVersionExecutor;
import com.jdcloud.sdk.service.kms.model.UpdateSecretRequest;
import com.jdcloud.sdk.service.kms.model.UpdateSecretResponse;
import com.jdcloud.sdk.service.kms.client.UpdateSecretExecutor;
import com.jdcloud.sdk.service.kms.model.CancelKeyVersionDeletionRequest;
import com.jdcloud.sdk.service.kms.model.CancelKeyVersionDeletionResponse;
import com.jdcloud.sdk.service.kms.client.CancelKeyVersionDeletionExecutor;

/**
 * kmsClient
 */
public class KmsClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.3";
    public final static String DefaultEndpoint = "kms.jdcloud-api.com";
    public final static String ServiceName = "kms";
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

    private KmsClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 获取非对称密钥的公钥
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetPublicKeyResponse getPublicKey(GetPublicKeyRequest request) throws JdcloudSdkException {
        return new GetPublicKeyExecutor().client(this).execute(request);
    }

    /**
     * 获取密钥列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeKeyListResponse describeKeyList(DescribeKeyListRequest request) throws JdcloudSdkException {
        return new DescribeKeyListExecutor().client(this).execute(request);
    }

    /**
     * 修改机密指定版本配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateSecretVersionResponse updateSecretVersion(UpdateSecretVersionRequest request) throws JdcloudSdkException {
        return new UpdateSecretVersionExecutor().client(this).execute(request);
    }

    /**
     * 从KMS中获取一对数据密钥的明文/密文
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GenerateDataKeyResponse generateDataKey(GenerateDataKeyRequest request) throws JdcloudSdkException {
        return new GenerateDataKeyExecutor().client(this).execute(request);
    }

    /**
     * 启用指定版本密钥
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableKeyVersionResponse enableKeyVersion(EnableKeyVersionRequest request) throws JdcloudSdkException {
        return new EnableKeyVersionExecutor().client(this).execute(request);
    }

    /**
     * 创建机密
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) throws JdcloudSdkException {
        return new CreateSecretExecutor().client(this).execute(request);
    }

    /**
     * 使用密钥对数据进行加密，针对非对称密钥：使用公钥进行加密，仅支持RSA_PKCS1_PADDING填充方式，最大加密数据长度为245字节
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EncryptResponse encrypt(EncryptRequest request) throws JdcloudSdkException {
        return new EncryptExecutor().client(this).execute(request);
    }

    /**
     * 启用当前状态为&#x60;已禁用&#x60;的密钥
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableKeyResponse enableKey(EnableKeyRequest request) throws JdcloudSdkException {
        return new EnableKeyExecutor().client(this).execute(request);
    }

    /**
     * 取消删除密钥
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request) throws JdcloudSdkException {
        return new CancelKeyDeletionExecutor().client(this).execute(request);
    }

    /**
     * 删除机密
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) throws JdcloudSdkException {
        return new DeleteSecretExecutor().client(this).execute(request);
    }

    /**
     * 禁用机密
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableSecretResponse disableSecret(DisableSecretRequest request) throws JdcloudSdkException {
        return new DisableSecretExecutor().client(this).execute(request);
    }

    /**
     * 禁用指定版本机密
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableSecretVersionResponse disableSecretVersion(DisableSecretVersionRequest request) throws JdcloudSdkException {
        return new DisableSecretVersionExecutor().client(this).execute(request);
    }

    /**
     * 创建一个CMK（用户主密钥），默认为启用状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateKeyResponse createKey(CreateKeyRequest request) throws JdcloudSdkException {
        return new CreateKeyExecutor().client(this).execute(request);
    }

    /**
     * -   修改对称密钥配置，包括key的名称、用途、是否自动轮换和轮换周期等;
-   修改非对称密钥配置，包括key的名称、用途等。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateKeyDescriptionResponse updateKeyDescription(UpdateKeyDescriptionRequest request) throws JdcloudSdkException {
        return new UpdateKeyDescriptionExecutor().client(this).execute(request);
    }

    /**
     * 使用非对称密钥的私钥签名,签名算法仅支持RSA_PKCS1_PADDING填充方式,最大签名数据长度为4K字节
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SignResponse sign(SignRequest request) throws JdcloudSdkException {
        return new SignExecutor().client(this).execute(request);
    }

    /**
     * 获取机密详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSecretVersionListResponse describeSecretVersionList(DescribeSecretVersionListRequest request) throws JdcloudSdkException {
        return new DescribeSecretVersionListExecutor().client(this).execute(request);
    }

    /**
     * 使用非对称密钥的公钥验证签名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ValidateResponse validate(ValidateRequest request) throws JdcloudSdkException {
        return new ValidateExecutor().client(this).execute(request);
    }

    /**
     * 导出机密
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ExportSecretResponse exportSecret(ExportSecretRequest request) throws JdcloudSdkException {
        return new ExportSecretExecutor().client(this).execute(request);
    }

    /**
     * 删除指定版本机密
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteSecretVersionResponse deleteSecretVersion(DeleteSecretVersionRequest request) throws JdcloudSdkException {
        return new DeleteSecretVersionExecutor().client(this).execute(request);
    }

    /**
     * 获取密钥详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeKeyResponse describeKey(DescribeKeyRequest request) throws JdcloudSdkException {
        return new DescribeKeyExecutor().client(this).execute(request);
    }

    /**
     * 导入机密
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ImportSecretResponse importSecret(ImportSecretRequest request) throws JdcloudSdkException {
        return new ImportSecretExecutor().client(this).execute(request);
    }

    /**
     * 计划在以后的是个时间点删除密钥，默认为7天
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ScheduleKeyDeletionResponse scheduleKeyDeletion(ScheduleKeyDeletionRequest request) throws JdcloudSdkException {
        return new ScheduleKeyDeletionExecutor().client(this).execute(request);
    }

    /**
     * 立即轮换密钥，自动轮换周期顺延-支持对称密钥
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public KeyRotationResponse keyRotation(KeyRotationRequest request) throws JdcloudSdkException {
        return new KeyRotationExecutor().client(this).execute(request);
    }

    /**
     * 获取机密列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSecretListResponse describeSecretList(DescribeSecretListRequest request) throws JdcloudSdkException {
        return new DescribeSecretListExecutor().client(this).execute(request);
    }

    /**
     * 获取指定机密版本的详细信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSecretVersionInfoResponse describeSecretVersionInfo(DescribeSecretVersionInfoRequest request) throws JdcloudSdkException {
        return new DescribeSecretVersionInfoExecutor().client(this).execute(request);
    }

    /**
     * 禁用指定版本密钥
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableKeyVersionResponse disableKeyVersion(DisableKeyVersionRequest request) throws JdcloudSdkException {
        return new DisableKeyVersionExecutor().client(this).execute(request);
    }

    /**
     * 使用密钥对数据进行解密，针对非对称密钥：使用私钥进行加密
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DecryptResponse decrypt(DecryptRequest request) throws JdcloudSdkException {
        return new DecryptExecutor().client(this).execute(request);
    }

    /**
     * 启用机密
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableSecretResponse enableSecret(EnableSecretRequest request) throws JdcloudSdkException {
        return new EnableSecretExecutor().client(this).execute(request);
    }

    /**
     * 禁用当前状态为&#x60;已启用&#x60;的密钥
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableKeyResponse disableKey(DisableKeyRequest request) throws JdcloudSdkException {
        return new DisableKeyExecutor().client(this).execute(request);
    }

    /**
     * 启用指定版本机密
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableSecretVersionResponse enableSecretVersion(EnableSecretVersionRequest request) throws JdcloudSdkException {
        return new EnableSecretVersionExecutor().client(this).execute(request);
    }

    /**
     * 计划在以后的是个时间点删除指定版本密钥，默认为7天
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ScheduleKeyVersionDeletionResponse scheduleKeyVersionDeletion(ScheduleKeyVersionDeletionRequest request) throws JdcloudSdkException {
        return new ScheduleKeyVersionDeletionExecutor().client(this).execute(request);
    }

    /**
     * 获取版本详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeKeyDetailResponse describeKeyDetail(DescribeKeyDetailRequest request) throws JdcloudSdkException {
        return new DescribeKeyDetailExecutor().client(this).execute(request);
    }

    /**
     * 创建机密新的版本，默认为已启用状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateSecretVersionResponse createSecretVersion(CreateSecretVersionRequest request) throws JdcloudSdkException {
        return new CreateSecretVersionExecutor().client(this).execute(request);
    }

    /**
     * 修改机密描述
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateSecretResponse updateSecret(UpdateSecretRequest request) throws JdcloudSdkException {
        return new UpdateSecretExecutor().client(this).execute(request);
    }

    /**
     * 取消删除指定版本密钥
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CancelKeyVersionDeletionResponse cancelKeyVersionDeletion(CancelKeyVersionDeletionRequest request) throws JdcloudSdkException {
        return new CancelKeyVersionDeletionExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public KmsClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private KmsClient kmsClient;

        public DefaultBuilder() {
            kmsClient = new KmsClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            kmsClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            kmsClient.httpRequestConfig = config;
            return this;
        }

        public KmsClient build() throws JdcloudSdkException {

            if (kmsClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                kmsClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (kmsClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("KmsClient build error: jdcloud credentials provider not set");
                }
            }
            if (kmsClient.httpRequestConfig == null) {
                kmsClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (kmsClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("KmsClient build error: http request config not set");
                }
            }
            return kmsClient;
        }

        public Builder environment(Environment environment) {
            kmsClient.environment = environment;
            return this;
        }
    }
}
