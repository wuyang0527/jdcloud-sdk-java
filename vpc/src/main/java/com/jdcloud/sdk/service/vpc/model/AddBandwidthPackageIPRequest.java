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
import com.jdcloud.sdk.service.vpc.model.AddBandwidthPackageIPSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
向共享带宽包内增加公网IP

## 接口说明 

- 确保已有至少一个共享带宽包资源。

- 添加弹性公网IP前，需确保弹性公网IP所在地域与共享带宽包地域和线路相同，弹性公网IP的计费模式为按配置或按用量计费，且未加入其他的共享带宽包资源。

- 已欠费的、包年包月的公网IP不能加入共享带宽包。

- 一个公网IP同时只能加入一个共享带宽包。

- 共享带宽包中可添加的弹性公网IP受配额限制，添加前请通过 [DescribeQuotas](https://docs.jdcloud.com/cn/shared-bandwidth-package/api/describequotas?content&#x3D;API) 确认配额，如须提升请[提交工单](https://ticket.jdcloud.com/applyorder/submit)或联系京东云客服。

- 弹性公网IP加入共享带宽包后，弹性公网 IP 会原有的计费和带宽上限暂时失效，已共享带宽包进行计费，带宽上限默认为共享带宽包的带宽上限，可通过[modifyBandwidthPackageIpBandwidth](https://docs.jdcloud.com/cn/shared-bandwidth-package/api/modifybandwidthpackageIpbandwidth)进行修改。

- 共享带宽包欠费或到期停服后不支持添加弹性公网IP。

 */
public class AddBandwidthPackageIPRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Ip列表
     * Required:true
     */
    @Required
    private List<AddBandwidthPackageIPSpec> bandwidthPackageIPSpecs;

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
     * get Ip列表
     *
     * @return
     */
    public List<AddBandwidthPackageIPSpec> getBandwidthPackageIPSpecs() {
        return bandwidthPackageIPSpecs;
    }

    /**
     * set Ip列表
     *
     * @param bandwidthPackageIPSpecs
     */
    public void setBandwidthPackageIPSpecs(List<AddBandwidthPackageIPSpec> bandwidthPackageIPSpecs) {
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
     * set Ip列表
     *
     * @param bandwidthPackageIPSpecs
     */
    public AddBandwidthPackageIPRequest bandwidthPackageIPSpecs(List<AddBandwidthPackageIPSpec> bandwidthPackageIPSpecs) {
        this.bandwidthPackageIPSpecs = bandwidthPackageIPSpecs;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public AddBandwidthPackageIPRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 共享带宽包ID
     *
     * @param bandwidthPackageId
     */
    public AddBandwidthPackageIPRequest bandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }


    /**
     * add item to Ip列表
     *
     * @param bandwidthPackageIPSpec
     */
    public void addBandwidthPackageIPSpec(AddBandwidthPackageIPSpec bandwidthPackageIPSpec) {
        if (this.bandwidthPackageIPSpecs == null) {
            this.bandwidthPackageIPSpecs = new ArrayList<>();
        }
        this.bandwidthPackageIPSpecs.add(bandwidthPackageIPSpec);
    }

}