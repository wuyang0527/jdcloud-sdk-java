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

package com.jdcloud.sdk.service.smartdba.model;


/**
 * panel
 */
public class Panel  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 监控大盘名称
     */
    private String name;

    /**
     * 监控大盘id
     */
    private String panelGid;


    /**
     * get 监控大盘名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 监控大盘名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 监控大盘id
     *
     * @return
     */
    public String getPanelGid() {
        return panelGid;
    }

    /**
     * set 监控大盘id
     *
     * @param panelGid
     */
    public void setPanelGid(String panelGid) {
        this.panelGid = panelGid;
    }


    /**
     * set 监控大盘名称
     *
     * @param name
     */
    public Panel name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 监控大盘id
     *
     * @param panelGid
     */
    public Panel panelGid(String panelGid) {
        this.panelGid = panelGid;
        return this;
    }


}