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

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * pipelineSpec
 */
public class PipelineSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 字段名称
     * Required:true
     */
    @Required
    private String field;

    /**
     * 字段类型。 system, custom。 不填写默认为custom
     */
    private String fieldType;

    /**
     * 解析类型。目前仅支持 regexp。
     * Required:true
     */
    @Required
    private String parserMode;

    /**
     * 解析语法
     */
    private String parserPattern;

    /**
     * 日志样例
     */
    private String parserSample;



    /**
     * get 字段名称
     *
     * @return
     */
    public String getField() {
        return field;
    }

    /**
     * set 字段名称
     *
     * @param field
     */
    public void setField(String field) {
        this.field = field;
    }


    /**
     * get 字段类型。 system, custom。 不填写默认为custom
     *
     * @return
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * set 字段类型。 system, custom。 不填写默认为custom
     *
     * @param fieldType
     */
    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }


    /**
     * get 解析类型。目前仅支持 regexp。
     *
     * @return
     */
    public String getParserMode() {
        return parserMode;
    }

    /**
     * set 解析类型。目前仅支持 regexp。
     *
     * @param parserMode
     */
    public void setParserMode(String parserMode) {
        this.parserMode = parserMode;
    }


    /**
     * get 解析语法
     *
     * @return
     */
    public String getParserPattern() {
        return parserPattern;
    }

    /**
     * set 解析语法
     *
     * @param parserPattern
     */
    public void setParserPattern(String parserPattern) {
        this.parserPattern = parserPattern;
    }


    /**
     * get 日志样例
     *
     * @return
     */
    public String getParserSample() {
        return parserSample;
    }

    /**
     * set 日志样例
     *
     * @param parserSample
     */
    public void setParserSample(String parserSample) {
        this.parserSample = parserSample;
    }



    /**
     * set 字段名称
     *
     * @param field
     */
    public PipelineSpec field(String field) {
        this.field = field;
        return this;
    }


    /**
     * set 字段类型。 system, custom。 不填写默认为custom
     *
     * @param fieldType
     */
    public PipelineSpec fieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }


    /**
     * set 解析类型。目前仅支持 regexp。
     *
     * @param parserMode
     */
    public PipelineSpec parserMode(String parserMode) {
        this.parserMode = parserMode;
        return this;
    }


    /**
     * set 解析语法
     *
     * @param parserPattern
     */
    public PipelineSpec parserPattern(String parserPattern) {
        this.parserPattern = parserPattern;
        return this;
    }


    /**
     * set 日志样例
     *
     * @param parserSample
     */
    public PipelineSpec parserSample(String parserSample) {
        this.parserSample = parserSample;
        return this;
    }


}