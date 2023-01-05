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
 * 快照策略相关接口
 * 云硬盘相关接口，快照策略的创建，更新，删除，查询，绑定/解绑磁盘等接口。
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
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询快照策略与磁盘绑定关系
 */
public class DescribeSnapshotPolicyDiskRelationsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 磁盘ID
     */
    
    private List<String> diskId;
    /**
     * 磁盘地域ID
     */
    
    private List<String> diskRegion;
    /**
     * 策略ID
     */
    
    private List<String> policyId;
    /**
     * 页码, 默认为1, 取值范围：[1,∞)
     */
    private Integer pageNumber;

    /**
     * 分页大小，默认为20，取值范围：[10,100]
     */
    private Integer pageSize;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
    * get 磁盘ID
    *
    * @return
    */
    public List<String> getDiskId() {
        return diskId;
    }

    /**
    * set 磁盘ID
    *
    * @param diskId
    */
    public void setDiskId(List<String> diskId) {
        this.diskId = diskId;
    }


    /**
    * get 磁盘地域ID
    *
    * @return
    */
    public List<String> getDiskRegion() {
        return diskRegion;
    }

    /**
    * set 磁盘地域ID
    *
    * @param diskRegion
    */
    public void setDiskRegion(List<String> diskRegion) {
        this.diskRegion = diskRegion;
    }


    /**
    * get 策略ID
    *
    * @return
    */
    public List<String> getPolicyId() {
        return policyId;
    }

    /**
    * set 策略ID
    *
    * @param policyId
    */
    public void setPolicyId(List<String> policyId) {
        this.policyId = policyId;
    }


    /**
     * get 页码, 默认为1, 取值范围：[1,∞)
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码, 默认为1, 取值范围：[1,∞)
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 分页大小，默认为20，取值范围：[10,100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
    * set 磁盘ID
    *
    * @param diskId
    */
    public DescribeSnapshotPolicyDiskRelationsRequest diskId(List<String> diskId) {
        this.diskId = diskId;
        return this;
    }


    /**
    * set 磁盘地域ID
    *
    * @param diskRegion
    */
    public DescribeSnapshotPolicyDiskRelationsRequest diskRegion(List<String> diskRegion) {
        this.diskRegion = diskRegion;
        return this;
    }


    /**
    * set 策略ID
    *
    * @param policyId
    */
    public DescribeSnapshotPolicyDiskRelationsRequest policyId(List<String> policyId) {
        this.policyId = policyId;
        return this;
    }


    /**
     * set 页码, 默认为1, 取值范围：[1,∞)
     *
     * @param pageNumber
     */
    public DescribeSnapshotPolicyDiskRelationsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public DescribeSnapshotPolicyDiskRelationsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescribeSnapshotPolicyDiskRelationsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 磁盘ID
     *
     * @param diskId
     */
    public void addDiskId(String diskId) {
        if (this.diskId == null) {
            this.diskId = new ArrayList<>();
        }
        this.diskId.add(diskId);
    }

    /**
     * add item to 磁盘地域ID
     *
     * @param diskRegion
     */
    public void addDiskRegion(String diskRegion) {
        if (this.diskRegion == null) {
            this.diskRegion = new ArrayList<>();
        }
        this.diskRegion.add(diskRegion);
    }

    /**
     * add item to 策略ID
     *
     * @param policyId
     */
    public void addPolicyId(String policyId) {
        if (this.policyId == null) {
            this.policyId = new ArrayList<>();
        }
        this.policyId.add(policyId);
    }
}