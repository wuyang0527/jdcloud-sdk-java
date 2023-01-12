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

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * disableRulesReq
 */
public class DisableRulesReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 0:使用规则，1：禁用规则
     */
    private Integer disable;

    /**
     * 操作的规则id, ruleType非&quot;waf&quot;时必填
     * Required:true
     */
    @Required
    
    private List<Integer> ids;
    /**
     * 操作的规则类型，&quot;ratelimit&quot;：限速
     * Required:true
     */
    @Required
    private String ruleType;



    /**
     * get 0:使用规则，1：禁用规则
     *
     * @return
     */
    public Integer getDisable() {
        return disable;
    }

    /**
     * set 0:使用规则，1：禁用规则
     *
     * @param disable
     */
    public void setDisable(Integer disable) {
        this.disable = disable;
    }


    /**
    * get 操作的规则id, ruleType非&quot;waf&quot;时必填
    *
    * @return
    */
    public List<Integer> getIds() {
        return ids;
    }

    /**
    * set 操作的规则id, ruleType非&quot;waf&quot;时必填
    *
    * @param ids
    */
    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }


    /**
     * get 操作的规则类型，&quot;ratelimit&quot;：限速
     *
     * @return
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * set 操作的规则类型，&quot;ratelimit&quot;：限速
     *
     * @param ruleType
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }



    /**
     * set 0:使用规则，1：禁用规则
     *
     * @param disable
     */
    public DisableRulesReq disable(Integer disable) {
        this.disable = disable;
        return this;
    }


    /**
    * set 操作的规则id, ruleType非&quot;waf&quot;时必填
    *
    * @param ids
    */
    public DisableRulesReq ids(List<Integer> ids) {
        this.ids = ids;
        return this;
    }


    /**
     * set 操作的规则类型，&quot;ratelimit&quot;：限速
     *
     * @param ruleType
     */
    public DisableRulesReq ruleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }



    /**
     * add item to 操作的规则id, ruleType非&quot;waf&quot;时必填
     *
     * @param id
     */
    public void addId(Integer id) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(id);
    }
}