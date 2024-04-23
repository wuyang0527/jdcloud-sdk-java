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

package com.jdcloud.sdk.service.lb.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * createTargetGroupSpec
 */
public class CreateTargetGroupSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 虚拟服务器组名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     * Required:true
     */
    @Required
    private String targetGroupName;

    /**
     * 负载均衡的Id
     * Required:true
     */
    @Required
    private String loadBalancerId;

    /**
     * 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * 类型，取值为instance或ip
     */
    private String type;



    /**
     * get 虚拟服务器组名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @return
     */
    public String getTargetGroupName() {
        return targetGroupName;
    }

    /**
     * set 虚拟服务器组名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param targetGroupName
     */
    public void setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
    }


    /**
     * get 负载均衡的Id
     *
     * @return
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /**
     * set 负载均衡的Id
     *
     * @param loadBalancerId
     */
    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
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
     * get 类型，取值为instance或ip
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 类型，取值为instance或ip
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }



    /**
     * set 虚拟服务器组名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param targetGroupName
     */
    public CreateTargetGroupSpec targetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
        return this;
    }


    /**
     * set 负载均衡的Id
     *
     * @param loadBalancerId
     */
    public CreateTargetGroupSpec loadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }


    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public CreateTargetGroupSpec description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 类型，取值为instance或ip
     *
     * @param type
     */
    public CreateTargetGroupSpec type(String type) {
        this.type = type;
        return this;
    }


}