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

package com.jdcloud.sdk.service.cloudsign.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 1. contractContent,templateContent,templateId 三个参数必须有一个有内容
2. contractContent,templateContent,templateId 三者同时存在，按顺序选择
3. personStamps,companyStamps 两个参数至少有一个有内容，可以传多个印章

 */
public class ContractSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 个人用户盖章信息
     */
    private List<PerStamp> personStamps;

    /**
     * 企业用户盖章信息
     */
    private List<ComStamp> companyStamps;

    /**
     * 合同文件（base64）
     */
    private String contractContent;

    /**
     * 合同模板文件（base64）
     */
    private String templateContent;

    /**
     * 合同模板文件ID
     */
    private String templateId;

    /**
     * 合同标题或名称
     */
    private String contractTitle;

    /**
     * 证书类型
     */
    private String caType;


    /**
     * get 个人用户盖章信息
     *
     * @return
     */
    public List<PerStamp> getPersonStamps() {
        return personStamps;
    }

    /**
     * set 个人用户盖章信息
     *
     * @param personStamps
     */
    public void setPersonStamps(List<PerStamp> personStamps) {
        this.personStamps = personStamps;
    }

    /**
     * get 企业用户盖章信息
     *
     * @return
     */
    public List<ComStamp> getCompanyStamps() {
        return companyStamps;
    }

    /**
     * set 企业用户盖章信息
     *
     * @param companyStamps
     */
    public void setCompanyStamps(List<ComStamp> companyStamps) {
        this.companyStamps = companyStamps;
    }

    /**
     * get 合同文件（base64）
     *
     * @return
     */
    public String getContractContent() {
        return contractContent;
    }

    /**
     * set 合同文件（base64）
     *
     * @param contractContent
     */
    public void setContractContent(String contractContent) {
        this.contractContent = contractContent;
    }

    /**
     * get 合同模板文件（base64）
     *
     * @return
     */
    public String getTemplateContent() {
        return templateContent;
    }

    /**
     * set 合同模板文件（base64）
     *
     * @param templateContent
     */
    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    /**
     * get 合同模板文件ID
     *
     * @return
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * set 合同模板文件ID
     *
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * get 合同标题或名称
     *
     * @return
     */
    public String getContractTitle() {
        return contractTitle;
    }

    /**
     * set 合同标题或名称
     *
     * @param contractTitle
     */
    public void setContractTitle(String contractTitle) {
        this.contractTitle = contractTitle;
    }

    /**
     * get 证书类型
     *
     * @return
     */
    public String getCaType() {
        return caType;
    }

    /**
     * set 证书类型
     *
     * @param caType
     */
    public void setCaType(String caType) {
        this.caType = caType;
    }


    /**
     * set 个人用户盖章信息
     *
     * @param personStamps
     */
    public ContractSpec personStamps(List<PerStamp> personStamps) {
        this.personStamps = personStamps;
        return this;
    }

    /**
     * set 企业用户盖章信息
     *
     * @param companyStamps
     */
    public ContractSpec companyStamps(List<ComStamp> companyStamps) {
        this.companyStamps = companyStamps;
        return this;
    }

    /**
     * set 合同文件（base64）
     *
     * @param contractContent
     */
    public ContractSpec contractContent(String contractContent) {
        this.contractContent = contractContent;
        return this;
    }

    /**
     * set 合同模板文件（base64）
     *
     * @param templateContent
     */
    public ContractSpec templateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }

    /**
     * set 合同模板文件ID
     *
     * @param templateId
     */
    public ContractSpec templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * set 合同标题或名称
     *
     * @param contractTitle
     */
    public ContractSpec contractTitle(String contractTitle) {
        this.contractTitle = contractTitle;
        return this;
    }

    /**
     * set 证书类型
     *
     * @param caType
     */
    public ContractSpec caType(String caType) {
        this.caType = caType;
        return this;
    }


    /**
     * add item to 个人用户盖章信息
     *
     * @param personStamp
     */
    public void addPersonStamp(PerStamp personStamp) {
        if (this.personStamps == null) {
            this.personStamps = new ArrayList<>();
        }
        this.personStamps.add(personStamp);
    }

    /**
     * add item to 企业用户盖章信息
     *
     * @param companyStamp
     */
    public void addCompanyStamp(ComStamp companyStamp) {
        if (this.companyStamps == null) {
            this.companyStamps = new ArrayList<>();
        }
        this.companyStamps.add(companyStamp);
    }

}