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
 * bucket service
 * bucket service
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.model;


/**
 * bucketInfo
 */
public class BucketInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * bucketId
     */
    private Long bucketId;

    /**
     * bucket名称
     */
    private String bucketName;

    /**
     * bucket所属区域
     */
    private String regionId;

    /**
     * bucket所属的用户
     */
    private String pin;


    /**
     * get bucketId
     *
     * @return
     */
    public Long getBucketId() {
        return bucketId;
    }

    /**
     * set bucketId
     *
     * @param bucketId
     */
    public void setBucketId(Long bucketId) {
        this.bucketId = bucketId;
    }

    /**
     * get bucket名称
     *
     * @return
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * set bucket名称
     *
     * @param bucketName
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * get bucket所属区域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set bucket所属区域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get bucket所属的用户
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set bucket所属的用户
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * set bucketId
     *
     * @param bucketId
     */
    public BucketInfo bucketId(Long bucketId) {
        this.bucketId = bucketId;
        return this;
    }

    /**
     * set bucket名称
     *
     * @param bucketName
     */
    public BucketInfo bucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * set bucket所属区域
     *
     * @param regionId
     */
    public BucketInfo regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set bucket所属的用户
     *
     * @param pin
     */
    public BucketInfo pin(String pin) {
        this.pin = pin;
        return this;
    }


}