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
import com.jdcloud.sdk.service.cdn.model.CacheRule;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询域名配置信息
 */
public class QueryDomainConfigResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 忽略参数[on,off]
     */
    private String ignoreQueryString;

    /**
     * range参数[on,off]
     */
    private String range;

    /**
     * httpType参数[on,off]
     */
    private String httpType;

    /**
     * https证书
     */
    private String httpsCertificate;

    /**
     * rsa秘钥
     */
    private String httpsRsaKey;

    /**
     * 跳转类型[default,http,https]
     */
    private String httpsJumpType;

    /**
     * 是否支持视频拖拽[on,off]
     */
    private String videoDraft;

    /**
     * group
     */
    private String groupName;

    /**
     * shareId
     */
    private Long shareId;

    /**
     * shareName
     */
    private String shareName;

    /**
     * jcdnTimeAnti
     */
    private String jcdnTimeAnti;

    /**
     * shareCache
     */
    private String shareCache;

    /**
     * isShareOpen
     */
    private String isShareOpen;

    /**
     * gzip参数[on,off]
     */
    private String gzip;

    /**
     * gzipTypes
     */
    private String gzipTypes;

    /**
     * cacheRules
     */
    private List<CacheRule> cacheRules;


    /**
     * get 忽略参数[on,off]
     *
     * @return
     */
    public String getIgnoreQueryString() {
        return ignoreQueryString;
    }

    /**
     * set 忽略参数[on,off]
     *
     * @param ignoreQueryString
     */
    public void setIgnoreQueryString(String ignoreQueryString) {
        this.ignoreQueryString = ignoreQueryString;
    }

    /**
     * get range参数[on,off]
     *
     * @return
     */
    public String getRange() {
        return range;
    }

    /**
     * set range参数[on,off]
     *
     * @param range
     */
    public void setRange(String range) {
        this.range = range;
    }

    /**
     * get httpType参数[on,off]
     *
     * @return
     */
    public String getHttpType() {
        return httpType;
    }

    /**
     * set httpType参数[on,off]
     *
     * @param httpType
     */
    public void setHttpType(String httpType) {
        this.httpType = httpType;
    }

    /**
     * get https证书
     *
     * @return
     */
    public String getHttpsCertificate() {
        return httpsCertificate;
    }

    /**
     * set https证书
     *
     * @param httpsCertificate
     */
    public void setHttpsCertificate(String httpsCertificate) {
        this.httpsCertificate = httpsCertificate;
    }

    /**
     * get rsa秘钥
     *
     * @return
     */
    public String getHttpsRsaKey() {
        return httpsRsaKey;
    }

    /**
     * set rsa秘钥
     *
     * @param httpsRsaKey
     */
    public void setHttpsRsaKey(String httpsRsaKey) {
        this.httpsRsaKey = httpsRsaKey;
    }

    /**
     * get 跳转类型[default,http,https]
     *
     * @return
     */
    public String getHttpsJumpType() {
        return httpsJumpType;
    }

    /**
     * set 跳转类型[default,http,https]
     *
     * @param httpsJumpType
     */
    public void setHttpsJumpType(String httpsJumpType) {
        this.httpsJumpType = httpsJumpType;
    }

    /**
     * get 是否支持视频拖拽[on,off]
     *
     * @return
     */
    public String getVideoDraft() {
        return videoDraft;
    }

    /**
     * set 是否支持视频拖拽[on,off]
     *
     * @param videoDraft
     */
    public void setVideoDraft(String videoDraft) {
        this.videoDraft = videoDraft;
    }

    /**
     * get group
     *
     * @return
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * set group
     *
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * get shareId
     *
     * @return
     */
    public Long getShareId() {
        return shareId;
    }

    /**
     * set shareId
     *
     * @param shareId
     */
    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    /**
     * get shareName
     *
     * @return
     */
    public String getShareName() {
        return shareName;
    }

    /**
     * set shareName
     *
     * @param shareName
     */
    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    /**
     * get jcdnTimeAnti
     *
     * @return
     */
    public String getJcdnTimeAnti() {
        return jcdnTimeAnti;
    }

    /**
     * set jcdnTimeAnti
     *
     * @param jcdnTimeAnti
     */
    public void setJcdnTimeAnti(String jcdnTimeAnti) {
        this.jcdnTimeAnti = jcdnTimeAnti;
    }

    /**
     * get shareCache
     *
     * @return
     */
    public String getShareCache() {
        return shareCache;
    }

    /**
     * set shareCache
     *
     * @param shareCache
     */
    public void setShareCache(String shareCache) {
        this.shareCache = shareCache;
    }

    /**
     * get isShareOpen
     *
     * @return
     */
    public String getIsShareOpen() {
        return isShareOpen;
    }

    /**
     * set isShareOpen
     *
     * @param isShareOpen
     */
    public void setIsShareOpen(String isShareOpen) {
        this.isShareOpen = isShareOpen;
    }

    /**
     * get gzip参数[on,off]
     *
     * @return
     */
    public String getGzip() {
        return gzip;
    }

    /**
     * set gzip参数[on,off]
     *
     * @param gzip
     */
    public void setGzip(String gzip) {
        this.gzip = gzip;
    }

    /**
     * get gzipTypes
     *
     * @return
     */
    public String getGzipTypes() {
        return gzipTypes;
    }

    /**
     * set gzipTypes
     *
     * @param gzipTypes
     */
    public void setGzipTypes(String gzipTypes) {
        this.gzipTypes = gzipTypes;
    }

    /**
     * get cacheRules
     *
     * @return
     */
    public List<CacheRule> getCacheRules() {
        return cacheRules;
    }

    /**
     * set cacheRules
     *
     * @param cacheRules
     */
    public void setCacheRules(List<CacheRule> cacheRules) {
        this.cacheRules = cacheRules;
    }


    /**
     * set 忽略参数[on,off]
     *
     * @param ignoreQueryString
     */
    public QueryDomainConfigResult ignoreQueryString(String ignoreQueryString) {
        this.ignoreQueryString = ignoreQueryString;
        return this;
    }

    /**
     * set range参数[on,off]
     *
     * @param range
     */
    public QueryDomainConfigResult range(String range) {
        this.range = range;
        return this;
    }

    /**
     * set httpType参数[on,off]
     *
     * @param httpType
     */
    public QueryDomainConfigResult httpType(String httpType) {
        this.httpType = httpType;
        return this;
    }

    /**
     * set https证书
     *
     * @param httpsCertificate
     */
    public QueryDomainConfigResult httpsCertificate(String httpsCertificate) {
        this.httpsCertificate = httpsCertificate;
        return this;
    }

    /**
     * set rsa秘钥
     *
     * @param httpsRsaKey
     */
    public QueryDomainConfigResult httpsRsaKey(String httpsRsaKey) {
        this.httpsRsaKey = httpsRsaKey;
        return this;
    }

    /**
     * set 跳转类型[default,http,https]
     *
     * @param httpsJumpType
     */
    public QueryDomainConfigResult httpsJumpType(String httpsJumpType) {
        this.httpsJumpType = httpsJumpType;
        return this;
    }

    /**
     * set 是否支持视频拖拽[on,off]
     *
     * @param videoDraft
     */
    public QueryDomainConfigResult videoDraft(String videoDraft) {
        this.videoDraft = videoDraft;
        return this;
    }

    /**
     * set group
     *
     * @param groupName
     */
    public QueryDomainConfigResult groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * set shareId
     *
     * @param shareId
     */
    public QueryDomainConfigResult shareId(Long shareId) {
        this.shareId = shareId;
        return this;
    }

    /**
     * set shareName
     *
     * @param shareName
     */
    public QueryDomainConfigResult shareName(String shareName) {
        this.shareName = shareName;
        return this;
    }

    /**
     * set jcdnTimeAnti
     *
     * @param jcdnTimeAnti
     */
    public QueryDomainConfigResult jcdnTimeAnti(String jcdnTimeAnti) {
        this.jcdnTimeAnti = jcdnTimeAnti;
        return this;
    }

    /**
     * set shareCache
     *
     * @param shareCache
     */
    public QueryDomainConfigResult shareCache(String shareCache) {
        this.shareCache = shareCache;
        return this;
    }

    /**
     * set isShareOpen
     *
     * @param isShareOpen
     */
    public QueryDomainConfigResult isShareOpen(String isShareOpen) {
        this.isShareOpen = isShareOpen;
        return this;
    }

    /**
     * set gzip参数[on,off]
     *
     * @param gzip
     */
    public QueryDomainConfigResult gzip(String gzip) {
        this.gzip = gzip;
        return this;
    }

    /**
     * set gzipTypes
     *
     * @param gzipTypes
     */
    public QueryDomainConfigResult gzipTypes(String gzipTypes) {
        this.gzipTypes = gzipTypes;
        return this;
    }

    /**
     * set cacheRules
     *
     * @param cacheRules
     */
    public QueryDomainConfigResult cacheRules(List<CacheRule> cacheRules) {
        this.cacheRules = cacheRules;
        return this;
    }


    /**
     * add item to cacheRules
     *
     * @param cacheRule
     */
    public void addCacheRule(CacheRule cacheRule) {
        if (this.cacheRules == null) {
            this.cacheRules = new ArrayList<>();
        }
        this.cacheRules.add(cacheRule);
    }

}