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
 * dosage bucket capacity openapi
 * dosage bucket capacity openapi
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ossopenapi.model.BucketCapacityStatistic;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据type获取指定bucket用量数据
 */
public class GetSingleBucketCapacityResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * bucket 用量统计列表
     */
    
    private List<BucketCapacityStatistic> resultList;


    /**
    * get bucket 用量统计列表
    *
    * @return
    */
    public List<BucketCapacityStatistic> getResultList() {
        return resultList;
    }

    /**
    * set bucket 用量统计列表
    *
    * @param resultList
    */
    public void setResultList(List<BucketCapacityStatistic> resultList) {
        this.resultList = resultList;
    }



    /**
    * set bucket 用量统计列表
    *
    * @param resultList
    */
    public GetSingleBucketCapacityResult resultList(List<BucketCapacityStatistic> resultList) {
        this.resultList = resultList;
        return this;
    }



    /**
     * add item to bucket 用量统计列表
     *
     * @param resultList
     */
    public void addResultList(BucketCapacityStatistic resultList) {
        if (this.resultList == null) {
            this.resultList = new ArrayList<>();
        }
        this.resultList.add(resultList);
    }
}