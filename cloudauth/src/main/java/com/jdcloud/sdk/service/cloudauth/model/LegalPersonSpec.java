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

package com.jdcloud.sdk.service.cloudauth.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * legalPersonSpec
 */
public class LegalPersonSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 企业类型：
0: 企业(ET_PE_QiYe)
1: 个体工商户(ET_SE_GeTiGongShangHu)
2: 政府机构/事业单位(ET_OU_ZhengFu_ShiYeDanWei)

     * Required:true
     */
    @Required
    private Integer companyType;

    /**
     * 企业名称
     * Required:true
     */
    @Required
    private String companyName;

    /**
     * 统一社会信用代码或营业执照注册号
     * Required:true
     */
    @Required
    private String idCode;

    /**
     * 法定代表人姓名
     * Required:true
     */
    @Required
    private String legalPersonName;

    /**
     * 法定代表人身份证号
     * Required:true
     */
    @Required
    private String legalPersonId;



    /**
     * get 企业类型：
0: 企业(ET_PE_QiYe)
1: 个体工商户(ET_SE_GeTiGongShangHu)
2: 政府机构/事业单位(ET_OU_ZhengFu_ShiYeDanWei)

     *
     * @return
     */
    public Integer getCompanyType() {
        return companyType;
    }

    /**
     * set 企业类型：
0: 企业(ET_PE_QiYe)
1: 个体工商户(ET_SE_GeTiGongShangHu)
2: 政府机构/事业单位(ET_OU_ZhengFu_ShiYeDanWei)

     *
     * @param companyType
     */
    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }


    /**
     * get 企业名称
     *
     * @return
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * set 企业名称
     *
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * get 统一社会信用代码或营业执照注册号
     *
     * @return
     */
    public String getIdCode() {
        return idCode;
    }

    /**
     * set 统一社会信用代码或营业执照注册号
     *
     * @param idCode
     */
    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }


    /**
     * get 法定代表人姓名
     *
     * @return
     */
    public String getLegalPersonName() {
        return legalPersonName;
    }

    /**
     * set 法定代表人姓名
     *
     * @param legalPersonName
     */
    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
    }


    /**
     * get 法定代表人身份证号
     *
     * @return
     */
    public String getLegalPersonId() {
        return legalPersonId;
    }

    /**
     * set 法定代表人身份证号
     *
     * @param legalPersonId
     */
    public void setLegalPersonId(String legalPersonId) {
        this.legalPersonId = legalPersonId;
    }



    /**
     * set 企业类型：
0: 企业(ET_PE_QiYe)
1: 个体工商户(ET_SE_GeTiGongShangHu)
2: 政府机构/事业单位(ET_OU_ZhengFu_ShiYeDanWei)

     *
     * @param companyType
     */
    public LegalPersonSpec companyType(Integer companyType) {
        this.companyType = companyType;
        return this;
    }


    /**
     * set 企业名称
     *
     * @param companyName
     */
    public LegalPersonSpec companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }


    /**
     * set 统一社会信用代码或营业执照注册号
     *
     * @param idCode
     */
    public LegalPersonSpec idCode(String idCode) {
        this.idCode = idCode;
        return this;
    }


    /**
     * set 法定代表人姓名
     *
     * @param legalPersonName
     */
    public LegalPersonSpec legalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }


    /**
     * set 法定代表人身份证号
     *
     * @param legalPersonId
     */
    public LegalPersonSpec legalPersonId(String legalPersonId) {
        this.legalPersonId = legalPersonId;
        return this;
    }


}