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

package com.jdcloud.sdk.service.vm.model;


/**
 * 实例的本地磁盘信息。
 */
public class LocalDisk  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 磁盘类型，取值范围：&#x60;ssd、premium-hdd、hdd.std1、ssd.gp1、ssd.io1&#x60;。
     */
    private String diskType;

    /**
     * 磁盘大小。
     */
    private Integer diskSizeGB;



    /**
     * get 磁盘类型，取值范围：&#x60;ssd、premium-hdd、hdd.std1、ssd.gp1、ssd.io1&#x60;。
     *
     * @return
     */
    public String getDiskType() {
        return diskType;
    }

    /**
     * set 磁盘类型，取值范围：&#x60;ssd、premium-hdd、hdd.std1、ssd.gp1、ssd.io1&#x60;。
     *
     * @param diskType
     */
    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }


    /**
     * get 磁盘大小。
     *
     * @return
     */
    public Integer getDiskSizeGB() {
        return diskSizeGB;
    }

    /**
     * set 磁盘大小。
     *
     * @param diskSizeGB
     */
    public void setDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
    }



    /**
     * set 磁盘类型，取值范围：&#x60;ssd、premium-hdd、hdd.std1、ssd.gp1、ssd.io1&#x60;。
     *
     * @param diskType
     */
    public LocalDisk diskType(String diskType) {
        this.diskType = diskType;
        return this;
    }


    /**
     * set 磁盘大小。
     *
     * @param diskSizeGB
     */
    public LocalDisk diskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }


}