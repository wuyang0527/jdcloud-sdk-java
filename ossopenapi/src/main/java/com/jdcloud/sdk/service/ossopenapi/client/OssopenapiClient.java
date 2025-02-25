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
 * oss openapi
 * oss openapi
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.ossopenapi.model.GetSingleBucketCapacityRequest;
import com.jdcloud.sdk.service.ossopenapi.model.GetSingleBucketCapacityResponse;
import com.jdcloud.sdk.service.ossopenapi.client.GetSingleBucketCapacityExecutor;
import com.jdcloud.sdk.service.ossopenapi.model.ListHistoricalReplicatTasksRequest;
import com.jdcloud.sdk.service.ossopenapi.model.ListHistoricalReplicatTasksResponse;
import com.jdcloud.sdk.service.ossopenapi.client.ListHistoricalReplicatTasksExecutor;
import com.jdcloud.sdk.service.ossopenapi.model.GetHistoricalReplicatTaskRequest;
import com.jdcloud.sdk.service.ossopenapi.model.GetHistoricalReplicatTaskResponse;
import com.jdcloud.sdk.service.ossopenapi.client.GetHistoricalReplicatTaskExecutor;
import com.jdcloud.sdk.service.ossopenapi.model.OpenServiceRequest;
import com.jdcloud.sdk.service.ossopenapi.model.OpenServiceResponse;
import com.jdcloud.sdk.service.ossopenapi.client.OpenServiceExecutor;
import com.jdcloud.sdk.service.ossopenapi.model.DeleteBackSourceConfigurationRequest;
import com.jdcloud.sdk.service.ossopenapi.model.DeleteBackSourceConfigurationResponse;
import com.jdcloud.sdk.service.ossopenapi.client.DeleteBackSourceConfigurationExecutor;
import com.jdcloud.sdk.service.ossopenapi.model.AbortHistoricalReplicatTaskRequest;
import com.jdcloud.sdk.service.ossopenapi.model.AbortHistoricalReplicatTaskResponse;
import com.jdcloud.sdk.service.ossopenapi.client.AbortHistoricalReplicatTaskExecutor;
import com.jdcloud.sdk.service.ossopenapi.model.CreateHistoricalReplicatTaskRequest;
import com.jdcloud.sdk.service.ossopenapi.model.CreateHistoricalReplicatTaskResponse;
import com.jdcloud.sdk.service.ossopenapi.client.CreateHistoricalReplicatTaskExecutor;
import com.jdcloud.sdk.service.ossopenapi.model.GetBucketCapacityRequest;
import com.jdcloud.sdk.service.ossopenapi.model.GetBucketCapacityResponse;
import com.jdcloud.sdk.service.ossopenapi.client.GetBucketCapacityExecutor;
import com.jdcloud.sdk.service.ossopenapi.model.GetBackSourceConfigurationRequest;
import com.jdcloud.sdk.service.ossopenapi.model.GetBackSourceConfigurationResponse;
import com.jdcloud.sdk.service.ossopenapi.client.GetBackSourceConfigurationExecutor;
import com.jdcloud.sdk.service.ossopenapi.model.PutBackSourceConfigurationRequest;
import com.jdcloud.sdk.service.ossopenapi.model.PutBackSourceConfigurationResponse;
import com.jdcloud.sdk.service.ossopenapi.client.PutBackSourceConfigurationExecutor;

/**
 * ossopenapiClient
 */
public class OssopenapiClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.11";
    public final static String DefaultEndpoint = "ossopenapi.jdcloud-api.com";
    public final static String ServiceName = "ossopenapi";
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

    private OssopenapiClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 根据type获取指定bucket用量数据
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetSingleBucketCapacityResponse getSingleBucketCapacity(GetSingleBucketCapacityRequest request) throws JdcloudSdkException {
        return new GetSingleBucketCapacityExecutor().client(this).execute(request);
    }

    /**
     * 根据bucket名称获取该bucket下的同步任务列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListHistoricalReplicatTasksResponse listHistoricalReplicatTasks(ListHistoricalReplicatTasksRequest request) throws JdcloudSdkException {
        return new ListHistoricalReplicatTasksExecutor().client(this).execute(request);
    }

    /**
     * 根据bucket名称获取该bucket下的同步任务
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetHistoricalReplicatTaskResponse getHistoricalReplicatTask(GetHistoricalReplicatTaskRequest request) throws JdcloudSdkException {
        return new GetHistoricalReplicatTaskExecutor().client(this).execute(request);
    }

    /**
     * 开通对象存储服务
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public OpenServiceResponse openService(OpenServiceRequest request) throws JdcloudSdkException {
        return new OpenServiceExecutor().client(this).execute(request);
    }

    /**
     * 删除回源配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteBackSourceConfigurationResponse deleteBackSourceConfiguration(DeleteBackSourceConfigurationRequest request) throws JdcloudSdkException {
        return new DeleteBackSourceConfigurationExecutor().client(this).execute(request);
    }

    /**
     * 停止bucket名称获取该bucket下的同步任务
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AbortHistoricalReplicatTaskResponse abortHistoricalReplicatTask(AbortHistoricalReplicatTaskRequest request) throws JdcloudSdkException {
        return new AbortHistoricalReplicatTaskExecutor().client(this).execute(request);
    }

    /**
     * 创建历史同步任务
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateHistoricalReplicatTaskResponse createHistoricalReplicatTask(CreateHistoricalReplicatTaskRequest request) throws JdcloudSdkException {
        return new CreateHistoricalReplicatTaskExecutor().client(this).execute(request);
    }

    /**
     * 根据type获取bucket用量数据
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetBucketCapacityResponse getBucketCapacity(GetBucketCapacityRequest request) throws JdcloudSdkException {
        return new GetBucketCapacityExecutor().client(this).execute(request);
    }

    /**
     * 获取回源配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetBackSourceConfigurationResponse getBackSourceConfiguration(GetBackSourceConfigurationRequest request) throws JdcloudSdkException {
        return new GetBackSourceConfigurationExecutor().client(this).execute(request);
    }

    /**
     * 添加修改回源配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public PutBackSourceConfigurationResponse putBackSourceConfiguration(PutBackSourceConfigurationRequest request) throws JdcloudSdkException {
        return new PutBackSourceConfigurationExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public OssopenapiClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private OssopenapiClient ossopenapiClient;

        public DefaultBuilder() {
            ossopenapiClient = new OssopenapiClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            ossopenapiClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            ossopenapiClient.httpRequestConfig = config;
            return this;
        }

        public OssopenapiClient build() throws JdcloudSdkException {

            if (ossopenapiClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                ossopenapiClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (ossopenapiClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("OssopenapiClient build error: jdcloud credentials provider not set");
                }
            }
            if (ossopenapiClient.httpRequestConfig == null) {
                ossopenapiClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (ossopenapiClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("OssopenapiClient build error: http request config not set");
                }
            }
            return ossopenapiClient;
        }

        public Builder environment(Environment environment) {
            ossopenapiClient.environment = environment;
            return this;
        }
    }
}
