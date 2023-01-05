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

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * natgatewayElasticIpStatusSpec
 */
public class NatgatewayElasticIpStatusSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公网IP列表
     * Required:true
     */
    @Required
    
    private List<String> elasticIpIds;
    /**
     * 公网ip状态，取值范围：online、offline。online表示将NAT绑定的公网IP上线，上线后公网IP可正常转发流量;offline表示将NAT绑定的公网IP下线，下线后，公网IP将不再接受新建连接，已有连接将继续转发流量，从而实现公网IP平滑下线。已下线的公网IP不会自动从NAT网关解绑，如需解绑请执行解绑操作
     * Required:true
     */
    @Required
    private String status;



    /**
    * get 公网IP列表
    *
    * @return
    */
    public List<String> getElasticIpIds() {
        return elasticIpIds;
    }

    /**
    * set 公网IP列表
    *
    * @param elasticIpIds
    */
    public void setElasticIpIds(List<String> elasticIpIds) {
        this.elasticIpIds = elasticIpIds;
    }


    /**
     * get 公网ip状态，取值范围：online、offline。online表示将NAT绑定的公网IP上线，上线后公网IP可正常转发流量;offline表示将NAT绑定的公网IP下线，下线后，公网IP将不再接受新建连接，已有连接将继续转发流量，从而实现公网IP平滑下线。已下线的公网IP不会自动从NAT网关解绑，如需解绑请执行解绑操作
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 公网ip状态，取值范围：online、offline。online表示将NAT绑定的公网IP上线，上线后公网IP可正常转发流量;offline表示将NAT绑定的公网IP下线，下线后，公网IP将不再接受新建连接，已有连接将继续转发流量，从而实现公网IP平滑下线。已下线的公网IP不会自动从NAT网关解绑，如需解绑请执行解绑操作
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }



    /**
    * set 公网IP列表
    *
    * @param elasticIpIds
    */
    public NatgatewayElasticIpStatusSpec elasticIpIds(List<String> elasticIpIds) {
        this.elasticIpIds = elasticIpIds;
        return this;
    }


    /**
     * set 公网ip状态，取值范围：online、offline。online表示将NAT绑定的公网IP上线，上线后公网IP可正常转发流量;offline表示将NAT绑定的公网IP下线，下线后，公网IP将不再接受新建连接，已有连接将继续转发流量，从而实现公网IP平滑下线。已下线的公网IP不会自动从NAT网关解绑，如需解绑请执行解绑操作
     *
     * @param status
     */
    public NatgatewayElasticIpStatusSpec status(String status) {
        this.status = status;
        return this;
    }



    /**
     * add item to 公网IP列表
     *
     * @param elasticIpId
     */
    public void addElasticIpId(String elasticIpId) {
        if (this.elasticIpIds == null) {
            this.elasticIpIds = new ArrayList<>();
        }
        this.elasticIpIds.add(elasticIpId);
    }
}