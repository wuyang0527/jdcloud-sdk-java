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

package com.jdcloud.sdk.service.dcap.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * fieldSpec
 */
public class FieldSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 字段名称
     * Required:true
     */
    @Required
    private String fieldName;

    /**
     * 加密字段
     * Required:true
     */
    @Required
    private String encryptField;

    /**
     * 索引字段
     * Required:true
     */
    @Required
    private String indexField;

    /**
     * 是否保留明文字段,true:保留明文字段
     * Required:true
     */
    @Required
    private Boolean keepPlainText;


    /**
     * get 字段名称
     *
     * @return
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * set 字段名称
     *
     * @param fieldName
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * get 加密字段
     *
     * @return
     */
    public String getEncryptField() {
        return encryptField;
    }

    /**
     * set 加密字段
     *
     * @param encryptField
     */
    public void setEncryptField(String encryptField) {
        this.encryptField = encryptField;
    }

    /**
     * get 索引字段
     *
     * @return
     */
    public String getIndexField() {
        return indexField;
    }

    /**
     * set 索引字段
     *
     * @param indexField
     */
    public void setIndexField(String indexField) {
        this.indexField = indexField;
    }

    /**
     * get 是否保留明文字段,true:保留明文字段
     *
     * @return
     */
    public Boolean getKeepPlainText() {
        return keepPlainText;
    }

    /**
     * set 是否保留明文字段,true:保留明文字段
     *
     * @param keepPlainText
     */
    public void setKeepPlainText(Boolean keepPlainText) {
        this.keepPlainText = keepPlainText;
    }


    /**
     * set 字段名称
     *
     * @param fieldName
     */
    public FieldSpec fieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * set 加密字段
     *
     * @param encryptField
     */
    public FieldSpec encryptField(String encryptField) {
        this.encryptField = encryptField;
        return this;
    }

    /**
     * set 索引字段
     *
     * @param indexField
     */
    public FieldSpec indexField(String indexField) {
        this.indexField = indexField;
        return this;
    }

    /**
     * set 是否保留明文字段,true:保留明文字段
     *
     * @param keepPlainText
     */
    public FieldSpec keepPlainText(Boolean keepPlainText) {
        this.keepPlainText = keepPlainText;
        return this;
    }


}