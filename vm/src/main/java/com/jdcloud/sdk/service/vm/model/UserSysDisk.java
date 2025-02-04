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

package com.jdcloud.sdk.service.vm.model;


/**
 * 用户任意容量特殊本地盘配置信息。
 */
public class UserSysDisk  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin。
     */
    private String pin;

    /**
     * 地域。
     */
    private String region;

    /**
     * 系统类型。支持范围：&#x60;linux、windows&#x60;。
     */
    private String systemType;

    /**
     * 默认本地盘系统盘大小，单位GB。
     */
    private Integer systemDiskSize;

    /**
     * 逗号分隔的规格列表，&#x60;*&#x60; 代表所有。
     */
    private String flavors;


    /**
     * get 用户pin。
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin。
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 地域。
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域。
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 系统类型。支持范围：&#x60;linux、windows&#x60;。
     *
     * @return
     */
    public String getSystemType() {
        return systemType;
    }

    /**
     * set 系统类型。支持范围：&#x60;linux、windows&#x60;。
     *
     * @param systemType
     */
    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    /**
     * get 默认本地盘系统盘大小，单位GB。
     *
     * @return
     */
    public Integer getSystemDiskSize() {
        return systemDiskSize;
    }

    /**
     * set 默认本地盘系统盘大小，单位GB。
     *
     * @param systemDiskSize
     */
    public void setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
    }

    /**
     * get 逗号分隔的规格列表，&#x60;*&#x60; 代表所有。
     *
     * @return
     */
    public String getFlavors() {
        return flavors;
    }

    /**
     * set 逗号分隔的规格列表，&#x60;*&#x60; 代表所有。
     *
     * @param flavors
     */
    public void setFlavors(String flavors) {
        this.flavors = flavors;
    }


    /**
     * set 用户pin。
     *
     * @param pin
     */
    public UserSysDisk pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 地域。
     *
     * @param region
     */
    public UserSysDisk region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 系统类型。支持范围：&#x60;linux、windows&#x60;。
     *
     * @param systemType
     */
    public UserSysDisk systemType(String systemType) {
        this.systemType = systemType;
        return this;
    }

    /**
     * set 默认本地盘系统盘大小，单位GB。
     *
     * @param systemDiskSize
     */
    public UserSysDisk systemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }

    /**
     * set 逗号分隔的规格列表，&#x60;*&#x60; 代表所有。
     *
     * @param flavors
     */
    public UserSysDisk flavors(String flavors) {
        this.flavors = flavors;
        return this;
    }


}