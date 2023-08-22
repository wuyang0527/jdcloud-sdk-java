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
 * Flow Log
 * 流量日志相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.flowlog.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.flowlog.model.CollectResourceSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 本接口用于创建流日志资源
 */
public class CreateFlowLogRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 流日志名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     * Required:true
     */
    @Required
    private String flowLogName;

    /**
     * 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * 流日志类型
PORT：采集资源可为云主机、弹性网卡

     * Required:true
     */
    @Required
    private String flowLogType;

    /**
     * 采集资源列表
     */
    
    private List<CollectResourceSpec> collectResources;
    /**
     * 采集流量类型
ALL：记录指定资源的全部流量
ACCEPT：记录指定资源被安全组、网络ACL均接受的流量
REJECT：记录指定资源被安全组或网络ACL拒绝的流量     

     */
    private String collectTrafficType;

    /**
     * 流日志采集时间间隔。单位：分钟。取值：1、5、10
     */
    private Integer collectInterval;

    /**
     * 流日志的存储服务类型，支持存储到日志服务，日志服务取值：LOG
     */
    private String storageType;

    /**
     * 流日志的存储服务所在地域，如日志服务所属地域，如cn-north-1
     * Required:true
     */
    @Required
    private String storageRegionId;

    /**
     * 流日志的存储服务ID
若storageType &#x3D; LOG时，值取日志主题ID，如logtopic-xxxx
当flowLogType &#x3D; PORT时，值需取 templateUID &#x3D; eniflowlogs 的日志主题ID

     * Required:true
     */
    @Required
    private String storageId;

    /**
     * 地域 ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 流日志名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @return
     */
    public String getFlowLogName() {
        return flowLogName;
    }

    /**
     * set 流日志名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param flowLogName
     */
    public void setFlowLogName(String flowLogName) {
        this.flowLogName = flowLogName;
    }


    /**
     * get 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 流日志类型
PORT：采集资源可为云主机、弹性网卡

     *
     * @return
     */
    public String getFlowLogType() {
        return flowLogType;
    }

    /**
     * set 流日志类型
PORT：采集资源可为云主机、弹性网卡

     *
     * @param flowLogType
     */
    public void setFlowLogType(String flowLogType) {
        this.flowLogType = flowLogType;
    }


    /**
    * get 采集资源列表
    *
    * @return
    */
    public List<CollectResourceSpec> getCollectResources() {
        return collectResources;
    }

    /**
    * set 采集资源列表
    *
    * @param collectResources
    */
    public void setCollectResources(List<CollectResourceSpec> collectResources) {
        this.collectResources = collectResources;
    }


    /**
     * get 采集流量类型
ALL：记录指定资源的全部流量
ACCEPT：记录指定资源被安全组、网络ACL均接受的流量
REJECT：记录指定资源被安全组或网络ACL拒绝的流量     

     *
     * @return
     */
    public String getCollectTrafficType() {
        return collectTrafficType;
    }

    /**
     * set 采集流量类型
ALL：记录指定资源的全部流量
ACCEPT：记录指定资源被安全组、网络ACL均接受的流量
REJECT：记录指定资源被安全组或网络ACL拒绝的流量     

     *
     * @param collectTrafficType
     */
    public void setCollectTrafficType(String collectTrafficType) {
        this.collectTrafficType = collectTrafficType;
    }


    /**
     * get 流日志采集时间间隔。单位：分钟。取值：1、5、10
     *
     * @return
     */
    public Integer getCollectInterval() {
        return collectInterval;
    }

    /**
     * set 流日志采集时间间隔。单位：分钟。取值：1、5、10
     *
     * @param collectInterval
     */
    public void setCollectInterval(Integer collectInterval) {
        this.collectInterval = collectInterval;
    }


    /**
     * get 流日志的存储服务类型，支持存储到日志服务，日志服务取值：LOG
     *
     * @return
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * set 流日志的存储服务类型，支持存储到日志服务，日志服务取值：LOG
     *
     * @param storageType
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }


    /**
     * get 流日志的存储服务所在地域，如日志服务所属地域，如cn-north-1
     *
     * @return
     */
    public String getStorageRegionId() {
        return storageRegionId;
    }

    /**
     * set 流日志的存储服务所在地域，如日志服务所属地域，如cn-north-1
     *
     * @param storageRegionId
     */
    public void setStorageRegionId(String storageRegionId) {
        this.storageRegionId = storageRegionId;
    }


    /**
     * get 流日志的存储服务ID
若storageType &#x3D; LOG时，值取日志主题ID，如logtopic-xxxx
当flowLogType &#x3D; PORT时，值需取 templateUID &#x3D; eniflowlogs 的日志主题ID

     *
     * @return
     */
    public String getStorageId() {
        return storageId;
    }

    /**
     * set 流日志的存储服务ID
若storageType &#x3D; LOG时，值取日志主题ID，如logtopic-xxxx
当flowLogType &#x3D; PORT时，值需取 templateUID &#x3D; eniflowlogs 的日志主题ID

     *
     * @param storageId
     */
    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }


    /**
     * get 地域 ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 流日志名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param flowLogName
     */
    public CreateFlowLogRequest flowLogName(String flowLogName) {
        this.flowLogName = flowLogName;
        return this;
    }


    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public CreateFlowLogRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 流日志类型
PORT：采集资源可为云主机、弹性网卡

     *
     * @param flowLogType
     */
    public CreateFlowLogRequest flowLogType(String flowLogType) {
        this.flowLogType = flowLogType;
        return this;
    }


    /**
    * set 采集资源列表
    *
    * @param collectResources
    */
    public CreateFlowLogRequest collectResources(List<CollectResourceSpec> collectResources) {
        this.collectResources = collectResources;
        return this;
    }


    /**
     * set 采集流量类型
ALL：记录指定资源的全部流量
ACCEPT：记录指定资源被安全组、网络ACL均接受的流量
REJECT：记录指定资源被安全组或网络ACL拒绝的流量     

     *
     * @param collectTrafficType
     */
    public CreateFlowLogRequest collectTrafficType(String collectTrafficType) {
        this.collectTrafficType = collectTrafficType;
        return this;
    }


    /**
     * set 流日志采集时间间隔。单位：分钟。取值：1、5、10
     *
     * @param collectInterval
     */
    public CreateFlowLogRequest collectInterval(Integer collectInterval) {
        this.collectInterval = collectInterval;
        return this;
    }


    /**
     * set 流日志的存储服务类型，支持存储到日志服务，日志服务取值：LOG
     *
     * @param storageType
     */
    public CreateFlowLogRequest storageType(String storageType) {
        this.storageType = storageType;
        return this;
    }


    /**
     * set 流日志的存储服务所在地域，如日志服务所属地域，如cn-north-1
     *
     * @param storageRegionId
     */
    public CreateFlowLogRequest storageRegionId(String storageRegionId) {
        this.storageRegionId = storageRegionId;
        return this;
    }


    /**
     * set 流日志的存储服务ID
若storageType &#x3D; LOG时，值取日志主题ID，如logtopic-xxxx
当flowLogType &#x3D; PORT时，值需取 templateUID &#x3D; eniflowlogs 的日志主题ID

     *
     * @param storageId
     */
    public CreateFlowLogRequest storageId(String storageId) {
        this.storageId = storageId;
        return this;
    }


    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public CreateFlowLogRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 采集资源列表
     *
     * @param collectResource
     */
    public void addCollectResource(CollectResourceSpec collectResource) {
        if (this.collectResources == null) {
            this.collectResources = new ArrayList<>();
        }
        this.collectResources.add(collectResource);
    }
}