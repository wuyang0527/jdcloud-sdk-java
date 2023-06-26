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
 * Data-Chart
 * Data-Chart API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.waf.model.Qps;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取网站在一定时间内的qps信息。
 */
public class GetQpsDataResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * timeScope
     */
    
    private List<Long> timeScope;
    /**
     * qps数据
     */
    private Qps qps;



    /**
    * get timeScope
    *
    * @return
    */
    public List<Long> getTimeScope() {
        return timeScope;
    }

    /**
    * set timeScope
    *
    * @param timeScope
    */
    public void setTimeScope(List<Long> timeScope) {
        this.timeScope = timeScope;
    }


    /**
     * get qps数据
     *
     * @return
     */
    public Qps getQps() {
        return qps;
    }

    /**
     * set qps数据
     *
     * @param qps
     */
    public void setQps(Qps qps) {
        this.qps = qps;
    }



    /**
    * set timeScope
    *
    * @param timeScope
    */
    public GetQpsDataResult timeScope(List<Long> timeScope) {
        this.timeScope = timeScope;
        return this;
    }


    /**
     * set qps数据
     *
     * @param qps
     */
    public GetQpsDataResult qps(Qps qps) {
        this.qps = qps;
        return this;
    }



    /**
     * add item to timeScope
     *
     * @param timeScope
     */
    public void addTimeScope(Long timeScope) {
        if (this.timeScope == null) {
            this.timeScope = new ArrayList<>();
        }
        this.timeScope.add(timeScope);
    }
}