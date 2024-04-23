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
 * Backend
 * 后端服务相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.lb.model.HealthCheckSpec;
import com.jdcloud.sdk.service.lb.model.AgInfoSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建一个后端服务
 */
public class CreateBackendRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 后端服务名字,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     * Required:true
     */
    @Required
    private String backendName;

    /**
     * 后端服务所属负载均衡的Id
     * Required:true
     */
    @Required
    private String loadBalancerId;

    /**
     * 后端服务的协议 &lt;br&gt;【alb】取值范围：Http、Tcp、Udp &lt;br&gt;【nlb】取值范围：Tcp、Udp &lt;br&gt;【dnlb】取值范围：Tcp、Udp
     * Required:true
     */
    @Required
    private String protocol;

    /**
     * 后端服务的端口，取值范围为[1, 65535]，如指定了TargetSpec中的port，实际按照target指定的port进行转发
     * Required:true
     */
    @Required
    private Integer port;

    /**
     * 健康检查信息
     * Required:true
     */
    @Required
    private HealthCheckSpec healthCheckSpec;

    /**
     * 调度算法 &lt;br&gt;【alb,nlb】取值范围为[IpHash, RoundRobin, LeastConn]（取值范围的含义：加权源Ip哈希，加权轮询和加权最小连接），alb和nlb默认为加权轮询 &lt;br&gt;【dnlb】取值范围为[IpHash, QuintupleHash]（取值范围的含义分别为：加权源Ip哈希和加权五元组哈希），dnlb默认为加权源Ip哈希
     */
    private String algorithm;

    /**
     * 虚拟服务器组的Id列表，目前只支持一个，且与agIds不能同时存在
     */
    
    private List<String> targetGroupIds;
    /**
     * 高可用组的Id列表，目前只支持一个，且与targetGroupIds不能同时存在
     */
    
    private List<String> agIds;
    /**
     * 高可用组属性设置:1.defatult_weight:默认权重, 优先级 agInfoSpec &gt; agIds
     */
    
    private List<AgInfoSpec> agInfoSpec;
    /**
     * 【alb Tcp、Udp协议】获取真实ip, 取值为False(不获取)或者True(获取,支持Proxy Protocol v1版本)，默认为False
     */
    private Boolean proxyProtocol;

    /**
     * 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * 会话保持, 取值为false(不开启)或者true(开启)，默认为false &lt;br&gt;【alb Http协议，RoundRobin算法】支持基于cookie的会话保持 &lt;br&gt;【nlb】支持基于报文源目的IP的会话保持
     */
    private Boolean sessionStickiness;

    /**
     * 【nlb】会话保持超时时间，sessionStickiness开启时生效，默认300s, 取值范围[1-3600]
     */
    private Integer sessionStickyTimeout;

    /**
     * 【nlb】连接耗尽超时。移除target前，连接的最大保持时间，默认300s，取值范围[0-3600]
     */
    private Integer connectionDrainingSeconds;

    /**
     * 【alb Http协议】cookie的过期时间,sessionStickiness开启时生效，取值范围为[0-86400], 默认为0（表示cookie与浏览器同生命周期）
     */
    private Integer httpCookieExpireSeconds;

    /**
     * 【alb Http协议】获取负载均衡的协议, 取值为False(不获取)或True(获取), 默认为False
     */
    private Boolean httpForwardedProtocol;

    /**
     * 【alb Http协议】获取负载均衡的端口, 取值为False(不获取)或True(获取), 默认为False
     */
    private Boolean httpForwardedPort;

    /**
     * 【alb Http协议】获取负载均衡的host信息, 取值为False(不获取)或True(获取), 默认为False
     */
    private Boolean httpForwardedHost;

    /**
     * 【alb Http协议】获取负载均衡的vip, 取值为False(不获取)或True(获取), 默认为False
     */
    private Boolean httpForwardedVip;

    /**
     * 【alb Http协议】获取请求端使用的端口, 取值为False(不获取)或True(获取), 默认为False
     */
    private Boolean httpForwardedClientPort;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 后端服务名字,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @return
     */
    public String getBackendName() {
        return backendName;
    }

    /**
     * set 后端服务名字,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param backendName
     */
    public void setBackendName(String backendName) {
        this.backendName = backendName;
    }


    /**
     * get 后端服务所属负载均衡的Id
     *
     * @return
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /**
     * set 后端服务所属负载均衡的Id
     *
     * @param loadBalancerId
     */
    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }


    /**
     * get 后端服务的协议 &lt;br&gt;【alb】取值范围：Http、Tcp、Udp &lt;br&gt;【nlb】取值范围：Tcp、Udp &lt;br&gt;【dnlb】取值范围：Tcp、Udp
     *
     * @return
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * set 后端服务的协议 &lt;br&gt;【alb】取值范围：Http、Tcp、Udp &lt;br&gt;【nlb】取值范围：Tcp、Udp &lt;br&gt;【dnlb】取值范围：Tcp、Udp
     *
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }


    /**
     * get 后端服务的端口，取值范围为[1, 65535]，如指定了TargetSpec中的port，实际按照target指定的port进行转发
     *
     * @return
     */
    public Integer getPort() {
        return port;
    }

    /**
     * set 后端服务的端口，取值范围为[1, 65535]，如指定了TargetSpec中的port，实际按照target指定的port进行转发
     *
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }


    /**
     * get 健康检查信息
     *
     * @return
     */
    public HealthCheckSpec getHealthCheckSpec() {
        return healthCheckSpec;
    }

    /**
     * set 健康检查信息
     *
     * @param healthCheckSpec
     */
    public void setHealthCheckSpec(HealthCheckSpec healthCheckSpec) {
        this.healthCheckSpec = healthCheckSpec;
    }


    /**
     * get 调度算法 &lt;br&gt;【alb,nlb】取值范围为[IpHash, RoundRobin, LeastConn]（取值范围的含义：加权源Ip哈希，加权轮询和加权最小连接），alb和nlb默认为加权轮询 &lt;br&gt;【dnlb】取值范围为[IpHash, QuintupleHash]（取值范围的含义分别为：加权源Ip哈希和加权五元组哈希），dnlb默认为加权源Ip哈希
     *
     * @return
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * set 调度算法 &lt;br&gt;【alb,nlb】取值范围为[IpHash, RoundRobin, LeastConn]（取值范围的含义：加权源Ip哈希，加权轮询和加权最小连接），alb和nlb默认为加权轮询 &lt;br&gt;【dnlb】取值范围为[IpHash, QuintupleHash]（取值范围的含义分别为：加权源Ip哈希和加权五元组哈希），dnlb默认为加权源Ip哈希
     *
     * @param algorithm
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }


    /**
    * get 虚拟服务器组的Id列表，目前只支持一个，且与agIds不能同时存在
    *
    * @return
    */
    public List<String> getTargetGroupIds() {
        return targetGroupIds;
    }

    /**
    * set 虚拟服务器组的Id列表，目前只支持一个，且与agIds不能同时存在
    *
    * @param targetGroupIds
    */
    public void setTargetGroupIds(List<String> targetGroupIds) {
        this.targetGroupIds = targetGroupIds;
    }


    /**
    * get 高可用组的Id列表，目前只支持一个，且与targetGroupIds不能同时存在
    *
    * @return
    */
    public List<String> getAgIds() {
        return agIds;
    }

    /**
    * set 高可用组的Id列表，目前只支持一个，且与targetGroupIds不能同时存在
    *
    * @param agIds
    */
    public void setAgIds(List<String> agIds) {
        this.agIds = agIds;
    }


    /**
    * get 高可用组属性设置:1.defatult_weight:默认权重, 优先级 agInfoSpec &gt; agIds
    *
    * @return
    */
    public List<AgInfoSpec> getAgInfoSpec() {
        return agInfoSpec;
    }

    /**
    * set 高可用组属性设置:1.defatult_weight:默认权重, 优先级 agInfoSpec &gt; agIds
    *
    * @param agInfoSpec
    */
    public void setAgInfoSpec(List<AgInfoSpec> agInfoSpec) {
        this.agInfoSpec = agInfoSpec;
    }


    /**
     * get 【alb Tcp、Udp协议】获取真实ip, 取值为False(不获取)或者True(获取,支持Proxy Protocol v1版本)，默认为False
     *
     * @return
     */
    public Boolean getProxyProtocol() {
        return proxyProtocol;
    }

    /**
     * set 【alb Tcp、Udp协议】获取真实ip, 取值为False(不获取)或者True(获取,支持Proxy Protocol v1版本)，默认为False
     *
     * @param proxyProtocol
     */
    public void setProxyProtocol(Boolean proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
    }


    /**
     * get 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 会话保持, 取值为false(不开启)或者true(开启)，默认为false &lt;br&gt;【alb Http协议，RoundRobin算法】支持基于cookie的会话保持 &lt;br&gt;【nlb】支持基于报文源目的IP的会话保持
     *
     * @return
     */
    public Boolean getSessionStickiness() {
        return sessionStickiness;
    }

    /**
     * set 会话保持, 取值为false(不开启)或者true(开启)，默认为false &lt;br&gt;【alb Http协议，RoundRobin算法】支持基于cookie的会话保持 &lt;br&gt;【nlb】支持基于报文源目的IP的会话保持
     *
     * @param sessionStickiness
     */
    public void setSessionStickiness(Boolean sessionStickiness) {
        this.sessionStickiness = sessionStickiness;
    }


    /**
     * get 【nlb】会话保持超时时间，sessionStickiness开启时生效，默认300s, 取值范围[1-3600]
     *
     * @return
     */
    public Integer getSessionStickyTimeout() {
        return sessionStickyTimeout;
    }

    /**
     * set 【nlb】会话保持超时时间，sessionStickiness开启时生效，默认300s, 取值范围[1-3600]
     *
     * @param sessionStickyTimeout
     */
    public void setSessionStickyTimeout(Integer sessionStickyTimeout) {
        this.sessionStickyTimeout = sessionStickyTimeout;
    }


    /**
     * get 【nlb】连接耗尽超时。移除target前，连接的最大保持时间，默认300s，取值范围[0-3600]
     *
     * @return
     */
    public Integer getConnectionDrainingSeconds() {
        return connectionDrainingSeconds;
    }

    /**
     * set 【nlb】连接耗尽超时。移除target前，连接的最大保持时间，默认300s，取值范围[0-3600]
     *
     * @param connectionDrainingSeconds
     */
    public void setConnectionDrainingSeconds(Integer connectionDrainingSeconds) {
        this.connectionDrainingSeconds = connectionDrainingSeconds;
    }


    /**
     * get 【alb Http协议】cookie的过期时间,sessionStickiness开启时生效，取值范围为[0-86400], 默认为0（表示cookie与浏览器同生命周期）
     *
     * @return
     */
    public Integer getHttpCookieExpireSeconds() {
        return httpCookieExpireSeconds;
    }

    /**
     * set 【alb Http协议】cookie的过期时间,sessionStickiness开启时生效，取值范围为[0-86400], 默认为0（表示cookie与浏览器同生命周期）
     *
     * @param httpCookieExpireSeconds
     */
    public void setHttpCookieExpireSeconds(Integer httpCookieExpireSeconds) {
        this.httpCookieExpireSeconds = httpCookieExpireSeconds;
    }


    /**
     * get 【alb Http协议】获取负载均衡的协议, 取值为False(不获取)或True(获取), 默认为False
     *
     * @return
     */
    public Boolean getHttpForwardedProtocol() {
        return httpForwardedProtocol;
    }

    /**
     * set 【alb Http协议】获取负载均衡的协议, 取值为False(不获取)或True(获取), 默认为False
     *
     * @param httpForwardedProtocol
     */
    public void setHttpForwardedProtocol(Boolean httpForwardedProtocol) {
        this.httpForwardedProtocol = httpForwardedProtocol;
    }


    /**
     * get 【alb Http协议】获取负载均衡的端口, 取值为False(不获取)或True(获取), 默认为False
     *
     * @return
     */
    public Boolean getHttpForwardedPort() {
        return httpForwardedPort;
    }

    /**
     * set 【alb Http协议】获取负载均衡的端口, 取值为False(不获取)或True(获取), 默认为False
     *
     * @param httpForwardedPort
     */
    public void setHttpForwardedPort(Boolean httpForwardedPort) {
        this.httpForwardedPort = httpForwardedPort;
    }


    /**
     * get 【alb Http协议】获取负载均衡的host信息, 取值为False(不获取)或True(获取), 默认为False
     *
     * @return
     */
    public Boolean getHttpForwardedHost() {
        return httpForwardedHost;
    }

    /**
     * set 【alb Http协议】获取负载均衡的host信息, 取值为False(不获取)或True(获取), 默认为False
     *
     * @param httpForwardedHost
     */
    public void setHttpForwardedHost(Boolean httpForwardedHost) {
        this.httpForwardedHost = httpForwardedHost;
    }


    /**
     * get 【alb Http协议】获取负载均衡的vip, 取值为False(不获取)或True(获取), 默认为False
     *
     * @return
     */
    public Boolean getHttpForwardedVip() {
        return httpForwardedVip;
    }

    /**
     * set 【alb Http协议】获取负载均衡的vip, 取值为False(不获取)或True(获取), 默认为False
     *
     * @param httpForwardedVip
     */
    public void setHttpForwardedVip(Boolean httpForwardedVip) {
        this.httpForwardedVip = httpForwardedVip;
    }


    /**
     * get 【alb Http协议】获取请求端使用的端口, 取值为False(不获取)或True(获取), 默认为False
     *
     * @return
     */
    public Boolean getHttpForwardedClientPort() {
        return httpForwardedClientPort;
    }

    /**
     * set 【alb Http协议】获取请求端使用的端口, 取值为False(不获取)或True(获取), 默认为False
     *
     * @param httpForwardedClientPort
     */
    public void setHttpForwardedClientPort(Boolean httpForwardedClientPort) {
        this.httpForwardedClientPort = httpForwardedClientPort;
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
     * set 后端服务名字,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param backendName
     */
    public CreateBackendRequest backendName(String backendName) {
        this.backendName = backendName;
        return this;
    }


    /**
     * set 后端服务所属负载均衡的Id
     *
     * @param loadBalancerId
     */
    public CreateBackendRequest loadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }


    /**
     * set 后端服务的协议 &lt;br&gt;【alb】取值范围：Http、Tcp、Udp &lt;br&gt;【nlb】取值范围：Tcp、Udp &lt;br&gt;【dnlb】取值范围：Tcp、Udp
     *
     * @param protocol
     */
    public CreateBackendRequest protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }


    /**
     * set 后端服务的端口，取值范围为[1, 65535]，如指定了TargetSpec中的port，实际按照target指定的port进行转发
     *
     * @param port
     */
    public CreateBackendRequest port(Integer port) {
        this.port = port;
        return this;
    }


    /**
     * set 健康检查信息
     *
     * @param healthCheckSpec
     */
    public CreateBackendRequest healthCheckSpec(HealthCheckSpec healthCheckSpec) {
        this.healthCheckSpec = healthCheckSpec;
        return this;
    }


    /**
     * set 调度算法 &lt;br&gt;【alb,nlb】取值范围为[IpHash, RoundRobin, LeastConn]（取值范围的含义：加权源Ip哈希，加权轮询和加权最小连接），alb和nlb默认为加权轮询 &lt;br&gt;【dnlb】取值范围为[IpHash, QuintupleHash]（取值范围的含义分别为：加权源Ip哈希和加权五元组哈希），dnlb默认为加权源Ip哈希
     *
     * @param algorithm
     */
    public CreateBackendRequest algorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }


    /**
    * set 虚拟服务器组的Id列表，目前只支持一个，且与agIds不能同时存在
    *
    * @param targetGroupIds
    */
    public CreateBackendRequest targetGroupIds(List<String> targetGroupIds) {
        this.targetGroupIds = targetGroupIds;
        return this;
    }


    /**
    * set 高可用组的Id列表，目前只支持一个，且与targetGroupIds不能同时存在
    *
    * @param agIds
    */
    public CreateBackendRequest agIds(List<String> agIds) {
        this.agIds = agIds;
        return this;
    }


    /**
    * set 高可用组属性设置:1.defatult_weight:默认权重, 优先级 agInfoSpec &gt; agIds
    *
    * @param agInfoSpec
    */
    public CreateBackendRequest agInfoSpec(List<AgInfoSpec> agInfoSpec) {
        this.agInfoSpec = agInfoSpec;
        return this;
    }


    /**
     * set 【alb Tcp、Udp协议】获取真实ip, 取值为False(不获取)或者True(获取,支持Proxy Protocol v1版本)，默认为False
     *
     * @param proxyProtocol
     */
    public CreateBackendRequest proxyProtocol(Boolean proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
        return this;
    }


    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public CreateBackendRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 会话保持, 取值为false(不开启)或者true(开启)，默认为false &lt;br&gt;【alb Http协议，RoundRobin算法】支持基于cookie的会话保持 &lt;br&gt;【nlb】支持基于报文源目的IP的会话保持
     *
     * @param sessionStickiness
     */
    public CreateBackendRequest sessionStickiness(Boolean sessionStickiness) {
        this.sessionStickiness = sessionStickiness;
        return this;
    }


    /**
     * set 【nlb】会话保持超时时间，sessionStickiness开启时生效，默认300s, 取值范围[1-3600]
     *
     * @param sessionStickyTimeout
     */
    public CreateBackendRequest sessionStickyTimeout(Integer sessionStickyTimeout) {
        this.sessionStickyTimeout = sessionStickyTimeout;
        return this;
    }


    /**
     * set 【nlb】连接耗尽超时。移除target前，连接的最大保持时间，默认300s，取值范围[0-3600]
     *
     * @param connectionDrainingSeconds
     */
    public CreateBackendRequest connectionDrainingSeconds(Integer connectionDrainingSeconds) {
        this.connectionDrainingSeconds = connectionDrainingSeconds;
        return this;
    }


    /**
     * set 【alb Http协议】cookie的过期时间,sessionStickiness开启时生效，取值范围为[0-86400], 默认为0（表示cookie与浏览器同生命周期）
     *
     * @param httpCookieExpireSeconds
     */
    public CreateBackendRequest httpCookieExpireSeconds(Integer httpCookieExpireSeconds) {
        this.httpCookieExpireSeconds = httpCookieExpireSeconds;
        return this;
    }


    /**
     * set 【alb Http协议】获取负载均衡的协议, 取值为False(不获取)或True(获取), 默认为False
     *
     * @param httpForwardedProtocol
     */
    public CreateBackendRequest httpForwardedProtocol(Boolean httpForwardedProtocol) {
        this.httpForwardedProtocol = httpForwardedProtocol;
        return this;
    }


    /**
     * set 【alb Http协议】获取负载均衡的端口, 取值为False(不获取)或True(获取), 默认为False
     *
     * @param httpForwardedPort
     */
    public CreateBackendRequest httpForwardedPort(Boolean httpForwardedPort) {
        this.httpForwardedPort = httpForwardedPort;
        return this;
    }


    /**
     * set 【alb Http协议】获取负载均衡的host信息, 取值为False(不获取)或True(获取), 默认为False
     *
     * @param httpForwardedHost
     */
    public CreateBackendRequest httpForwardedHost(Boolean httpForwardedHost) {
        this.httpForwardedHost = httpForwardedHost;
        return this;
    }


    /**
     * set 【alb Http协议】获取负载均衡的vip, 取值为False(不获取)或True(获取), 默认为False
     *
     * @param httpForwardedVip
     */
    public CreateBackendRequest httpForwardedVip(Boolean httpForwardedVip) {
        this.httpForwardedVip = httpForwardedVip;
        return this;
    }


    /**
     * set 【alb Http协议】获取请求端使用的端口, 取值为False(不获取)或True(获取), 默认为False
     *
     * @param httpForwardedClientPort
     */
    public CreateBackendRequest httpForwardedClientPort(Boolean httpForwardedClientPort) {
        this.httpForwardedClientPort = httpForwardedClientPort;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreateBackendRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 虚拟服务器组的Id列表，目前只支持一个，且与agIds不能同时存在
     *
     * @param targetGroupId
     */
    public void addTargetGroupId(String targetGroupId) {
        if (this.targetGroupIds == null) {
            this.targetGroupIds = new ArrayList<>();
        }
        this.targetGroupIds.add(targetGroupId);
    }

    /**
     * add item to 高可用组的Id列表，目前只支持一个，且与targetGroupIds不能同时存在
     *
     * @param agId
     */
    public void addAgId(String agId) {
        if (this.agIds == null) {
            this.agIds = new ArrayList<>();
        }
        this.agIds.add(agId);
    }

    /**
     * add item to 高可用组属性设置:1.defatult_weight:默认权重, 优先级 agInfoSpec &gt; agIds
     *
     * @param agInfoSpec
     */
    public void addAgInfoSpec(AgInfoSpec agInfoSpec) {
        if (this.agInfoSpec == null) {
            this.agInfoSpec = new ArrayList<>();
        }
        this.agInfoSpec.add(agInfoSpec);
    }
}