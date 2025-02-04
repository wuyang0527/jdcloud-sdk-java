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

package com.jdcloud.sdk.service.tidb.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * fullImportTask
 */
public class FullImportTask  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户上传到对象存储OSS上的备份文件的路径。
     * Required:true
     */
    @Required
    private String ossLink;

    /**
     * 未压缩的整个数据文件或数据目录的大小,单位GB
     * Required:true
     */
    @Required
    private Integer dataSizeGB;


    /**
     * get 用户上传到对象存储OSS上的备份文件的路径。
     *
     * @return
     */
    public String getOssLink() {
        return ossLink;
    }

    /**
     * set 用户上传到对象存储OSS上的备份文件的路径。
     *
     * @param ossLink
     */
    public void setOssLink(String ossLink) {
        this.ossLink = ossLink;
    }

    /**
     * get 未压缩的整个数据文件或数据目录的大小,单位GB
     *
     * @return
     */
    public Integer getDataSizeGB() {
        return dataSizeGB;
    }

    /**
     * set 未压缩的整个数据文件或数据目录的大小,单位GB
     *
     * @param dataSizeGB
     */
    public void setDataSizeGB(Integer dataSizeGB) {
        this.dataSizeGB = dataSizeGB;
    }


    /**
     * set 用户上传到对象存储OSS上的备份文件的路径。
     *
     * @param ossLink
     */
    public FullImportTask ossLink(String ossLink) {
        this.ossLink = ossLink;
        return this;
    }

    /**
     * set 未压缩的整个数据文件或数据目录的大小,单位GB
     *
     * @param dataSizeGB
     */
    public FullImportTask dataSizeGB(Integer dataSizeGB) {
        this.dataSizeGB = dataSizeGB;
        return this;
    }


}