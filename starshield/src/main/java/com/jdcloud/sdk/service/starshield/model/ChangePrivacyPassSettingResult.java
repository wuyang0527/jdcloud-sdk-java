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
 * Zone-Settings
 * A Zone setting changes how the Zone works in relation to caching, security, or other features of JDC StarShield
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.service.starshield.model.PrivacyPass;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * Privacy Pass是一个由Privacy Pass团队开发的浏览器扩展，旨在改善您的访客的浏览体验。启用Privacy Pass将减少显示给你的访客的验证码的数量。

 */
public class ChangePrivacyPassSettingResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private PrivacyPass data;



    /**
     * get data
     *
     * @return
     */
    public PrivacyPass getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(PrivacyPass data) {
        this.data = data;
    }



    /**
     * set data
     *
     * @param data
     */
    public ChangePrivacyPassSettingResult data(PrivacyPass data) {
        this.data = data;
        return this;
    }


}