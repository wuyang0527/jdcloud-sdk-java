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

package com.jdcloud.sdk.service.disk.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 联系人信息。请求参数中，sms和email中至少一个为 &#x60;发送&#x60;
 */
public class ContactInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否发送短信。0:不发送 1:发送
     */
    private Integer sms;

    /**
     * 是否发送短信。0:不发送 1:发送
     */
    private Integer email;

    /**
     * 联系人id,默认为空
     */
    
    private List<Integer> personIds;
    /**
     * 联系组id,默认为空
     */
    
    private List<Integer> groupIds;


    /**
     * get 是否发送短信。0:不发送 1:发送
     *
     * @return
     */
    public Integer getSms() {
        return sms;
    }

    /**
     * set 是否发送短信。0:不发送 1:发送
     *
     * @param sms
     */
    public void setSms(Integer sms) {
        this.sms = sms;
    }


    /**
     * get 是否发送短信。0:不发送 1:发送
     *
     * @return
     */
    public Integer getEmail() {
        return email;
    }

    /**
     * set 是否发送短信。0:不发送 1:发送
     *
     * @param email
     */
    public void setEmail(Integer email) {
        this.email = email;
    }


    /**
    * get 联系人id,默认为空
    *
    * @return
    */
    public List<Integer> getPersonIds() {
        return personIds;
    }

    /**
    * set 联系人id,默认为空
    *
    * @param personIds
    */
    public void setPersonIds(List<Integer> personIds) {
        this.personIds = personIds;
    }


    /**
    * get 联系组id,默认为空
    *
    * @return
    */
    public List<Integer> getGroupIds() {
        return groupIds;
    }

    /**
    * set 联系组id,默认为空
    *
    * @param groupIds
    */
    public void setGroupIds(List<Integer> groupIds) {
        this.groupIds = groupIds;
    }



    /**
     * set 是否发送短信。0:不发送 1:发送
     *
     * @param sms
     */
    public ContactInfo sms(Integer sms) {
        this.sms = sms;
        return this;
    }


    /**
     * set 是否发送短信。0:不发送 1:发送
     *
     * @param email
     */
    public ContactInfo email(Integer email) {
        this.email = email;
        return this;
    }


    /**
    * set 联系人id,默认为空
    *
    * @param personIds
    */
    public ContactInfo personIds(List<Integer> personIds) {
        this.personIds = personIds;
        return this;
    }


    /**
    * set 联系组id,默认为空
    *
    * @param groupIds
    */
    public ContactInfo groupIds(List<Integer> groupIds) {
        this.groupIds = groupIds;
        return this;
    }



    /**
     * add item to 联系人id,默认为空
     *
     * @param personId
     */
    public void addPersonId(Integer personId) {
        if (this.personIds == null) {
            this.personIds = new ArrayList<>();
        }
        this.personIds.add(personId);
    }

    /**
     * add item to 联系组id,默认为空
     *
     * @param groupId
     */
    public void addGroupId(Integer groupId) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        this.groupIds.add(groupId);
    }
}