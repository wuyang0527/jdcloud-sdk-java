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
 * Data-Migration
 * 数据迁移管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 校验需要导入的备份文件在OSS上是否存在，需要的读取权限是否具备。
 */
public class VerifyFilefromOSSRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 要校验的文件bucket及路径,例如Bucket为db_bak,文件路径为test_server/db1/20181013.bak,则ossLink为db_bak/test_server/db1/20181013.bak
     * Required:true
     */
    @Required
    private String ossLink;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例ID
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get 要校验的文件bucket及路径,例如Bucket为db_bak,文件路径为test_server/db1/20181013.bak,则ossLink为db_bak/test_server/db1/20181013.bak
     *
     * @return
     */
    public String getOssLink() {
        return ossLink;
    }

    /**
     * set 要校验的文件bucket及路径,例如Bucket为db_bak,文件路径为test_server/db1/20181013.bak,则ossLink为db_bak/test_server/db1/20181013.bak
     *
     * @param ossLink
     */
    public void setOssLink(String ossLink) {
        this.ossLink = ossLink;
    }


    /**
     * get 地域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set 要校验的文件bucket及路径,例如Bucket为db_bak,文件路径为test_server/db1/20181013.bak,则ossLink为db_bak/test_server/db1/20181013.bak
     *
     * @param ossLink
     */
    public VerifyFilefromOSSRequest ossLink(String ossLink) {
        this.ossLink = ossLink;
        return this;
    }


    /**
     * set 地域代码
     *
     * @param regionId
     */
    public VerifyFilefromOSSRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public VerifyFilefromOSSRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}