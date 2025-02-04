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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
修改云主机密码。

详细操作说明请参考帮助文档：[重置密码](https://docs.jdcloud.com/cn/virtual-machines/reset-password)

## 接口说明
- 实例没有正在进行中的任务时才可操作。
- 重置密码后，需要重启云主机后生效。

 */
public class ModifyInstancePasswordRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例密码。
可用于SSH登录和VNC登录。
长度为8\~30个字符，必须同时包含大、小写英文字母、数字和特殊符号中的三类字符。特殊符号包括：&#x60;\(\)\&#x60;~!@#$%^&amp;\*\_-+&#x3D;\|{}\[ ]:&quot;;&#39;&lt;&gt;,.?/，&#x60;。
更多密码输入要求请参见 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。

     * Required:true
     */
    @Required
    private String password;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云主机ID。
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 实例密码。
可用于SSH登录和VNC登录。
长度为8\~30个字符，必须同时包含大、小写英文字母、数字和特殊符号中的三类字符。特殊符号包括：&#x60;\(\)\&#x60;~!@#$%^&amp;\*\_-+&#x3D;\|{}\[ ]:&quot;;&#39;&lt;&gt;,.?/，&#x60;。
更多密码输入要求请参见 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。

     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 实例密码。
可用于SSH登录和VNC登录。
长度为8\~30个字符，必须同时包含大、小写英文字母、数字和特殊符号中的三类字符。特殊符号包括：&#x60;\(\)\&#x60;~!@#$%^&amp;\*\_-+&#x3D;\|{}\[ ]:&quot;;&#39;&lt;&gt;,.?/，&#x60;。
更多密码输入要求请参见 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。

     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get 地域ID。
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 云主机ID。
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机ID。
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 实例密码。
可用于SSH登录和VNC登录。
长度为8\~30个字符，必须同时包含大、小写英文字母、数字和特殊符号中的三类字符。特殊符号包括：&#x60;\(\)\&#x60;~!@#$%^&amp;\*\_-+&#x3D;\|{}\[ ]:&quot;;&#39;&lt;&gt;,.?/，&#x60;。
更多密码输入要求请参见 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。

     *
     * @param password
     */
    public ModifyInstancePasswordRequest password(String password) {
        this.password = password;
        return this;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public ModifyInstancePasswordRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 云主机ID。
     *
     * @param instanceId
     */
    public ModifyInstancePasswordRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}