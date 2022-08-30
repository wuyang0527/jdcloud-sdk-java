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
 * SCDN相关接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 启用CC防护规则
 */
public class EnableCCProtectRuleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ids
     */
    
    private List<String> ids;
    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;



    /**
    * get ids
    *
    * @return
    */
    public List<String> getIds() {
        return ids;
    }

    /**
    * set ids
    *
    * @param ids
    */
    public void setIds(List<String> ids) {
        this.ids = ids;
    }


    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }



    /**
    * set ids
    *
    * @param ids
    */
    public EnableCCProtectRuleRequest ids(List<String> ids) {
        this.ids = ids;
        return this;
    }


    /**
     * set 用户域名
     *
     * @param domain
     */
    public EnableCCProtectRuleRequest domain(String domain) {
        this.domain = domain;
        return this;
    }



    /**
     * add item to ids
     *
     * @param id
     */
    public void addId(String id) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(id);
    }
}