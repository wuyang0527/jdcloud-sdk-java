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
 * JCLOUD IoT Engine API
 * API related to IoT Engine
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotcore.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.iotcore.model.ListProductsWithAdminRequest;
import com.jdcloud.sdk.service.iotcore.model.ListProductsWithAdminResponse;
import com.jdcloud.sdk.service.iotcore.client.ListProductsWithAdminExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeEventListRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeEventListResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeEventListExecutor;
import com.jdcloud.sdk.service.iotcore.model.CollectorWriteMessageRequest;
import com.jdcloud.sdk.service.iotcore.model.CollectorWriteMessageResponse;
import com.jdcloud.sdk.service.iotcore.client.CollectorWriteMessageExecutor;
import com.jdcloud.sdk.service.iotcore.model.CreateDeviceTopoRequest;
import com.jdcloud.sdk.service.iotcore.model.CreateDeviceTopoResponse;
import com.jdcloud.sdk.service.iotcore.client.CreateDeviceTopoExecutor;
import com.jdcloud.sdk.service.iotcore.model.InvokeThingServiceRequest;
import com.jdcloud.sdk.service.iotcore.model.InvokeThingServiceResponse;
import com.jdcloud.sdk.service.iotcore.client.InvokeThingServiceExecutor;
import com.jdcloud.sdk.service.iotcore.model.DeleteProductWithAdminRequest;
import com.jdcloud.sdk.service.iotcore.model.DeleteProductWithAdminResponse;
import com.jdcloud.sdk.service.iotcore.client.DeleteProductWithAdminExecutor;
import com.jdcloud.sdk.service.iotcore.model.ListProductsRequest;
import com.jdcloud.sdk.service.iotcore.model.ListProductsResponse;
import com.jdcloud.sdk.service.iotcore.client.ListProductsExecutor;
import com.jdcloud.sdk.service.iotcore.model.RegisterDeviceRequest;
import com.jdcloud.sdk.service.iotcore.model.RegisterDeviceResponse;
import com.jdcloud.sdk.service.iotcore.client.RegisterDeviceExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeDeviceRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeDeviceResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeDeviceExecutor;
import com.jdcloud.sdk.service.iotcore.model.UpdateProductRequest;
import com.jdcloud.sdk.service.iotcore.model.UpdateProductResponse;
import com.jdcloud.sdk.service.iotcore.client.UpdateProductExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribePropertySnapshotRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribePropertySnapshotResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribePropertySnapshotExecutor;
import com.jdcloud.sdk.service.iotcore.model.InvokeFunctionRequest;
import com.jdcloud.sdk.service.iotcore.model.InvokeFunctionResponse;
import com.jdcloud.sdk.service.iotcore.client.InvokeFunctionExecutor;
import com.jdcloud.sdk.service.iotcore.model.UpdateThingShadowRequest;
import com.jdcloud.sdk.service.iotcore.model.UpdateThingShadowResponse;
import com.jdcloud.sdk.service.iotcore.client.UpdateThingShadowExecutor;
import com.jdcloud.sdk.service.iotcore.model.DeleteProductRequest;
import com.jdcloud.sdk.service.iotcore.model.DeleteProductResponse;
import com.jdcloud.sdk.service.iotcore.client.DeleteProductExecutor;
import com.jdcloud.sdk.service.iotcore.model.ReadHoldingRegistersRequest;
import com.jdcloud.sdk.service.iotcore.model.ReadHoldingRegistersResponse;
import com.jdcloud.sdk.service.iotcore.client.ReadHoldingRegistersExecutor;
import com.jdcloud.sdk.service.iotcore.model.CollectorReadMessageRequest;
import com.jdcloud.sdk.service.iotcore.model.CollectorReadMessageResponse;
import com.jdcloud.sdk.service.iotcore.client.CollectorReadMessageExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeThingShadowRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeThingShadowResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeThingShadowExecutor;
import com.jdcloud.sdk.service.iotcore.model.DeleteDeviceTopoRequest;
import com.jdcloud.sdk.service.iotcore.model.DeleteDeviceTopoResponse;
import com.jdcloud.sdk.service.iotcore.client.DeleteDeviceTopoExecutor;
import com.jdcloud.sdk.service.iotcore.model.DownloadDeviceCertificateRequest;
import com.jdcloud.sdk.service.iotcore.model.DownloadDeviceCertificateResponse;
import com.jdcloud.sdk.service.iotcore.client.DownloadDeviceCertificateExecutor;
import com.jdcloud.sdk.service.iotcore.model.ExportThingModelRequest;
import com.jdcloud.sdk.service.iotcore.model.ExportThingModelResponse;
import com.jdcloud.sdk.service.iotcore.client.ExportThingModelExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeDeviceTopoRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeDeviceTopoResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeDeviceTopoExecutor;
import com.jdcloud.sdk.service.iotcore.model.LoongrayQueryPageRequest;
import com.jdcloud.sdk.service.iotcore.model.LoongrayQueryPageResponse;
import com.jdcloud.sdk.service.iotcore.client.LoongrayQueryPageExecutor;
import com.jdcloud.sdk.service.iotcore.model.UpdateProductWithAdminRequest;
import com.jdcloud.sdk.service.iotcore.model.UpdateProductWithAdminResponse;
import com.jdcloud.sdk.service.iotcore.client.UpdateProductWithAdminExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeProductRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeProductResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeProductExecutor;
import com.jdcloud.sdk.service.iotcore.model.UpdateDeviceRequest;
import com.jdcloud.sdk.service.iotcore.model.UpdateDeviceResponse;
import com.jdcloud.sdk.service.iotcore.client.UpdateDeviceExecutor;
import com.jdcloud.sdk.service.iotcore.model.AddLooDeviceRequest;
import com.jdcloud.sdk.service.iotcore.model.AddLooDeviceResponse;
import com.jdcloud.sdk.service.iotcore.client.AddLooDeviceExecutor;
import com.jdcloud.sdk.service.iotcore.model.ImportThingModelRequest;
import com.jdcloud.sdk.service.iotcore.model.ImportThingModelResponse;
import com.jdcloud.sdk.service.iotcore.client.ImportThingModelExecutor;
import com.jdcloud.sdk.service.iotcore.model.AddDeviceLinksRequest;
import com.jdcloud.sdk.service.iotcore.model.AddDeviceLinksResponse;
import com.jdcloud.sdk.service.iotcore.client.AddDeviceLinksExecutor;
import com.jdcloud.sdk.service.iotcore.model.AddDeviceRequest;
import com.jdcloud.sdk.service.iotcore.model.AddDeviceResponse;
import com.jdcloud.sdk.service.iotcore.client.AddDeviceExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeProductTopicsRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeProductTopicsResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeProductTopicsExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeFunctionListRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeFunctionListResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeFunctionListExecutor;
import com.jdcloud.sdk.service.iotcore.model.CreateProductRequest;
import com.jdcloud.sdk.service.iotcore.model.CreateProductResponse;
import com.jdcloud.sdk.service.iotcore.client.CreateProductExecutor;
import com.jdcloud.sdk.service.iotcore.model.RemoveLoongrayDeviceRequest;
import com.jdcloud.sdk.service.iotcore.model.RemoveLoongrayDeviceResponse;
import com.jdcloud.sdk.service.iotcore.client.RemoveLoongrayDeviceExecutor;
import com.jdcloud.sdk.service.iotcore.model.DeleteDeviceRequest;
import com.jdcloud.sdk.service.iotcore.model.DeleteDeviceResponse;
import com.jdcloud.sdk.service.iotcore.client.DeleteDeviceExecutor;
import com.jdcloud.sdk.service.iotcore.model.QueryDeviceDetailRequest;
import com.jdcloud.sdk.service.iotcore.model.QueryDeviceDetailResponse;
import com.jdcloud.sdk.service.iotcore.client.QueryDeviceDetailExecutor;
import com.jdcloud.sdk.service.iotcore.model.CreateAdminProductRequest;
import com.jdcloud.sdk.service.iotcore.model.CreateAdminProductResponse;
import com.jdcloud.sdk.service.iotcore.client.CreateAdminProductExecutor;
import com.jdcloud.sdk.service.iotcore.model.RemoveDeviceRequest;
import com.jdcloud.sdk.service.iotcore.model.RemoveDeviceResponse;
import com.jdcloud.sdk.service.iotcore.client.RemoveDeviceExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeThingTypeRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeThingTypeResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeThingTypeExecutor;
import com.jdcloud.sdk.service.iotcore.model.CreateProductTopicRequest;
import com.jdcloud.sdk.service.iotcore.model.CreateProductTopicResponse;
import com.jdcloud.sdk.service.iotcore.client.CreateProductTopicExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeProductTopicRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeProductTopicResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeProductTopicExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribePropertyRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribePropertyResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribePropertyExecutor;
import com.jdcloud.sdk.service.iotcore.model.UpdateDeviceTopoRequest;
import com.jdcloud.sdk.service.iotcore.model.UpdateDeviceTopoResponse;
import com.jdcloud.sdk.service.iotcore.client.UpdateDeviceTopoExecutor;
import com.jdcloud.sdk.service.iotcore.model.QueryDevicePageRequest;
import com.jdcloud.sdk.service.iotcore.model.QueryDevicePageResponse;
import com.jdcloud.sdk.service.iotcore.client.QueryDevicePageExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeThingModelRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeThingModelResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeThingModelExecutor;
import com.jdcloud.sdk.service.iotcore.model.SetDevicePropertyRequest;
import com.jdcloud.sdk.service.iotcore.model.SetDevicePropertyResponse;
import com.jdcloud.sdk.service.iotcore.client.SetDevicePropertyExecutor;
import com.jdcloud.sdk.service.iotcore.model.InvokeThingTopicRequest;
import com.jdcloud.sdk.service.iotcore.model.InvokeThingTopicResponse;
import com.jdcloud.sdk.service.iotcore.client.InvokeThingTopicExecutor;
import com.jdcloud.sdk.service.iotcore.model.UpdateLooDeviceRequest;
import com.jdcloud.sdk.service.iotcore.model.UpdateLooDeviceResponse;
import com.jdcloud.sdk.service.iotcore.client.UpdateLooDeviceExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeProductWithAdminRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeProductWithAdminResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeProductWithAdminExecutor;
import com.jdcloud.sdk.service.iotcore.model.ListProductAbilitiesRequest;
import com.jdcloud.sdk.service.iotcore.model.ListProductAbilitiesResponse;
import com.jdcloud.sdk.service.iotcore.client.ListProductAbilitiesExecutor;
import com.jdcloud.sdk.service.iotcore.model.QueryAdminStatisticsRequest;
import com.jdcloud.sdk.service.iotcore.model.QueryAdminStatisticsResponse;
import com.jdcloud.sdk.service.iotcore.client.QueryAdminStatisticsExecutor;
import com.jdcloud.sdk.service.iotcore.model.DescribeThingTypeListRequest;
import com.jdcloud.sdk.service.iotcore.model.DescribeThingTypeListResponse;
import com.jdcloud.sdk.service.iotcore.client.DescribeThingTypeListExecutor;
import com.jdcloud.sdk.service.iotcore.model.ElevatorOperatingStatusRequest;
import com.jdcloud.sdk.service.iotcore.model.ElevatorOperatingStatusResponse;
import com.jdcloud.sdk.service.iotcore.client.ElevatorOperatingStatusExecutor;

/**
 * iotcoreClient
 */
public class IotcoreClient extends JdcloudClient {

    public final static String ApiVersion = "v2";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.3";
    public final static String DefaultEndpoint = "iotcore.jdcloud-api.com";
    public final static String ServiceName = "iotcore";
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

    private IotcoreClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查看所有产品的列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListProductsWithAdminResponse listProductsWithAdmin(ListProductsWithAdminRequest request) throws JdcloudSdkException {
        return new ListProductsWithAdminExecutor().client(this).execute(request);
    }

    /**
     * 设备事件查询
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeEventListResponse describeEventList(DescribeEventListRequest request) throws JdcloudSdkException {
        return new DescribeEventListExecutor().client(this).execute(request);
    }

    /**
     * 写入采集器数据
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CollectorWriteMessageResponse collectorWriteMessage(CollectorWriteMessageRequest request) throws JdcloudSdkException {
        return new CollectorWriteMessageExecutor().client(this).execute(request);
    }

    /**
     * 边缘代理设备与非直连设备拓扑关系创建接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateDeviceTopoResponse createDeviceTopo(CreateDeviceTopoRequest request) throws JdcloudSdkException {
        return new CreateDeviceTopoExecutor().client(this).execute(request);
    }

    /**
     * 设备服务调用
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public InvokeThingServiceResponse invokeThingService(InvokeThingServiceRequest request) throws JdcloudSdkException {
        return new InvokeThingServiceExecutor().client(this).execute(request);
    }

    /**
     * 删除产品
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteProductWithAdminResponse deleteProductWithAdmin(DeleteProductWithAdminRequest request) throws JdcloudSdkException {
        return new DeleteProductWithAdminExecutor().client(this).execute(request);
    }

    /**
     * 查看产品列表接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListProductsResponse listProducts(ListProductsRequest request) throws JdcloudSdkException {
        return new ListProductsExecutor().client(this).execute(request);
    }

    /**
     * 设备注册接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RegisterDeviceResponse registerDevice(RegisterDeviceRequest request) throws JdcloudSdkException {
        return new RegisterDeviceExecutor().client(this).execute(request);
    }

    /**
     * 查询单个设备详细信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDeviceResponse describeDevice(DescribeDeviceRequest request) throws JdcloudSdkException {
        return new DescribeDeviceExecutor().client(this).execute(request);
    }

    /**
     * 修改产品
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateProductResponse updateProduct(UpdateProductRequest request) throws JdcloudSdkException {
        return new UpdateProductExecutor().client(this).execute(request);
    }

    /**
     * 属性获取接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribePropertySnapshotResponse describePropertySnapshot(DescribePropertySnapshotRequest request) throws JdcloudSdkException {
        return new DescribePropertySnapshotExecutor().client(this).execute(request);
    }

    /**
     * 设备方法执行
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public InvokeFunctionResponse invokeFunction(InvokeFunctionRequest request) throws JdcloudSdkException {
        return new InvokeFunctionExecutor().client(this).execute(request);
    }

    /**
     * 更新设备影子的期望值
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateThingShadowResponse updateThingShadow(UpdateThingShadowRequest request) throws JdcloudSdkException {
        return new UpdateThingShadowExecutor().client(this).execute(request);
    }

    /**
     * 删除产品
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws JdcloudSdkException {
        return new DeleteProductExecutor().client(this).execute(request);
    }

    /**
     * (0x03)读保持寄存器
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ReadHoldingRegistersResponse readHoldingRegisters(ReadHoldingRegistersRequest request) throws JdcloudSdkException {
        return new ReadHoldingRegistersExecutor().client(this).execute(request);
    }

    /**
     * 获取协议信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CollectorReadMessageResponse collectorReadMessage(CollectorReadMessageRequest request) throws JdcloudSdkException {
        return new CollectorReadMessageExecutor().client(this).execute(request);
    }

    /**
     * 查看设备影子
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeThingShadowResponse describeThingShadow(DescribeThingShadowRequest request) throws JdcloudSdkException {
        return new DescribeThingShadowExecutor().client(this).execute(request);
    }

    /**
     * 边缘代理设备与非直连设备拓扑关系删除接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteDeviceTopoResponse deleteDeviceTopo(DeleteDeviceTopoRequest request) throws JdcloudSdkException {
        return new DeleteDeviceTopoExecutor().client(this).execute(request);
    }

    /**
     * 下载设备证书接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DownloadDeviceCertificateResponse downloadDeviceCertificate(DownloadDeviceCertificateRequest request) throws JdcloudSdkException {
        return new DownloadDeviceCertificateExecutor().client(this).execute(request);
    }

    /**
     * 导出物模型
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ExportThingModelResponse exportThingModel(ExportThingModelRequest request) throws JdcloudSdkException {
        return new ExportThingModelExecutor().client(this).execute(request);
    }

    /**
     * 边缘代理设备与非直连设备拓扑关系查询接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDeviceTopoResponse describeDeviceTopo(DescribeDeviceTopoRequest request) throws JdcloudSdkException {
        return new DescribeDeviceTopoExecutor().client(this).execute(request);
    }

    /**
     * 朗瑞分页查询设备信息,支持一个或多个条件
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public LoongrayQueryPageResponse loongrayQueryPage(LoongrayQueryPageRequest request) throws JdcloudSdkException {
        return new LoongrayQueryPageExecutor().client(this).execute(request);
    }

    /**
     * 修改产品
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateProductWithAdminResponse updateProductWithAdmin(UpdateProductWithAdminRequest request) throws JdcloudSdkException {
        return new UpdateProductWithAdminExecutor().client(this).execute(request);
    }

    /**
     * 查看产品
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeProductResponse describeProduct(DescribeProductRequest request) throws JdcloudSdkException {
        return new DescribeProductExecutor().client(this).execute(request);
    }

    /**
     * 修改设备详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) throws JdcloudSdkException {
        return new UpdateDeviceExecutor().client(this).execute(request);
    }

    /**
     * 注册单个朗讯设备并返回秘钥信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLooDeviceResponse addLooDevice(AddLooDeviceRequest request) throws JdcloudSdkException {
        return new AddLooDeviceExecutor().client(this).execute(request);
    }

    /**
     * 导入物模型
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ImportThingModelResponse importThingModel(ImportThingModelRequest request) throws JdcloudSdkException {
        return new ImportThingModelExecutor().client(this).execute(request);
    }

    /**
     * 建立设备间的父子关系
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddDeviceLinksResponse addDeviceLinks(AddDeviceLinksRequest request) throws JdcloudSdkException {
        return new AddDeviceLinksExecutor().client(this).execute(request);
    }

    /**
     * 注册单个设备并返回秘钥信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddDeviceResponse addDevice(AddDeviceRequest request) throws JdcloudSdkException {
        return new AddDeviceExecutor().client(this).execute(request);
    }

    /**
     * 查看产品自定义Topic列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeProductTopicsResponse describeProductTopics(DescribeProductTopicsRequest request) throws JdcloudSdkException {
        return new DescribeProductTopicsExecutor().client(this).execute(request);
    }

    /**
     * 查询方法调用列表信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeFunctionListResponse describeFunctionList(DescribeFunctionListRequest request) throws JdcloudSdkException {
        return new DescribeFunctionListExecutor().client(this).execute(request);
    }

    /**
     * 新建产品
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateProductResponse createProduct(CreateProductRequest request) throws JdcloudSdkException {
        return new CreateProductExecutor().client(this).execute(request);
    }

    /**
     * 删除设备
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RemoveLoongrayDeviceResponse removeLoongrayDevice(RemoveLoongrayDeviceRequest request) throws JdcloudSdkException {
        return new RemoveLoongrayDeviceExecutor().client(this).execute(request);
    }

    /**
     * 设备删除接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws JdcloudSdkException {
        return new DeleteDeviceExecutor().client(this).execute(request);
    }

    /**
     * 查询设备详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryDeviceDetailResponse queryDeviceDetail(QueryDeviceDetailRequest request) throws JdcloudSdkException {
        return new QueryDeviceDetailExecutor().client(this).execute(request);
    }

    /**
     * 新建产品
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateAdminProductResponse createAdminProduct(CreateAdminProductRequest request) throws JdcloudSdkException {
        return new CreateAdminProductExecutor().client(this).execute(request);
    }

    /**
     * 删除设备
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RemoveDeviceResponse removeDevice(RemoveDeviceRequest request) throws JdcloudSdkException {
        return new RemoveDeviceExecutor().client(this).execute(request);
    }

    /**
     * 查询物类型详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeThingTypeResponse describeThingType(DescribeThingTypeRequest request) throws JdcloudSdkException {
        return new DescribeThingTypeExecutor().client(this).execute(request);
    }

    /**
     * 新建产品自定义Topic
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateProductTopicResponse createProductTopic(CreateProductTopicRequest request) throws JdcloudSdkException {
        return new CreateProductTopicExecutor().client(this).execute(request);
    }

    /**
     * 查看产品自定义Topic
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeProductTopicResponse describeProductTopic(DescribeProductTopicRequest request) throws JdcloudSdkException {
        return new DescribeProductTopicExecutor().client(this).execute(request);
    }

    /**
     * 查询属性接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribePropertyResponse describeProperty(DescribePropertyRequest request) throws JdcloudSdkException {
        return new DescribePropertyExecutor().client(this).execute(request);
    }

    /**
     * 边缘代理设备与非直连设备拓扑关系更新接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateDeviceTopoResponse updateDeviceTopo(UpdateDeviceTopoRequest request) throws JdcloudSdkException {
        return new UpdateDeviceTopoExecutor().client(this).execute(request);
    }

    /**
     * 分页查询设备信息,支持一个或多个条件
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryDevicePageResponse queryDevicePage(QueryDevicePageRequest request) throws JdcloudSdkException {
        return new QueryDevicePageExecutor().client(this).execute(request);
    }

    /**
     * 根据物类型Code查看物模型完整信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeThingModelResponse describeThingModel(DescribeThingModelRequest request) throws JdcloudSdkException {
        return new DescribeThingModelExecutor().client(this).execute(request);
    }

    /**
     * 设备控制接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SetDevicePropertyResponse setDeviceProperty(SetDevicePropertyRequest request) throws JdcloudSdkException {
        return new SetDevicePropertyExecutor().client(this).execute(request);
    }

    /**
     * 设备Topic调用
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public InvokeThingTopicResponse invokeThingTopic(InvokeThingTopicRequest request) throws JdcloudSdkException {
        return new InvokeThingTopicExecutor().client(this).execute(request);
    }

    /**
     * 修改设备详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateLooDeviceResponse updateLooDevice(UpdateLooDeviceRequest request) throws JdcloudSdkException {
        return new UpdateLooDeviceExecutor().client(this).execute(request);
    }

    /**
     * 查看产品
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeProductWithAdminResponse describeProductWithAdmin(DescribeProductWithAdminRequest request) throws JdcloudSdkException {
        return new DescribeProductWithAdminExecutor().client(this).execute(request);
    }

    /**
     * 查看产品功能列表接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListProductAbilitiesResponse listProductAbilities(ListProductAbilitiesRequest request) throws JdcloudSdkException {
        return new ListProductAbilitiesExecutor().client(this).execute(request);
    }

    /**
     * 设备基本数据统计，包括设备数，激活数，在线数
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryAdminStatisticsResponse queryAdminStatistics(QueryAdminStatisticsRequest request) throws JdcloudSdkException {
        return new QueryAdminStatisticsExecutor().client(this).execute(request);
    }

    /**
     * 查询物类型列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeThingTypeListResponse describeThingTypeList(DescribeThingTypeListRequest request) throws JdcloudSdkException {
        return new DescribeThingTypeListExecutor().client(this).execute(request);
    }

    /**
     * 获取电梯运行状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ElevatorOperatingStatusResponse elevatorOperatingStatus(ElevatorOperatingStatusRequest request) throws JdcloudSdkException {
        return new ElevatorOperatingStatusExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public IotcoreClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private IotcoreClient iotcoreClient;

        public DefaultBuilder() {
            iotcoreClient = new IotcoreClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            iotcoreClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            iotcoreClient.httpRequestConfig = config;
            return this;
        }

        public IotcoreClient build() throws JdcloudSdkException {

            if (iotcoreClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                iotcoreClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (iotcoreClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("IotcoreClient build error: jdcloud credentials provider not set");
                }
            }
            if (iotcoreClient.httpRequestConfig == null) {
                iotcoreClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (iotcoreClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("IotcoreClient build error: http request config not set");
                }
            }
            return iotcoreClient;
        }

        public Builder environment(Environment environment) {
            iotcoreClient.environment = environment;
            return this;
        }
    }
}
