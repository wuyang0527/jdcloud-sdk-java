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
 * JDCLOUD IAS Services API
 * 京东云联合登陆Api
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ias.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ias.model.ApplicationRes;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取主账号下所有应用
 */
public class GetAppsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * apps
     */
    private List<ApplicationRes> apps;


    /**
     * get apps
     *
     * @return
     */
    public List<ApplicationRes> getApps() {
        return apps;
    }

    /**
     * set apps
     *
     * @param apps
     */
    public void setApps(List<ApplicationRes> apps) {
        this.apps = apps;
    }


    /**
     * set apps
     *
     * @param apps
     */
    public GetAppsResult apps(List<ApplicationRes> apps) {
        this.apps = apps;
        return this;
    }


    /**
     * add item to apps
     *
     * @param app
     */
    public void addApp(ApplicationRes app) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(app);
    }

}