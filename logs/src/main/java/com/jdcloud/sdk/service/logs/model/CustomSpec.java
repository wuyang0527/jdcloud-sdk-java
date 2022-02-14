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

/**
 * customSpec
 */
public class CustomSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 过滤器是否启用。当appcode为custom时必填
     */
    private Boolean filterEnabled;

    /**
     * 自定义日志转发目的地, 只支持业务应用日志。支持类型：&quot;kafka&quot;，&quot;es&quot;，默认为空:不进行自定义目的上报
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
     * logPath
     */
    private String logPath;

    /**
     * 目的地是否是日志服务logtopic，只支持业务应用日志
     */
    private Boolean logtopicEnabled;


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
     * get 自定义日志转发目的地, 只支持业务应用日志。支持类型：&quot;kafka&quot;，&quot;es&quot;，默认为空:不进行自定义目的上报
     *
     * @return
     */
    public String getLogCustomTarget() {
        return logCustomTarget;
    }

    /**
     * set 自定义日志转发目的地, 只支持业务应用日志。支持类型：&quot;kafka&quot;，&quot;es&quot;，默认为空:不进行自定义目的上报
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
     * get logPath
     *
     * @return
     */
    public String getLogPath() {
        return logPath;
    }

    /**
     * set logPath
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
     * set 过滤器是否启用。当appcode为custom时必填
     *
     * @param filterEnabled
     */
    public CustomSpec filterEnabled(Boolean filterEnabled) {
        this.filterEnabled = filterEnabled;
        return this;
    }

    /**
     * set 自定义日志转发目的地, 只支持业务应用日志。支持类型：&quot;kafka&quot;，&quot;es&quot;，默认为空:不进行自定义目的上报
     *
     * @param logCustomTarget
     */
    public CustomSpec logCustomTarget(String logCustomTarget) {
        this.logCustomTarget = logCustomTarget;
        return this;
    }

    /**
     * set 自定义日志转发目的地配置，KV 结构，具体配置参考 LogCustomTargetKafkaConf 和 LogCustomTargetEsConf
     *
     * @param logCustomTargetConf
     */
    public CustomSpec logCustomTargetConf(Object logCustomTargetConf) {
        this.logCustomTargetConf = logCustomTargetConf;
        return this;
    }

    /**
     * set 日志文件名。当appcode为custom时为必填。日志文件名支持正则表达式。
     *
     * @param logFile
     */
    public CustomSpec logFile(String logFile) {
        this.logFile = logFile;
        return this;
    }

    /**
     * set 过滤器。设置过滤器后可根据用户设定的关键词采集部分日志，如仅采集 Error 的日志。目前最大允许5个。
     *
     * @param logFilters
     */
    public CustomSpec logFilters(List<String> logFilters) {
        this.logFilters = logFilters;
        return this;
    }

    /**
     * set logPath
     *
     * @param logPath
     */
    public CustomSpec logPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    /**
     * set 目的地是否是日志服务logtopic，只支持业务应用日志
     *
     * @param logtopicEnabled
     */
    public CustomSpec logtopicEnabled(Boolean logtopicEnabled) {
        this.logtopicEnabled = logtopicEnabled;
        return this;
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

}