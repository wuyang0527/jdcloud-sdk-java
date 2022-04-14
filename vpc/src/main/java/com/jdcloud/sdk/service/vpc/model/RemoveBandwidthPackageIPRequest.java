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
 * Bandwidth-Package
 * 共享带宽包相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.vpc.model.RemoveBandwidthPackageIPSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
从共享带宽包内移除公网IP

## 接口说明

-  弹性公网IP从共享带宽包中移除后，恢复原有的计费模式和带宽上限。

-  共享带宽包是否计费与共享带宽包中有无弹性公网IP无关，如共享带宽包中无弹性公网IP资源时请及时删除资源，避免产生额外费用

 */
public class RemoveBandwidthPackageIPRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公网IP列表
     * Required:true
     */
    @Required
    private List<RemoveBandwidthPackageIPSpec> bandwidthPackageIPSpecs;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 共享带宽包ID
     * Required:true
     */
    @Required
    private String bandwidthPackageId;


    /**
     * get 公网IP列表
     *
     * @return
     */
    public List<RemoveBandwidthPackageIPSpec> getBandwidthPackageIPSpecs() {
        return bandwidthPackageIPSpecs;
    }

    /**
     * set 公网IP列表
     *
     * @param bandwidthPackageIPSpecs
     */
    public void setBandwidthPackageIPSpecs(List<RemoveBandwidthPackageIPSpec> bandwidthPackageIPSpecs) {
        this.bandwidthPackageIPSpecs = bandwidthPackageIPSpecs;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 共享带宽包ID
     *
     * @return
     */
    public String getBandwidthPackageId() {
        return bandwidthPackageId;
    }

    /**
     * set 共享带宽包ID
     *
     * @param bandwidthPackageId
     */
    public void setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
    }


    /**
     * set 公网IP列表
     *
     * @param bandwidthPackageIPSpecs
     */
    public RemoveBandwidthPackageIPRequest bandwidthPackageIPSpecs(List<RemoveBandwidthPackageIPSpec> bandwidthPackageIPSpecs) {
        this.bandwidthPackageIPSpecs = bandwidthPackageIPSpecs;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public RemoveBandwidthPackageIPRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 共享带宽包ID
     *
     * @param bandwidthPackageId
     */
    public RemoveBandwidthPackageIPRequest bandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }


    /**
     * add item to 公网IP列表
     *
     * @param bandwidthPackageIPSpec
     */
    public void addBandwidthPackageIPSpec(RemoveBandwidthPackageIPSpec bandwidthPackageIPSpec) {
        if (this.bandwidthPackageIPSpecs == null) {
            this.bandwidthPackageIPSpecs = new ArrayList<>();
        }
        this.bandwidthPackageIPSpecs.add(bandwidthPackageIPSpec);
    }

}