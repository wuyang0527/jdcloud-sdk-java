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
 * DmsMeta
 * 获取库表元数据
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取Dms域名
 */
public class GetDmsDomainResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 区域到域名映射，例{&quot;cn-north-1&quot;:&quot;http://10.222.49.154:8080&quot;, &quot;cn-east-1&quot;:&quot;http://10.222.49.154:8080&quot;}。
     */
    private Object domains;


    /**
     * get 区域到域名映射，例{&quot;cn-north-1&quot;:&quot;http://10.222.49.154:8080&quot;, &quot;cn-east-1&quot;:&quot;http://10.222.49.154:8080&quot;}。
     *
     * @return
     */
    public Object getDomains() {
        return domains;
    }

    /**
     * set 区域到域名映射，例{&quot;cn-north-1&quot;:&quot;http://10.222.49.154:8080&quot;, &quot;cn-east-1&quot;:&quot;http://10.222.49.154:8080&quot;}。
     *
     * @param domains
     */
    public void setDomains(Object domains) {
        this.domains = domains;
    }


    /**
     * set 区域到域名映射，例{&quot;cn-north-1&quot;:&quot;http://10.222.49.154:8080&quot;, &quot;cn-east-1&quot;:&quot;http://10.222.49.154:8080&quot;}。
     *
     * @param domains
     */
    public GetDmsDomainResult domains(Object domains) {
        this.domains = domains;
        return this;
    }


}