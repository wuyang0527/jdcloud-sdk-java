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

package com.jdcloud.sdk.service.lavm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 
为云主机实例绑定密钥。

详细操作说明请参考帮助文档：[绑定密钥](https://docs.jdcloud.com/cn/virtual-machines/bind-keypair)

## 接口说明
- 只支持为 linux 云主机实例绑定密钥。
- 每台云主机实例只支持绑定一个密钥。如果云主机绑定的密钥被删除了，那么该云主机还可以再次绑定密钥。

 */
public class AttachKeypairResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * successInstanceId
     */
    
    private List<String> successInstanceId;
    /**
     * failInstanceId
     */
    
    private List<String> failInstanceId;


    /**
    * get successInstanceId
    *
    * @return
    */
    public List<String> getSuccessInstanceId() {
        return successInstanceId;
    }

    /**
    * set successInstanceId
    *
    * @param successInstanceId
    */
    public void setSuccessInstanceId(List<String> successInstanceId) {
        this.successInstanceId = successInstanceId;
    }


    /**
    * get failInstanceId
    *
    * @return
    */
    public List<String> getFailInstanceId() {
        return failInstanceId;
    }

    /**
    * set failInstanceId
    *
    * @param failInstanceId
    */
    public void setFailInstanceId(List<String> failInstanceId) {
        this.failInstanceId = failInstanceId;
    }



    /**
    * set successInstanceId
    *
    * @param successInstanceId
    */
    public AttachKeypairResult successInstanceId(List<String> successInstanceId) {
        this.successInstanceId = successInstanceId;
        return this;
    }


    /**
    * set failInstanceId
    *
    * @param failInstanceId
    */
    public AttachKeypairResult failInstanceId(List<String> failInstanceId) {
        this.failInstanceId = failInstanceId;
        return this;
    }



    /**
     * add item to successInstanceId
     *
     * @param successInstanceId
     */
    public void addSuccessInstanceId(String successInstanceId) {
        if (this.successInstanceId == null) {
            this.successInstanceId = new ArrayList<>();
        }
        this.successInstanceId.add(successInstanceId);
    }

    /**
     * add item to failInstanceId
     *
     * @param failInstanceId
     */
    public void addFailInstanceId(String failInstanceId) {
        if (this.failInstanceId == null) {
            this.failInstanceId = new ArrayList<>();
        }
        this.failInstanceId.add(failInstanceId);
    }
}