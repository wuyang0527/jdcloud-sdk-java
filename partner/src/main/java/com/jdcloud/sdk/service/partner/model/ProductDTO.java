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
 * productDTO
 */
public class ProductDTO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Number id;

    /**
     * 产品类型
     */
    private Integer productType;

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
     * 返回编码0成功-1失败
     */
    private Integer code;

    /**
     * 返回消息
     */
    private String message;



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
     * get 产品类型
     *
     * @return
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * set 产品类型
     *
     * @param productType
     */
    public void setProductType(Integer productType) {
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
     * get 返回编码0成功-1失败
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set 返回编码0成功-1失败
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }


    /**
     * get 返回消息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 返回消息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }



    /**
     * set ID
     *
     * @param id
     */
    public ProductDTO id(Number id) {
        this.id = id;
        return this;
    }


    /**
     * set 产品类型
     *
     * @param productType
     */
    public ProductDTO productType(Integer productType) {
        this.productType = productType;
        return this;
    }


    /**
     * set 产品ID
     *
     * @param productId
     */
    public ProductDTO productId(String productId) {
        this.productId = productId;
        return this;
    }


    /**
     * set 产品名称
     *
     * @param productName
     */
    public ProductDTO productName(String productName) {
        this.productName = productName;
        return this;
    }


    /**
     * set 状态
     *
     * @param status
     */
    public ProductDTO status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 备注
     *
     * @param remark
     */
    public ProductDTO remark(String remark) {
        this.remark = remark;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public ProductDTO createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 创建人
     *
     * @param createUser
     */
    public ProductDTO createUser(String createUser) {
        this.createUser = createUser;
        return this;
    }


    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public ProductDTO updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 修改人
     *
     * @param updateUser
     */
    public ProductDTO updateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }


    /**
     * set 返回编码0成功-1失败
     *
     * @param code
     */
    public ProductDTO code(Integer code) {
        this.code = code;
        return this;
    }


    /**
     * set 返回消息
     *
     * @param message
     */
    public ProductDTO message(String message) {
        this.message = message;
        return this;
    }


}