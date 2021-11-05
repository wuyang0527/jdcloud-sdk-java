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

package com.jdcloud.sdk.service.starshield.model;


/**
 * advanced
 */
public class Advanced  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分配数量
     */
    private Number allocated;

    /**
     * 已使用数量
     */
    private Number used;


    /**
     * get 分配数量
     *
     * @return
     */
    public Number getAllocated() {
        return allocated;
    }

    /**
     * set 分配数量
     *
     * @param allocated
     */
    public void setAllocated(Number allocated) {
        this.allocated = allocated;
    }

    /**
     * get 已使用数量
     *
     * @return
     */
    public Number getUsed() {
        return used;
    }

    /**
     * set 已使用数量
     *
     * @param used
     */
    public void setUsed(Number used) {
        this.used = used;
    }


    /**
     * set 分配数量
     *
     * @param allocated
     */
    public Advanced allocated(Number allocated) {
        this.allocated = allocated;
        return this;
    }

    /**
     * set 已使用数量
     *
     * @param used
     */
    public Advanced used(Number used) {
        this.used = used;
        return this;
    }


}