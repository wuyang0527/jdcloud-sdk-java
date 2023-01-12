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

import com.jdcloud.sdk.service.starshield.model.DevelopmentMode;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 如果你需要对你的网站进行修改，开发模式可以让你暂时进入网站的开发模式。这将绕过星盾的加速缓存，并降低您的网站速度。
但如果您正在对可缓存的内容（如图片、css 或 JavaScript）进行更改，并希望立即看到这些更改，这时就很有用。一旦进入，开发模式将持续3小时，然后自动切换关闭。

 */
public class ChangeDevelopmentModeSettingResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private DevelopmentMode data;



    /**
     * get data
     *
     * @return
     */
    public DevelopmentMode getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(DevelopmentMode data) {
        this.data = data;
    }



    /**
     * set data
     *
     * @param data
     */
    public ChangeDevelopmentModeSettingResult data(DevelopmentMode data) {
        this.data = data;
        return this;
    }


}