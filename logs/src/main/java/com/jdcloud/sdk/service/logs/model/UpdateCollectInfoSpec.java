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

package com.jdcloud.sdk.service.logs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * updateCollectInfoSpec
 */
public class UpdateCollectInfoSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 高可用组资源
     */
    private List<AgResource> agResource;

    /**
     * 采集状态，0-禁用，1-启用
     * Required:true
     */
    @Required
    private Boolean enabled;

    /**
     * 过滤器是否启用。当appcode为custom时必填
     */
    private Boolean filterEnabled;

    /**
     * 自定义日志转发目的地, 只支持业务应用日志。支持类型：&quot;kafka&quot;，&quot;es&quot;
     */
    private String logCustomTarget;

    /**
     * 自定义日志转发目的地配置，KV 结构，具体配置参考 LogCustomTargetKafkaConf 和 LogCustomTargetEsConf
     */
    private Object logCustomTargetConf;

    /**
     * 日志文件名。当appcode为custom时为必填。日志文件名支持正则表达式。
     */
    private String logFile;

    /**
     * 过滤器。设置过滤器后可根据用户设定的关键词采集部分日志，如仅采集 Error 的日志。目前最大允许5个。
     */
    private List<String> logFilters;

    /**
     * 日志路径。当appcode为custom时为必填。目前仅支持对 Linux 云主机上的日志进行采集，路径支持通配符“*”和“？”，文件路径应符合 Linux 的文件路径规则
     */
    private String logPath;

    /**
     * 目的地是否是日志服务logtopic，只支持业务应用日志
     */
    private Boolean logtopicEnabled;

    /**
     * 首行正则
     */
    private String regexpStr;

    /**
     * 采集资源时选择的模式，1.正常的选择实例模式（默认模式）；2.选择标签tag模式 3.选择高可用组ag模式
     */
    private Long resourceMode;

    /**
     * 采集实例类型, 只能是 all/part  当选择all时，传入的实例列表无效
     * Required:true
     */
    @Required
    private String resourceType;

    /**
     * 采集实例列表（存在上限限制）
     */
    private List<Resource> resources;

    /**
     * tagResource
     */
    private TagResource tagResource;


    /**
     * get 高可用组资源
     *
     * @return
     */
    public List<AgResource> getAgResource() {
        return agResource;
    }

    /**
     * set 高可用组资源
     *
     * @param agResource
     */
    public void setAgResource(List<AgResource> agResource) {
        this.agResource = agResource;
    }

    /**
     * get 采集状态，0-禁用，1-启用
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 采集状态，0-禁用，1-启用
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * get 过滤器是否启用。当appcode为custom时必填
     *
     * @return
     */
    public Boolean getFilterEnabled() {
        return filterEnabled;
    }

    /**
     * set 过滤器是否启用。当appcode为custom时必填
     *
     * @param filterEnabled
     */
    public void setFilterEnabled(Boolean filterEnabled) {
        this.filterEnabled = filterEnabled;
    }

    /**
     * get 自定义日志转发目的地, 只支持业务应用日志。支持类型：&quot;kafka&quot;，&quot;es&quot;
     *
     * @return
     */
    public String getLogCustomTarget() {
        return logCustomTarget;
    }

    /**
     * set 自定义日志转发目的地, 只支持业务应用日志。支持类型：&quot;kafka&quot;，&quot;es&quot;
     *
     * @param logCustomTarget
     */
    public void setLogCustomTarget(String logCustomTarget) {
        this.logCustomTarget = logCustomTarget;
    }

    /**
     * get 自定义日志转发目的地配置，KV 结构，具体配置参考 LogCustomTargetKafkaConf 和 LogCustomTargetEsConf
     *
     * @return
     */
    public Object getLogCustomTargetConf() {
        return logCustomTargetConf;
    }

    /**
     * set 自定义日志转发目的地配置，KV 结构，具体配置参考 LogCustomTargetKafkaConf 和 LogCustomTargetEsConf
     *
     * @param logCustomTargetConf
     */
    public void setLogCustomTargetConf(Object logCustomTargetConf) {
        this.logCustomTargetConf = logCustomTargetConf;
    }

    /**
     * get 日志文件名。当appcode为custom时为必填。日志文件名支持正则表达式。
     *
     * @return
     */
    public String getLogFile() {
        return logFile;
    }

    /**
     * set 日志文件名。当appcode为custom时为必填。日志文件名支持正则表达式。
     *
     * @param logFile
     */
    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }

    /**
     * get 过滤器。设置过滤器后可根据用户设定的关键词采集部分日志，如仅采集 Error 的日志。目前最大允许5个。
     *
     * @return
     */
    public List<String> getLogFilters() {
        return logFilters;
    }

    /**
     * set 过滤器。设置过滤器后可根据用户设定的关键词采集部分日志，如仅采集 Error 的日志。目前最大允许5个。
     *
     * @param logFilters
     */
    public void setLogFilters(List<String> logFilters) {
        this.logFilters = logFilters;
    }

    /**
     * get 日志路径。当appcode为custom时为必填。目前仅支持对 Linux 云主机上的日志进行采集，路径支持通配符“*”和“？”，文件路径应符合 Linux 的文件路径规则
     *
     * @return
     */
    public String getLogPath() {
        return logPath;
    }

    /**
     * set 日志路径。当appcode为custom时为必填。目前仅支持对 Linux 云主机上的日志进行采集，路径支持通配符“*”和“？”，文件路径应符合 Linux 的文件路径规则
     *
     * @param logPath
     */
    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    /**
     * get 目的地是否是日志服务logtopic，只支持业务应用日志
     *
     * @return
     */
    public Boolean getLogtopicEnabled() {
        return logtopicEnabled;
    }

    /**
     * set 目的地是否是日志服务logtopic，只支持业务应用日志
     *
     * @param logtopicEnabled
     */
    public void setLogtopicEnabled(Boolean logtopicEnabled) {
        this.logtopicEnabled = logtopicEnabled;
    }

    /**
     * get 首行正则
     *
     * @return
     */
    public String getRegexpStr() {
        return regexpStr;
    }

    /**
     * set 首行正则
     *
     * @param regexpStr
     */
    public void setRegexpStr(String regexpStr) {
        this.regexpStr = regexpStr;
    }

    /**
     * get 采集资源时选择的模式，1.正常的选择实例模式（默认模式）；2.选择标签tag模式 3.选择高可用组ag模式
     *
     * @return
     */
    public Long getResourceMode() {
        return resourceMode;
    }

    /**
     * set 采集资源时选择的模式，1.正常的选择实例模式（默认模式）；2.选择标签tag模式 3.选择高可用组ag模式
     *
     * @param resourceMode
     */
    public void setResourceMode(Long resourceMode) {
        this.resourceMode = resourceMode;
    }

    /**
     * get 采集实例类型, 只能是 all/part  当选择all时，传入的实例列表无效
     *
     * @return
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * set 采集实例类型, 只能是 all/part  当选择all时，传入的实例列表无效
     *
     * @param resourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * get 采集实例列表（存在上限限制）
     *
     * @return
     */
    public List<Resource> getResources() {
        return resources;
    }

    /**
     * set 采集实例列表（存在上限限制）
     *
     * @param resources
     */
    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    /**
     * get tagResource
     *
     * @return
     */
    public TagResource getTagResource() {
        return tagResource;
    }

    /**
     * set tagResource
     *
     * @param tagResource
     */
    public void setTagResource(TagResource tagResource) {
        this.tagResource = tagResource;
    }


    /**
     * set 高可用组资源
     *
     * @param agResource
     */
    public UpdateCollectInfoSpec agResource(List<AgResource> agResource) {
        this.agResource = agResource;
        return this;
    }

    /**
     * set 采集状态，0-禁用，1-启用
     *
     * @param enabled
     */
    public UpdateCollectInfoSpec enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 过滤器是否启用。当appcode为custom时必填
     *
     * @param filterEnabled
     */
    public UpdateCollectInfoSpec filterEnabled(Boolean filterEnabled) {
        this.filterEnabled = filterEnabled;
        return this;
    }

    /**
     * set 自定义日志转发目的地, 只支持业务应用日志。支持类型：&quot;kafka&quot;，&quot;es&quot;
     *
     * @param logCustomTarget
     */
    public UpdateCollectInfoSpec logCustomTarget(String logCustomTarget) {
        this.logCustomTarget = logCustomTarget;
        return this;
    }

    /**
     * set 自定义日志转发目的地配置，KV 结构，具体配置参考 LogCustomTargetKafkaConf 和 LogCustomTargetEsConf
     *
     * @param logCustomTargetConf
     */
    public UpdateCollectInfoSpec logCustomTargetConf(Object logCustomTargetConf) {
        this.logCustomTargetConf = logCustomTargetConf;
        return this;
    }

    /**
     * set 日志文件名。当appcode为custom时为必填。日志文件名支持正则表达式。
     *
     * @param logFile
     */
    public UpdateCollectInfoSpec logFile(String logFile) {
        this.logFile = logFile;
        return this;
    }

    /**
     * set 过滤器。设置过滤器后可根据用户设定的关键词采集部分日志，如仅采集 Error 的日志。目前最大允许5个。
     *
     * @param logFilters
     */
    public UpdateCollectInfoSpec logFilters(List<String> logFilters) {
        this.logFilters = logFilters;
        return this;
    }

    /**
     * set 日志路径。当appcode为custom时为必填。目前仅支持对 Linux 云主机上的日志进行采集，路径支持通配符“*”和“？”，文件路径应符合 Linux 的文件路径规则
     *
     * @param logPath
     */
    public UpdateCollectInfoSpec logPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    /**
     * set 目的地是否是日志服务logtopic，只支持业务应用日志
     *
     * @param logtopicEnabled
     */
    public UpdateCollectInfoSpec logtopicEnabled(Boolean logtopicEnabled) {
        this.logtopicEnabled = logtopicEnabled;
        return this;
    }

    /**
     * set 首行正则
     *
     * @param regexpStr
     */
    public UpdateCollectInfoSpec regexpStr(String regexpStr) {
        this.regexpStr = regexpStr;
        return this;
    }

    /**
     * set 采集资源时选择的模式，1.正常的选择实例模式（默认模式）；2.选择标签tag模式 3.选择高可用组ag模式
     *
     * @param resourceMode
     */
    public UpdateCollectInfoSpec resourceMode(Long resourceMode) {
        this.resourceMode = resourceMode;
        return this;
    }

    /**
     * set 采集实例类型, 只能是 all/part  当选择all时，传入的实例列表无效
     *
     * @param resourceType
     */
    public UpdateCollectInfoSpec resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set 采集实例列表（存在上限限制）
     *
     * @param resources
     */
    public UpdateCollectInfoSpec resources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * set tagResource
     *
     * @param tagResource
     */
    public UpdateCollectInfoSpec tagResource(TagResource tagResource) {
        this.tagResource = tagResource;
        return this;
    }


    /**
     * add item to 高可用组资源
     *
     * @param agResource
     */
    public void addAgResource(AgResource agResource) {
        if (this.agResource == null) {
            this.agResource = new ArrayList<>();
        }
        this.agResource.add(agResource);
    }

    /**
     * add item to 过滤器。设置过滤器后可根据用户设定的关键词采集部分日志，如仅采集 Error 的日志。目前最大允许5个。
     *
     * @param logFilter
     */
    public void addLogFilter(String logFilter) {
        if (this.logFilters == null) {
            this.logFilters = new ArrayList<>();
        }
        this.logFilters.add(logFilter);
    }

    /**
     * add item to 采集实例列表（存在上限限制）
     *
     * @param resource
     */
    public void addResource(Resource resource) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resource);
    }

}