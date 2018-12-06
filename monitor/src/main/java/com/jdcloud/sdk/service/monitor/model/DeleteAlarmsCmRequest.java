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
 * CustomMetric APIs
 * 自定义监控相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除自定义监控规则
 */
public class DeleteAlarmsCmRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ids,多个id用|分隔
     * Required:true
     */
    @Required
    private String ids;

    /**
     * region
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get ids,多个id用|分隔
     *
     * @return
     */
    public String getIds() {
        return ids;
    }

    /**
     * set ids,多个id用|分隔
     *
     * @param ids
     */
    public void setIds(String ids) {
        this.ids = ids;
    }

    /**
     * get region
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set region
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set ids,多个id用|分隔
     *
     * @param ids
     */
    public DeleteAlarmsCmRequest ids(String ids) {
        this.ids = ids;
        return this;
    }

    /**
     * set region
     *
     * @param regionId
     */
    public DeleteAlarmsCmRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}