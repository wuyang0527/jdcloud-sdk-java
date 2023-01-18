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

package com.jdcloud.sdk.service.nativecontainer.model;


/**
 * 本地盘
 */
public class InstanceLocalDisk  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 本地盘大小(GB)
     */
    private Integer diskSize;



    /**
     * get 本地盘大小(GB)
     *
     * @return
     */
    public Integer getDiskSize() {
        return diskSize;
    }

    /**
     * set 本地盘大小(GB)
     *
     * @param diskSize
     */
    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }



    /**
     * set 本地盘大小(GB)
     *
     * @param diskSize
     */
    public InstanceLocalDisk diskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }


}