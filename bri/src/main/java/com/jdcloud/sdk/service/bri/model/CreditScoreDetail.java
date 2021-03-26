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

package com.jdcloud.sdk.service.bri.model;


/**
 * creditScoreDetail
 */
public class CreditScoreDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 风险类型，对应riskCode的中文描述
     */
    private String riskTag;

    /**
     * 风险类型编码
     */
    private String riskCode;

    /**
     * 风险分类，对应riskCode的分类，101~106账号综合风险，201~207手机综合风险，301设备综合风险，401~403身份综合风险，501~506IP综合风险，600~604注册综合风险，700~703登录综合风险，800~803营销综合风险
     */
    private String riskClass;

    /**
     * 风险评分，1-低风险 2-中低风险 3-中风险 4-中高风险 5-高风险 0-未知
     */
    private String score;

    /**
     * 对应score的中文描述，1-低风险 2-中低风险 3-中风险 4-中高风险 5-高风险 0-未知
     */
    private String scoreDesc;

    /**
     * 手机号码归属地，只有resourceType为phone时且归属地不为空时提供字段值，如：黑龙江-伊春市
     */
    private String attribution;


    /**
     * get 风险类型，对应riskCode的中文描述
     *
     * @return
     */
    public String getRiskTag() {
        return riskTag;
    }

    /**
     * set 风险类型，对应riskCode的中文描述
     *
     * @param riskTag
     */
    public void setRiskTag(String riskTag) {
        this.riskTag = riskTag;
    }

    /**
     * get 风险类型编码
     *
     * @return
     */
    public String getRiskCode() {
        return riskCode;
    }

    /**
     * set 风险类型编码
     *
     * @param riskCode
     */
    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    /**
     * get 风险分类，对应riskCode的分类，101~106账号综合风险，201~207手机综合风险，301设备综合风险，401~403身份综合风险，501~506IP综合风险，600~604注册综合风险，700~703登录综合风险，800~803营销综合风险
     *
     * @return
     */
    public String getRiskClass() {
        return riskClass;
    }

    /**
     * set 风险分类，对应riskCode的分类，101~106账号综合风险，201~207手机综合风险，301设备综合风险，401~403身份综合风险，501~506IP综合风险，600~604注册综合风险，700~703登录综合风险，800~803营销综合风险
     *
     * @param riskClass
     */
    public void setRiskClass(String riskClass) {
        this.riskClass = riskClass;
    }

    /**
     * get 风险评分，1-低风险 2-中低风险 3-中风险 4-中高风险 5-高风险 0-未知
     *
     * @return
     */
    public String getScore() {
        return score;
    }

    /**
     * set 风险评分，1-低风险 2-中低风险 3-中风险 4-中高风险 5-高风险 0-未知
     *
     * @param score
     */
    public void setScore(String score) {
        this.score = score;
    }

    /**
     * get 对应score的中文描述，1-低风险 2-中低风险 3-中风险 4-中高风险 5-高风险 0-未知
     *
     * @return
     */
    public String getScoreDesc() {
        return scoreDesc;
    }

    /**
     * set 对应score的中文描述，1-低风险 2-中低风险 3-中风险 4-中高风险 5-高风险 0-未知
     *
     * @param scoreDesc
     */
    public void setScoreDesc(String scoreDesc) {
        this.scoreDesc = scoreDesc;
    }

    /**
     * get 手机号码归属地，只有resourceType为phone时且归属地不为空时提供字段值，如：黑龙江-伊春市
     *
     * @return
     */
    public String getAttribution() {
        return attribution;
    }

    /**
     * set 手机号码归属地，只有resourceType为phone时且归属地不为空时提供字段值，如：黑龙江-伊春市
     *
     * @param attribution
     */
    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }


    /**
     * set 风险类型，对应riskCode的中文描述
     *
     * @param riskTag
     */
    public CreditScoreDetail riskTag(String riskTag) {
        this.riskTag = riskTag;
        return this;
    }

    /**
     * set 风险类型编码
     *
     * @param riskCode
     */
    public CreditScoreDetail riskCode(String riskCode) {
        this.riskCode = riskCode;
        return this;
    }

    /**
     * set 风险分类，对应riskCode的分类，101~106账号综合风险，201~207手机综合风险，301设备综合风险，401~403身份综合风险，501~506IP综合风险，600~604注册综合风险，700~703登录综合风险，800~803营销综合风险
     *
     * @param riskClass
     */
    public CreditScoreDetail riskClass(String riskClass) {
        this.riskClass = riskClass;
        return this;
    }

    /**
     * set 风险评分，1-低风险 2-中低风险 3-中风险 4-中高风险 5-高风险 0-未知
     *
     * @param score
     */
    public CreditScoreDetail score(String score) {
        this.score = score;
        return this;
    }

    /**
     * set 对应score的中文描述，1-低风险 2-中低风险 3-中风险 4-中高风险 5-高风险 0-未知
     *
     * @param scoreDesc
     */
    public CreditScoreDetail scoreDesc(String scoreDesc) {
        this.scoreDesc = scoreDesc;
        return this;
    }

    /**
     * set 手机号码归属地，只有resourceType为phone时且归属地不为空时提供字段值，如：黑龙江-伊春市
     *
     * @param attribution
     */
    public CreditScoreDetail attribution(String attribution) {
        this.attribution = attribution;
        return this;
    }


}