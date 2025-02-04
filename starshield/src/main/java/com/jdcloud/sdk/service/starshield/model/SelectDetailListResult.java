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
 * instance
 * 实例管理模块
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 套餐实例续费回调查询
 */
public class SelectDetailListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private List<Object> data;


    /**
     * get data
     *
     * @return
     */
    public List<Object> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<Object> data) {
        this.data = data;
    }


    /**
     * set data
     *
     * @param data
     */
    public SelectDetailListResult data(List<Object> data) {
        this.data = data;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(Object data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}