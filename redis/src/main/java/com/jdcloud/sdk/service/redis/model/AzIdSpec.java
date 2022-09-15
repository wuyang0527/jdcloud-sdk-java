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

package com.jdcloud.sdk.service.redis.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * 创建缓存Redis实例时，用户输入的可用区ID信息
 */
public class AzIdSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * AZ指定方式，SpecifyByReplicaGroup表示按副本组指定，SpecifyByCluster表示按整个集群指定
     */
    private String azSpecifyType;

    /**
     * 为集群指定的AZ范围，按集群指定AZ时生效
     */
    
    private List<String> azsForCluster;
    /**
     * 缓存Redis主实例所在的可用区ID，按副本组指定AZ时生效
     * Required:true
     */
    @Required
    private String master;

    /**
     * 缓存Redis从实例所在的可用区ID，按副本组指定AZ时生效
     * Required:true
     */
    @Required
    private String slave;



    /**
     * get AZ指定方式，SpecifyByReplicaGroup表示按副本组指定，SpecifyByCluster表示按整个集群指定
     *
     * @return
     */
    public String getAzSpecifyType() {
        return azSpecifyType;
    }

    /**
     * set AZ指定方式，SpecifyByReplicaGroup表示按副本组指定，SpecifyByCluster表示按整个集群指定
     *
     * @param azSpecifyType
     */
    public void setAzSpecifyType(String azSpecifyType) {
        this.azSpecifyType = azSpecifyType;
    }


    /**
    * get 为集群指定的AZ范围，按集群指定AZ时生效
    *
    * @return
    */
    public List<String> getAzsForCluster() {
        return azsForCluster;
    }

    /**
    * set 为集群指定的AZ范围，按集群指定AZ时生效
    *
    * @param azsForCluster
    */
    public void setAzsForCluster(List<String> azsForCluster) {
        this.azsForCluster = azsForCluster;
    }


    /**
     * get 缓存Redis主实例所在的可用区ID，按副本组指定AZ时生效
     *
     * @return
     */
    public String getMaster() {
        return master;
    }

    /**
     * set 缓存Redis主实例所在的可用区ID，按副本组指定AZ时生效
     *
     * @param master
     */
    public void setMaster(String master) {
        this.master = master;
    }


    /**
     * get 缓存Redis从实例所在的可用区ID，按副本组指定AZ时生效
     *
     * @return
     */
    public String getSlave() {
        return slave;
    }

    /**
     * set 缓存Redis从实例所在的可用区ID，按副本组指定AZ时生效
     *
     * @param slave
     */
    public void setSlave(String slave) {
        this.slave = slave;
    }



    /**
     * set AZ指定方式，SpecifyByReplicaGroup表示按副本组指定，SpecifyByCluster表示按整个集群指定
     *
     * @param azSpecifyType
     */
    public AzIdSpec azSpecifyType(String azSpecifyType) {
        this.azSpecifyType = azSpecifyType;
        return this;
    }


    /**
    * set 为集群指定的AZ范围，按集群指定AZ时生效
    *
    * @param azsForCluster
    */
    public AzIdSpec azsForCluster(List<String> azsForCluster) {
        this.azsForCluster = azsForCluster;
        return this;
    }


    /**
     * set 缓存Redis主实例所在的可用区ID，按副本组指定AZ时生效
     *
     * @param master
     */
    public AzIdSpec master(String master) {
        this.master = master;
        return this;
    }


    /**
     * set 缓存Redis从实例所在的可用区ID，按副本组指定AZ时生效
     *
     * @param slave
     */
    public AzIdSpec slave(String slave) {
        this.slave = slave;
        return this;
    }



    /**
     * add item to 为集群指定的AZ范围，按集群指定AZ时生效
     *
     * @param azsForCluster
     */
    public void addAzsForCluster(String azsForCluster) {
        if (this.azsForCluster == null) {
            this.azsForCluster = new ArrayList<>();
        }
        this.azsForCluster.add(azsForCluster);
    }
}