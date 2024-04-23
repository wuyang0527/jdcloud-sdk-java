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
 * Listener
 * 监听器资源相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * listener批量删除扩展证书
 */
public class DeleteListenerCertificatesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 【alb Https和Tls协议】扩展证书绑定Id
     * Required:true
     */
    @Required
    
    private List<String> certificateBindIds;
    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 监听器ID
     * Required:true
     */
    @Required
    private String listenerId;



    /**
    * get 【alb Https和Tls协议】扩展证书绑定Id
    *
    * @return
    */
    public List<String> getCertificateBindIds() {
        return certificateBindIds;
    }

    /**
    * set 【alb Https和Tls协议】扩展证书绑定Id
    *
    * @param certificateBindIds
    */
    public void setCertificateBindIds(List<String> certificateBindIds) {
        this.certificateBindIds = certificateBindIds;
    }


    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 监听器ID
     *
     * @return
     */
    public String getListenerId() {
        return listenerId;
    }

    /**
     * set 监听器ID
     *
     * @param listenerId
     */
    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }



    /**
    * set 【alb Https和Tls协议】扩展证书绑定Id
    *
    * @param certificateBindIds
    */
    public DeleteListenerCertificatesRequest certificateBindIds(List<String> certificateBindIds) {
        this.certificateBindIds = certificateBindIds;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public DeleteListenerCertificatesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 监听器ID
     *
     * @param listenerId
     */
    public DeleteListenerCertificatesRequest listenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }



    /**
     * add item to 【alb Https和Tls协议】扩展证书绑定Id
     *
     * @param certificateBindId
     */
    public void addCertificateBindId(String certificateBindId) {
        if (this.certificateBindIds == null) {
            this.certificateBindIds = new ArrayList<>();
        }
        this.certificateBindIds.add(certificateBindId);
    }
}