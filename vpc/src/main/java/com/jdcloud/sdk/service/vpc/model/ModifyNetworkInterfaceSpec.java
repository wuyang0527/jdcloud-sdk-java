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

import java.util.List;
import java.util.ArrayList;

/**
 * modifyNetworkInterfaceSpec
 */
public class ModifyNetworkInterfaceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性网卡名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     */
    private String networkInterfaceName;

    /**
     * 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * 以覆盖原有安全组的方式更新的安全组。如果更新安全组ID列表，最多5个安全组
     */
    
    private List<String> securityGroups;


    /**
     * get 弹性网卡名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @return
     */
    public String getNetworkInterfaceName() {
        return networkInterfaceName;
    }

    /**
     * set 弹性网卡名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param networkInterfaceName
     */
    public void setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
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
    * get 以覆盖原有安全组的方式更新的安全组。如果更新安全组ID列表，最多5个安全组
    *
    * @return
    */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
    * set 以覆盖原有安全组的方式更新的安全组。如果更新安全组ID列表，最多5个安全组
    *
    * @param securityGroups
    */
    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }



    /**
     * set 弹性网卡名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param networkInterfaceName
     */
    public ModifyNetworkInterfaceSpec networkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }


    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public ModifyNetworkInterfaceSpec description(String description) {
        this.description = description;
        return this;
    }


    /**
    * set 以覆盖原有安全组的方式更新的安全组。如果更新安全组ID列表，最多5个安全组
    *
    * @param securityGroups
    */
    public ModifyNetworkInterfaceSpec securityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }



    /**
     * add item to 以覆盖原有安全组的方式更新的安全组。如果更新安全组ID列表，最多5个安全组
     *
     * @param securityGroup
     */
    public void addSecurityGroup(String securityGroup) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroup);
    }
}