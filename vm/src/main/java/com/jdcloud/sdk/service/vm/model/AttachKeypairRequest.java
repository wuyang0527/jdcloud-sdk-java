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
 * SSH密钥对
 * 关于SSH密钥对的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
为云主机实例绑定密钥。

详细操作说明请参考帮助文档：[绑定密钥](https://docs.jdcloud.com/cn/virtual-machines/bind-keypair)

## 接口说明
- 只支持为 linux 云主机实例绑定密钥。
- 每台云主机实例只支持绑定一个密钥。如果云主机绑定的密钥被删除了，那么该云主机还可以再次绑定密钥。

 */
public class AttachKeypairRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 要绑定的云主机Id列表。
     * Required:true
     */
    @Required
    private List<String> instanceIds;

    /**
     * 绑定密钥后，根据此参数决定是否允许使用密码登录。可选范围：
&#x60;yes&#x60;：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。

     * Required:true
     */
    @Required
    private String passWordAuth;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 密钥名称。
     * Required:true
     */
    @Required
    private String keyName;


    /**
     * get 要绑定的云主机Id列表。
     *
     * @return
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    /**
     * set 要绑定的云主机Id列表。
     *
     * @param instanceIds
     */
    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    /**
     * get 绑定密钥后，根据此参数决定是否允许使用密码登录。可选范围：
&#x60;yes&#x60;：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。

     *
     * @return
     */
    public String getPassWordAuth() {
        return passWordAuth;
    }

    /**
     * set 绑定密钥后，根据此参数决定是否允许使用密码登录。可选范围：
&#x60;yes&#x60;：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。

     *
     * @param passWordAuth
     */
    public void setPassWordAuth(String passWordAuth) {
        this.passWordAuth = passWordAuth;
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
     * get 密钥名称。
     *
     * @return
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * set 密钥名称。
     *
     * @param keyName
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }


    /**
     * set 要绑定的云主机Id列表。
     *
     * @param instanceIds
     */
    public AttachKeypairRequest instanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    /**
     * set 绑定密钥后，根据此参数决定是否允许使用密码登录。可选范围：
&#x60;yes&#x60;：允许SSH密码登录。
&#x60;no&#x60;：禁止SSH密码登录。

     *
     * @param passWordAuth
     */
    public AttachKeypairRequest passWordAuth(String passWordAuth) {
        this.passWordAuth = passWordAuth;
        return this;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public AttachKeypairRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 密钥名称。
     *
     * @param keyName
     */
    public AttachKeypairRequest keyName(String keyName) {
        this.keyName = keyName;
        return this;
    }


    /**
     * add item to 要绑定的云主机Id列表。
     *
     * @param instanceId
     */
    public void addInstanceId(String instanceId) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceId);
    }

}