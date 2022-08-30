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

package com.jdcloud.sdk.service.cdn.model;


/**
 * dirDataV2
 */
public class DirDataV2  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 目录名称
     */
    private String dir;

    /**
     * 目录带宽
     */
    private Long bandwidth;

    /**
     * 目录流量
     */
    private Long flow;

    /**
     * 目录pv
     */
    private Long pv;



    /**
     * get 目录名称
     *
     * @return
     */
    public String getDir() {
        return dir;
    }

    /**
     * set 目录名称
     *
     * @param dir
     */
    public void setDir(String dir) {
        this.dir = dir;
    }


    /**
     * get 目录带宽
     *
     * @return
     */
    public Long getBandwidth() {
        return bandwidth;
    }

    /**
     * set 目录带宽
     *
     * @param bandwidth
     */
    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }


    /**
     * get 目录流量
     *
     * @return
     */
    public Long getFlow() {
        return flow;
    }

    /**
     * set 目录流量
     *
     * @param flow
     */
    public void setFlow(Long flow) {
        this.flow = flow;
    }


    /**
     * get 目录pv
     *
     * @return
     */
    public Long getPv() {
        return pv;
    }

    /**
     * set 目录pv
     *
     * @param pv
     */
    public void setPv(Long pv) {
        this.pv = pv;
    }



    /**
     * set 目录名称
     *
     * @param dir
     */
    public DirDataV2 dir(String dir) {
        this.dir = dir;
        return this;
    }


    /**
     * set 目录带宽
     *
     * @param bandwidth
     */
    public DirDataV2 bandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }


    /**
     * set 目录流量
     *
     * @param flow
     */
    public DirDataV2 flow(Long flow) {
        this.flow = flow;
        return this;
    }


    /**
     * set 目录pv
     *
     * @param pv
     */
    public DirDataV2 pv(Long pv) {
        this.pv = pv;
        return this;
    }


}