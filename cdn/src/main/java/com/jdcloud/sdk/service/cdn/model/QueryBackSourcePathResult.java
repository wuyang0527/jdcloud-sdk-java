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
 * 域名操作类接口
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
import com.jdcloud.sdk.service.cdn.model.ConfigBackSourcePathItems;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询回源path
 */
public class QueryBackSourcePathResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 加速域名
     */
    private String domain;

    /**
     * 配置信息
     */
    private List<ConfigBackSourcePathItems> configs;


    /**
     * get 加速域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 加速域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get 配置信息
     *
     * @return
     */
    public List<ConfigBackSourcePathItems> getConfigs() {
        return configs;
    }

    /**
     * set 配置信息
     *
     * @param configs
     */
    public void setConfigs(List<ConfigBackSourcePathItems> configs) {
        this.configs = configs;
    }


    /**
     * set 加速域名
     *
     * @param domain
     */
    public QueryBackSourcePathResult domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 配置信息
     *
     * @param configs
     */
    public QueryBackSourcePathResult configs(List<ConfigBackSourcePathItems> configs) {
        this.configs = configs;
        return this;
    }


    /**
     * add item to 配置信息
     *
     * @param config
     */
    public void addConfig(ConfigBackSourcePathItems config) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        this.configs.add(config);
    }

}