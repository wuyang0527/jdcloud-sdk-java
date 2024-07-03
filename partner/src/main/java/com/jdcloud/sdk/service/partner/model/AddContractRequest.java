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
 * 合作信息管理-合作产品接口
 * 合作信息-合作产品方案管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.partner.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加合同信息
 */
public class AddContractRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 合同唯一标识(添加不需要传，编辑必传)
     */
    private String contractUuid;

    /**
     * 合同编号
     */
    private String contractNo;

    /**
     * 开始时间
     */
    private String startDate;

    /**
     * 结束时间
     */
    private String endDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 合同附件文件标识
     */
    private String fileUuid;

    /**
     * 区域(如:cn-north-1)
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 合同唯一标识(添加不需要传，编辑必传)
     *
     * @return
     */
    public String getContractUuid() {
        return contractUuid;
    }

    /**
     * set 合同唯一标识(添加不需要传，编辑必传)
     *
     * @param contractUuid
     */
    public void setContractUuid(String contractUuid) {
        this.contractUuid = contractUuid;
    }


    /**
     * get 合同编号
     *
     * @return
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * set 合同编号
     *
     * @param contractNo
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }


    /**
     * get 开始时间
     *
     * @return
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * set 开始时间
     *
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * get 结束时间
     *
     * @return
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * set 结束时间
     *
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    /**
     * get 备注
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 备注
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
     * get 合同附件文件标识
     *
     * @return
     */
    public String getFileUuid() {
        return fileUuid;
    }

    /**
     * set 合同附件文件标识
     *
     * @param fileUuid
     */
    public void setFileUuid(String fileUuid) {
        this.fileUuid = fileUuid;
    }


    /**
     * get 区域(如:cn-north-1)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域(如:cn-north-1)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 合同唯一标识(添加不需要传，编辑必传)
     *
     * @param contractUuid
     */
    public AddContractRequest contractUuid(String contractUuid) {
        this.contractUuid = contractUuid;
        return this;
    }


    /**
     * set 合同编号
     *
     * @param contractNo
     */
    public AddContractRequest contractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }


    /**
     * set 开始时间
     *
     * @param startDate
     */
    public AddContractRequest startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }


    /**
     * set 结束时间
     *
     * @param endDate
     */
    public AddContractRequest endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }


    /**
     * set 备注
     *
     * @param remark
     */
    public AddContractRequest remark(String remark) {
        this.remark = remark;
        return this;
    }


    /**
     * set 合同附件文件标识
     *
     * @param fileUuid
     */
    public AddContractRequest fileUuid(String fileUuid) {
        this.fileUuid = fileUuid;
        return this;
    }


    /**
     * set 区域(如:cn-north-1)
     *
     * @param regionId
     */
    public AddContractRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}