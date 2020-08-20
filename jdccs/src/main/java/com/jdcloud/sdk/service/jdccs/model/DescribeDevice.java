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

package com.jdcloud.sdk.service.jdccs.model;


/**
 * 设备
 */
public class DescribeDevice  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机房英文标识
     */
    private String idc;

    /**
     * 机房名称
     */
    private String idcName;

    /**
     * 设备Id
     */
    private String deviceId;

    /**
     * 设备编码
     */
    private String deviceNo;

    /**
     * 设备SN号
     */
    private String snNo;

    /**
     * 机柜编码
     */
    private String cabinetNo;

    /**
     * 所在U位
     */
    private String rackUIndex;

    /**
     * U数（U）
     */
    private Integer uNum;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 型号
     */
    private String model;

    /**
     * 设备类型 server:服务器 network:网络设备 storage:存储设备 other:其他设备
     */
    private String deviceType;

    /**
     * 资产归属 own:自备 lease:租赁
     */
    private String assetBelong;

    /**
     * 资产状态 launched:已上架 opened:已开通 canceling:退订中 operating:操作中 modifying:变更中
     */
    private String assetStatus;

    /**
     * 开通时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     */
    private String deviceOpenTime;


    /**
     * get 机房英文标识
     *
     * @return
     */
    public String getIdc() {
        return idc;
    }

    /**
     * set 机房英文标识
     *
     * @param idc
     */
    public void setIdc(String idc) {
        this.idc = idc;
    }

    /**
     * get 机房名称
     *
     * @return
     */
    public String getIdcName() {
        return idcName;
    }

    /**
     * set 机房名称
     *
     * @param idcName
     */
    public void setIdcName(String idcName) {
        this.idcName = idcName;
    }

    /**
     * get 设备Id
     *
     * @return
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set 设备Id
     *
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * get 设备编码
     *
     * @return
     */
    public String getDeviceNo() {
        return deviceNo;
    }

    /**
     * set 设备编码
     *
     * @param deviceNo
     */
    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    /**
     * get 设备SN号
     *
     * @return
     */
    public String getSnNo() {
        return snNo;
    }

    /**
     * set 设备SN号
     *
     * @param snNo
     */
    public void setSnNo(String snNo) {
        this.snNo = snNo;
    }

    /**
     * get 机柜编码
     *
     * @return
     */
    public String getCabinetNo() {
        return cabinetNo;
    }

    /**
     * set 机柜编码
     *
     * @param cabinetNo
     */
    public void setCabinetNo(String cabinetNo) {
        this.cabinetNo = cabinetNo;
    }

    /**
     * get 所在U位
     *
     * @return
     */
    public String getRackUIndex() {
        return rackUIndex;
    }

    /**
     * set 所在U位
     *
     * @param rackUIndex
     */
    public void setRackUIndex(String rackUIndex) {
        this.rackUIndex = rackUIndex;
    }

    /**
     * get U数（U）
     *
     * @return
     */
    public Integer getUNum() {
        return uNum;
    }

    /**
     * set U数（U）
     *
     * @param uNum
     */
    public void setUNum(Integer uNum) {
        this.uNum = uNum;
    }

    /**
     * get 品牌
     *
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     * set 品牌
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * get 型号
     *
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * set 型号
     *
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * get 设备类型 server:服务器 network:网络设备 storage:存储设备 other:其他设备
     *
     * @return
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * set 设备类型 server:服务器 network:网络设备 storage:存储设备 other:其他设备
     *
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * get 资产归属 own:自备 lease:租赁
     *
     * @return
     */
    public String getAssetBelong() {
        return assetBelong;
    }

    /**
     * set 资产归属 own:自备 lease:租赁
     *
     * @param assetBelong
     */
    public void setAssetBelong(String assetBelong) {
        this.assetBelong = assetBelong;
    }

    /**
     * get 资产状态 launched:已上架 opened:已开通 canceling:退订中 operating:操作中 modifying:变更中
     *
     * @return
     */
    public String getAssetStatus() {
        return assetStatus;
    }

    /**
     * set 资产状态 launched:已上架 opened:已开通 canceling:退订中 operating:操作中 modifying:变更中
     *
     * @param assetStatus
     */
    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
    }

    /**
     * get 开通时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @return
     */
    public String getDeviceOpenTime() {
        return deviceOpenTime;
    }

    /**
     * set 开通时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @param deviceOpenTime
     */
    public void setDeviceOpenTime(String deviceOpenTime) {
        this.deviceOpenTime = deviceOpenTime;
    }


    /**
     * set 机房英文标识
     *
     * @param idc
     */
    public DescribeDevice idc(String idc) {
        this.idc = idc;
        return this;
    }

    /**
     * set 机房名称
     *
     * @param idcName
     */
    public DescribeDevice idcName(String idcName) {
        this.idcName = idcName;
        return this;
    }

    /**
     * set 设备Id
     *
     * @param deviceId
     */
    public DescribeDevice deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * set 设备编码
     *
     * @param deviceNo
     */
    public DescribeDevice deviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
        return this;
    }

    /**
     * set 设备SN号
     *
     * @param snNo
     */
    public DescribeDevice snNo(String snNo) {
        this.snNo = snNo;
        return this;
    }

    /**
     * set 机柜编码
     *
     * @param cabinetNo
     */
    public DescribeDevice cabinetNo(String cabinetNo) {
        this.cabinetNo = cabinetNo;
        return this;
    }

    /**
     * set 所在U位
     *
     * @param rackUIndex
     */
    public DescribeDevice rackUIndex(String rackUIndex) {
        this.rackUIndex = rackUIndex;
        return this;
    }

    /**
     * set U数（U）
     *
     * @param uNum
     */
    public DescribeDevice uNum(Integer uNum) {
        this.uNum = uNum;
        return this;
    }

    /**
     * set 品牌
     *
     * @param brand
     */
    public DescribeDevice brand(String brand) {
        this.brand = brand;
        return this;
    }

    /**
     * set 型号
     *
     * @param model
     */
    public DescribeDevice model(String model) {
        this.model = model;
        return this;
    }

    /**
     * set 设备类型 server:服务器 network:网络设备 storage:存储设备 other:其他设备
     *
     * @param deviceType
     */
    public DescribeDevice deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * set 资产归属 own:自备 lease:租赁
     *
     * @param assetBelong
     */
    public DescribeDevice assetBelong(String assetBelong) {
        this.assetBelong = assetBelong;
        return this;
    }

    /**
     * set 资产状态 launched:已上架 opened:已开通 canceling:退订中 operating:操作中 modifying:变更中
     *
     * @param assetStatus
     */
    public DescribeDevice assetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
        return this;
    }

    /**
     * set 开通时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @param deviceOpenTime
     */
    public DescribeDevice deviceOpenTime(String deviceOpenTime) {
        this.deviceOpenTime = deviceOpenTime;
        return this;
    }


}