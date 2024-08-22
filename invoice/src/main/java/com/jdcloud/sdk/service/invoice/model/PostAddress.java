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

package com.jdcloud.sdk.service.invoice.model;


/**
 * postAddress
 */
public class PostAddress  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 收件人姓名
     */
    private String name;

    /**
     * 收件人电话
     */
    private String phone;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String county;

    /**
     * 县
     */
    private String town;

    /**
     * 邮编
     */
    private String address;

    /**
     * 是否默认收货地址
     */
    private Integer isDefault;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 邮编
     */
    private String zipCode;

    /**
     * 省id
     */
    private Integer provinceId;

    /**
     * 市id
     */
    private Integer cityId;

    /**
     * 区县id
     */
    private Integer countyId;

    /**
     * 乡镇id
     */
    private Integer townId;



    /**
     * get id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get 收件人姓名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 收件人姓名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 收件人电话
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 收件人电话
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * get 省
     *
     * @return
     */
    public String getProvince() {
        return province;
    }

    /**
     * set 省
     *
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }


    /**
     * get 市
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * set 市
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * get 区
     *
     * @return
     */
    public String getCounty() {
        return county;
    }

    /**
     * set 区
     *
     * @param county
     */
    public void setCounty(String county) {
        this.county = county;
    }


    /**
     * get 县
     *
     * @return
     */
    public String getTown() {
        return town;
    }

    /**
     * set 县
     *
     * @param town
     */
    public void setTown(String town) {
        this.town = town;
    }


    /**
     * get 邮编
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * set 邮编
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * get 是否默认收货地址
     *
     * @return
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * set 是否默认收货地址
     *
     * @param isDefault
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
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
     * get 邮编
     *
     * @return
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * set 邮编
     *
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * get 省id
     *
     * @return
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * set 省id
     *
     * @param provinceId
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }


    /**
     * get 市id
     *
     * @return
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * set 市id
     *
     * @param cityId
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }


    /**
     * get 区县id
     *
     * @return
     */
    public Integer getCountyId() {
        return countyId;
    }

    /**
     * set 区县id
     *
     * @param countyId
     */
    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }


    /**
     * get 乡镇id
     *
     * @return
     */
    public Integer getTownId() {
        return townId;
    }

    /**
     * set 乡镇id
     *
     * @param townId
     */
    public void setTownId(Integer townId) {
        this.townId = townId;
    }



    /**
     * set id
     *
     * @param id
     */
    public PostAddress id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set 收件人姓名
     *
     * @param name
     */
    public PostAddress name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 收件人电话
     *
     * @param phone
     */
    public PostAddress phone(String phone) {
        this.phone = phone;
        return this;
    }


    /**
     * set 省
     *
     * @param province
     */
    public PostAddress province(String province) {
        this.province = province;
        return this;
    }


    /**
     * set 市
     *
     * @param city
     */
    public PostAddress city(String city) {
        this.city = city;
        return this;
    }


    /**
     * set 区
     *
     * @param county
     */
    public PostAddress county(String county) {
        this.county = county;
        return this;
    }


    /**
     * set 县
     *
     * @param town
     */
    public PostAddress town(String town) {
        this.town = town;
        return this;
    }


    /**
     * set 邮编
     *
     * @param address
     */
    public PostAddress address(String address) {
        this.address = address;
        return this;
    }


    /**
     * set 是否默认收货地址
     *
     * @param isDefault
     */
    public PostAddress isDefault(Integer isDefault) {
        this.isDefault = isDefault;
        return this;
    }


    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public PostAddress updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 用户pin
     *
     * @param pin
     */
    public PostAddress pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public PostAddress createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 邮编
     *
     * @param zipCode
     */
    public PostAddress zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }


    /**
     * set 省id
     *
     * @param provinceId
     */
    public PostAddress provinceId(Integer provinceId) {
        this.provinceId = provinceId;
        return this;
    }


    /**
     * set 市id
     *
     * @param cityId
     */
    public PostAddress cityId(Integer cityId) {
        this.cityId = cityId;
        return this;
    }


    /**
     * set 区县id
     *
     * @param countyId
     */
    public PostAddress countyId(Integer countyId) {
        this.countyId = countyId;
        return this;
    }


    /**
     * set 乡镇id
     *
     * @param townId
     */
    public PostAddress townId(Integer townId) {
        this.townId = townId;
        return this;
    }


}