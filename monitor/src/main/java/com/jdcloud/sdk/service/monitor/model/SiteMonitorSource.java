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

package com.jdcloud.sdk.service.monitor.model;


/**
 * siteMonitorSource
 */
public class SiteMonitorSource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * sisp
     */
    private String sisp;

    /**
     * sispName
     */
    private String sispName;

    /**
     * sloc
     */
    private String sloc;

    /**
     * slocName
     */
    private String slocName;


    /**
     * get sisp
     *
     * @return
     */
    public String getSisp() {
        return sisp;
    }

    /**
     * set sisp
     *
     * @param sisp
     */
    public void setSisp(String sisp) {
        this.sisp = sisp;
    }

    /**
     * get sispName
     *
     * @return
     */
    public String getSispName() {
        return sispName;
    }

    /**
     * set sispName
     *
     * @param sispName
     */
    public void setSispName(String sispName) {
        this.sispName = sispName;
    }

    /**
     * get sloc
     *
     * @return
     */
    public String getSloc() {
        return sloc;
    }

    /**
     * set sloc
     *
     * @param sloc
     */
    public void setSloc(String sloc) {
        this.sloc = sloc;
    }

    /**
     * get slocName
     *
     * @return
     */
    public String getSlocName() {
        return slocName;
    }

    /**
     * set slocName
     *
     * @param slocName
     */
    public void setSlocName(String slocName) {
        this.slocName = slocName;
    }


    /**
     * set sisp
     *
     * @param sisp
     */
    public SiteMonitorSource sisp(String sisp) {
        this.sisp = sisp;
        return this;
    }

    /**
     * set sispName
     *
     * @param sispName
     */
    public SiteMonitorSource sispName(String sispName) {
        this.sispName = sispName;
        return this;
    }

    /**
     * set sloc
     *
     * @param sloc
     */
    public SiteMonitorSource sloc(String sloc) {
        this.sloc = sloc;
        return this;
    }

    /**
     * set slocName
     *
     * @param slocName
     */
    public SiteMonitorSource slocName(String slocName) {
        this.slocName = slocName;
        return this;
    }


}