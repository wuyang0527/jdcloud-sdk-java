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

package com.jdcloud.sdk.service.iam.model;

import java.util.List;
import java.util.ArrayList;

/**
 * virtualMFADevice
 */
public class VirtualMFADevice  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Base64加密后的二维码信息
     */
    private String base64Qr;

    /**
     * 创建MFA设备相关信息
     */
    
    private List<MFAInfo> mFAInfos;


    /**
     * get Base64加密后的二维码信息
     *
     * @return
     */
    public String getBase64Qr() {
        return base64Qr;
    }

    /**
     * set Base64加密后的二维码信息
     *
     * @param base64Qr
     */
    public void setBase64Qr(String base64Qr) {
        this.base64Qr = base64Qr;
    }


    /**
    * get 创建MFA设备相关信息
    *
    * @return
    */
    public List<MFAInfo> getMFAInfos() {
        return mFAInfos;
    }

    /**
    * set 创建MFA设备相关信息
    *
    * @param mFAInfos
    */
    public void setMFAInfos(List<MFAInfo> mFAInfos) {
        this.mFAInfos = mFAInfos;
    }



    /**
     * set Base64加密后的二维码信息
     *
     * @param base64Qr
     */
    public VirtualMFADevice base64Qr(String base64Qr) {
        this.base64Qr = base64Qr;
        return this;
    }


    /**
    * set 创建MFA设备相关信息
    *
    * @param mFAInfos
    */
    public VirtualMFADevice mFAInfos(List<MFAInfo> mFAInfos) {
        this.mFAInfos = mFAInfos;
        return this;
    }



    /**
     * add item to 创建MFA设备相关信息
     *
     * @param mFAInfo
     */
    public void addMFAInfo(MFAInfo mFAInfo) {
        if (this.mFAInfos == null) {
            this.mFAInfos = new ArrayList<>();
        }
        this.mFAInfos.add(mFAInfo);
    }
}