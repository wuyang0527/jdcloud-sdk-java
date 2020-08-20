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


/**
 * ruleSpec
 */
public class RuleSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名，用于匹配URL的host字段,支持输入IPv4地址和域名。域名支持精确匹配和通配符匹配：1、仅支持输入大小写字母、数字、英文中划线“-”和点“.”，最少包括一个点&quot;.&quot;，不能以点&quot;.&quot;和中划线&quot;-&quot;开头或结尾，中划线&quot;-&quot;前后不能为点&quot;.&quot;，不区分大小写，且不能超过110字符；2、通配符匹配支持包括一个星&quot;\*&quot;，输入格式为\*.XXX或XXX.\*，不支持仅输入一个星“\*”。 host和path至少配置其一，host缺省为空（含义是匹配所有） ，path缺省为/\*（含义是匹配所有）
     */
    private String host;

    /**
     * URL访问路径，用于匹配URL的path字段。URL路径支持精确匹配和前缀匹配：1、必须以/开头，仅支持输入大小写字母、数字和特殊字符：$-_.+!&#39;()%:@&amp;&#x3D;/，区分大小写，且不能超过128字符；2、前缀匹配支持包括一个星&quot;\*&quot;，输入格式为/XXX\*或/\*，仅输入&quot;/&quot;表示精确匹配。 host和path至少配置其一，host缺省为空（含义是匹配所有） ，path缺省为/\*（含义是匹配所有）
     */
    private String path;

    /**
     * 匹配转发规则后执行的动作，取值为Forward或Redirect。默认为Forward
     */
    private String action;

    /**
     * 后端服务的Id。当action选择Forward时需配置本参数
     */
    private String backendId;

    /**
     * 重定向动作配置。当action选择Redirect时需配置本参数，且重定向配置参数protocol、port、host、path和query至少配置其一
     */
    private RedirectActionSpec redirectActionSpec;


    /**
     * get 域名，用于匹配URL的host字段,支持输入IPv4地址和域名。域名支持精确匹配和通配符匹配：1、仅支持输入大小写字母、数字、英文中划线“-”和点“.”，最少包括一个点&quot;.&quot;，不能以点&quot;.&quot;和中划线&quot;-&quot;开头或结尾，中划线&quot;-&quot;前后不能为点&quot;.&quot;，不区分大小写，且不能超过110字符；2、通配符匹配支持包括一个星&quot;\*&quot;，输入格式为\*.XXX或XXX.\*，不支持仅输入一个星“\*”。 host和path至少配置其一，host缺省为空（含义是匹配所有） ，path缺省为/\*（含义是匹配所有）
     *
     * @return
     */
    public String getHost() {
        return host;
    }

    /**
     * set 域名，用于匹配URL的host字段,支持输入IPv4地址和域名。域名支持精确匹配和通配符匹配：1、仅支持输入大小写字母、数字、英文中划线“-”和点“.”，最少包括一个点&quot;.&quot;，不能以点&quot;.&quot;和中划线&quot;-&quot;开头或结尾，中划线&quot;-&quot;前后不能为点&quot;.&quot;，不区分大小写，且不能超过110字符；2、通配符匹配支持包括一个星&quot;\*&quot;，输入格式为\*.XXX或XXX.\*，不支持仅输入一个星“\*”。 host和path至少配置其一，host缺省为空（含义是匹配所有） ，path缺省为/\*（含义是匹配所有）
     *
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * get URL访问路径，用于匹配URL的path字段。URL路径支持精确匹配和前缀匹配：1、必须以/开头，仅支持输入大小写字母、数字和特殊字符：$-_.+!&#39;()%:@&amp;&#x3D;/，区分大小写，且不能超过128字符；2、前缀匹配支持包括一个星&quot;\*&quot;，输入格式为/XXX\*或/\*，仅输入&quot;/&quot;表示精确匹配。 host和path至少配置其一，host缺省为空（含义是匹配所有） ，path缺省为/\*（含义是匹配所有）
     *
     * @return
     */
    public String getPath() {
        return path;
    }

    /**
     * set URL访问路径，用于匹配URL的path字段。URL路径支持精确匹配和前缀匹配：1、必须以/开头，仅支持输入大小写字母、数字和特殊字符：$-_.+!&#39;()%:@&amp;&#x3D;/，区分大小写，且不能超过128字符；2、前缀匹配支持包括一个星&quot;\*&quot;，输入格式为/XXX\*或/\*，仅输入&quot;/&quot;表示精确匹配。 host和path至少配置其一，host缺省为空（含义是匹配所有） ，path缺省为/\*（含义是匹配所有）
     *
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * get 匹配转发规则后执行的动作，取值为Forward或Redirect。默认为Forward
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 匹配转发规则后执行的动作，取值为Forward或Redirect。默认为Forward
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get 后端服务的Id。当action选择Forward时需配置本参数
     *
     * @return
     */
    public String getBackendId() {
        return backendId;
    }

    /**
     * set 后端服务的Id。当action选择Forward时需配置本参数
     *
     * @param backendId
     */
    public void setBackendId(String backendId) {
        this.backendId = backendId;
    }

    /**
     * get 重定向动作配置。当action选择Redirect时需配置本参数，且重定向配置参数protocol、port、host、path和query至少配置其一
     *
     * @return
     */
    public RedirectActionSpec getRedirectActionSpec() {
        return redirectActionSpec;
    }

    /**
     * set 重定向动作配置。当action选择Redirect时需配置本参数，且重定向配置参数protocol、port、host、path和query至少配置其一
     *
     * @param redirectActionSpec
     */
    public void setRedirectActionSpec(RedirectActionSpec redirectActionSpec) {
        this.redirectActionSpec = redirectActionSpec;
    }


    /**
     * set 域名，用于匹配URL的host字段,支持输入IPv4地址和域名。域名支持精确匹配和通配符匹配：1、仅支持输入大小写字母、数字、英文中划线“-”和点“.”，最少包括一个点&quot;.&quot;，不能以点&quot;.&quot;和中划线&quot;-&quot;开头或结尾，中划线&quot;-&quot;前后不能为点&quot;.&quot;，不区分大小写，且不能超过110字符；2、通配符匹配支持包括一个星&quot;\*&quot;，输入格式为\*.XXX或XXX.\*，不支持仅输入一个星“\*”。 host和path至少配置其一，host缺省为空（含义是匹配所有） ，path缺省为/\*（含义是匹配所有）
     *
     * @param host
     */
    public RuleSpec host(String host) {
        this.host = host;
        return this;
    }

    /**
     * set URL访问路径，用于匹配URL的path字段。URL路径支持精确匹配和前缀匹配：1、必须以/开头，仅支持输入大小写字母、数字和特殊字符：$-_.+!&#39;()%:@&amp;&#x3D;/，区分大小写，且不能超过128字符；2、前缀匹配支持包括一个星&quot;\*&quot;，输入格式为/XXX\*或/\*，仅输入&quot;/&quot;表示精确匹配。 host和path至少配置其一，host缺省为空（含义是匹配所有） ，path缺省为/\*（含义是匹配所有）
     *
     * @param path
     */
    public RuleSpec path(String path) {
        this.path = path;
        return this;
    }

    /**
     * set 匹配转发规则后执行的动作，取值为Forward或Redirect。默认为Forward
     *
     * @param action
     */
    public RuleSpec action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set 后端服务的Id。当action选择Forward时需配置本参数
     *
     * @param backendId
     */
    public RuleSpec backendId(String backendId) {
        this.backendId = backendId;
        return this;
    }

    /**
     * set 重定向动作配置。当action选择Redirect时需配置本参数，且重定向配置参数protocol、port、host、path和query至少配置其一
     *
     * @param redirectActionSpec
     */
    public RuleSpec redirectActionSpec(RedirectActionSpec redirectActionSpec) {
        this.redirectActionSpec = redirectActionSpec;
        return this;
    }


}