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

package com.jdcloud.sdk.service.logs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * shipperEnd
 */
public class ShipperEnd  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * UID
     */
    private String uID;

    /**
     * 日志类型
     */
    private String appName;

    /**
     * 压缩格式，为空不压缩
     */
    private String compress;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 投递格式 json,  origin(原始日志格式), 默认origin
     */
    private String fileFormat;

    /**
     * 投递文件大小，单位MB，支持200,300,400,500,1000
     * Required:true
     */
    @Required
    private Long fileSize;

    /**
     * 日志集uuid
     */
    private String logsetUID;

    /**
     * 日志主题uuid
     */
    private String logtopicUID;

    /**
     * 转储任务名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * pin
     */
    private String pin;

    /**
     * 地域信息
     */
    private String region;

    /**
     * 日志采集资源类型
     */
    private Long resourceType;

    /**
     * 日志采集列表
     */
    
    private List<String> resourceUIDs;
    /**
     * serviceCode
     */
    private String serviceCode;

    /**
     * 日志转储任务状态，开启，停止
     */
    private Long status;

    /**
     * 目的地 配置
     * Required:true
     */
    @Required
    private Object targetConf;

    /**
     * 转储目的地类型 0: oss, 目前只支持oss
     */
    private Long targetType;

    /**
     * 投递时间间隔单位分钟，5分钟整数倍，支持5,10,15,20,30,60
     * Required:true
     */
    @Required
    private Long timeInterval;

    /**
     * 更新时间
     */
    private String updateTime;



    /**
     * get UID
     *
     * @return
     */
    public String getUID() {
        return uID;
    }

    /**
     * set UID
     *
     * @param uID
     */
    public void setUID(String uID) {
        this.uID = uID;
    }


    /**
     * get 日志类型
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 日志类型
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }


    /**
     * get 压缩格式，为空不压缩
     *
     * @return
     */
    public String getCompress() {
        return compress;
    }

    /**
     * set 压缩格式，为空不压缩
     *
     * @param compress
     */
    public void setCompress(String compress) {
        this.compress = compress;
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
     * get 投递格式 json,  origin(原始日志格式), 默认origin
     *
     * @return
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * set 投递格式 json,  origin(原始日志格式), 默认origin
     *
     * @param fileFormat
     */
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }


    /**
     * get 投递文件大小，单位MB，支持200,300,400,500,1000
     *
     * @return
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * set 投递文件大小，单位MB，支持200,300,400,500,1000
     *
     * @param fileSize
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * get 日志集uuid
     *
     * @return
     */
    public String getLogsetUID() {
        return logsetUID;
    }

    /**
     * set 日志集uuid
     *
     * @param logsetUID
     */
    public void setLogsetUID(String logsetUID) {
        this.logsetUID = logsetUID;
    }


    /**
     * get 日志主题uuid
     *
     * @return
     */
    public String getLogtopicUID() {
        return logtopicUID;
    }

    /**
     * set 日志主题uuid
     *
     * @param logtopicUID
     */
    public void setLogtopicUID(String logtopicUID) {
        this.logtopicUID = logtopicUID;
    }


    /**
     * get 转储任务名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 转储任务名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 地域信息
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域信息
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * get 日志采集资源类型
     *
     * @return
     */
    public Long getResourceType() {
        return resourceType;
    }

    /**
     * set 日志采集资源类型
     *
     * @param resourceType
     */
    public void setResourceType(Long resourceType) {
        this.resourceType = resourceType;
    }


    /**
    * get 日志采集列表
    *
    * @return
    */
    public List<String> getResourceUIDs() {
        return resourceUIDs;
    }

    /**
    * set 日志采集列表
    *
    * @param resourceUIDs
    */
    public void setResourceUIDs(List<String> resourceUIDs) {
        this.resourceUIDs = resourceUIDs;
    }


    /**
     * get serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 日志转储任务状态，开启，停止
     *
     * @return
     */
    public Long getStatus() {
        return status;
    }

    /**
     * set 日志转储任务状态，开启，停止
     *
     * @param status
     */
    public void setStatus(Long status) {
        this.status = status;
    }


    /**
     * get 目的地 配置
     *
     * @return
     */
    public Object getTargetConf() {
        return targetConf;
    }

    /**
     * set 目的地 配置
     *
     * @param targetConf
     */
    public void setTargetConf(Object targetConf) {
        this.targetConf = targetConf;
    }


    /**
     * get 转储目的地类型 0: oss, 目前只支持oss
     *
     * @return
     */
    public Long getTargetType() {
        return targetType;
    }

    /**
     * set 转储目的地类型 0: oss, 目前只支持oss
     *
     * @param targetType
     */
    public void setTargetType(Long targetType) {
        this.targetType = targetType;
    }


    /**
     * get 投递时间间隔单位分钟，5分钟整数倍，支持5,10,15,20,30,60
     *
     * @return
     */
    public Long getTimeInterval() {
        return timeInterval;
    }

    /**
     * set 投递时间间隔单位分钟，5分钟整数倍，支持5,10,15,20,30,60
     *
     * @param timeInterval
     */
    public void setTimeInterval(Long timeInterval) {
        this.timeInterval = timeInterval;
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
     * set UID
     *
     * @param uID
     */
    public ShipperEnd uID(String uID) {
        this.uID = uID;
        return this;
    }


    /**
     * set 日志类型
     *
     * @param appName
     */
    public ShipperEnd appName(String appName) {
        this.appName = appName;
        return this;
    }


    /**
     * set 压缩格式，为空不压缩
     *
     * @param compress
     */
    public ShipperEnd compress(String compress) {
        this.compress = compress;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public ShipperEnd createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 投递格式 json,  origin(原始日志格式), 默认origin
     *
     * @param fileFormat
     */
    public ShipperEnd fileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }


    /**
     * set 投递文件大小，单位MB，支持200,300,400,500,1000
     *
     * @param fileSize
     */
    public ShipperEnd fileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }


    /**
     * set 日志集uuid
     *
     * @param logsetUID
     */
    public ShipperEnd logsetUID(String logsetUID) {
        this.logsetUID = logsetUID;
        return this;
    }


    /**
     * set 日志主题uuid
     *
     * @param logtopicUID
     */
    public ShipperEnd logtopicUID(String logtopicUID) {
        this.logtopicUID = logtopicUID;
        return this;
    }


    /**
     * set 转储任务名称
     *
     * @param name
     */
    public ShipperEnd name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public ShipperEnd pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 地域信息
     *
     * @param region
     */
    public ShipperEnd region(String region) {
        this.region = region;
        return this;
    }


    /**
     * set 日志采集资源类型
     *
     * @param resourceType
     */
    public ShipperEnd resourceType(Long resourceType) {
        this.resourceType = resourceType;
        return this;
    }


    /**
    * set 日志采集列表
    *
    * @param resourceUIDs
    */
    public ShipperEnd resourceUIDs(List<String> resourceUIDs) {
        this.resourceUIDs = resourceUIDs;
        return this;
    }


    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public ShipperEnd serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 日志转储任务状态，开启，停止
     *
     * @param status
     */
    public ShipperEnd status(Long status) {
        this.status = status;
        return this;
    }


    /**
     * set 目的地 配置
     *
     * @param targetConf
     */
    public ShipperEnd targetConf(Object targetConf) {
        this.targetConf = targetConf;
        return this;
    }


    /**
     * set 转储目的地类型 0: oss, 目前只支持oss
     *
     * @param targetType
     */
    public ShipperEnd targetType(Long targetType) {
        this.targetType = targetType;
        return this;
    }


    /**
     * set 投递时间间隔单位分钟，5分钟整数倍，支持5,10,15,20,30,60
     *
     * @param timeInterval
     */
    public ShipperEnd timeInterval(Long timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }


    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public ShipperEnd updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }



    /**
     * add item to 日志采集列表
     *
     * @param resourceUID
     */
    public void addResourceUID(String resourceUID) {
        if (this.resourceUIDs == null) {
            this.resourceUIDs = new ArrayList<>();
        }
        this.resourceUIDs.add(resourceUID);
    }
}