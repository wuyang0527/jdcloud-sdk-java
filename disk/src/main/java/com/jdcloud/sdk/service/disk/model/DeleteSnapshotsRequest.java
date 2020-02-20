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
 * 快照相关接口
 * 快照相关接口，提供创建快照，查询快照信息，删除快照，修改快照信息等功能。
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
 * -   删除云硬盘快照:快照状态必须为 available 或 error 状态。
-   快照独立于云硬盘生命周期，删除快照不会对创建快照的云硬盘有任何影响。
-   快照删除后不可恢复，请谨慎操作。

 */
public class DeleteSnapshotsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 快照ID列表
     * Required:true
     */
    @Required
    private List<String> snapshotIds;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 快照ID列表
     *
     * @return
     */
    public List<String> getSnapshotIds() {
        return snapshotIds;
    }

    /**
     * set 快照ID列表
     *
     * @param snapshotIds
     */
    public void setSnapshotIds(List<String> snapshotIds) {
        this.snapshotIds = snapshotIds;
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
     * set 快照ID列表
     *
     * @param snapshotIds
     */
    public DeleteSnapshotsRequest snapshotIds(List<String> snapshotIds) {
        this.snapshotIds = snapshotIds;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DeleteSnapshotsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 快照ID列表
     *
     * @param snapshotId
     */
    public void addSnapshotId(String snapshotId) {
        if (this.snapshotIds == null) {
            this.snapshotIds = new ArrayList<>();
        }
        this.snapshotIds.add(snapshotId);
    }

}