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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cloudsign.model.TemplateInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取合同模板列表
 */
public class DescribeTemplateListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * templateList
     */
    
    private List<TemplateInfo> templateList;
    /**
     * 合同模板数量
     */
    private Integer totalCount;



    /**
    * get templateList
    *
    * @return
    */
    public List<TemplateInfo> getTemplateList() {
        return templateList;
    }

    /**
    * set templateList
    *
    * @param templateList
    */
    public void setTemplateList(List<TemplateInfo> templateList) {
        this.templateList = templateList;
    }


    /**
     * get 合同模板数量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 合同模板数量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set templateList
    *
    * @param templateList
    */
    public DescribeTemplateListResult templateList(List<TemplateInfo> templateList) {
        this.templateList = templateList;
        return this;
    }


    /**
     * set 合同模板数量
     *
     * @param totalCount
     */
    public DescribeTemplateListResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to templateList
     *
     * @param templateList
     */
    public void addTemplateList(TemplateInfo templateList) {
        if (this.templateList == null) {
            this.templateList = new ArrayList<>();
        }
        this.templateList.add(templateList);
    }
}