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
 * Instance-Management
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import com.jdcloud.sdk.service.tidb.model.TidbInstanceAttribute;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询 TiDB 实例的详细信息
 */
public class DescribeInstanceAttributesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * tidbInstanceAttributes
     */
    private TidbInstanceAttribute tidbInstanceAttributes;



    /**
     * get tidbInstanceAttributes
     *
     * @return
     */
    public TidbInstanceAttribute getTidbInstanceAttributes() {
        return tidbInstanceAttributes;
    }

    /**
     * set tidbInstanceAttributes
     *
     * @param tidbInstanceAttributes
     */
    public void setTidbInstanceAttributes(TidbInstanceAttribute tidbInstanceAttributes) {
        this.tidbInstanceAttributes = tidbInstanceAttributes;
    }



    /**
     * set tidbInstanceAttributes
     *
     * @param tidbInstanceAttributes
     */
    public DescribeInstanceAttributesResult tidbInstanceAttributes(TidbInstanceAttribute tidbInstanceAttributes) {
        this.tidbInstanceAttributes = tidbInstanceAttributes;
        return this;
    }


}