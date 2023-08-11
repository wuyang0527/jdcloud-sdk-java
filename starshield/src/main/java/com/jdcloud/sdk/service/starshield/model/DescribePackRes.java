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

package com.jdcloud.sdk.service.starshield.model;


/**
 * describePackRes
 */
public class DescribePackRes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 套餐类型
     */
    private String packType;

    /**
     * 套餐模型(BASE-&gt;基础版 FLOW-&gt;流量版)
     */
    private String packMode;

    /**
     * 套餐流量
     */
    private Long flowLimit;

    /**
     * 可添加域名总数
     */
    private Integer availableZoneNum;

    /**
     * 业务带宽
     */
    private Integer cdnSpeedTraffic;

    /**
     * DDoS攻击防护（L4）
     */
    private Integer ddosBaseProtect;

    /**
     * 是否支持DDoS弹性防护
     */
    private Boolean ddosElasticProtect;

    /**
     * 是否提供免费证书
     */
    private Boolean freeCert;

    /**
     * 是否支持BOT功能
     */
    private Boolean botManage;

    /**
     * 是否支持WAF
     */
    private Boolean waf;

    /**
     * 自定义上传证书数量
     */
    private Integer customUploadCert;

    /**
     * 单节点CC攻击QPS
     */
    private Integer ccAttackQpsSingle;

    /**
     * CC攻击QPS总量
     */
    private Integer ccAttackQpsTotal;

    /**
     * 独享IP数量
     */
    private Integer dedicatedIp;

    /**
     * 可用节点数量
     */
    private Integer availableNodeNum;

    /**
     * 域名专用证书数
     */
    private Integer specialCertNum;

    /**
     * 是否支持True-Client-IP标头
     */
    private Boolean trueClientIp;

    /**
     * 是否支持RriginErrorPagePass
     */
    private Boolean originErrorPagePass;

    /**
     * 是否支持静态内容缓存
     */
    private Boolean staticContentCache;

    /**
     * 基于URL自定义清除
     */
    private Boolean customClearByUrl;

    /**
     * 高级自定义清除(主机名、Tag、前缀目录)
     */
    private Boolean advanceCustomClear;

    /**
     * 最小缓存TTL时间
     */
    private Integer minCacheTtl;

    /**
     * 客户端上传文件限制
     */
    private Integer clientUploadFileLimit;

    /**
     * 最大缓存文件限制
     */
    private Integer maxCacheFileLimit;

    /**
     * 是否支持基于URL预取
     */
    private Boolean urlPrefetch;

    /**
     * 自定义页面规则
     */
    private Integer pageRuleNum;

    /**
     * 是否支持页面优化
     */
    private Boolean imageOptimize;

    /**
     * 是否支持HTTP2
     */
    private Boolean http2;

    /**
     * 是否支持开发模式
     */
    private Boolean developMode;

    /**
     * 是否支持查询字符串排序
     */
    private Boolean queryStringSort;

    /**
     * 是否支持自定义名称服务器（忽略）
     */
    private Boolean customNameServer;

    /**
     * 是否支持免费通用证书
     */
    private Boolean generalCert;

    /**
     * 自定义证书数量
     */
    private Integer customCertNum;

    /**
     * 网站分析时间规格
     */
    private Integer websiteAnalyseTimeSpecs;

    /**
     * DNS分析时间（历史时间）
     */
    private Integer dnsAnalyseTime;

    /**
     * 攻击分析时间（历史时间）
     */
    private Integer attackAnalyseTime;

    /**
     * 是否支持审计日志
     */
    private Boolean auditLog;

    /**
     * 是否支持请求日志
     */
    private Boolean requestLog;

    /**
     * 是否支持OWASP核心规则
     */
    private Boolean owaspCoreRule;

    /**
     * 是否支持内置预定义规则
     */
    private Boolean builtInPredefinedRule;

    /**
     * WAF自定义规则
     */
    private Integer firewallRuleNum;

    /**
     * 是否支持防火墙正则表达式规则
     */
    private Boolean firewalRegularRule;

    /**
     * 单域名解析记录数量上限
     */
    private Integer availableDnsRecordNum;

    /**
     * 域名接入方式 1-&gt;CNAME 2-&gt;NS 3-&gt;IP(Spectrum) 逗号拼接(1,2)
     */
    private String zoneAccessType;

    /**
     * 速率限制Ratelimit数量 0-&gt;不支持 大于0-&gt;N条
     */
    private Integer rateLimit;

    /**
     * 日志推送服务 False-&gt;不支持 True-&gt;支持
     */
    private Boolean logPush;

    /**
     * 支持的协议类型 1-&gt;HTTP 2-&gt;HTTPS 3-&gt;HTTP2 4-&gt;HTTP3 5-&gt;TCP 逗号拼接(1,2)
     */
    private String protocol;

    /**
     * 应用攻击防护 False-&gt;不支持 True-&gt;支持
     */
    private Boolean appAttackProtection;

    /**
     * CC攻击标准防护 False-&gt;不支持 True-&gt;自动防护
     */
    private Boolean ccAttackStandardProtection;

    /**
     * CC攻击高级防护 False-&gt;不支持 True-&gt;BOT+Rate Limiting
     */
    private Boolean ccAttackAdvancedProtection;

    /**
     * 技术支持 1-&gt;客服工单 2-&gt;产品技术专家 逗号拼接(1,2)
     */
    private String technicalSupport;

    /**
     * 域名扩展包 False-&gt;不支持 True-&gt;支持
     */
    private Boolean zoneExtPack;

    /**
     * Websocket False-&gt;不支持 True-&gt;支持
     */
    private Boolean websocket;



    /**
     * get 套餐类型
     *
     * @return
     */
    public String getPackType() {
        return packType;
    }

    /**
     * set 套餐类型
     *
     * @param packType
     */
    public void setPackType(String packType) {
        this.packType = packType;
    }


    /**
     * get 套餐模型(BASE-&gt;基础版 FLOW-&gt;流量版)
     *
     * @return
     */
    public String getPackMode() {
        return packMode;
    }

    /**
     * set 套餐模型(BASE-&gt;基础版 FLOW-&gt;流量版)
     *
     * @param packMode
     */
    public void setPackMode(String packMode) {
        this.packMode = packMode;
    }


    /**
     * get 套餐流量
     *
     * @return
     */
    public Long getFlowLimit() {
        return flowLimit;
    }

    /**
     * set 套餐流量
     *
     * @param flowLimit
     */
    public void setFlowLimit(Long flowLimit) {
        this.flowLimit = flowLimit;
    }


    /**
     * get 可添加域名总数
     *
     * @return
     */
    public Integer getAvailableZoneNum() {
        return availableZoneNum;
    }

    /**
     * set 可添加域名总数
     *
     * @param availableZoneNum
     */
    public void setAvailableZoneNum(Integer availableZoneNum) {
        this.availableZoneNum = availableZoneNum;
    }


    /**
     * get 业务带宽
     *
     * @return
     */
    public Integer getCdnSpeedTraffic() {
        return cdnSpeedTraffic;
    }

    /**
     * set 业务带宽
     *
     * @param cdnSpeedTraffic
     */
    public void setCdnSpeedTraffic(Integer cdnSpeedTraffic) {
        this.cdnSpeedTraffic = cdnSpeedTraffic;
    }


    /**
     * get DDoS攻击防护（L4）
     *
     * @return
     */
    public Integer getDdosBaseProtect() {
        return ddosBaseProtect;
    }

    /**
     * set DDoS攻击防护（L4）
     *
     * @param ddosBaseProtect
     */
    public void setDdosBaseProtect(Integer ddosBaseProtect) {
        this.ddosBaseProtect = ddosBaseProtect;
    }


    /**
     * get 是否支持DDoS弹性防护
     *
     * @return
     */
    public Boolean getDdosElasticProtect() {
        return ddosElasticProtect;
    }

    /**
     * set 是否支持DDoS弹性防护
     *
     * @param ddosElasticProtect
     */
    public void setDdosElasticProtect(Boolean ddosElasticProtect) {
        this.ddosElasticProtect = ddosElasticProtect;
    }


    /**
     * get 是否提供免费证书
     *
     * @return
     */
    public Boolean getFreeCert() {
        return freeCert;
    }

    /**
     * set 是否提供免费证书
     *
     * @param freeCert
     */
    public void setFreeCert(Boolean freeCert) {
        this.freeCert = freeCert;
    }


    /**
     * get 是否支持BOT功能
     *
     * @return
     */
    public Boolean getBotManage() {
        return botManage;
    }

    /**
     * set 是否支持BOT功能
     *
     * @param botManage
     */
    public void setBotManage(Boolean botManage) {
        this.botManage = botManage;
    }


    /**
     * get 是否支持WAF
     *
     * @return
     */
    public Boolean getWaf() {
        return waf;
    }

    /**
     * set 是否支持WAF
     *
     * @param waf
     */
    public void setWaf(Boolean waf) {
        this.waf = waf;
    }


    /**
     * get 自定义上传证书数量
     *
     * @return
     */
    public Integer getCustomUploadCert() {
        return customUploadCert;
    }

    /**
     * set 自定义上传证书数量
     *
     * @param customUploadCert
     */
    public void setCustomUploadCert(Integer customUploadCert) {
        this.customUploadCert = customUploadCert;
    }


    /**
     * get 单节点CC攻击QPS
     *
     * @return
     */
    public Integer getCcAttackQpsSingle() {
        return ccAttackQpsSingle;
    }

    /**
     * set 单节点CC攻击QPS
     *
     * @param ccAttackQpsSingle
     */
    public void setCcAttackQpsSingle(Integer ccAttackQpsSingle) {
        this.ccAttackQpsSingle = ccAttackQpsSingle;
    }


    /**
     * get CC攻击QPS总量
     *
     * @return
     */
    public Integer getCcAttackQpsTotal() {
        return ccAttackQpsTotal;
    }

    /**
     * set CC攻击QPS总量
     *
     * @param ccAttackQpsTotal
     */
    public void setCcAttackQpsTotal(Integer ccAttackQpsTotal) {
        this.ccAttackQpsTotal = ccAttackQpsTotal;
    }


    /**
     * get 独享IP数量
     *
     * @return
     */
    public Integer getDedicatedIp() {
        return dedicatedIp;
    }

    /**
     * set 独享IP数量
     *
     * @param dedicatedIp
     */
    public void setDedicatedIp(Integer dedicatedIp) {
        this.dedicatedIp = dedicatedIp;
    }


    /**
     * get 可用节点数量
     *
     * @return
     */
    public Integer getAvailableNodeNum() {
        return availableNodeNum;
    }

    /**
     * set 可用节点数量
     *
     * @param availableNodeNum
     */
    public void setAvailableNodeNum(Integer availableNodeNum) {
        this.availableNodeNum = availableNodeNum;
    }


    /**
     * get 域名专用证书数
     *
     * @return
     */
    public Integer getSpecialCertNum() {
        return specialCertNum;
    }

    /**
     * set 域名专用证书数
     *
     * @param specialCertNum
     */
    public void setSpecialCertNum(Integer specialCertNum) {
        this.specialCertNum = specialCertNum;
    }


    /**
     * get 是否支持True-Client-IP标头
     *
     * @return
     */
    public Boolean getTrueClientIp() {
        return trueClientIp;
    }

    /**
     * set 是否支持True-Client-IP标头
     *
     * @param trueClientIp
     */
    public void setTrueClientIp(Boolean trueClientIp) {
        this.trueClientIp = trueClientIp;
    }


    /**
     * get 是否支持RriginErrorPagePass
     *
     * @return
     */
    public Boolean getOriginErrorPagePass() {
        return originErrorPagePass;
    }

    /**
     * set 是否支持RriginErrorPagePass
     *
     * @param originErrorPagePass
     */
    public void setOriginErrorPagePass(Boolean originErrorPagePass) {
        this.originErrorPagePass = originErrorPagePass;
    }


    /**
     * get 是否支持静态内容缓存
     *
     * @return
     */
    public Boolean getStaticContentCache() {
        return staticContentCache;
    }

    /**
     * set 是否支持静态内容缓存
     *
     * @param staticContentCache
     */
    public void setStaticContentCache(Boolean staticContentCache) {
        this.staticContentCache = staticContentCache;
    }


    /**
     * get 基于URL自定义清除
     *
     * @return
     */
    public Boolean getCustomClearByUrl() {
        return customClearByUrl;
    }

    /**
     * set 基于URL自定义清除
     *
     * @param customClearByUrl
     */
    public void setCustomClearByUrl(Boolean customClearByUrl) {
        this.customClearByUrl = customClearByUrl;
    }


    /**
     * get 高级自定义清除(主机名、Tag、前缀目录)
     *
     * @return
     */
    public Boolean getAdvanceCustomClear() {
        return advanceCustomClear;
    }

    /**
     * set 高级自定义清除(主机名、Tag、前缀目录)
     *
     * @param advanceCustomClear
     */
    public void setAdvanceCustomClear(Boolean advanceCustomClear) {
        this.advanceCustomClear = advanceCustomClear;
    }


    /**
     * get 最小缓存TTL时间
     *
     * @return
     */
    public Integer getMinCacheTtl() {
        return minCacheTtl;
    }

    /**
     * set 最小缓存TTL时间
     *
     * @param minCacheTtl
     */
    public void setMinCacheTtl(Integer minCacheTtl) {
        this.minCacheTtl = minCacheTtl;
    }


    /**
     * get 客户端上传文件限制
     *
     * @return
     */
    public Integer getClientUploadFileLimit() {
        return clientUploadFileLimit;
    }

    /**
     * set 客户端上传文件限制
     *
     * @param clientUploadFileLimit
     */
    public void setClientUploadFileLimit(Integer clientUploadFileLimit) {
        this.clientUploadFileLimit = clientUploadFileLimit;
    }


    /**
     * get 最大缓存文件限制
     *
     * @return
     */
    public Integer getMaxCacheFileLimit() {
        return maxCacheFileLimit;
    }

    /**
     * set 最大缓存文件限制
     *
     * @param maxCacheFileLimit
     */
    public void setMaxCacheFileLimit(Integer maxCacheFileLimit) {
        this.maxCacheFileLimit = maxCacheFileLimit;
    }


    /**
     * get 是否支持基于URL预取
     *
     * @return
     */
    public Boolean getUrlPrefetch() {
        return urlPrefetch;
    }

    /**
     * set 是否支持基于URL预取
     *
     * @param urlPrefetch
     */
    public void setUrlPrefetch(Boolean urlPrefetch) {
        this.urlPrefetch = urlPrefetch;
    }


    /**
     * get 自定义页面规则
     *
     * @return
     */
    public Integer getPageRuleNum() {
        return pageRuleNum;
    }

    /**
     * set 自定义页面规则
     *
     * @param pageRuleNum
     */
    public void setPageRuleNum(Integer pageRuleNum) {
        this.pageRuleNum = pageRuleNum;
    }


    /**
     * get 是否支持页面优化
     *
     * @return
     */
    public Boolean getImageOptimize() {
        return imageOptimize;
    }

    /**
     * set 是否支持页面优化
     *
     * @param imageOptimize
     */
    public void setImageOptimize(Boolean imageOptimize) {
        this.imageOptimize = imageOptimize;
    }


    /**
     * get 是否支持HTTP2
     *
     * @return
     */
    public Boolean getHttp2() {
        return http2;
    }

    /**
     * set 是否支持HTTP2
     *
     * @param http2
     */
    public void setHttp2(Boolean http2) {
        this.http2 = http2;
    }


    /**
     * get 是否支持开发模式
     *
     * @return
     */
    public Boolean getDevelopMode() {
        return developMode;
    }

    /**
     * set 是否支持开发模式
     *
     * @param developMode
     */
    public void setDevelopMode(Boolean developMode) {
        this.developMode = developMode;
    }


    /**
     * get 是否支持查询字符串排序
     *
     * @return
     */
    public Boolean getQueryStringSort() {
        return queryStringSort;
    }

    /**
     * set 是否支持查询字符串排序
     *
     * @param queryStringSort
     */
    public void setQueryStringSort(Boolean queryStringSort) {
        this.queryStringSort = queryStringSort;
    }


    /**
     * get 是否支持自定义名称服务器（忽略）
     *
     * @return
     */
    public Boolean getCustomNameServer() {
        return customNameServer;
    }

    /**
     * set 是否支持自定义名称服务器（忽略）
     *
     * @param customNameServer
     */
    public void setCustomNameServer(Boolean customNameServer) {
        this.customNameServer = customNameServer;
    }


    /**
     * get 是否支持免费通用证书
     *
     * @return
     */
    public Boolean getGeneralCert() {
        return generalCert;
    }

    /**
     * set 是否支持免费通用证书
     *
     * @param generalCert
     */
    public void setGeneralCert(Boolean generalCert) {
        this.generalCert = generalCert;
    }


    /**
     * get 自定义证书数量
     *
     * @return
     */
    public Integer getCustomCertNum() {
        return customCertNum;
    }

    /**
     * set 自定义证书数量
     *
     * @param customCertNum
     */
    public void setCustomCertNum(Integer customCertNum) {
        this.customCertNum = customCertNum;
    }


    /**
     * get 网站分析时间规格
     *
     * @return
     */
    public Integer getWebsiteAnalyseTimeSpecs() {
        return websiteAnalyseTimeSpecs;
    }

    /**
     * set 网站分析时间规格
     *
     * @param websiteAnalyseTimeSpecs
     */
    public void setWebsiteAnalyseTimeSpecs(Integer websiteAnalyseTimeSpecs) {
        this.websiteAnalyseTimeSpecs = websiteAnalyseTimeSpecs;
    }


    /**
     * get DNS分析时间（历史时间）
     *
     * @return
     */
    public Integer getDnsAnalyseTime() {
        return dnsAnalyseTime;
    }

    /**
     * set DNS分析时间（历史时间）
     *
     * @param dnsAnalyseTime
     */
    public void setDnsAnalyseTime(Integer dnsAnalyseTime) {
        this.dnsAnalyseTime = dnsAnalyseTime;
    }


    /**
     * get 攻击分析时间（历史时间）
     *
     * @return
     */
    public Integer getAttackAnalyseTime() {
        return attackAnalyseTime;
    }

    /**
     * set 攻击分析时间（历史时间）
     *
     * @param attackAnalyseTime
     */
    public void setAttackAnalyseTime(Integer attackAnalyseTime) {
        this.attackAnalyseTime = attackAnalyseTime;
    }


    /**
     * get 是否支持审计日志
     *
     * @return
     */
    public Boolean getAuditLog() {
        return auditLog;
    }

    /**
     * set 是否支持审计日志
     *
     * @param auditLog
     */
    public void setAuditLog(Boolean auditLog) {
        this.auditLog = auditLog;
    }


    /**
     * get 是否支持请求日志
     *
     * @return
     */
    public Boolean getRequestLog() {
        return requestLog;
    }

    /**
     * set 是否支持请求日志
     *
     * @param requestLog
     */
    public void setRequestLog(Boolean requestLog) {
        this.requestLog = requestLog;
    }


    /**
     * get 是否支持OWASP核心规则
     *
     * @return
     */
    public Boolean getOwaspCoreRule() {
        return owaspCoreRule;
    }

    /**
     * set 是否支持OWASP核心规则
     *
     * @param owaspCoreRule
     */
    public void setOwaspCoreRule(Boolean owaspCoreRule) {
        this.owaspCoreRule = owaspCoreRule;
    }


    /**
     * get 是否支持内置预定义规则
     *
     * @return
     */
    public Boolean getBuiltInPredefinedRule() {
        return builtInPredefinedRule;
    }

    /**
     * set 是否支持内置预定义规则
     *
     * @param builtInPredefinedRule
     */
    public void setBuiltInPredefinedRule(Boolean builtInPredefinedRule) {
        this.builtInPredefinedRule = builtInPredefinedRule;
    }


    /**
     * get WAF自定义规则
     *
     * @return
     */
    public Integer getFirewallRuleNum() {
        return firewallRuleNum;
    }

    /**
     * set WAF自定义规则
     *
     * @param firewallRuleNum
     */
    public void setFirewallRuleNum(Integer firewallRuleNum) {
        this.firewallRuleNum = firewallRuleNum;
    }


    /**
     * get 是否支持防火墙正则表达式规则
     *
     * @return
     */
    public Boolean getFirewalRegularRule() {
        return firewalRegularRule;
    }

    /**
     * set 是否支持防火墙正则表达式规则
     *
     * @param firewalRegularRule
     */
    public void setFirewalRegularRule(Boolean firewalRegularRule) {
        this.firewalRegularRule = firewalRegularRule;
    }


    /**
     * get 单域名解析记录数量上限
     *
     * @return
     */
    public Integer getAvailableDnsRecordNum() {
        return availableDnsRecordNum;
    }

    /**
     * set 单域名解析记录数量上限
     *
     * @param availableDnsRecordNum
     */
    public void setAvailableDnsRecordNum(Integer availableDnsRecordNum) {
        this.availableDnsRecordNum = availableDnsRecordNum;
    }


    /**
     * get 域名接入方式 1-&gt;CNAME 2-&gt;NS 3-&gt;IP(Spectrum) 逗号拼接(1,2)
     *
     * @return
     */
    public String getZoneAccessType() {
        return zoneAccessType;
    }

    /**
     * set 域名接入方式 1-&gt;CNAME 2-&gt;NS 3-&gt;IP(Spectrum) 逗号拼接(1,2)
     *
     * @param zoneAccessType
     */
    public void setZoneAccessType(String zoneAccessType) {
        this.zoneAccessType = zoneAccessType;
    }


    /**
     * get 速率限制Ratelimit数量 0-&gt;不支持 大于0-&gt;N条
     *
     * @return
     */
    public Integer getRateLimit() {
        return rateLimit;
    }

    /**
     * set 速率限制Ratelimit数量 0-&gt;不支持 大于0-&gt;N条
     *
     * @param rateLimit
     */
    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }


    /**
     * get 日志推送服务 False-&gt;不支持 True-&gt;支持
     *
     * @return
     */
    public Boolean getLogPush() {
        return logPush;
    }

    /**
     * set 日志推送服务 False-&gt;不支持 True-&gt;支持
     *
     * @param logPush
     */
    public void setLogPush(Boolean logPush) {
        this.logPush = logPush;
    }


    /**
     * get 支持的协议类型 1-&gt;HTTP 2-&gt;HTTPS 3-&gt;HTTP2 4-&gt;HTTP3 5-&gt;TCP 逗号拼接(1,2)
     *
     * @return
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * set 支持的协议类型 1-&gt;HTTP 2-&gt;HTTPS 3-&gt;HTTP2 4-&gt;HTTP3 5-&gt;TCP 逗号拼接(1,2)
     *
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }


    /**
     * get 应用攻击防护 False-&gt;不支持 True-&gt;支持
     *
     * @return
     */
    public Boolean getAppAttackProtection() {
        return appAttackProtection;
    }

    /**
     * set 应用攻击防护 False-&gt;不支持 True-&gt;支持
     *
     * @param appAttackProtection
     */
    public void setAppAttackProtection(Boolean appAttackProtection) {
        this.appAttackProtection = appAttackProtection;
    }


    /**
     * get CC攻击标准防护 False-&gt;不支持 True-&gt;自动防护
     *
     * @return
     */
    public Boolean getCcAttackStandardProtection() {
        return ccAttackStandardProtection;
    }

    /**
     * set CC攻击标准防护 False-&gt;不支持 True-&gt;自动防护
     *
     * @param ccAttackStandardProtection
     */
    public void setCcAttackStandardProtection(Boolean ccAttackStandardProtection) {
        this.ccAttackStandardProtection = ccAttackStandardProtection;
    }


    /**
     * get CC攻击高级防护 False-&gt;不支持 True-&gt;BOT+Rate Limiting
     *
     * @return
     */
    public Boolean getCcAttackAdvancedProtection() {
        return ccAttackAdvancedProtection;
    }

    /**
     * set CC攻击高级防护 False-&gt;不支持 True-&gt;BOT+Rate Limiting
     *
     * @param ccAttackAdvancedProtection
     */
    public void setCcAttackAdvancedProtection(Boolean ccAttackAdvancedProtection) {
        this.ccAttackAdvancedProtection = ccAttackAdvancedProtection;
    }


    /**
     * get 技术支持 1-&gt;客服工单 2-&gt;产品技术专家 逗号拼接(1,2)
     *
     * @return
     */
    public String getTechnicalSupport() {
        return technicalSupport;
    }

    /**
     * set 技术支持 1-&gt;客服工单 2-&gt;产品技术专家 逗号拼接(1,2)
     *
     * @param technicalSupport
     */
    public void setTechnicalSupport(String technicalSupport) {
        this.technicalSupport = technicalSupport;
    }


    /**
     * get 域名扩展包 False-&gt;不支持 True-&gt;支持
     *
     * @return
     */
    public Boolean getZoneExtPack() {
        return zoneExtPack;
    }

    /**
     * set 域名扩展包 False-&gt;不支持 True-&gt;支持
     *
     * @param zoneExtPack
     */
    public void setZoneExtPack(Boolean zoneExtPack) {
        this.zoneExtPack = zoneExtPack;
    }


    /**
     * get Websocket False-&gt;不支持 True-&gt;支持
     *
     * @return
     */
    public Boolean getWebsocket() {
        return websocket;
    }

    /**
     * set Websocket False-&gt;不支持 True-&gt;支持
     *
     * @param websocket
     */
    public void setWebsocket(Boolean websocket) {
        this.websocket = websocket;
    }



    /**
     * set 套餐类型
     *
     * @param packType
     */
    public DescribePackRes packType(String packType) {
        this.packType = packType;
        return this;
    }


    /**
     * set 套餐模型(BASE-&gt;基础版 FLOW-&gt;流量版)
     *
     * @param packMode
     */
    public DescribePackRes packMode(String packMode) {
        this.packMode = packMode;
        return this;
    }


    /**
     * set 套餐流量
     *
     * @param flowLimit
     */
    public DescribePackRes flowLimit(Long flowLimit) {
        this.flowLimit = flowLimit;
        return this;
    }


    /**
     * set 可添加域名总数
     *
     * @param availableZoneNum
     */
    public DescribePackRes availableZoneNum(Integer availableZoneNum) {
        this.availableZoneNum = availableZoneNum;
        return this;
    }


    /**
     * set 业务带宽
     *
     * @param cdnSpeedTraffic
     */
    public DescribePackRes cdnSpeedTraffic(Integer cdnSpeedTraffic) {
        this.cdnSpeedTraffic = cdnSpeedTraffic;
        return this;
    }


    /**
     * set DDoS攻击防护（L4）
     *
     * @param ddosBaseProtect
     */
    public DescribePackRes ddosBaseProtect(Integer ddosBaseProtect) {
        this.ddosBaseProtect = ddosBaseProtect;
        return this;
    }


    /**
     * set 是否支持DDoS弹性防护
     *
     * @param ddosElasticProtect
     */
    public DescribePackRes ddosElasticProtect(Boolean ddosElasticProtect) {
        this.ddosElasticProtect = ddosElasticProtect;
        return this;
    }


    /**
     * set 是否提供免费证书
     *
     * @param freeCert
     */
    public DescribePackRes freeCert(Boolean freeCert) {
        this.freeCert = freeCert;
        return this;
    }


    /**
     * set 是否支持BOT功能
     *
     * @param botManage
     */
    public DescribePackRes botManage(Boolean botManage) {
        this.botManage = botManage;
        return this;
    }


    /**
     * set 是否支持WAF
     *
     * @param waf
     */
    public DescribePackRes waf(Boolean waf) {
        this.waf = waf;
        return this;
    }


    /**
     * set 自定义上传证书数量
     *
     * @param customUploadCert
     */
    public DescribePackRes customUploadCert(Integer customUploadCert) {
        this.customUploadCert = customUploadCert;
        return this;
    }


    /**
     * set 单节点CC攻击QPS
     *
     * @param ccAttackQpsSingle
     */
    public DescribePackRes ccAttackQpsSingle(Integer ccAttackQpsSingle) {
        this.ccAttackQpsSingle = ccAttackQpsSingle;
        return this;
    }


    /**
     * set CC攻击QPS总量
     *
     * @param ccAttackQpsTotal
     */
    public DescribePackRes ccAttackQpsTotal(Integer ccAttackQpsTotal) {
        this.ccAttackQpsTotal = ccAttackQpsTotal;
        return this;
    }


    /**
     * set 独享IP数量
     *
     * @param dedicatedIp
     */
    public DescribePackRes dedicatedIp(Integer dedicatedIp) {
        this.dedicatedIp = dedicatedIp;
        return this;
    }


    /**
     * set 可用节点数量
     *
     * @param availableNodeNum
     */
    public DescribePackRes availableNodeNum(Integer availableNodeNum) {
        this.availableNodeNum = availableNodeNum;
        return this;
    }


    /**
     * set 域名专用证书数
     *
     * @param specialCertNum
     */
    public DescribePackRes specialCertNum(Integer specialCertNum) {
        this.specialCertNum = specialCertNum;
        return this;
    }


    /**
     * set 是否支持True-Client-IP标头
     *
     * @param trueClientIp
     */
    public DescribePackRes trueClientIp(Boolean trueClientIp) {
        this.trueClientIp = trueClientIp;
        return this;
    }


    /**
     * set 是否支持RriginErrorPagePass
     *
     * @param originErrorPagePass
     */
    public DescribePackRes originErrorPagePass(Boolean originErrorPagePass) {
        this.originErrorPagePass = originErrorPagePass;
        return this;
    }


    /**
     * set 是否支持静态内容缓存
     *
     * @param staticContentCache
     */
    public DescribePackRes staticContentCache(Boolean staticContentCache) {
        this.staticContentCache = staticContentCache;
        return this;
    }


    /**
     * set 基于URL自定义清除
     *
     * @param customClearByUrl
     */
    public DescribePackRes customClearByUrl(Boolean customClearByUrl) {
        this.customClearByUrl = customClearByUrl;
        return this;
    }


    /**
     * set 高级自定义清除(主机名、Tag、前缀目录)
     *
     * @param advanceCustomClear
     */
    public DescribePackRes advanceCustomClear(Boolean advanceCustomClear) {
        this.advanceCustomClear = advanceCustomClear;
        return this;
    }


    /**
     * set 最小缓存TTL时间
     *
     * @param minCacheTtl
     */
    public DescribePackRes minCacheTtl(Integer minCacheTtl) {
        this.minCacheTtl = minCacheTtl;
        return this;
    }


    /**
     * set 客户端上传文件限制
     *
     * @param clientUploadFileLimit
     */
    public DescribePackRes clientUploadFileLimit(Integer clientUploadFileLimit) {
        this.clientUploadFileLimit = clientUploadFileLimit;
        return this;
    }


    /**
     * set 最大缓存文件限制
     *
     * @param maxCacheFileLimit
     */
    public DescribePackRes maxCacheFileLimit(Integer maxCacheFileLimit) {
        this.maxCacheFileLimit = maxCacheFileLimit;
        return this;
    }


    /**
     * set 是否支持基于URL预取
     *
     * @param urlPrefetch
     */
    public DescribePackRes urlPrefetch(Boolean urlPrefetch) {
        this.urlPrefetch = urlPrefetch;
        return this;
    }


    /**
     * set 自定义页面规则
     *
     * @param pageRuleNum
     */
    public DescribePackRes pageRuleNum(Integer pageRuleNum) {
        this.pageRuleNum = pageRuleNum;
        return this;
    }


    /**
     * set 是否支持页面优化
     *
     * @param imageOptimize
     */
    public DescribePackRes imageOptimize(Boolean imageOptimize) {
        this.imageOptimize = imageOptimize;
        return this;
    }


    /**
     * set 是否支持HTTP2
     *
     * @param http2
     */
    public DescribePackRes http2(Boolean http2) {
        this.http2 = http2;
        return this;
    }


    /**
     * set 是否支持开发模式
     *
     * @param developMode
     */
    public DescribePackRes developMode(Boolean developMode) {
        this.developMode = developMode;
        return this;
    }


    /**
     * set 是否支持查询字符串排序
     *
     * @param queryStringSort
     */
    public DescribePackRes queryStringSort(Boolean queryStringSort) {
        this.queryStringSort = queryStringSort;
        return this;
    }


    /**
     * set 是否支持自定义名称服务器（忽略）
     *
     * @param customNameServer
     */
    public DescribePackRes customNameServer(Boolean customNameServer) {
        this.customNameServer = customNameServer;
        return this;
    }


    /**
     * set 是否支持免费通用证书
     *
     * @param generalCert
     */
    public DescribePackRes generalCert(Boolean generalCert) {
        this.generalCert = generalCert;
        return this;
    }


    /**
     * set 自定义证书数量
     *
     * @param customCertNum
     */
    public DescribePackRes customCertNum(Integer customCertNum) {
        this.customCertNum = customCertNum;
        return this;
    }


    /**
     * set 网站分析时间规格
     *
     * @param websiteAnalyseTimeSpecs
     */
    public DescribePackRes websiteAnalyseTimeSpecs(Integer websiteAnalyseTimeSpecs) {
        this.websiteAnalyseTimeSpecs = websiteAnalyseTimeSpecs;
        return this;
    }


    /**
     * set DNS分析时间（历史时间）
     *
     * @param dnsAnalyseTime
     */
    public DescribePackRes dnsAnalyseTime(Integer dnsAnalyseTime) {
        this.dnsAnalyseTime = dnsAnalyseTime;
        return this;
    }


    /**
     * set 攻击分析时间（历史时间）
     *
     * @param attackAnalyseTime
     */
    public DescribePackRes attackAnalyseTime(Integer attackAnalyseTime) {
        this.attackAnalyseTime = attackAnalyseTime;
        return this;
    }


    /**
     * set 是否支持审计日志
     *
     * @param auditLog
     */
    public DescribePackRes auditLog(Boolean auditLog) {
        this.auditLog = auditLog;
        return this;
    }


    /**
     * set 是否支持请求日志
     *
     * @param requestLog
     */
    public DescribePackRes requestLog(Boolean requestLog) {
        this.requestLog = requestLog;
        return this;
    }


    /**
     * set 是否支持OWASP核心规则
     *
     * @param owaspCoreRule
     */
    public DescribePackRes owaspCoreRule(Boolean owaspCoreRule) {
        this.owaspCoreRule = owaspCoreRule;
        return this;
    }


    /**
     * set 是否支持内置预定义规则
     *
     * @param builtInPredefinedRule
     */
    public DescribePackRes builtInPredefinedRule(Boolean builtInPredefinedRule) {
        this.builtInPredefinedRule = builtInPredefinedRule;
        return this;
    }


    /**
     * set WAF自定义规则
     *
     * @param firewallRuleNum
     */
    public DescribePackRes firewallRuleNum(Integer firewallRuleNum) {
        this.firewallRuleNum = firewallRuleNum;
        return this;
    }


    /**
     * set 是否支持防火墙正则表达式规则
     *
     * @param firewalRegularRule
     */
    public DescribePackRes firewalRegularRule(Boolean firewalRegularRule) {
        this.firewalRegularRule = firewalRegularRule;
        return this;
    }


    /**
     * set 单域名解析记录数量上限
     *
     * @param availableDnsRecordNum
     */
    public DescribePackRes availableDnsRecordNum(Integer availableDnsRecordNum) {
        this.availableDnsRecordNum = availableDnsRecordNum;
        return this;
    }


    /**
     * set 域名接入方式 1-&gt;CNAME 2-&gt;NS 3-&gt;IP(Spectrum) 逗号拼接(1,2)
     *
     * @param zoneAccessType
     */
    public DescribePackRes zoneAccessType(String zoneAccessType) {
        this.zoneAccessType = zoneAccessType;
        return this;
    }


    /**
     * set 速率限制Ratelimit数量 0-&gt;不支持 大于0-&gt;N条
     *
     * @param rateLimit
     */
    public DescribePackRes rateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }


    /**
     * set 日志推送服务 False-&gt;不支持 True-&gt;支持
     *
     * @param logPush
     */
    public DescribePackRes logPush(Boolean logPush) {
        this.logPush = logPush;
        return this;
    }


    /**
     * set 支持的协议类型 1-&gt;HTTP 2-&gt;HTTPS 3-&gt;HTTP2 4-&gt;HTTP3 5-&gt;TCP 逗号拼接(1,2)
     *
     * @param protocol
     */
    public DescribePackRes protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }


    /**
     * set 应用攻击防护 False-&gt;不支持 True-&gt;支持
     *
     * @param appAttackProtection
     */
    public DescribePackRes appAttackProtection(Boolean appAttackProtection) {
        this.appAttackProtection = appAttackProtection;
        return this;
    }


    /**
     * set CC攻击标准防护 False-&gt;不支持 True-&gt;自动防护
     *
     * @param ccAttackStandardProtection
     */
    public DescribePackRes ccAttackStandardProtection(Boolean ccAttackStandardProtection) {
        this.ccAttackStandardProtection = ccAttackStandardProtection;
        return this;
    }


    /**
     * set CC攻击高级防护 False-&gt;不支持 True-&gt;BOT+Rate Limiting
     *
     * @param ccAttackAdvancedProtection
     */
    public DescribePackRes ccAttackAdvancedProtection(Boolean ccAttackAdvancedProtection) {
        this.ccAttackAdvancedProtection = ccAttackAdvancedProtection;
        return this;
    }


    /**
     * set 技术支持 1-&gt;客服工单 2-&gt;产品技术专家 逗号拼接(1,2)
     *
     * @param technicalSupport
     */
    public DescribePackRes technicalSupport(String technicalSupport) {
        this.technicalSupport = technicalSupport;
        return this;
    }


    /**
     * set 域名扩展包 False-&gt;不支持 True-&gt;支持
     *
     * @param zoneExtPack
     */
    public DescribePackRes zoneExtPack(Boolean zoneExtPack) {
        this.zoneExtPack = zoneExtPack;
        return this;
    }


    /**
     * set Websocket False-&gt;不支持 True-&gt;支持
     *
     * @param websocket
     */
    public DescribePackRes websocket(Boolean websocket) {
        this.websocket = websocket;
        return this;
    }


}