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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cdn.model.CacheVo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 批量添加缓存规则
 */
public class SetCacheRulesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private List<CacheVo> data;


    /**
     * get data
     *
     * @return
     */
    public List<CacheVo> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<CacheVo> data) {
        this.data = data;
    }


    /**
     * set data
     *
     * @param data
     */
    public SetCacheRulesResult data(List<CacheVo> data) {
        this.data = data;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(CacheVo data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}