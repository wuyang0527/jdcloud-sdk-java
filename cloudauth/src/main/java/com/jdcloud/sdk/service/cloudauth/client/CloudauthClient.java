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
 * 京东云实人认证-OpenAPI接口
 * 京东云实人认证-OpenAPI接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudauth.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.cloudauth.model.QueryBankBranchListRequest;
import com.jdcloud.sdk.service.cloudauth.model.QueryBankBranchListResponse;
import com.jdcloud.sdk.service.cloudauth.client.QueryBankBranchListExecutor;
import com.jdcloud.sdk.service.cloudauth.model.DescribeApplyStatusRequest;
import com.jdcloud.sdk.service.cloudauth.model.DescribeApplyStatusResponse;
import com.jdcloud.sdk.service.cloudauth.client.DescribeApplyStatusExecutor;
import com.jdcloud.sdk.service.cloudauth.model.CheckLegalPersonRequest;
import com.jdcloud.sdk.service.cloudauth.model.CheckLegalPersonResponse;
import com.jdcloud.sdk.service.cloudauth.client.CheckLegalPersonExecutor;
import com.jdcloud.sdk.service.cloudauth.model.PersonalAuthRequest;
import com.jdcloud.sdk.service.cloudauth.model.PersonalAuthResponse;
import com.jdcloud.sdk.service.cloudauth.client.PersonalAuthExecutor;
import com.jdcloud.sdk.service.cloudauth.model.QueryBankListRequest;
import com.jdcloud.sdk.service.cloudauth.model.QueryBankListResponse;
import com.jdcloud.sdk.service.cloudauth.client.QueryBankListExecutor;
import com.jdcloud.sdk.service.cloudauth.model.CompanyTransferRequest;
import com.jdcloud.sdk.service.cloudauth.model.CompanyTransferResponse;
import com.jdcloud.sdk.service.cloudauth.client.CompanyTransferExecutor;
import com.jdcloud.sdk.service.cloudauth.model.CheckAgentRequest;
import com.jdcloud.sdk.service.cloudauth.model.CheckAgentResponse;
import com.jdcloud.sdk.service.cloudauth.client.CheckAgentExecutor;
import com.jdcloud.sdk.service.cloudauth.model.QueryCityListRequest;
import com.jdcloud.sdk.service.cloudauth.model.QueryCityListResponse;
import com.jdcloud.sdk.service.cloudauth.client.QueryCityListExecutor;
import com.jdcloud.sdk.service.cloudauth.model.CheckCompanyTransferRequest;
import com.jdcloud.sdk.service.cloudauth.model.CheckCompanyTransferResponse;
import com.jdcloud.sdk.service.cloudauth.client.CheckCompanyTransferExecutor;
import com.jdcloud.sdk.service.cloudauth.model.CheckCompanyInfoRequest;
import com.jdcloud.sdk.service.cloudauth.model.CheckCompanyInfoResponse;
import com.jdcloud.sdk.service.cloudauth.client.CheckCompanyInfoExecutor;
import com.jdcloud.sdk.service.cloudauth.model.CheckLegalPersonAndAgentRequest;
import com.jdcloud.sdk.service.cloudauth.model.CheckLegalPersonAndAgentResponse;
import com.jdcloud.sdk.service.cloudauth.client.CheckLegalPersonAndAgentExecutor;
import com.jdcloud.sdk.service.cloudauth.model.QueryProvinceListRequest;
import com.jdcloud.sdk.service.cloudauth.model.QueryProvinceListResponse;
import com.jdcloud.sdk.service.cloudauth.client.QueryProvinceListExecutor;

/**
 * cloudauthClient
 */
public class CloudauthClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.4";
    public final static String DefaultEndpoint = "cloudauth.jdcloud-api.com";
    public final static String ServiceName = "cloudauth";
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

    private CloudauthClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询城市下银行分行列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryBankBranchListResponse queryBankBranchList(QueryBankBranchListRequest request) throws JdcloudSdkException {
        return new QueryBankBranchListExecutor().client(this).execute(request);
    }

    /**
     * 查询服务开通状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeApplyStatusResponse describeApplyStatus(DescribeApplyStatusRequest request) throws JdcloudSdkException {
        return new DescribeApplyStatusExecutor().client(this).execute(request);
    }

    /**
     * 法人信息校验
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CheckLegalPersonResponse checkLegalPerson(CheckLegalPersonRequest request) throws JdcloudSdkException {
        return new CheckLegalPersonExecutor().client(this).execute(request);
    }

    /**
     * 个人实名认证
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public PersonalAuthResponse personalAuth(PersonalAuthRequest request) throws JdcloudSdkException {
        return new PersonalAuthExecutor().client(this).execute(request);
    }

    /**
     * 查询所有支持的银行
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryBankListResponse queryBankList(QueryBankListRequest request) throws JdcloudSdkException {
        return new QueryBankListExecutor().client(this).execute(request);
    }

    /**
     * 对公银行账户打款(随机小额)
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CompanyTransferResponse companyTransfer(CompanyTransferRequest request) throws JdcloudSdkException {
        return new CompanyTransferExecutor().client(this).execute(request);
    }

    /**
     * 代理人信息核验
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CheckAgentResponse checkAgent(CheckAgentRequest request) throws JdcloudSdkException {
        return new CheckAgentExecutor().client(this).execute(request);
    }

    /**
     * 查询省份下城市编码
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryCityListResponse queryCityList(QueryCityListRequest request) throws JdcloudSdkException {
        return new QueryCityListExecutor().client(this).execute(request);
    }

    /**
     * 对公打款查询
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CheckCompanyTransferResponse checkCompanyTransfer(CheckCompanyTransferRequest request) throws JdcloudSdkException {
        return new CheckCompanyTransferExecutor().client(this).execute(request);
    }

    /**
     * 企业基础信息核验
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CheckCompanyInfoResponse checkCompanyInfo(CheckCompanyInfoRequest request) throws JdcloudSdkException {
        return new CheckCompanyInfoExecutor().client(this).execute(request);
    }

    /**
     * 企业所有信息核验
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CheckLegalPersonAndAgentResponse checkLegalPersonAndAgent(CheckLegalPersonAndAgentRequest request) throws JdcloudSdkException {
        return new CheckLegalPersonAndAgentExecutor().client(this).execute(request);
    }

    /**
     * 查询所有省份列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryProvinceListResponse queryProvinceList(QueryProvinceListRequest request) throws JdcloudSdkException {
        return new QueryProvinceListExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public CloudauthClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private CloudauthClient cloudauthClient;

        public DefaultBuilder() {
            cloudauthClient = new CloudauthClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            cloudauthClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            cloudauthClient.httpRequestConfig = config;
            return this;
        }

        public CloudauthClient build() throws JdcloudSdkException {

            if (cloudauthClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                cloudauthClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (cloudauthClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("CloudauthClient build error: jdcloud credentials provider not set");
                }
            }
            if (cloudauthClient.httpRequestConfig == null) {
                cloudauthClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (cloudauthClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("CloudauthClient build error: http request config not set");
                }
            }
            return cloudauthClient;
        }

        public Builder environment(Environment environment) {
            cloudauthClient.environment = environment;
            return this;
        }
    }
}
