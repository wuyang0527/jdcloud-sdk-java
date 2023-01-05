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
 * 云硬盘相关接口
 * 云硬盘相关接口，提供批量创建云硬盘，查询云硬盘，删除云硬盘，对云硬盘进行扩容，修改云硬盘信息以及使用快照恢复云硬盘等功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.disk.model.DiskSpec;
import com.jdcloud.sdk.service.disk.model.Tag;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * -   创建一块或多块按配置或者按使用时长付费的云硬盘。
-   云硬盘类型包括高效云盘(premium-hdd)、SSD云盘(ssd)、通用型SSD(ssd.gp1)、性能型SSD(ssd.io1)、容量型HDD(hdd.std1)。
-   计费方式默认为按配置付费。
-   创建完成后，云硬盘状态为 available。
-   可选参数快照 ID用于从快照创建新盘。
-   批量创建时，云硬盘的命名为 硬盘名称-数字，例如 myDisk-1，myDisk-2。
-   maxCount为最大努力，不保证一定能达到maxCount。
-   userTags 为创建云盘时打的标签

 */
public class CreateDisksRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建云硬盘规格
     * Required:true
     */
    @Required
    private DiskSpec diskSpec;

    /**
     * 购买实例数量；取值范围：[1,100]
     * Required:true
     */
    @Required
    private Integer maxCount;

    /**
     * 用户标签,默认为空;tag标签的限制：每个资源最多允许绑定 10 个不同的标签，同一资源每个标签“键”上只能存在1个标签“值”；标签键/值只支持中文、数字、大小写字母、空格及特殊符号_.:/&#x3D;+-@;当无tags时,reps结果返回中tagmsg为空
     */
    
    private List<Tag> userTags;
    /**
     * 幂等性校验参数
     * Required:true
     */
    @Required
    private String clientToken;

    /**
     * 资源组ID
     */
    private String resourceGroupId;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 创建云硬盘规格
     *
     * @return
     */
    public DiskSpec getDiskSpec() {
        return diskSpec;
    }

    /**
     * set 创建云硬盘规格
     *
     * @param diskSpec
     */
    public void setDiskSpec(DiskSpec diskSpec) {
        this.diskSpec = diskSpec;
    }


    /**
     * get 购买实例数量；取值范围：[1,100]
     *
     * @return
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * set 购买实例数量；取值范围：[1,100]
     *
     * @param maxCount
     */
    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }


    /**
    * get 用户标签,默认为空;tag标签的限制：每个资源最多允许绑定 10 个不同的标签，同一资源每个标签“键”上只能存在1个标签“值”；标签键/值只支持中文、数字、大小写字母、空格及特殊符号_.:/&#x3D;+-@;当无tags时,reps结果返回中tagmsg为空
    *
    * @return
    */
    public List<Tag> getUserTags() {
        return userTags;
    }

    /**
    * set 用户标签,默认为空;tag标签的限制：每个资源最多允许绑定 10 个不同的标签，同一资源每个标签“键”上只能存在1个标签“值”；标签键/值只支持中文、数字、大小写字母、空格及特殊符号_.:/&#x3D;+-@;当无tags时,reps结果返回中tagmsg为空
    *
    * @param userTags
    */
    public void setUserTags(List<Tag> userTags) {
        this.userTags = userTags;
    }


    /**
     * get 幂等性校验参数
     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 幂等性校验参数
     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }


    /**
     * get 资源组ID
     *
     * @return
     */
    public String getResourceGroupId() {
        return resourceGroupId;
    }

    /**
     * set 资源组ID
     *
     * @param resourceGroupId
     */
    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 创建云硬盘规格
     *
     * @param diskSpec
     */
    public CreateDisksRequest diskSpec(DiskSpec diskSpec) {
        this.diskSpec = diskSpec;
        return this;
    }


    /**
     * set 购买实例数量；取值范围：[1,100]
     *
     * @param maxCount
     */
    public CreateDisksRequest maxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }


    /**
    * set 用户标签,默认为空;tag标签的限制：每个资源最多允许绑定 10 个不同的标签，同一资源每个标签“键”上只能存在1个标签“值”；标签键/值只支持中文、数字、大小写字母、空格及特殊符号_.:/&#x3D;+-@;当无tags时,reps结果返回中tagmsg为空
    *
    * @param userTags
    */
    public CreateDisksRequest userTags(List<Tag> userTags) {
        this.userTags = userTags;
        return this;
    }


    /**
     * set 幂等性校验参数
     *
     * @param clientToken
     */
    public CreateDisksRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }


    /**
     * set 资源组ID
     *
     * @param resourceGroupId
     */
    public CreateDisksRequest resourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateDisksRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 用户标签,默认为空;tag标签的限制：每个资源最多允许绑定 10 个不同的标签，同一资源每个标签“键”上只能存在1个标签“值”；标签键/值只支持中文、数字、大小写字母、空格及特殊符号_.:/&#x3D;+-@;当无tags时,reps结果返回中tagmsg为空
     *
     * @param userTag
     */
    public void addUserTag(Tag userTag) {
        if (this.userTags == null) {
            this.userTags = new ArrayList<>();
        }
        this.userTags.add(userTag);
    }
}