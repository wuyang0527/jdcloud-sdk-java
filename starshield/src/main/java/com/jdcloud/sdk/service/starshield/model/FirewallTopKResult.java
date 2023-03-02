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
 * Log-Analytics
 * Analytics data for a zone/instance
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.starshield.model.Item;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 按防火墙事件数量统计。获取IP地址、用户代理、路径、主机、国家/地区、HTTP方法的TopK。
 */
public class FirewallTopKResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * countries
     */
    
    private List<Item> countries;
    /**
     * topCountries
     */
    
    private List<Item> topCountries;
    /**
     * topDeviceTypes
     */
    
    private List<Item> topDeviceTypes;
    /**
     * topHosts
     */
    
    private List<Item> topHosts;
    /**
     * topPaths
     */
    
    private List<Item> topPaths;
    /**
     * topContentTypes
     */
    
    private List<Item> topContentTypes;
    /**
     * topStatusCodes
     */
    
    private List<Item> topStatusCodes;
    /**
     * topIPs
     */
    
    private List<Item> topIPs;
    /**
     * topUserAgents
     */
    
    private List<Item> topUserAgents;
    /**
     * topHttpMethods
     */
    
    private List<Item> topHttpMethods;
    /**
     * topASNs
     */
    
    private List<Item> topASNs;
    /**
     * topFirewallRuleIds
     */
    
    private List<Item> topFirewallRuleIds;
    /**
     * topFirewallRules
     */
    
    private List<Item> topFirewallRules;
    /**
     * topWafRuleIds
     */
    
    private List<Item> topWafRuleIds;
    /**
     * topWafRules
     */
    
    private List<Item> topWafRules;


    /**
    * get countries
    *
    * @return
    */
    public List<Item> getCountries() {
        return countries;
    }

    /**
    * set countries
    *
    * @param countries
    */
    public void setCountries(List<Item> countries) {
        this.countries = countries;
    }


    /**
    * get topCountries
    *
    * @return
    */
    public List<Item> getTopCountries() {
        return topCountries;
    }

    /**
    * set topCountries
    *
    * @param topCountries
    */
    public void setTopCountries(List<Item> topCountries) {
        this.topCountries = topCountries;
    }


    /**
    * get topDeviceTypes
    *
    * @return
    */
    public List<Item> getTopDeviceTypes() {
        return topDeviceTypes;
    }

    /**
    * set topDeviceTypes
    *
    * @param topDeviceTypes
    */
    public void setTopDeviceTypes(List<Item> topDeviceTypes) {
        this.topDeviceTypes = topDeviceTypes;
    }


    /**
    * get topHosts
    *
    * @return
    */
    public List<Item> getTopHosts() {
        return topHosts;
    }

    /**
    * set topHosts
    *
    * @param topHosts
    */
    public void setTopHosts(List<Item> topHosts) {
        this.topHosts = topHosts;
    }


    /**
    * get topPaths
    *
    * @return
    */
    public List<Item> getTopPaths() {
        return topPaths;
    }

    /**
    * set topPaths
    *
    * @param topPaths
    */
    public void setTopPaths(List<Item> topPaths) {
        this.topPaths = topPaths;
    }


    /**
    * get topContentTypes
    *
    * @return
    */
    public List<Item> getTopContentTypes() {
        return topContentTypes;
    }

    /**
    * set topContentTypes
    *
    * @param topContentTypes
    */
    public void setTopContentTypes(List<Item> topContentTypes) {
        this.topContentTypes = topContentTypes;
    }


    /**
    * get topStatusCodes
    *
    * @return
    */
    public List<Item> getTopStatusCodes() {
        return topStatusCodes;
    }

    /**
    * set topStatusCodes
    *
    * @param topStatusCodes
    */
    public void setTopStatusCodes(List<Item> topStatusCodes) {
        this.topStatusCodes = topStatusCodes;
    }


    /**
    * get topIPs
    *
    * @return
    */
    public List<Item> getTopIPs() {
        return topIPs;
    }

    /**
    * set topIPs
    *
    * @param topIPs
    */
    public void setTopIPs(List<Item> topIPs) {
        this.topIPs = topIPs;
    }


    /**
    * get topUserAgents
    *
    * @return
    */
    public List<Item> getTopUserAgents() {
        return topUserAgents;
    }

    /**
    * set topUserAgents
    *
    * @param topUserAgents
    */
    public void setTopUserAgents(List<Item> topUserAgents) {
        this.topUserAgents = topUserAgents;
    }


    /**
    * get topHttpMethods
    *
    * @return
    */
    public List<Item> getTopHttpMethods() {
        return topHttpMethods;
    }

    /**
    * set topHttpMethods
    *
    * @param topHttpMethods
    */
    public void setTopHttpMethods(List<Item> topHttpMethods) {
        this.topHttpMethods = topHttpMethods;
    }


    /**
    * get topASNs
    *
    * @return
    */
    public List<Item> getTopASNs() {
        return topASNs;
    }

    /**
    * set topASNs
    *
    * @param topASNs
    */
    public void setTopASNs(List<Item> topASNs) {
        this.topASNs = topASNs;
    }


    /**
    * get topFirewallRuleIds
    *
    * @return
    */
    public List<Item> getTopFirewallRuleIds() {
        return topFirewallRuleIds;
    }

    /**
    * set topFirewallRuleIds
    *
    * @param topFirewallRuleIds
    */
    public void setTopFirewallRuleIds(List<Item> topFirewallRuleIds) {
        this.topFirewallRuleIds = topFirewallRuleIds;
    }


    /**
    * get topFirewallRules
    *
    * @return
    */
    public List<Item> getTopFirewallRules() {
        return topFirewallRules;
    }

    /**
    * set topFirewallRules
    *
    * @param topFirewallRules
    */
    public void setTopFirewallRules(List<Item> topFirewallRules) {
        this.topFirewallRules = topFirewallRules;
    }


    /**
    * get topWafRuleIds
    *
    * @return
    */
    public List<Item> getTopWafRuleIds() {
        return topWafRuleIds;
    }

    /**
    * set topWafRuleIds
    *
    * @param topWafRuleIds
    */
    public void setTopWafRuleIds(List<Item> topWafRuleIds) {
        this.topWafRuleIds = topWafRuleIds;
    }


    /**
    * get topWafRules
    *
    * @return
    */
    public List<Item> getTopWafRules() {
        return topWafRules;
    }

    /**
    * set topWafRules
    *
    * @param topWafRules
    */
    public void setTopWafRules(List<Item> topWafRules) {
        this.topWafRules = topWafRules;
    }



    /**
    * set countries
    *
    * @param countries
    */
    public FirewallTopKResult countries(List<Item> countries) {
        this.countries = countries;
        return this;
    }


    /**
    * set topCountries
    *
    * @param topCountries
    */
    public FirewallTopKResult topCountries(List<Item> topCountries) {
        this.topCountries = topCountries;
        return this;
    }


    /**
    * set topDeviceTypes
    *
    * @param topDeviceTypes
    */
    public FirewallTopKResult topDeviceTypes(List<Item> topDeviceTypes) {
        this.topDeviceTypes = topDeviceTypes;
        return this;
    }


    /**
    * set topHosts
    *
    * @param topHosts
    */
    public FirewallTopKResult topHosts(List<Item> topHosts) {
        this.topHosts = topHosts;
        return this;
    }


    /**
    * set topPaths
    *
    * @param topPaths
    */
    public FirewallTopKResult topPaths(List<Item> topPaths) {
        this.topPaths = topPaths;
        return this;
    }


    /**
    * set topContentTypes
    *
    * @param topContentTypes
    */
    public FirewallTopKResult topContentTypes(List<Item> topContentTypes) {
        this.topContentTypes = topContentTypes;
        return this;
    }


    /**
    * set topStatusCodes
    *
    * @param topStatusCodes
    */
    public FirewallTopKResult topStatusCodes(List<Item> topStatusCodes) {
        this.topStatusCodes = topStatusCodes;
        return this;
    }


    /**
    * set topIPs
    *
    * @param topIPs
    */
    public FirewallTopKResult topIPs(List<Item> topIPs) {
        this.topIPs = topIPs;
        return this;
    }


    /**
    * set topUserAgents
    *
    * @param topUserAgents
    */
    public FirewallTopKResult topUserAgents(List<Item> topUserAgents) {
        this.topUserAgents = topUserAgents;
        return this;
    }


    /**
    * set topHttpMethods
    *
    * @param topHttpMethods
    */
    public FirewallTopKResult topHttpMethods(List<Item> topHttpMethods) {
        this.topHttpMethods = topHttpMethods;
        return this;
    }


    /**
    * set topASNs
    *
    * @param topASNs
    */
    public FirewallTopKResult topASNs(List<Item> topASNs) {
        this.topASNs = topASNs;
        return this;
    }


    /**
    * set topFirewallRuleIds
    *
    * @param topFirewallRuleIds
    */
    public FirewallTopKResult topFirewallRuleIds(List<Item> topFirewallRuleIds) {
        this.topFirewallRuleIds = topFirewallRuleIds;
        return this;
    }


    /**
    * set topFirewallRules
    *
    * @param topFirewallRules
    */
    public FirewallTopKResult topFirewallRules(List<Item> topFirewallRules) {
        this.topFirewallRules = topFirewallRules;
        return this;
    }


    /**
    * set topWafRuleIds
    *
    * @param topWafRuleIds
    */
    public FirewallTopKResult topWafRuleIds(List<Item> topWafRuleIds) {
        this.topWafRuleIds = topWafRuleIds;
        return this;
    }


    /**
    * set topWafRules
    *
    * @param topWafRules
    */
    public FirewallTopKResult topWafRules(List<Item> topWafRules) {
        this.topWafRules = topWafRules;
        return this;
    }



    /**
     * add item to countries
     *
     * @param countrie
     */
    public void addCountrie(Item countrie) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.add(countrie);
    }

    /**
     * add item to topCountries
     *
     * @param topCountrie
     */
    public void addTopCountrie(Item topCountrie) {
        if (this.topCountries == null) {
            this.topCountries = new ArrayList<>();
        }
        this.topCountries.add(topCountrie);
    }

    /**
     * add item to topDeviceTypes
     *
     * @param topDeviceType
     */
    public void addTopDeviceType(Item topDeviceType) {
        if (this.topDeviceTypes == null) {
            this.topDeviceTypes = new ArrayList<>();
        }
        this.topDeviceTypes.add(topDeviceType);
    }

    /**
     * add item to topHosts
     *
     * @param topHost
     */
    public void addTopHost(Item topHost) {
        if (this.topHosts == null) {
            this.topHosts = new ArrayList<>();
        }
        this.topHosts.add(topHost);
    }

    /**
     * add item to topPaths
     *
     * @param topPath
     */
    public void addTopPath(Item topPath) {
        if (this.topPaths == null) {
            this.topPaths = new ArrayList<>();
        }
        this.topPaths.add(topPath);
    }

    /**
     * add item to topContentTypes
     *
     * @param topContentType
     */
    public void addTopContentType(Item topContentType) {
        if (this.topContentTypes == null) {
            this.topContentTypes = new ArrayList<>();
        }
        this.topContentTypes.add(topContentType);
    }

    /**
     * add item to topStatusCodes
     *
     * @param topStatusCode
     */
    public void addTopStatusCode(Item topStatusCode) {
        if (this.topStatusCodes == null) {
            this.topStatusCodes = new ArrayList<>();
        }
        this.topStatusCodes.add(topStatusCode);
    }

    /**
     * add item to topIPs
     *
     * @param topIP
     */
    public void addTopIP(Item topIP) {
        if (this.topIPs == null) {
            this.topIPs = new ArrayList<>();
        }
        this.topIPs.add(topIP);
    }

    /**
     * add item to topUserAgents
     *
     * @param topUserAgent
     */
    public void addTopUserAgent(Item topUserAgent) {
        if (this.topUserAgents == null) {
            this.topUserAgents = new ArrayList<>();
        }
        this.topUserAgents.add(topUserAgent);
    }

    /**
     * add item to topHttpMethods
     *
     * @param topHttpMethod
     */
    public void addTopHttpMethod(Item topHttpMethod) {
        if (this.topHttpMethods == null) {
            this.topHttpMethods = new ArrayList<>();
        }
        this.topHttpMethods.add(topHttpMethod);
    }

    /**
     * add item to topASNs
     *
     * @param topASN
     */
    public void addTopASN(Item topASN) {
        if (this.topASNs == null) {
            this.topASNs = new ArrayList<>();
        }
        this.topASNs.add(topASN);
    }

    /**
     * add item to topFirewallRuleIds
     *
     * @param topFirewallRuleId
     */
    public void addTopFirewallRuleId(Item topFirewallRuleId) {
        if (this.topFirewallRuleIds == null) {
            this.topFirewallRuleIds = new ArrayList<>();
        }
        this.topFirewallRuleIds.add(topFirewallRuleId);
    }

    /**
     * add item to topFirewallRules
     *
     * @param topFirewallRule
     */
    public void addTopFirewallRule(Item topFirewallRule) {
        if (this.topFirewallRules == null) {
            this.topFirewallRules = new ArrayList<>();
        }
        this.topFirewallRules.add(topFirewallRule);
    }

    /**
     * add item to topWafRuleIds
     *
     * @param topWafRuleId
     */
    public void addTopWafRuleId(Item topWafRuleId) {
        if (this.topWafRuleIds == null) {
            this.topWafRuleIds = new ArrayList<>();
        }
        this.topWafRuleIds.add(topWafRuleId);
    }

    /**
     * add item to topWafRules
     *
     * @param topWafRule
     */
    public void addTopWafRule(Item topWafRule) {
        if (this.topWafRules == null) {
            this.topWafRules = new ArrayList<>();
        }
        this.topWafRules.add(topWafRule);
    }
}