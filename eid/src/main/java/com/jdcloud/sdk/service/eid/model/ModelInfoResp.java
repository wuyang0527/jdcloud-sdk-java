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

package com.jdcloud.sdk.service.eid.model;

import java.util.List;
import java.util.ArrayList;

/**
 * modelInfoResp
 */
public class ModelInfoResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模型id
     */
    private Integer id;

    /**
     * 模型名称
     */
    private String modelName;

    /**
     * 描述
     */
    private String desc;

    /**
     * 创建时间,秒级时间戳
     */
    private Integer createTime;

    /**
     * 更新时间,秒级时间戳
     */
    private Integer updateTime;

    /**
     * 关联标签列表
     */
    
    private List<ModelLabelInfoResp> labelList;


    /**
     * get 模型id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 模型id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get 模型名称
     *
     * @return
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * set 模型名称
     *
     * @param modelName
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }


    /**
     * get 描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 描述
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }


    /**
     * get 创建时间,秒级时间戳
     *
     * @return
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间,秒级时间戳
     *
     * @param createTime
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }


    /**
     * get 更新时间,秒级时间戳
     *
     * @return
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间,秒级时间戳
     *
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }


    /**
    * get 关联标签列表
    *
    * @return
    */
    public List<ModelLabelInfoResp> getLabelList() {
        return labelList;
    }

    /**
    * set 关联标签列表
    *
    * @param labelList
    */
    public void setLabelList(List<ModelLabelInfoResp> labelList) {
        this.labelList = labelList;
    }



    /**
     * set 模型id
     *
     * @param id
     */
    public ModelInfoResp id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set 模型名称
     *
     * @param modelName
     */
    public ModelInfoResp modelName(String modelName) {
        this.modelName = modelName;
        return this;
    }


    /**
     * set 描述
     *
     * @param desc
     */
    public ModelInfoResp desc(String desc) {
        this.desc = desc;
        return this;
    }


    /**
     * set 创建时间,秒级时间戳
     *
     * @param createTime
     */
    public ModelInfoResp createTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 更新时间,秒级时间戳
     *
     * @param updateTime
     */
    public ModelInfoResp updateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
    * set 关联标签列表
    *
    * @param labelList
    */
    public ModelInfoResp labelList(List<ModelLabelInfoResp> labelList) {
        this.labelList = labelList;
        return this;
    }



    /**
     * add item to 关联标签列表
     *
     * @param labelList
     */
    public void addLabelList(ModelLabelInfoResp labelList) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        this.labelList.add(labelList);
    }
}