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

package com.jdcloud.sdk.service.domainservice.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * updateMonitor
 */
public class UpdateMonitor  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 连续几次触发报警
     * Required:true
     */
    @Required
    private Integer alarmLimit;

    /**
     * 监控项ID
     * Required:true
     */
    @Required
    private Integer id;

    /**
     * 备用地址1
     * Required:true
     */
    @Required
    private String ipBackup01;

    /**
     * 备用地址2
     * Required:true
     */
    @Required
    private String ipBackup02;

    /**
     * 备用地址列表，存在该参数时，可不填写参数备用地址1、备用地址2
     */
    private List<String> backupAddressList;

    /**
     * 监控状况 开启监控:2，暂停监控:4
     * Required:true
     */
    @Required
    private Integer monitorEnable;

    /**
     * 监控频率，单位秒
     * Required:true
     */
    @Required
    private Integer monitorFreq;

    /**
     * 监控端口
     * Required:true
     */
    @Required
    private Integer monitorPort;

    /**
     * 不做任何修改0，强制暂停解析记录1，自动切换到备用地址2
     * Required:true
     */
    @Required
    private Integer monitorRule;

    /**
     * 监控路径
     * Required:true
     */
    @Required
    private String monitorUri;

    /**
     * 不发送邮件:0， 发送邮件:1
     * Required:true
     */
    @Required
    private Integer notifyEmailEnable;

    /**
     * 不发送通知栏:0， 发送通知栏:1
     * Required:true
     */
    @Required
    private Integer notifyMsgBarEnable;

    /**
     * 不发送短信:0， 发送短信:1
     */
    private Integer notifySmsEnable;

    /**
     * https 0，https 1
     * Required:true
     */
    @Required
    private Integer protocol;

    /**
     * 0自动恢复 1手动恢复
     * Required:true
     */
    @Required
    private Integer stopRecoverRule;

    /**
     * 0自动恢复至主host 1手动恢复至主host
     * Required:true
     */
    @Required
    private Integer switchRecoverRule;

    /**
     * 探测请求携带自定义头域及其域值列表
     */
    private List<HttpHeader> requestHeaders;

    /**
     * 探测响应Body体中包含的字符串
     */
    private String responseBodyMatch;

    /**
     * 探测响应码范围列表
     */
    private List<HttpResponseCodeRange> responseCodeRanges;


    /**
     * get 连续几次触发报警
     *
     * @return
     */
    public Integer getAlarmLimit() {
        return alarmLimit;
    }

    /**
     * set 连续几次触发报警
     *
     * @param alarmLimit
     */
    public void setAlarmLimit(Integer alarmLimit) {
        this.alarmLimit = alarmLimit;
    }

    /**
     * get 监控项ID
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 监控项ID
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 备用地址1
     *
     * @return
     */
    public String getIpBackup01() {
        return ipBackup01;
    }

    /**
     * set 备用地址1
     *
     * @param ipBackup01
     */
    public void setIpBackup01(String ipBackup01) {
        this.ipBackup01 = ipBackup01;
    }

    /**
     * get 备用地址2
     *
     * @return
     */
    public String getIpBackup02() {
        return ipBackup02;
    }

    /**
     * set 备用地址2
     *
     * @param ipBackup02
     */
    public void setIpBackup02(String ipBackup02) {
        this.ipBackup02 = ipBackup02;
    }

    /**
     * get 备用地址列表，存在该参数时，可不填写参数备用地址1、备用地址2
     *
     * @return
     */
    public List<String> getBackupAddressList() {
        return backupAddressList;
    }

    /**
     * set 备用地址列表，存在该参数时，可不填写参数备用地址1、备用地址2
     *
     * @param backupAddressList
     */
    public void setBackupAddressList(List<String> backupAddressList) {
        this.backupAddressList = backupAddressList;
    }

    /**
     * get 监控状况 开启监控:2，暂停监控:4
     *
     * @return
     */
    public Integer getMonitorEnable() {
        return monitorEnable;
    }

    /**
     * set 监控状况 开启监控:2，暂停监控:4
     *
     * @param monitorEnable
     */
    public void setMonitorEnable(Integer monitorEnable) {
        this.monitorEnable = monitorEnable;
    }

    /**
     * get 监控频率，单位秒
     *
     * @return
     */
    public Integer getMonitorFreq() {
        return monitorFreq;
    }

    /**
     * set 监控频率，单位秒
     *
     * @param monitorFreq
     */
    public void setMonitorFreq(Integer monitorFreq) {
        this.monitorFreq = monitorFreq;
    }

    /**
     * get 监控端口
     *
     * @return
     */
    public Integer getMonitorPort() {
        return monitorPort;
    }

    /**
     * set 监控端口
     *
     * @param monitorPort
     */
    public void setMonitorPort(Integer monitorPort) {
        this.monitorPort = monitorPort;
    }

    /**
     * get 不做任何修改0，强制暂停解析记录1，自动切换到备用地址2
     *
     * @return
     */
    public Integer getMonitorRule() {
        return monitorRule;
    }

    /**
     * set 不做任何修改0，强制暂停解析记录1，自动切换到备用地址2
     *
     * @param monitorRule
     */
    public void setMonitorRule(Integer monitorRule) {
        this.monitorRule = monitorRule;
    }

    /**
     * get 监控路径
     *
     * @return
     */
    public String getMonitorUri() {
        return monitorUri;
    }

    /**
     * set 监控路径
     *
     * @param monitorUri
     */
    public void setMonitorUri(String monitorUri) {
        this.monitorUri = monitorUri;
    }

    /**
     * get 不发送邮件:0， 发送邮件:1
     *
     * @return
     */
    public Integer getNotifyEmailEnable() {
        return notifyEmailEnable;
    }

    /**
     * set 不发送邮件:0， 发送邮件:1
     *
     * @param notifyEmailEnable
     */
    public void setNotifyEmailEnable(Integer notifyEmailEnable) {
        this.notifyEmailEnable = notifyEmailEnable;
    }

    /**
     * get 不发送通知栏:0， 发送通知栏:1
     *
     * @return
     */
    public Integer getNotifyMsgBarEnable() {
        return notifyMsgBarEnable;
    }

    /**
     * set 不发送通知栏:0， 发送通知栏:1
     *
     * @param notifyMsgBarEnable
     */
    public void setNotifyMsgBarEnable(Integer notifyMsgBarEnable) {
        this.notifyMsgBarEnable = notifyMsgBarEnable;
    }

    /**
     * get 不发送短信:0， 发送短信:1
     *
     * @return
     */
    public Integer getNotifySmsEnable() {
        return notifySmsEnable;
    }

    /**
     * set 不发送短信:0， 发送短信:1
     *
     * @param notifySmsEnable
     */
    public void setNotifySmsEnable(Integer notifySmsEnable) {
        this.notifySmsEnable = notifySmsEnable;
    }

    /**
     * get https 0，https 1
     *
     * @return
     */
    public Integer getProtocol() {
        return protocol;
    }

    /**
     * set https 0，https 1
     *
     * @param protocol
     */
    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    /**
     * get 0自动恢复 1手动恢复
     *
     * @return
     */
    public Integer getStopRecoverRule() {
        return stopRecoverRule;
    }

    /**
     * set 0自动恢复 1手动恢复
     *
     * @param stopRecoverRule
     */
    public void setStopRecoverRule(Integer stopRecoverRule) {
        this.stopRecoverRule = stopRecoverRule;
    }

    /**
     * get 0自动恢复至主host 1手动恢复至主host
     *
     * @return
     */
    public Integer getSwitchRecoverRule() {
        return switchRecoverRule;
    }

    /**
     * set 0自动恢复至主host 1手动恢复至主host
     *
     * @param switchRecoverRule
     */
    public void setSwitchRecoverRule(Integer switchRecoverRule) {
        this.switchRecoverRule = switchRecoverRule;
    }

    /**
     * get 探测请求携带自定义头域及其域值列表
     *
     * @return
     */
    public List<HttpHeader> getRequestHeaders() {
        return requestHeaders;
    }

    /**
     * set 探测请求携带自定义头域及其域值列表
     *
     * @param requestHeaders
     */
    public void setRequestHeaders(List<HttpHeader> requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    /**
     * get 探测响应Body体中包含的字符串
     *
     * @return
     */
    public String getResponseBodyMatch() {
        return responseBodyMatch;
    }

    /**
     * set 探测响应Body体中包含的字符串
     *
     * @param responseBodyMatch
     */
    public void setResponseBodyMatch(String responseBodyMatch) {
        this.responseBodyMatch = responseBodyMatch;
    }

    /**
     * get 探测响应码范围列表
     *
     * @return
     */
    public List<HttpResponseCodeRange> getResponseCodeRanges() {
        return responseCodeRanges;
    }

    /**
     * set 探测响应码范围列表
     *
     * @param responseCodeRanges
     */
    public void setResponseCodeRanges(List<HttpResponseCodeRange> responseCodeRanges) {
        this.responseCodeRanges = responseCodeRanges;
    }


    /**
     * set 连续几次触发报警
     *
     * @param alarmLimit
     */
    public UpdateMonitor alarmLimit(Integer alarmLimit) {
        this.alarmLimit = alarmLimit;
        return this;
    }

    /**
     * set 监控项ID
     *
     * @param id
     */
    public UpdateMonitor id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 备用地址1
     *
     * @param ipBackup01
     */
    public UpdateMonitor ipBackup01(String ipBackup01) {
        this.ipBackup01 = ipBackup01;
        return this;
    }

    /**
     * set 备用地址2
     *
     * @param ipBackup02
     */
    public UpdateMonitor ipBackup02(String ipBackup02) {
        this.ipBackup02 = ipBackup02;
        return this;
    }

    /**
     * set 备用地址列表，存在该参数时，可不填写参数备用地址1、备用地址2
     *
     * @param backupAddressList
     */
    public UpdateMonitor backupAddressList(List<String> backupAddressList) {
        this.backupAddressList = backupAddressList;
        return this;
    }

    /**
     * set 监控状况 开启监控:2，暂停监控:4
     *
     * @param monitorEnable
     */
    public UpdateMonitor monitorEnable(Integer monitorEnable) {
        this.monitorEnable = monitorEnable;
        return this;
    }

    /**
     * set 监控频率，单位秒
     *
     * @param monitorFreq
     */
    public UpdateMonitor monitorFreq(Integer monitorFreq) {
        this.monitorFreq = monitorFreq;
        return this;
    }

    /**
     * set 监控端口
     *
     * @param monitorPort
     */
    public UpdateMonitor monitorPort(Integer monitorPort) {
        this.monitorPort = monitorPort;
        return this;
    }

    /**
     * set 不做任何修改0，强制暂停解析记录1，自动切换到备用地址2
     *
     * @param monitorRule
     */
    public UpdateMonitor monitorRule(Integer monitorRule) {
        this.monitorRule = monitorRule;
        return this;
    }

    /**
     * set 监控路径
     *
     * @param monitorUri
     */
    public UpdateMonitor monitorUri(String monitorUri) {
        this.monitorUri = monitorUri;
        return this;
    }

    /**
     * set 不发送邮件:0， 发送邮件:1
     *
     * @param notifyEmailEnable
     */
    public UpdateMonitor notifyEmailEnable(Integer notifyEmailEnable) {
        this.notifyEmailEnable = notifyEmailEnable;
        return this;
    }

    /**
     * set 不发送通知栏:0， 发送通知栏:1
     *
     * @param notifyMsgBarEnable
     */
    public UpdateMonitor notifyMsgBarEnable(Integer notifyMsgBarEnable) {
        this.notifyMsgBarEnable = notifyMsgBarEnable;
        return this;
    }

    /**
     * set 不发送短信:0， 发送短信:1
     *
     * @param notifySmsEnable
     */
    public UpdateMonitor notifySmsEnable(Integer notifySmsEnable) {
        this.notifySmsEnable = notifySmsEnable;
        return this;
    }

    /**
     * set https 0，https 1
     *
     * @param protocol
     */
    public UpdateMonitor protocol(Integer protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * set 0自动恢复 1手动恢复
     *
     * @param stopRecoverRule
     */
    public UpdateMonitor stopRecoverRule(Integer stopRecoverRule) {
        this.stopRecoverRule = stopRecoverRule;
        return this;
    }

    /**
     * set 0自动恢复至主host 1手动恢复至主host
     *
     * @param switchRecoverRule
     */
    public UpdateMonitor switchRecoverRule(Integer switchRecoverRule) {
        this.switchRecoverRule = switchRecoverRule;
        return this;
    }

    /**
     * set 探测请求携带自定义头域及其域值列表
     *
     * @param requestHeaders
     */
    public UpdateMonitor requestHeaders(List<HttpHeader> requestHeaders) {
        this.requestHeaders = requestHeaders;
        return this;
    }

    /**
     * set 探测响应Body体中包含的字符串
     *
     * @param responseBodyMatch
     */
    public UpdateMonitor responseBodyMatch(String responseBodyMatch) {
        this.responseBodyMatch = responseBodyMatch;
        return this;
    }

    /**
     * set 探测响应码范围列表
     *
     * @param responseCodeRanges
     */
    public UpdateMonitor responseCodeRanges(List<HttpResponseCodeRange> responseCodeRanges) {
        this.responseCodeRanges = responseCodeRanges;
        return this;
    }


    /**
     * add item to 备用地址列表，存在该参数时，可不填写参数备用地址1、备用地址2
     *
     * @param backupAddressList
     */
    public void addBackupAddressList(String backupAddressList) {
        if (this.backupAddressList == null) {
            this.backupAddressList = new ArrayList<>();
        }
        this.backupAddressList.add(backupAddressList);
    }

    /**
     * add item to 探测请求携带自定义头域及其域值列表
     *
     * @param requestHeader
     */
    public void addRequestHeader(HttpHeader requestHeader) {
        if (this.requestHeaders == null) {
            this.requestHeaders = new ArrayList<>();
        }
        this.requestHeaders.add(requestHeader);
    }

    /**
     * add item to 探测响应码范围列表
     *
     * @param responseCodeRange
     */
    public void addResponseCodeRange(HttpResponseCodeRange responseCodeRange) {
        if (this.responseCodeRanges == null) {
            this.responseCodeRanges = new ArrayList<>();
        }
        this.responseCodeRanges.add(responseCodeRange);
    }

}