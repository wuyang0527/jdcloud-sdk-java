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
 * Listener
 * 监听器资源相关接口
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
import com.jdcloud.sdk.service.lb.model.CertificateSpec;
import com.jdcloud.sdk.service.lb.model.LimitationSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建一个监听器
 */
public class CreateListenerRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Listener的名字,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     * Required:true
     */
    @Required
    private String listenerName;

    /**
     * 监听协议, 取值为Tcp, Tls, Http, Https, Udp &lt;br&gt;【alb】支持Http, Https，Tcp、Tls和Udp &lt;br&gt;【nlb】支持Tcp, Udp  &lt;br&gt;【dnlb】支持Tcp, Udp
     * Required:true
     */
    @Required
    private String protocol;

    /**
     * 【alb使用https时支持】是否开启HSTS，True(开启)， False(关闭)，缺省为False
     */
    private Boolean hstsEnable;

    /**
     * 【alb使用https时支持】HSTS过期时间(秒)，取值范围为[1, 94608000(3年)]，缺省为31536000(1年)
     */
    private Integer hstsMaxAge;

    /**
     * 监听端口，取值范围为[1, 65535]
     * Required:true
     */
    @Required
    private Integer port;

    /**
     * 默认的后端服务Id
     * Required:true
     */
    @Required
    private String backendId;

    /**
     * Listener所属loadBalancer的Id
     * Required:true
     */
    @Required
    private String loadBalancerId;

    /**
     * 【alb Https和Http协议】转发规则组Id
     */
    private String urlMapId;

    /**
     * 默认后端服务的转发策略,取值为Forward或Redirect, 现只支持Forward, 默认为Forward
     */
    private String action;

    /**
     * 【alb Https和Tls协议】Listener绑定的默认证书，最多支持两个，两个证书的加密算法需要不同
     */
    
    private List<CertificateSpec> certificateSpecs;
    /**
     * 【仅ALB支持】限速配置
     */
    private LimitationSpec limitation;

    /**
     * 【alb、nlb】空闲连接超时时间, 范围为[1,86400]。 &lt;br&gt;（Tcp和Tls协议）默认为：1800s &lt;br&gt;（Udp协议）默认为：300s &lt;br&gt;（Http和Https协议）默认为：60s &lt;br&gt;【dnlb】不支持
     */
    private Integer connectionIdleTimeSeconds;

    /**
     * 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * 绑定的安全策略id，仅支持应用负载均衡的HTTPS、TLS监听配置，不传默认使用默认安全策略
     */
    private String securityPolicyId;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get Listener的名字,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @return
     */
    public String getListenerName() {
        return listenerName;
    }

    /**
     * set Listener的名字,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param listenerName
     */
    public void setListenerName(String listenerName) {
        this.listenerName = listenerName;
    }


    /**
     * get 监听协议, 取值为Tcp, Tls, Http, Https, Udp &lt;br&gt;【alb】支持Http, Https，Tcp、Tls和Udp &lt;br&gt;【nlb】支持Tcp, Udp  &lt;br&gt;【dnlb】支持Tcp, Udp
     *
     * @return
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * set 监听协议, 取值为Tcp, Tls, Http, Https, Udp &lt;br&gt;【alb】支持Http, Https，Tcp、Tls和Udp &lt;br&gt;【nlb】支持Tcp, Udp  &lt;br&gt;【dnlb】支持Tcp, Udp
     *
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }


    /**
     * get 【alb使用https时支持】是否开启HSTS，True(开启)， False(关闭)，缺省为False
     *
     * @return
     */
    public Boolean getHstsEnable() {
        return hstsEnable;
    }

    /**
     * set 【alb使用https时支持】是否开启HSTS，True(开启)， False(关闭)，缺省为False
     *
     * @param hstsEnable
     */
    public void setHstsEnable(Boolean hstsEnable) {
        this.hstsEnable = hstsEnable;
    }


    /**
     * get 【alb使用https时支持】HSTS过期时间(秒)，取值范围为[1, 94608000(3年)]，缺省为31536000(1年)
     *
     * @return
     */
    public Integer getHstsMaxAge() {
        return hstsMaxAge;
    }

    /**
     * set 【alb使用https时支持】HSTS过期时间(秒)，取值范围为[1, 94608000(3年)]，缺省为31536000(1年)
     *
     * @param hstsMaxAge
     */
    public void setHstsMaxAge(Integer hstsMaxAge) {
        this.hstsMaxAge = hstsMaxAge;
    }


    /**
     * get 监听端口，取值范围为[1, 65535]
     *
     * @return
     */
    public Integer getPort() {
        return port;
    }

    /**
     * set 监听端口，取值范围为[1, 65535]
     *
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }


    /**
     * get 默认的后端服务Id
     *
     * @return
     */
    public String getBackendId() {
        return backendId;
    }

    /**
     * set 默认的后端服务Id
     *
     * @param backendId
     */
    public void setBackendId(String backendId) {
        this.backendId = backendId;
    }


    /**
     * get Listener所属loadBalancer的Id
     *
     * @return
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /**
     * set Listener所属loadBalancer的Id
     *
     * @param loadBalancerId
     */
    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }


    /**
     * get 【alb Https和Http协议】转发规则组Id
     *
     * @return
     */
    public String getUrlMapId() {
        return urlMapId;
    }

    /**
     * set 【alb Https和Http协议】转发规则组Id
     *
     * @param urlMapId
     */
    public void setUrlMapId(String urlMapId) {
        this.urlMapId = urlMapId;
    }


    /**
     * get 默认后端服务的转发策略,取值为Forward或Redirect, 现只支持Forward, 默认为Forward
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 默认后端服务的转发策略,取值为Forward或Redirect, 现只支持Forward, 默认为Forward
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }


    /**
    * get 【alb Https和Tls协议】Listener绑定的默认证书，最多支持两个，两个证书的加密算法需要不同
    *
    * @return
    */
    public List<CertificateSpec> getCertificateSpecs() {
        return certificateSpecs;
    }

    /**
    * set 【alb Https和Tls协议】Listener绑定的默认证书，最多支持两个，两个证书的加密算法需要不同
    *
    * @param certificateSpecs
    */
    public void setCertificateSpecs(List<CertificateSpec> certificateSpecs) {
        this.certificateSpecs = certificateSpecs;
    }


    /**
     * get 【仅ALB支持】限速配置
     *
     * @return
     */
    public LimitationSpec getLimitation() {
        return limitation;
    }

    /**
     * set 【仅ALB支持】限速配置
     *
     * @param limitation
     */
    public void setLimitation(LimitationSpec limitation) {
        this.limitation = limitation;
    }


    /**
     * get 【alb、nlb】空闲连接超时时间, 范围为[1,86400]。 &lt;br&gt;（Tcp和Tls协议）默认为：1800s &lt;br&gt;（Udp协议）默认为：300s &lt;br&gt;（Http和Https协议）默认为：60s &lt;br&gt;【dnlb】不支持
     *
     * @return
     */
    public Integer getConnectionIdleTimeSeconds() {
        return connectionIdleTimeSeconds;
    }

    /**
     * set 【alb、nlb】空闲连接超时时间, 范围为[1,86400]。 &lt;br&gt;（Tcp和Tls协议）默认为：1800s &lt;br&gt;（Udp协议）默认为：300s &lt;br&gt;（Http和Https协议）默认为：60s &lt;br&gt;【dnlb】不支持
     *
     * @param connectionIdleTimeSeconds
     */
    public void setConnectionIdleTimeSeconds(Integer connectionIdleTimeSeconds) {
        this.connectionIdleTimeSeconds = connectionIdleTimeSeconds;
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
     * get 绑定的安全策略id，仅支持应用负载均衡的HTTPS、TLS监听配置，不传默认使用默认安全策略
     *
     * @return
     */
    public String getSecurityPolicyId() {
        return securityPolicyId;
    }

    /**
     * set 绑定的安全策略id，仅支持应用负载均衡的HTTPS、TLS监听配置，不传默认使用默认安全策略
     *
     * @param securityPolicyId
     */
    public void setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
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
     * set Listener的名字,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param listenerName
     */
    public CreateListenerRequest listenerName(String listenerName) {
        this.listenerName = listenerName;
        return this;
    }


    /**
     * set 监听协议, 取值为Tcp, Tls, Http, Https, Udp &lt;br&gt;【alb】支持Http, Https，Tcp、Tls和Udp &lt;br&gt;【nlb】支持Tcp, Udp  &lt;br&gt;【dnlb】支持Tcp, Udp
     *
     * @param protocol
     */
    public CreateListenerRequest protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }


    /**
     * set 【alb使用https时支持】是否开启HSTS，True(开启)， False(关闭)，缺省为False
     *
     * @param hstsEnable
     */
    public CreateListenerRequest hstsEnable(Boolean hstsEnable) {
        this.hstsEnable = hstsEnable;
        return this;
    }


    /**
     * set 【alb使用https时支持】HSTS过期时间(秒)，取值范围为[1, 94608000(3年)]，缺省为31536000(1年)
     *
     * @param hstsMaxAge
     */
    public CreateListenerRequest hstsMaxAge(Integer hstsMaxAge) {
        this.hstsMaxAge = hstsMaxAge;
        return this;
    }


    /**
     * set 监听端口，取值范围为[1, 65535]
     *
     * @param port
     */
    public CreateListenerRequest port(Integer port) {
        this.port = port;
        return this;
    }


    /**
     * set 默认的后端服务Id
     *
     * @param backendId
     */
    public CreateListenerRequest backendId(String backendId) {
        this.backendId = backendId;
        return this;
    }


    /**
     * set Listener所属loadBalancer的Id
     *
     * @param loadBalancerId
     */
    public CreateListenerRequest loadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }


    /**
     * set 【alb Https和Http协议】转发规则组Id
     *
     * @param urlMapId
     */
    public CreateListenerRequest urlMapId(String urlMapId) {
        this.urlMapId = urlMapId;
        return this;
    }


    /**
     * set 默认后端服务的转发策略,取值为Forward或Redirect, 现只支持Forward, 默认为Forward
     *
     * @param action
     */
    public CreateListenerRequest action(String action) {
        this.action = action;
        return this;
    }


    /**
    * set 【alb Https和Tls协议】Listener绑定的默认证书，最多支持两个，两个证书的加密算法需要不同
    *
    * @param certificateSpecs
    */
    public CreateListenerRequest certificateSpecs(List<CertificateSpec> certificateSpecs) {
        this.certificateSpecs = certificateSpecs;
        return this;
    }


    /**
     * set 【仅ALB支持】限速配置
     *
     * @param limitation
     */
    public CreateListenerRequest limitation(LimitationSpec limitation) {
        this.limitation = limitation;
        return this;
    }


    /**
     * set 【alb、nlb】空闲连接超时时间, 范围为[1,86400]。 &lt;br&gt;（Tcp和Tls协议）默认为：1800s &lt;br&gt;（Udp协议）默认为：300s &lt;br&gt;（Http和Https协议）默认为：60s &lt;br&gt;【dnlb】不支持
     *
     * @param connectionIdleTimeSeconds
     */
    public CreateListenerRequest connectionIdleTimeSeconds(Integer connectionIdleTimeSeconds) {
        this.connectionIdleTimeSeconds = connectionIdleTimeSeconds;
        return this;
    }


    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public CreateListenerRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 绑定的安全策略id，仅支持应用负载均衡的HTTPS、TLS监听配置，不传默认使用默认安全策略
     *
     * @param securityPolicyId
     */
    public CreateListenerRequest securityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreateListenerRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 【alb Https和Tls协议】Listener绑定的默认证书，最多支持两个，两个证书的加密算法需要不同
     *
     * @param certificateSpec
     */
    public void addCertificateSpec(CertificateSpec certificateSpec) {
        if (this.certificateSpecs == null) {
            this.certificateSpecs = new ArrayList<>();
        }
        this.certificateSpecs.add(certificateSpec);
    }
}