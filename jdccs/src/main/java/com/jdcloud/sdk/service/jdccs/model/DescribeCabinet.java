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
 * 机柜
 */
public class DescribeCabinet  implements java.io.Serializable {

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
     * 机柜Id
     */
    private String cabinetId;

    /**
     * 机柜编码
     */
    private String cabinetNo;

    /**
     * 房间号
     */
    private String roomNo;

    /**
     * 机柜空间(U)
     */
    private Integer cabinetSpace;

    /**
     * 额定电流(A)
     */
    private Integer cabinetPower;

    /**
     * 机柜类型 formal:正式机柜 reserved:预留机柜
     */
    private String cabinetType;

    /**
     * 机柜开通状态 disabled:未开通 enabling:开通中 enabled:已开通 disabling:关电中
     */
    private String cabinetOpenStatus;

    /**
     * 开通时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     */
    private String cabinetOpenTime;

    /**
     * 到期时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     */
    private String expireTime;

    /**
     * 预留开始时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     */
    private String reserveStartTime;

    /**
     * 预留结束时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     */
    private String reserveEndTime;

    /**
     * 占用U数(U)
     */
    private Integer rackUOccupy;

    /**
     * 空闲U数(U)
     */
    private Integer rackUFree;



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
     * get 机柜Id
     *
     * @return
     */
    public String getCabinetId() {
        return cabinetId;
    }

    /**
     * set 机柜Id
     *
     * @param cabinetId
     */
    public void setCabinetId(String cabinetId) {
        this.cabinetId = cabinetId;
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
     * get 房间号
     *
     * @return
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * set 房间号
     *
     * @param roomNo
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }


    /**
     * get 机柜空间(U)
     *
     * @return
     */
    public Integer getCabinetSpace() {
        return cabinetSpace;
    }

    /**
     * set 机柜空间(U)
     *
     * @param cabinetSpace
     */
    public void setCabinetSpace(Integer cabinetSpace) {
        this.cabinetSpace = cabinetSpace;
    }


    /**
     * get 额定电流(A)
     *
     * @return
     */
    public Integer getCabinetPower() {
        return cabinetPower;
    }

    /**
     * set 额定电流(A)
     *
     * @param cabinetPower
     */
    public void setCabinetPower(Integer cabinetPower) {
        this.cabinetPower = cabinetPower;
    }


    /**
     * get 机柜类型 formal:正式机柜 reserved:预留机柜
     *
     * @return
     */
    public String getCabinetType() {
        return cabinetType;
    }

    /**
     * set 机柜类型 formal:正式机柜 reserved:预留机柜
     *
     * @param cabinetType
     */
    public void setCabinetType(String cabinetType) {
        this.cabinetType = cabinetType;
    }


    /**
     * get 机柜开通状态 disabled:未开通 enabling:开通中 enabled:已开通 disabling:关电中
     *
     * @return
     */
    public String getCabinetOpenStatus() {
        return cabinetOpenStatus;
    }

    /**
     * set 机柜开通状态 disabled:未开通 enabling:开通中 enabled:已开通 disabling:关电中
     *
     * @param cabinetOpenStatus
     */
    public void setCabinetOpenStatus(String cabinetOpenStatus) {
        this.cabinetOpenStatus = cabinetOpenStatus;
    }


    /**
     * get 开通时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @return
     */
    public String getCabinetOpenTime() {
        return cabinetOpenTime;
    }

    /**
     * set 开通时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @param cabinetOpenTime
     */
    public void setCabinetOpenTime(String cabinetOpenTime) {
        this.cabinetOpenTime = cabinetOpenTime;
    }


    /**
     * get 到期时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @return
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * set 到期时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @param expireTime
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * get 预留开始时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @return
     */
    public String getReserveStartTime() {
        return reserveStartTime;
    }

    /**
     * set 预留开始时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @param reserveStartTime
     */
    public void setReserveStartTime(String reserveStartTime) {
        this.reserveStartTime = reserveStartTime;
    }


    /**
     * get 预留结束时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @return
     */
    public String getReserveEndTime() {
        return reserveEndTime;
    }

    /**
     * set 预留结束时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @param reserveEndTime
     */
    public void setReserveEndTime(String reserveEndTime) {
        this.reserveEndTime = reserveEndTime;
    }


    /**
     * get 占用U数(U)
     *
     * @return
     */
    public Integer getRackUOccupy() {
        return rackUOccupy;
    }

    /**
     * set 占用U数(U)
     *
     * @param rackUOccupy
     */
    public void setRackUOccupy(Integer rackUOccupy) {
        this.rackUOccupy = rackUOccupy;
    }


    /**
     * get 空闲U数(U)
     *
     * @return
     */
    public Integer getRackUFree() {
        return rackUFree;
    }

    /**
     * set 空闲U数(U)
     *
     * @param rackUFree
     */
    public void setRackUFree(Integer rackUFree) {
        this.rackUFree = rackUFree;
    }



    /**
     * set 机房英文标识
     *
     * @param idc
     */
    public DescribeCabinet idc(String idc) {
        this.idc = idc;
        return this;
    }


    /**
     * set 机房名称
     *
     * @param idcName
     */
    public DescribeCabinet idcName(String idcName) {
        this.idcName = idcName;
        return this;
    }


    /**
     * set 机柜Id
     *
     * @param cabinetId
     */
    public DescribeCabinet cabinetId(String cabinetId) {
        this.cabinetId = cabinetId;
        return this;
    }


    /**
     * set 机柜编码
     *
     * @param cabinetNo
     */
    public DescribeCabinet cabinetNo(String cabinetNo) {
        this.cabinetNo = cabinetNo;
        return this;
    }


    /**
     * set 房间号
     *
     * @param roomNo
     */
    public DescribeCabinet roomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }


    /**
     * set 机柜空间(U)
     *
     * @param cabinetSpace
     */
    public DescribeCabinet cabinetSpace(Integer cabinetSpace) {
        this.cabinetSpace = cabinetSpace;
        return this;
    }


    /**
     * set 额定电流(A)
     *
     * @param cabinetPower
     */
    public DescribeCabinet cabinetPower(Integer cabinetPower) {
        this.cabinetPower = cabinetPower;
        return this;
    }


    /**
     * set 机柜类型 formal:正式机柜 reserved:预留机柜
     *
     * @param cabinetType
     */
    public DescribeCabinet cabinetType(String cabinetType) {
        this.cabinetType = cabinetType;
        return this;
    }


    /**
     * set 机柜开通状态 disabled:未开通 enabling:开通中 enabled:已开通 disabling:关电中
     *
     * @param cabinetOpenStatus
     */
    public DescribeCabinet cabinetOpenStatus(String cabinetOpenStatus) {
        this.cabinetOpenStatus = cabinetOpenStatus;
        return this;
    }


    /**
     * set 开通时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @param cabinetOpenTime
     */
    public DescribeCabinet cabinetOpenTime(String cabinetOpenTime) {
        this.cabinetOpenTime = cabinetOpenTime;
        return this;
    }


    /**
     * set 到期时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @param expireTime
     */
    public DescribeCabinet expireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }


    /**
     * set 预留开始时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @param reserveStartTime
     */
    public DescribeCabinet reserveStartTime(String reserveStartTime) {
        this.reserveStartTime = reserveStartTime;
        return this;
    }


    /**
     * set 预留结束时间，遵循ISO8601标准，使用UTC时间，格式为：yyyy-MM-ddTHH:mm:ssZ
     *
     * @param reserveEndTime
     */
    public DescribeCabinet reserveEndTime(String reserveEndTime) {
        this.reserveEndTime = reserveEndTime;
        return this;
    }


    /**
     * set 占用U数(U)
     *
     * @param rackUOccupy
     */
    public DescribeCabinet rackUOccupy(Integer rackUOccupy) {
        this.rackUOccupy = rackUOccupy;
        return this;
    }


    /**
     * set 空闲U数(U)
     *
     * @param rackUFree
     */
    public DescribeCabinet rackUFree(Integer rackUFree) {
        this.rackUFree = rackUFree;
        return this;
    }


}