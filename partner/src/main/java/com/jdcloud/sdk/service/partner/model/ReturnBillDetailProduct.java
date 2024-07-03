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

package com.jdcloud.sdk.service.partner.model;


/**
 * returnBillDetailProduct
 */
public class ReturnBillDetailProduct  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Number id;

    /**
     * 返还单明细ID
     */
    private Number returnBillDetailId;

    /**
     * 产品类型
     */
    private String productType;

    /**
     * 产品ID
     */
    private String productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 是否删除0未删除,1已删除
     */
    private Integer yn;



    /**
     * get ID
     *
     * @return
     */
    public Number getId() {
        return id;
    }

    /**
     * set ID
     *
     * @param id
     */
    public void setId(Number id) {
        this.id = id;
    }


    /**
     * get 返还单明细ID
     *
     * @return
     */
    public Number getReturnBillDetailId() {
        return returnBillDetailId;
    }

    /**
     * set 返还单明细ID
     *
     * @param returnBillDetailId
     */
    public void setReturnBillDetailId(Number returnBillDetailId) {
        this.returnBillDetailId = returnBillDetailId;
    }


    /**
     * get 产品类型
     *
     * @return
     */
    public String getProductType() {
        return productType;
    }

    /**
     * set 产品类型
     *
     * @param productType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }


    /**
     * get 产品ID
     *
     * @return
     */
    public String getProductId() {
        return productId;
    }

    /**
     * set 产品ID
     *
     * @param productId
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }


    /**
     * get 产品名称
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set 产品名称
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }


    /**
     * get 状态
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 创建人
     *
     * @return
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * set 创建人
     *
     * @param createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }


    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 修改人
     *
     * @return
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * set 修改人
     *
     * @param updateUser
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }


    /**
     * get 是否删除0未删除,1已删除
     *
     * @return
     */
    public Integer getYn() {
        return yn;
    }

    /**
     * set 是否删除0未删除,1已删除
     *
     * @param yn
     */
    public void setYn(Integer yn) {
        this.yn = yn;
    }



    /**
     * set ID
     *
     * @param id
     */
    public ReturnBillDetailProduct id(Number id) {
        this.id = id;
        return this;
    }


    /**
     * set 返还单明细ID
     *
     * @param returnBillDetailId
     */
    public ReturnBillDetailProduct returnBillDetailId(Number returnBillDetailId) {
        this.returnBillDetailId = returnBillDetailId;
        return this;
    }


    /**
     * set 产品类型
     *
     * @param productType
     */
    public ReturnBillDetailProduct productType(String productType) {
        this.productType = productType;
        return this;
    }


    /**
     * set 产品ID
     *
     * @param productId
     */
    public ReturnBillDetailProduct productId(String productId) {
        this.productId = productId;
        return this;
    }


    /**
     * set 产品名称
     *
     * @param productName
     */
    public ReturnBillDetailProduct productName(String productName) {
        this.productName = productName;
        return this;
    }


    /**
     * set 状态
     *
     * @param status
     */
    public ReturnBillDetailProduct status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 备注
     *
     * @param remark
     */
    public ReturnBillDetailProduct remark(String remark) {
        this.remark = remark;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public ReturnBillDetailProduct createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 创建人
     *
     * @param createUser
     */
    public ReturnBillDetailProduct createUser(String createUser) {
        this.createUser = createUser;
        return this;
    }


    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public ReturnBillDetailProduct updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 修改人
     *
     * @param updateUser
     */
    public ReturnBillDetailProduct updateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }


    /**
     * set 是否删除0未删除,1已删除
     *
     * @param yn
     */
    public ReturnBillDetailProduct yn(Integer yn) {
        this.yn = yn;
        return this;
    }


}