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
 * JDCLOUD Invoice API
 * 京东云发票
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.invoice.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改发票模版
 */
public class EditInvoiceTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 发票类型:[个人增值税普通发票-Personal_VAT_Ordinary_Invoice,企业增值税专用发票-Enterprise_VAT_Special_Invoice,企业增值税普通发票-Enterprise_VAT_Ordinary_Invoice]
     */
    private String invoiceType;

    /**
     * 发票抬头
     */
    private String invoiceTitle;

    /**
     * 开票内容（按类别开票/按明细开票）
     */
    private String invoiceContent;

    /**
     * 纳税人识别码（发票类型为企业增值税专用发票和企业增值税普通发票时必填）
     */
    private String taxId;

    /**
     * 单位名称（发票类型为企业增值税专用发票时必填）
     */
    private String company;

    /**
     * 注册电话（发票类型为个人增值税普通发票和企业增值税普通发票时作为收票人手机号）
     */
    private String phone;

    /**
     * 开户银行（发票类型为企业增值税专用发票时必填）
     */
    private String bank;

    /**
     * 银行账户（发票类型为企业增值税专用发票时必填）
     */
    private String account;

    /**
     * 注册地址（发票类型为企业增值税专用发票时必填）
     */
    private String address;

    /**
     * 邮箱
     */
    private String email;

    /**
     * [电子-electronic]
     */
    private String mediumType;

    /**
     * 地域编码，参考OpenAPI公共说明
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 发票类型:[个人增值税普通发票-Personal_VAT_Ordinary_Invoice,企业增值税专用发票-Enterprise_VAT_Special_Invoice,企业增值税普通发票-Enterprise_VAT_Ordinary_Invoice]
     *
     * @return
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * set 发票类型:[个人增值税普通发票-Personal_VAT_Ordinary_Invoice,企业增值税专用发票-Enterprise_VAT_Special_Invoice,企业增值税普通发票-Enterprise_VAT_Ordinary_Invoice]
     *
     * @param invoiceType
     */
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }


    /**
     * get 发票抬头
     *
     * @return
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * set 发票抬头
     *
     * @param invoiceTitle
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }


    /**
     * get 开票内容（按类别开票/按明细开票）
     *
     * @return
     */
    public String getInvoiceContent() {
        return invoiceContent;
    }

    /**
     * set 开票内容（按类别开票/按明细开票）
     *
     * @param invoiceContent
     */
    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
    }


    /**
     * get 纳税人识别码（发票类型为企业增值税专用发票和企业增值税普通发票时必填）
     *
     * @return
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * set 纳税人识别码（发票类型为企业增值税专用发票和企业增值税普通发票时必填）
     *
     * @param taxId
     */
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }


    /**
     * get 单位名称（发票类型为企业增值税专用发票时必填）
     *
     * @return
     */
    public String getCompany() {
        return company;
    }

    /**
     * set 单位名称（发票类型为企业增值税专用发票时必填）
     *
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }


    /**
     * get 注册电话（发票类型为个人增值税普通发票和企业增值税普通发票时作为收票人手机号）
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 注册电话（发票类型为个人增值税普通发票和企业增值税普通发票时作为收票人手机号）
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * get 开户银行（发票类型为企业增值税专用发票时必填）
     *
     * @return
     */
    public String getBank() {
        return bank;
    }

    /**
     * set 开户银行（发票类型为企业增值税专用发票时必填）
     *
     * @param bank
     */
    public void setBank(String bank) {
        this.bank = bank;
    }


    /**
     * get 银行账户（发票类型为企业增值税专用发票时必填）
     *
     * @return
     */
    public String getAccount() {
        return account;
    }

    /**
     * set 银行账户（发票类型为企业增值税专用发票时必填）
     *
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }


    /**
     * get 注册地址（发票类型为企业增值税专用发票时必填）
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * set 注册地址（发票类型为企业增值税专用发票时必填）
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * get 邮箱
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * get [电子-electronic]
     *
     * @return
     */
    public String getMediumType() {
        return mediumType;
    }

    /**
     * set [电子-electronic]
     *
     * @param mediumType
     */
    public void setMediumType(String mediumType) {
        this.mediumType = mediumType;
    }


    /**
     * get 地域编码，参考OpenAPI公共说明
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域编码，参考OpenAPI公共说明
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 发票类型:[个人增值税普通发票-Personal_VAT_Ordinary_Invoice,企业增值税专用发票-Enterprise_VAT_Special_Invoice,企业增值税普通发票-Enterprise_VAT_Ordinary_Invoice]
     *
     * @param invoiceType
     */
    public EditInvoiceTemplateRequest invoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }


    /**
     * set 发票抬头
     *
     * @param invoiceTitle
     */
    public EditInvoiceTemplateRequest invoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
        return this;
    }


    /**
     * set 开票内容（按类别开票/按明细开票）
     *
     * @param invoiceContent
     */
    public EditInvoiceTemplateRequest invoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
        return this;
    }


    /**
     * set 纳税人识别码（发票类型为企业增值税专用发票和企业增值税普通发票时必填）
     *
     * @param taxId
     */
    public EditInvoiceTemplateRequest taxId(String taxId) {
        this.taxId = taxId;
        return this;
    }


    /**
     * set 单位名称（发票类型为企业增值税专用发票时必填）
     *
     * @param company
     */
    public EditInvoiceTemplateRequest company(String company) {
        this.company = company;
        return this;
    }


    /**
     * set 注册电话（发票类型为个人增值税普通发票和企业增值税普通发票时作为收票人手机号）
     *
     * @param phone
     */
    public EditInvoiceTemplateRequest phone(String phone) {
        this.phone = phone;
        return this;
    }


    /**
     * set 开户银行（发票类型为企业增值税专用发票时必填）
     *
     * @param bank
     */
    public EditInvoiceTemplateRequest bank(String bank) {
        this.bank = bank;
        return this;
    }


    /**
     * set 银行账户（发票类型为企业增值税专用发票时必填）
     *
     * @param account
     */
    public EditInvoiceTemplateRequest account(String account) {
        this.account = account;
        return this;
    }


    /**
     * set 注册地址（发票类型为企业增值税专用发票时必填）
     *
     * @param address
     */
    public EditInvoiceTemplateRequest address(String address) {
        this.address = address;
        return this;
    }


    /**
     * set 邮箱
     *
     * @param email
     */
    public EditInvoiceTemplateRequest email(String email) {
        this.email = email;
        return this;
    }


    /**
     * set [电子-electronic]
     *
     * @param mediumType
     */
    public EditInvoiceTemplateRequest mediumType(String mediumType) {
        this.mediumType = mediumType;
        return this;
    }


    /**
     * set 地域编码，参考OpenAPI公共说明
     *
     * @param regionId
     */
    public EditInvoiceTemplateRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}