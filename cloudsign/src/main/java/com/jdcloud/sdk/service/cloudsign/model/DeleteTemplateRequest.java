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
 * 合同模板管理接口
 * 电子签章-合同模板管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudsign.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除合同模板 [MFA enabled]
 */
public class DeleteTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 合同模板ID
     * Required:true
     */
    @Required
    private String templateId;



    /**
     * get 合同模板ID
     *
     * @return
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * set 合同模板ID
     *
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }



    /**
     * set 合同模板ID
     *
     * @param templateId
     */
    public DeleteTemplateRequest templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }


}