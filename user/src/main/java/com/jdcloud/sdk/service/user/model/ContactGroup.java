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


/**
 * contactGroup
 */
public class ContactGroup  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 用户pin(创建人)
     */
    private String pin;

    /**
     * 组名
     */
    private String groupName;

    /**
     * 创建时间
     */
    private String created;

    /**
     * 修改时间
     */
    private String modified;

    /**
     * 是否正常：0表示删除，1表示正常
     */
    private Integer yn;



    /**
     * get id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * get 用户pin(创建人)
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin(创建人)
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 组名
     *
     * @return
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * set 组名
     *
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreated() {
        return created;
    }

    /**
     * set 创建时间
     *
     * @param created
     */
    public void setCreated(String created) {
        this.created = created;
    }


    /**
     * get 修改时间
     *
     * @return
     */
    public String getModified() {
        return modified;
    }

    /**
     * set 修改时间
     *
     * @param modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }


    /**
     * get 是否正常：0表示删除，1表示正常
     *
     * @return
     */
    public Integer getYn() {
        return yn;
    }

    /**
     * set 是否正常：0表示删除，1表示正常
     *
     * @param yn
     */
    public void setYn(Integer yn) {
        this.yn = yn;
    }



    /**
     * set id
     *
     * @param id
     */
    public ContactGroup id(Long id) {
        this.id = id;
        return this;
    }


    /**
     * set 用户pin(创建人)
     *
     * @param pin
     */
    public ContactGroup pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 组名
     *
     * @param groupName
     */
    public ContactGroup groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param created
     */
    public ContactGroup created(String created) {
        this.created = created;
        return this;
    }


    /**
     * set 修改时间
     *
     * @param modified
     */
    public ContactGroup modified(String modified) {
        this.modified = modified;
        return this;
    }


    /**
     * set 是否正常：0表示删除，1表示正常
     *
     * @param yn
     */
    public ContactGroup yn(Integer yn) {
        this.yn = yn;
        return this;
    }


}