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

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * createVpcPeeringSpec
 */
public class CreateVpcPeeringSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * VpcPeering的名字,不为空。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     * Required:true
     */
    @Required
    private String vpcPeeringName;

    /**
     * VpcPeering本端Vpc的Id
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * VpcPeering对端Vpc的Id
     * Required:true
     */
    @Required
    private String remoteVpcId;

    /**
     * VpcPeering 描述，取值范围：0-256个中文、英文大小写的字母、数字和下划线分隔符
     */
    private String description;



    /**
     * get VpcPeering的名字,不为空。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @return
     */
    public String getVpcPeeringName() {
        return vpcPeeringName;
    }

    /**
     * set VpcPeering的名字,不为空。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param vpcPeeringName
     */
    public void setVpcPeeringName(String vpcPeeringName) {
        this.vpcPeeringName = vpcPeeringName;
    }


    /**
     * get VpcPeering本端Vpc的Id
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set VpcPeering本端Vpc的Id
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }


    /**
     * get VpcPeering对端Vpc的Id
     *
     * @return
     */
    public String getRemoteVpcId() {
        return remoteVpcId;
    }

    /**
     * set VpcPeering对端Vpc的Id
     *
     * @param remoteVpcId
     */
    public void setRemoteVpcId(String remoteVpcId) {
        this.remoteVpcId = remoteVpcId;
    }


    /**
     * get VpcPeering 描述，取值范围：0-256个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set VpcPeering 描述，取值范围：0-256个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }



    /**
     * set VpcPeering的名字,不为空。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param vpcPeeringName
     */
    public CreateVpcPeeringSpec vpcPeeringName(String vpcPeeringName) {
        this.vpcPeeringName = vpcPeeringName;
        return this;
    }


    /**
     * set VpcPeering本端Vpc的Id
     *
     * @param vpcId
     */
    public CreateVpcPeeringSpec vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }


    /**
     * set VpcPeering对端Vpc的Id
     *
     * @param remoteVpcId
     */
    public CreateVpcPeeringSpec remoteVpcId(String remoteVpcId) {
        this.remoteVpcId = remoteVpcId;
        return this;
    }


    /**
     * set VpcPeering 描述，取值范围：0-256个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param description
     */
    public CreateVpcPeeringSpec description(String description) {
        this.description = description;
        return this;
    }


}