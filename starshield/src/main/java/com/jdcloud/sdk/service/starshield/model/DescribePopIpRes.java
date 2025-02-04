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

import java.util.List;
import java.util.ArrayList;

/**
 * describePopIpRes
 */
public class DescribePopIpRes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ip
     */
    private String ip;

    /**
     * pop 节点id
     */
    private Integer coloId;

    /**
     * ip对应域名信息
     */
    private List<String> domains;

    /**
     * ip对应运营商信息
     */
    private Integer ipIsptype;


    /**
     * get ip
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set ip
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get pop 节点id
     *
     * @return
     */
    public Integer getColoId() {
        return coloId;
    }

    /**
     * set pop 节点id
     *
     * @param coloId
     */
    public void setColoId(Integer coloId) {
        this.coloId = coloId;
    }

    /**
     * get ip对应域名信息
     *
     * @return
     */
    public List<String> getDomains() {
        return domains;
    }

    /**
     * set ip对应域名信息
     *
     * @param domains
     */
    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    /**
     * get ip对应运营商信息
     *
     * @return
     */
    public Integer getIpIsptype() {
        return ipIsptype;
    }

    /**
     * set ip对应运营商信息
     *
     * @param ipIsptype
     */
    public void setIpIsptype(Integer ipIsptype) {
        this.ipIsptype = ipIsptype;
    }


    /**
     * set ip
     *
     * @param ip
     */
    public DescribePopIpRes ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set pop 节点id
     *
     * @param coloId
     */
    public DescribePopIpRes coloId(Integer coloId) {
        this.coloId = coloId;
        return this;
    }

    /**
     * set ip对应域名信息
     *
     * @param domains
     */
    public DescribePopIpRes domains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    /**
     * set ip对应运营商信息
     *
     * @param ipIsptype
     */
    public DescribePopIpRes ipIsptype(Integer ipIsptype) {
        this.ipIsptype = ipIsptype;
        return this;
    }


    /**
     * add item to ip对应域名信息
     *
     * @param domain
     */
    public void addDomain(String domain) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domain);
    }

}