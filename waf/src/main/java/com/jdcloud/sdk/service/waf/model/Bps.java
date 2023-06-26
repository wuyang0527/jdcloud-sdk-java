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
 * bps
 */
public class Bps  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * upBps
     */
    private ChartItemValue upBps;

    /**
     * downBps
     */
    private ChartItemValue downBps;



    /**
     * get upBps
     *
     * @return
     */
    public ChartItemValue getUpBps() {
        return upBps;
    }

    /**
     * set upBps
     *
     * @param upBps
     */
    public void setUpBps(ChartItemValue upBps) {
        this.upBps = upBps;
    }


    /**
     * get downBps
     *
     * @return
     */
    public ChartItemValue getDownBps() {
        return downBps;
    }

    /**
     * set downBps
     *
     * @param downBps
     */
    public void setDownBps(ChartItemValue downBps) {
        this.downBps = downBps;
    }



    /**
     * set upBps
     *
     * @param upBps
     */
    public Bps upBps(ChartItemValue upBps) {
        this.upBps = upBps;
        return this;
    }


    /**
     * set downBps
     *
     * @param downBps
     */
    public Bps downBps(ChartItemValue downBps) {
        this.downBps = downBps;
        return this;
    }


}