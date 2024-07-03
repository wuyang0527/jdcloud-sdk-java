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
 * 客户端sdk对外调用接口
 * 客户端sdk对外调用接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.eid.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设备信息上报
 */
public class DeviceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private String data;



    /**
     * get data
     *
     * @return
     */
    public String getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }



    /**
     * set data
     *
     * @param data
     */
    public DeviceRequest data(String data) {
        this.data = data;
        return this;
    }


}