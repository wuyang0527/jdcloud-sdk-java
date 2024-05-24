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

package com.jdcloud.sdk.service.jdccs.model;


/**
 * 交换机信息
 */
public class Switchboard  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * IP
     */
    private String ip;

    /**
     * 端口
     */
    private String port;



    /**
     * get IP
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set IP
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }


    /**
     * get 端口
     *
     * @return
     */
    public String getPort() {
        return port;
    }

    /**
     * set 端口
     *
     * @param port
     */
    public void setPort(String port) {
        this.port = port;
    }



    /**
     * set IP
     *
     * @param ip
     */
    public Switchboard ip(String ip) {
        this.ip = ip;
        return this;
    }


    /**
     * set 端口
     *
     * @param port
     */
    public Switchboard port(String port) {
        this.port = port;
        return this;
    }


}