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
 * Anti DDoS Pro Web Rule Configuration APIs
 * Anti DDoS Pro Web Rule Configuration APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import com.jdcloud.sdk.service.ipanti.model.WebWhiteListRule;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询网站类规则的白名单规则
 */
public class DescribeWhiteListRuleOfWebRuleResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private WebWhiteListRule data;


    /**
     * get data
     *
     * @return
     */
    public WebWhiteListRule getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(WebWhiteListRule data) {
        this.data = data;
    }


    /**
     * set data
     *
     * @param data
     */
    public DescribeWhiteListRuleOfWebRuleResult data(WebWhiteListRule data) {
        this.data = data;
        return this;
    }


}