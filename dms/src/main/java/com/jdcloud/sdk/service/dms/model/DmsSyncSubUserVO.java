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

package com.jdcloud.sdk.service.dms.model;

import java.util.List;
import java.util.ArrayList;

/**
 * dmsSyncSubUserVO
 */
public class DmsSyncSubUserVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子用户名。
     */
    private String username;

    /**
     * 子用户pin。
     */
    private String pin;

    /**
     * 手机号。
     */
    private String phone;

    /**
     * 邮箱。
     */
    private String email;

    /**
     * 角色信息。
     */
    
    private List<String> roleList;


    /**
     * get 子用户名。
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * set 子用户名。
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * get 子用户pin。
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 子用户pin。
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 手机号。
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 手机号。
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * get 邮箱。
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮箱。
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
    * get 角色信息。
    *
    * @return
    */
    public List<String> getRoleList() {
        return roleList;
    }

    /**
    * set 角色信息。
    *
    * @param roleList
    */
    public void setRoleList(List<String> roleList) {
        this.roleList = roleList;
    }



    /**
     * set 子用户名。
     *
     * @param username
     */
    public DmsSyncSubUserVO username(String username) {
        this.username = username;
        return this;
    }


    /**
     * set 子用户pin。
     *
     * @param pin
     */
    public DmsSyncSubUserVO pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 手机号。
     *
     * @param phone
     */
    public DmsSyncSubUserVO phone(String phone) {
        this.phone = phone;
        return this;
    }


    /**
     * set 邮箱。
     *
     * @param email
     */
    public DmsSyncSubUserVO email(String email) {
        this.email = email;
        return this;
    }


    /**
    * set 角色信息。
    *
    * @param roleList
    */
    public DmsSyncSubUserVO roleList(List<String> roleList) {
        this.roleList = roleList;
        return this;
    }



    /**
     * add item to 角色信息。
     *
     * @param roleList
     */
    public void addRoleList(String roleList) {
        if (this.roleList == null) {
            this.roleList = new ArrayList<>();
        }
        this.roleList.add(roleList);
    }
}