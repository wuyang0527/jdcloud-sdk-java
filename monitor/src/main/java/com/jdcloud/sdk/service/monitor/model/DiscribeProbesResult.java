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
 * Availability Monitoring APIs
 * 可用性监控相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.ProbeInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询 可用性监控任务的探测源列表
 */
public class DiscribeProbesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * probeList
     */
    private List<ProbeInfo> probeList;


    /**
     * get probeList
     *
     * @return
     */
    public List<ProbeInfo> getProbeList() {
        return probeList;
    }

    /**
     * set probeList
     *
     * @param probeList
     */
    public void setProbeList(List<ProbeInfo> probeList) {
        this.probeList = probeList;
    }


    /**
     * set probeList
     *
     * @param probeList
     */
    public DiscribeProbesResult probeList(List<ProbeInfo> probeList) {
        this.probeList = probeList;
        return this;
    }


    /**
     * add item to probeList
     *
     * @param probeList
     */
    public void addProbeList(ProbeInfo probeList) {
        if (this.probeList == null) {
            this.probeList = new ArrayList<>();
        }
        this.probeList.add(probeList);
    }

}