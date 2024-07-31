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

package com.jdcloud.sdk.service.user.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * checkCredentialInfo
 */
public class CheckCredentialInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Cookie列表
     * Required:true
     */
    @Required
    
    private List<CookieInfo> cookies;


    /**
    * get Cookie列表
    *
    * @return
    */
    public List<CookieInfo> getCookies() {
        return cookies;
    }

    /**
    * set Cookie列表
    *
    * @param cookies
    */
    public void setCookies(List<CookieInfo> cookies) {
        this.cookies = cookies;
    }



    /**
    * set Cookie列表
    *
    * @param cookies
    */
    public CheckCredentialInfo cookies(List<CookieInfo> cookies) {
        this.cookies = cookies;
        return this;
    }



    /**
     * add item to Cookie列表
     *
     * @param cookie
     */
    public void addCookie(CookieInfo cookie) {
        if (this.cookies == null) {
            this.cookies = new ArrayList<>();
        }
        this.cookies.add(cookie);
    }
}