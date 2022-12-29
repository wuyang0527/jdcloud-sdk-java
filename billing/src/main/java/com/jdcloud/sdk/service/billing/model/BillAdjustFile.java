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

package com.jdcloud.sdk.service.billing.model;


/**
 * billAdjustFile
 */
public class BillAdjustFile  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件秘钥
     */
    private String fileKey;



    /**
     * get 文件名称
     *
     * @return
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * set 文件名称
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * get 文件秘钥
     *
     * @return
     */
    public String getFileKey() {
        return fileKey;
    }

    /**
     * set 文件秘钥
     *
     * @param fileKey
     */
    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }



    /**
     * set 文件名称
     *
     * @param fileName
     */
    public BillAdjustFile fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }


    /**
     * set 文件秘钥
     *
     * @param fileKey
     */
    public BillAdjustFile fileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }


}