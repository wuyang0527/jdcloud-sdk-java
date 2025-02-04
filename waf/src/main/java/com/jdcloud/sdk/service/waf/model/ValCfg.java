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
 * valCfg
 */
public class ValCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号id,更新时需要
     */
    private Integer id;

    /**
     * 0-5 7-8 完全匹配0  前缀匹配1 包含2 正则3 大于4 后缀5 不等于7 不包含8
     */
    private Integer matchOp;

    /**
     * val
     * Required:true
     */
    @Required
    private String val;

    /**
     * 动作配置,旗舰版全部支持,其它套餐不支持观察
     * Required:true
     */
    @Required
    private AtCfg atCfg;


    /**
     * get 序号id,更新时需要
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 序号id,更新时需要
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 0-5 7-8 完全匹配0  前缀匹配1 包含2 正则3 大于4 后缀5 不等于7 不包含8
     *
     * @return
     */
    public Integer getMatchOp() {
        return matchOp;
    }

    /**
     * set 0-5 7-8 完全匹配0  前缀匹配1 包含2 正则3 大于4 后缀5 不等于7 不包含8
     *
     * @param matchOp
     */
    public void setMatchOp(Integer matchOp) {
        this.matchOp = matchOp;
    }

    /**
     * get val
     *
     * @return
     */
    public String getVal() {
        return val;
    }

    /**
     * set val
     *
     * @param val
     */
    public void setVal(String val) {
        this.val = val;
    }

    /**
     * get 动作配置,旗舰版全部支持,其它套餐不支持观察
     *
     * @return
     */
    public AtCfg getAtCfg() {
        return atCfg;
    }

    /**
     * set 动作配置,旗舰版全部支持,其它套餐不支持观察
     *
     * @param atCfg
     */
    public void setAtCfg(AtCfg atCfg) {
        this.atCfg = atCfg;
    }


    /**
     * set 序号id,更新时需要
     *
     * @param id
     */
    public ValCfg id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 0-5 7-8 完全匹配0  前缀匹配1 包含2 正则3 大于4 后缀5 不等于7 不包含8
     *
     * @param matchOp
     */
    public ValCfg matchOp(Integer matchOp) {
        this.matchOp = matchOp;
        return this;
    }

    /**
     * set val
     *
     * @param val
     */
    public ValCfg val(String val) {
        this.val = val;
        return this;
    }

    /**
     * set 动作配置,旗舰版全部支持,其它套餐不支持观察
     *
     * @param atCfg
     */
    public ValCfg atCfg(AtCfg atCfg) {
        this.atCfg = atCfg;
        return this;
    }


}