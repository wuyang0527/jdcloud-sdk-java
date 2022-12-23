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

package com.jdcloud.sdk.service.cloudsign.model;


/**
 * countByPeriodResp
 */
public class CountByPeriodResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 取证次数
     */
    private String get;

    /**
     * 存证次数
     */
    private String put;

    /**
     * 获取存证报告次数
     */
    private String getReport;



    /**
     * get 取证次数
     *
     * @return
     */
    public String getGet() {
        return get;
    }

    /**
     * set 取证次数
     *
     * @param get
     */
    public void setGet(String get) {
        this.get = get;
    }


    /**
     * get 存证次数
     *
     * @return
     */
    public String getPut() {
        return put;
    }

    /**
     * set 存证次数
     *
     * @param put
     */
    public void setPut(String put) {
        this.put = put;
    }


    /**
     * get 获取存证报告次数
     *
     * @return
     */
    public String getGetReport() {
        return getReport;
    }

    /**
     * set 获取存证报告次数
     *
     * @param getReport
     */
    public void setGetReport(String getReport) {
        this.getReport = getReport;
    }



    /**
     * set 取证次数
     *
     * @param get
     */
    public CountByPeriodResp get(String get) {
        this.get = get;
        return this;
    }


    /**
     * set 存证次数
     *
     * @param put
     */
    public CountByPeriodResp put(String put) {
        this.put = put;
        return this;
    }


    /**
     * set 获取存证报告次数
     *
     * @param getReport
     */
    public CountByPeriodResp getReport(String getReport) {
        this.getReport = getReport;
        return this;
    }


}