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

import com.jdcloud.sdk.annotation.Required;

/**
 * botMatchItem
 */
public class BotMatchItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 匹配字段，ruleType为general时，可为ip,uri,user_agent,referer,cookie,Wday(格式:21,6 ;取值范围[0-6]]),Hour(格式:6,0 ;取值范围[0-23]) uri只能设置一个。ruleType为advanced时，可为fingerExist(是否存在),fingerValid(合法性)。 ruleType为evaluate时，对uri,cookie进行配置
     * Required:true
     */
    @Required
    private String field;

    /**
     * 0-完全匹配 1-包含匹配, 6-规则生效区间(field为Wday或Hour,Wday) field为fingerExist/fingerValid时无意义。
     * Required:true
     */
    @Required
    private Integer logic;

    /**
     * filed为ip时支持8/16/24位掩码和完全匹配，field为uri且logic为0时需以&quot;/&quot;开头
     * Required:true
     */
    @Required
    private String value;


    /**
     * get 匹配字段，ruleType为general时，可为ip,uri,user_agent,referer,cookie,Wday(格式:21,6 ;取值范围[0-6]]),Hour(格式:6,0 ;取值范围[0-23]) uri只能设置一个。ruleType为advanced时，可为fingerExist(是否存在),fingerValid(合法性)。 ruleType为evaluate时，对uri,cookie进行配置
     *
     * @return
     */
    public String getField() {
        return field;
    }

    /**
     * set 匹配字段，ruleType为general时，可为ip,uri,user_agent,referer,cookie,Wday(格式:21,6 ;取值范围[0-6]]),Hour(格式:6,0 ;取值范围[0-23]) uri只能设置一个。ruleType为advanced时，可为fingerExist(是否存在),fingerValid(合法性)。 ruleType为evaluate时，对uri,cookie进行配置
     *
     * @param field
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * get 0-完全匹配 1-包含匹配, 6-规则生效区间(field为Wday或Hour,Wday) field为fingerExist/fingerValid时无意义。
     *
     * @return
     */
    public Integer getLogic() {
        return logic;
    }

    /**
     * set 0-完全匹配 1-包含匹配, 6-规则生效区间(field为Wday或Hour,Wday) field为fingerExist/fingerValid时无意义。
     *
     * @param logic
     */
    public void setLogic(Integer logic) {
        this.logic = logic;
    }

    /**
     * get filed为ip时支持8/16/24位掩码和完全匹配，field为uri且logic为0时需以&quot;/&quot;开头
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set filed为ip时支持8/16/24位掩码和完全匹配，field为uri且logic为0时需以&quot;/&quot;开头
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * set 匹配字段，ruleType为general时，可为ip,uri,user_agent,referer,cookie,Wday(格式:21,6 ;取值范围[0-6]]),Hour(格式:6,0 ;取值范围[0-23]) uri只能设置一个。ruleType为advanced时，可为fingerExist(是否存在),fingerValid(合法性)。 ruleType为evaluate时，对uri,cookie进行配置
     *
     * @param field
     */
    public BotMatchItem field(String field) {
        this.field = field;
        return this;
    }

    /**
     * set 0-完全匹配 1-包含匹配, 6-规则生效区间(field为Wday或Hour,Wday) field为fingerExist/fingerValid时无意义。
     *
     * @param logic
     */
    public BotMatchItem logic(Integer logic) {
        this.logic = logic;
        return this;
    }

    /**
     * set filed为ip时支持8/16/24位掩码和完全匹配，field为uri且logic为0时需以&quot;/&quot;开头
     *
     * @param value
     */
    public BotMatchItem value(String value) {
        this.value = value;
        return this;
    }


}