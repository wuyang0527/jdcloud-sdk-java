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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置回源OSS鉴权
 */
public class ConfigBackSourceOssRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * on/off，若为on则以下必传参数不可为空[accessKey,secretKey,bucket,domain2],若为off则以下参数均不能有值[accessKey,secretKey,bucket,suffix,domain2]
     */
    private String status;

    /**
     * status 为on时必填
     */
    private String accessKey;

    /**
     * status 为on时必填
     */
    private String secretKey;

    /**
     * oss桶名,status 为on时必填
     */
    private String bucket;

    /**
     * oss后缀,status 为on时选填
     */
    private String suffix;

    /**
     * status 为on时必填
     */
    private String domain2;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;


    /**
     * get on/off，若为on则以下必传参数不可为空[accessKey,secretKey,bucket,domain2],若为off则以下参数均不能有值[accessKey,secretKey,bucket,suffix,domain2]
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set on/off，若为on则以下必传参数不可为空[accessKey,secretKey,bucket,domain2],若为off则以下参数均不能有值[accessKey,secretKey,bucket,suffix,domain2]
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get status 为on时必填
     *
     * @return
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * set status 为on时必填
     *
     * @param accessKey
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * get status 为on时必填
     *
     * @return
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * set status 为on时必填
     *
     * @param secretKey
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * get oss桶名,status 为on时必填
     *
     * @return
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * set oss桶名,status 为on时必填
     *
     * @param bucket
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * get oss后缀,status 为on时选填
     *
     * @return
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * set oss后缀,status 为on时选填
     *
     * @param suffix
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * get status 为on时必填
     *
     * @return
     */
    public String getDomain2() {
        return domain2;
    }

    /**
     * set status 为on时必填
     *
     * @param domain2
     */
    public void setDomain2(String domain2) {
        this.domain2 = domain2;
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
     * set on/off，若为on则以下必传参数不可为空[accessKey,secretKey,bucket,domain2],若为off则以下参数均不能有值[accessKey,secretKey,bucket,suffix,domain2]
     *
     * @param status
     */
    public ConfigBackSourceOssRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set status 为on时必填
     *
     * @param accessKey
     */
    public ConfigBackSourceOssRequest accessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * set status 为on时必填
     *
     * @param secretKey
     */
    public ConfigBackSourceOssRequest secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * set oss桶名,status 为on时必填
     *
     * @param bucket
     */
    public ConfigBackSourceOssRequest bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * set oss后缀,status 为on时选填
     *
     * @param suffix
     */
    public ConfigBackSourceOssRequest suffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * set status 为on时必填
     *
     * @param domain2
     */
    public ConfigBackSourceOssRequest domain2(String domain2) {
        this.domain2 = domain2;
        return this;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public ConfigBackSourceOssRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


}