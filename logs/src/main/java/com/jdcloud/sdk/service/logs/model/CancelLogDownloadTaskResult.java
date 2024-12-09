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
 * Logdownload APIs
 * 日志服务日志下载相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 取消日志下载任务
 */
public class CancelLogDownloadTaskResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * DownloadTaskUID
     */
    private String downloadTaskUID;



    /**
     * get DownloadTaskUID
     *
     * @return
     */
    public String getDownloadTaskUID() {
        return downloadTaskUID;
    }

    /**
     * set DownloadTaskUID
     *
     * @param downloadTaskUID
     */
    public void setDownloadTaskUID(String downloadTaskUID) {
        this.downloadTaskUID = downloadTaskUID;
    }



    /**
     * set DownloadTaskUID
     *
     * @param downloadTaskUID
     */
    public CancelLogDownloadTaskResult downloadTaskUID(String downloadTaskUID) {
        this.downloadTaskUID = downloadTaskUID;
        return this;
    }


}