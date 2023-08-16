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

package com.jdcloud.sdk.service.bgw.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * vpnConnection
 */
public class VpnConnection  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * VPN connection的Id
     */
    private String vpnConnectionId;

    /**
     * VPN connection的名称
     */
    private String vpnConnectionName;

    /**
     * 边界网关的Id
     */
    private String bgwId;

    /**
     * 客户网关的Id
     */
    private String cgwId;

    /**
     * 是否使能BGP路由
     */
    private Boolean bgpEnabled;

    /**
     * 本地的BGP ASN号
     */
    private Integer localAsn;

    /**
     * VPN connection上分配的本端公网可路由的两个IPv4地址
     */
    
    private List<String> cloudPublicIp;
    /**
     * VPN连接的2个公网IP线路信息。当VPN为标准VPN时，2个线路都为bgp。当VPN为边缘VPN时，显示使用的2个公网IP线路
     */
    
    private List<String> providers;
    /**
     * 当前隧道状态是否满足高可用, 取值范围为: redundancy, no_redundancy
     */
    private String haStatus;

    /**
     * VPN connection的描述
     */
    private String description;

    /**
     * 客户网关的创建时间
     */
    private String createdTime;

    /**
     * 客户网关的更新时间
     */
    private String updatedTime;

    /**
     * 计费信息
     */
    private Charge charge;

    /**
     * vpn connection policy，IPSec VPN的感兴趣流，用于第二阶段协商
     */
    
    private List<VpnTrafficSelectorSpec> trafficSelectors;
    /**
     * VPN az类型，取值：standard(标准VPN)，edge(边缘VPN)
     */
    private String azType;

    /**
     * VPN可用区
     */
    private String az;



    /**
     * get VPN connection的Id
     *
     * @return
     */
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }

    /**
     * set VPN connection的Id
     *
     * @param vpnConnectionId
     */
    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }


    /**
     * get VPN connection的名称
     *
     * @return
     */
    public String getVpnConnectionName() {
        return vpnConnectionName;
    }

    /**
     * set VPN connection的名称
     *
     * @param vpnConnectionName
     */
    public void setVpnConnectionName(String vpnConnectionName) {
        this.vpnConnectionName = vpnConnectionName;
    }


    /**
     * get 边界网关的Id
     *
     * @return
     */
    public String getBgwId() {
        return bgwId;
    }

    /**
     * set 边界网关的Id
     *
     * @param bgwId
     */
    public void setBgwId(String bgwId) {
        this.bgwId = bgwId;
    }


    /**
     * get 客户网关的Id
     *
     * @return
     */
    public String getCgwId() {
        return cgwId;
    }

    /**
     * set 客户网关的Id
     *
     * @param cgwId
     */
    public void setCgwId(String cgwId) {
        this.cgwId = cgwId;
    }


    /**
     * get 是否使能BGP路由
     *
     * @return
     */
    public Boolean getBgpEnabled() {
        return bgpEnabled;
    }

    /**
     * set 是否使能BGP路由
     *
     * @param bgpEnabled
     */
    public void setBgpEnabled(Boolean bgpEnabled) {
        this.bgpEnabled = bgpEnabled;
    }


    /**
     * get 本地的BGP ASN号
     *
     * @return
     */
    public Integer getLocalAsn() {
        return localAsn;
    }

    /**
     * set 本地的BGP ASN号
     *
     * @param localAsn
     */
    public void setLocalAsn(Integer localAsn) {
        this.localAsn = localAsn;
    }


    /**
    * get VPN connection上分配的本端公网可路由的两个IPv4地址
    *
    * @return
    */
    public List<String> getCloudPublicIp() {
        return cloudPublicIp;
    }

    /**
    * set VPN connection上分配的本端公网可路由的两个IPv4地址
    *
    * @param cloudPublicIp
    */
    public void setCloudPublicIp(List<String> cloudPublicIp) {
        this.cloudPublicIp = cloudPublicIp;
    }


    /**
    * get VPN连接的2个公网IP线路信息。当VPN为标准VPN时，2个线路都为bgp。当VPN为边缘VPN时，显示使用的2个公网IP线路
    *
    * @return
    */
    public List<String> getProviders() {
        return providers;
    }

    /**
    * set VPN连接的2个公网IP线路信息。当VPN为标准VPN时，2个线路都为bgp。当VPN为边缘VPN时，显示使用的2个公网IP线路
    *
    * @param providers
    */
    public void setProviders(List<String> providers) {
        this.providers = providers;
    }


    /**
     * get 当前隧道状态是否满足高可用, 取值范围为: redundancy, no_redundancy
     *
     * @return
     */
    public String getHaStatus() {
        return haStatus;
    }

    /**
     * set 当前隧道状态是否满足高可用, 取值范围为: redundancy, no_redundancy
     *
     * @param haStatus
     */
    public void setHaStatus(String haStatus) {
        this.haStatus = haStatus;
    }


    /**
     * get VPN connection的描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set VPN connection的描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 客户网关的创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 客户网关的创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * get 客户网关的更新时间
     *
     * @return
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * set 客户网关的更新时间
     *
     * @param updatedTime
     */
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }


    /**
     * get 计费信息
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 计费信息
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }


    /**
    * get vpn connection policy，IPSec VPN的感兴趣流，用于第二阶段协商
    *
    * @return
    */
    public List<VpnTrafficSelectorSpec> getTrafficSelectors() {
        return trafficSelectors;
    }

    /**
    * set vpn connection policy，IPSec VPN的感兴趣流，用于第二阶段协商
    *
    * @param trafficSelectors
    */
    public void setTrafficSelectors(List<VpnTrafficSelectorSpec> trafficSelectors) {
        this.trafficSelectors = trafficSelectors;
    }


    /**
     * get VPN az类型，取值：standard(标准VPN)，edge(边缘VPN)
     *
     * @return
     */
    public String getAzType() {
        return azType;
    }

    /**
     * set VPN az类型，取值：standard(标准VPN)，edge(边缘VPN)
     *
     * @param azType
     */
    public void setAzType(String azType) {
        this.azType = azType;
    }


    /**
     * get VPN可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set VPN可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }



    /**
     * set VPN connection的Id
     *
     * @param vpnConnectionId
     */
    public VpnConnection vpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }


    /**
     * set VPN connection的名称
     *
     * @param vpnConnectionName
     */
    public VpnConnection vpnConnectionName(String vpnConnectionName) {
        this.vpnConnectionName = vpnConnectionName;
        return this;
    }


    /**
     * set 边界网关的Id
     *
     * @param bgwId
     */
    public VpnConnection bgwId(String bgwId) {
        this.bgwId = bgwId;
        return this;
    }


    /**
     * set 客户网关的Id
     *
     * @param cgwId
     */
    public VpnConnection cgwId(String cgwId) {
        this.cgwId = cgwId;
        return this;
    }


    /**
     * set 是否使能BGP路由
     *
     * @param bgpEnabled
     */
    public VpnConnection bgpEnabled(Boolean bgpEnabled) {
        this.bgpEnabled = bgpEnabled;
        return this;
    }


    /**
     * set 本地的BGP ASN号
     *
     * @param localAsn
     */
    public VpnConnection localAsn(Integer localAsn) {
        this.localAsn = localAsn;
        return this;
    }


    /**
    * set VPN connection上分配的本端公网可路由的两个IPv4地址
    *
    * @param cloudPublicIp
    */
    public VpnConnection cloudPublicIp(List<String> cloudPublicIp) {
        this.cloudPublicIp = cloudPublicIp;
        return this;
    }


    /**
    * set VPN连接的2个公网IP线路信息。当VPN为标准VPN时，2个线路都为bgp。当VPN为边缘VPN时，显示使用的2个公网IP线路
    *
    * @param providers
    */
    public VpnConnection providers(List<String> providers) {
        this.providers = providers;
        return this;
    }


    /**
     * set 当前隧道状态是否满足高可用, 取值范围为: redundancy, no_redundancy
     *
     * @param haStatus
     */
    public VpnConnection haStatus(String haStatus) {
        this.haStatus = haStatus;
        return this;
    }


    /**
     * set VPN connection的描述
     *
     * @param description
     */
    public VpnConnection description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 客户网关的创建时间
     *
     * @param createdTime
     */
    public VpnConnection createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


    /**
     * set 客户网关的更新时间
     *
     * @param updatedTime
     */
    public VpnConnection updatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }


    /**
     * set 计费信息
     *
     * @param charge
     */
    public VpnConnection charge(Charge charge) {
        this.charge = charge;
        return this;
    }


    /**
    * set vpn connection policy，IPSec VPN的感兴趣流，用于第二阶段协商
    *
    * @param trafficSelectors
    */
    public VpnConnection trafficSelectors(List<VpnTrafficSelectorSpec> trafficSelectors) {
        this.trafficSelectors = trafficSelectors;
        return this;
    }


    /**
     * set VPN az类型，取值：standard(标准VPN)，edge(边缘VPN)
     *
     * @param azType
     */
    public VpnConnection azType(String azType) {
        this.azType = azType;
        return this;
    }


    /**
     * set VPN可用区
     *
     * @param az
     */
    public VpnConnection az(String az) {
        this.az = az;
        return this;
    }



    /**
     * add item to VPN connection上分配的本端公网可路由的两个IPv4地址
     *
     * @param cloudPublicIp
     */
    public void addCloudPublicIp(String cloudPublicIp) {
        if (this.cloudPublicIp == null) {
            this.cloudPublicIp = new ArrayList<>();
        }
        this.cloudPublicIp.add(cloudPublicIp);
    }

    /**
     * add item to VPN连接的2个公网IP线路信息。当VPN为标准VPN时，2个线路都为bgp。当VPN为边缘VPN时，显示使用的2个公网IP线路
     *
     * @param provider
     */
    public void addProvider(String provider) {
        if (this.providers == null) {
            this.providers = new ArrayList<>();
        }
        this.providers.add(provider);
    }

    /**
     * add item to vpn connection policy，IPSec VPN的感兴趣流，用于第二阶段协商
     *
     * @param trafficSelector
     */
    public void addTrafficSelector(VpnTrafficSelectorSpec trafficSelector) {
        if (this.trafficSelectors == null) {
            this.trafficSelectors = new ArrayList<>();
        }
        this.trafficSelectors.add(trafficSelector);
    }
}