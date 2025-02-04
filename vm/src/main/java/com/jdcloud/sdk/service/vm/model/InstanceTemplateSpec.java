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

/**
 * 实例模板配置详细信息。
 */
public class InstanceTemplateSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例规格，可查询 [DescribeInstanceTypes](https://docs.jdcloud.com/virtual-machines/api/describeinstancetypes) 接口获得指定地域或可用区的规格信息。
     * Required:true
     */
    @Required
    private String instanceType;

    /**
     * 镜像ID，可查询 [DescribeImages](https://docs.jdcloud.com/virtual-machines/api/describeimages) 接口获得指定地域的镜像信息。
     * Required:true
     */
    @Required
    private String imageId;

    /**
     * 实例密码。可用于SSH登录和VNC登录。长度为8\~30个字符，必须同时包含大、小写英文字母、数字和特殊符号中的三类字符。特殊符号包括：\(\)\&#x60;~!@#$%^&amp;\*\_-+&#x3D;\|{}\[ ]:&quot;;&#39;&lt;&gt;,.?/，更多密码输入要求请参见 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
如指定密钥且 &#x60;passwordAuth&#x60; 设置为 &#x60;true&#x60;，则密码不会生成注入，否则即使不指定密码系统也将默认自动生成随机密码，并以短信和邮件通知。

     */
    private String password;

    /**
     * 密钥对名称。仅Linux系统下该参数生效，当前仅支持输入单个密钥。
     */
    private List<String> keyNames;

    /**
     * 用户自定义元数据。以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持20对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
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
     * 主网卡主IP关联的弹性公网IP配置。
     */
    private InstanceTemplateElasticIpSpec elasticIp;

    /**
     * 主网卡配置。
     * Required:true
     */
    @Required
    private InstanceTemplateNetworkInterfaceAttachmentSpec primaryNetworkInterface;

    /**
     * 系统盘配置。
     */
    private InstanceTemplateDiskAttachmentSpec systemDisk;

    /**
     * 数据盘配置。单实例最多可挂载云硬盘（系统盘+数据盘）的数量受实例规格的限制。
     */
    private List<InstanceTemplateDiskAttachmentSpec> dataDisks;

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
     * 是否允许SSH密码登录。
&#x60;yes&#x60;：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。
仅在指定密钥时此参数有效，指定此参数后密码即使输入也将被忽略，同时会在系统内禁用SSH密码登录。

     */
    private String passWordAuth;

    /**
     * 是否使用镜像中的登录凭证，不再指定密码或密钥。
&#x60;yes&#x60;：使用镜像登录凭证。
&#x60;no&#x60;（默认值）：不使用镜像登录凭证。
仅使用私有或共享镜像时此参数有效。若指定&#x60;imageInherit&#x3D;yes&#x60;则指定的密码或密钥将无效。
     */
    private String imageInherit;


    /**
     * get 实例规格，可查询 [DescribeInstanceTypes](https://docs.jdcloud.com/virtual-machines/api/describeinstancetypes) 接口获得指定地域或可用区的规格信息。
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例规格，可查询 [DescribeInstanceTypes](https://docs.jdcloud.com/virtual-machines/api/describeinstancetypes) 接口获得指定地域或可用区的规格信息。
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 镜像ID，可查询 [DescribeImages](https://docs.jdcloud.com/virtual-machines/api/describeimages) 接口获得指定地域的镜像信息。
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID，可查询 [DescribeImages](https://docs.jdcloud.com/virtual-machines/api/describeimages) 接口获得指定地域的镜像信息。
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * get 实例密码。可用于SSH登录和VNC登录。长度为8\~30个字符，必须同时包含大、小写英文字母、数字和特殊符号中的三类字符。特殊符号包括：\(\)\&#x60;~!@#$%^&amp;\*\_-+&#x3D;\|{}\[ ]:&quot;;&#39;&lt;&gt;,.?/，更多密码输入要求请参见 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
如指定密钥且 &#x60;passwordAuth&#x60; 设置为 &#x60;true&#x60;，则密码不会生成注入，否则即使不指定密码系统也将默认自动生成随机密码，并以短信和邮件通知。

     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 实例密码。可用于SSH登录和VNC登录。长度为8\~30个字符，必须同时包含大、小写英文字母、数字和特殊符号中的三类字符。特殊符号包括：\(\)\&#x60;~!@#$%^&amp;\*\_-+&#x3D;\|{}\[ ]:&quot;;&#39;&lt;&gt;,.?/，更多密码输入要求请参见 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
如指定密钥且 &#x60;passwordAuth&#x60; 设置为 &#x60;true&#x60;，则密码不会生成注入，否则即使不指定密码系统也将默认自动生成随机密码，并以短信和邮件通知。

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
     * get 用户自定义元数据。以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持20对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
注意：key不要以连字符(-)结尾，否则此key不生效。

     *
     * @return
     */
    public List<Metadata> getMetadata() {
        return metadata;
    }

    /**
     * set 用户自定义元数据。以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持20对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
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
     * get 主网卡主IP关联的弹性公网IP配置。
     *
     * @return
     */
    public InstanceTemplateElasticIpSpec getElasticIp() {
        return elasticIp;
    }

    /**
     * set 主网卡主IP关联的弹性公网IP配置。
     *
     * @param elasticIp
     */
    public void setElasticIp(InstanceTemplateElasticIpSpec elasticIp) {
        this.elasticIp = elasticIp;
    }

    /**
     * get 主网卡配置。
     *
     * @return
     */
    public InstanceTemplateNetworkInterfaceAttachmentSpec getPrimaryNetworkInterface() {
        return primaryNetworkInterface;
    }

    /**
     * set 主网卡配置。
     *
     * @param primaryNetworkInterface
     */
    public void setPrimaryNetworkInterface(InstanceTemplateNetworkInterfaceAttachmentSpec primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
    }

    /**
     * get 系统盘配置。
     *
     * @return
     */
    public InstanceTemplateDiskAttachmentSpec getSystemDisk() {
        return systemDisk;
    }

    /**
     * set 系统盘配置。
     *
     * @param systemDisk
     */
    public void setSystemDisk(InstanceTemplateDiskAttachmentSpec systemDisk) {
        this.systemDisk = systemDisk;
    }

    /**
     * get 数据盘配置。单实例最多可挂载云硬盘（系统盘+数据盘）的数量受实例规格的限制。
     *
     * @return
     */
    public List<InstanceTemplateDiskAttachmentSpec> getDataDisks() {
        return dataDisks;
    }

    /**
     * set 数据盘配置。单实例最多可挂载云硬盘（系统盘+数据盘）的数量受实例规格的限制。
     *
     * @param dataDisks
     */
    public void setDataDisks(List<InstanceTemplateDiskAttachmentSpec> dataDisks) {
        this.dataDisks = dataDisks;
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
     * get 是否允许SSH密码登录。
&#x60;yes&#x60;：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。
仅在指定密钥时此参数有效，指定此参数后密码即使输入也将被忽略，同时会在系统内禁用SSH密码登录。

     *
     * @return
     */
    public String getPassWordAuth() {
        return passWordAuth;
    }

    /**
     * set 是否允许SSH密码登录。
&#x60;yes&#x60;：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。
仅在指定密钥时此参数有效，指定此参数后密码即使输入也将被忽略，同时会在系统内禁用SSH密码登录。

     *
     * @param passWordAuth
     */
    public void setPassWordAuth(String passWordAuth) {
        this.passWordAuth = passWordAuth;
    }

    /**
     * get 是否使用镜像中的登录凭证，不再指定密码或密钥。
&#x60;yes&#x60;：使用镜像登录凭证。
&#x60;no&#x60;（默认值）：不使用镜像登录凭证。
仅使用私有或共享镜像时此参数有效。若指定&#x60;imageInherit&#x3D;yes&#x60;则指定的密码或密钥将无效。
     *
     * @return
     */
    public String getImageInherit() {
        return imageInherit;
    }

    /**
     * set 是否使用镜像中的登录凭证，不再指定密码或密钥。
&#x60;yes&#x60;：使用镜像登录凭证。
&#x60;no&#x60;（默认值）：不使用镜像登录凭证。
仅使用私有或共享镜像时此参数有效。若指定&#x60;imageInherit&#x3D;yes&#x60;则指定的密码或密钥将无效。
     *
     * @param imageInherit
     */
    public void setImageInherit(String imageInherit) {
        this.imageInherit = imageInherit;
    }


    /**
     * set 实例规格，可查询 [DescribeInstanceTypes](https://docs.jdcloud.com/virtual-machines/api/describeinstancetypes) 接口获得指定地域或可用区的规格信息。
     *
     * @param instanceType
     */
    public InstanceTemplateSpec instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 镜像ID，可查询 [DescribeImages](https://docs.jdcloud.com/virtual-machines/api/describeimages) 接口获得指定地域的镜像信息。
     *
     * @param imageId
     */
    public InstanceTemplateSpec imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * set 实例密码。可用于SSH登录和VNC登录。长度为8\~30个字符，必须同时包含大、小写英文字母、数字和特殊符号中的三类字符。特殊符号包括：\(\)\&#x60;~!@#$%^&amp;\*\_-+&#x3D;\|{}\[ ]:&quot;;&#39;&lt;&gt;,.?/，更多密码输入要求请参见 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
如指定密钥且 &#x60;passwordAuth&#x60; 设置为 &#x60;true&#x60;，则密码不会生成注入，否则即使不指定密码系统也将默认自动生成随机密码，并以短信和邮件通知。

     *
     * @param password
     */
    public InstanceTemplateSpec password(String password) {
        this.password = password;
        return this;
    }

    /**
     * set 密钥对名称。仅Linux系统下该参数生效，当前仅支持输入单个密钥。
     *
     * @param keyNames
     */
    public InstanceTemplateSpec keyNames(List<String> keyNames) {
        this.keyNames = keyNames;
        return this;
    }

    /**
     * set 用户自定义元数据。以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持20对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
注意：key不要以连字符(-)结尾，否则此key不生效。

     *
     * @param metadata
     */
    public InstanceTemplateSpec metadata(List<Metadata> metadata) {
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
    public InstanceTemplateSpec userdata(List<Userdata> userdata) {
        this.userdata = userdata;
        return this;
    }

    /**
     * set 主网卡主IP关联的弹性公网IP配置。
     *
     * @param elasticIp
     */
    public InstanceTemplateSpec elasticIp(InstanceTemplateElasticIpSpec elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }

    /**
     * set 主网卡配置。
     *
     * @param primaryNetworkInterface
     */
    public InstanceTemplateSpec primaryNetworkInterface(InstanceTemplateNetworkInterfaceAttachmentSpec primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
        return this;
    }

    /**
     * set 系统盘配置。
     *
     * @param systemDisk
     */
    public InstanceTemplateSpec systemDisk(InstanceTemplateDiskAttachmentSpec systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }

    /**
     * set 数据盘配置。单实例最多可挂载云硬盘（系统盘+数据盘）的数量受实例规格的限制。
     *
     * @param dataDisks
     */
    public InstanceTemplateSpec dataDisks(List<InstanceTemplateDiskAttachmentSpec> dataDisks) {
        this.dataDisks = dataDisks;
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
    public InstanceTemplateSpec chargeOnStopped(String chargeOnStopped) {
        this.chargeOnStopped = chargeOnStopped;
        return this;
    }

    /**
     * set 自动任务策略ID。
     *
     * @param autoImagePolicyId
     */
    public InstanceTemplateSpec autoImagePolicyId(String autoImagePolicyId) {
        this.autoImagePolicyId = autoImagePolicyId;
        return this;
    }

    /**
     * set 是否允许SSH密码登录。
&#x60;yes&#x60;：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。
仅在指定密钥时此参数有效，指定此参数后密码即使输入也将被忽略，同时会在系统内禁用SSH密码登录。

     *
     * @param passWordAuth
     */
    public InstanceTemplateSpec passWordAuth(String passWordAuth) {
        this.passWordAuth = passWordAuth;
        return this;
    }

    /**
     * set 是否使用镜像中的登录凭证，不再指定密码或密钥。
&#x60;yes&#x60;：使用镜像登录凭证。
&#x60;no&#x60;（默认值）：不使用镜像登录凭证。
仅使用私有或共享镜像时此参数有效。若指定&#x60;imageInherit&#x3D;yes&#x60;则指定的密码或密钥将无效。
     *
     * @param imageInherit
     */
    public InstanceTemplateSpec imageInherit(String imageInherit) {
        this.imageInherit = imageInherit;
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
     * add item to 用户自定义元数据。以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持20对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
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
     * add item to 数据盘配置。单实例最多可挂载云硬盘（系统盘+数据盘）的数量受实例规格的限制。
     *
     * @param dataDisk
     */
    public void addDataDisk(InstanceTemplateDiskAttachmentSpec dataDisk) {
        if (this.dataDisks == null) {
            this.dataDisks = new ArrayList<>();
        }
        this.dataDisks.add(dataDisk);
    }

}