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
 * Virtual-Private-Cloud
 * 私有网络相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.service.vpc.model.Vpc;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询虚拟网络信息详情
 */
public class DescribeVpcResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Vpc资源信息
     */
    private Vpc vpc;


    /**
     * get Vpc资源信息
     *
     * @return
     */
    public Vpc getVpc() {
        return vpc;
    }

    /**
     * set Vpc资源信息
     *
     * @param vpc
     */
    public void setVpc(Vpc vpc) {
        this.vpc = vpc;
    }


    /**
     * set Vpc资源信息
     *
     * @param vpc
     */
    public DescribeVpcResult vpc(Vpc vpc) {
        this.vpc = vpc;
        return this;
    }


}