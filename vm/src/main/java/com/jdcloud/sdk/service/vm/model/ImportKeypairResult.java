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
 * SSH密钥对
 * 关于SSH密钥对的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 导入由其他工具生成的密钥对的公钥部分。&lt;br&gt;
若传入已存在的密钥名称，会返回错误。

 */
public class ImportKeypairResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 密钥对名称
     */
    private String keyName;

    /**
     * 密钥对的指纹，根据 RFC4716 定义的公钥指纹格式，采用 MD5 信息摘要算法。
     */
    private String keyFingerprint;


    /**
     * get 密钥对名称
     *
     * @return
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * set 密钥对名称
     *
     * @param keyName
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * get 密钥对的指纹，根据 RFC4716 定义的公钥指纹格式，采用 MD5 信息摘要算法。
     *
     * @return
     */
    public String getKeyFingerprint() {
        return keyFingerprint;
    }

    /**
     * set 密钥对的指纹，根据 RFC4716 定义的公钥指纹格式，采用 MD5 信息摘要算法。
     *
     * @param keyFingerprint
     */
    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }


    /**
     * set 密钥对名称
     *
     * @param keyName
     */
    public ImportKeypairResult keyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * set 密钥对的指纹，根据 RFC4716 定义的公钥指纹格式，采用 MD5 信息摘要算法。
     *
     * @param keyFingerprint
     */
    public ImportKeypairResult keyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
        return this;
    }


}