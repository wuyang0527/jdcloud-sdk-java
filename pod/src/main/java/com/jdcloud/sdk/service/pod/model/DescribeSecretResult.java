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
 * 镜像仓库认证信息
 * 关于镜像仓库认证信息的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.service.pod.model.Secret;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询单个 secret 详情

 */
public class DescribeSecretResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * secret
     */
    private Secret secret;



    /**
     * get secret
     *
     * @return
     */
    public Secret getSecret() {
        return secret;
    }

    /**
     * set secret
     *
     * @param secret
     */
    public void setSecret(Secret secret) {
        this.secret = secret;
    }



    /**
     * set secret
     *
     * @param secret
     */
    public DescribeSecretResult secret(Secret secret) {
        this.secret = secret;
        return this;
    }


}