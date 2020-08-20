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

package com.jdcloud.sdk.service.waf.model;


/**
 * skipConf
 */
public class SkipConf  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否使能 0表示否
     */
    private Integer enable;

    /**
     * 规则条数
     */
    private Integer listNum;


    /**
     * get 是否使能 0表示否
     *
     * @return
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * set 是否使能 0表示否
     *
     * @param enable
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * get 规则条数
     *
     * @return
     */
    public Integer getListNum() {
        return listNum;
    }

    /**
     * set 规则条数
     *
     * @param listNum
     */
    public void setListNum(Integer listNum) {
        this.listNum = listNum;
    }


    /**
     * set 是否使能 0表示否
     *
     * @param enable
     */
    public SkipConf enable(Integer enable) {
        this.enable = enable;
        return this;
    }

    /**
     * set 规则条数
     *
     * @param listNum
     */
    public SkipConf listNum(Integer listNum) {
        this.listNum = listNum;
        return this;
    }


}