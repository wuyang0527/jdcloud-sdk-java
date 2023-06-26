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
 * admin-info
 * admin-Info API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取回源ip段
 */
public class DescribeLbOutIpResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * list
     */
    private Object list;



    /**
     * get list
     *
     * @return
     */
    public Object getList() {
        return list;
    }

    /**
     * set list
     *
     * @param list
     */
    public void setList(Object list) {
        this.list = list;
    }



    /**
     * set list
     *
     * @param list
     */
    public DescribeLbOutIpResult list(Object list) {
        this.list = list;
        return this;
    }


}