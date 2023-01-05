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

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.vpc.model.ElasticIpSpec;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;

/**
 * 云主机配置信息。
 */
public class InstanceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例所属的专有宿主机池，如果指定了dedicatedHostId,则此参数无效
     */
    private String dedicatedPoolId;

    /**
     * 专有宿主机ID
     */
    private String dedicatedHostId;

    /**
     * 高可用组ID。指定此参数后，将默认使用高可用组关联的实例模板创建实例，实例模板中的参数不可覆盖替换。实例模板以外的参数（内网IPv4/Ipv6分配方式、名称、描述、标签）可指定。

     */
    private String agId;

    /**
     * 实例模板ID。指定此参数后，如实例模板中参数不另行指定将默认以模板配置创建实例，如指定则以指定值为准创建。
指定 &#x60;agId&#x60; 时此参数无效。

     */
    private String instanceTemplateId;

    /**
     * 实例所属的可用区。
如不指定 &#x60;agId&#x60; 以使用高可用组设置的可用区，此参数为必选。

     */
    private String az;

    /**
     * 实例规格。可通过 [DescribeInstanceTypes](https://docs.jdcloud.com/virtual-machines/api/describeinstancetypes) 接口查询各地域及可用区下的规格售卖情况。
如不指定 &#x60;agId&#x60; 或 &#x60;instanceTemplateId&#x60; 以使用实例模板中配置的规格，此参数为必选。

     */
    private String instanceType;

    /**
     * 突发型实例参数配置
     */
    private BurstSpec burstSpec;

    /**
     * 镜像ID。可通过 [DescribeImages](https://docs.jdcloud.com/virtual-machines/api/describeimages) 接口获得指定地域的镜像信息。
如不指定 &#x60;agId&#x60; 或 &#x60;instanceTemplateId&#x60; 以使用实例模板中配置的镜像，此参数为必选。

     */
    private String imageId;

    /**
     * 实例名称。长度为2\~128个字符，只允许中文、数字、大小写字母、英文下划线（\_）、连字符（-）及点（.），不能以（.）作为首尾。
批量创建多台实例时，可在name中非首位位置以\[start_number]格式来设置有序name。start_number为起始序号，其位数代表编号字符位数，范围：\[0,9999]。
例如：name设置为“instance-\[001]-ops”，则第一台主机name为“instance-001o-ps”，第二台主机name为“instance-002-ops”。详情参见[为实例设置有序名称及Hostname]()。

     * Required:true
     */
    @Required
    private String name;

    /**
     * 实例hostname。若不指定hostname，则默认以实例名称 &#x60;name&#x60; 作为hostname，但是会以RFC 952和RFC 1123命名规范做一定转义。
**Windows系统**：长度为2\~15个字符，允许大小写字母、数字或连字符（-），不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能全部使用数字。不支持点号（.）。
**Linux系统**：长度为2-64个字符，允许支持多个点号，点之间为一段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾。
批量创建多台实例时，可在hostname中非首位位置以\[start_number]格式来设置有序hostname。start_number为起始序号，其位数代表编号字符位数，范围：\[0,9999]。。例如：hostname设置为“instance-\[000]-ops”，则第一台主机hostname为“instance-000-ops”，第二台主机hostname为“instance-001-ops”。详情参见[为实例设置有序名称及Hostname]()。
批量创建时若不指定序号，则会默认追加从1开始的数字，例如批量创建两台虚拟机，且指定hostname是test，则hostname默认是test1，test2。

     */
    private String hostname;

    /**
     * 实例密码。可用于SSH登录和VNC登录。长度为8\~30个字符，必须同时包含大、小写英文字母、数字和特殊符号中的三类字符。特殊符号包括：\(\)\&#x60;~!@#$%^&amp;\*\_-+&#x3D;\|{}\[ ]:&quot;;&#39;&lt;&gt;,.?/，更多密码输入要求请参见 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
如指定密钥且 &#x60;passwordAuth&#x60; 设置为 &#x60;true&#x60; ，则密码不会生成注入，否则即使不指定密码系统也将默认自动生成随机密码，并以短信和邮件通知。

     */
    private String password;

    /**
     * 密钥对名称。仅Linux系统下该参数生效，当前仅支持输入单个密钥。

     */
    
    private List<String> keyNames;
    /**
     * 主网卡主IP关联的弹性公网IP配置。

     */
    private ElasticIpSpec elasticIp;

    /**
     * 主网卡配置。

     */
    private InstanceNetworkInterfaceAttachmentSpec primaryNetworkInterface;

    /**
     * 系统盘配置。

     */
    private InstanceDiskAttachmentSpec systemDisk;

    /**
     * 数据盘配置。单实例最多可挂载云硬盘（系统盘+数据盘）的数量受实例规格的限制。

     */
    
    private List<InstanceDiskAttachmentSpec> dataDisks;
    /**
     * 计费配置。
云主机不支持按用量方式计费，默认为按配置计费。
打包创建数据盘的情况下，数据盘的计费方式只能与云主机保持一致。
打包创建弹性公网IP的情况下，若公网IP的计费方式没有指定为按用量计费，那么公网IP计费方式只能与云主机保持一致。
autoChangeChargeMode和autoChangeChargeModeDate字段只有在按配置计费按时间自动转包年包月的场景下有效

     */
    private ChargeSpec charge;

    /**
     * 用户自定义元数据。以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
注意：key不要以连字符(-)结尾，否则此key不生效。

     */
    
    private List<Metadata> metadata;
    /**
     * 自定义脚本。目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须 &#x60;base64&#x60; 编码且编码前数据长度不能超过16KB。
**linux系统**：支持 &#x60;bash&#x60; 和 &#x60;python&#x60;，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60;，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

     */
    
    private List<Userdata> userdata;
    /**
     * 实例描述。256字符以内。

     */
    private String description;

    /**
     * 使用实例模板创建实例时，如模板中已设置密码，期望不使用该密码而由系统自动生成时，可通过此参数（&#x60;true&#x60;）实现。
可选值：
&#x60;true&#x60;：不使用实例模板中配置的密码。
&#x60;false&#x60;：使用实例模板中配置的密码。
仅在未指定 &#x60;agId&#x60; 且指定 &#x60;instanceTemplateId&#x60;，且 &#x60;password&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     */
    private Boolean noPassword;

    /**
     * 使用实例模板创建实例时，如模板中已设置密钥，期望不使用该密钥仅使用密码作为登录凭证时，可通过此参数（&#x60;true&#x60;）实现。
仅在未指定 &#x60;agId&#x60; 且指定 &#x60;instanceTemplateId&#x60;，且 &#x60;keyNames&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     */
    private Boolean noKeyNames;

    /**
     * 使用实例模板创建实例时，如模板中已设置弹性公网IP，期望不绑定弹性公网IP时，可通过此参数（&#x60;true&#x60;）实现。
仅在未指定 &#x60;agId&#x60; 且指定 &#x60;instanceTemplateId&#x60;，且 &#x60;elasticIp&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     */
    private Boolean noElasticIp;

    /**
     * 使用实例模板创建实例时，如模板中已设置自定义实例标签，期望不使用自定义实例标签时，可通过此参数（&#x60;true&#x60;）实现。
仅在指定 &#x60;agId&#x60; 或指定 &#x60;instanceTemplateId&#x60;，且 &#x60;userTags&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     */
    private Boolean noInstanceTags;

    /**
     * 自定义实例标签。以key-value键值对形式指定，最多支持10个标签。key不能以 &quot;jrn:&quot; 或“jdc-”开头，仅支持中文、大/小写英文、数字及如下符号：&#x60;\_.,:\/&#x3D;+-@&#x60;。

     */
    
    private List<Tag> userTags;
    /**
     * 停机不计费模式。该参数仅对按配置计费且系统盘为云硬盘的实例生效，并且不是专有宿主机中的实例。配置停机不计费且停机后，实例部分将停止计费，且释放实例自身包含的资源（CPU/内存/GPU/本地数据盘）。
可选值：
&#x60;keepCharging&#x60;（默认值）：停机后保持计费，不释放资源。
&#x60;stopCharging&#x60;：停机后停止计费，释放实例资源。

     */
    private String chargeOnStopped;

    /**
     * 自动任务策略ID。

     */
    private String autoImagePolicyId;

    /**
     * 允许SSH密码登录。
可选值：
&#x60;yes&#x60;（默认值）：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。
仅在指定密钥时此参数有效，指定此参数后密码即使输入也将被忽略，同时会在系统内禁用SSH密码登录。

     */
    private String passwordAuth;

    /**
     * 使用镜像中的登录凭证，无须再指定密码或密钥（指定无效）。
可选值：
&#x60;yes&#x60;：使用镜像登录凭证。
&#x60;no&#x60;（默认值）：不使用镜像登录凭证。
仅使用私有或共享镜像时此参数有效。

     */
    private String imageInherit;

    /**
     * 资源组ID
     */
    private String resourceGroupId;

    /**
     * 虚机CPU拓扑
     */
    private CpuTopology cpuTopology;



    /**
     * get 实例所属的专有宿主机池，如果指定了dedicatedHostId,则此参数无效
     *
     * @return
     */
    public String getDedicatedPoolId() {
        return dedicatedPoolId;
    }

    /**
     * set 实例所属的专有宿主机池，如果指定了dedicatedHostId,则此参数无效
     *
     * @param dedicatedPoolId
     */
    public void setDedicatedPoolId(String dedicatedPoolId) {
        this.dedicatedPoolId = dedicatedPoolId;
    }


    /**
     * get 专有宿主机ID
     *
     * @return
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    /**
     * set 专有宿主机ID
     *
     * @param dedicatedHostId
     */
    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }


    /**
     * get 高可用组ID。指定此参数后，将默认使用高可用组关联的实例模板创建实例，实例模板中的参数不可覆盖替换。实例模板以外的参数（内网IPv4/Ipv6分配方式、名称、描述、标签）可指定。

     *
     * @return
     */
    public String getAgId() {
        return agId;
    }

    /**
     * set 高可用组ID。指定此参数后，将默认使用高可用组关联的实例模板创建实例，实例模板中的参数不可覆盖替换。实例模板以外的参数（内网IPv4/Ipv6分配方式、名称、描述、标签）可指定。

     *
     * @param agId
     */
    public void setAgId(String agId) {
        this.agId = agId;
    }


    /**
     * get 实例模板ID。指定此参数后，如实例模板中参数不另行指定将默认以模板配置创建实例，如指定则以指定值为准创建。
指定 &#x60;agId&#x60; 时此参数无效。

     *
     * @return
     */
    public String getInstanceTemplateId() {
        return instanceTemplateId;
    }

    /**
     * set 实例模板ID。指定此参数后，如实例模板中参数不另行指定将默认以模板配置创建实例，如指定则以指定值为准创建。
指定 &#x60;agId&#x60; 时此参数无效。

     *
     * @param instanceTemplateId
     */
    public void setInstanceTemplateId(String instanceTemplateId) {
        this.instanceTemplateId = instanceTemplateId;
    }


    /**
     * get 实例所属的可用区。
如不指定 &#x60;agId&#x60; 以使用高可用组设置的可用区，此参数为必选。

     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 实例所属的可用区。
如不指定 &#x60;agId&#x60; 以使用高可用组设置的可用区，此参数为必选。

     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }


    /**
     * get 实例规格。可通过 [DescribeInstanceTypes](https://docs.jdcloud.com/virtual-machines/api/describeinstancetypes) 接口查询各地域及可用区下的规格售卖情况。
如不指定 &#x60;agId&#x60; 或 &#x60;instanceTemplateId&#x60; 以使用实例模板中配置的规格，此参数为必选。

     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例规格。可通过 [DescribeInstanceTypes](https://docs.jdcloud.com/virtual-machines/api/describeinstancetypes) 接口查询各地域及可用区下的规格售卖情况。
如不指定 &#x60;agId&#x60; 或 &#x60;instanceTemplateId&#x60; 以使用实例模板中配置的规格，此参数为必选。

     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }


    /**
     * get 突发型实例参数配置
     *
     * @return
     */
    public BurstSpec getBurstSpec() {
        return burstSpec;
    }

    /**
     * set 突发型实例参数配置
     *
     * @param burstSpec
     */
    public void setBurstSpec(BurstSpec burstSpec) {
        this.burstSpec = burstSpec;
    }


    /**
     * get 镜像ID。可通过 [DescribeImages](https://docs.jdcloud.com/virtual-machines/api/describeimages) 接口获得指定地域的镜像信息。
如不指定 &#x60;agId&#x60; 或 &#x60;instanceTemplateId&#x60; 以使用实例模板中配置的镜像，此参数为必选。

     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID。可通过 [DescribeImages](https://docs.jdcloud.com/virtual-machines/api/describeimages) 接口获得指定地域的镜像信息。
如不指定 &#x60;agId&#x60; 或 &#x60;instanceTemplateId&#x60; 以使用实例模板中配置的镜像，此参数为必选。

     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }


    /**
     * get 实例名称。长度为2\~128个字符，只允许中文、数字、大小写字母、英文下划线（\_）、连字符（-）及点（.），不能以（.）作为首尾。
批量创建多台实例时，可在name中非首位位置以\[start_number]格式来设置有序name。start_number为起始序号，其位数代表编号字符位数，范围：\[0,9999]。
例如：name设置为“instance-\[001]-ops”，则第一台主机name为“instance-001o-ps”，第二台主机name为“instance-002-ops”。详情参见[为实例设置有序名称及Hostname]()。

     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 实例名称。长度为2\~128个字符，只允许中文、数字、大小写字母、英文下划线（\_）、连字符（-）及点（.），不能以（.）作为首尾。
批量创建多台实例时，可在name中非首位位置以\[start_number]格式来设置有序name。start_number为起始序号，其位数代表编号字符位数，范围：\[0,9999]。
例如：name设置为“instance-\[001]-ops”，则第一台主机name为“instance-001o-ps”，第二台主机name为“instance-002-ops”。详情参见[为实例设置有序名称及Hostname]()。

     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 实例hostname。若不指定hostname，则默认以实例名称 &#x60;name&#x60; 作为hostname，但是会以RFC 952和RFC 1123命名规范做一定转义。
**Windows系统**：长度为2\~15个字符，允许大小写字母、数字或连字符（-），不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能全部使用数字。不支持点号（.）。
**Linux系统**：长度为2-64个字符，允许支持多个点号，点之间为一段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾。
批量创建多台实例时，可在hostname中非首位位置以\[start_number]格式来设置有序hostname。start_number为起始序号，其位数代表编号字符位数，范围：\[0,9999]。。例如：hostname设置为“instance-\[000]-ops”，则第一台主机hostname为“instance-000-ops”，第二台主机hostname为“instance-001-ops”。详情参见[为实例设置有序名称及Hostname]()。
批量创建时若不指定序号，则会默认追加从1开始的数字，例如批量创建两台虚拟机，且指定hostname是test，则hostname默认是test1，test2。

     *
     * @return
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * set 实例hostname。若不指定hostname，则默认以实例名称 &#x60;name&#x60; 作为hostname，但是会以RFC 952和RFC 1123命名规范做一定转义。
**Windows系统**：长度为2\~15个字符，允许大小写字母、数字或连字符（-），不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能全部使用数字。不支持点号（.）。
**Linux系统**：长度为2-64个字符，允许支持多个点号，点之间为一段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾。
批量创建多台实例时，可在hostname中非首位位置以\[start_number]格式来设置有序hostname。start_number为起始序号，其位数代表编号字符位数，范围：\[0,9999]。。例如：hostname设置为“instance-\[000]-ops”，则第一台主机hostname为“instance-000-ops”，第二台主机hostname为“instance-001-ops”。详情参见[为实例设置有序名称及Hostname]()。
批量创建时若不指定序号，则会默认追加从1开始的数字，例如批量创建两台虚拟机，且指定hostname是test，则hostname默认是test1，test2。

     *
     * @param hostname
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }


    /**
     * get 实例密码。可用于SSH登录和VNC登录。长度为8\~30个字符，必须同时包含大、小写英文字母、数字和特殊符号中的三类字符。特殊符号包括：\(\)\&#x60;~!@#$%^&amp;\*\_-+&#x3D;\|{}\[ ]:&quot;;&#39;&lt;&gt;,.?/，更多密码输入要求请参见 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
如指定密钥且 &#x60;passwordAuth&#x60; 设置为 &#x60;true&#x60; ，则密码不会生成注入，否则即使不指定密码系统也将默认自动生成随机密码，并以短信和邮件通知。

     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 实例密码。可用于SSH登录和VNC登录。长度为8\~30个字符，必须同时包含大、小写英文字母、数字和特殊符号中的三类字符。特殊符号包括：\(\)\&#x60;~!@#$%^&amp;\*\_-+&#x3D;\|{}\[ ]:&quot;;&#39;&lt;&gt;,.?/，更多密码输入要求请参见 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
如指定密钥且 &#x60;passwordAuth&#x60; 设置为 &#x60;true&#x60; ，则密码不会生成注入，否则即使不指定密码系统也将默认自动生成随机密码，并以短信和邮件通知。

     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
    * get 密钥对名称。仅Linux系统下该参数生效，当前仅支持输入单个密钥。

    *
    * @return
    */
    public List<String> getKeyNames() {
        return keyNames;
    }

    /**
    * set 密钥对名称。仅Linux系统下该参数生效，当前仅支持输入单个密钥。

    *
    * @param keyNames
    */
    public void setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
    }


    /**
     * get 主网卡主IP关联的弹性公网IP配置。

     *
     * @return
     */
    public ElasticIpSpec getElasticIp() {
        return elasticIp;
    }

    /**
     * set 主网卡主IP关联的弹性公网IP配置。

     *
     * @param elasticIp
     */
    public void setElasticIp(ElasticIpSpec elasticIp) {
        this.elasticIp = elasticIp;
    }


    /**
     * get 主网卡配置。

     *
     * @return
     */
    public InstanceNetworkInterfaceAttachmentSpec getPrimaryNetworkInterface() {
        return primaryNetworkInterface;
    }

    /**
     * set 主网卡配置。

     *
     * @param primaryNetworkInterface
     */
    public void setPrimaryNetworkInterface(InstanceNetworkInterfaceAttachmentSpec primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
    }


    /**
     * get 系统盘配置。

     *
     * @return
     */
    public InstanceDiskAttachmentSpec getSystemDisk() {
        return systemDisk;
    }

    /**
     * set 系统盘配置。

     *
     * @param systemDisk
     */
    public void setSystemDisk(InstanceDiskAttachmentSpec systemDisk) {
        this.systemDisk = systemDisk;
    }


    /**
    * get 数据盘配置。单实例最多可挂载云硬盘（系统盘+数据盘）的数量受实例规格的限制。

    *
    * @return
    */
    public List<InstanceDiskAttachmentSpec> getDataDisks() {
        return dataDisks;
    }

    /**
    * set 数据盘配置。单实例最多可挂载云硬盘（系统盘+数据盘）的数量受实例规格的限制。

    *
    * @param dataDisks
    */
    public void setDataDisks(List<InstanceDiskAttachmentSpec> dataDisks) {
        this.dataDisks = dataDisks;
    }


    /**
     * get 计费配置。
云主机不支持按用量方式计费，默认为按配置计费。
打包创建数据盘的情况下，数据盘的计费方式只能与云主机保持一致。
打包创建弹性公网IP的情况下，若公网IP的计费方式没有指定为按用量计费，那么公网IP计费方式只能与云主机保持一致。
autoChangeChargeMode和autoChangeChargeModeDate字段只有在按配置计费按时间自动转包年包月的场景下有效

     *
     * @return
     */
    public ChargeSpec getCharge() {
        return charge;
    }

    /**
     * set 计费配置。
云主机不支持按用量方式计费，默认为按配置计费。
打包创建数据盘的情况下，数据盘的计费方式只能与云主机保持一致。
打包创建弹性公网IP的情况下，若公网IP的计费方式没有指定为按用量计费，那么公网IP计费方式只能与云主机保持一致。
autoChangeChargeMode和autoChangeChargeModeDate字段只有在按配置计费按时间自动转包年包月的场景下有效

     *
     * @param charge
     */
    public void setCharge(ChargeSpec charge) {
        this.charge = charge;
    }


    /**
    * get 用户自定义元数据。以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
注意：key不要以连字符(-)结尾，否则此key不生效。

    *
    * @return
    */
    public List<Metadata> getMetadata() {
        return metadata;
    }

    /**
    * set 用户自定义元数据。以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
注意：key不要以连字符(-)结尾，否则此key不生效。

    *
    * @param metadata
    */
    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }


    /**
    * get 自定义脚本。目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须 &#x60;base64&#x60; 编码且编码前数据长度不能超过16KB。
**linux系统**：支持 &#x60;bash&#x60; 和 &#x60;python&#x60;，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60;，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

    *
    * @return
    */
    public List<Userdata> getUserdata() {
        return userdata;
    }

    /**
    * set 自定义脚本。目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须 &#x60;base64&#x60; 编码且编码前数据长度不能超过16KB。
**linux系统**：支持 &#x60;bash&#x60; 和 &#x60;python&#x60;，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60;，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

    *
    * @param userdata
    */
    public void setUserdata(List<Userdata> userdata) {
        this.userdata = userdata;
    }


    /**
     * get 实例描述。256字符以内。

     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 实例描述。256字符以内。

     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 使用实例模板创建实例时，如模板中已设置密码，期望不使用该密码而由系统自动生成时，可通过此参数（&#x60;true&#x60;）实现。
可选值：
&#x60;true&#x60;：不使用实例模板中配置的密码。
&#x60;false&#x60;：使用实例模板中配置的密码。
仅在未指定 &#x60;agId&#x60; 且指定 &#x60;instanceTemplateId&#x60;，且 &#x60;password&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     *
     * @return
     */
    public Boolean getNoPassword() {
        return noPassword;
    }

    /**
     * set 使用实例模板创建实例时，如模板中已设置密码，期望不使用该密码而由系统自动生成时，可通过此参数（&#x60;true&#x60;）实现。
可选值：
&#x60;true&#x60;：不使用实例模板中配置的密码。
&#x60;false&#x60;：使用实例模板中配置的密码。
仅在未指定 &#x60;agId&#x60; 且指定 &#x60;instanceTemplateId&#x60;，且 &#x60;password&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     *
     * @param noPassword
     */
    public void setNoPassword(Boolean noPassword) {
        this.noPassword = noPassword;
    }


    /**
     * get 使用实例模板创建实例时，如模板中已设置密钥，期望不使用该密钥仅使用密码作为登录凭证时，可通过此参数（&#x60;true&#x60;）实现。
仅在未指定 &#x60;agId&#x60; 且指定 &#x60;instanceTemplateId&#x60;，且 &#x60;keyNames&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     *
     * @return
     */
    public Boolean getNoKeyNames() {
        return noKeyNames;
    }

    /**
     * set 使用实例模板创建实例时，如模板中已设置密钥，期望不使用该密钥仅使用密码作为登录凭证时，可通过此参数（&#x60;true&#x60;）实现。
仅在未指定 &#x60;agId&#x60; 且指定 &#x60;instanceTemplateId&#x60;，且 &#x60;keyNames&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     *
     * @param noKeyNames
     */
    public void setNoKeyNames(Boolean noKeyNames) {
        this.noKeyNames = noKeyNames;
    }


    /**
     * get 使用实例模板创建实例时，如模板中已设置弹性公网IP，期望不绑定弹性公网IP时，可通过此参数（&#x60;true&#x60;）实现。
仅在未指定 &#x60;agId&#x60; 且指定 &#x60;instanceTemplateId&#x60;，且 &#x60;elasticIp&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     *
     * @return
     */
    public Boolean getNoElasticIp() {
        return noElasticIp;
    }

    /**
     * set 使用实例模板创建实例时，如模板中已设置弹性公网IP，期望不绑定弹性公网IP时，可通过此参数（&#x60;true&#x60;）实现。
仅在未指定 &#x60;agId&#x60; 且指定 &#x60;instanceTemplateId&#x60;，且 &#x60;elasticIp&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     *
     * @param noElasticIp
     */
    public void setNoElasticIp(Boolean noElasticIp) {
        this.noElasticIp = noElasticIp;
    }


    /**
     * get 使用实例模板创建实例时，如模板中已设置自定义实例标签，期望不使用自定义实例标签时，可通过此参数（&#x60;true&#x60;）实现。
仅在指定 &#x60;agId&#x60; 或指定 &#x60;instanceTemplateId&#x60;，且 &#x60;userTags&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     *
     * @return
     */
    public Boolean getNoInstanceTags() {
        return noInstanceTags;
    }

    /**
     * set 使用实例模板创建实例时，如模板中已设置自定义实例标签，期望不使用自定义实例标签时，可通过此参数（&#x60;true&#x60;）实现。
仅在指定 &#x60;agId&#x60; 或指定 &#x60;instanceTemplateId&#x60;，且 &#x60;userTags&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     *
     * @param noInstanceTags
     */
    public void setNoInstanceTags(Boolean noInstanceTags) {
        this.noInstanceTags = noInstanceTags;
    }


    /**
    * get 自定义实例标签。以key-value键值对形式指定，最多支持10个标签。key不能以 &quot;jrn:&quot; 或“jdc-”开头，仅支持中文、大/小写英文、数字及如下符号：&#x60;\_.,:\/&#x3D;+-@&#x60;。

    *
    * @return
    */
    public List<Tag> getUserTags() {
        return userTags;
    }

    /**
    * set 自定义实例标签。以key-value键值对形式指定，最多支持10个标签。key不能以 &quot;jrn:&quot; 或“jdc-”开头，仅支持中文、大/小写英文、数字及如下符号：&#x60;\_.,:\/&#x3D;+-@&#x60;。

    *
    * @param userTags
    */
    public void setUserTags(List<Tag> userTags) {
        this.userTags = userTags;
    }


    /**
     * get 停机不计费模式。该参数仅对按配置计费且系统盘为云硬盘的实例生效，并且不是专有宿主机中的实例。配置停机不计费且停机后，实例部分将停止计费，且释放实例自身包含的资源（CPU/内存/GPU/本地数据盘）。
可选值：
&#x60;keepCharging&#x60;（默认值）：停机后保持计费，不释放资源。
&#x60;stopCharging&#x60;：停机后停止计费，释放实例资源。

     *
     * @return
     */
    public String getChargeOnStopped() {
        return chargeOnStopped;
    }

    /**
     * set 停机不计费模式。该参数仅对按配置计费且系统盘为云硬盘的实例生效，并且不是专有宿主机中的实例。配置停机不计费且停机后，实例部分将停止计费，且释放实例自身包含的资源（CPU/内存/GPU/本地数据盘）。
可选值：
&#x60;keepCharging&#x60;（默认值）：停机后保持计费，不释放资源。
&#x60;stopCharging&#x60;：停机后停止计费，释放实例资源。

     *
     * @param chargeOnStopped
     */
    public void setChargeOnStopped(String chargeOnStopped) {
        this.chargeOnStopped = chargeOnStopped;
    }


    /**
     * get 自动任务策略ID。

     *
     * @return
     */
    public String getAutoImagePolicyId() {
        return autoImagePolicyId;
    }

    /**
     * set 自动任务策略ID。

     *
     * @param autoImagePolicyId
     */
    public void setAutoImagePolicyId(String autoImagePolicyId) {
        this.autoImagePolicyId = autoImagePolicyId;
    }


    /**
     * get 允许SSH密码登录。
可选值：
&#x60;yes&#x60;（默认值）：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。
仅在指定密钥时此参数有效，指定此参数后密码即使输入也将被忽略，同时会在系统内禁用SSH密码登录。

     *
     * @return
     */
    public String getPasswordAuth() {
        return passwordAuth;
    }

    /**
     * set 允许SSH密码登录。
可选值：
&#x60;yes&#x60;（默认值）：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。
仅在指定密钥时此参数有效，指定此参数后密码即使输入也将被忽略，同时会在系统内禁用SSH密码登录。

     *
     * @param passwordAuth
     */
    public void setPasswordAuth(String passwordAuth) {
        this.passwordAuth = passwordAuth;
    }


    /**
     * get 使用镜像中的登录凭证，无须再指定密码或密钥（指定无效）。
可选值：
&#x60;yes&#x60;：使用镜像登录凭证。
&#x60;no&#x60;（默认值）：不使用镜像登录凭证。
仅使用私有或共享镜像时此参数有效。

     *
     * @return
     */
    public String getImageInherit() {
        return imageInherit;
    }

    /**
     * set 使用镜像中的登录凭证，无须再指定密码或密钥（指定无效）。
可选值：
&#x60;yes&#x60;：使用镜像登录凭证。
&#x60;no&#x60;（默认值）：不使用镜像登录凭证。
仅使用私有或共享镜像时此参数有效。

     *
     * @param imageInherit
     */
    public void setImageInherit(String imageInherit) {
        this.imageInherit = imageInherit;
    }


    /**
     * get 资源组ID
     *
     * @return
     */
    public String getResourceGroupId() {
        return resourceGroupId;
    }

    /**
     * set 资源组ID
     *
     * @param resourceGroupId
     */
    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }


    /**
     * get 虚机CPU拓扑
     *
     * @return
     */
    public CpuTopology getCpuTopology() {
        return cpuTopology;
    }

    /**
     * set 虚机CPU拓扑
     *
     * @param cpuTopology
     */
    public void setCpuTopology(CpuTopology cpuTopology) {
        this.cpuTopology = cpuTopology;
    }



    /**
     * set 实例所属的专有宿主机池，如果指定了dedicatedHostId,则此参数无效
     *
     * @param dedicatedPoolId
     */
    public InstanceSpec dedicatedPoolId(String dedicatedPoolId) {
        this.dedicatedPoolId = dedicatedPoolId;
        return this;
    }


    /**
     * set 专有宿主机ID
     *
     * @param dedicatedHostId
     */
    public InstanceSpec dedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }


    /**
     * set 高可用组ID。指定此参数后，将默认使用高可用组关联的实例模板创建实例，实例模板中的参数不可覆盖替换。实例模板以外的参数（内网IPv4/Ipv6分配方式、名称、描述、标签）可指定。

     *
     * @param agId
     */
    public InstanceSpec agId(String agId) {
        this.agId = agId;
        return this;
    }


    /**
     * set 实例模板ID。指定此参数后，如实例模板中参数不另行指定将默认以模板配置创建实例，如指定则以指定值为准创建。
指定 &#x60;agId&#x60; 时此参数无效。

     *
     * @param instanceTemplateId
     */
    public InstanceSpec instanceTemplateId(String instanceTemplateId) {
        this.instanceTemplateId = instanceTemplateId;
        return this;
    }


    /**
     * set 实例所属的可用区。
如不指定 &#x60;agId&#x60; 以使用高可用组设置的可用区，此参数为必选。

     *
     * @param az
     */
    public InstanceSpec az(String az) {
        this.az = az;
        return this;
    }


    /**
     * set 实例规格。可通过 [DescribeInstanceTypes](https://docs.jdcloud.com/virtual-machines/api/describeinstancetypes) 接口查询各地域及可用区下的规格售卖情况。
如不指定 &#x60;agId&#x60; 或 &#x60;instanceTemplateId&#x60; 以使用实例模板中配置的规格，此参数为必选。

     *
     * @param instanceType
     */
    public InstanceSpec instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }


    /**
     * set 突发型实例参数配置
     *
     * @param burstSpec
     */
    public InstanceSpec burstSpec(BurstSpec burstSpec) {
        this.burstSpec = burstSpec;
        return this;
    }


    /**
     * set 镜像ID。可通过 [DescribeImages](https://docs.jdcloud.com/virtual-machines/api/describeimages) 接口获得指定地域的镜像信息。
如不指定 &#x60;agId&#x60; 或 &#x60;instanceTemplateId&#x60; 以使用实例模板中配置的镜像，此参数为必选。

     *
     * @param imageId
     */
    public InstanceSpec imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }


    /**
     * set 实例名称。长度为2\~128个字符，只允许中文、数字、大小写字母、英文下划线（\_）、连字符（-）及点（.），不能以（.）作为首尾。
批量创建多台实例时，可在name中非首位位置以\[start_number]格式来设置有序name。start_number为起始序号，其位数代表编号字符位数，范围：\[0,9999]。
例如：name设置为“instance-\[001]-ops”，则第一台主机name为“instance-001o-ps”，第二台主机name为“instance-002-ops”。详情参见[为实例设置有序名称及Hostname]()。

     *
     * @param name
     */
    public InstanceSpec name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 实例hostname。若不指定hostname，则默认以实例名称 &#x60;name&#x60; 作为hostname，但是会以RFC 952和RFC 1123命名规范做一定转义。
**Windows系统**：长度为2\~15个字符，允许大小写字母、数字或连字符（-），不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能全部使用数字。不支持点号（.）。
**Linux系统**：长度为2-64个字符，允许支持多个点号，点之间为一段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾。
批量创建多台实例时，可在hostname中非首位位置以\[start_number]格式来设置有序hostname。start_number为起始序号，其位数代表编号字符位数，范围：\[0,9999]。。例如：hostname设置为“instance-\[000]-ops”，则第一台主机hostname为“instance-000-ops”，第二台主机hostname为“instance-001-ops”。详情参见[为实例设置有序名称及Hostname]()。
批量创建时若不指定序号，则会默认追加从1开始的数字，例如批量创建两台虚拟机，且指定hostname是test，则hostname默认是test1，test2。

     *
     * @param hostname
     */
    public InstanceSpec hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }


    /**
     * set 实例密码。可用于SSH登录和VNC登录。长度为8\~30个字符，必须同时包含大、小写英文字母、数字和特殊符号中的三类字符。特殊符号包括：\(\)\&#x60;~!@#$%^&amp;\*\_-+&#x3D;\|{}\[ ]:&quot;;&#39;&lt;&gt;,.?/，更多密码输入要求请参见 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
如指定密钥且 &#x60;passwordAuth&#x60; 设置为 &#x60;true&#x60; ，则密码不会生成注入，否则即使不指定密码系统也将默认自动生成随机密码，并以短信和邮件通知。

     *
     * @param password
     */
    public InstanceSpec password(String password) {
        this.password = password;
        return this;
    }


    /**
    * set 密钥对名称。仅Linux系统下该参数生效，当前仅支持输入单个密钥。

    *
    * @param keyNames
    */
    public InstanceSpec keyNames(List<String> keyNames) {
        this.keyNames = keyNames;
        return this;
    }


    /**
     * set 主网卡主IP关联的弹性公网IP配置。

     *
     * @param elasticIp
     */
    public InstanceSpec elasticIp(ElasticIpSpec elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }


    /**
     * set 主网卡配置。

     *
     * @param primaryNetworkInterface
     */
    public InstanceSpec primaryNetworkInterface(InstanceNetworkInterfaceAttachmentSpec primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
        return this;
    }


    /**
     * set 系统盘配置。

     *
     * @param systemDisk
     */
    public InstanceSpec systemDisk(InstanceDiskAttachmentSpec systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }


    /**
    * set 数据盘配置。单实例最多可挂载云硬盘（系统盘+数据盘）的数量受实例规格的限制。

    *
    * @param dataDisks
    */
    public InstanceSpec dataDisks(List<InstanceDiskAttachmentSpec> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }


    /**
     * set 计费配置。
云主机不支持按用量方式计费，默认为按配置计费。
打包创建数据盘的情况下，数据盘的计费方式只能与云主机保持一致。
打包创建弹性公网IP的情况下，若公网IP的计费方式没有指定为按用量计费，那么公网IP计费方式只能与云主机保持一致。
autoChangeChargeMode和autoChangeChargeModeDate字段只有在按配置计费按时间自动转包年包月的场景下有效

     *
     * @param charge
     */
    public InstanceSpec charge(ChargeSpec charge) {
        this.charge = charge;
        return this;
    }


    /**
    * set 用户自定义元数据。以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
注意：key不要以连字符(-)结尾，否则此key不生效。

    *
    * @param metadata
    */
    public InstanceSpec metadata(List<Metadata> metadata) {
        this.metadata = metadata;
        return this;
    }


    /**
    * set 自定义脚本。目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须 &#x60;base64&#x60; 编码且编码前数据长度不能超过16KB。
**linux系统**：支持 &#x60;bash&#x60; 和 &#x60;python&#x60;，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60;，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

    *
    * @param userdata
    */
    public InstanceSpec userdata(List<Userdata> userdata) {
        this.userdata = userdata;
        return this;
    }


    /**
     * set 实例描述。256字符以内。

     *
     * @param description
     */
    public InstanceSpec description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 使用实例模板创建实例时，如模板中已设置密码，期望不使用该密码而由系统自动生成时，可通过此参数（&#x60;true&#x60;）实现。
可选值：
&#x60;true&#x60;：不使用实例模板中配置的密码。
&#x60;false&#x60;：使用实例模板中配置的密码。
仅在未指定 &#x60;agId&#x60; 且指定 &#x60;instanceTemplateId&#x60;，且 &#x60;password&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     *
     * @param noPassword
     */
    public InstanceSpec noPassword(Boolean noPassword) {
        this.noPassword = noPassword;
        return this;
    }


    /**
     * set 使用实例模板创建实例时，如模板中已设置密钥，期望不使用该密钥仅使用密码作为登录凭证时，可通过此参数（&#x60;true&#x60;）实现。
仅在未指定 &#x60;agId&#x60; 且指定 &#x60;instanceTemplateId&#x60;，且 &#x60;keyNames&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     *
     * @param noKeyNames
     */
    public InstanceSpec noKeyNames(Boolean noKeyNames) {
        this.noKeyNames = noKeyNames;
        return this;
    }


    /**
     * set 使用实例模板创建实例时，如模板中已设置弹性公网IP，期望不绑定弹性公网IP时，可通过此参数（&#x60;true&#x60;）实现。
仅在未指定 &#x60;agId&#x60; 且指定 &#x60;instanceTemplateId&#x60;，且 &#x60;elasticIp&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     *
     * @param noElasticIp
     */
    public InstanceSpec noElasticIp(Boolean noElasticIp) {
        this.noElasticIp = noElasticIp;
        return this;
    }


    /**
     * set 使用实例模板创建实例时，如模板中已设置自定义实例标签，期望不使用自定义实例标签时，可通过此参数（&#x60;true&#x60;）实现。
仅在指定 &#x60;agId&#x60; 或指定 &#x60;instanceTemplateId&#x60;，且 &#x60;userTags&#x60; 为空时，此参数(&#x60;true&#x60;)生效。

     *
     * @param noInstanceTags
     */
    public InstanceSpec noInstanceTags(Boolean noInstanceTags) {
        this.noInstanceTags = noInstanceTags;
        return this;
    }


    /**
    * set 自定义实例标签。以key-value键值对形式指定，最多支持10个标签。key不能以 &quot;jrn:&quot; 或“jdc-”开头，仅支持中文、大/小写英文、数字及如下符号：&#x60;\_.,:\/&#x3D;+-@&#x60;。

    *
    * @param userTags
    */
    public InstanceSpec userTags(List<Tag> userTags) {
        this.userTags = userTags;
        return this;
    }


    /**
     * set 停机不计费模式。该参数仅对按配置计费且系统盘为云硬盘的实例生效，并且不是专有宿主机中的实例。配置停机不计费且停机后，实例部分将停止计费，且释放实例自身包含的资源（CPU/内存/GPU/本地数据盘）。
可选值：
&#x60;keepCharging&#x60;（默认值）：停机后保持计费，不释放资源。
&#x60;stopCharging&#x60;：停机后停止计费，释放实例资源。

     *
     * @param chargeOnStopped
     */
    public InstanceSpec chargeOnStopped(String chargeOnStopped) {
        this.chargeOnStopped = chargeOnStopped;
        return this;
    }


    /**
     * set 自动任务策略ID。

     *
     * @param autoImagePolicyId
     */
    public InstanceSpec autoImagePolicyId(String autoImagePolicyId) {
        this.autoImagePolicyId = autoImagePolicyId;
        return this;
    }


    /**
     * set 允许SSH密码登录。
可选值：
&#x60;yes&#x60;（默认值）：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。
仅在指定密钥时此参数有效，指定此参数后密码即使输入也将被忽略，同时会在系统内禁用SSH密码登录。

     *
     * @param passwordAuth
     */
    public InstanceSpec passwordAuth(String passwordAuth) {
        this.passwordAuth = passwordAuth;
        return this;
    }


    /**
     * set 使用镜像中的登录凭证，无须再指定密码或密钥（指定无效）。
可选值：
&#x60;yes&#x60;：使用镜像登录凭证。
&#x60;no&#x60;（默认值）：不使用镜像登录凭证。
仅使用私有或共享镜像时此参数有效。

     *
     * @param imageInherit
     */
    public InstanceSpec imageInherit(String imageInherit) {
        this.imageInherit = imageInherit;
        return this;
    }


    /**
     * set 资源组ID
     *
     * @param resourceGroupId
     */
    public InstanceSpec resourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }


    /**
     * set 虚机CPU拓扑
     *
     * @param cpuTopology
     */
    public InstanceSpec cpuTopology(CpuTopology cpuTopology) {
        this.cpuTopology = cpuTopology;
        return this;
    }



    /**
     * add item to 密钥对名称。仅Linux系统下该参数生效，当前仅支持输入单个密钥。

     *
     * @param keyName
     */
    public void addKeyName(String keyName) {
        if (this.keyNames == null) {
            this.keyNames = new ArrayList<>();
        }
        this.keyNames.add(keyName);
    }

    /**
     * add item to 数据盘配置。单实例最多可挂载云硬盘（系统盘+数据盘）的数量受实例规格的限制。

     *
     * @param dataDisk
     */
    public void addDataDisk(InstanceDiskAttachmentSpec dataDisk) {
        if (this.dataDisks == null) {
            this.dataDisks = new ArrayList<>();
        }
        this.dataDisks.add(dataDisk);
    }

    /**
     * add item to 用户自定义元数据。以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
注意：key不要以连字符(-)结尾，否则此key不生效。

     *
     * @param metadata
     */
    public void addMetadata(Metadata metadata) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadata);
    }

    /**
     * add item to 自定义脚本。目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须 &#x60;base64&#x60; 编码且编码前数据长度不能超过16KB。
**linux系统**：支持 &#x60;bash&#x60; 和 &#x60;python&#x60;，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60;，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

     *
     * @param userdata
     */
    public void addUserdata(Userdata userdata) {
        if (this.userdata == null) {
            this.userdata = new ArrayList<>();
        }
        this.userdata.add(userdata);
    }

    /**
     * add item to 自定义实例标签。以key-value键值对形式指定，最多支持10个标签。key不能以 &quot;jrn:&quot; 或“jdc-”开头，仅支持中文、大/小写英文、数字及如下符号：&#x60;\_.,:\/&#x3D;+-@&#x60;。

     *
     * @param userTag
     */
    public void addUserTag(Tag userTag) {
        if (this.userTags == null) {
            this.userTags = new ArrayList<>();
        }
        this.userTags.add(userTag);
    }
}